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
    public final b8 f39344a;
    public final b8 f39345b;
    public b8 f39346c;
    public b8 d;
    public boolean f39347e;
    public int f39348f;
    public int f39349g;
    public int h;
    public boolean f39350i;
    public final Paint f39351j;
    public final Paint f39352k;
    public final Paint f39353l;
    public final ArrayList f39354m;

    public i1() {
        b8 b8Var = new b8(80, 80);
        this.f39344a = b8Var;
        b8 b8Var2 = new b8(80, 80);
        this.f39345b = b8Var2;
        this.f39348f = 0;
        this.f39349g = 0;
        Paint paint = new Paint(1);
        this.f39351j = paint;
        Paint paint2 = new Paint(1);
        this.f39352k = paint2;
        Paint paint3 = new Paint(1);
        this.f39353l = paint3;
        this.f39354m = new ArrayList();
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
        this.f39354m.add(view);
    }

    public final Paint b() {
        if (this.f39350i) {
            return this.f39352k;
        }
        return (Paint) this.f39345b.f335a;
    }

    public final void c() {
        ArrayList arrayList = this.f39354m;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f10, float f11) {
        float f12 = this.f39349g * 1.12f;
        b8 b8Var = this.f39345b;
        float f13 = -f10;
        float f14 = -f11;
        b8Var.m(f13 - ((f12 - this.f39348f) / 2.0f), f14 - ((f12 - this.f39349g) / 2.0f), f12 / ((Bitmap) b8Var.f337c).getHeight(), this.h);
        this.d.k(f13, f14, this.f39348f - f10, this.f39349g - f11);
    }

    public final void e(boolean z9) {
        if (this.f39350i && !z9) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final i1 f39332b;

                {
                    this.f39332b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            i1 i1Var = this.f39332b;
                            i1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i7 = (int) (35.0f * floatValue);
                            i1Var.f39353l.setAlpha(i7);
                            i1Var.f39352k.setAlpha((int) (floatValue * 102.0f));
                            i1Var.f39351j.setAlpha(i7);
                            i1Var.c();
                            return;
                        default:
                            i1 i1Var2 = this.f39332b;
                            i1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) i1Var2.f39345b.f335a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) i1Var2.f39344a.f335a).setAlpha((int) (floatValue2 * 255.0f));
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
                public final i1 f39332b;

                {
                    this.f39332b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            i1 i1Var = this.f39332b;
                            i1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i7 = (int) (35.0f * floatValue);
                            i1Var.f39353l.setAlpha(i7);
                            i1Var.f39352k.setAlpha((int) (floatValue * 102.0f));
                            i1Var.f39351j.setAlpha(i7);
                            i1Var.c();
                            return;
                        default:
                            i1 i1Var2 = this.f39332b;
                            i1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) i1Var2.f39345b.f335a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) i1Var2.f39344a.f335a).setAlpha((int) (floatValue2 * 255.0f));
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
            this.f39350i = z9;
        }
        c();
    }
}
