package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.k61;
public final class o1 {
    public final com.google.firebase.messaging.n f31698a;
    public final com.google.firebase.messaging.n f31699b;
    public com.google.firebase.messaging.n f31700c;
    public com.google.firebase.messaging.n d;
    public boolean f31701e;
    public int f31702f;
    public int f31703g;
    public int h;
    public boolean f31704i;
    public final Paint f31705j;
    public final Paint f31706k;
    public final Paint f31707l;
    public final ArrayList f31708m;

    public o1() {
        com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n(80, 80);
        this.f31698a = nVar;
        com.google.firebase.messaging.n nVar2 = new com.google.firebase.messaging.n(80, 80);
        this.f31699b = nVar2;
        this.f31702f = 0;
        this.f31703g = 0;
        Paint paint = new Paint(1);
        this.f31705j = paint;
        Paint paint2 = new Paint(1);
        this.f31706k = paint2;
        Paint paint3 = new Paint(1);
        this.f31707l = paint3;
        this.f31708m = new ArrayList();
        nVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        nVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) nVar2.f6374a).setAlpha(180);
    }

    public final void a(View view) {
        this.f31708m.add(view);
    }

    public final Paint b() {
        if (this.f31704i) {
            return this.f31706k;
        }
        return (Paint) this.f31699b.f6374a;
    }

    public final void c() {
        ArrayList arrayList = this.f31708m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f7, float f10) {
        float f11 = this.f31703g * 1.12f;
        com.google.firebase.messaging.n nVar = this.f31699b;
        float f12 = -f7;
        float f13 = -f10;
        nVar.B(f12 - ((f11 - this.f31702f) / 2.0f), f13 - ((f11 - this.f31703g) / 2.0f), f11 / ((Bitmap) nVar.f6376c).getHeight(), this.h);
        this.d.z(f12, f13, this.f31702f - f7, this.f31703g - f10);
    }

    public final void e(boolean z10) {
        if (this.f31704i && !z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final o1 f31668b;

                {
                    this.f31668b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            o1 o1Var = this.f31668b;
                            o1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            o1Var.f31707l.setAlpha(i10);
                            o1Var.f31706k.setAlpha((int) (floatValue * 102.0f));
                            o1Var.f31705j.setAlpha(i10);
                            o1Var.c();
                            return;
                        default:
                            o1 o1Var2 = this.f31668b;
                            o1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) o1Var2.f31699b.f6374a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) o1Var2.f31698a.f6374a).setAlpha((int) (floatValue2 * 255.0f));
                            o1Var2.c();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new k61(this, 9));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final o1 f31668b;

                {
                    this.f31668b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            o1 o1Var = this.f31668b;
                            o1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            o1Var.f31707l.setAlpha(i10);
                            o1Var.f31706k.setAlpha((int) (floatValue * 102.0f));
                            o1Var.f31705j.setAlpha(i10);
                            o1Var.c();
                            return;
                        default:
                            o1 o1Var2 = this.f31668b;
                            o1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) o1Var2.f31699b.f6374a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) o1Var2.f31698a.f6374a).setAlpha((int) (floatValue2 * 255.0f));
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
            this.f31704i = z10;
        }
        c();
    }
}
