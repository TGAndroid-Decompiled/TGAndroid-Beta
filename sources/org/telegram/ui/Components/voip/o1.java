package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.p11;
public final class o1 {
    public final bg.c2 f33883a;
    public final bg.c2 f33884b;
    public bg.c2 f33885c;
    public bg.c2 d;
    public boolean f33886e;
    public int f33887f;
    public int f33888g;
    public int h;
    public boolean f33889i;
    public final Paint f33890j;
    public final Paint f33891k;
    public final Paint f33892l;
    public final ArrayList f33893m;

    public o1() {
        bg.c2 c2Var = new bg.c2(80, 80);
        this.f33883a = c2Var;
        bg.c2 c2Var2 = new bg.c2(80, 80);
        this.f33884b = c2Var2;
        this.f33887f = 0;
        this.f33888g = 0;
        Paint paint = new Paint(1);
        this.f33890j = paint;
        Paint paint2 = new Paint(1);
        this.f33891k = paint2;
        Paint paint3 = new Paint(1);
        this.f33892l = paint3;
        this.f33893m = new ArrayList();
        c2Var2.w(0.0f, 0.0f, 80.0f, 80.0f);
        c2Var.w(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) c2Var2.d).setAlpha(180);
    }

    public final void a(View view) {
        this.f33893m.add(view);
    }

    public final Paint b() {
        if (this.f33889i) {
            return this.f33891k;
        }
        return (Paint) this.f33884b.d;
    }

    public final void c() {
        ArrayList arrayList = this.f33893m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f9, float f10) {
        float f11 = this.f33888g * 1.12f;
        bg.c2 c2Var = this.f33884b;
        float f12 = -f9;
        float f13 = -f10;
        c2Var.y(f12 - ((f11 - this.f33887f) / 2.0f), f13 - ((f11 - this.f33888g) / 2.0f), f11 / ((Bitmap) c2Var.f2119b).getHeight(), this.h);
        this.d.w(f12, f13, this.f33887f - f9, this.f33888g - f10);
    }

    public final void e(boolean z10) {
        if (this.f33889i && !z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final o1 f33863b;

                {
                    this.f33863b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            o1 o1Var = this.f33863b;
                            o1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            o1Var.f33892l.setAlpha(i10);
                            o1Var.f33891k.setAlpha((int) (floatValue * 102.0f));
                            o1Var.f33890j.setAlpha(i10);
                            o1Var.c();
                            return;
                        default:
                            o1 o1Var2 = this.f33863b;
                            o1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) o1Var2.f33884b.d).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) o1Var2.f33883a.d).setAlpha((int) (floatValue2 * 255.0f));
                            o1Var2.c();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new p11(this, 14));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final o1 f33863b;

                {
                    this.f33863b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            o1 o1Var = this.f33863b;
                            o1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            o1Var.f33892l.setAlpha(i10);
                            o1Var.f33891k.setAlpha((int) (floatValue * 102.0f));
                            o1Var.f33890j.setAlpha(i10);
                            o1Var.c();
                            return;
                        default:
                            o1 o1Var2 = this.f33863b;
                            o1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) o1Var2.f33884b.d).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) o1Var2.f33883a.d).setAlpha((int) (floatValue2 * 255.0f));
                            o1Var2.c();
                            return;
                    }
                }
            });
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setStartDelay(80L);
            ofFloat2.setDuration(80L);
            ofFloat2.start();
        } else {
            this.f33889i = z10;
        }
        c();
    }
}
