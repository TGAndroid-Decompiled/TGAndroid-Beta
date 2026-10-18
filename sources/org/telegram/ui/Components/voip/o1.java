package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.n31;
public final class o1 {
    public final com.google.firebase.messaging.l f31650a;
    public final com.google.firebase.messaging.l f31651b;
    public com.google.firebase.messaging.l f31652c;
    public com.google.firebase.messaging.l d;
    public boolean e;
    public int f31653f;
    public int f31654g;
    public int h;
    public boolean f31655i;
    public final Paint f31656j;
    public final Paint f31657k;
    public final Paint f31658l;
    public final ArrayList f31659m;

    public o1() {
        com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l(80, 80);
        this.f31650a = lVar;
        com.google.firebase.messaging.l lVar2 = new com.google.firebase.messaging.l(80, 80);
        this.f31651b = lVar2;
        this.f31653f = 0;
        this.f31654g = 0;
        Paint paint = new Paint(1);
        this.f31656j = paint;
        Paint paint2 = new Paint(1);
        this.f31657k = paint2;
        Paint paint3 = new Paint(1);
        this.f31658l = paint3;
        this.f31659m = new ArrayList();
        lVar2.E(0.0f, 0.0f, 80.0f, 80.0f);
        lVar.E(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) lVar2.f7646a).setAlpha(180);
    }

    public final void a(View view) {
        this.f31659m.add(view);
    }

    public final Paint b() {
        if (this.f31655i) {
            return this.f31657k;
        }
        return (Paint) this.f31651b.f7646a;
    }

    public final void c() {
        ArrayList arrayList = this.f31659m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f7, float f10) {
        float f11 = this.f31654g * 1.12f;
        com.google.firebase.messaging.l lVar = this.f31651b;
        float f12 = -f7;
        float f13 = -f10;
        lVar.G(f12 - ((f11 - this.f31653f) / 2.0f), f13 - ((f11 - this.f31654g) / 2.0f), f11 / ((Bitmap) lVar.f7648c).getHeight(), this.h);
        this.d.E(f12, f13, this.f31653f - f7, this.f31654g - f10);
    }

    public final void e(boolean z10) {
        if (this.f31655i && !z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final o1 f31622b;

                {
                    this.f31622b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            o1 o1Var = this.f31622b;
                            o1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            o1Var.f31658l.setAlpha(i10);
                            o1Var.f31657k.setAlpha((int) (floatValue * 102.0f));
                            o1Var.f31656j.setAlpha(i10);
                            o1Var.c();
                            return;
                        default:
                            o1 o1Var2 = this.f31622b;
                            o1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) o1Var2.f31651b.f7646a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) o1Var2.f31650a.f7646a).setAlpha((int) (floatValue2 * 255.0f));
                            o1Var2.c();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new n31(this, 12));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final o1 f31622b;

                {
                    this.f31622b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            o1 o1Var = this.f31622b;
                            o1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            o1Var.f31658l.setAlpha(i10);
                            o1Var.f31657k.setAlpha((int) (floatValue * 102.0f));
                            o1Var.f31656j.setAlpha(i10);
                            o1Var.c();
                            return;
                        default:
                            o1 o1Var2 = this.f31622b;
                            o1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) o1Var2.f31651b.f7646a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) o1Var2.f31650a.f7646a).setAlpha((int) (floatValue2 * 255.0f));
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
            this.f31655i = z10;
        }
        c();
    }
}
