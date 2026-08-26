package org.telegram.ui.Components.chat.layouts;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.FullyDrawnReporter;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import java.util.HashSet;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda50;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda68;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.HintsController$Hint;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;
import org.telegram.ui.Components.chat.ChatInputViewsContainer;
import org.telegram.ui.Components.chat.buttons.ChatActivityBlurredRoundButton;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.VoIPFragment;
import org.telegram.ui.iv.RichEditor;

public class ChatActivityChannelButtonsLayout extends FrameLayout implements FactorAnimator.Target {
    public static final int[] buttonIcons;
    public static final int[] buttonsOrderLeft;
    public static final int[] buttonsOrderRight;
    public static final RectF tmpRect;
    public int accentColor;
    public final BoolAnimator animatorCenterAccentBackground;
    public final BoolAnimator animatorWrappingButton;
    public final Paint backgroundAccentPaint;
    public final BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory;
    public final FullyDrawnReporter[] buttonHolders;
    public final BlurredBackgroundColorProvider colorProvider;
    public final FrameLayout container;
    public BlurredBackgroundDrawable containerDrawable;
    public final ChatActivity$$ExternalSyntheticLambda50[] onButtonFullyVisible;
    public OnButtonsTotalWidthChanged onButtonsTotalWidthChanged;
    public final View.OnClickListener[] onClickListeners;
    public final Theme.ResourcesProvider resourcesProvider;
    public float totalVisibilityFactor;
    public float totalWidthLeft;
    public float totalWidthRight;
    public final HashSet wrapContentButtons;

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

    public ChatActivityChannelButtonsLayout(Context context, Theme.ResourcesProvider resourcesProvider, BlurredBackgroundColorProvider blurredBackgroundColorProvider, BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        super(context);
        this.buttonHolders = new FullyDrawnReporter[5];
        this.onClickListeners = new View.OnClickListener[5];
        this.onButtonFullyVisible = new ChatActivity$$ExternalSyntheticLambda50[5];
        this.wrapContentButtons = new HashSet();
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
        FullyDrawnReporter[] fullyDrawnReporterArr = this.buttonHolders;
        for (FullyDrawnReporter fullyDrawnReporter : fullyDrawnReporterArr) {
            if (fullyDrawnReporter != null) {
                float f = ((BoolAnimator) fullyDrawnReporter.onReportCallbacks).floatValue * this.totalVisibilityFactor;
                int i = f > 0.0f ? 0 : 8;
                ChatActivityBlurredRoundButton chatActivityBlurredRoundButton = (ChatActivityBlurredRoundButton) fullyDrawnReporter.lock;
                chatActivityBlurredRoundButton.setVisibility(i);
                chatActivityBlurredRoundButton.setAlpha(f);
                chatActivityBlurredRoundButton.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, f));
                chatActivityBlurredRoundButton.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, f));
            }
        }
        int[] iArr = buttonsOrderLeft;
        FullyDrawnReporter fullyDrawnReporter2 = fullyDrawnReporterArr[iArr[0]];
        if (fullyDrawnReporter2 != null) {
            float fDp = ((BoolAnimator) fullyDrawnReporter2.onReportCallbacks).floatValue * AndroidUtilities.dp(54.0f);
            ((ChatActivityBlurredRoundButton) fullyDrawnReporter2.lock).setTranslationX(AndroidUtilities.dp(1.0f) + this.totalWidthLeft);
            this.totalWidthLeft += fDp;
        }
        int[] iArr2 = buttonsOrderRight;
        for (int i2 = 0; i2 < 4; i2++) {
            FullyDrawnReporter fullyDrawnReporter3 = fullyDrawnReporterArr[iArr2[i2]];
            if (fullyDrawnReporter3 != null) {
                float fDp2 = ((BoolAnimator) fullyDrawnReporter3.onReportCallbacks).floatValue * AndroidUtilities.dp(54.0f);
                int measuredWidth = getMeasuredWidth();
                ChatActivityBlurredRoundButton chatActivityBlurredRoundButton2 = (ChatActivityBlurredRoundButton) fullyDrawnReporter3.lock;
                chatActivityBlurredRoundButton2.setTranslationX(((measuredWidth - chatActivityBlurredRoundButton2.getMeasuredWidth()) - AndroidUtilities.dp(1.0f)) - this.totalWidthRight);
                this.totalWidthRight += fDp2;
            }
        }
        if (this.totalVisibilityFactor < 1.0f) {
            FullyDrawnReporter fullyDrawnReporter4 = fullyDrawnReporterArr[iArr[0]];
            if (fullyDrawnReporter4 != null) {
                ChatActivityBlurredRoundButton chatActivityBlurredRoundButton3 = (ChatActivityBlurredRoundButton) fullyDrawnReporter4.lock;
                chatActivityBlurredRoundButton3.setTranslationX(chatActivityBlurredRoundButton3.getTranslationX() - ((1.0f - this.totalVisibilityFactor) * this.totalWidthLeft));
            }
            for (int i3 = 0; i3 < 4; i3++) {
                FullyDrawnReporter fullyDrawnReporter5 = fullyDrawnReporterArr[iArr2[i3]];
                if (fullyDrawnReporter5 != null) {
                    ChatActivityBlurredRoundButton chatActivityBlurredRoundButton4 = (ChatActivityBlurredRoundButton) fullyDrawnReporter5.lock;
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
            for (int i4 = 0; i4 < getContainer().getChildCount(); i4++) {
                View childAt = getContainer().getChildAt(i4);
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
            float f5 = this.totalWidthLeft;
            float f6 = this.totalWidthRight;
            ChatInputViewsContainer chatInputViewsContainer = ((ChatActivity$$ExternalSyntheticLambda50) onButtonsTotalWidthChanged).f$0.chatInputViewsContainer;
            chatInputViewsContainer.inputBubbleOffsetLeft = f5;
            chatInputViewsContainer.inputBubbleOffsetRight = f6;
            chatInputViewsContainer.invalidate();
        }
    }

    public final void checkContainerPaddings(boolean z) {
        int iDp = AndroidUtilities.dp(7.0f);
        int iDp2 = AndroidUtilities.dp(7.0f);
        int i = buttonsOrderLeft[0];
        FullyDrawnReporter[] fullyDrawnReporterArr = this.buttonHolders;
        FullyDrawnReporter fullyDrawnReporter = fullyDrawnReporterArr[i];
        if (fullyDrawnReporter != null) {
            iDp += ((BoolAnimator) fullyDrawnReporter.onReportCallbacks).value ? AndroidUtilities.dp(54.0f) : 0;
        }
        int[] iArr = buttonsOrderRight;
        for (int i2 = 0; i2 < 4; i2++) {
            FullyDrawnReporter fullyDrawnReporter2 = fullyDrawnReporterArr[iArr[i2]];
            if (fullyDrawnReporter2 != null) {
                iDp2 += ((BoolAnimator) fullyDrawnReporter2.onReportCallbacks).value ? AndroidUtilities.dp(54.0f) : 0;
            }
        }
        FrameLayout frameLayout = this.container;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams();
        if (marginLayoutParams.leftMargin == iDp && marginLayoutParams.rightMargin == iDp2) {
            return;
        }
        marginLayoutParams.leftMargin = iDp;
        marginLayoutParams.rightMargin = iDp2;
        if (z) {
            frameLayout.requestLayout();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i = (int) (this.totalVisibilityFactor * 255.0f * this.animatorCenterAccentBackground.floatValue);
        if (i > 0) {
            RectF rectF = tmpRect;
            rectF.set(this.totalWidthLeft + AndroidUtilities.dp(10.0f), AndroidUtilities.dp(9.0f), (getMeasuredWidth() - AndroidUtilities.dp(10.0f)) - this.totalWidthRight, getMeasuredHeight() - AndroidUtilities.dp(9.0f));
            Paint paint = this.backgroundAccentPaint;
            paint.setColor(this.accentColor);
            paint.setAlpha(i);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f), paint);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
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

    public final void makeViewWrapContent(VoIPFragment.AnonymousClass5 anonymousClass5) {
        this.wrapContentButtons.add(anonymousClass5);
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
        FullyDrawnReporter fullyDrawnReporter;
        HintView2 hintView2;
        if (i == 99 || i == 100) {
            invalidate();
        }
        int i2 = i >> 16;
        int i3 = i & 65535;
        if (i2 >= 0) {
            FullyDrawnReporter[] fullyDrawnReporterArr = this.buttonHolders;
            if (i2 >= fullyDrawnReporterArr.length || (fullyDrawnReporter = fullyDrawnReporterArr[i2]) == null || i3 != 1 || !((BoolAnimator) fullyDrawnReporter.onReportCallbacks).value) {
                return;
            }
            ChatActivity$$ExternalSyntheticLambda50 chatActivity$$ExternalSyntheticLambda50 = this.onButtonFullyVisible[i2];
            if (chatActivity$$ExternalSyntheticLambda50 != null) {
                boolean z = fullyDrawnReporter.reportedFullyDrawn;
                final ChatActivityBlurredRoundButton chatActivityBlurredRoundButton = (ChatActivityBlurredRoundButton) fullyDrawnReporter.lock;
                switch (chatActivity$$ExternalSyntheticLambda50.$r8$classId) {
                    case 24:
                        final ChatActivity chatActivity = chatActivity$$ExternalSyntheticLambda50.f$0;
                        if (chatActivity.bottomGiftHintView == null && !z && (((hintView2 = chatActivity.bottomSuggestHintView) == null || !hintView2.shown) && HintsController$Hint.ChannelGiftHint.show())) {
                            final int i4 = 1;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i4) {
                                        case 0:
                                            ChatActivity chatActivity2 = chatActivity;
                                            if (chatActivity2.getParentActivity() != null) {
                                                WindowInsetsCompat windowInsetsCompat = chatActivity2.windowInsetsStateHolder.lastInsets;
                                                float f2 = (windowInsetsCompat != null ? windowInsetsCompat.mImpl.getInsets(2) : Insets.NONE).bottom / AndroidUtilities.density;
                                                float width = chatActivity2.contentView.getWidth();
                                                ChatActivityBlurredRoundButton chatActivityBlurredRoundButton2 = chatActivityBlurredRoundButton;
                                                float width2 = ((chatActivityBlurredRoundButton2.getWidth() / 2.0f) + (width - (chatActivityBlurredRoundButton2.getX() + chatActivityBlurredRoundButton2.getWidth()))) / AndroidUtilities.density;
                                                HintView2 hintView3 = new HintView2(chatActivity2.getParentActivity(), 3);
                                                chatActivity2.bottomSuggestHintView = hintView3;
                                                hintView3.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                chatActivity2.bottomSuggestHintView.setMultilineText(false);
                                                HintView2 hintView4 = chatActivity2.bottomSuggestHintView;
                                                String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                if (hintView4.getMeasuredWidth() < 0) {
                                                    hintView4.textToSet = string;
                                                } else {
                                                    hintView4.textDrawable.setText(string, !LocaleController.isRTL, true);
                                                }
                                                chatActivity2.bottomSuggestHintView.setJoint(1.0f, (-width2) + 7.33f);
                                                chatActivity2.contentView.addView(chatActivity2.bottomSuggestHintView, LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f2 + 50.0f));
                                                HintView2 hintView5 = chatActivity2.bottomSuggestHintView;
                                                hintView5.onHidden = new ChatActivity$$ExternalSyntheticLambda22(chatActivity2, 17);
                                                hintView5.show();
                                                HintsController$Hint.ChannelSuggestHint.increment();
                                                break;
                                            }
                                            break;
                                        default:
                                            ChatActivity chatActivity3 = chatActivity;
                                            if (chatActivity3.getParentActivity() != null) {
                                                WindowInsetsCompat windowInsetsCompat2 = chatActivity3.windowInsetsStateHolder.lastInsets;
                                                float f3 = (windowInsetsCompat2 != null ? windowInsetsCompat2.mImpl.getInsets(2) : Insets.NONE).bottom / AndroidUtilities.density;
                                                float width3 = chatActivity3.contentView.getWidth();
                                                ChatActivityBlurredRoundButton chatActivityBlurredRoundButton3 = chatActivityBlurredRoundButton;
                                                float width4 = ((chatActivityBlurredRoundButton3.getWidth() / 2.0f) + (width3 - (chatActivityBlurredRoundButton3.getX() + chatActivityBlurredRoundButton3.getWidth()))) / AndroidUtilities.density;
                                                HintView2 hintView6 = new HintView2(chatActivity3.getParentActivity(), 3);
                                                chatActivity3.bottomGiftHintView = hintView6;
                                                hintView6.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                chatActivity3.bottomGiftHintView.setMultilineText(false);
                                                chatActivity3.bottomGiftHintView.setText(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                chatActivity3.bottomGiftHintView.setJoint(1.0f, (-width4) + 7.33f);
                                                chatActivity3.contentView.addView(chatActivity3.bottomGiftHintView, LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f3 + 50.0f));
                                                HintView2 hintView7 = chatActivity3.bottomGiftHintView;
                                                hintView7.onHidden = new ChatActivity$$ExternalSyntheticLambda22(chatActivity3, 28);
                                                hintView7.show();
                                                HintsController$Hint.ChannelGiftHint.increment();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, 400L);
                        }
                        break;
                    default:
                        final ChatActivity chatActivity2 = chatActivity$$ExternalSyntheticLambda50.f$0;
                        if (chatActivity2.bottomSuggestHintView == null && !z && HintsController$Hint.ChannelSuggestHint.show()) {
                            final int i5 = 0;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i5) {
                                        case 0:
                                            ChatActivity chatActivity3 = chatActivity2;
                                            if (chatActivity3.getParentActivity() != null) {
                                                WindowInsetsCompat windowInsetsCompat = chatActivity3.windowInsetsStateHolder.lastInsets;
                                                float f2 = (windowInsetsCompat != null ? windowInsetsCompat.mImpl.getInsets(2) : Insets.NONE).bottom / AndroidUtilities.density;
                                                float width = chatActivity3.contentView.getWidth();
                                                ChatActivityBlurredRoundButton chatActivityBlurredRoundButton2 = chatActivityBlurredRoundButton;
                                                float width2 = ((chatActivityBlurredRoundButton2.getWidth() / 2.0f) + (width - (chatActivityBlurredRoundButton2.getX() + chatActivityBlurredRoundButton2.getWidth()))) / AndroidUtilities.density;
                                                HintView2 hintView3 = new HintView2(chatActivity3.getParentActivity(), 3);
                                                chatActivity3.bottomSuggestHintView = hintView3;
                                                hintView3.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                chatActivity3.bottomSuggestHintView.setMultilineText(false);
                                                HintView2 hintView4 = chatActivity3.bottomSuggestHintView;
                                                String string = LocaleController.getString(R.string.Suggest2ChannelSendHint);
                                                if (hintView4.getMeasuredWidth() < 0) {
                                                    hintView4.textToSet = string;
                                                } else {
                                                    hintView4.textDrawable.setText(string, !LocaleController.isRTL, true);
                                                }
                                                chatActivity3.bottomSuggestHintView.setJoint(1.0f, (-width2) + 7.33f);
                                                chatActivity3.contentView.addView(chatActivity3.bottomSuggestHintView, LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f2 + 50.0f));
                                                HintView2 hintView5 = chatActivity3.bottomSuggestHintView;
                                                hintView5.onHidden = new ChatActivity$$ExternalSyntheticLambda22(chatActivity3, 17);
                                                hintView5.show();
                                                HintsController$Hint.ChannelSuggestHint.increment();
                                                break;
                                            }
                                            break;
                                        default:
                                            ChatActivity chatActivity4 = chatActivity2;
                                            if (chatActivity4.getParentActivity() != null) {
                                                WindowInsetsCompat windowInsetsCompat2 = chatActivity4.windowInsetsStateHolder.lastInsets;
                                                float f3 = (windowInsetsCompat2 != null ? windowInsetsCompat2.mImpl.getInsets(2) : Insets.NONE).bottom / AndroidUtilities.density;
                                                float width3 = chatActivity4.contentView.getWidth();
                                                ChatActivityBlurredRoundButton chatActivityBlurredRoundButton3 = chatActivityBlurredRoundButton;
                                                float width4 = ((chatActivityBlurredRoundButton3.getWidth() / 2.0f) + (width3 - (chatActivityBlurredRoundButton3.getX() + chatActivityBlurredRoundButton3.getWidth()))) / AndroidUtilities.density;
                                                HintView2 hintView6 = new HintView2(chatActivity4.getParentActivity(), 3);
                                                chatActivity4.bottomGiftHintView = hintView6;
                                                hintView6.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                                                chatActivity4.bottomGiftHintView.setMultilineText(false);
                                                chatActivity4.bottomGiftHintView.setText(LocaleController.getString(R.string.Gift2ChannelSendHint));
                                                chatActivity4.bottomGiftHintView.setJoint(1.0f, (-width4) + 7.33f);
                                                chatActivity4.contentView.addView(chatActivity4.bottomGiftHintView, LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, f3 + 50.0f));
                                                HintView2 hintView7 = chatActivity4.bottomGiftHintView;
                                                hintView7.onHidden = new ChatActivity$$ExternalSyntheticLambda22(chatActivity4, 28);
                                                hintView7.show();
                                                HintsController$Hint.ChannelGiftHint.increment();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            }, 400L);
                        }
                        break;
                }
            }
            fullyDrawnReporter.reportedFullyDrawn = true;
        }
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
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
            FullyDrawnReporter[] fullyDrawnReporterArr = this.buttonHolders;
            if (i2 >= fullyDrawnReporterArr.length || fullyDrawnReporterArr[i2] == null || i3 != 1) {
                return;
            }
            checkContainerPaddings(true);
            checkButtonsPositionsAndVisibility();
            invalidate();
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        checkButtonsPositionsAndVisibility();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        checkContainerPaddings(false);
        super.onMeasure(i, i2);
        checkButtonsPositionsAndVisibility();
    }

    public void setAccentColor(int i) {
        this.accentColor = i;
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

    public final void showButton(int i, boolean z, boolean z2) {
        FullyDrawnReporter fullyDrawnReporter;
        if (i >= 0) {
            FullyDrawnReporter[] fullyDrawnReporterArr = this.buttonHolders;
            if (i < fullyDrawnReporterArr.length && ((fullyDrawnReporter = fullyDrawnReporterArr[i]) != null || z)) {
                if (fullyDrawnReporter == null) {
                    BoolAnimator boolAnimator = new BoolAnimator((i << 16) | 1, this, CubicBezierInterpolator.EASE_OUT_QUINT, 300L, false);
                    ChatActivityBlurredRoundButton chatActivityBlurredRoundButtonCreate = ChatActivityBlurredRoundButton.create(getContext(), this.blurredBackgroundDrawableViewFactory, this.colorProvider, this.resourcesProvider, buttonIcons[i], 48);
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
                    chatActivityBlurredRoundButtonCreate.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda68(this, i, 10));
                    addView(chatActivityBlurredRoundButtonCreate, LayoutHelper.createFrame(56.0f, 56));
                    FullyDrawnReporter fullyDrawnReporter2 = new FullyDrawnReporter();
                    fullyDrawnReporter2.lock = chatActivityBlurredRoundButtonCreate;
                    fullyDrawnReporter2.onReportCallbacks = boolAnimator;
                    fullyDrawnReporterArr[i] = fullyDrawnReporter2;
                    checkButtonsPositionsAndVisibility();
                }
                ((BoolAnimator) fullyDrawnReporterArr[i].onReportCallbacks).setValue(z, z2);
            }
        }
    }

    public final void updateWrappingVisible(boolean z) {
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
