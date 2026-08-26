package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.ActionBarContainer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.PremiumGradient;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.Text;
import org.telegram.ui.FilterCreateActivity;
import org.telegram.ui.SettingsActivity;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.bots.BotWebViewSheet;

public class TextCell extends FrameLayout {
    public boolean attached;
    public int changeProgressStartDelay;
    public Switch checkBox;
    public boolean drawLoading;
    public float drawLoadingProgress;
    public AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable emojiDrawable;
    public int heightDp;
    public int imageLeft;
    public final RLottieImageView imageView;
    public boolean inDialogs;
    public boolean incrementLoadingProgress;
    public int lastWidth;
    public int leftPadding;
    public float loadingProgress;
    public int loadingSize;
    public boolean needDivider;
    public int offsetFromImage;
    public Paint paint;
    public boolean prioritizeTitleOverValue;
    public final Theme.ResourcesProvider resourcesProvider;
    public final SimpleTextView subtitleView;
    public final SimpleTextView textView;
    public final ImageView valueImageView;
    public final SimpleTextView valueSpoilersTextView;
    public CharSequence valueText;
    public final AnimatedTextView valueTextView;

    public final class AnonymousClass1 implements View.OnAttachStateChangeListener {
        public final int $r8$classId;
        public final ImageReceiver val$imageReceiver;

        public AnonymousClass1(ImageReceiver imageReceiver, int i) {
            this.$r8$classId = i;
            this.val$imageReceiver = imageReceiver;
        }

        @Override
        public final void onViewAttachedToWindow(View view) {
            switch (this.$r8$classId) {
                case 0:
                    this.val$imageReceiver.onAttachedToWindow();
                    break;
                default:
                    this.val$imageReceiver.onAttachedToWindow();
                    break;
            }
        }

        @Override
        public final void onViewDetachedFromWindow(View view) {
            switch (this.$r8$classId) {
                case 0:
                    this.val$imageReceiver.onDetachedFromWindow();
                    break;
                default:
                    this.val$imageReceiver.onDetachedFromWindow();
                    break;
            }
        }
    }

    public final class AnonymousClass2 extends Drawable {
        public final int $r8$classId;
        public final Object val$imageReceiver;

        public AnonymousClass2(Object obj, int i) {
            this.$r8$classId = i;
            this.val$imageReceiver = obj;
        }

        @Override
        public final void draw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    Rect bounds = getBounds();
                    ImageReceiver imageReceiver = (ImageReceiver) this.val$imageReceiver;
                    imageReceiver.setImageCoords(bounds);
                    imageReceiver.draw(canvas);
                    break;
                case 1:
                    ActionBarContainer actionBarContainer = (ActionBarContainer) this.val$imageReceiver;
                    if (actionBarContainer.mIsSplit) {
                        Drawable drawable = actionBarContainer.mSplitBackground;
                        if (drawable != null) {
                            drawable.draw(canvas);
                        }
                        break;
                    } else {
                        Drawable drawable2 = actionBarContainer.mBackground;
                        if (drawable2 != null) {
                            drawable2.draw(canvas);
                        }
                        Drawable drawable3 = actionBarContainer.mStackedBackground;
                        if (drawable3 != null && actionBarContainer.mIsStacked) {
                            drawable3.draw(canvas);
                            break;
                        }
                    }
                    break;
                case 2:
                    Rect bounds2 = getBounds();
                    PremiumGradient.PremiumGradientTools premiumGradientTools = (PremiumGradient.PremiumGradientTools) this.val$imageReceiver;
                    premiumGradientTools.getClass();
                    premiumGradientTools.gradientMatrix(bounds2.left, 0.0f, bounds2.top, bounds2.right, 0.0f, bounds2.bottom);
                    canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, premiumGradientTools.paint);
                    break;
                case 3:
                    canvas.save();
                    Drawable drawable4 = (Drawable) this.val$imageReceiver;
                    if (drawable4.getBounds() != null) {
                        canvas.scale(0.8333333f, 0.8333333f, drawable4.getBounds().centerX(), drawable4.getBounds().centerY());
                    }
                    drawable4.draw(canvas);
                    canvas.restore();
                    break;
                case 4:
                    canvas.save();
                    canvas.translate(getBounds().left, getBounds().top);
                    ((StoryRecorder.AnonymousClass7) this.val$imageReceiver).draw(canvas);
                    canvas.restore();
                    break;
                case 5:
                    Rect bounds3 = getBounds();
                    canvas.drawCircle(bounds3.centerX(), bounds3.centerY(), AndroidUtilities.dp(18.0f), ((Switch) this.val$imageReceiver).ripplePaint);
                    break;
                case 6:
                    canvas.save();
                    HintView2 hintView2 = (HintView2) this.val$imageReceiver;
                    canvas.drawPath(hintView2.path, hintView2.cutSelectorPaint);
                    canvas.restore();
                    break;
                case 7:
                    canvas.save();
                    canvas.translate(0.0f, AndroidUtilities.dp(1.0f));
                    BotWebViewSheet botWebViewSheet = (BotWebViewSheet) this.val$imageReceiver;
                    botWebViewSheet.verifiedDrawable.setBounds(getBounds());
                    botWebViewSheet.verifiedDrawable.draw(canvas);
                    canvas.restore();
                    break;
                default:
                    ((Text) this.val$imageReceiver).draw(getBounds().centerX() - (((Text) this.val$imageReceiver).width / 2.0f), getBounds().centerY(), 1.0f, Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false), canvas);
                    break;
            }
        }

        @Override
        public int getIntrinsicHeight() {
            switch (this.$r8$classId) {
                case 0:
                    return AndroidUtilities.dp(30.0f);
                case 4:
                    return ((StoryRecorder.AnonymousClass7) this.val$imageReceiver).getHeight();
                case 7:
                    return AndroidUtilities.dp(20.0f);
                default:
                    return super.getIntrinsicHeight();
            }
        }

        @Override
        public int getIntrinsicWidth() {
            switch (this.$r8$classId) {
                case 0:
                    return AndroidUtilities.dp(30.0f);
                case 4:
                    return ((StoryRecorder.AnonymousClass7) this.val$imageReceiver).getWidth();
                case 7:
                    return AndroidUtilities.dp(20.0f);
                default:
                    return super.getIntrinsicWidth();
            }
        }

        @Override
        public final int getOpacity() {
            switch (this.$r8$classId) {
                case 0:
                    return -2;
                case 1:
                    return 0;
                case 2:
                    return -2;
                case 3:
                    return ((Drawable) this.val$imageReceiver).getOpacity();
                case 4:
                    return -2;
                case 5:
                    return 0;
                case 6:
                    return -2;
                case 7:
                    return -2;
                default:
                    return -2;
            }
        }

        @Override
        public void getOutline(Outline outline) {
            switch (this.$r8$classId) {
                case 1:
                    ActionBarContainer actionBarContainer = (ActionBarContainer) this.val$imageReceiver;
                    if (!actionBarContainer.mIsSplit) {
                        Drawable drawable = actionBarContainer.mBackground;
                        if (drawable != null) {
                            drawable.getOutline(outline);
                        }
                    } else if (actionBarContainer.mSplitBackground != null) {
                        actionBarContainer.mBackground.getOutline(outline);
                    }
                    break;
                default:
                    super.getOutline(outline);
                    break;
            }
        }

        @Override
        public final void setAlpha(int i) {
            switch (this.$r8$classId) {
                case 0:
                    ((ImageReceiver) this.val$imageReceiver).setAlpha(i / 255.0f);
                    break;
                case 3:
                    ((Drawable) this.val$imageReceiver).setAlpha(i);
                    break;
                case 7:
                    ((BotWebViewSheet) this.val$imageReceiver).verifiedDrawable.setAlpha(i);
                    break;
            }
        }

        @Override
        public void setBounds(Rect rect) {
            switch (this.$r8$classId) {
                case 3:
                    ((Drawable) this.val$imageReceiver).setBounds(rect);
                    break;
                default:
                    super.setBounds(rect);
                    break;
            }
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
            switch (this.$r8$classId) {
                case 0:
                    ((ImageReceiver) this.val$imageReceiver).setColorFilter(colorFilter);
                    break;
                case 3:
                    ((Drawable) this.val$imageReceiver).setColorFilter(colorFilter);
                    break;
                case 7:
                    ((BotWebViewSheet) this.val$imageReceiver).verifiedDrawable.setColorFilter(colorFilter);
                    break;
            }
        }

        public AnonymousClass2(String str) {
            this.$r8$classId = 8;
            this.val$imageReceiver = new Text(str.substring(0, !str.isEmpty() ? 1 : 0), 14.0f, AndroidUtilities.bold());
        }

        @Override
        public void setBounds(int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 3:
                    ((Drawable) this.val$imageReceiver).setBounds(i, i2, i3, i4);
                    break;
                default:
                    super.setBounds(i, i2, i3, i4);
                    break;
            }
        }

        public AnonymousClass2(ActionBarContainer actionBarContainer) {
            this.$r8$classId = 1;
            this.val$imageReceiver = actionBarContainer;
        }

        private final void setAlpha$androidx$appcompat$widget$ActionBarBackgroundDrawable(int i) {
        }

        private final void setAlpha$org$telegram$ui$Cells$GroupCreateUserCell$2(int i) {
        }

        private final void setAlpha$org$telegram$ui$Components$Paint$Views$StoryLinkPreviewDialog$8(int i) {
        }

        private final void setAlpha$org$telegram$ui$Components$Switch$1(int i) {
        }

        private final void setAlpha$org$telegram$ui$Stories$recorder$HintView2$1(int i) {
        }

        private final void setAlpha$org$telegram$ui$web$WebBrowserSettings$WebsiteView$2(int i) {
        }

        private final void setColorFilter$androidx$appcompat$widget$ActionBarBackgroundDrawable(ColorFilter colorFilter) {
        }

        private final void setColorFilter$org$telegram$ui$Cells$GroupCreateUserCell$2(ColorFilter colorFilter) {
        }

        private final void setColorFilter$org$telegram$ui$Components$Paint$Views$StoryLinkPreviewDialog$8(ColorFilter colorFilter) {
        }

        private final void setColorFilter$org$telegram$ui$Components$Switch$1(ColorFilter colorFilter) {
        }

        private final void setColorFilter$org$telegram$ui$Stories$recorder$HintView2$1(ColorFilter colorFilter) {
        }

        private final void setColorFilter$org$telegram$ui$web$WebBrowserSettings$WebsiteView$2(ColorFilter colorFilter) {
        }
    }

    public TextCell(Context context) {
        this(23, context, null, false, false);
    }

    public static SpannableStringBuilder applyNewSpan(String str) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.append((CharSequence) "  d");
        FilterCreateActivity.NewSpan newSpan = new FilterCreateActivity.NewSpan();
        newSpan.color = Theme.getColor(null, Theme.key_premiumGradient1, false);
        spannableStringBuilder.setSpan(newSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        return spannableStringBuilder;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f;
        float f2;
        if (this.drawLoading || this.drawLoadingProgress != 0.0f) {
            if (this.paint == null) {
                Paint paint = new Paint(1);
                this.paint = paint;
                paint.setColor(Theme.getColor(Theme.key_dialogSearchBackground, this.resourcesProvider));
            }
            if (this.incrementLoadingProgress) {
                float f3 = this.loadingProgress + 0.016f;
                this.loadingProgress = f3;
                if (f3 > 1.0f) {
                    this.loadingProgress = 1.0f;
                    this.incrementLoadingProgress = false;
                }
            } else {
                float f4 = this.loadingProgress - 0.016f;
                this.loadingProgress = f4;
                if (f4 < 0.0f) {
                    this.loadingProgress = 0.0f;
                    this.incrementLoadingProgress = true;
                }
            }
            int i = this.changeProgressStartDelay;
            if (i > 0) {
                this.changeProgressStartDelay = i - 15;
            } else {
                boolean z = this.drawLoading;
                if (z) {
                    float f5 = this.drawLoadingProgress;
                    if (f5 != 1.0f) {
                        float f6 = f5 + 0.10666667f;
                        this.drawLoadingProgress = f6;
                        if (f6 > 1.0f) {
                            this.drawLoadingProgress = 1.0f;
                        }
                    } else if (!z) {
                        f = this.drawLoadingProgress;
                        if (f != 0.0f) {
                            f2 = f - 0.10666667f;
                            this.drawLoadingProgress = f2;
                            if (f2 < 0.0f) {
                                this.drawLoadingProgress = 0.0f;
                            }
                        }
                    }
                } else if (!z) {
                    f = this.drawLoadingProgress;
                    if (f != 0.0f) {
                        f2 = f - 0.10666667f;
                        this.drawLoadingProgress = f2;
                        if (f2 < 0.0f) {
                            this.drawLoadingProgress = 0.0f;
                        }
                    }
                }
            }
            this.paint.setAlpha((int) (((this.loadingProgress * 0.4f) + 0.6f) * this.drawLoadingProgress * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((getMeasuredWidth() - AndroidUtilities.dp(21.0f)) - AndroidUtilities.dp(this.loadingSize), measuredHeight - AndroidUtilities.dp(3.0f), getMeasuredWidth() - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(3.0f) + measuredHeight);
            if (LocaleController.isRTL) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.paint);
            invalidate();
        }
        AnimatedTextView animatedTextView = this.valueTextView;
        float f7 = 1.0f - this.drawLoadingProgress;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        animatedTextView.setAlpha(f7 * (swapAnimatedEmojiDrawable == null ? 1.0f : 1.0f - swapAnimatedEmojiDrawable.isNotEmpty()) * (isEnabled() ? 1.0f : 0.5f));
        SimpleTextView simpleTextView = this.valueSpoilersTextView;
        float f8 = 1.0f - this.drawLoadingProgress;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.emojiDrawable;
        simpleTextView.setAlpha(f8 * (swapAnimatedEmojiDrawable2 == null ? 1.0f : 1.0f - swapAnimatedEmojiDrawable2.isNotEmpty()) * (isEnabled() ? 1.0f : 0.5f));
        super.dispatchDraw(canvas);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable3 = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable3 != null) {
            swapAnimatedEmojiDrawable3.setBounds((getWidth() - this.emojiDrawable.size) - AndroidUtilities.dp(18.0f), (getHeight() - this.emojiDrawable.size) / 2, getWidth() - AndroidUtilities.dp(18.0f), (getHeight() + this.emojiDrawable.size) / 2);
            this.emojiDrawable.draw(canvas);
        }
    }

    public Switch getCheckBox() {
        return this.checkBox;
    }

    public RLottieImageView getImageView() {
        return this.imageView;
    }

    public SimpleTextView getTextView() {
        return this.textView;
    }

    public ImageView getValueImageView() {
        return this.valueImageView;
    }

    public AnimatedTextView getValueTextView() {
        return this.valueTextView;
    }

    public final boolean isChecked() {
        Switch r0 = this.checkBox;
        return r0 != null && r0.isChecked;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.attach();
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.detach();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f;
        float fDp;
        int iDp;
        if (this.needDivider) {
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            Paint paint = resourcesProvider != null ? resourcesProvider.getPaint("paintDivider") : null;
            if (paint == null) {
                paint = Theme.dividerPaint;
            }
            Paint paint2 = paint;
            boolean z = LocaleController.isRTL;
            RLottieImageView rLottieImageView = this.imageView;
            float f2 = 20.0f;
            if (z) {
                fDp = 0.0f;
            } else {
                if (rLottieImageView.getVisibility() == 0) {
                    f = this.inDialogs ? 72 : 58;
                } else {
                    f = 20.0f;
                }
                fDp = AndroidUtilities.dp(f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                if (rLottieImageView.getVisibility() == 0) {
                    f2 = this.inDialogs ? 72 : 58;
                }
                iDp = AndroidUtilities.dp(f2);
            } else {
                iDp = 0;
            }
            canvas.drawLine(fDp, measuredHeight, measuredWidth - iDp, getMeasuredHeight() - 1, paint2);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        SimpleTextView simpleTextView = this.textView;
        CharSequence text = simpleTextView.getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        AnimatedTextView animatedTextView = this.valueTextView;
        if (!zIsEmpty) {
            CharSequence text2 = animatedTextView.getText();
            if (!TextUtils.isEmpty(text2)) {
                text = TextUtils.concat(text, ": ", text2);
            }
        }
        if (this.checkBox != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(this.checkBox.isChecked);
            StringBuilder sb = new StringBuilder();
            sb.append(simpleTextView.getText());
            if (!TextUtils.isEmpty(animatedTextView.getText())) {
                sb.append('\n');
                sb.append(animatedTextView.getText());
            }
            accessibilityNodeInfo.setContentDescription(sb);
        } else if (!TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(text);
        }
        accessibilityNodeInfo.addAction(16);
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iDp;
        int i5 = i4 - i2;
        int i6 = i3 - i;
        SimpleTextView simpleTextView = this.valueSpoilersTextView;
        int textHeight = simpleTextView.getTextHeight();
        AnimatedTextView animatedTextView = this.valueTextView;
        int iMax = ((i5 - Math.max(textHeight, animatedTextView.getTextHeight())) / 2) + 1;
        int iDp2 = LocaleController.isRTL ? AndroidUtilities.dp(this.leftPadding - 6) : (i6 - animatedTextView.getMeasuredWidth()) - AndroidUtilities.dp(this.leftPadding - 6);
        if (this.prioritizeTitleOverValue && !LocaleController.isRTL) {
            iDp2 = (i6 - animatedTextView.getMeasuredWidth()) - AndroidUtilities.dp(this.leftPadding);
        }
        animatedTextView.layout(iDp2, iMax, animatedTextView.getMeasuredWidth() + iDp2, animatedTextView.getMeasuredHeight() + iMax);
        int iDp3 = LocaleController.isRTL ? AndroidUtilities.dp(this.leftPadding - 6) : (i6 - simpleTextView.getMeasuredWidth()) - AndroidUtilities.dp(this.leftPadding - 6);
        simpleTextView.layout(iDp3, iMax, simpleTextView.getMeasuredWidth() + iDp3, simpleTextView.getMeasuredHeight() + iMax);
        boolean z2 = LocaleController.isRTL;
        RLottieImageView rLottieImageView = this.imageView;
        SimpleTextView simpleTextView2 = this.textView;
        if (z2) {
            iDp = (getMeasuredWidth() - simpleTextView2.getMeasuredWidth()) - AndroidUtilities.dp(rLottieImageView.getVisibility() == 0 ? this.offsetFromImage : this.leftPadding);
        } else {
            iDp = AndroidUtilities.dp(rLottieImageView.getVisibility() == 0 ? this.offsetFromImage : this.leftPadding);
        }
        SimpleTextView simpleTextView3 = this.subtitleView;
        if (simpleTextView3.getVisibility() == 0) {
            float f = this.heightDp > 50 ? 4 : 2;
            int iDp4 = AndroidUtilities.dp(1.0f) + OKLCH.m$2(f, (i5 - simpleTextView2.getTextHeight()) - simpleTextView3.getTextHeight(), 2);
            simpleTextView2.layout(iDp, iDp4, simpleTextView2.getMeasuredWidth() + iDp, simpleTextView2.getMeasuredHeight() + iDp4);
            int iDp5 = AndroidUtilities.dp(f) + simpleTextView2.getTextHeight() + iDp4;
            simpleTextView3.layout(iDp, iDp5, simpleTextView3.getMeasuredWidth() + iDp, simpleTextView3.getMeasuredHeight() + iDp5);
        } else {
            int iDp6 = AndroidUtilities.dp(1.0f) + ((i5 - simpleTextView2.getTextHeight()) / 2);
            simpleTextView2.layout(iDp, iDp6, simpleTextView2.getMeasuredWidth() + iDp, simpleTextView2.getMeasuredHeight() + iDp6);
        }
        if (rLottieImageView.getVisibility() == 0) {
            int iDp7 = AndroidUtilities.dp(1.0f) + ((((i5 - rLottieImageView.getMeasuredHeight()) / 2) + AndroidUtilities.dp(this.heightDp > 50 ? 0.0f : 2.0f)) - rLottieImageView.getPaddingTop());
            int iDp8 = !LocaleController.isRTL ? AndroidUtilities.dp(this.imageLeft) : (i6 - rLottieImageView.getMeasuredWidth()) - AndroidUtilities.dp(this.imageLeft);
            rLottieImageView.layout(iDp8, iDp7, rLottieImageView.getMeasuredWidth() + iDp8, rLottieImageView.getMeasuredHeight() + iDp7);
        }
        ImageView imageView = this.valueImageView;
        if (imageView.getVisibility() == 0) {
            int iDp9 = AndroidUtilities.dp(1.0f) + ((i5 - imageView.getMeasuredHeight()) / 2);
            int iDp10 = LocaleController.isRTL ? AndroidUtilities.dp(23.0f) : (i6 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(23.0f);
            imageView.layout(iDp10, iDp9, imageView.getMeasuredWidth() + iDp10, imageView.getMeasuredHeight() + iDp9);
        }
        Switch r9 = this.checkBox;
        if (r9 == null || r9.getVisibility() != 0) {
            return;
        }
        int measuredHeight = (i5 - this.checkBox.getMeasuredHeight()) / 2;
        int iDp11 = LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : (i6 - this.checkBox.getMeasuredWidth()) - AndroidUtilities.dp(22.0f);
        Switch r10 = this.checkBox;
        r10.layout(iDp11, measuredHeight, r10.getMeasuredWidth() + iDp11, this.checkBox.getMeasuredHeight() + measuredHeight);
    }

    @Override
    public void onMeasure(int i, int i2) {
        CharSequence charSequence;
        int size = View.MeasureSpec.getSize(i);
        int iDp = AndroidUtilities.dp(this.heightDp);
        int i3 = this.lastWidth;
        AnimatedTextView animatedTextView = this.valueTextView;
        if (i3 != 0 && i3 != size && (charSequence = this.valueText) != null) {
            animatedTextView.setText(TextUtils.ellipsize(charSequence, animatedTextView.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END), false, true);
        }
        this.lastWidth = size;
        boolean z = this.prioritizeTitleOverValue;
        SimpleTextView simpleTextView = this.subtitleView;
        SimpleTextView simpleTextView2 = this.valueSpoilersTextView;
        SimpleTextView simpleTextView3 = this.textView;
        if (z) {
            simpleTextView3.measure(OKLCH.m(size, this.leftPadding + 71, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            simpleTextView.measure(OKLCH.m(size, this.leftPadding + 71, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            animatedTextView.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.leftPadding + 103)) - simpleTextView3.getTextWidth(), LocaleController.isRTL ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            simpleTextView2.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.leftPadding + 103)) - simpleTextView3.getTextWidth(), LocaleController.isRTL ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        } else {
            animatedTextView.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(this.leftPadding), LocaleController.isRTL ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            simpleTextView2.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(this.leftPadding), LocaleController.isRTL ? Integer.MIN_VALUE : 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            int iMax = Math.max(animatedTextView.getPaddingRight() + animatedTextView.getPaddingLeft() + ((int) Math.ceil(animatedTextView.drawable.getCurrentWidth())), simpleTextView2.getTextWidth());
            simpleTextView3.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (size - AndroidUtilities.dp(this.leftPadding + 71)) - iMax), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            simpleTextView.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(this.leftPadding + 71)) - iMax, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        RLottieImageView rLottieImageView = this.imageView;
        if (rLottieImageView.getVisibility() == 0) {
            rLottieImageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
        }
        ImageView imageView = this.valueImageView;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iDp, Integer.MIN_VALUE));
        }
        Switch r0 = this.checkBox;
        if (r0 != null) {
            r0.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
        }
        setMeasuredDimension(size, iDp + (this.needDivider ? 1 : 0));
    }

    public int processColor(int i) {
        return i;
    }

    public void setChecked(boolean z) {
        Switch r0 = this.checkBox;
        r0.setChecked(r0.drawIconType, z, true);
    }

    public final void setColorfulIcon(int i, int i2, int i3) {
        this.offsetFromImage = 52;
        RLottieImageView rLottieImageView = this.imageView;
        rLottieImageView.setVisibility(0);
        rLottieImageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        rLottieImageView.setTranslationX(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : -3.0f));
        rLottieImageView.setImageResource(i3);
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        boolean zIsDark = resourcesProvider != null ? resourcesProvider.isDark() : Theme.currentTheme.isDark();
        SettingsActivity.SettingCell.Background background = new SettingsActivity.SettingCell.Background();
        background.setColor(i, i2);
        background.border = zIsDark;
        rLottieImageView.setBackground(background);
    }

    public final void setColors(int i, int i2) {
        SimpleTextView simpleTextView = this.textView;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        simpleTextView.setTextColor(Theme.getColor(i2, resourcesProvider));
        simpleTextView.setTag(Integer.valueOf(i2));
        if (i >= 0) {
            RLottieImageView rLottieImageView = this.imageView;
            rLottieImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, resourcesProvider), PorterDuff.Mode.SRC_IN));
            rLottieImageView.setTag(Integer.valueOf(i));
        }
        updateColors();
    }

    public final void setDrawLoading(int i, boolean z, boolean z2) {
        this.drawLoading = z;
        this.loadingSize = i;
        if (!z2) {
            this.drawLoadingProgress = z ? 1.0f : 0.0f;
        }
        invalidate();
    }

    @Override
    public void setEnabled(boolean z) {
        setEnabled$1(z);
    }

    public final void setEnabled$1(boolean z) {
        super.setEnabled(z);
        Switch r0 = this.checkBox;
        if (r0 != null) {
            r0.setEnabled(z);
        }
        this.textView.animate().alpha(z ? 1.0f : 0.5f).start();
        this.subtitleView.animate().alpha(z ? 1.0f : 0.5f).start();
        this.valueTextView.animate().alpha(z ? 1.0f : 0.5f).start();
        this.valueSpoilersTextView.animate().alpha(z ? 1.0f : 0.5f).start();
    }

    public void setImageLeft(int i) {
        this.imageLeft = i;
    }

    public void setNeedDivider(boolean z) {
        if (this.needDivider != z) {
            this.needDivider = z;
            setWillNotDraw(!z);
            invalidate();
        }
    }

    public void setOffsetFromImage(int i) {
        this.offsetFromImage = i;
    }

    public void setPrioritizeTitleOverValue(boolean z) {
        if (this.prioritizeTitleOverValue != z) {
            this.prioritizeTitleOverValue = z;
            requestLayout();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        SimpleTextView simpleTextView = this.subtitleView;
        if (zIsEmpty) {
            simpleTextView.setVisibility(8);
        } else {
            simpleTextView.setVisibility(0);
            simpleTextView.setText(charSequence, false);
        }
    }

    public final void setText(CharSequence charSequence, boolean z) {
        this.imageLeft = 16;
        SimpleTextView simpleTextView = this.textView;
        simpleTextView.setText(charSequence, false);
        simpleTextView.setRightDrawable((Drawable) null);
        AnimatedTextView animatedTextView = this.valueTextView;
        this.valueText = null;
        animatedTextView.setText(null, false, true);
        this.imageView.setVisibility(8);
        animatedTextView.setVisibility(8);
        this.valueSpoilersTextView.setVisibility(8);
        this.valueImageView.setVisibility(8);
        this.needDivider = z;
        setWillNotDraw(!z);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.set((Drawable) null, false);
        }
    }

    public final void setTextAndCheck(CharSequence charSequence, boolean z, boolean z2) {
        this.imageLeft = 16;
        this.offsetFromImage = 58;
        SimpleTextView simpleTextView = this.textView;
        simpleTextView.setText(charSequence, false);
        simpleTextView.setRightDrawable((Drawable) null);
        this.imageView.setVisibility(8);
        this.valueImageView.setVisibility(8);
        this.needDivider = z2;
        Switch r6 = this.checkBox;
        if (r6 != null) {
            r6.setVisibility(0);
            Switch r7 = this.checkBox;
            r7.setChecked(r7.drawIconType, z, false);
        }
        setWillNotDraw(!this.needDivider);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.set((Drawable) null, false);
        }
    }

    public final void setTextAndCheckAndColorfulIcon(String str, boolean z, int i, int i2, boolean z2) {
        this.imageLeft = 16;
        this.offsetFromImage = 58;
        SimpleTextView simpleTextView = this.textView;
        simpleTextView.setText(str, false);
        simpleTextView.setRightDrawable((Drawable) null);
        this.valueTextView.setVisibility(8);
        this.valueSpoilersTextView.setVisibility(8);
        this.valueImageView.setVisibility(8);
        setColorfulIcon(i2, i2, i);
        if (this.checkBox == null) {
            Switch r13 = new Switch(getContext(), this.resourcesProvider);
            this.checkBox = r13;
            int i3 = Theme.key_switchTrack;
            int i4 = Theme.key_switchTrackChecked;
            int i5 = Theme.key_windowBackgroundWhite;
            r13.trackColorKey = i3;
            r13.trackCheckedColorKey = i4;
            r13.thumbColorKey = i5;
            r13.thumbCheckedColorKey = i5;
            addView(r13, LayoutHelper.createFrame(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        Switch r14 = this.checkBox;
        if (r14 != null) {
            r14.setVisibility(0);
            Switch r15 = this.checkBox;
            r15.setChecked(r15.drawIconType, z, false);
        }
        this.needDivider = z2;
        setWillNotDraw(!z2);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.set((Drawable) null, false);
        }
    }

    public final void setTextAndCheckAndIcon(int i, String str, boolean z) {
        this.imageLeft = 16;
        this.offsetFromImage = 58;
        SimpleTextView simpleTextView = this.textView;
        simpleTextView.setText(str, false);
        simpleTextView.setRightDrawable((Drawable) null);
        this.valueTextView.setVisibility(8);
        this.valueSpoilersTextView.setVisibility(8);
        this.valueImageView.setVisibility(8);
        Switch r0 = this.checkBox;
        if (r0 != null) {
            r0.setVisibility(0);
            Switch r1 = this.checkBox;
            r1.setChecked(r1.drawIconType, z, false);
        }
        RLottieImageView rLottieImageView = this.imageView;
        rLottieImageView.setVisibility(0);
        rLottieImageView.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        rLottieImageView.setImageResource(i);
        this.needDivider = false;
        setWillNotDraw(true);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.set((Drawable) null, false);
        }
    }

    public final void setTextAndIcon(int i, CharSequence charSequence, boolean z) {
        this.imageLeft = 16;
        this.offsetFromImage = 58;
        SimpleTextView simpleTextView = this.textView;
        simpleTextView.setText(charSequence, false);
        simpleTextView.setRightDrawable((Drawable) null);
        AnimatedTextView animatedTextView = this.valueTextView;
        this.valueText = null;
        animatedTextView.setText(null, false, true);
        RLottieImageView rLottieImageView = this.imageView;
        rLottieImageView.setImageResource(i);
        rLottieImageView.setVisibility(0);
        animatedTextView.setVisibility(8);
        this.valueSpoilersTextView.setVisibility(8);
        this.valueImageView.setVisibility(8);
        rLottieImageView.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.needDivider = z;
        setWillNotDraw(!z);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.set((Drawable) null, false);
        }
    }

    public final void setTextAndValue(CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2) {
        this.imageLeft = 16;
        this.offsetFromImage = 58;
        SimpleTextView simpleTextView = this.textView;
        simpleTextView.setText(charSequence, false);
        simpleTextView.setRightDrawable((Drawable) null);
        this.valueText = charSequence2;
        AnimatedTextView animatedTextView = this.valueTextView;
        animatedTextView.setText(charSequence2 == null ? null : TextUtils.ellipsize(charSequence2, animatedTextView.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END), z, true);
        animatedTextView.setVisibility(0);
        this.valueSpoilersTextView.setVisibility(8);
        this.imageView.setVisibility(8);
        this.valueImageView.setVisibility(8);
        this.needDivider = z2;
        setWillNotDraw(!z2);
        Switch r7 = this.checkBox;
        if (r7 != null) {
            r7.setVisibility(8);
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.set((Drawable) null, false);
        }
    }

    public final void setTextAndValueAndColorfulIcon(String str, String str2, boolean z, int i, int i2, int i3, boolean z2) {
        CharSequence charSequenceEllipsize;
        this.imageLeft = 16;
        this.offsetFromImage = 58;
        SimpleTextView simpleTextView = this.textView;
        simpleTextView.setText(str, false);
        simpleTextView.setRightDrawable((Drawable) null);
        AnimatedTextView animatedTextView = this.valueTextView;
        if (str2 == null) {
            charSequenceEllipsize = "";
        } else {
            this.valueText = str2;
            charSequenceEllipsize = TextUtils.ellipsize(str2, animatedTextView.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        animatedTextView.setText(charSequenceEllipsize, z, true);
        animatedTextView.setVisibility(0);
        this.valueSpoilersTextView.setVisibility(8);
        setColorfulIcon(i2, i3, i);
        this.valueImageView.setVisibility(8);
        this.needDivider = z2;
        setWillNotDraw(!z2);
        Switch r7 = this.checkBox;
        if (r7 != null) {
            r7.setVisibility(8);
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.set((Drawable) null, false);
        }
    }

    public final void setTextAndValueAndIcon(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z) {
        this.offsetFromImage = 58;
        this.imageLeft = 18;
        SimpleTextView simpleTextView = this.textView;
        simpleTextView.setText(charSequence, false);
        simpleTextView.setRightDrawable((Drawable) null);
        AnimatedTextView animatedTextView = this.valueTextView;
        this.valueText = charSequence2;
        animatedTextView.setText(charSequence2, false, true);
        RLottieImageView rLottieImageView = this.imageView;
        rLottieImageView.setColorFilter((ColorFilter) null);
        if (drawable instanceof RLottieDrawable) {
            rLottieImageView.setAnimation((RLottieDrawable) drawable);
        } else {
            rLottieImageView.setImageDrawable(drawable);
        }
        rLottieImageView.setVisibility(0);
        animatedTextView.setVisibility(0);
        this.valueImageView.setVisibility(8);
        rLottieImageView.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.needDivider = z;
        setWillNotDraw(!z);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.set((Drawable) null, false);
        }
    }

    public final void setTextAndValueDrawable(CharSequence charSequence, Drawable drawable, boolean z) {
        this.imageLeft = 16;
        this.offsetFromImage = 58;
        SimpleTextView simpleTextView = this.textView;
        simpleTextView.setText(charSequence, false);
        simpleTextView.setRightDrawable((Drawable) null);
        AnimatedTextView animatedTextView = this.valueTextView;
        this.valueText = null;
        animatedTextView.setText(null, false, true);
        ImageView imageView = this.valueImageView;
        imageView.setVisibility(0);
        imageView.setImageDrawable(drawable);
        animatedTextView.setVisibility(8);
        this.valueSpoilersTextView.setVisibility(8);
        RLottieImageView rLottieImageView = this.imageView;
        rLottieImageView.setVisibility(8);
        rLottieImageView.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.needDivider = z;
        setWillNotDraw(!z);
        Switch r7 = this.checkBox;
        if (r7 != null) {
            r7.setVisibility(8);
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.set((Drawable) null, false);
        }
    }

    public void setTextColor(int i) {
        this.textView.setTextColor(i);
    }

    public final void setValue(CharSequence charSequence, boolean z) {
        CharSequence charSequenceEllipsize;
        AnimatedTextView animatedTextView = this.valueTextView;
        if (charSequence == null) {
            charSequenceEllipsize = "";
        } else {
            this.valueText = charSequence;
            charSequenceEllipsize = TextUtils.ellipsize(charSequence, animatedTextView.getPaint(), AndroidUtilities.displaySize.x / 2.5f, TextUtils.TruncateAt.END);
        }
        animatedTextView.setText(charSequenceEllipsize, z, true);
    }

    public void setValueSticker(TLRPC.Document document) {
        if (this.emojiDrawable == null) {
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, false, AndroidUtilities.dp(30.0f), 7);
            this.emojiDrawable = swapAnimatedEmojiDrawable;
            if (this.attached) {
                swapAnimatedEmojiDrawable.attach();
            }
        }
        this.emojiDrawable.set(document, 1, true);
        invalidate();
    }

    public final void updateColors() {
        SimpleTextView simpleTextView = this.textView;
        int iIntValue = simpleTextView.getTag() instanceof Integer ? ((Integer) simpleTextView.getTag()).intValue() : Theme.key_windowBackgroundWhiteBlackText;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int color = Theme.getColor(iIntValue, resourcesProvider);
        if (iIntValue != Theme.key_dialogTextBlack && iIntValue != Theme.key_windowBackgroundWhiteBlackText) {
            color = processColor(color);
        }
        simpleTextView.setTextColor(color);
        RLottieImageView rLottieImageView = this.imageView;
        if (rLottieImageView.getTag() instanceof Integer) {
            int iIntValue2 = ((Integer) rLottieImageView.getTag()).intValue();
            int color2 = Theme.getColor(iIntValue2, resourcesProvider);
            if (iIntValue2 != Theme.key_dialogIcon && iIntValue2 != Theme.key_windowBackgroundWhiteGrayIcon) {
                color2 = processColor(color2);
            }
            rLottieImageView.setColorFilter(new PorterDuffColorFilter(color2, PorterDuff.Mode.SRC_IN));
        }
        this.subtitleView.setTextColor(processColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider)));
        int i = Theme.key_windowBackgroundWhiteValueText;
        this.valueTextView.setTextColor(processColor(Theme.getColor(i, resourcesProvider)));
        this.valueSpoilersTextView.setTextColor(processColor(Theme.getColor(i, resourcesProvider)));
    }

    public TextCell(int i, Context context, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2) {
        super(context);
        this.offsetFromImage = 58;
        this.heightDp = 50;
        this.imageLeft = 16;
        this.resourcesProvider = resourcesProvider;
        this.leftPadding = i;
        SimpleTextView simpleTextView = new SimpleTextView(context);
        this.textView = simpleTextView;
        simpleTextView.setTextColor(Theme.getColor(z ? Theme.key_dialogTextBlack : Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        simpleTextView.setTextSize(16);
        simpleTextView.setGravity(LocaleController.isRTL ? 5 : 3);
        simpleTextView.setImportantForAccessibility(2);
        addView(simpleTextView, LayoutHelper.createFrame(-1.0f, -2));
        SimpleTextView simpleTextView2 = new SimpleTextView(context);
        this.subtitleView = simpleTextView2;
        simpleTextView2.setTextColor(Theme.getColor(z ? Theme.key_dialogTextGray : Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
        simpleTextView2.setTextSize(13);
        simpleTextView2.setGravity(LocaleController.isRTL ? 5 : 3);
        simpleTextView2.setImportantForAccessibility(2);
        addView(simpleTextView2, LayoutHelper.createFrame(-1.0f, -2));
        AnimatedTextView animatedTextView = new AnimatedTextView(context, false, true, true);
        this.valueTextView = animatedTextView;
        animatedTextView.setTextColor(Theme.getColor(z ? Theme.key_dialogTextBlue2 : Theme.key_windowBackgroundWhiteValueText, resourcesProvider));
        animatedTextView.setPadding(0, AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f));
        animatedTextView.setTextSize(AndroidUtilities.dp(16.0f));
        animatedTextView.setGravity(LocaleController.isRTL ? 3 : 5);
        animatedTextView.setImportantForAccessibility(2);
        animatedTextView.setTranslationY(AndroidUtilities.dp(-2.0f));
        addView(animatedTextView);
        SimpleTextView simpleTextView3 = new SimpleTextView(context);
        this.valueSpoilersTextView = simpleTextView3;
        Boolean bool = Boolean.FALSE;
        if (!simpleTextView3.scrollNonFitText) {
            simpleTextView3.ellipsizeByGradient = true;
            simpleTextView3.forceEllipsizeByGradientLeft = bool;
            simpleTextView3.updateFadePaints();
            simpleTextView3.checkUi_layerType();
        }
        simpleTextView3.ellipsizeByGradientWidthDp = 18;
        simpleTextView3.updateFadePaints();
        simpleTextView3.setTextColor(Theme.getColor(z ? Theme.key_dialogTextBlue2 : Theme.key_windowBackgroundWhiteValueText, resourcesProvider));
        simpleTextView3.setGravity(LocaleController.isRTL ? 3 : 5);
        simpleTextView3.setTextSize(16);
        simpleTextView3.setImportantForAccessibility(2);
        simpleTextView3.setVisibility(8);
        addView(simpleTextView3);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        rLottieImageView.setScaleType(scaleType);
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(z ? Theme.key_dialogIcon : Theme.key_windowBackgroundWhiteGrayIcon, resourcesProvider), PorterDuff.Mode.SRC_IN));
        addView(rLottieImageView);
        ImageView imageView = new ImageView(context);
        this.valueImageView = imageView;
        imageView.setScaleType(scaleType);
        addView(imageView);
        if (z2) {
            Switch r4 = new Switch(context, resourcesProvider);
            this.checkBox = r4;
            int i2 = Theme.key_switchTrack;
            int i3 = Theme.key_switchTrackChecked;
            int i4 = Theme.key_windowBackgroundWhite;
            r4.trackColorKey = i2;
            r4.trackCheckedColorKey = i3;
            r4.thumbColorKey = i4;
            r4.thumbCheckedColorKey = i4;
            addView(r4, LayoutHelper.createFrame(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        }
        setFocusable(true);
    }

    public void setValueSticker(String str) {
        if (this.emojiDrawable == null) {
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = new AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable(this, false, AndroidUtilities.dp(30.0f), 7);
            this.emojiDrawable = swapAnimatedEmojiDrawable;
            if (this.attached) {
                swapAnimatedEmojiDrawable.attach();
            }
        }
        ImageReceiver imageReceiver = new ImageReceiver(this);
        if (isAttachedToWindow()) {
            imageReceiver.onAttachedToWindow();
        }
        int i = 0;
        addOnAttachStateChangeListener(new AnonymousClass1(imageReceiver, i));
        imageReceiver.setImage(str, "30_30", null, null, 0L);
        this.emojiDrawable.set((Drawable) new AnonymousClass2(imageReceiver, i), true);
        invalidate();
    }

    public final void setTextAndIcon(CharSequence charSequence, Drawable drawable, boolean z) {
        this.offsetFromImage = 58;
        this.imageLeft = 18;
        SimpleTextView simpleTextView = this.textView;
        simpleTextView.setText(charSequence, false);
        simpleTextView.setRightDrawable((Drawable) null);
        AnimatedTextView animatedTextView = this.valueTextView;
        this.valueText = null;
        animatedTextView.setText(null, false, true);
        RLottieImageView rLottieImageView = this.imageView;
        rLottieImageView.setColorFilter((ColorFilter) null);
        if (drawable instanceof RLottieDrawable) {
            rLottieImageView.setAnimation((RLottieDrawable) drawable);
        } else {
            rLottieImageView.setImageDrawable(drawable);
        }
        rLottieImageView.setVisibility(0);
        animatedTextView.setVisibility(8);
        this.valueImageView.setVisibility(8);
        rLottieImageView.setPadding(0, AndroidUtilities.dp(6.0f), 0, 0);
        this.needDivider = z;
        setWillNotDraw(!z);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.set((Drawable) null, false);
        }
    }

    public final void setTextAndValueAndIcon(int i, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        setTextAndValueAndIcon(charSequence, charSequence2, false, i, z);
    }

    public final void setTextAndValueAndIcon(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, boolean z2) {
        this.imageLeft = 16;
        this.offsetFromImage = 58;
        SimpleTextView simpleTextView = this.textView;
        simpleTextView.setText(charSequence, false);
        simpleTextView.setRightDrawable((Drawable) null);
        RLottieImageView rLottieImageView = this.imageView;
        rLottieImageView.setVisibility(0);
        AnimatedTextView animatedTextView = this.valueTextView;
        if (charSequence2 != null) {
            int iMax = (int) Math.max(1.0f, AndroidUtilities.displaySize.x - ((HintView2.measureCorrectly(charSequence, simpleTextView.getTextPaint()) + AndroidUtilities.dp(this.offsetFromImage)) + AndroidUtilities.dp(16.0f)));
            this.valueText = charSequence2;
            animatedTextView.setText(TextUtils.ellipsize(charSequence2, animatedTextView.getPaint(), iMax, TextUtils.TruncateAt.END), z, true);
        } else {
            animatedTextView.setText("", z, true);
        }
        animatedTextView.setVisibility(0);
        this.valueSpoilersTextView.setVisibility(8);
        this.valueImageView.setVisibility(8);
        rLottieImageView.setTranslationX(0.0f);
        rLottieImageView.setTranslationY(0.0f);
        rLottieImageView.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        rLottieImageView.setImageResource(i);
        this.needDivider = z2;
        setWillNotDraw(!z2);
        Switch r9 = this.checkBox;
        if (r9 != null) {
            r9.setVisibility(8);
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = this.emojiDrawable;
        if (swapAnimatedEmojiDrawable != null) {
            swapAnimatedEmojiDrawable.set((Drawable) null, false);
        }
    }
}
