package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.t81;
public final class q1 {
    public final com.google.firebase.messaging.n f29534a;
    public final com.google.firebase.messaging.n f29535b;
    public com.google.firebase.messaging.n f29536c;
    public com.google.firebase.messaging.n d;
    public boolean e;
    public int f29537f;
    public int f29538g;
    public int h;
    public boolean f29539i;
    public final Paint f29540j;
    public final Paint f29541k;
    public final Paint f29542l;
    public final ArrayList f29543m;

    public q1() {
        com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n(80, 80);
        this.f29534a = nVar;
        com.google.firebase.messaging.n nVar2 = new com.google.firebase.messaging.n(80, 80);
        this.f29535b = nVar2;
        this.f29537f = 0;
        this.f29538g = 0;
        Paint paint = new Paint(1);
        this.f29540j = paint;
        Paint paint2 = new Paint(1);
        this.f29541k = paint2;
        Paint paint3 = new Paint(1);
        this.f29542l = paint3;
        this.f29543m = new ArrayList();
        nVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        nVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) nVar2.f7328a).setAlpha(180);
    }

    public final void a(View view) {
        this.f29543m.add(view);
    }

    public final Paint b() {
        if (this.f29539i) {
            return this.f29541k;
        }
        return (Paint) this.f29535b.f7328a;
    }

    public final void c() {
        ArrayList arrayList = this.f29543m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f7, float f10) {
        float f11 = this.f29538g * 1.12f;
        com.google.firebase.messaging.n nVar = this.f29535b;
        float f12 = -f7;
        float f13 = -f10;
        nVar.B(f12 - ((f11 - this.f29537f) / 2.0f), f13 - ((f11 - this.f29538g) / 2.0f), f11 / ((Bitmap) nVar.f7330c).getHeight(), this.h);
        this.d.z(f12, f13, this.f29537f - f7, this.f29538g - f10);
    }

    public final void e(boolean z10) {
        if (this.f29539i && !z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final q1 f29525b;

                {
                    this.f29525b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            q1 q1Var = this.f29525b;
                            q1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            q1Var.f29542l.setAlpha(i10);
                            q1Var.f29541k.setAlpha((int) (floatValue * 102.0f));
                            q1Var.f29540j.setAlpha(i10);
                            q1Var.c();
                            return;
                        default:
                            q1 q1Var2 = this.f29525b;
                            q1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) q1Var2.f29535b.f7328a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) q1Var2.f29534a.f7328a).setAlpha((int) (floatValue2 * 255.0f));
                            q1Var2.c();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new t81(this, 7));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final q1 f29525b;

                {
                    this.f29525b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            q1 q1Var = this.f29525b;
                            q1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            q1Var.f29542l.setAlpha(i10);
                            q1Var.f29541k.setAlpha((int) (floatValue * 102.0f));
                            q1Var.f29540j.setAlpha(i10);
                            q1Var.c();
                            return;
                        default:
                            q1 q1Var2 = this.f29525b;
                            q1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) q1Var2.f29535b.f7328a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) q1Var2.f29534a.f7328a).setAlpha((int) (floatValue2 * 255.0f));
                            q1Var2.c();
                            return;
                    }
                }
            });
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setStartDelay(80L);
            ofFloat2.setDuration(80L);
            ofFloat2.start();
        } else {
            this.f29539i = z10;
        }
        c();
    }
}
