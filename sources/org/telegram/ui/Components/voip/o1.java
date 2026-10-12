package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.u61;
public final class o1 {
    public final com.google.firebase.messaging.m f30376a;
    public final com.google.firebase.messaging.m f30377b;
    public com.google.firebase.messaging.m f30378c;
    public com.google.firebase.messaging.m d;
    public boolean e;
    public int f30379f;
    public int f30380g;
    public int h;
    public boolean f30381i;
    public final Paint f30382j;
    public final Paint f30383k;
    public final Paint f30384l;
    public final ArrayList f30385m;

    public o1() {
        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m(80, 80);
        this.f30376a = mVar;
        com.google.firebase.messaging.m mVar2 = new com.google.firebase.messaging.m(80, 80);
        this.f30377b = mVar2;
        this.f30379f = 0;
        this.f30380g = 0;
        Paint paint = new Paint(1);
        this.f30382j = paint;
        Paint paint2 = new Paint(1);
        this.f30383k = paint2;
        Paint paint3 = new Paint(1);
        this.f30384l = paint3;
        this.f30385m = new ArrayList();
        mVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        mVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) mVar2.f6191a).setAlpha(180);
    }

    public final void a(View view) {
        this.f30385m.add(view);
    }

    public final Paint b() {
        if (this.f30381i) {
            return this.f30383k;
        }
        return (Paint) this.f30377b.f6191a;
    }

    public final void c() {
        ArrayList arrayList = this.f30385m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f7, float f10) {
        float f11 = this.f30380g * 1.12f;
        com.google.firebase.messaging.m mVar = this.f30377b;
        float f12 = -f7;
        float f13 = -f10;
        mVar.B(f12 - ((f11 - this.f30379f) / 2.0f), f13 - ((f11 - this.f30380g) / 2.0f), f11 / ((Bitmap) mVar.f6193c).getHeight(), this.h);
        this.d.z(f12, f13, this.f30379f - f7, this.f30380g - f10);
    }

    public final void e(boolean z10) {
        if (this.f30381i && !z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final o1 f30336b;

                {
                    this.f30336b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            o1 o1Var = this.f30336b;
                            o1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            o1Var.f30384l.setAlpha(i10);
                            o1Var.f30383k.setAlpha((int) (floatValue * 102.0f));
                            o1Var.f30382j.setAlpha(i10);
                            o1Var.c();
                            return;
                        default:
                            o1 o1Var2 = this.f30336b;
                            o1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) o1Var2.f30377b.f6191a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) o1Var2.f30376a.f6191a).setAlpha((int) (floatValue2 * 255.0f));
                            o1Var2.c();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new u61(this, 10));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final o1 f30336b;

                {
                    this.f30336b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            o1 o1Var = this.f30336b;
                            o1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            o1Var.f30384l.setAlpha(i10);
                            o1Var.f30383k.setAlpha((int) (floatValue * 102.0f));
                            o1Var.f30382j.setAlpha(i10);
                            o1Var.c();
                            return;
                        default:
                            o1 o1Var2 = this.f30336b;
                            o1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) o1Var2.f30377b.f6191a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) o1Var2.f30376a.f6191a).setAlpha((int) (floatValue2 * 255.0f));
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
            this.f30381i = z10;
        }
        c();
    }
}
