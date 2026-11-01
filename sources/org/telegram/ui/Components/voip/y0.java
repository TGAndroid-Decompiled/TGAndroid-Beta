package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.s9;
public final class y0 {
    public final j2.f f31833a;
    public final j2.f f31834b;
    public j2.f f31835c;
    public j2.f d;
    public boolean e;
    public int f31836f;
    public int f31837g;
    public int h;
    public boolean f31838i;
    public final Paint f31839j;
    public final Paint f31840k;
    public final Paint f31841l;
    public final ArrayList f31842m;

    public y0() {
        j2.f fVar = new j2.f(80, 80);
        this.f31833a = fVar;
        j2.f fVar2 = new j2.f(80, 80);
        this.f31834b = fVar2;
        this.f31836f = 0;
        this.f31837g = 0;
        Paint paint = new Paint(1);
        this.f31839j = paint;
        Paint paint2 = new Paint(1);
        this.f31840k = paint2;
        Paint paint3 = new Paint(1);
        this.f31841l = paint3;
        this.f31842m = new ArrayList();
        fVar2.x(0.0f, 0.0f, 80.0f, 80.0f);
        fVar.x(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) fVar2.f9348a).setAlpha(180);
    }

    public final void a(View view) {
        this.f31842m.add(view);
    }

    public final Paint b() {
        if (this.f31838i) {
            return this.f31840k;
        }
        return (Paint) this.f31834b.f9348a;
    }

    public final void c() {
        ArrayList arrayList = this.f31842m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f7, float f10) {
        float f11 = this.f31837g * 1.12f;
        j2.f fVar = this.f31834b;
        float f12 = -f7;
        float f13 = -f10;
        fVar.z(f12 - ((f11 - this.f31836f) / 2.0f), f13 - ((f11 - this.f31837g) / 2.0f), f11 / ((Bitmap) fVar.f9350c).getHeight(), this.h);
        this.d.x(f12, f13, this.f31836f - f7, this.f31837g - f10);
    }

    public final void e(boolean z10) {
        if (this.f31838i && !z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final y0 f31826b;

                {
                    this.f31826b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            y0 y0Var = this.f31826b;
                            y0Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            y0Var.f31841l.setAlpha(i10);
                            y0Var.f31840k.setAlpha((int) (floatValue * 102.0f));
                            y0Var.f31839j.setAlpha(i10);
                            y0Var.c();
                            return;
                        default:
                            y0 y0Var2 = this.f31826b;
                            y0Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) y0Var2.f31834b.f9348a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) y0Var2.f31833a.f9348a).setAlpha((int) (floatValue2 * 255.0f));
                            y0Var2.c();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new s9(this, 25));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final y0 f31826b;

                {
                    this.f31826b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            y0 y0Var = this.f31826b;
                            y0Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            y0Var.f31841l.setAlpha(i10);
                            y0Var.f31840k.setAlpha((int) (floatValue * 102.0f));
                            y0Var.f31839j.setAlpha(i10);
                            y0Var.c();
                            return;
                        default:
                            y0 y0Var2 = this.f31826b;
                            y0Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) y0Var2.f31834b.f9348a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) y0Var2.f31833a.f9348a).setAlpha((int) (floatValue2 * 255.0f));
                            y0Var2.c();
                            return;
                    }
                }
            });
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setStartDelay(80L);
            ofFloat2.setDuration(80L);
            ofFloat2.start();
        } else {
            this.f31838i = z10;
        }
        c();
    }
}
