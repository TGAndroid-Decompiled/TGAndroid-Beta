package org.telegram.ui.bots;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import me.vkryl.android.animator.ListAnimator;
import me.vkryl.android.animator.ReplaceAnimator;
import me.vkryl.core.lambda.Destroyable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.inset.InAppKeyboardInsetView;
import org.telegram.ui.Components.spoilers.SpoilersTextView;

public abstract class BotKeyboardView extends LinearLayout implements InAppKeyboardInsetView, ReplaceAnimator.Callback {
    private final ReplaceAnimator animator;
    private TLRPC.TL_replyKeyboardMarkup botButtons;
    private int buttonHeight;
    private final ArrayList buttonViews;
    private BotKeyboardViewDelegate delegate;
    private final FrameLayout frameLayout;
    private boolean isFullSize;
    private int panelHeight;
    private final Theme.ResourcesProvider resourcesProvider;
    private final ScrollView scrollView;

    public interface BotKeyboardViewDelegate {
        void didPressedButton(TLRPC.KeyboardButton keyboardButton);
    }

    @Override
    public void applyInAppKeyboardAnimatedHeight(float f) {
    }

    @Override
    public boolean hasChanges(ReplaceAnimator replaceAnimator) {
        return ReplaceAnimator.Callback.CC.$default$hasChanges(this, replaceAnimator);
    }

    @Override
    public boolean onApplyMetadataAnimation(ReplaceAnimator replaceAnimator, float f) {
        return ReplaceAnimator.Callback.CC.$default$onApplyMetadataAnimation(this, replaceAnimator, f);
    }

    @Override
    public void onFinishMetadataAnimation(ReplaceAnimator replaceAnimator, boolean z) {
        ReplaceAnimator.Callback.CC.$default$onFinishMetadataAnimation(this, replaceAnimator, z);
    }

    @Override
    public void onForceApplyChanges(ReplaceAnimator replaceAnimator) {
        ReplaceAnimator.Callback.CC.$default$onForceApplyChanges(this, replaceAnimator);
    }

    @Override
    public void onPrepareMetadataAnimation(ReplaceAnimator replaceAnimator) {
        ReplaceAnimator.Callback.CC.$default$onPrepareMetadataAnimation(this, replaceAnimator);
    }

    public BotKeyboardView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.buttonViews = new ArrayList();
        this.animator = new ReplaceAnimator(this, CubicBezierInterpolator.EASE_OUT_QUINT, 320L);
        this.resourcesProvider = resourcesProvider;
        setOrientation(1);
        ScrollView scrollView = new ScrollView(context);
        this.scrollView = scrollView;
        scrollView.setClipToPadding(false);
        addView(scrollView);
        FrameLayout frameLayout = new FrameLayout(context);
        this.frameLayout = frameLayout;
        scrollView.addView(frameLayout);
        updateColors();
    }

    public void updateColors() {
        AndroidUtilities.setScrollViewEdgeEffectColor(this.scrollView, getThemedColor(Theme.key_chat_emojiPanelBackground));
        for (int i = 0; i < this.buttonViews.size(); i++) {
            ((Button) this.buttonViews.get(i)).updateColors();
        }
        invalidate();
    }

    public void setDelegate(BotKeyboardViewDelegate botKeyboardViewDelegate) {
        this.delegate = botKeyboardViewDelegate;
    }

    public void setPanelHeight(int i) {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        this.panelHeight = i;
        if (!this.isFullSize || (tL_replyKeyboardMarkup = this.botButtons) == null || tL_replyKeyboardMarkup.rows.isEmpty()) {
            return;
        }
        int iMax = !this.isFullSize ? 44 : (int) Math.max(44.0f, (((this.panelHeight - AndroidUtilities.dp(16.0f)) - ((this.botButtons.rows.size() - 1) * AndroidUtilities.dp(4.0f))) / this.botButtons.rows.size()) / AndroidUtilities.density);
        this.buttonHeight = iMax;
        int iDp = AndroidUtilities.dp(iMax);
        Iterator it = this.animator.iterator();
        while (it.hasNext()) {
            ListAnimator.Entry entry = (ListAnimator.Entry) it.next();
            int childCount = ((ButtonsLayout) entry.item).getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = ((ButtonsLayout) entry.item).getChildAt(i2);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.height != iDp) {
                    layoutParams.height = iDp;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }

    public void invalidateViews() {
        for (int i = 0; i < this.buttonViews.size(); i++) {
            ((Button) this.buttonViews.get(i)).invalidate();
        }
    }

    public boolean isFullSize() {
        return this.isFullSize;
    }

    public void setButtons(TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup) {
        this.botButtons = tL_replyKeyboardMarkup;
        this.buttonViews.clear();
        float scrollY = this.scrollView.getScrollY();
        Iterator it = this.animator.iterator();
        while (it.hasNext()) {
            ButtonsLayout buttonsLayout = (ButtonsLayout) ((ListAnimator.Entry) it.next()).item;
            buttonsLayout.setTranslationY(buttonsLayout.getTranslationY() - scrollY);
        }
        int i = 0;
        this.scrollView.scrollTo(0, 0);
        if (tL_replyKeyboardMarkup != null && !this.botButtons.rows.isEmpty()) {
            ButtonsLayout buttonsLayout2 = new ButtonsLayout(getContext());
            buttonsLayout2.setOrientation(1);
            buttonsLayout2.setAlpha(0.0f);
            this.frameLayout.addView(buttonsLayout2);
            boolean z = tL_replyKeyboardMarkup.resize;
            this.isFullSize = !z;
            this.buttonHeight = z ? 44 : (int) Math.max(44.0f, (((this.panelHeight - AndroidUtilities.dp(16.0f)) - ((this.botButtons.rows.size() - 1) * AndroidUtilities.dp(4.0f))) / this.botButtons.rows.size()) / AndroidUtilities.density);
            int i2 = 0;
            while (i2 < tL_replyKeyboardMarkup.rows.size()) {
                TLRPC.TL_keyboardButtonRow tL_keyboardButtonRow = tL_replyKeyboardMarkup.rows.get(i2);
                LinearLayout linearLayout = new LinearLayout(getContext());
                linearLayout.setOrientation(i);
                buttonsLayout2.addView(linearLayout, LayoutHelper.createLinear(-1, this.buttonHeight, 8.0f, i2 == 0 ? 8.0f : 4.0f, 8.0f, i2 == tL_replyKeyboardMarkup.rows.size() - 1 ? 8.0f : 0.0f));
                float size = 1.0f / tL_keyboardButtonRow.buttons.size();
                int i3 = 0;
                while (i3 < tL_keyboardButtonRow.buttons.size()) {
                    Button button = new Button(getContext(), tL_keyboardButtonRow.buttons.get(i3));
                    button.setPositionFlags(i3 == 0, i2 == 0, i3 == tL_keyboardButtonRow.buttons.size() - 1, i2 == tL_replyKeyboardMarkup.rows.size() - 1);
                    FrameLayout frameLayout = new FrameLayout(getContext());
                    frameLayout.addView(button, LayoutHelper.createFrame(-1, -1.0f));
                    linearLayout.addView(frameLayout, LayoutHelper.createLinear(0, -1, size, 0, 0, i3 != tL_keyboardButtonRow.buttons.size() - 1 ? 4 : 0, 0));
                    button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            this.f$0.lambda$setButtons$0(view);
                        }
                    });
                    ScaleStateListAnimator.apply(button, 0.02f, 1.5f);
                    this.buttonViews.add(button);
                    button.updateColors();
                    i3++;
                }
                i2++;
                i = 0;
            }
            this.animator.replace(buttonsLayout2, true);
            return;
        }
        this.animator.clear(true);
    }

    public void lambda$setButtons$0(View view) {
        this.delegate.didPressedButton((TLRPC.KeyboardButton) view.getTag());
    }

    private class Button extends FrameLayout {
        private final TLRPC.KeyboardButton button;
        private final ImageView icon;
        private boolean isBottom;
        private boolean isLeft;
        private boolean isRight;
        private boolean isTop;
        private final SpoilersTextView textView;

        public Button(Context context, TLRPC.KeyboardButton keyboardButton) {
            super(context);
            this.button = keyboardButton;
            SpoilersTextView spoilersTextView = new SpoilersTextView(context);
            this.textView = spoilersTextView;
            spoilersTextView.allowClickSpoilers = false;
            spoilersTextView.setTextSize(1, 14.0f);
            spoilersTextView.setTypeface(AndroidUtilities.bold());
            addView(spoilersTextView, LayoutHelper.createFrame(-2, -2, 17));
            setTag(keyboardButton);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TLRPC.TL_keyboardButtonStyle tL_keyboardButtonStyle = keyboardButton.style;
            if (tL_keyboardButtonStyle != null && tL_keyboardButtonStyle.icon != 0) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(new AnimatedEmojiSpan(keyboardButton.style.icon, spoilersTextView.getPaint().getFontMetricsInt()), 0, 1, 33);
            }
            spannableStringBuilder.append(Emoji.replaceEmoji(keyboardButton.text, spoilersTextView.getPaint().getFontMetricsInt(), false));
            ImageView imageView = new ImageView(getContext());
            this.icon = imageView;
            imageView.setColorFilter(BotKeyboardView.this.getThemedColor(Theme.key_chat_botKeyboardButtonText));
            if ((keyboardButton instanceof TLRPC.TL_keyboardButtonWebView) || (keyboardButton instanceof TLRPC.TL_keyboardButtonSimpleWebView)) {
                imageView.setImageResource(R.drawable.bot_webview);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
            addView(imageView, LayoutHelper.createFrame(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
            spoilersTextView.setText(spannableStringBuilder);
        }

        public void setPositionFlags(boolean z, boolean z2, boolean z3, boolean z4) {
            this.isLeft = z;
            this.isTop = z2;
            this.isRight = z3;
            this.isBottom = z4;
            updateColors();
        }

        public void updateColors() {
            int i;
            int i2;
            int themedColor;
            int iCompositeColors;
            int iDp = AndroidUtilities.dp(21.0f);
            int iDp2 = AndroidUtilities.dp(11.0f);
            int themedColor2 = BotKeyboardView.this.getThemedColor(Theme.key_chat_botKeyboardButtonBackground);
            int themedColor3 = BotKeyboardView.this.getThemedColor(Theme.key_chat_botKeyboardButtonBackgroundPressed);
            int themedColor4 = BotKeyboardView.this.getThemedColor(Theme.key_chat_botKeyboardButtonText);
            TLRPC.TL_keyboardButtonStyle tL_keyboardButtonStyle = this.button.style;
            if (tL_keyboardButtonStyle == null) {
                i = themedColor2;
                i2 = themedColor3;
            } else {
                if (tL_keyboardButtonStyle.bg_primary) {
                    themedColor = BotKeyboardView.this.getThemedColor(Theme.key_botKeyboard_button_primary);
                    iCompositeColors = ColorUtils.compositeColors(BotKeyboardView.this.getThemedColor(Theme.key_listSelector), themedColor);
                } else if (tL_keyboardButtonStyle.bg_danger) {
                    themedColor = BotKeyboardView.this.getThemedColor(Theme.key_botKeyboard_button_danger);
                    iCompositeColors = ColorUtils.compositeColors(BotKeyboardView.this.getThemedColor(Theme.key_listSelector), themedColor);
                } else {
                    if (tL_keyboardButtonStyle.bg_success) {
                        themedColor = BotKeyboardView.this.getThemedColor(Theme.key_botKeyboard_button_success);
                        iCompositeColors = ColorUtils.compositeColors(BotKeyboardView.this.getThemedColor(Theme.key_listSelector), themedColor);
                    }
                    i = themedColor2;
                    i2 = themedColor3;
                }
                i = themedColor;
                i2 = iCompositeColors;
                themedColor4 = -1;
            }
            this.icon.setColorFilter(themedColor4);
            this.textView.setTextColor(themedColor4);
            boolean z = this.isLeft;
            int i3 = (z && this.isTop) ? iDp : iDp2;
            boolean z2 = this.isRight;
            setBackground(Theme.createSimpleSelectorRoundRectDrawable(i3, (z2 && this.isTop) ? iDp : iDp2, (z2 && this.isBottom) ? iDp : iDp2, (z && this.isBottom) ? iDp : iDp2, i, i2, i2));
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.botButtons;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        return this.isFullSize ? this.panelHeight : (tL_replyKeyboardMarkup.rows.size() * AndroidUtilities.dp(this.buttonHeight)) + AndroidUtilities.dp(16.0f) + ((this.botButtons.rows.size() - 1) * AndroidUtilities.dp(4.0f));
    }

    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    @Override
    public void applyNavigationBarHeight(int i) {
        if (this.scrollView.getPaddingBottom() != i) {
            this.scrollView.setPadding(0, 0, 0, i);
        }
    }

    @Override
    public void onItemChanged(ReplaceAnimator replaceAnimator) {
        Iterator it = this.animator.iterator();
        while (it.hasNext()) {
            ListAnimator.Entry entry = (ListAnimator.Entry) it.next();
            float visibility = entry.getVisibility();
            float fLerp = AndroidUtilities.lerp(0.7f, 1.0f, visibility);
            ((ButtonsLayout) entry.item).setAlpha(visibility);
            ((ButtonsLayout) entry.item).setScaleX(fLerp);
            ((ButtonsLayout) entry.item).setScaleY(fLerp);
        }
    }

    private static class ButtonsLayout extends LinearLayout implements Destroyable {
        public ButtonsLayout(Context context) {
            super(context);
        }

        @Override
        public void performDestroy() {
            ((ViewGroup) getParent()).removeView(this);
        }
    }
}
