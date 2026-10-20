package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.p31;
public final class o1 {
    public final com.google.firebase.messaging.l f31610a;
    public final com.google.firebase.messaging.l f31611b;
    public com.google.firebase.messaging.l f31612c;
    public com.google.firebase.messaging.l d;
    public boolean e;
    public int f31613f;
    public int f31614g;
    public int h;
    public boolean f31615i;
    public final Paint f31616j;
    public final Paint f31617k;
    public final Paint f31618l;
    public final ArrayList f31619m;

    public o1() {
        com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l(80, 80);
        this.f31610a = lVar;
        com.google.firebase.messaging.l lVar2 = new com.google.firebase.messaging.l(80, 80);
        this.f31611b = lVar2;
        this.f31613f = 0;
        this.f31614g = 0;
        Paint paint = new Paint(1);
        this.f31616j = paint;
        Paint paint2 = new Paint(1);
        this.f31617k = paint2;
        Paint paint3 = new Paint(1);
        this.f31618l = paint3;
        this.f31619m = new ArrayList();
        lVar2.E(0.0f, 0.0f, 80.0f, 80.0f);
        lVar.E(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) lVar2.f7645a).setAlpha(180);
    }

    public final void a(View view) {
        this.f31619m.add(view);
    }

    public final Paint b() {
        if (this.f31615i) {
            return this.f31617k;
        }
        return (Paint) this.f31611b.f7645a;
    }

    public final void c() {
        ArrayList arrayList = this.f31619m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f7, float f10) {
        float f11 = this.f31614g * 1.12f;
        com.google.firebase.messaging.l lVar = this.f31611b;
        float f12 = -f7;
        float f13 = -f10;
        lVar.H(f12 - ((f11 - this.f31613f) / 2.0f), f13 - ((f11 - this.f31614g) / 2.0f), f11 / ((Bitmap) lVar.f7647c).getHeight(), this.h);
        this.d.E(f12, f13, this.f31613f - f7, this.f31614g - f10);
    }

    public final void e(boolean z10) {
        if (this.f31615i && !z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final o1 f31582b;

                {
                    this.f31582b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            o1 o1Var = this.f31582b;
                            o1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            o1Var.f31618l.setAlpha(i10);
                            o1Var.f31617k.setAlpha((int) (floatValue * 102.0f));
                            o1Var.f31616j.setAlpha(i10);
                            o1Var.c();
                            return;
                        default:
                            o1 o1Var2 = this.f31582b;
                            o1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) o1Var2.f31611b.f7645a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) o1Var2.f31610a.f7645a).setAlpha((int) (floatValue2 * 255.0f));
                            o1Var2.c();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new p31(this, 12));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final o1 f31582b;

                {
                    this.f31582b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            o1 o1Var = this.f31582b;
                            o1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            o1Var.f31618l.setAlpha(i10);
                            o1Var.f31617k.setAlpha((int) (floatValue * 102.0f));
                            o1Var.f31616j.setAlpha(i10);
                            o1Var.c();
                            return;
                        default:
                            o1 o1Var2 = this.f31582b;
                            o1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) o1Var2.f31611b.f7645a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) o1Var2.f31610a.f7645a).setAlpha((int) (floatValue2 * 255.0f));
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
            this.f31615i = z10;
        }
        c();
    }
}
