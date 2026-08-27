package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public abstract class wz0 extends View {
    public boolean A;
    public float B;
    public Animator C;
    public up0 D;
    public boolean E;
    public Path F;

    public StaticLayout f34398a;

    public TextPaint f34399b;

    public Paint f34400c;
    public int d;

    public OvershootInterpolator f34401e;

    public float f34402f;
    public int h;

    public int f34403n;

    public int f34404r;

    public float f34405s;
    public float v;

    public int f34406w;

    public int f34407x;

    public int f34408y;

    public static void b(Path path, float f10, float f11, float f12, float f13, float f14, float f15, boolean z10, boolean z11) {
        path.reset();
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        if (f15 < 0.0f) {
            f15 = 0.0f;
        }
        float f16 = f12 - f10;
        float f17 = f13 - f11;
        float f18 = f16 / 2.0f;
        if (f14 > f18) {
            f14 = f18;
        }
        float f19 = f17 / 2.0f;
        if (f15 > f19) {
            f15 = f19;
        }
        float f20 = f16 - (f14 * 2.0f);
        float f21 = f17 - (2.0f * f15);
        path.moveTo(f12, f11 + f15);
        if (z11) {
            float f22 = -f15;
            path.rQuadTo(0.0f, f22, -f14, f22);
        } else {
            path.rLineTo(0.0f, -f15);
            path.rLineTo(-f14, 0.0f);
        }
        path.rLineTo(-f20, 0.0f);
        if (z10) {
            float f23 = -f14;
            path.rQuadTo(f23, 0.0f, f23, f15);
        } else {
            path.rLineTo(-f14, 0.0f);
            path.rLineTo(0.0f, f15);
        }
        path.rLineTo(0.0f, f21);
        path.rLineTo(0.0f, f15);
        path.rLineTo(f14, 0.0f);
        path.rLineTo(f20, 0.0f);
        path.rLineTo(f14, 0.0f);
        path.rLineTo(0.0f, -f15);
        path.rLineTo(0.0f, -f21);
        path.close();
    }

    public final void a() {
        Animator animator = this.C;
        if (animator != null) {
            animator.removeAllListeners();
            this.C.cancel();
        }
        this.A = false;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.B, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new vz0(this, 0));
        valueAnimatorOfFloat.addListener(new sz(this, 29));
        this.C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    public final void c() {
        up0 up0Var = this.D;
        AndroidUtilities.cancelRunOnUIThread(up0Var);
        Animator animator = this.C;
        if (animator != null) {
            animator.removeAllListeners();
            this.C.cancel();
        }
        if (getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            this.E = true;
            return;
        }
        this.A = true;
        setVisibility(0);
        this.B = 0.0f;
        this.f34402f = 0.0f;
        this.f34406w = this.h;
        this.f34407x = this.f34403n;
        this.f34405s = 1.0f;
        this.v = 1.0f;
        invalidate();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new vz0(this, 1));
        valueAnimatorOfFloat.setDuration(210L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(new vz0(this, 2));
        valueAnimatorOfFloat2.setStartDelay(600L);
        valueAnimatorOfFloat2.setDuration(250L);
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setStartDelay(500L);
        valueAnimatorOfFloat3.addUpdateListener(new vz0(this, 3));
        er erVar = er.f28123g;
        valueAnimatorOfFloat3.setInterpolator(erVar);
        valueAnimatorOfFloat3.setDuration(500L);
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat4.setStartDelay(400L);
        valueAnimatorOfFloat4.addUpdateListener(new vz0(this, 4));
        valueAnimatorOfFloat4.setInterpolator(erVar);
        valueAnimatorOfFloat4.setDuration(900L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfFloat3, valueAnimatorOfFloat4);
        this.C = animatorSet;
        animatorSet.start();
        AndroidUtilities.runOnUIThread(up0Var, 5000L);
    }

    public float getPrepareProgress() {
        return this.B;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i10;
        Path.Direction direction;
        float f10;
        Canvas canvas2 = canvas;
        TextPaint textPaint = this.f34399b;
        Paint paint = this.f34400c;
        Path path = this.F;
        if (this.f34398a == null) {
            return;
        }
        super.onDraw(canvas);
        canvas2.save();
        canvas2.translate(this.d, (getMeasuredHeight() - this.f34398a.getHeight()) >> 1);
        if (this.f34402f != 0.0f) {
            StaticLayout staticLayout = this.f34398a;
            int i11 = this.f34406w;
            int i12 = this.f34407x;
            int lineForOffset = staticLayout.getLineForOffset(i11);
            int lineForOffset2 = staticLayout.getLineForOffset(i12);
            int primaryHorizontal = (int) staticLayout.getPrimaryHorizontal(i11);
            int primaryHorizontal2 = (int) staticLayout.getPrimaryHorizontal(i12);
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
        this.f34398a.draw(canvas2);
        int iDp = AndroidUtilities.dp(14.0f);
        int lineForOffset3 = this.f34398a.getLineForOffset(this.f34407x);
        this.f34398a.getPrimaryHorizontal(this.f34407x);
        int lineBottom = this.f34398a.getLineBottom(lineForOffset3);
        int i13 = this.f34407x;
        int i14 = this.f34404r;
        if (i13 == i14) {
            b(path, this.f34398a.getPrimaryHorizontal(i14), this.f34398a.getLineTop(lineForOffset3), AndroidUtilities.dpf2(4.0f) + this.f34398a.getPrimaryHorizontal(this.f34404r), this.f34398a.getLineBottom(lineForOffset3), AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(4.0f), false, true);
            canvas2.drawPath(path, paint);
        }
        float interpolation = this.f34401e.getInterpolation(this.f34402f);
        int primaryHorizontal3 = (int) (((this.f34398a.getPrimaryHorizontal(this.f34403n) - this.f34398a.getPrimaryHorizontal(this.f34404r)) * this.v) + com.google.android.recaptcha.internal.a.z(1.0f, this.v, AndroidUtilities.dpf2(4.0f), this.f34398a.getPrimaryHorizontal(this.f34404r)));
        canvas2.save();
        canvas2.translate(primaryHorizontal3, lineBottom);
        float f11 = iDp;
        float f12 = f11 / 2.0f;
        canvas2.scale(interpolation, interpolation, f12, f12);
        path.reset();
        Path.Direction direction2 = Path.Direction.CCW;
        path.addCircle(f12, f12, f12, direction2);
        path.addRect(0.0f, 0.0f, f12, f12, direction2);
        canvas2.drawPath(path, textPaint);
        canvas2.restore();
        int lineForOffset4 = this.f34398a.getLineForOffset(this.f34406w);
        this.f34398a.getPrimaryHorizontal(this.f34406w);
        int lineBottom2 = this.f34398a.getLineBottom(lineForOffset4);
        if (this.f34406w == 0) {
            direction = direction2;
            f10 = 1.0f;
            i10 = lineBottom2;
            b(path, -AndroidUtilities.dp(4.0f), this.f34398a.getLineTop(lineForOffset4), 0.0f, this.f34398a.getLineBottom(lineForOffset4), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), true, false);
            canvas2.drawPath(path, paint);
        } else {
            i10 = lineBottom2;
            direction = direction2;
            f10 = 1.0f;
        }
        canvas2.save();
        canvas2.translate(((int) (((this.f34398a.getPrimaryHorizontal(this.h) - this.f34398a.getPrimaryHorizontal(0)) * this.f34405s) + org.telegram.ui.Cells.pa.b(f10, this.f34405s, AndroidUtilities.dp(4.0f), this.f34398a.getPrimaryHorizontal(0)))) - iDp, i10);
        canvas2.scale(interpolation, interpolation, f12, f12);
        path.reset();
        path.addCircle(f12, f12, f12, direction);
        path.addRect(f12, 0.0f, f11, f12, direction);
        canvas2.drawPath(path, textPaint);
        canvas2.restore();
        canvas2.restore();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getMeasuredWidth() != this.f34408y || this.f34398a == null) {
            Animator animator = this.C;
            if (animator != null) {
                animator.removeAllListeners();
                this.C.cancel();
            }
            String string = LocaleController.getString(R.string.TextSelectionHint);
            Matcher matcher = Pattern.compile("\\*\\*.*\\*\\*").matcher(string);
            String strGroup = matcher.matches() ? matcher.group() : null;
            String strReplace = string.replace("**", "");
            this.f34398a = new StaticLayout(strReplace, this.f34399b, getMeasuredWidth() - (this.d * 2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = 0;
            this.f34403n = 0;
            if (strGroup != null) {
                this.h = strReplace.indexOf(strGroup);
            }
            int i12 = this.h;
            if (i12 > 0) {
                this.f34403n = strGroup.length() + i12;
            } else {
                int i13 = 0;
                for (int i14 = 0; i14 < strReplace.length(); i14++) {
                    if (strReplace.charAt(i14) == ' ') {
                        i13++;
                        if (i13 == 2) {
                            this.h = i14 + 1;
                        }
                        if (i13 == 3) {
                            this.f34403n = i14 - 1;
                        }
                    }
                }
            }
            if (this.f34403n == 0) {
                this.f34403n = strReplace.length();
            }
            StaticLayout staticLayout = this.f34398a;
            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(staticLayout.getLineForOffset(this.f34403n), this.f34398a.getWidth() - 1);
            this.f34404r = offsetForHorizontal;
            this.f34406w = this.h;
            this.f34407x = this.f34403n;
            if (this.A) {
                this.B = 1.0f;
                this.f34402f = 1.0f;
                this.f34406w = 0;
                this.f34407x = offsetForHorizontal;
                this.f34405s = 0.0f;
                this.v = 0.0f;
            } else if (this.E) {
                c();
            }
            this.E = false;
            this.f34408y = getMeasuredWidth();
        }
        int iD = org.telegram.messenger.y1.D(8.0f, 2, this.f34398a.getHeight());
        if (iD < AndroidUtilities.dp(56.0f)) {
            iD = AndroidUtilities.dp(56.0f);
        }
        setMeasuredDimension(getMeasuredWidth(), iD);
    }
}
