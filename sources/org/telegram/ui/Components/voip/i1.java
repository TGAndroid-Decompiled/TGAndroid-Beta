package org.telegram.ui.Components.voip;

import a8.b8;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.va;
public final class i1 {
    public final b8 f39264a;
    public final b8 f39265b;
    public b8 f39266c;
    public b8 d;
    public boolean f39267e;
    public int f39268f;
    public int f39269g;
    public int h;
    public boolean f39270i;
    public final Paint f39271j;
    public final Paint f39272k;
    public final Paint f39273l;
    public final ArrayList f39274m;

    public i1() {
        b8 b8Var = new b8(80, 80);
        this.f39264a = b8Var;
        b8 b8Var2 = new b8(80, 80);
        this.f39265b = b8Var2;
        this.f39268f = 0;
        this.f39269g = 0;
        Paint paint = new Paint(1);
        this.f39271j = paint;
        Paint paint2 = new Paint(1);
        this.f39272k = paint2;
        Paint paint3 = new Paint(1);
        this.f39273l = paint3;
        this.f39274m = new ArrayList();
        b8Var2.k(0.0f, 0.0f, 80.0f, 80.0f);
        b8Var.k(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) b8Var2.f335a).setAlpha(180);
    }

    public final void a(View view) {
        this.f39274m.add(view);
    }

    public final Paint b() {
        if (this.f39270i) {
            return this.f39272k;
        }
        return (Paint) this.f39265b.f335a;
    }

    public final void c() {
        ArrayList arrayList = this.f39274m;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f10, float f11) {
        float f12 = this.f39269g * 1.12f;
        b8 b8Var = this.f39265b;
        float f13 = -f10;
        float f14 = -f11;
        b8Var.m(f13 - ((f12 - this.f39268f) / 2.0f), f14 - ((f12 - this.f39269g) / 2.0f), f12 / ((Bitmap) b8Var.f337c).getHeight(), this.h);
        this.d.k(f13, f14, this.f39268f - f10, this.f39269g - f11);
    }

    public final void e(boolean z9) {
        if (this.f39270i && !z9) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final i1 f39252b;

                {
                    this.f39252b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            i1 i1Var = this.f39252b;
                            i1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i7 = (int) (35.0f * floatValue);
                            i1Var.f39273l.setAlpha(i7);
                            i1Var.f39272k.setAlpha((int) (floatValue * 102.0f));
                            i1Var.f39271j.setAlpha(i7);
                            i1Var.c();
                            return;
                        default:
                            i1 i1Var2 = this.f39252b;
                            i1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) i1Var2.f39265b.f335a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) i1Var2.f39264a.f335a).setAlpha((int) (floatValue2 * 255.0f));
                            i1Var2.c();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new va(this, 14));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final i1 f39252b;

                {
                    this.f39252b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            i1 i1Var = this.f39252b;
                            i1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i7 = (int) (35.0f * floatValue);
                            i1Var.f39273l.setAlpha(i7);
                            i1Var.f39272k.setAlpha((int) (floatValue * 102.0f));
                            i1Var.f39271j.setAlpha(i7);
                            i1Var.c();
                            return;
                        default:
                            i1 i1Var2 = this.f39252b;
                            i1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) i1Var2.f39265b.f335a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) i1Var2.f39264a.f335a).setAlpha((int) (floatValue2 * 255.0f));
                            i1Var2.c();
                            return;
                    }
                }
            });
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setStartDelay(80L);
            ofFloat2.setDuration(80L);
            ofFloat2.start();
        } else {
            this.f39270i = z9;
        }
        c();
    }
}
