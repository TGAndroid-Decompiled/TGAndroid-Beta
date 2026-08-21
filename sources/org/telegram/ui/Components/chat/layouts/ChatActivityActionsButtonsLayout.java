package org.telegram.ui.Components.chat.layouts;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import me.vkryl.android.AnimatorUtils;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;
import org.telegram.ui.Components.chat.buttons.ChatActivityBlurredRoundButton;

public class ChatActivityActionsButtonsLayout extends LinearLayout {
    private final ButtonHolder forwardButton;
    private final ButtonHolder replyButton;
    private final Theme.ResourcesProvider resourcesProvider;
    private float totalVisibilityFactor;

    public static void m2960$r8$lambda$93jBtX9Pu1HgVxuSin9Qptiq48(View view) {
    }

    public static void m2961$r8$lambda$hGVeBG6LPQS6sq_sAAeOPhOqg(View view) {
    }

    public ChatActivityActionsButtonsLayout(Context context, Theme.ResourcesProvider resourcesProvider, BlurredBackgroundColorProvider blurredBackgroundColorProvider, BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        super(context);
        ButtonHolder buttonHolder = new ButtonHolder();
        this.replyButton = buttonHolder;
        ButtonHolder buttonHolder2 = new ButtonHolder();
        this.forwardButton = buttonHolder2;
        this.resourcesProvider = resourcesProvider;
        ChatActivityBlurredRoundButton chatActivityBlurredRoundButtonCreate = ChatActivityBlurredRoundButton.create(context, blurredBackgroundDrawableViewFactory, blurredBackgroundColorProvider, resourcesProvider);
        buttonHolder.button = chatActivityBlurredRoundButtonCreate;
        chatActivityBlurredRoundButtonCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatActivityActionsButtonsLayout.m2960$r8$lambda$93jBtX9Pu1HgVxuSin9Qptiq48(view);
            }
        });
        ScaleStateListAnimator.apply(buttonHolder.button, 0.065f, 2.0f);
        ChatActivityBlurredRoundButton chatActivityBlurredRoundButtonCreate2 = ChatActivityBlurredRoundButton.create(context, blurredBackgroundDrawableViewFactory, blurredBackgroundColorProvider, resourcesProvider);
        buttonHolder2.button = chatActivityBlurredRoundButtonCreate2;
        chatActivityBlurredRoundButtonCreate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ChatActivityActionsButtonsLayout.m2961$r8$lambda$hGVeBG6LPQS6sq_sAAeOPhOqg(view);
            }
        });
        ScaleStateListAnimator.apply(buttonHolder2.button, 0.065f, 2.0f);
        addTextView(buttonHolder, LocaleController.getString(R.string.Reply), R.drawable.input_reply, false);
        addTextView(buttonHolder2, LocaleController.getString(R.string.Forward), R.drawable.input_forward, true);
        setOrientation(0);
        setClipChildren(false);
        addView(buttonHolder.button, LayoutHelper.createLinear(0, 56, 1.0f, 1, 0, -1, 0));
        addView(buttonHolder2.button, LayoutHelper.createLinear(0, 56, 1.0f, -1, 0, 1, 0));
    }

    public void setReplyButtonOnClickListener(View.OnClickListener onClickListener) {
        this.replyButton.button.setOnClickListener(onClickListener);
    }

    public void setForwardButtonOnClickListener(View.OnClickListener onClickListener) {
        this.forwardButton.button.setOnClickListener(onClickListener);
    }

    public View getForwardButton() {
        return this.forwardButton.button;
    }

    private void addTextView(ButtonHolder buttonHolder, String str, int i, boolean z) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(16);
        textView.setTextSize(1, 15.0f);
        textView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        textView.setTextColor(Theme.getColor(Theme.key_glass_defaultText, this.resourcesProvider));
        textView.setTypeface(AndroidUtilities.bold());
        Drawable drawableMutate = getContext().getResources().getDrawable(i).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_glass_defaultIcon, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
        Drawable drawable = z ? drawableMutate : null;
        if (z) {
            drawableMutate = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, drawableMutate, (Drawable) null);
        buttonHolder.textView = textView;
        buttonHolder.button.addView(textView, LayoutHelper.createFrame(-2, -2, 17));
    }

    public void showReplyButton(boolean z, boolean z2) {
        this.replyButton.visibilityAnimator.setValue(z, z2);
    }

    public void setForwardButtonEnabled(boolean z, boolean z2) {
        this.forwardButton.enabledAnimator.setValue(z, z2);
        this.forwardButton.button.setEnabled(z);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        checkButtonsPositionsAndVisibility();
    }

    public void setTotalVisibilityFactor(float f) {
        if (this.totalVisibilityFactor != f) {
            this.totalVisibilityFactor = f;
            checkButtonsPositionsAndVisibility();
        }
    }

    private void checkButtonsPositionsAndVisibility() {
        checkHolderPositionsAndVisibility(this.forwardButton);
        checkHolderPositionsAndVisibility(this.replyButton);
    }

    public void checkHolderPositionsAndVisibility(ButtonHolder buttonHolder) {
        float floatValue = this.totalVisibilityFactor * buttonHolder.visibilityAnimator.getFloatValue();
        float f = (-AndroidUtilities.dp(54.0f)) * (1.0f - floatValue);
        float measuredWidth = (getMeasuredWidth() / 2.0f) * (1.0f - AnimatorUtils.DECELERATE_INTERPOLATOR.getInterpolation(floatValue));
        if (buttonHolder == this.replyButton) {
            measuredWidth *= -1.0f;
        }
        buttonHolder.button.setTranslationX(measuredWidth);
        buttonHolder.button.setTranslationY(f);
        buttonHolder.button.setAlpha(floatValue);
        buttonHolder.button.setVisibility(floatValue > 0.0f ? 0 : 4);
    }

    private class ButtonHolder implements FactorAnimator.Target {
        public ChatActivityBlurredRoundButton button;
        public BoolAnimator enabledAnimator;
        public TextView textView;
        public BoolAnimator visibilityAnimator;

        @Override
        public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
            FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
        }

        private ButtonHolder() {
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.visibilityAnimator = new BoolAnimator(0, this, cubicBezierInterpolator, 320L, true);
            this.enabledAnimator = new BoolAnimator(1, this, cubicBezierInterpolator, 320L, true);
        }

        @Override
        public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
            this.textView.setAlpha(AndroidUtilities.lerp(0.5f, 1.0f, this.enabledAnimator.getFloatValue()));
            ChatActivityActionsButtonsLayout.this.checkHolderPositionsAndVisibility(this);
        }
    }
}
