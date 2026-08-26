package org.telegram.ui.Components.Premium;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BoostsActivity;
import org.telegram.ui.BoostsActivity$$ExternalSyntheticLambda4;
import org.telegram.ui.Cells.PhotoPickerPhotoCell;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EllipsizeSpanAnimator;
import org.telegram.ui.Components.EmptyStubSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.HintView2;

public class LimitPreviewView extends LinearLayout {
    public boolean animate;
    public boolean animateArrowFadeIn;
    public boolean animateArrowFadeOut;
    public boolean animateIncrease;
    public int animateIncreaseWidth;
    public Runnable animateStarRatingRunnable;
    public boolean animatingRotation;
    public boolean animationCanPlay;
    public ValueAnimator arrowAnimator;
    public int currentValue;
    public DarkGradientProvider darkGradientProvider;
    public final TextView defaultCount;
    public final TextViewHolder defaultLayout;
    public final AnimatedTextView defaultText;
    public boolean drawFromRight;
    public int gradientTotalHeight;
    public int gradientYOffset;
    public boolean hideNegativeValues;
    public final int icon;
    public float iconScale;
    public boolean inc;
    public boolean invalidationEnabled;
    public boolean isBoostsStyle;
    public boolean isRatingNegative;
    public boolean isRatingStyle;
    public boolean isSimpleStyle;
    public boolean isStatistic;
    public final CounterView limitIcon;
    public float limitIconRotation;
    public final PhotoPickerPhotoCell.AnonymousClass1 limitsContainer;
    public ViewGroup parentVideForGradient;
    public float percent;
    public float position;
    public final AnimatedTextView premiumCount;
    public final TextViewHolder premiumLayout;
    public boolean premiumLocked;
    public final TextView premiumText;
    public float progress;
    public final Paint ratingPaint;
    public final Theme.ResourcesProvider resourcesProvider;
    public PremiumGradient.PremiumGradientTools staticGradient;
    public boolean wasAnimation;
    public boolean wasHaptic;
    public int width1;

    public final class CounterView extends View {
        public final ArrayList animatedLayouts;
        public StaticLayout animatedStableLayout;
        public boolean animationInProgress;
        public float arrowCenter;
        public final Paint dstOutPaint;
        public boolean invalidatePath;
        public final Paint overlayPaint;
        public final Path path;
        public final CornerPathEffect pathEffect;
        public SpannableStringBuilder text;
        public StaticLayout textLayout;
        public final TextPaint textPaint;
        public float textWidth;

        public final class AnonymousClass1 extends AnimatorListenerAdapter {
            public final int $r8$classId;
            public final CounterView this$1;
            public final AnimatedLayout val$layout;

            public AnonymousClass1(CounterView counterView, AnimatedLayout animatedLayout, int i) {
                this.$r8$classId = i;
                this.this$1 = counterView;
                this.val$layout = animatedLayout;
            }

            @Override
            public final void onAnimationEnd(Animator animator) {
                switch (this.$r8$classId) {
                    case 0:
                        this.val$layout.valueAnimator = null;
                        int i = 0;
                        while (true) {
                            CounterView counterView = this.this$1;
                            int size = counterView.animatedLayouts.size();
                            ArrayList arrayList = counterView.animatedLayouts;
                            if (i >= size) {
                                arrayList.clear();
                                counterView.animationInProgress = false;
                                counterView.invalidate();
                            } else if (((AnimatedLayout) arrayList.get(i)).valueAnimator == null) {
                                i++;
                            }
                            break;
                        }
                        break;
                    default:
                        this.val$layout.valueAnimator = null;
                        int i2 = 0;
                        while (true) {
                            CounterView counterView2 = this.this$1;
                            int size2 = counterView2.animatedLayouts.size();
                            ArrayList arrayList2 = counterView2.animatedLayouts;
                            if (i2 >= size2) {
                                arrayList2.clear();
                                counterView2.animationInProgress = false;
                                counterView2.invalidate();
                            } else if (((AnimatedLayout) arrayList2.get(i2)).valueAnimator == null) {
                                i2++;
                            }
                            break;
                        }
                        break;
                }
            }
        }

        public final class AnimatedLayout {
            public boolean direction;
            public float progress;
            public boolean replace;
            public final ArrayList staticLayouts = new ArrayList();
            public ValueAnimator valueAnimator;
            public float x;
        }

        public CounterView(Context context) {
            super(context);
            this.path = new Path();
            this.pathEffect = new CornerPathEffect(AndroidUtilities.dp(6.0f));
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            this.animatedLayouts = new ArrayList();
            Paint paint = new Paint();
            this.dstOutPaint = paint;
            Paint paint2 = new Paint();
            this.overlayPaint = paint2;
            textPaint.setTypeface(AndroidUtilities.bold());
            textPaint.setTextSize(AndroidUtilities.dp(22.0f));
            textPaint.setColor(-1);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
            LimitPreviewView limitPreviewView = LimitPreviewView.this;
            if (limitPreviewView.premiumLocked) {
                measuredHeight = getMeasuredHeight();
                PremiumGradient.getInstance().mainGradient.gradientMatrix(0, 0, limitPreviewView.getMeasuredWidth(), limitPreviewView.getMeasuredHeight(), limitPreviewView.getGlobalXOffset() - getX(), -getTop());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.dp(3.0f), getMeasuredWidth(), measuredHeight - AndroidUtilities.dp(3.0f));
                float f = measuredHeight / 2.0f;
                PremiumGradient premiumGradient = PremiumGradient.getInstance();
                if (premiumGradient.lockedPremiumPaint == null) {
                    premiumGradient.lockedPremiumPaint = new Paint(1);
                }
                premiumGradient.lockedPremiumPaint.setColor(Theme.getColor(null, Theme.key_featuredStickers_addButton, false));
                canvas.drawRoundRect(rectF, f, f, premiumGradient.lockedPremiumPaint);
            } else {
                if (this.invalidatePath) {
                    this.invalidatePath = false;
                    updatePath();
                }
                PremiumGradient.getInstance().mainGradient.gradientMatrix(0, 0, limitPreviewView.getMeasuredWidth(), limitPreviewView.getMeasuredHeight(), limitPreviewView.getGlobalXOffset() - getX(), -getTop());
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f2 = measuredHeight;
                rectF2.set(0.0f, 0.0f, getMeasuredWidth(), f2);
                float f3 = f2 / 2.0f;
                boolean z = limitPreviewView.isRatingStyle;
                TextPaint textPaint = this.textPaint;
                Paint mainGradientPaint = limitPreviewView.ratingPaint;
                canvas.drawRoundRect(rectF2, f3, f3, z ? mainGradientPaint : limitPreviewView.darkGradientProvider != null ? textPaint : PremiumGradient.getInstance().getMainGradientPaint());
                Paint mainGradientPaint2 = PremiumGradient.getInstance().getMainGradientPaint();
                CornerPathEffect cornerPathEffect = this.pathEffect;
                mainGradientPaint2.setPathEffect(cornerPathEffect);
                if (limitPreviewView.darkGradientProvider != null) {
                    textPaint.setPathEffect(cornerPathEffect);
                }
                Path path = this.path;
                if (!limitPreviewView.isRatingStyle) {
                    mainGradientPaint = limitPreviewView.darkGradientProvider != null ? textPaint : PremiumGradient.getInstance().getMainGradientPaint();
                }
                canvas.drawPath(path, mainGradientPaint);
                PremiumGradient.getInstance().getMainGradientPaint().setPathEffect(null);
                if (limitPreviewView.darkGradientProvider != null) {
                    textPaint.setPathEffect(null);
                }
                if (limitPreviewView.invalidationEnabled) {
                    invalidate();
                }
            }
            int i = measuredHeight;
            if (limitPreviewView.darkGradientProvider != null) {
                canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.dstOutPaint, 31);
            }
            float measuredWidth = (getMeasuredWidth() - this.textWidth) / 2.0f;
            float height = (i - this.textLayout.getHeight()) / 2.0f;
            if (this.animationInProgress) {
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(8.0f));
                if (this.animatedStableLayout != null) {
                    canvas.save();
                    canvas.translate(measuredWidth, height);
                    this.animatedStableLayout.draw(canvas);
                    canvas.restore();
                }
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = this.animatedLayouts;
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    AnimatedLayout animatedLayout = (AnimatedLayout) arrayList.get(i2);
                    canvas.save();
                    boolean z2 = animatedLayout.replace;
                    ArrayList arrayList2 = animatedLayout.staticLayouts;
                    if (z2) {
                        canvas.translate(animatedLayout.x + measuredWidth, ((i * animatedLayout.progress) + height) - ((1 - arrayList2.size()) * i));
                        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                            canvas.translate(0.0f, -i);
                            ((StaticLayout) arrayList2.get(i3)).draw(canvas);
                        }
                    } else if (animatedLayout.direction) {
                        canvas.translate(animatedLayout.x + measuredWidth, (height - ((i * 10) * animatedLayout.progress)) + ((10 - arrayList2.size()) * i));
                        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                            canvas.translate(0.0f, i);
                            ((StaticLayout) arrayList2.get(i4)).draw(canvas);
                        }
                    } else {
                        canvas.translate(animatedLayout.x + measuredWidth, (((i * 10) * animatedLayout.progress) + height) - ((10 - arrayList2.size()) * i));
                        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                            canvas.translate(0.0f, -i);
                            ((StaticLayout) arrayList2.get(i5)).draw(canvas);
                        }
                    }
                    canvas.restore();
                    i2++;
                }
                canvas.restore();
            } else if (this.textLayout != null) {
                canvas.save();
                canvas.translate(measuredWidth, height);
                this.textLayout.draw(canvas);
                canvas.restore();
            }
            if (limitPreviewView.darkGradientProvider != null) {
                canvas.restore();
                canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.overlayPaint, 31);
                canvas.drawRect(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(10.0f), getMeasuredWidth() - AndroidUtilities.dp(12.0f), getMeasuredHeight() - AndroidUtilities.dp(10.0f), ((BoostsActivity) ((BoostsActivity$$ExternalSyntheticLambda4) limitPreviewView.darkGradientProvider).f$0).setDarkGradientLocation(getX(), getY()));
                canvas.restore();
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            SpannableStringBuilder spannableStringBuilder = this.text;
            TextPaint textPaint = this.textPaint;
            this.textWidth = HintView2.measureCorrectly(spannableStringBuilder, textPaint);
            this.textLayout = new StaticLayout(this.text, textPaint, AndroidUtilities.dp(12.0f) + ((int) this.textWidth), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.textWidth = 0.0f;
            for (int i3 = 0; i3 < this.textLayout.getLineCount(); i3++) {
                this.textWidth = Math.max(this.textWidth, this.textLayout.getLineWidth(i3));
            }
            setMeasuredDimension((int) (this.textWidth + getPaddingRight() + getPaddingLeft()), AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(44.0f));
            updatePath();
        }

        @Override
        public final void setTranslationX(float f) {
            if (f != getTranslationX()) {
                super.setTranslationX(f);
                invalidate();
            }
        }

        public final void updatePath() {
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
            float measuredWidth = getMeasuredWidth() * this.arrowCenter;
            float fClamp = Utilities.clamp(AndroidUtilities.dp(8.0f) + measuredWidth, getMeasuredWidth(), 0.0f);
            float fClamp2 = Utilities.clamp(AndroidUtilities.dp(10.0f) + measuredWidth, getMeasuredWidth(), AndroidUtilities.dp(24.0f));
            float fClamp3 = Utilities.clamp(measuredWidth - AndroidUtilities.dp(this.arrowCenter >= 0.7f ? 24.0f : 10.0f), getMeasuredWidth(), 0.0f);
            float fClamp4 = Utilities.clamp(measuredWidth - AndroidUtilities.dp(8.0f), getMeasuredWidth(), 0.0f);
            Path path = this.path;
            path.rewind();
            float f = measuredHeight;
            float f2 = f - (f / 2.0f);
            path.moveTo(fClamp3, f2 - AndroidUtilities.dp(2.0f));
            path.lineTo(fClamp3, f);
            path.lineTo(fClamp4, f);
            path.lineTo(measuredWidth, AndroidUtilities.dp(8.0f) + measuredHeight);
            if (this.arrowCenter < 0.7f) {
                path.lineTo(fClamp, f);
            }
            path.lineTo(fClamp2, f);
            path.lineTo(fClamp2, f2 - AndroidUtilities.dp(2.0f));
            path.close();
        }
    }

    public interface DarkGradientProvider {
    }

    public final class TextViewHolder extends FrameLayout {
        public final boolean isLeft;
        public final Paint paint;

        public TextViewHolder(Context context, boolean z) {
            super(context);
            Paint paint = new Paint();
            this.paint = paint;
            setLayerType(2, null);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            this.isLeft = z;
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            if (!(view instanceof TextView)) {
                return super.drawChild(canvas, view, j);
            }
            boolean zDrawChild = super.drawChild(canvas, view, j);
            LimitPreviewView limitPreviewView = LimitPreviewView.this;
            float f = limitPreviewView.percent;
            boolean z = false;
            boolean z2 = this.isLeft;
            boolean z3 = f != 0.0f && f <= 1.0f && z2;
            if (f == 1.0f && !z2) {
                z = true;
            }
            if ((z3 || z) && limitPreviewView.darkGradientProvider != null) {
                canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), this.paint, 31);
                canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((BoostsActivity) ((BoostsActivity$$ExternalSyntheticLambda4) limitPreviewView.darkGradientProvider).f$0).setDarkGradientLocation(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                canvas.restore();
                invalidate();
            }
            return zDrawChild;
        }
    }

    public LimitPreviewView(Context context, int i, int i2, int i3, float f, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.iconScale = 1.0f;
        this.animationCanPlay = true;
        this.ratingPaint = new Paint(1);
        this.invalidationEnabled = true;
        this.resourcesProvider = resourcesProvider;
        this.percent = MathUtils.clamp(f, 0.1f, 0.9f);
        this.icon = i;
        this.currentValue = i2;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        if (i != 0) {
            setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
            CounterView counterView = new CounterView(context);
            this.limitIcon = counterView;
            setIconValue(i2, false);
            counterView.setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(14.0f));
            addView(counterView, LayoutHelper.createLinear(-2, -2, 0.0f, 3));
        }
        TextViewHolder textViewHolder = new TextViewHolder(context, true);
        this.defaultLayout = textViewHolder;
        AnimatedTextView animatedTextView = new AnimatedTextView(context);
        this.defaultText = animatedTextView;
        animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
        animatedTextView.setTypeface(AndroidUtilities.bold());
        animatedTextView.setText(LocaleController.getString(R.string.LimitFree));
        animatedTextView.setGravity(16);
        int i4 = Theme.key_windowBackgroundWhiteBlackText;
        animatedTextView.setTextColor(Theme.getColor(i4, resourcesProvider));
        TextView textView = new TextView(context);
        this.defaultCount = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(String.format("%d", Integer.valueOf(i3)));
        textView.setGravity(16);
        textView.setTextColor(Theme.getColor(i4, resourcesProvider));
        if (LocaleController.isRTL) {
            textViewHolder.addView(animatedTextView, LayoutHelper.createFrame(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            textViewHolder.addView(textView, LayoutHelper.createFrame(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            textViewHolder.addView(animatedTextView, LayoutHelper.createFrame(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            textViewHolder.addView(textView, LayoutHelper.createFrame(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        TextViewHolder textViewHolder2 = new TextViewHolder(context, false);
        this.premiumLayout = textViewHolder2;
        TextView textView2 = new TextView(context);
        this.premiumText = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setText(LocaleController.getString(R.string.LimitPremium));
        textView2.setGravity(16);
        textView2.setTextColor(-1);
        AnimatedTextView animatedTextView2 = new AnimatedTextView(context);
        this.premiumCount = animatedTextView2;
        animatedTextView2.setTextSize(AndroidUtilities.dp(14.0f));
        animatedTextView2.setTypeface(AndroidUtilities.bold());
        animatedTextView2.setText(String.format("%d", Integer.valueOf(i3)));
        animatedTextView2.setGravity(21);
        animatedTextView2.setTextColor(-1);
        if (LocaleController.isRTL) {
            textViewHolder2.addView(textView2, LayoutHelper.createFrame(-1, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
            textViewHolder2.addView(animatedTextView2, LayoutHelper.createFrame(-2, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
        } else {
            textViewHolder2.addView(textView2, LayoutHelper.createFrame(-1, 30.0f, 3, 12.0f, 0.0f, 12.0f, 0.0f));
            textViewHolder2.addView(animatedTextView2, LayoutHelper.createFrame(-2, 30.0f, 5, 12.0f, 0.0f, 12.0f, 0.0f));
        }
        PhotoPickerPhotoCell.AnonymousClass1 anonymousClass1 = new PhotoPickerPhotoCell.AnonymousClass1(this, context, resourcesProvider);
        this.limitsContainer = anonymousClass1;
        anonymousClass1.addView(textViewHolder, LayoutHelper.createFrame(-1, 30.0f));
        anonymousClass1.addView(textViewHolder2, LayoutHelper.createFrame(-1, 30.0f));
        addView(anonymousClass1, LayoutHelper.createLinear(-1, 30, 0.0f, 0, 14, i == 0 ? 0 : 12, 14, 0));
    }

    public float getGlobalXOffset() {
        return (((-getMeasuredWidth()) * 0.1f) * this.progress) - (getMeasuredWidth() * 0.2f);
    }

    private void setArrowX(float f) {
        this.width1 = f >= 1.0f ? this.limitsContainer.getMeasuredWidth() : 0;
        int iDp = AndroidUtilities.dp(14.0f);
        float f2 = iDp;
        float fMax = Math.max(this.width1, (getMeasuredWidth() - (iDp * 2)) * f) + f2;
        CounterView counterView = this.limitIcon;
        counterView.setTranslationX(Utilities.clamp(fMax - (counterView.getMeasuredWidth() / 2.0f), (getMeasuredWidth() - iDp) - counterView.getMeasuredWidth(), f2));
        if (counterView.arrowCenter != f) {
            counterView.arrowCenter = f;
            counterView.invalidatePath = true;
            counterView.invalidate();
        }
        counterView.setPivotX(counterView.getMeasuredWidth() * f);
    }

    public final void animateStarRating(TL_stars.Tl_starsRating tl_starsRating, final TL_stars.Tl_starsRating tl_starsRating2) {
        boolean z;
        int color;
        AndroidUtilities.cancelRunOnUIThread(this.animateStarRatingRunnable);
        this.animateStarRatingRunnable = null;
        Paint paint = this.ratingPaint;
        int i = Theme.key_featuredStickers_addButton;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        paint.setColor(Theme.getColor(i, resourcesProvider));
        this.isRatingNegative = false;
        int i2 = tl_starsRating.level;
        int i3 = tl_starsRating2.level;
        AnimatedTextView animatedTextView = this.premiumCount;
        AnimatedTextView animatedTextView2 = this.defaultText;
        PhotoPickerPhotoCell.AnonymousClass1 anonymousClass1 = this.limitsContainer;
        if (i2 == i3) {
            long j = tl_starsRating2.stars;
            if (j > 0) {
                long j2 = tl_starsRating2.next_level_stars;
                if (j2 == 0) {
                    this.percent = 1.0f;
                    int i4 = R.string.StarRatingLevel;
                    animatedTextView2.setText(LocaleController.formatString(i4, Integer.valueOf(i3 - 1)));
                    animatedTextView.setText(LocaleController.formatString(i4, Integer.valueOf(tl_starsRating2.level)));
                } else {
                    long j3 = tl_starsRating2.current_level_stars;
                    this.percent = MathUtils.clamp((j - j3) / (j2 - j3), 0.0f, 1.0f);
                    int i5 = R.string.StarRatingLevel;
                    z = true;
                    animatedTextView2.setText(LocaleController.formatString(i5, Integer.valueOf(tl_starsRating2.level)));
                    animatedTextView.setText(LocaleController.formatString(i5, Integer.valueOf(tl_starsRating2.level + 1)));
                }
                this.animate = z;
                this.animateArrowFadeIn = false;
                this.animateArrowFadeOut = false;
                this.animateIncreaseWidth = this.width1;
                anonymousClass1.requestLayout();
                requestLayout();
                if (this.isRatingNegative) {
                    color = -1;
                } else {
                    color = Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider);
                }
                animatedTextView.setTextColor(color);
                animatedTextView2.setTextColor(-1);
                setIconValue((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
                return;
            }
            this.percent = 0.0f;
            animatedTextView2.setText("");
            animatedTextView.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            paint.setColor(Theme.getColor(Theme.key_color_red, resourcesProvider));
            this.isRatingNegative = true;
            z = true;
            this.animate = z;
            this.animateArrowFadeIn = false;
            this.animateArrowFadeOut = false;
            this.animateIncreaseWidth = this.width1;
            anonymousClass1.requestLayout();
            requestLayout();
            if (this.isRatingNegative) {
                color = -1;
            } else {
                color = Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider);
            }
            animatedTextView.setTextColor(color);
            animatedTextView2.setTextColor(-1);
            setIconValue((int) tl_starsRating2.stars, (int) tl_starsRating2.next_level_stars);
            return;
        }
        if (i3 > i2) {
            if (tl_starsRating.stars <= 0) {
                this.isRatingNegative = true;
            }
            this.percent = 1.0f;
            this.animate = true;
            this.animateArrowFadeIn = false;
            this.animateArrowFadeOut = true;
            this.animateIncreaseWidth = this.width1;
            anonymousClass1.requestLayout();
            requestLayout();
            animatedTextView.setTextColor(this.isRatingNegative ? -1 : Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            animatedTextView2.setTextColor(-1);
            ViewPropertyAnimator duration = animatedTextView2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            animatedTextView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(cubicBezierInterpolator).start();
            setIconValue((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            final int i6 = 0;
            Runnable runnable = new Runnable(this) {
                public final LimitPreviewView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i6) {
                        case 0:
                            this.f$0.lambda$animateStarRating$2(tl_starsRating2);
                            break;
                        default:
                            this.f$0.lambda$animateStarRating$3(tl_starsRating2);
                            break;
                    }
                }
            };
            this.animateStarRatingRunnable = runnable;
            AndroidUtilities.runOnUIThread(runnable, 600L);
            return;
        }
        if (i3 < i2) {
            paint.setColor(Theme.getColor(i, resourcesProvider));
            this.isRatingNegative = false;
            if (tl_starsRating.stars <= 0) {
                this.isRatingNegative = true;
            }
            this.percent = 0.0f;
            this.animate = true;
            this.animateArrowFadeIn = false;
            this.animateArrowFadeOut = true;
            this.animateIncreaseWidth = this.width1;
            anonymousClass1.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration2 = animatedTextView2.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L);
            CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration2.setInterpolator(cubicBezierInterpolator2).start();
            animatedTextView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(320L).setInterpolator(cubicBezierInterpolator2).start();
            animatedTextView.setTextColor(this.isRatingNegative ? -1 : Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            animatedTextView2.setTextColor(-1);
            setIconValue((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
            final int i7 = 1;
            Runnable runnable2 = new Runnable(this) {
                public final LimitPreviewView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i7) {
                        case 0:
                            this.f$0.lambda$animateStarRating$2(tl_starsRating2);
                            break;
                        default:
                            this.f$0.lambda$animateStarRating$3(tl_starsRating2);
                            break;
                    }
                }
            };
            this.animateStarRatingRunnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 600L);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.staticGradient == null) {
            if (this.inc) {
                float f = this.progress + 0.016f;
                this.progress = f;
                if (f > 3.0f) {
                    this.inc = false;
                }
            } else {
                float f2 = this.progress - 0.016f;
                this.progress = f2;
                if (f2 < 1.0f) {
                    this.inc = true;
                }
            }
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    public final void lambda$animateStarRating$2(TL_stars.Tl_starsRating tl_starsRating) {
        this.animateStarRatingRunnable = null;
        if (isAttachedToWindow()) {
            ValueAnimator valueAnimator = this.arrowAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.isRatingNegative = false;
            Paint paint = this.ratingPaint;
            int i = Theme.key_featuredStickers_addButton;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            paint.setColor(Theme.getColor(i, resourcesProvider));
            long j = tl_starsRating.stars;
            AnimatedTextView animatedTextView = this.premiumCount;
            AnimatedTextView animatedTextView2 = this.defaultText;
            if (j <= 0) {
                this.percent = 0.0f;
                animatedTextView2.setText("");
                animatedTextView.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                paint.setColor(Theme.getColor(Theme.key_color_red, resourcesProvider));
                this.isRatingNegative = true;
            } else {
                long j2 = tl_starsRating.next_level_stars;
                if (j2 == 0) {
                    this.percent = 1.0f;
                    int i2 = R.string.StarRatingLevel;
                    animatedTextView2.setText(LocaleController.formatString(i2, Integer.valueOf(tl_starsRating.level - 1)));
                    animatedTextView.setText(LocaleController.formatString(i2, Integer.valueOf(tl_starsRating.level)));
                } else {
                    long j3 = tl_starsRating.current_level_stars;
                    this.percent = MathUtils.clamp((j - j3) / (j2 - j3), 0.0f, 1.0f);
                    int i3 = R.string.StarRatingLevel;
                    animatedTextView2.setText(LocaleController.formatString(i3, Integer.valueOf(tl_starsRating.level)));
                    animatedTextView.setText(LocaleController.formatString(i3, Integer.valueOf(tl_starsRating.level + 1)));
                }
            }
            setArrowX(0.0f);
            CounterView counterView = this.limitIcon;
            counterView.setScaleX(0.6f);
            counterView.setScaleY(0.6f);
            counterView.setAlpha(0.0f);
            this.animate = true;
            this.animateArrowFadeIn = true;
            this.animateArrowFadeOut = false;
            this.animateIncreaseWidth = this.width1;
            this.limitsContainer.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration = animatedTextView2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            animatedTextView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator).start();
            animatedTextView.setTextColor(this.isRatingNegative ? -1 : Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            animatedTextView2.setTextColor(-1);
            setIconValue((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        }
    }

    public final void lambda$animateStarRating$3(TL_stars.Tl_starsRating tl_starsRating) {
        this.animateStarRatingRunnable = null;
        if (isAttachedToWindow()) {
            ValueAnimator valueAnimator = this.arrowAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.isRatingNegative = false;
            Paint paint = this.ratingPaint;
            int i = Theme.key_featuredStickers_addButton;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            paint.setColor(Theme.getColor(i, resourcesProvider));
            long j = tl_starsRating.stars;
            AnimatedTextView animatedTextView = this.premiumCount;
            AnimatedTextView animatedTextView2 = this.defaultText;
            if (j <= 0) {
                this.percent = 0.5f;
                animatedTextView2.setText("");
                animatedTextView.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
                paint.setColor(Theme.getColor(Theme.key_color_red, resourcesProvider));
                this.isRatingNegative = true;
            } else {
                long j2 = tl_starsRating.next_level_stars;
                if (j2 == 0) {
                    this.percent = 1.0f;
                    int i2 = R.string.StarRatingLevel;
                    animatedTextView2.setText(LocaleController.formatString(i2, Integer.valueOf(tl_starsRating.level - 1)));
                    animatedTextView.setText(LocaleController.formatString(i2, Integer.valueOf(tl_starsRating.level)));
                } else {
                    long j3 = tl_starsRating.current_level_stars;
                    this.percent = MathUtils.clamp((j - j3) / (j2 - j3), 0.0f, 1.0f);
                    int i3 = R.string.StarRatingLevel;
                    animatedTextView2.setText(LocaleController.formatString(i3, Integer.valueOf(tl_starsRating.level)));
                    animatedTextView.setText(LocaleController.formatString(i3, Integer.valueOf(tl_starsRating.level + 1)));
                }
            }
            setArrowX(1.0f);
            CounterView counterView = this.limitIcon;
            counterView.setScaleX(0.6f);
            counterView.setScaleY(0.6f);
            counterView.setAlpha(0.0f);
            this.animate = true;
            this.animateArrowFadeIn = true;
            this.animateArrowFadeOut = false;
            this.animateIncreaseWidth = this.width1;
            this.limitsContainer.requestLayout();
            requestLayout();
            ViewPropertyAnimator duration = animatedTextView2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            animatedTextView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator).start();
            animatedTextView.setTextColor(this.isRatingNegative ? -1 : Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            animatedTextView2.setTextColor(-1);
            setIconValue((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float fClamp;
        final float f4;
        float measuredWidth;
        float f5;
        boolean z2;
        TextPaint textPaint;
        int i5;
        int i6;
        int i7;
        super.onLayout(z, i, i2, i3, i4);
        boolean z3 = this.animateIncrease;
        CounterView counterView = this.limitIcon;
        if (!z3 && !this.animate && (this.wasAnimation || counterView == null || !this.animationCanPlay || this.premiumLocked)) {
            if (this.isBoostsStyle) {
                if (this.animateArrowFadeIn || this.animateArrowFadeOut) {
                    return;
                }
                counterView.setAlpha(1.0f);
                counterView.setScaleX(1.0f);
                counterView.setScaleY(1.0f);
                return;
            }
            if (!this.premiumLocked) {
                if (counterView != null) {
                    counterView.setAlpha(0.0f);
                    return;
                }
                return;
            }
            int iDp = AndroidUtilities.dp(14.0f);
            float measuredWidth2 = (((getMeasuredWidth() - (iDp * 2)) * 0.5f) + iDp) - (counterView.getMeasuredWidth() / 2.0f);
            boolean z4 = this.wasAnimation;
            if (!z4 && this.animationCanPlay) {
                this.wasAnimation = true;
                counterView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).setInterpolator(new OvershootInterpolator()).start();
            } else if (z4) {
                counterView.setAlpha(1.0f);
                counterView.setScaleX(1.0f);
                counterView.setScaleY(1.0f);
            } else {
                counterView.setAlpha(0.0f);
                counterView.setScaleX(0.0f);
                counterView.setScaleY(0.0f);
            }
            counterView.setTranslationX(measuredWidth2);
            return;
        }
        int iDp2 = AndroidUtilities.dp(14.0f);
        boolean z5 = this.animate || this.animateIncrease;
        this.animateIncrease = false;
        this.animate = false;
        float translationX = z5 ? counterView.getTranslationX() : 0.0f;
        float f6 = iDp2;
        int i8 = iDp2 * 2;
        float fMax = (Math.max(this.width1, (getMeasuredWidth() - i8) * this.position) + f6) - (counterView.getMeasuredWidth() / 2.0f);
        if (this.isSimpleStyle) {
            float f7 = counterView.arrowCenter;
            measuredWidth = Utilities.clamp(fMax, (getMeasuredWidth() - iDp2) - counterView.getMeasuredWidth(), f6);
            int i9 = this.width1;
            if (i9 <= 0) {
                f4 = measuredWidth;
                f3 = f7;
                fClamp = 0.0f;
            } else if (i9 >= getMeasuredWidth() - i8) {
                f = f7;
                f4 = measuredWidth;
                f3 = f;
                fClamp = 1.0f;
            } else {
                fClamp = Utilities.clamp((this.width1 - (measuredWidth - f6)) / counterView.getMeasuredWidth(), 1.0f, 0.0f);
                f4 = measuredWidth;
                f3 = f7;
            }
        } else {
            if (fMax < f6) {
                f = 0.0f;
                f2 = 0.0f;
            } else {
                f6 = fMax;
                f = 0.5f;
                f2 = 0.5f;
            }
            if (f6 > (getMeasuredWidth() - iDp2) - counterView.getMeasuredWidth()) {
                measuredWidth = (getMeasuredWidth() - iDp2) - counterView.getMeasuredWidth();
                f4 = measuredWidth;
                f3 = f;
                fClamp = 1.0f;
            } else {
                f3 = f;
                fClamp = f2;
                f4 = f6;
            }
        }
        final boolean z6 = this.animateArrowFadeIn;
        final boolean z7 = this.animateArrowFadeOut;
        if (!z6 && !z7) {
            counterView.setAlpha(1.0f);
        }
        counterView.setTranslationX(translationX);
        counterView.setPivotX(counterView.getMeasuredWidth() / 2.0f);
        counterView.setPivotY(counterView.getMeasuredHeight());
        if (z5) {
            f5 = f3;
            z2 = z5;
        } else {
            counterView.setScaleX(0.0f);
            counterView.setScaleY(0.0f);
            ArrayList arrayList = counterView.animatedLayouts;
            arrayList.clear();
            LimitPreviewView limitPreviewView = LimitPreviewView.this;
            if (limitPreviewView.isBoostsStyle && limitPreviewView.currentValue == 0) {
                f5 = f3;
                z2 = z5;
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(counterView.text);
                boolean z8 = true;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    int length = counterView.text.length();
                    textPaint = counterView.textPaint;
                    if (i10 >= length) {
                        break;
                    }
                    if (Character.isDigit(counterView.text.charAt(i10))) {
                        CounterView.AnimatedLayout animatedLayout = new CounterView.AnimatedLayout();
                        arrayList.add(animatedLayout);
                        animatedLayout.x = counterView.textLayout.getSecondaryHorizontal(i10);
                        animatedLayout.direction = z8;
                        if (i11 >= 1) {
                            z8 = !z8;
                            i11 = 0;
                        }
                        i11++;
                        int iCharAt = counterView.text.charAt(i10) - '0';
                        int i12 = iCharAt == 0 ? 10 : iCharAt;
                        int i13 = 1;
                        while (i13 <= i12) {
                            int i14 = i12;
                            if (i13 == 10) {
                                i7 = i13;
                                i6 = 0;
                            } else {
                                i6 = i13;
                                i7 = i6;
                            }
                            animatedLayout.staticLayouts.add(new StaticLayout(DiffUtil.m(i6, ""), textPaint, (int) counterView.textWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                            i13 = i7 + 1;
                            i12 = i14;
                        }
                        i5 = 1;
                        spannableStringBuilder.setSpan(new EmptyStubSpan(), i10, i10 + 1, 0);
                    } else {
                        i5 = 1;
                    }
                    i10 += i5;
                    f3 = f3;
                    z5 = z5;
                }
                f5 = f3;
                z2 = z5;
                counterView.animatedStableLayout = new StaticLayout(spannableStringBuilder, textPaint, AndroidUtilities.dp(12.0f) + ((int) counterView.textWidth), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i15 = 0; i15 < arrayList.size(); i15++) {
                    counterView.animationInProgress = true;
                    CounterView.AnimatedLayout animatedLayout2 = (CounterView.AnimatedLayout) arrayList.get(i15);
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    animatedLayout2.valueAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new LimitPreviewView$CounterView$$ExternalSyntheticLambda0(counterView, animatedLayout2, 1));
                    animatedLayout2.valueAnimator.addListener(new CounterView.AnonymousClass1(counterView, animatedLayout2, 0));
                    animatedLayout2.valueAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                    animatedLayout2.valueAnimator.setDuration(750L);
                    animatedLayout2.valueAnimator.setStartDelay(((long) ((arrayList.size() - 1) - i15)) * 60);
                    animatedLayout2.valueAnimator.start();
                }
            }
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.arrowAnimator = valueAnimatorOfFloat2;
        final float f8 = this.width1;
        if (z2) {
            this.width1 = this.animateIncreaseWidth;
        }
        final boolean z9 = !this.animatingRotation;
        this.animatingRotation = true;
        final float f9 = fClamp;
        final float f10 = translationX;
        final float f11 = f5;
        final boolean z10 = z2;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LimitPreviewView limitPreviewView2 = this.f$0;
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float fMin = Math.min(1.0f, fFloatValue);
                LimitPreviewView.CounterView counterView2 = limitPreviewView2.limitIcon;
                if (fFloatValue > 1.0f && z9) {
                    if (!limitPreviewView2.wasHaptic) {
                        limitPreviewView2.wasHaptic = true;
                        try {
                            counterView2.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    counterView2.setRotation(((fFloatValue - 1.0f) * 60.0f) + limitPreviewView2.limitIconRotation);
                } else if (!limitPreviewView2.animatingRotation) {
                    counterView2.setRotation(limitPreviewView2.limitIconRotation);
                }
                if (valueAnimator == limitPreviewView2.arrowAnimator) {
                    counterView2.setTranslationX(AndroidUtilities.lerp(f10, f4, fMin));
                    float fLerp = AndroidUtilities.lerp(f11, f9, fMin);
                    if (counterView2.arrowCenter != fLerp) {
                        counterView2.arrowCenter = fLerp;
                        counterView2.invalidatePath = true;
                        counterView2.invalidate();
                    }
                    counterView2.setPivotX(counterView2.getMeasuredWidth() * fLerp);
                }
                float fMin2 = Math.min(1.0f, 2.0f * fMin);
                if (z10) {
                    limitPreviewView2.width1 = (int) AndroidUtilities.lerp(limitPreviewView2.animateIncreaseWidth, f8, fMin);
                    limitPreviewView2.limitsContainer.invalidate();
                } else {
                    counterView2.setScaleX(fMin2);
                    counterView2.setScaleY(fMin2);
                }
                if (z6) {
                    counterView2.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, fFloatValue));
                    counterView2.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, fFloatValue));
                    counterView2.setAlpha(fFloatValue);
                } else if (z7) {
                    float f12 = 1.0f - fFloatValue;
                    counterView2.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f12));
                    counterView2.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f12));
                    counterView2.setAlpha(f12);
                }
            }
        });
        this.arrowAnimator.addListener(new StoryViewer.AnonymousClass7(this, z9, 5));
        this.arrowAnimator.setInterpolator(new OvershootInterpolator());
        if (this.animateIncrease) {
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat3.addUpdateListener(new LimitPreviewView$$ExternalSyntheticLambda3(this, 0));
            valueAnimatorOfFloat3.setDuration(500L);
            valueAnimatorOfFloat3.start();
            this.arrowAnimator.setDuration(600L);
        } else if (z7) {
            this.arrowAnimator.setInterpolator(CubicBezierInterpolator.EASE_IN);
            this.arrowAnimator.setDuration(320L);
        } else if (z6) {
            this.arrowAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.arrowAnimator.setDuration(500L);
        } else {
            this.arrowAnimator.setDuration(1000L);
            this.arrowAnimator.setStartDelay(200L);
        }
        this.arrowAnimator.start();
        this.wasAnimation = true;
    }

    public void setBagePosition(float f) {
        this.position = MathUtils.clamp(f, 0.1f, 0.9f);
    }

    public final void setBoosts(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z) {
        int i;
        int i2 = tL_premium_boostsStatus.current_level_boosts;
        int i3 = tL_premium_boostsStatus.boosts;
        AnimatedTextView animatedTextView = this.defaultText;
        AnimatedTextView animatedTextView2 = this.premiumCount;
        if ((i2 == i3 && z) || (i = tL_premium_boostsStatus.next_level_boosts) == 0) {
            this.percent = 1.0f;
            int i4 = R.string.BoostsLevel;
            animatedTextView.setText(LocaleController.formatString("BoostsLevel", i4, Integer.valueOf(tL_premium_boostsStatus.level - 1)));
            animatedTextView2.setText(LocaleController.formatString("BoostsLevel", i4, Integer.valueOf(tL_premium_boostsStatus.level)));
        } else {
            this.percent = MathUtils.clamp((i3 - i2) / (i - i2), 0.0f, 1.0f);
            int i5 = R.string.BoostsLevel;
            animatedTextView.setText(LocaleController.formatString("BoostsLevel", i5, Integer.valueOf(tL_premium_boostsStatus.level)));
            animatedTextView2.setText(LocaleController.formatString("BoostsLevel", i5, Integer.valueOf(tL_premium_boostsStatus.level + 1)));
        }
        ((FrameLayout.LayoutParams) animatedTextView2.getLayoutParams()).gravity = 5;
        setType(17);
        this.defaultCount.setVisibility(8);
        this.premiumText.setVisibility(8);
        animatedTextView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
        animatedTextView.setTextColor(-1);
        setIconValue(tL_premium_boostsStatus.boosts, false);
        this.isBoostsStyle = true;
    }

    public void setDarkGradientProvider(DarkGradientProvider darkGradientProvider) {
        this.darkGradientProvider = darkGradientProvider;
    }

    public void setHideNegativeValues(boolean z) {
        this.hideNegativeValues = z;
    }

    public void setIconScale(float f) {
        this.iconScale = f;
    }

    public final void setIconValue(int i, boolean z) {
        ColoredImageSpan coloredImageSpan;
        TextPaint textPaint;
        ?? r4 = 1;
        if (i < 0) {
            coloredImageSpan = new ColoredImageSpan(R.drawable.warning_sign);
        } else {
            coloredImageSpan = new ColoredImageSpan(this.icon);
            float f = this.iconScale;
            coloredImageSpan.setScale(f, f);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(coloredImageSpan, 0, 1, 0);
        if (i >= 0 || !this.hideNegativeValues) {
            spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(i, ','));
        }
        CounterView counterView = this.limitIcon;
        if (z) {
            SpannableStringBuilder spannableStringBuilder2 = counterView.text;
            counterView.text = spannableStringBuilder;
            if (counterView.textLayout != null) {
                ArrayList arrayList = counterView.animatedLayouts;
                arrayList.clear();
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(counterView.text);
                int length = counterView.text.length() - 1;
                int i2 = 0;
                while (true) {
                    textPaint = counterView.textPaint;
                    if (length < 0) {
                        break;
                    }
                    char cCharAt = length < spannableStringBuilder2.length() ? spannableStringBuilder2.charAt(length) : ' ';
                    if (cCharAt != counterView.text.charAt(length) && Character.isDigit(counterView.text.charAt(length))) {
                        CounterView.AnimatedLayout animatedLayout = new CounterView.AnimatedLayout();
                        arrayList.add(animatedLayout);
                        animatedLayout.x = counterView.textLayout.getSecondaryHorizontal(length);
                        animatedLayout.replace = r4;
                        if (i2 >= r4) {
                            i2 = 0;
                        }
                        i2 += r4;
                        int i3 = (int) counterView.textWidth;
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        StaticLayout staticLayout = new StaticLayout("" + cCharAt, textPaint, i3, alignment, 1.0f, 0.0f, false);
                        ArrayList arrayList2 = animatedLayout.staticLayouts;
                        arrayList2.add(staticLayout);
                        arrayList2.add(new StaticLayout("" + counterView.text.charAt(length), textPaint, (int) counterView.textWidth, alignment, 1.0f, 0.0f, false));
                        spannableStringBuilder3.setSpan(new EmptyStubSpan(), length, length + 1, 0);
                    }
                    length--;
                    r4 = 1;
                }
                counterView.animatedStableLayout = new StaticLayout(spannableStringBuilder3, textPaint, AndroidUtilities.dp(12.0f) + ((int) counterView.textWidth), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    counterView.animationInProgress = true;
                    CounterView.AnimatedLayout animatedLayout2 = (CounterView.AnimatedLayout) arrayList.get(i4);
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    animatedLayout2.valueAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new LimitPreviewView$CounterView$$ExternalSyntheticLambda0(counterView, animatedLayout2, 0));
                    animatedLayout2.valueAnimator.addListener(new CounterView.AnonymousClass1(counterView, animatedLayout2, 1));
                    animatedLayout2.valueAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                    animatedLayout2.valueAnimator.setDuration(250L);
                    animatedLayout2.valueAnimator.setStartDelay(((long) ((arrayList.size() - 1) - i4)) * 60);
                    animatedLayout2.valueAnimator.start();
                }
            }
        } else {
            counterView.text = spannableStringBuilder;
        }
        counterView.requestLayout();
    }

    public void setParentViewForGradien(ViewGroup viewGroup) {
        this.parentVideForGradient = viewGroup;
    }

    public void setStarRating(TL_stars.Tl_starsRating tl_starsRating) {
        this.isRatingNegative = false;
        Paint paint = this.ratingPaint;
        int i = Theme.key_featuredStickers_addButton;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        paint.setColor(Theme.getColor(i, resourcesProvider));
        long j = tl_starsRating.current_level_stars;
        long j2 = tl_starsRating.stars;
        AnimatedTextView animatedTextView = this.defaultText;
        AnimatedTextView animatedTextView2 = this.premiumCount;
        if (j2 <= 0) {
            this.percent = 0.5f;
            animatedTextView.setText("");
            animatedTextView2.setText(LocaleController.getString(R.string.StarRatingLevelNegative));
            paint.setColor(Theme.getColor(Theme.key_color_red, resourcesProvider));
            this.isRatingNegative = true;
        } else {
            long j3 = tl_starsRating.next_level_stars;
            if (j3 == 0) {
                this.percent = 1.0f;
                int i2 = R.string.StarRatingLevel;
                animatedTextView.setText(LocaleController.formatString(i2, Integer.valueOf(tl_starsRating.level - 1)));
                animatedTextView2.setText(LocaleController.formatString(i2, Integer.valueOf(tl_starsRating.level)));
            } else {
                this.percent = MathUtils.clamp((j2 - j) / (j3 - j), 0.0f, 1.0f);
                int i3 = R.string.StarRatingLevel;
                animatedTextView.setText(LocaleController.formatString(i3, Integer.valueOf(tl_starsRating.level)));
                animatedTextView2.setText(LocaleController.formatString(i3, Integer.valueOf(tl_starsRating.level + 1)));
            }
        }
        ((FrameLayout.LayoutParams) animatedTextView2.getLayoutParams()).gravity = 5;
        setType(17);
        this.defaultCount.setVisibility(8);
        this.premiumText.setVisibility(8);
        animatedTextView2.setTextColor(this.isRatingNegative ? -1 : Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        animatedTextView.setTextColor(-1);
        setIconValue((int) tl_starsRating.stars, (int) tl_starsRating.next_level_stars);
        this.isBoostsStyle = true;
        this.isSimpleStyle = true;
        this.isRatingStyle = true;
    }

    public void setStaticGradinet(PremiumGradient.PremiumGradientTools premiumGradientTools) {
        this.staticGradient = premiumGradientTools;
    }

    public void setType(int i) {
        AnimatedTextView animatedTextView = this.premiumCount;
        int i2 = this.icon;
        CounterView counterView = this.limitIcon;
        if (i == 6) {
            if (counterView != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "d ").setSpan(new ColoredImageSpan(i2), 0, 1, 0);
                spannableStringBuilder.append((CharSequence) (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() ? "4 GB" : "2 GB"));
                counterView.text = spannableStringBuilder;
            }
            animatedTextView.setText("4 GB");
            return;
        }
        if (i == 11) {
            if (counterView != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) "d").setSpan(new ColoredImageSpan(i2), 0, 1, 0);
                counterView.text = spannableStringBuilder2;
            }
            animatedTextView.setText("");
        }
    }

    public final void setIconValue(int i, int i2) {
        if (i < 0) {
            setIconValue(i, false);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d").setSpan(new ColoredImageSpan(this.icon), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) " ").setSpan(new RelativeSizeSpan(0.8f), 1, 2, 0);
        spannableStringBuilder.append((CharSequence) (i > 1200 ? LocaleController.formatShortNumber(i, null) : LocaleController.formatNumber(i, ',')));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "\u200a/\u200a");
        spannableStringBuilder.append((CharSequence) (i2 > 1200 ? LocaleController.formatShortNumber(i2, null) : LocaleController.formatNumber(i2, ',')));
        spannableStringBuilder.setSpan(new EllipsizeSpanAnimator.TextAlphaSpan(170), length, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.65f), length, spannableStringBuilder.length(), 33);
        CounterView counterView = this.limitIcon;
        counterView.text = spannableStringBuilder;
        counterView.requestLayout();
    }
}
