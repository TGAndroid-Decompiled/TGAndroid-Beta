package org.telegram.ui.bots;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import me.vkryl.android.animator.ListAnimator;
import me.vkryl.android.animator.ReplaceAnimator;
import me.vkryl.core.lambda.Destroyable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.utils.tlutils.TLKeyboardHelper;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.inset.InAppKeyboardInsetView;
import org.telegram.ui.Components.spoilers.SpoilersTextView;

public abstract class BotKeyboardView extends LinearLayout implements InAppKeyboardInsetView, ReplaceAnimator.Callback {
    public final ReplaceAnimator animator;
    public TLRPC.TL_replyKeyboardMarkup botButtons;
    public int buttonHeight;
    public final ArrayList buttonViews;
    public BotKeyboardViewDelegate delegate;
    public final GradientDrawable fadeDrawable;
    public final FrameLayout frameLayout;
    public boolean isFullSize;
    public int lastFadeColor;
    public int navigationBarHeight;
    public int panelHeight;
    public final Theme.ResourcesProvider resourcesProvider;
    public final ScrollView scrollView;

    public interface BotKeyboardViewDelegate {
    }

    public final class Button extends FrameLayout {
        public final TL_keyboard.KeyboardButton button;
        public final ImageView icon;
        public boolean isBottom;
        public boolean isLeft;
        public boolean isRight;
        public boolean isTop;
        public final SpoilersTextView textView;

        public Button(Context context, TL_keyboard.KeyboardButton keyboardButton) {
            super(context);
            this.button = keyboardButton;
            SpoilersTextView spoilersTextView = new SpoilersTextView(context, null, true);
            this.textView = spoilersTextView;
            spoilersTextView.allowClickSpoilers = false;
            spoilersTextView.setTextSize(1, 14.0f);
            spoilersTextView.setTypeface(AndroidUtilities.bold());
            NotificationCenter.listenEmojiLoading(spoilersTextView);
            addView(spoilersTextView, LayoutHelper.createFrame(-2, -2, 17));
            NotificationCenter.listenEmojiLoading(spoilersTextView);
            setTag(keyboardButton);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = keyboardButton.style;
            if (keyboardButtonStyle != null && keyboardButtonStyle.icon != 0) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(new AnimatedEmojiSpan(keyboardButton.style.icon, 1.2f, spoilersTextView.getPaint().getFontMetricsInt()), 0, 1, 33);
            }
            spannableStringBuilder.append(Emoji.replaceEmoji(keyboardButton.text, spoilersTextView.getPaint().getFontMetricsInt(), false));
            ImageView imageView = new ImageView(getContext());
            this.icon = imageView;
            imageView.setColorFilter(Theme.getColor(Theme.key_chat_botKeyboardButtonText, BotKeyboardView.this.resourcesProvider));
            if (TLKeyboardHelper.isType(keyboardButton, TL_keyboard.TL_inlineButtonTypeWebView.class) || TLKeyboardHelper.isType(keyboardButton, TL_keyboard.TL_buttonTypeSimpleWebView.class)) {
                imageView.setImageResource(R.drawable.bot_webview);
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
            addView(imageView, LayoutHelper.createFrame(12, 12.0f, 53, 0.0f, 8.0f, 8.0f, 0.0f));
            spoilersTextView.setText(spannableStringBuilder);
        }

        public final void updateColors() {
            int i;
            int i2;
            int iMultAlpha;
            int iCompositeColors;
            int iDp = AndroidUtilities.dp(21.0f);
            int iDp2 = AndroidUtilities.dp(11.0f);
            int i3 = Theme.key_chat_botKeyboardButtonBackground;
            BotKeyboardView botKeyboardView = BotKeyboardView.this;
            int color = Theme.getColor(i3, botKeyboardView.resourcesProvider);
            int color2 = Theme.getColor(Theme.key_chat_botKeyboardButtonBackgroundPressed, botKeyboardView.resourcesProvider);
            int color3 = Theme.getColor(Theme.key_chat_botKeyboardButtonText, botKeyboardView.resourcesProvider);
            TL_keyboard.KeyboardButtonStyle keyboardButtonStyle = this.button.style;
            if (keyboardButtonStyle == null) {
                i = color;
                i2 = color2;
            } else {
                if (keyboardButtonStyle.bg_primary) {
                    iMultAlpha = Theme.multAlpha(0.8f, Theme.getColor(Theme.key_botKeyboard_button_primary, botKeyboardView.resourcesProvider));
                    iCompositeColors = ColorUtils.compositeColors(Theme.getColor(Theme.key_listSelector, botKeyboardView.resourcesProvider), iMultAlpha);
                } else if (keyboardButtonStyle.bg_danger) {
                    iMultAlpha = Theme.multAlpha(0.8f, Theme.getColor(Theme.key_botKeyboard_button_danger, botKeyboardView.resourcesProvider));
                    iCompositeColors = ColorUtils.compositeColors(Theme.getColor(Theme.key_listSelector, botKeyboardView.resourcesProvider), iMultAlpha);
                } else if (keyboardButtonStyle.bg_success) {
                    iMultAlpha = Theme.multAlpha(0.8f, Theme.getColor(Theme.key_botKeyboard_button_success, botKeyboardView.resourcesProvider));
                    iCompositeColors = ColorUtils.compositeColors(Theme.getColor(Theme.key_listSelector, botKeyboardView.resourcesProvider), iMultAlpha);
                } else {
                    i = color;
                    i2 = color2;
                }
                i = iMultAlpha;
                i2 = iCompositeColors;
                color3 = -1;
            }
            this.icon.setColorFilter(color3);
            this.textView.setTextColor(color3);
            boolean z = this.isLeft;
            int i4 = (z && this.isTop) ? iDp : iDp2;
            boolean z2 = this.isRight;
            setBackground(Theme.createSimpleSelectorRoundRectDrawable(i4, (z2 && this.isTop) ? iDp : iDp2, (z2 && this.isBottom) ? iDp : iDp2, (z && this.isBottom) ? iDp : iDp2, i, i2, i2));
        }
    }

    public final class ButtonsLayout extends LinearLayout implements Destroyable {
        @Override
        public final void performDestroy() {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    public BotKeyboardView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.buttonViews = new ArrayList();
        this.fadeDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, null);
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
        AndroidUtilities.setScrollViewEdgeEffectColor(scrollView, Theme.getColor(Theme.key_chat_emojiPanelBackground, resourcesProvider));
        for (int i = 0; i < this.buttonViews.size(); i++) {
            ((Button) this.buttonViews.get(i)).updateColors();
        }
        invalidate();
    }

    @Override
    public final void applyInAppKeyboardAnimatedHeight(float f) {
    }

    @Override
    public final void applyNavigationBarHeight(int i) {
        if (this.navigationBarHeight == i) {
            return;
        }
        this.navigationBarHeight = i;
        ScrollView scrollView = this.scrollView;
        if (scrollView.getPaddingBottom() != i) {
            scrollView.setPadding(0, 0, 0, i);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float navigationBarThirdButtonsFactor = AndroidUtilities.getNavigationBarThirdButtonsFactor(this.navigationBarHeight);
        if (navigationBarThirdButtonsFactor > 0.0f) {
            int iMultAlpha = Theme.multAlpha(navigationBarThirdButtonsFactor, Theme.getColor(Theme.key_chat_emojiPanelBackground, this.resourcesProvider));
            int i = this.lastFadeColor;
            GradientDrawable gradientDrawable = this.fadeDrawable;
            if (i != iMultAlpha) {
                gradientDrawable.setColors(new int[]{iMultAlpha, Theme.multAlpha(0.66f, iMultAlpha), ColorUtils.setAlphaComponent(iMultAlpha, 0)});
                this.lastFadeColor = iMultAlpha;
            }
            gradientDrawable.setBounds(0, getMeasuredHeight() - this.navigationBarHeight, getMeasuredWidth(), getMeasuredHeight());
            gradientDrawable.draw(canvas);
        }
    }

    public int getKeyboardHeight() {
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup = this.botButtons;
        if (tL_replyKeyboardMarkup == null) {
            return 0;
        }
        if (this.isFullSize) {
            return this.panelHeight;
        }
        return RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(this.botButtons.rows.size() - 1, 4.0f, AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(this.buttonHeight) * tL_replyKeyboardMarkup.rows.size()));
    }

    @Override
    public final void onForceApplyChanges() {
    }

    @Override
    public final void onItemChanged$1(ReplaceAnimator replaceAnimator) {
        ArrayList arrayList = this.animator.list.entries;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAnimator.Entry entry = (ListAnimator.Entry) obj;
            float visibility = entry.getVisibility();
            float fLerp = AndroidUtilities.lerp(0.7f, 1.0f, visibility);
            Object obj2 = entry.item;
            ((ButtonsLayout) obj2).setAlpha(visibility);
            ((ButtonsLayout) obj2).setScaleX(fLerp);
            ((ButtonsLayout) obj2).setScaleY(fLerp);
        }
    }

    public void setButtons(TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup) {
        int objectSize;
        int objectSize2;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup2 = this.botButtons;
        if (tL_replyKeyboardMarkup == tL_replyKeyboardMarkup2) {
            return;
        }
        if (tL_replyKeyboardMarkup != null && tL_replyKeyboardMarkup2 != null && (objectSize = tL_replyKeyboardMarkup.getObjectSize()) == (objectSize2 = tL_replyKeyboardMarkup2.getObjectSize())) {
            try {
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(objectSize);
                tL_replyKeyboardMarkup.serializeToStream(nativeByteBuffer);
                nativeByteBuffer.rewind();
                NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(objectSize2);
                tL_replyKeyboardMarkup2.serializeToStream(nativeByteBuffer2);
                nativeByteBuffer2.rewind();
                while (true) {
                    if (objectSize < 8) {
                        while (objectSize > 0) {
                            if (nativeByteBuffer.readByte(true) != nativeByteBuffer2.readByte(true)) {
                                break;
                            } else {
                                objectSize--;
                            }
                        }
                        return;
                    }
                    if (nativeByteBuffer.readInt64(true) != nativeByteBuffer2.readInt64(true)) {
                        break;
                    } else {
                        objectSize -= 8;
                    }
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        this.botButtons = tL_replyKeyboardMarkup;
        ArrayList arrayList = this.buttonViews;
        arrayList.clear();
        ScrollView scrollView = this.scrollView;
        float scrollY = scrollView.getScrollY();
        ReplaceAnimator replaceAnimator = this.animator;
        ArrayList arrayList2 = replaceAnimator.list.entries;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            ButtonsLayout buttonsLayout = (ButtonsLayout) ((ListAnimator.Entry) obj).item;
            buttonsLayout.setTranslationY(buttonsLayout.getTranslationY() - scrollY);
        }
        scrollView.scrollTo(0, 0);
        if (tL_replyKeyboardMarkup == null || this.botButtons.rows.isEmpty()) {
            replaceAnimator.list.reset(null, true);
            return;
        }
        ButtonsLayout buttonsLayout2 = new ButtonsLayout(getContext());
        buttonsLayout2.setOrientation(1);
        buttonsLayout2.setAlpha(0.0f);
        this.frameLayout.addView(buttonsLayout2);
        boolean z = tL_replyKeyboardMarkup.resize;
        this.isFullSize = !z;
        this.buttonHeight = z ? 44 : (int) Math.max(44.0f, (OKLCH.m$3(4.0f, this.botButtons.rows.size() - 1, this.panelHeight - AndroidUtilities.dp(16.0f)) / this.botButtons.rows.size()) / AndroidUtilities.density);
        int i3 = 0;
        while (i3 < tL_replyKeyboardMarkup.rows.size()) {
            TL_keyboard.KeyboardButtonRow keyboardButtonRow = tL_replyKeyboardMarkup.rows.get(i3);
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(i);
            buttonsLayout2.addView(linearLayout, LayoutHelper.createLinear(8.0f, i3 == 0 ? 8.0f : 4.0f, 8.0f, i3 == tL_replyKeyboardMarkup.rows.size() - 1 ? 8.0f : 0.0f, -1, this.buttonHeight));
            float size2 = 1.0f / keyboardButtonRow.buttons.size();
            int i4 = 0;
            while (i4 < keyboardButtonRow.buttons.size()) {
                Button button = new Button(getContext(), keyboardButtonRow.buttons.get(i4));
                boolean z2 = i4 == 0;
                boolean z3 = i3 == 0;
                boolean z4 = i4 == keyboardButtonRow.buttons.size() - 1;
                boolean z5 = i3 == tL_replyKeyboardMarkup.rows.size() - 1;
                button.isLeft = z2;
                button.isTop = z3;
                button.isRight = z4;
                button.isBottom = z5;
                button.updateColors();
                FrameLayout frameLayout = new FrameLayout(getContext());
                frameLayout.addView(button, LayoutHelper.createFrame(-1.0f, -1));
                linearLayout.addView(frameLayout, LayoutHelper.createLinear(size2, 0, -1, 0, i4 != keyboardButtonRow.buttons.size() - 1 ? 4 : 0, 0));
                button.setOnClickListener(new BotAdView$$ExternalSyntheticLambda1(this, 4));
                ScaleStateListAnimator.apply(button, 0.02f, 1.5f);
                arrayList.add(button);
                button.updateColors();
                i4++;
            }
            i3++;
            i = 0;
        }
        replaceAnimator.replace(buttonsLayout2, true);
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
        int iMax = !this.isFullSize ? 44 : (int) Math.max(44.0f, (OKLCH.m$3(4.0f, this.botButtons.rows.size() - 1, this.panelHeight - AndroidUtilities.dp(16.0f)) / this.botButtons.rows.size()) / AndroidUtilities.density);
        this.buttonHeight = iMax;
        int iDp = AndroidUtilities.dp(iMax);
        ArrayList arrayList = this.animator.list.entries;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ListAnimator.Entry entry = (ListAnimator.Entry) obj;
            int childCount = ((ButtonsLayout) entry.item).getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = ((ButtonsLayout) entry.item).getChildAt(i3);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.height != iDp) {
                    layoutParams.height = iDp;
                    childAt.setLayoutParams(layoutParams);
                }
            }
        }
    }
}
