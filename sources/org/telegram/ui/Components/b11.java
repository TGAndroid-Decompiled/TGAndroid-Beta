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
public abstract class b11 extends View {
    public boolean E;
    public float F;
    public Animator G;
    public wq0 H;
    public boolean I;
    public Path J;
    public StaticLayout f22839a;
    public TextPaint f22840b;
    public Paint f22841c;
    public int d;
    public OvershootInterpolator e;
    public float f22842f;
    public int h;
    public int f22843n;
    public int f22844r;
    public float f22845s;
    public float v;
    public int f22846w;
    public int f22847x;
    public int f22848y;

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
        ofFloat.addUpdateListener(new a11(this, 0));
        ofFloat.addListener(new dd0(this, 22));
        this.G = ofFloat;
        ofFloat.start();
    }

    public final void c() {
        wq0 wq0Var = this.H;
        AndroidUtilities.cancelRunOnUIThread(wq0Var);
        Animator animator = this.G;
        if (animator != null) {
            animator.removeAllListeners();
            this.G.cancel();
        }
        if (getMeasuredHeight() != 0 && getMeasuredWidth() != 0) {
            this.E = true;
            setVisibility(0);
            this.F = 0.0f;
            this.f22842f = 0.0f;
            this.f22846w = this.h;
            this.f22847x = this.f22843n;
            this.f22845s = 1.0f;
            this.v = 1.0f;
            invalidate();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a11(this, 1));
            ofFloat.setDuration(210L);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new a11(this, 2));
            ofFloat2.setStartDelay(600L);
            ofFloat2.setDuration(250L);
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat3.setStartDelay(500L);
            ofFloat3.addUpdateListener(new a11(this, 3));
            qr qrVar = qr.f27643g;
            ofFloat3.setInterpolator(qrVar);
            ofFloat3.setDuration(500L);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat4.setStartDelay(400L);
            ofFloat4.addUpdateListener(new a11(this, 4));
            ofFloat4.setInterpolator(qrVar);
            ofFloat4.setDuration(900L);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playSequentially(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            this.G = animatorSet;
            animatorSet.start();
            AndroidUtilities.runOnUIThread(wq0Var, 5000L);
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
        TextPaint textPaint2 = this.f22840b;
        Paint paint = this.f22841c;
        Path path = this.J;
        if (this.f22839a == null) {
            return;
        }
        super.onDraw(canvas);
        canvas2.save();
        canvas2.translate(this.d, (getMeasuredHeight() - this.f22839a.getHeight()) >> 1);
        if (this.f22842f != 0.0f) {
            StaticLayout staticLayout = this.f22839a;
            int i12 = this.f22846w;
            int i13 = this.f22847x;
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
        this.f22839a.draw(canvas2);
        int dp = AndroidUtilities.dp(14.0f);
        int lineForOffset3 = this.f22839a.getLineForOffset(this.f22847x);
        this.f22839a.getPrimaryHorizontal(this.f22847x);
        int lineBottom = this.f22839a.getLineBottom(lineForOffset3);
        int i14 = this.f22847x;
        int i15 = this.f22844r;
        if (i14 == i15) {
            b(path, this.f22839a.getPrimaryHorizontal(i15), this.f22839a.getLineTop(lineForOffset3), AndroidUtilities.dpf2(4.0f) + this.f22839a.getPrimaryHorizontal(this.f22844r), this.f22839a.getLineBottom(lineForOffset3), AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(4.0f), false, true);
            canvas2.drawPath(path, paint);
        }
        float interpolation = this.e.getInterpolation(this.f22842f);
        float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, this.v, AndroidUtilities.dpf2(4.0f), this.f22839a.getPrimaryHorizontal(this.f22844r));
        canvas2.save();
        canvas2.translate((int) (((this.f22839a.getPrimaryHorizontal(this.f22843n) - this.f22839a.getPrimaryHorizontal(this.f22844r)) * this.v) + z10), lineBottom);
        float f11 = dp;
        float f12 = f11 / 2.0f;
        canvas2.scale(interpolation, interpolation, f12, f12);
        path.reset();
        Path.Direction direction2 = Path.Direction.CCW;
        path.addCircle(f12, f12, f12, direction2);
        path.addRect(0.0f, 0.0f, f12, f12, direction2);
        canvas2.drawPath(path, textPaint2);
        canvas2.restore();
        int lineForOffset4 = this.f22839a.getLineForOffset(this.f22846w);
        this.f22839a.getPrimaryHorizontal(this.f22846w);
        int lineBottom2 = this.f22839a.getLineBottom(lineForOffset4);
        if (this.f22846w == 0) {
            i10 = dp;
            textPaint = textPaint2;
            direction = direction2;
            f10 = 1.0f;
            f7 = f11;
            i11 = lineBottom2;
            b(path, -AndroidUtilities.dp(4.0f), this.f22839a.getLineTop(lineForOffset4), 0.0f, this.f22839a.getLineBottom(lineForOffset4), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), true, false);
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
        float primaryHorizontal3 = this.f22839a.getPrimaryHorizontal(0);
        canvas2.translate(((int) (((this.f22839a.getPrimaryHorizontal(this.h) - this.f22839a.getPrimaryHorizontal(0)) * this.f22845s) + com.google.android.gms.internal.vision.e2.b(f10, this.f22845s, AndroidUtilities.dp(4.0f), primaryHorizontal3))) - i10, i11);
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
        if (getMeasuredWidth() != this.f22848y || this.f22839a == null) {
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
            this.f22839a = new StaticLayout(replace, this.f22840b, getMeasuredWidth() - (this.d * 2), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = 0;
            this.f22843n = 0;
            if (str != null) {
                this.h = replace.indexOf(str);
            }
            int i12 = this.h;
            if (i12 > 0) {
                this.f22843n = str.length() + i12;
            } else {
                int i13 = 0;
                for (int i14 = 0; i14 < replace.length(); i14++) {
                    if (replace.charAt(i14) == ' ') {
                        i13++;
                        if (i13 == 2) {
                            this.h = i14 + 1;
                        }
                        if (i13 == 3) {
                            this.f22843n = i14 - 1;
                        }
                    }
                }
            }
            if (this.f22843n == 0) {
                this.f22843n = replace.length();
            }
            StaticLayout staticLayout = this.f22839a;
            int offsetForHorizontal = staticLayout.getOffsetForHorizontal(staticLayout.getLineForOffset(this.f22843n), this.f22839a.getWidth() - 1);
            this.f22844r = offsetForHorizontal;
            this.f22846w = this.h;
            this.f22847x = this.f22843n;
            if (this.E) {
                this.F = 1.0f;
                this.f22842f = 1.0f;
                this.f22846w = 0;
                this.f22847x = offsetForHorizontal;
                this.f22845s = 0.0f;
                this.v = 0.0f;
            } else if (this.I) {
                c();
            }
            this.I = false;
            this.f22848y = getMeasuredWidth();
        }
        int D = org.telegram.messenger.l0.D(8.0f, 2, this.f22839a.getHeight());
        if (D < AndroidUtilities.dp(56.0f)) {
            D = AndroidUtilities.dp(56.0f);
        }
        setMeasuredDimension(getMeasuredWidth(), D);
    }
}
