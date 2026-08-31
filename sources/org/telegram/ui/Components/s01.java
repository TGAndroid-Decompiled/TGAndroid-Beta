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
public abstract class s01 extends View {
    public boolean B;
    public float C;
    public Animator D;
    public oq0 E;
    public boolean F;
    public Path G;
    public StaticLayout f30927a;
    public TextPaint f30928b;
    public Paint f30929c;
    public int d;
    public OvershootInterpolator f30930e;
    public float f30931f;
    public int h;
    public int f30932n;
    public int f30933r;
    public float f30934s;
    public float v;
    public int f30935w;
    public int f30936x;
    public int f30937y;

    public static void b(Path path, float f10, float f11, float f12, float f13, float f14, float f15, boolean z4, boolean z10) {
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
        if (z10) {
            float f22 = -f15;
            path.rQuadTo(0.0f, f22, -f14, f22);
        } else {
            path.rLineTo(0.0f, -f15);
            path.rLineTo(-f14, 0.0f);
        }
        path.rLineTo(-f20, 0.0f);
        if (z4) {
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
        Animator animator = this.D;
        if (animator != null) {
            animator.removeAllListeners();
            this.D.cancel();
        }
        this.B = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.C, 0.0f);
        ofFloat.addUpdateListener(new r01(this, 0));
        ofFloat.addListener(new pd0(this, 20));
        this.D = ofFloat;
        ofFloat.start();
    }

    public final void c() {
        oq0 oq0Var = this.E;
        AndroidUtilities.cancelRunOnUIThread(oq0Var);
        Animator animator = this.D;
        if (animator != null) {
            animator.removeAllListeners();
            this.D.cancel();
        }
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            this.B = true;
            setVisibility(0);
            this.C = 0.0f;
            this.f30931f = 0.0f;
            this.f30935w = this.h;
            this.f30936x = this.f30932n;
            this.f30934s = 1.0f;
            this.v = 1.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new r01(this, 1));
            ofFloat.setDuration(210L);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new r01(this, 2));
            ofFloat2.setStartDelay(600L);
            ofFloat2.setDuration(250L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat3.setStartDelay(500L);
            ofFloat3.addUpdateListener(new r01(this, 3));
            pr prVar = pr.f30184g;
            ofFloat3.setInterpolator(prVar);
            ofFloat3.setDuration(500L);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat4.setStartDelay(400L);
            ofFloat4.addUpdateListener(new r01(this, 4));
            ofFloat4.setInterpolator(prVar);
            ofFloat4.setDuration(900L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            this.D = animatorSet;
            animatorSet.start();
            AndroidUtilities.runOnUIThread(oq0Var, 5000L);
            return;
        }
        this.F = true;
    }

    public float getPrepareProgress() {
        return this.C;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i10;
        float f10;
        TextPaint textPaint;
        int i11;
        Path.Direction direction;
        float f11;
        Canvas canvas2 = canvas;
        TextPaint textPaint2 = this.f30928b;
        Paint paint = this.f30929c;
        Path path = this.G;
        if (this.f30927a == null) {
            return;
        }
        super.onDraw(canvas);
        canvas2.save();
        canvas2.translate(this.d, (getMeasuredHeight() - this.f30927a.getHeight()) >> 1);
        if (this.f30931f != 0.0f) {
            StaticLayout staticLayout = this.f30927a;
            int i12 = this.f30935w;
            int i13 = this.f30936x;
            int lineForOffset = staticLayout.getLineForOffset(i12);
            int lineForOffset2 = staticLayout.getLineForOffset(i13);
            int primaryHorizontal = (int) staticLayout.getPrimaryHorizontal(i12);
            int primaryHorizontal2 = (int) staticLayout.getPrimaryHorizontal(i13);
            if (lineForOffset == lineForOffset2) {
                canvas2.drawRect(primaryHorizontal, staticLayout.getLineTop(lineForOffset), primaryHorizontal2, staticLayout.getLineBottom(lineForOffset), paint);
            } else {
                canvas.drawRect(primaryHorizontal, staticLayout.getLineTop(lineForOffset), staticLayout.getLineWidth(lineForOffset), staticLayout.getLineBottom(lineForOffset), paint);
                canvas.drawRect(0.0f, staticLayout.getLineTop(lineForOffset2), primaryHorizontal2, staticLayout.getLineBottom(lineForOffset2), paint);
                while (true) {
                    lineForOffset++;
                    if (lineForOffset >= lineForOffset2) {
                        break;
                    }
                    canvas.drawRect(0.0f, staticLayout.getLineTop(lineForOffset), staticLayout.getLineWidth(lineForOffset), staticLayout.getLineBottom(lineForOffset), paint);
                }
            }
            canvas2 = canvas;
        }
        this.f30927a.draw(canvas2);
        int dp = AndroidUtilities.dp(14.0f);
        int lineForOffset3 = this.f30927a.getLineForOffset(this.f30936x);
        this.f30927a.getPrimaryHorizontal(this.f30936x);
        int lineBottom = this.f30927a.getLineBottom(lineForOffset3);
        int i14 = this.f30936x;
        int i15 = this.f30933r;
        if (i14 == i15) {
            b(path, this.f30927a.getPrimaryHorizontal(i15), this.f30927a.getLineTop(lineForOffset3), AndroidUtilities.dpf2(4.0f) + this.f30927a.getPrimaryHorizontal(this.f30933r), this.f30927a.getLineBottom(lineForOffset3), AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(4.0f), false, true);
            canvas2.drawPath(path, paint);
        }
        float interpolation = this.f30930e.getInterpolation(this.f30931f);
        float w10 = e2.c.w(1.0f, this.v, AndroidUtilities.dpf2(4.0f), this.f30927a.getPrimaryHorizontal(this.f30933r));
        canvas2.save();
        canvas2.translate((int) (((this.f30927a.getPrimaryHorizontal(this.f30932n) - this.f30927a.getPrimaryHorizontal(this.f30933r)) * this.v) + w10), lineBottom);
        float f12 = dp;
        float f13 = f12 / 2.0f;
        canvas2.scale(interpolation, interpolation, f13, f13);
        path.reset();
        Path.Direction direction2 = Path.Direction.CCW;
        path.addCircle(f13, f13, f13, direction2);
        path.addRect(0.0f, 0.0f, f13, f13, direction2);
        canvas2.drawPath(path, textPaint2);
        canvas2.restore();
        int lineForOffset4 = this.f30927a.getLineForOffset(this.f30935w);
        this.f30927a.getPrimaryHorizontal(this.f30935w);
        int lineBottom2 = this.f30927a.getLineBottom(lineForOffset4);
        if (this.f30935w == 0) {
            i10 = dp;
            textPaint = textPaint2;
            direction = direction2;
            f11 = 1.0f;
            f10 = f12;
            i11 = lineBottom2;
            b(path, -AndroidUtilities.dp(4.0f), this.f30927a.getLineTop(lineForOffset4), 0.0f, this.f30927a.getLineBottom(lineForOffset4), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), true, false);
            canvas2.drawPath(path, paint);
        } else {
            i10 = dp;
            f10 = f12;
            textPaint = textPaint2;
            i11 = lineBottom2;
            direction = direction2;
            f11 = 1.0f;
        }
        canvas2.save();
        float primaryHorizontal3 = this.f30927a.getPrimaryHorizontal(0);
        canvas2.translate(((int) (((this.f30927a.getPrimaryHorizontal(this.h) - this.f30927a.getPrimaryHorizontal(0)) * this.f30934s) + org.telegram.ui.yh.c(f11, this.f30934s, AndroidUtilities.dp(4.0f), primaryHorizontal3))) - i10, i11);
        canvas2.scale(interpolation, interpolation, f13, f13);
        path.reset();
        path.addCircle(f13, f13, f13, direction);
        path.addRect(f13, 0.0f, f10, f13, direction);
        canvas2.drawPath(path, textPaint);
        canvas2.restore();
        canvas2.restore();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        String str;
        super.onMeasure(i10, i11);
        if (getMeasuredWidth() != this.f30937y || this.f30927a == null) {
            Animator animator = this.D;
            if (animator != null) {
                animator.removeAllListeners();
                this.D.cancel();
            }
            String string = LocaleController.getString(R.string.TextSelectionHint);
            Matcher matcher = Pattern.compile("\\*\\*.*\\*\\*").matcher(string);
            if (matcher.matches()) {
                str = matcher.group();
            } else {
                str = null;
            }
            String replace = string.replace("**", "");
            this.f30927a = new StaticLayout(replace, this.f30928b, getMeasuredWidth() - (this.d * 2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = 0;
            this.f30932n = 0;
            if (str != null) {
                this.h = replace.indexOf(str);
            }
            int i12 = this.h;
            if (i12 > 0) {
                this.f30932n = str.length() + i12;
            } else {
                int i13 = 0;
                for (int i14 = 0; i14 < replace.length(); i14++) {
                    if (replace.charAt(i14) == ' ') {
                        i13++;
                        if (i13 == 2) {
                            this.h = i14 + 1;
                        }
                        if (i13 == 3) {
                            this.f30932n = i14 - 1;
                        }
                    }
                }
            }
            if (this.f30932n == 0) {
                this.f30932n = replace.length();
            }
            StaticLayout staticLayout = this.f30927a;
            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(staticLayout.getLineForOffset(this.f30932n), this.f30927a.getWidth() - 1);
            this.f30933r = offsetForHorizontal;
            this.f30935w = this.h;
            this.f30936x = this.f30932n;
            if (this.B) {
                this.C = 1.0f;
                this.f30931f = 1.0f;
                this.f30935w = 0;
                this.f30936x = offsetForHorizontal;
                this.f30934s = 0.0f;
                this.v = 0.0f;
            } else if (this.F) {
                c();
            }
            this.F = false;
            this.f30937y = getMeasuredWidth();
        }
        int D = org.telegram.messenger.y3.D(8.0f, 2, this.f30927a.getHeight());
        if (D < AndroidUtilities.dp(56.0f)) {
            D = AndroidUtilities.dp(56.0f);
        }
        setMeasuredDimension(getMeasuredWidth(), D);
    }
}
