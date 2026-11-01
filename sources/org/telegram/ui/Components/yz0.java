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
public abstract class yz0 extends View {
    public int D;
    public boolean E;
    public float F;
    public Animator G;
    public vo0 H;
    public boolean I;
    public Path J;
    public StaticLayout f32938a;
    public TextPaint f32939b;
    public Paint f32940c;
    public int d;
    public OvershootInterpolator e;
    public float f32941f;
    public int h;
    public int f32942n;
    public int f32943r;
    public float f32944s;
    public float f32945w;
    public int f32946x;
    public int f32947y;

    public static void b(Path path, float f7, float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11) {
        path.reset();
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f14 < 0.0f) {
            f14 = 0.0f;
        }
        float f15 = f11 - f7;
        float f16 = f12 - f10;
        float f17 = f15 / 2.0f;
        if (f13 > f17) {
            f13 = f17;
        }
        float f18 = f16 / 2.0f;
        if (f14 > f18) {
            f14 = f18;
        }
        float f19 = f15 - (f13 * 2.0f);
        float f20 = f16 - (2.0f * f14);
        path.moveTo(f11, f10 + f14);
        if (z11) {
            float f21 = -f14;
            path.rQuadTo(0.0f, f21, -f13, f21);
        } else {
            path.rLineTo(0.0f, -f14);
            path.rLineTo(-f13, 0.0f);
        }
        path.rLineTo(-f19, 0.0f);
        if (z10) {
            float f22 = -f13;
            path.rQuadTo(f22, 0.0f, f22, f14);
        } else {
            path.rLineTo(-f13, 0.0f);
            path.rLineTo(0.0f, f14);
        }
        path.rLineTo(0.0f, f20);
        path.rLineTo(0.0f, f14);
        path.rLineTo(f13, 0.0f);
        path.rLineTo(f19, 0.0f);
        path.rLineTo(f13, 0.0f);
        path.rLineTo(0.0f, -f14);
        path.rLineTo(0.0f, -f20);
        path.close();
    }

    public final void a() {
        Animator animator = this.G;
        if (animator != null) {
            animator.removeAllListeners();
            this.G.cancel();
        }
        this.E = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, 0.0f);
        ofFloat.addUpdateListener(new xz0(this, 0));
        ofFloat.addListener(new t60(this, 28));
        this.G = ofFloat;
        ofFloat.start();
    }

    public final void c() {
        vo0 vo0Var = this.H;
        org.telegram.messenger.i0.r(vo0Var);
        Animator animator = this.G;
        if (animator != null) {
            animator.removeAllListeners();
            this.G.cancel();
        }
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            this.E = true;
            setVisibility(0);
            this.F = 0.0f;
            this.f32941f = 0.0f;
            this.f32946x = this.h;
            this.f32947y = this.f32942n;
            this.f32944s = 1.0f;
            this.f32945w = 1.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new xz0(this, 1));
            ofFloat.setDuration(210L);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new xz0(this, 2));
            ofFloat2.setStartDelay(600L);
            ofFloat2.setDuration(250L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat3.setStartDelay(500L);
            ofFloat3.addUpdateListener(new xz0(this, 3));
            gr grVar = gr.f26524g;
            ofFloat3.setInterpolator(grVar);
            ofFloat3.setDuration(500L);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat4.setStartDelay(400L);
            ofFloat4.addUpdateListener(new xz0(this, 4));
            ofFloat4.setInterpolator(grVar);
            ofFloat4.setDuration(900L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            this.G = animatorSet;
            animatorSet.start();
            org.telegram.messenger.i0.h3(vo0Var, 5000L);
            return;
        }
        this.I = true;
    }

    public float getPrepareProgress() {
        return this.F;
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i10;
        float f7;
        TextPaint textPaint;
        int i11;
        Path.Direction direction;
        float f10;
        Canvas canvas2 = canvas;
        TextPaint textPaint2 = this.f32939b;
        Paint paint = this.f32940c;
        Path path = this.J;
        if (this.f32938a == null) {
            return;
        }
        super.onDraw(canvas);
        canvas2.save();
        canvas2.translate(this.d, (getMeasuredHeight() - this.f32938a.getHeight()) >> 1);
        if (this.f32941f != 0.0f) {
            StaticLayout staticLayout = this.f32938a;
            int i12 = this.f32946x;
            int i13 = this.f32947y;
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
        this.f32938a.draw(canvas2);
        int L = org.telegram.messenger.i0.L(14.0f);
        int lineForOffset3 = this.f32938a.getLineForOffset(this.f32947y);
        this.f32938a.getPrimaryHorizontal(this.f32947y);
        int lineBottom = this.f32938a.getLineBottom(lineForOffset3);
        int i14 = this.f32947y;
        int i15 = this.f32943r;
        if (i14 == i15) {
            b(path, this.f32938a.getPrimaryHorizontal(i15), this.f32938a.getLineTop(lineForOffset3), org.telegram.messenger.i0.N(4.0f) + this.f32938a.getPrimaryHorizontal(this.f32943r), this.f32938a.getLineBottom(lineForOffset3), org.telegram.messenger.i0.N(4.0f), org.telegram.messenger.i0.N(4.0f), false, true);
            canvas2.drawPath(path, paint);
        }
        float interpolation = this.e.getInterpolation(this.f32941f);
        float z10 = c3.i0.z(1.0f, this.f32945w, org.telegram.messenger.i0.N(4.0f), this.f32938a.getPrimaryHorizontal(this.f32943r));
        canvas2.save();
        canvas2.translate((int) (((this.f32938a.getPrimaryHorizontal(this.f32942n) - this.f32938a.getPrimaryHorizontal(this.f32943r)) * this.f32945w) + z10), lineBottom);
        float f11 = L;
        float f12 = f11 / 2.0f;
        canvas2.scale(interpolation, interpolation, f12, f12);
        path.reset();
        Path.Direction direction2 = Path.Direction.CCW;
        path.addCircle(f12, f12, f12, direction2);
        path.addRect(0.0f, 0.0f, f12, f12, direction2);
        canvas2.drawPath(path, textPaint2);
        canvas2.restore();
        int lineForOffset4 = this.f32938a.getLineForOffset(this.f32946x);
        this.f32938a.getPrimaryHorizontal(this.f32946x);
        int lineBottom2 = this.f32938a.getLineBottom(lineForOffset4);
        if (this.f32946x == 0) {
            textPaint = textPaint2;
            f10 = 1.0f;
            i10 = L;
            direction = direction2;
            f7 = f11;
            i11 = lineBottom2;
            b(path, -org.telegram.messenger.i0.L(4.0f), this.f32938a.getLineTop(lineForOffset4), 0.0f, this.f32938a.getLineBottom(lineForOffset4), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), true, false);
            canvas2.drawPath(path, paint);
        } else {
            i10 = L;
            f7 = f11;
            textPaint = textPaint2;
            i11 = lineBottom2;
            direction = direction2;
            f10 = 1.0f;
        }
        canvas2.save();
        float primaryHorizontal3 = this.f32938a.getPrimaryHorizontal(0);
        canvas2.translate(((int) (((this.f32938a.getPrimaryHorizontal(this.h) - this.f32938a.getPrimaryHorizontal(0)) * this.f32944s) + sc.e.z(f10, this.f32944s, org.telegram.messenger.i0.L(4.0f), primaryHorizontal3))) - i10, i11);
        canvas2.scale(interpolation, interpolation, f12, f12);
        path.reset();
        path.addCircle(f12, f12, f12, direction);
        path.addRect(f12, 0.0f, f7, f12, direction);
        canvas2.drawPath(path, textPaint);
        canvas2.restore();
        canvas2.restore();
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getMeasuredWidth() != this.D || this.f32938a == null) {
            Animator animator = this.G;
            if (animator != null) {
                animator.removeAllListeners();
                this.G.cancel();
            }
            String str = null;
            String L0 = org.telegram.messenger.dd.L0(2131744217, null);
            Matcher matcher = Pattern.compile("\\*\\*.*\\*\\*").matcher(L0);
            if (matcher.matches()) {
                str = matcher.group();
            }
            String replace = L0.replace("**", "");
            this.f32938a = new StaticLayout(replace, this.f32939b, getMeasuredWidth() - (this.d * 2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = 0;
            this.f32942n = 0;
            if (str != null) {
                this.h = replace.indexOf(str);
            }
            int i12 = this.h;
            if (i12 > 0) {
                this.f32942n = str.length() + i12;
            } else {
                int i13 = 0;
                for (int i14 = 0; i14 < replace.length(); i14++) {
                    if (replace.charAt(i14) == ' ') {
                        i13++;
                        if (i13 == 2) {
                            this.h = i14 + 1;
                        }
                        if (i13 == 3) {
                            this.f32942n = i14 - 1;
                        }
                    }
                }
            }
            if (this.f32942n == 0) {
                this.f32942n = replace.length();
            }
            StaticLayout staticLayout = this.f32938a;
            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(staticLayout.getLineForOffset(this.f32942n), this.f32938a.getWidth() - 1);
            this.f32943r = offsetForHorizontal;
            this.f32946x = this.h;
            this.f32947y = this.f32942n;
            if (this.E) {
                this.F = 1.0f;
                this.f32941f = 1.0f;
                this.f32946x = 0;
                this.f32947y = offsetForHorizontal;
                this.f32944s = 0.0f;
                this.f32945w = 0.0f;
            } else if (this.I) {
                c();
            }
            this.I = false;
            this.D = getMeasuredWidth();
        }
        int D = org.telegram.messenger.m5.D(8.0f, 2, this.f32938a.getHeight());
        if (D < org.telegram.messenger.i0.L(56.0f)) {
            D = org.telegram.messenger.i0.L(56.0f);
        }
        setMeasuredDimension(getMeasuredWidth(), D);
    }
}
