package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.DiffUtil;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.Theme;

public abstract class TextSelectionHint extends View {
    public Animator a;
    public int animateToEnd;
    public int currentEnd;
    public int currentStart;
    public final SeekBarView$$ExternalSyntheticLambda1 dismissTunnable;
    public int end;
    public float endOffsetValue;
    public float enterValue;
    public final OvershootInterpolator interpolator;
    public int lastW;
    public final int padding;
    public final Path path;
    public float prepareProgress;
    public final Paint selectionPaint;
    public boolean showOnMeasure;
    public boolean showing;
    public int start;
    public float startOffsetValue;
    public StaticLayout textLayout;
    public final TextPaint textPaint;

    public TextSelectionHint(Activity activity, Theme.ResourcesProvider resourcesProvider) {
        super(activity);
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        Paint paint = new Paint(1);
        this.selectionPaint = paint;
        this.padding = AndroidUtilities.dp(24.0f);
        this.interpolator = new OvershootInterpolator();
        this.dismissTunnable = new SeekBarView$$ExternalSyntheticLambda1(this, 28);
        this.path = new Path();
        int color = Theme.getColor(Theme.key_undo_infoColor, resourcesProvider);
        int iAlpha = Color.alpha(color);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(color);
        paint.setColor(color);
        paint.setAlpha((int) (((double) iAlpha) * 0.14d));
        setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.getColor(Theme.key_undo_background, resourcesProvider)));
    }

    public static void roundedRect(Path path, float f, float f2, float f3, float f4, float f5, float f6, boolean z, boolean z2) {
        path.reset();
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        float f7 = f3 - f;
        float f8 = f4 - f2;
        float f9 = f7 / 2.0f;
        if (f5 > f9) {
            f5 = f9;
        }
        float f10 = f8 / 2.0f;
        if (f6 > f10) {
            f6 = f10;
        }
        float f11 = f7 - (f5 * 2.0f);
        float f12 = f8 - (2.0f * f6);
        path.moveTo(f3, f2 + f6);
        if (z2) {
            float f13 = -f6;
            path.rQuadTo(0.0f, f13, -f5, f13);
        } else {
            path.rLineTo(0.0f, -f6);
            path.rLineTo(-f5, 0.0f);
        }
        path.rLineTo(-f11, 0.0f);
        if (z) {
            float f14 = -f5;
            path.rQuadTo(f14, 0.0f, f14, f6);
        } else {
            path.rLineTo(-f5, 0.0f);
            path.rLineTo(0.0f, f6);
        }
        path.rLineTo(0.0f, f12);
        path.rLineTo(0.0f, f6);
        path.rLineTo(f5, 0.0f);
        path.rLineTo(f11, 0.0f);
        path.rLineTo(f5, 0.0f);
        path.rLineTo(0.0f, -f6);
        path.rLineTo(0.0f, -f12);
        path.close();
    }

    public float getPrepareProgress() {
        return this.prepareProgress;
    }

    public final void hideInternal() {
        Animator animator = this.a;
        if (animator != null) {
            animator.removeAllListeners();
            this.a.cancel();
        }
        this.showing = false;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.prepareProgress, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new TextSelectionHint$$ExternalSyntheticLambda0(this, 0));
        valueAnimatorOfFloat.addListener(new Tooltip.AnonymousClass1(this, 12));
        this.a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    @Override
    public void onDraw(Canvas canvas) {
        TextPaint textPaint;
        int i;
        float f;
        Canvas canvas2 = canvas;
        if (this.textLayout == null) {
            return;
        }
        super.onDraw(canvas);
        canvas2.save();
        canvas2.translate(this.padding, (getMeasuredHeight() - this.textLayout.getHeight()) >> 1);
        float f2 = this.enterValue;
        Paint paint = this.selectionPaint;
        if (f2 != 0.0f) {
            StaticLayout staticLayout = this.textLayout;
            int i2 = this.currentStart;
            int i3 = this.currentEnd;
            int lineForOffset = staticLayout.getLineForOffset(i2);
            int lineForOffset2 = staticLayout.getLineForOffset(i3);
            int primaryHorizontal = (int) staticLayout.getPrimaryHorizontal(i2);
            int primaryHorizontal2 = (int) staticLayout.getPrimaryHorizontal(i3);
            if (lineForOffset != lineForOffset2) {
                canvas.drawRect(primaryHorizontal, staticLayout.getLineTop(lineForOffset), staticLayout.getLineWidth(lineForOffset), staticLayout.getLineBottom(lineForOffset), paint);
                canvas.drawRect(0.0f, staticLayout.getLineTop(lineForOffset2), primaryHorizontal2, staticLayout.getLineBottom(lineForOffset2), paint);
                while (true) {
                    lineForOffset++;
                    if (lineForOffset >= lineForOffset2) {
                        break;
                    } else {
                        canvas.drawRect(0.0f, staticLayout.getLineTop(lineForOffset), staticLayout.getLineWidth(lineForOffset), staticLayout.getLineBottom(lineForOffset), paint);
                    }
                }
            } else {
                canvas2.drawRect(primaryHorizontal, staticLayout.getLineTop(lineForOffset), primaryHorizontal2, staticLayout.getLineBottom(lineForOffset), paint);
            }
            canvas2 = canvas;
        }
        this.textLayout.draw(canvas2);
        int iDp = AndroidUtilities.dp(14.0f);
        int lineForOffset3 = this.textLayout.getLineForOffset(this.currentEnd);
        this.textLayout.getPrimaryHorizontal(this.currentEnd);
        int lineBottom = this.textLayout.getLineBottom(lineForOffset3);
        int i4 = this.currentEnd;
        int i5 = this.animateToEnd;
        Path path = this.path;
        if (i4 == i5) {
            roundedRect(path, this.textLayout.getPrimaryHorizontal(i5), this.textLayout.getLineTop(lineForOffset3), AndroidUtilities.dpf2(4.0f) + this.textLayout.getPrimaryHorizontal(this.animateToEnd), this.textLayout.getLineBottom(lineForOffset3), AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(4.0f), false, true);
            canvas2.drawPath(path, paint);
        }
        float interpolation = this.interpolator.getInterpolation(this.enterValue);
        int primaryHorizontal3 = (int) (((this.textLayout.getPrimaryHorizontal(this.end) - this.textLayout.getPrimaryHorizontal(this.animateToEnd)) * this.endOffsetValue) + DiffUtil.m(1.0f, this.endOffsetValue, AndroidUtilities.dpf2(4.0f), this.textLayout.getPrimaryHorizontal(this.animateToEnd)));
        canvas2.save();
        canvas2.translate(primaryHorizontal3, lineBottom);
        float f3 = iDp;
        float f4 = f3 / 2.0f;
        canvas2.scale(interpolation, interpolation, f4, f4);
        path.reset();
        Path.Direction direction = Path.Direction.CCW;
        path.addCircle(f4, f4, f4, direction);
        path.addRect(0.0f, 0.0f, f4, f4, direction);
        TextPaint textPaint2 = this.textPaint;
        canvas2.drawPath(path, textPaint2);
        canvas2.restore();
        int lineForOffset4 = this.textLayout.getLineForOffset(this.currentStart);
        this.textLayout.getPrimaryHorizontal(this.currentStart);
        int lineBottom2 = this.textLayout.getLineBottom(lineForOffset4);
        if (this.currentStart == 0) {
            i = lineBottom2;
            textPaint = textPaint2;
            f = 1.0f;
            roundedRect(path, -AndroidUtilities.dp(4.0f), this.textLayout.getLineTop(lineForOffset4), 0.0f, this.textLayout.getLineBottom(lineForOffset4), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), true, false);
            canvas2.drawPath(path, paint);
        } else {
            textPaint = textPaint2;
            i = lineBottom2;
            f = 1.0f;
        }
        canvas2.save();
        canvas2.translate(((int) (((this.textLayout.getPrimaryHorizontal(this.start) - this.textLayout.getPrimaryHorizontal(0)) * this.startOffsetValue) + BotFullscreenButtons$$ExternalSyntheticOutline0.m(f, this.startOffsetValue, AndroidUtilities.dp(4.0f), this.textLayout.getPrimaryHorizontal(0)))) - iDp, i);
        canvas2.scale(interpolation, interpolation, f4, f4);
        path.reset();
        path.addCircle(f4, f4, f4, direction);
        path.addRect(f4, 0.0f, f3, f4, direction);
        canvas2.drawPath(path, textPaint);
        canvas2.restore();
        canvas2.restore();
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMeasuredWidth() != this.lastW || this.textLayout == null) {
            Animator animator = this.a;
            if (animator != null) {
                animator.removeAllListeners();
                this.a.cancel();
            }
            String string = LocaleController.getString(R.string.TextSelectionHint);
            Matcher matcher = Pattern.compile("\\*\\*.*\\*\\*").matcher(string);
            String strGroup = matcher.matches() ? matcher.group() : null;
            String strReplace = string.replace("**", "");
            this.textLayout = new StaticLayout(strReplace, this.textPaint, getMeasuredWidth() - (this.padding * 2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.start = 0;
            this.end = 0;
            if (strGroup != null) {
                this.start = strReplace.indexOf(strGroup);
            }
            int i3 = this.start;
            if (i3 > 0) {
                this.end = strGroup.length() + i3;
            } else {
                int i4 = 0;
                for (int i5 = 0; i5 < strReplace.length(); i5++) {
                    if (strReplace.charAt(i5) == ' ') {
                        i4++;
                        if (i4 == 2) {
                            this.start = i5 + 1;
                        }
                        if (i4 == 3) {
                            this.end = i5 - 1;
                        }
                    }
                }
            }
            if (this.end == 0) {
                this.end = strReplace.length();
            }
            StaticLayout staticLayout = this.textLayout;
            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(staticLayout.getLineForOffset(this.end), this.textLayout.getWidth() - 1);
            this.animateToEnd = offsetForHorizontal;
            this.currentStart = this.start;
            this.currentEnd = this.end;
            if (this.showing) {
                this.prepareProgress = 1.0f;
                this.enterValue = 1.0f;
                this.currentStart = 0;
                this.currentEnd = offsetForHorizontal;
                this.startOffsetValue = 0.0f;
                this.endOffsetValue = 0.0f;
            } else if (this.showOnMeasure) {
                show();
            }
            this.showOnMeasure = false;
            this.lastW = getMeasuredWidth();
        }
        int iM = RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(2, 8.0f, this.textLayout.getHeight());
        if (iM < AndroidUtilities.dp(56.0f)) {
            iM = AndroidUtilities.dp(56.0f);
        }
        setMeasuredDimension(getMeasuredWidth(), iM);
    }

    public final void show() {
        SeekBarView$$ExternalSyntheticLambda1 seekBarView$$ExternalSyntheticLambda1 = this.dismissTunnable;
        AndroidUtilities.cancelRunOnUIThread(seekBarView$$ExternalSyntheticLambda1);
        Animator animator = this.a;
        if (animator != null) {
            animator.removeAllListeners();
            this.a.cancel();
        }
        if (getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            this.showOnMeasure = true;
            return;
        }
        this.showing = true;
        setVisibility(0);
        this.prepareProgress = 0.0f;
        this.enterValue = 0.0f;
        this.currentStart = this.start;
        this.currentEnd = this.end;
        this.startOffsetValue = 1.0f;
        this.endOffsetValue = 1.0f;
        invalidate();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new TextSelectionHint$$ExternalSyntheticLambda0(this, 1));
        valueAnimatorOfFloat.setDuration(210L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(new TextSelectionHint$$ExternalSyntheticLambda0(this, 2));
        valueAnimatorOfFloat2.setStartDelay(600L);
        valueAnimatorOfFloat2.setDuration(250L);
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setStartDelay(500L);
        valueAnimatorOfFloat3.addUpdateListener(new TextSelectionHint$$ExternalSyntheticLambda0(this, 3));
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT;
        valueAnimatorOfFloat3.setInterpolator(cubicBezierInterpolator);
        valueAnimatorOfFloat3.setDuration(500L);
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat4.setStartDelay(400L);
        valueAnimatorOfFloat4.addUpdateListener(new TextSelectionHint$$ExternalSyntheticLambda0(this, 4));
        valueAnimatorOfFloat4.setInterpolator(cubicBezierInterpolator);
        valueAnimatorOfFloat4.setDuration(900L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfFloat3, valueAnimatorOfFloat4);
        this.a = animatorSet;
        animatorSet.start();
        AndroidUtilities.runOnUIThread(seekBarView$$ExternalSyntheticLambda1, 5000L);
    }
}
