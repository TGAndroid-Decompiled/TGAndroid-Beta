package org.telegram.ui.Components.chat.layouts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;
import org.telegram.ui.Components.chat.buttons.ChatActivityBlurredRoundButton;

public abstract class ChatActivityChannelButtonsLayout extends FrameLayout implements FactorAnimator.Target {
    private static final int[] buttonIcons = {R.drawable.msg_search, R.drawable.input_gift_s, R.drawable.input_message, R.drawable.msg_help};
    private static final int[] buttonsOrderLeft = {0};
    private static final int[] buttonsOrderRight = {1, 2, 3};
    private static final RectF tmpRect = new RectF();
    private int accentColor;
    private final BoolAnimator animatorCenterAccentBackground;
    private final Paint backgroundAccentPaint;
    private final BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory;
    private final ButtonHolder[] buttonHolders;
    private final BlurredBackgroundColorProvider colorProvider;
    private final FrameLayout container;
    private final OnButtonFullyVisibleListener[] onButtonFullyVisible;
    private OnButtonsTotalWidthChanged onButtonsTotalWidthChanged;
    private final View.OnClickListener[] onClickListeners;
    private final Theme.ResourcesProvider resourcesProvider;
    private float totalVisibilityFactor;
    private float totalWidthLeft;
    private float totalWidthRight;

    public interface OnButtonFullyVisibleListener {
        void onButtonFullyVisible(View view, int i, boolean z);
    }

    public interface OnButtonsTotalWidthChanged {
        void onButtonsTotalWidthChanged(float f, float f2);
    }

    public ChatActivityChannelButtonsLayout(Context context, Theme.ResourcesProvider resourcesProvider, BlurredBackgroundColorProvider blurredBackgroundColorProvider, BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        super(context);
        this.buttonHolders = new ButtonHolder[4];
        this.onClickListeners = new View.OnClickListener[4];
        this.onButtonFullyVisible = new OnButtonFullyVisibleListener[4];
        this.animatorCenterAccentBackground = new BoolAnimator(99, this, CubicBezierInterpolator.EASE_OUT_QUINT, 320L);
        this.backgroundAccentPaint = new Paint(1);
        this.accentColor = 0;
        this.blurredBackgroundDrawableViewFactory = blurredBackgroundDrawableViewFactory;
        this.colorProvider = blurredBackgroundColorProvider;
        this.resourcesProvider = resourcesProvider;
        FrameLayout frameLayout = new FrameLayout(context);
        this.container = frameLayout;
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), AndroidUtilities.dp(22.0f));
            }
        });
        addView(frameLayout, LayoutHelper.createFrame(-1, 44, 16));
    }

    public void updateColors() {
        for (ButtonHolder buttonHolder : this.buttonHolders) {
            if (buttonHolder != null) {
                buttonHolder.button.updateColors();
            }
        }
    }

    public FrameLayout getContainer() {
        return this.container;
    }

    public void showButton(final int i, boolean z, boolean z2) {
        if (i >= 0) {
            ButtonHolder[] buttonHolderArr = this.buttonHolders;
            if (i >= buttonHolderArr.length) {
                return;
            }
            ButtonHolder buttonHolder = buttonHolderArr[i];
            if (buttonHolder != null || z) {
                if (buttonHolder == null) {
                    BoolAnimator boolAnimator = new BoolAnimator((i << 16) | 1, this, CubicBezierInterpolator.EASE_OUT_QUINT, 300L);
                    ChatActivityBlurredRoundButton create = ChatActivityBlurredRoundButton.create(getContext(), this.blurredBackgroundDrawableViewFactory, this.colorProvider, this.resourcesProvider, buttonIcons[i]);
                    ScaleStateListAnimator.apply(create, 0.13f, 2.0f);
                    create.setVisibility(8);
                    create.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            ChatActivityChannelButtonsLayout.this.lambda$showButton$0(i, view);
                        }
                    });
                    addView(create, LayoutHelper.createFrame(56, 56.0f));
                    this.buttonHolders[i] = new ButtonHolder(create, boolAnimator);
                    checkButtonsPositionsAndVisibility();
                }
                this.buttonHolders[i].visibilityAnimator.setValue(z, z2);
            }
        }
    }

    public void lambda$showButton$0(int i, View view) {
        View.OnClickListener onClickListener = this.onClickListeners[i];
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public boolean isButtonVisible(int i) {
        ButtonHolder buttonHolder;
        if (i < 0) {
            return false;
        }
        ButtonHolder[] buttonHolderArr = this.buttonHolders;
        if (i >= buttonHolderArr.length || (buttonHolder = buttonHolderArr[i]) == null) {
            return false;
        }
        return buttonHolder.visibilityAnimator.getValue();
    }

    public void setButtonOnClickListener(int i, View.OnClickListener onClickListener) {
        this.onClickListeners[i] = onClickListener;
    }

    public void setButtonOnFullyVisibleListener(int i, OnButtonFullyVisibleListener onButtonFullyVisibleListener) {
        this.onButtonFullyVisible[i] = onButtonFullyVisibleListener;
    }

    public void setOnButtonsTotalWidthChanged(OnButtonsTotalWidthChanged onButtonsTotalWidthChanged) {
        this.onButtonsTotalWidthChanged = onButtonsTotalWidthChanged;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        checkContainerPaddings(false);
        super.onMeasure(i, i2);
        checkButtonsPositionsAndVisibility();
    }

    public void setCenterAccentBackground(boolean z, boolean z2) {
        this.animatorCenterAccentBackground.setValue(z, z2);
    }

    public void setTotalVisibilityFactor(float f) {
        if (this.totalVisibilityFactor != f) {
            this.totalVisibilityFactor = f;
            checkButtonsPositionsAndVisibility();
            invalidate();
        }
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 99) {
            invalidate();
            return;
        }
        int i2 = i >> 16;
        int i3 = i & 65535;
        if (i2 >= 0) {
            ButtonHolder[] buttonHolderArr = this.buttonHolders;
            if (i2 >= buttonHolderArr.length || buttonHolderArr[i2] == null || i3 != 1) {
                return;
            }
            checkContainerPaddings(true);
            checkButtonsPositionsAndVisibility();
            invalidate();
        }
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        ButtonHolder buttonHolder;
        if (i == 99) {
            invalidate();
        }
        int i2 = i >> 16;
        int i3 = i & 65535;
        if (i2 >= 0) {
            ButtonHolder[] buttonHolderArr = this.buttonHolders;
            if (i2 >= buttonHolderArr.length || (buttonHolder = buttonHolderArr[i2]) == null || i3 != 1 || !buttonHolder.visibilityAnimator.getValue()) {
                return;
            }
            OnButtonFullyVisibleListener onButtonFullyVisibleListener = this.onButtonFullyVisible[i2];
            if (onButtonFullyVisibleListener != null) {
                onButtonFullyVisibleListener.onButtonFullyVisible(buttonHolder.button, i2, !buttonHolder.wasShown);
            }
            buttonHolder.wasShown = true;
        }
    }

    private void checkContainerPaddings(boolean z) {
        int dp = AndroidUtilities.dp(7.0f);
        int dp2 = AndroidUtilities.dp(7.0f);
        for (int i : buttonsOrderLeft) {
            ButtonHolder buttonHolder = this.buttonHolders[i];
            if (buttonHolder != null) {
                dp += buttonHolder.visibilityAnimator.getValue() ? AndroidUtilities.dp(54.0f) : 0;
            }
        }
        for (int i2 : buttonsOrderRight) {
            ButtonHolder buttonHolder2 = this.buttonHolders[i2];
            if (buttonHolder2 != null) {
                dp2 += buttonHolder2.visibilityAnimator.getValue() ? AndroidUtilities.dp(54.0f) : 0;
            }
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.container.getLayoutParams();
        if (marginLayoutParams.leftMargin == dp && marginLayoutParams.rightMargin == dp2) {
            return;
        }
        marginLayoutParams.leftMargin = dp;
        marginLayoutParams.rightMargin = dp2;
        if (z) {
            this.container.requestLayout();
        }
    }

    private void checkButtonsPositionsAndVisibility() {
        this.totalWidthLeft = 0.0f;
        this.totalWidthRight = 0.0f;
        for (ButtonHolder buttonHolder : this.buttonHolders) {
            if (buttonHolder != null) {
                float floatValue = buttonHolder.visibilityAnimator.getFloatValue() * this.totalVisibilityFactor;
                buttonHolder.button.setVisibility(floatValue > 0.0f ? 0 : 8);
                buttonHolder.button.setAlpha(floatValue);
                buttonHolder.button.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, floatValue));
                buttonHolder.button.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, floatValue));
            }
        }
        for (int i : buttonsOrderLeft) {
            ButtonHolder buttonHolder2 = this.buttonHolders[i];
            if (buttonHolder2 != null) {
                float floatValue2 = buttonHolder2.visibilityAnimator.getFloatValue() * AndroidUtilities.dp(54.0f);
                buttonHolder2.button.setTranslationX(AndroidUtilities.dp(1.0f) + this.totalWidthLeft);
                this.totalWidthLeft += floatValue2;
            }
        }
        for (int i2 : buttonsOrderRight) {
            ButtonHolder buttonHolder3 = this.buttonHolders[i2];
            if (buttonHolder3 != null) {
                float floatValue3 = buttonHolder3.visibilityAnimator.getFloatValue() * AndroidUtilities.dp(54.0f);
                buttonHolder3.button.setTranslationX(((getMeasuredWidth() - buttonHolder3.button.getMeasuredWidth()) - AndroidUtilities.dp(1.0f)) - this.totalWidthRight);
                this.totalWidthRight += floatValue3;
            }
        }
        if (this.totalVisibilityFactor < 1.0f) {
            for (int i3 : buttonsOrderLeft) {
                ButtonHolder buttonHolder4 = this.buttonHolders[i3];
                if (buttonHolder4 != null) {
                    ChatActivityBlurredRoundButton chatActivityBlurredRoundButton = buttonHolder4.button;
                    chatActivityBlurredRoundButton.setTranslationX(chatActivityBlurredRoundButton.getTranslationX() - (this.totalWidthLeft * (1.0f - this.totalVisibilityFactor)));
                }
            }
            for (int i4 : buttonsOrderRight) {
                ButtonHolder buttonHolder5 = this.buttonHolders[i4];
                if (buttonHolder5 != null) {
                    ChatActivityBlurredRoundButton chatActivityBlurredRoundButton2 = buttonHolder5.button;
                    chatActivityBlurredRoundButton2.setTranslationX(chatActivityBlurredRoundButton2.getTranslationX() + (this.totalWidthRight * (1.0f - this.totalVisibilityFactor)));
                }
            }
            float f = this.totalWidthLeft;
            float f2 = this.totalVisibilityFactor;
            this.totalWidthLeft = f * f2;
            this.totalWidthRight *= f2;
        }
        OnButtonsTotalWidthChanged onButtonsTotalWidthChanged = this.onButtonsTotalWidthChanged;
        if (onButtonsTotalWidthChanged != null) {
            onButtonsTotalWidthChanged.onButtonsTotalWidthChanged(this.totalWidthLeft, this.totalWidthRight);
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        int floatValue = (int) (this.totalVisibilityFactor * 255.0f * this.animatorCenterAccentBackground.getFloatValue());
        if (floatValue > 0) {
            RectF rectF = tmpRect;
            rectF.set(this.totalWidthLeft + AndroidUtilities.dp(10.0f), AndroidUtilities.dp(9.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - this.totalWidthRight, getMeasuredHeight() - AndroidUtilities.dp(9.0f));
            this.backgroundAccentPaint.setColor(this.accentColor);
            this.backgroundAccentPaint.setAlpha(floatValue);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f), this.backgroundAccentPaint);
        }
        super.dispatchDraw(canvas);
    }

    public void setAccentColor(int i) {
        this.accentColor = i;
    }

    public static class ButtonHolder {
        public final ChatActivityBlurredRoundButton button;
        public final BoolAnimator visibilityAnimator;
        public boolean wasShown;

        private ButtonHolder(ChatActivityBlurredRoundButton chatActivityBlurredRoundButton, BoolAnimator boolAnimator) {
            this.button = chatActivityBlurredRoundButton;
            this.visibilityAnimator = boolAnimator;
        }
    }
}
