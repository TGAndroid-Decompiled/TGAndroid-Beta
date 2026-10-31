package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.s9;
public final class x0 {
    public final j2.f f31753a;
    public final j2.f f31754b;
    public j2.f f31755c;
    public j2.f d;
    public boolean e;
    public int f31756f;
    public int f31757g;
    public int h;
    public boolean f31758i;
    public final Paint f31759j;
    public final Paint f31760k;
    public final Paint f31761l;
    public final ArrayList f31762m;

    public x0() {
        j2.f fVar = new j2.f(80, 80);
        this.f31753a = fVar;
        j2.f fVar2 = new j2.f(80, 80);
        this.f31754b = fVar2;
        this.f31756f = 0;
        this.f31757g = 0;
        Paint paint = new Paint(1);
        this.f31759j = paint;
        Paint paint2 = new Paint(1);
        this.f31760k = paint2;
        Paint paint3 = new Paint(1);
        this.f31761l = paint3;
        this.f31762m = new ArrayList();
        fVar2.x(0.0f, 0.0f, 80.0f, 80.0f);
        fVar.x(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) fVar2.f9347a).setAlpha(180);
    }

    public final void a(View view) {
        this.f31762m.add(view);
    }

    public final Paint b() {
        if (this.f31758i) {
            return this.f31760k;
        }
        return (Paint) this.f31754b.f9347a;
    }

    public final void c() {
        ArrayList arrayList = this.f31762m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f7, float f10) {
        float f11 = this.f31757g * 1.12f;
        j2.f fVar = this.f31754b;
        float f12 = -f7;
        float f13 = -f10;
        fVar.z(f12 - ((f11 - this.f31756f) / 2.0f), f13 - ((f11 - this.f31757g) / 2.0f), f11 / ((Bitmap) fVar.f9349c).getHeight(), this.h);
        this.d.x(f12, f13, this.f31756f - f7, this.f31757g - f10);
    }

    public final void e(boolean z10) {
        if (this.f31758i && !z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final x0 f31746b;

                {
                    this.f31746b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            x0 x0Var = this.f31746b;
                            x0Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            x0Var.f31761l.setAlpha(i10);
                            x0Var.f31760k.setAlpha((int) (floatValue * 102.0f));
                            x0Var.f31759j.setAlpha(i10);
                            x0Var.c();
                            return;
                        default:
                            x0 x0Var2 = this.f31746b;
                            x0Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) x0Var2.f31754b.f9347a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) x0Var2.f31753a.f9347a).setAlpha((int) (floatValue2 * 255.0f));
                            x0Var2.c();
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
                public final x0 f31746b;

                {
                    this.f31746b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            x0 x0Var = this.f31746b;
                            x0Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            x0Var.f31761l.setAlpha(i10);
                            x0Var.f31760k.setAlpha((int) (floatValue * 102.0f));
                            x0Var.f31759j.setAlpha(i10);
                            x0Var.c();
                            return;
                        default:
                            x0 x0Var2 = this.f31746b;
                            x0Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) x0Var2.f31754b.f9347a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) x0Var2.f31753a.f9347a).setAlpha((int) (floatValue2 * 255.0f));
                            x0Var2.c();
                            return;
                    }
                }
            });
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setStartDelay(80L);
            ofFloat2.setDuration(80L);
            ofFloat2.start();
        } else {
            this.f31758i = z10;
        }
        c();
    }
}
