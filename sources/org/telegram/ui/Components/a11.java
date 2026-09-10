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
public abstract class a11 extends View {
    public boolean E;
    public float F;
    public Animator G;
    public uq0 H;
    public boolean I;
    public Path J;
    public StaticLayout f21348a;
    public TextPaint f21349b;
    public Paint f21350c;
    public int d;
    public OvershootInterpolator e;
    public float f21351f;
    public int h;
    public int f21352n;
    public int f21353r;
    public float f21354s;
    public float v;
    public int f21355w;
    public int f21356x;
    public int f21357y;

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
        ofFloat.addUpdateListener(new z01(this, 0));
        ofFloat.addListener(new zn0(this, 11));
        this.G = ofFloat;
        ofFloat.start();
    }

    public final void c() {
        uq0 uq0Var = this.H;
        AndroidUtilities.cancelRunOnUIThread(uq0Var);
        Animator animator = this.G;
        if (animator != null) {
            animator.removeAllListeners();
            this.G.cancel();
        }
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            this.E = true;
            setVisibility(0);
            this.F = 0.0f;
            this.f21351f = 0.0f;
            this.f21355w = this.h;
            this.f21356x = this.f21352n;
            this.f21354s = 1.0f;
            this.v = 1.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new z01(this, 1));
            ofFloat.setDuration(210L);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new z01(this, 2));
            ofFloat2.setStartDelay(600L);
            ofFloat2.setDuration(250L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat3.setStartDelay(500L);
            ofFloat3.addUpdateListener(new z01(this, 3));
            wr wrVar = wr.f28820g;
            ofFloat3.setInterpolator(wrVar);
            ofFloat3.setDuration(500L);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat4.setStartDelay(400L);
            ofFloat4.addUpdateListener(new z01(this, 4));
            ofFloat4.setInterpolator(wrVar);
            ofFloat4.setDuration(900L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            this.G = animatorSet;
            animatorSet.start();
            AndroidUtilities.runOnUIThread(uq0Var, 5000L);
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
        TextPaint textPaint2 = this.f21349b;
        Paint paint = this.f21350c;
        Path path = this.J;
        if (this.f21348a == null) {
            return;
        }
        super.onDraw(canvas);
        canvas2.save();
        canvas2.translate(this.d, (getMeasuredHeight() - this.f21348a.getHeight()) >> 1);
        if (this.f21351f != 0.0f) {
            StaticLayout staticLayout = this.f21348a;
            int i12 = this.f21355w;
            int i13 = this.f21356x;
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
        this.f21348a.draw(canvas2);
        int dp = AndroidUtilities.dp(14.0f);
        int lineForOffset3 = this.f21348a.getLineForOffset(this.f21356x);
        this.f21348a.getPrimaryHorizontal(this.f21356x);
        int lineBottom = this.f21348a.getLineBottom(lineForOffset3);
        int i14 = this.f21356x;
        int i15 = this.f21353r;
        if (i14 == i15) {
            b(path, this.f21348a.getPrimaryHorizontal(i15), this.f21348a.getLineTop(lineForOffset3), AndroidUtilities.dpf2(4.0f) + this.f21348a.getPrimaryHorizontal(this.f21353r), this.f21348a.getLineBottom(lineForOffset3), AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(4.0f), false, true);
            canvas2.drawPath(path, paint);
        }
        float interpolation = this.e.getInterpolation(this.f21351f);
        float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.v, AndroidUtilities.dpf2(4.0f), this.f21348a.getPrimaryHorizontal(this.f21353r));
        canvas2.save();
        canvas2.translate((int) (((this.f21348a.getPrimaryHorizontal(this.f21352n) - this.f21348a.getPrimaryHorizontal(this.f21353r)) * this.v) + z10), lineBottom);
        float f11 = dp;
        float f12 = f11 / 2.0f;
        canvas2.scale(interpolation, interpolation, f12, f12);
        path.reset();
        Path.Direction direction2 = Path.Direction.CCW;
        path.addCircle(f12, f12, f12, direction2);
        path.addRect(0.0f, 0.0f, f12, f12, direction2);
        canvas2.drawPath(path, textPaint2);
        canvas2.restore();
        int lineForOffset4 = this.f21348a.getLineForOffset(this.f21355w);
        this.f21348a.getPrimaryHorizontal(this.f21355w);
        int lineBottom2 = this.f21348a.getLineBottom(lineForOffset4);
        if (this.f21355w == 0) {
            i10 = dp;
            textPaint = textPaint2;
            direction = direction2;
            f10 = 1.0f;
            f7 = f11;
            i11 = lineBottom2;
            b(path, -AndroidUtilities.dp(4.0f), this.f21348a.getLineTop(lineForOffset4), 0.0f, this.f21348a.getLineBottom(lineForOffset4), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), true, false);
            canvas2.drawPath(path, paint);
        } else {
            i10 = dp;
            f7 = f11;
            textPaint = textPaint2;
            i11 = lineBottom2;
            direction = direction2;
            f10 = 1.0f;
        }
        canvas2.save();
        float primaryHorizontal3 = this.f21348a.getPrimaryHorizontal(0);
        canvas2.translate(((int) (((this.f21348a.getPrimaryHorizontal(this.h) - this.f21348a.getPrimaryHorizontal(0)) * this.f21354s) + com.google.android.gms.internal.vision.e2.a(f10, this.f21354s, AndroidUtilities.dp(4.0f), primaryHorizontal3))) - i10, i11);
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
        String str;
        super.onMeasure(i10, i11);
        if (getMeasuredWidth() != this.f21357y || this.f21348a == null) {
            Animator animator = this.G;
            if (animator != null) {
                animator.removeAllListeners();
                this.G.cancel();
            }
            String string = LocaleController.getString(R.string.TextSelectionHint);
            Matcher matcher = Pattern.compile("\\*\\*.*\\*\\*").matcher(string);
            if (matcher.matches()) {
                str = matcher.group();
            } else {
                str = null;
            }
            String replace = string.replace("**", "");
            this.f21348a = new StaticLayout(replace, this.f21349b, getMeasuredWidth() - (this.d * 2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = 0;
            this.f21352n = 0;
            if (str != null) {
                this.h = replace.indexOf(str);
            }
            int i12 = this.h;
            if (i12 > 0) {
                this.f21352n = str.length() + i12;
            } else {
                int i13 = 0;
                for (int i14 = 0; i14 < replace.length(); i14++) {
                    if (replace.charAt(i14) == ' ') {
                        i13++;
                        if (i13 == 2) {
                            this.h = i14 + 1;
                        }
                        if (i13 == 3) {
                            this.f21352n = i14 - 1;
                        }
                    }
                }
            }
            if (this.f21352n == 0) {
                this.f21352n = replace.length();
            }
            StaticLayout staticLayout = this.f21348a;
            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(staticLayout.getLineForOffset(this.f21352n), this.f21348a.getWidth() - 1);
            this.f21353r = offsetForHorizontal;
            this.f21355w = this.h;
            this.f21356x = this.f21352n;
            if (this.E) {
                this.F = 1.0f;
                this.f21351f = 1.0f;
                this.f21355w = 0;
                this.f21356x = offsetForHorizontal;
                this.f21354s = 0.0f;
                this.v = 0.0f;
            } else if (this.I) {
                c();
            }
            this.I = false;
            this.f21357y = getMeasuredWidth();
        }
        int D = org.telegram.messenger.a2.D(8.0f, 2, this.f21348a.getHeight());
        if (D < AndroidUtilities.dp(56.0f)) {
            D = AndroidUtilities.dp(56.0f);
        }
        setMeasuredDimension(getMeasuredWidth(), D);
    }
}
