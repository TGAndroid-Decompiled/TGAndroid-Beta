package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.o31;
public final class o1 {
    public final com.google.firebase.messaging.l f31766a;
    public final com.google.firebase.messaging.l f31767b;
    public com.google.firebase.messaging.l f31768c;
    public com.google.firebase.messaging.l d;
    public boolean e;
    public int f31769f;
    public int f31770g;
    public int h;
    public boolean f31771i;
    public final Paint f31772j;
    public final Paint f31773k;
    public final Paint f31774l;
    public final ArrayList f31775m;

    public o1() {
        com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l(80, 80);
        this.f31766a = lVar;
        com.google.firebase.messaging.l lVar2 = new com.google.firebase.messaging.l(80, 80);
        this.f31767b = lVar2;
        this.f31769f = 0;
        this.f31770g = 0;
        Paint paint = new Paint(1);
        this.f31772j = paint;
        Paint paint2 = new Paint(1);
        this.f31773k = paint2;
        Paint paint3 = new Paint(1);
        this.f31774l = paint3;
        this.f31775m = new ArrayList();
        lVar2.w(0.0f, 0.0f, 80.0f, 80.0f);
        lVar.w(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) lVar2.f7657a).setAlpha(180);
    }

    public final void a(View view) {
        this.f31775m.add(view);
    }

    public final Paint b() {
        if (this.f31771i) {
            return this.f31773k;
        }
        return (Paint) this.f31767b.f7657a;
    }

    public final void c() {
        ArrayList arrayList = this.f31775m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f7, float f10) {
        float f11 = this.f31770g * 1.12f;
        com.google.firebase.messaging.l lVar = this.f31767b;
        float f12 = -f7;
        float f13 = -f10;
        lVar.y(f12 - ((f11 - this.f31769f) / 2.0f), f13 - ((f11 - this.f31770g) / 2.0f), f11 / ((Bitmap) lVar.f7659c).getHeight(), this.h);
        this.d.w(f12, f13, this.f31769f - f7, this.f31770g - f10);
    }

    public final void e(boolean z10) {
        if (this.f31771i && !z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final o1 f31738b;

                {
                    this.f31738b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            o1 o1Var = this.f31738b;
                            o1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            o1Var.f31774l.setAlpha(i10);
                            o1Var.f31773k.setAlpha((int) (floatValue * 102.0f));
                            o1Var.f31772j.setAlpha(i10);
                            o1Var.c();
                            return;
                        default:
                            o1 o1Var2 = this.f31738b;
                            o1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) o1Var2.f31767b.f7657a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) o1Var2.f31766a.f7657a).setAlpha((int) (floatValue2 * 255.0f));
                            o1Var2.c();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new o31(this, 13));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final o1 f31738b;

                {
                    this.f31738b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            o1 o1Var = this.f31738b;
                            o1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            o1Var.f31774l.setAlpha(i10);
                            o1Var.f31773k.setAlpha((int) (floatValue * 102.0f));
                            o1Var.f31772j.setAlpha(i10);
                            o1Var.c();
                            return;
                        default:
                            o1 o1Var2 = this.f31738b;
                            o1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) o1Var2.f31767b.f7657a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) o1Var2.f31766a.f7657a).setAlpha((int) (floatValue2 * 255.0f));
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
            this.f31771i = z10;
        }
        c();
    }
}
