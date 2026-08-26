package org.telegram.ui.Components.chat.layouts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.HashSet;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda26;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;
import org.telegram.ui.Components.chat.buttons.ChatActivityBlurredRoundButton;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda29;

public class ChatActivityChannelButtonsLayout extends FrameLayout implements FactorAnimator.Target {
    private static final int BUTTONS_COUNT = 5;
    public static final int BUTTON_DIRECT = 2;
    public static final int BUTTON_GIFT = 1;
    public static final int BUTTON_GIGA_GROUP_INFO = 3;
    public static final int BUTTON_RECENT_ACTIONS_INFO = 4;
    public static final int BUTTON_SEARCH = 0;
    private static final int CENTER_ACCENT_BACKGROUND_ANIMATOR_ID = 99;
    private static final int VISIBILITY_ANIMATOR_ID = 1;
    private static final int WRAPPING_BUTTON_ANIMATOR_ID = 100;
    private static final int[] buttonIcons;
    private static final int[] buttonsOrderLeft;
    private static final int[] buttonsOrderRight;
    private static final RectF tmpRect;
    private int accentColor;
    private final BoolAnimator animatorCenterAccentBackground;
    private final BoolAnimator animatorWrappingButton;
    private final Paint backgroundAccentPaint;
    private final BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory;
    private final ButtonHolder[] buttonHolders;
    private final BlurredBackgroundColorProvider colorProvider;
    private final FrameLayout container;
    private BlurredBackgroundDrawable containerDrawable;
    private final OnButtonFullyVisibleListener[] onButtonFullyVisible;
    private OnButtonsTotalWidthChanged onButtonsTotalWidthChanged;
    private final View.OnClickListener[] onClickListeners;
    private final Theme.ResourcesProvider resourcesProvider;
    private float totalVisibilityFactor;
    private float totalWidthLeft;
    private float totalWidthRight;
    private final HashSet<View> wrapContentButtons;

    public final class ButtonHolder {
        public final ChatActivityBlurredRoundButton button;
        public final BoolAnimator visibilityAnimator;
        public boolean wasShown;

        public ButtonHolder(ChatActivityBlurredRoundButton chatActivityBlurredRoundButton, BoolAnimator boolAnimator) {
            this.button = chatActivityBlurredRoundButton;
            this.visibilityAnimator = boolAnimator;
        }
    }

    public interface OnButtonFullyVisibleListener {
        void onButtonFullyVisible(ChatActivityBlurredRoundButton chatActivityBlurredRoundButton, int i, boolean z);
    }

    public interface OnButtonsTotalWidthChanged {
    }

    static {
        int i = R.drawable.msg_search;
        int i2 = R.drawable.input_gift_s;
        int i3 = R.drawable.input_message;
        int i4 = R.drawable.msg_help;
        buttonIcons = new int[]{i, i2, i3, i4, i4};
        buttonsOrderLeft = new int[]{0};
        buttonsOrderRight = new int[]{1, 2, 3, 4};
        tmpRect = new RectF();
    }

    public ChatActivityChannelButtonsLayout(Context context, Theme.ResourcesProvider resourcesProvider, BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory, BlurredBackgroundColorProvider blurredBackgroundColorProvider) {
        super(context);
        this.buttonHolders = new ButtonHolder[5];
        this.onClickListeners = new View.OnClickListener[5];
        this.onButtonFullyVisible = new OnButtonFullyVisibleListener[5];
        this.wrapContentButtons = new HashSet<>();
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorCenterAccentBackground = new BoolAnimator(99, this, cubicBezierInterpolator, 320L, false);
        this.animatorWrappingButton = new BoolAnimator(100, this, cubicBezierInterpolator, 320L, false);
        this.backgroundAccentPaint = new Paint(1);
        this.accentColor = 0;
        this.blurredBackgroundDrawableViewFactory = blurredBackgroundDrawableViewFactory;
        this.colorProvider = blurredBackgroundColorProvider;
        this.resourcesProvider = resourcesProvider;
        FrameLayout frameLayout = new FrameLayout(context);
        this.container = frameLayout;
        frameLayout.setClipToOutline(true);
        float fDp = AndroidUtilities.dp(22.0f);
        RichEditor.AnonymousClass5 anonymousClass5 = ViewOutlineProviderImpl.BOUNDS_OVAL;
        frameLayout.setOutlineProvider(new ViewOutlineProviderImpl.AnonymousClass5(0, fDp));
        addView(frameLayout, LayoutHelper.createFrame(-1, 44, 16));
    }

    public final void checkButtonsPositionsAndVisibility() {
        float fMax = 0.0f;
        this.totalWidthLeft = 0.0f;
        this.totalWidthRight = 0.0f;
        for (ButtonHolder buttonHolder : this.buttonHolders) {
            if (buttonHolder != null) {
                float f = buttonHolder.visibilityAnimator.floatValue * this.totalVisibilityFactor;
                int i = f > 0.0f ? 0 : 8;
                ChatActivityBlurredRoundButton chatActivityBlurredRoundButton = buttonHolder.button;
                chatActivityBlurredRoundButton.setVisibility(i);
                chatActivityBlurredRoundButton.setAlpha(f);
                chatActivityBlurredRoundButton.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f));
                chatActivityBlurredRoundButton.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f));
            }
        }
        for (int i2 : buttonsOrderLeft) {
            ButtonHolder buttonHolder2 = this.buttonHolders[i2];
            if (buttonHolder2 != null) {
                float fDp = buttonHolder2.visibilityAnimator.floatValue * AndroidUtilities.dp(54.0f);
                buttonHolder2.button.setTranslationX(AndroidUtilities.dp(1.0f) + this.totalWidthLeft);
                this.totalWidthLeft += fDp;
            }
        }
        for (int i3 : buttonsOrderRight) {
            ButtonHolder buttonHolder3 = this.buttonHolders[i3];
            if (buttonHolder3 != null) {
                float fDp2 = buttonHolder3.visibilityAnimator.floatValue * AndroidUtilities.dp(54.0f);
                int measuredWidth = getMeasuredWidth();
                ChatActivityBlurredRoundButton chatActivityBlurredRoundButton2 = buttonHolder3.button;
                chatActivityBlurredRoundButton2.setTranslationX(((measuredWidth - chatActivityBlurredRoundButton2.getMeasuredWidth()) - AndroidUtilities.dp(1.0f)) - this.totalWidthRight);
                this.totalWidthRight += fDp2;
            }
        }
        if (this.totalVisibilityFactor < 1.0f) {
            for (int i4 : buttonsOrderLeft) {
                ButtonHolder buttonHolder4 = this.buttonHolders[i4];
                if (buttonHolder4 != null) {
                    ChatActivityBlurredRoundButton chatActivityBlurredRoundButton3 = buttonHolder4.button;
                    chatActivityBlurredRoundButton3.setTranslationX(chatActivityBlurredRoundButton3.getTranslationX() - ((1.0f - this.totalVisibilityFactor) * this.totalWidthLeft));
                }
            }
            for (int i5 : buttonsOrderRight) {
                ButtonHolder buttonHolder5 = this.buttonHolders[i5];
                if (buttonHolder5 != null) {
                    ChatActivityBlurredRoundButton chatActivityBlurredRoundButton4 = buttonHolder5.button;
                    chatActivityBlurredRoundButton4.setTranslationX(((1.0f - this.totalVisibilityFactor) * this.totalWidthRight) + chatActivityBlurredRoundButton4.getTranslationX());
                }
            }
            float f2 = this.totalWidthLeft;
            float f3 = this.totalVisibilityFactor;
            this.totalWidthLeft = f2 * f3;
            this.totalWidthRight *= f3;
        }
        float f4 = this.animatorWrappingButton.floatValue;
        if (f4 > 0.0f && getMeasuredWidth() > 0) {
            float measuredWidth2 = getMeasuredWidth();
            for (int i6 = 0; i6 < getContainer().getChildCount(); i6++) {
                View childAt = getContainer().getChildAt(i6);
                if (this.wrapContentButtons.contains(childAt)) {
                    measuredWidth2 = Math.min(measuredWidth2, childAt.getLeft());
                    fMax = Math.max(fMax, childAt.getRight());
                }
            }
            if (measuredWidth2 > fMax) {
                fMax = (measuredWidth2 + fMax) / 2.0f;
                measuredWidth2 = fMax;
            }
            this.totalWidthLeft = AndroidUtilities.lerp(this.totalWidthLeft, measuredWidth2 - AndroidUtilities.dp(3.33f), f4);
            this.totalWidthRight = AndroidUtilities.lerp(this.totalWidthRight, (getMeasuredWidth() - fMax) - AndroidUtilities.dp(17.66f), f4);
        }
        OnButtonsTotalWidthChanged onButtonsTotalWidthChanged = this.onButtonsTotalWidthChanged;
        if (onButtonsTotalWidthChanged != null) {
            ((ChatActivity$$ExternalSyntheticLambda26) onButtonsTotalWidthChanged).f$0.lambda$createView$69(this.totalWidthLeft, this.totalWidthRight);
        }
    }

    public final void checkContainerPaddings(boolean z) {
        int iDp = AndroidUtilities.dp(7.0f);
        int iDp2 = AndroidUtilities.dp(7.0f);
        for (int i : buttonsOrderLeft) {
            ButtonHolder buttonHolder = this.buttonHolders[i];
            if (buttonHolder != null) {
                iDp += buttonHolder.visibilityAnimator.value ? AndroidUtilities.dp(54.0f) : 0;
            }
        }
        for (int i2 : buttonsOrderRight) {
            ButtonHolder buttonHolder2 = this.buttonHolders[i2];
            if (buttonHolder2 != null) {
                iDp2 += buttonHolder2.visibilityAnimator.value ? AndroidUtilities.dp(54.0f) : 0;
            }
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.container.getLayoutParams();
        if (marginLayoutParams.leftMargin == iDp && marginLayoutParams.rightMargin == iDp2) {
            return;
        }
        marginLayoutParams.leftMargin = iDp;
        marginLayoutParams.rightMargin = iDp2;
        if (z) {
            this.container.requestLayout();
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i = (int) (this.totalVisibilityFactor * 255.0f * this.animatorCenterAccentBackground.floatValue);
        if (i > 0) {
            RectF rectF = tmpRect;
            rectF.set(this.totalWidthLeft + AndroidUtilities.dp(10.0f), AndroidUtilities.dp(9.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - this.totalWidthRight, getMeasuredHeight() - AndroidUtilities.dp(9.0f));
            this.backgroundAccentPaint.setColor(this.accentColor);
            this.backgroundAccentPaint.setAlpha(i);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f), this.backgroundAccentPaint);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.container && this.containerDrawable != null) {
            RectF rectF = tmpRect;
            rectF.set(this.totalWidthLeft + AndroidUtilities.dp(1.0f), 0.0f, (getMeasuredWidth() - AndroidUtilities.dp(1.0f)) - this.totalWidthRight, getMeasuredHeight());
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.containerDrawable.setBounds(rect);
            this.containerDrawable.draw(canvas);
        }
        return super.drawChild(canvas, view, j);
    }

    public FrameLayout getContainer() {
        return this.container;
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
        return buttonHolder.visibilityAnimator.value;
    }

    public final void lambda$showButton$0(int i, View view) {
        View.OnClickListener onClickListener = this.onClickListeners[i];
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public void makeViewWrapContent(View view) {
        this.wrapContentButtons.add(view);
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        ButtonHolder buttonHolder;
        if (i == 99 || i == 100) {
            invalidate();
        }
        int i2 = i >> 16;
        int i3 = i & 65535;
        if (i2 >= 0) {
            ButtonHolder[] buttonHolderArr = this.buttonHolders;
            if (i2 >= buttonHolderArr.length || (buttonHolder = buttonHolderArr[i2]) == null || i3 != 1 || !buttonHolder.visibilityAnimator.value) {
                return;
            }
            OnButtonFullyVisibleListener onButtonFullyVisibleListener = this.onButtonFullyVisible[i2];
            if (onButtonFullyVisibleListener != null) {
                onButtonFullyVisibleListener.onButtonFullyVisible(buttonHolder.button, i2, !buttonHolder.wasShown);
            }
            buttonHolder.wasShown = true;
        }
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 99) {
            invalidate();
            return;
        }
        if (i == 100) {
            checkButtonsPositionsAndVisibility();
            invalidate();
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
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        checkButtonsPositionsAndVisibility();
    }

    @Override
    public void onMeasure(int i, int i2) {
        checkContainerPaddings(false);
        super.onMeasure(i, i2);
        checkButtonsPositionsAndVisibility();
    }

    public void setAccentColor(int i) {
        this.accentColor = i;
    }

    public void setButtonOnClickListener(int i, View.OnClickListener onClickListener) {
        this.onClickListeners[i] = onClickListener;
    }

    public void setButtonOnFullyVisibleListener(int i, OnButtonFullyVisibleListener onButtonFullyVisibleListener) {
        this.onButtonFullyVisible[i] = onButtonFullyVisibleListener;
    }

    public void setCenterAccentBackground(boolean z, boolean z2) {
        this.animatorCenterAccentBackground.setValue(z, z2);
    }

    public void setOnButtonsTotalWidthChanged(OnButtonsTotalWidthChanged onButtonsTotalWidthChanged) {
        this.onButtonsTotalWidthChanged = onButtonsTotalWidthChanged;
    }

    public void setTotalVisibilityFactor(float f) {
        if (this.totalVisibilityFactor != f) {
            this.totalVisibilityFactor = f;
            checkButtonsPositionsAndVisibility();
            invalidate();
        }
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        updateWrappingVisible(false);
    }

    public void setupDrawableForContainer() {
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = this.blurredBackgroundDrawableViewFactory.create(this, null, false);
        blurredBackgroundDrawableCreate.setColorProvider(this.colorProvider);
        Theme.ResourcesProvider.CC.m(blurredBackgroundDrawableCreate, AndroidUtilities.dp(22.0f), 6.0f);
        this.containerDrawable = blurredBackgroundDrawableCreate;
    }

    public void showButton(int i, boolean z, boolean z2) {
        ButtonHolder buttonHolder;
        ChatActivityChannelButtonsLayout chatActivityChannelButtonsLayout;
        if (i >= 0) {
            ButtonHolder[] buttonHolderArr = this.buttonHolders;
            if (i < buttonHolderArr.length && ((buttonHolder = buttonHolderArr[i]) != null || z)) {
                if (buttonHolder == null) {
                    chatActivityChannelButtonsLayout = this;
                    BoolAnimator boolAnimator = new BoolAnimator((i << 16) | 1, chatActivityChannelButtonsLayout, CubicBezierInterpolator.EASE_OUT_QUINT, 300L, false);
                    ChatActivityBlurredRoundButton chatActivityBlurredRoundButtonCreate = ChatActivityBlurredRoundButton.create(getContext(), chatActivityChannelButtonsLayout.blurredBackgroundDrawableViewFactory, chatActivityChannelButtonsLayout.colorProvider, chatActivityChannelButtonsLayout.resourcesProvider, buttonIcons[i], 48);
                    if (i == 1) {
                        chatActivityBlurredRoundButtonCreate.setContentDescription(LocaleController.getString(R.string.ProfileActionsGift));
                    } else if (i == 2) {
                        chatActivityBlurredRoundButtonCreate.setContentDescription(LocaleController.getString(R.string.ChannelOpenDirect));
                    } else if (i == 0) {
                        chatActivityBlurredRoundButtonCreate.setContentDescription(LocaleController.getString(R.string.Search));
                    } else if (i == 3) {
                        chatActivityBlurredRoundButtonCreate.setContentDescription(LocaleController.getString(R.string.BroadcastGroupInfo));
                    }
                    ScaleStateListAnimator.apply(chatActivityBlurredRoundButtonCreate, 0.13f, 2.0f);
                    chatActivityBlurredRoundButtonCreate.setVisibility(8);
                    chatActivityBlurredRoundButtonCreate.setOnClickListener(new RichEditor$$ExternalSyntheticLambda29(this, i, 1));
                    addView(chatActivityBlurredRoundButtonCreate, LayoutHelper.createFrame(56, 56.0f));
                    chatActivityChannelButtonsLayout.buttonHolders[i] = new ButtonHolder(chatActivityBlurredRoundButtonCreate, boolAnimator);
                    checkButtonsPositionsAndVisibility();
                } else {
                    chatActivityChannelButtonsLayout = this;
                }
                chatActivityChannelButtonsLayout.buttonHolders[i].visibilityAnimator.setValue(z, z2);
            }
        }
    }

    public void updateColors() {
        for (ButtonHolder buttonHolder : this.buttonHolders) {
            if (buttonHolder != null) {
                buttonHolder.button.updateColors();
            }
        }
    }

    public void updateWrappingVisible(boolean z) {
        boolean z2 = false;
        z2 = false;
        if (getVisibility() == 0 && getContainer().getVisibility() == 0) {
            boolean z3 = false;
            for (int i = 0; i < getContainer().getChildCount(); i++) {
                View childAt = getContainer().getChildAt(i);
                if (this.wrapContentButtons.contains(childAt) && childAt.getVisibility() == 0) {
                    z3 = true;
                }
            }
            z2 = z3;
        }
        this.animatorWrappingButton.setValue(z2, z);
    }
}
