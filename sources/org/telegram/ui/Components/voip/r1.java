package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.s81;
public final class r1 {
    public final com.google.firebase.messaging.n f29493a;
    public final com.google.firebase.messaging.n f29494b;
    public com.google.firebase.messaging.n f29495c;
    public com.google.firebase.messaging.n d;
    public boolean e;
    public int f29496f;
    public int f29497g;
    public int h;
    public boolean f29498i;
    public final Paint f29499j;
    public final Paint f29500k;
    public final Paint f29501l;
    public final ArrayList f29502m;

    public r1() {
        com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n(80, 80);
        this.f29493a = nVar;
        com.google.firebase.messaging.n nVar2 = new com.google.firebase.messaging.n(80, 80);
        this.f29494b = nVar2;
        this.f29496f = 0;
        this.f29497g = 0;
        Paint paint = new Paint(1);
        this.f29499j = paint;
        Paint paint2 = new Paint(1);
        this.f29500k = paint2;
        Paint paint3 = new Paint(1);
        this.f29501l = paint3;
        this.f29502m = new ArrayList();
        nVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        nVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) nVar2.f7312a).setAlpha(180);
    }

    public final void a(View view) {
        this.f29502m.add(view);
    }

    public final Paint b() {
        if (this.f29498i) {
            return this.f29500k;
        }
        return (Paint) this.f29494b.f7312a;
    }

    public final void c() {
        ArrayList arrayList = this.f29502m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f7, float f10) {
        float f11 = this.f29497g * 1.12f;
        com.google.firebase.messaging.n nVar = this.f29494b;
        float f12 = -f7;
        float f13 = -f10;
        nVar.B(f12 - ((f11 - this.f29496f) / 2.0f), f13 - ((f11 - this.f29497g) / 2.0f), f11 / ((Bitmap) nVar.f7314c).getHeight(), this.h);
        this.d.z(f12, f13, this.f29496f - f7, this.f29497g - f10);
    }

    public final void e(boolean z10) {
        if (this.f29498i && !z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final r1 f29484b;

                {
                    this.f29484b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            r1 r1Var = this.f29484b;
                            r1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            r1Var.f29501l.setAlpha(i10);
                            r1Var.f29500k.setAlpha((int) (floatValue * 102.0f));
                            r1Var.f29499j.setAlpha(i10);
                            r1Var.c();
                            return;
                        default:
                            r1 r1Var2 = this.f29484b;
                            r1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) r1Var2.f29494b.f7312a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) r1Var2.f29493a.f7312a).setAlpha((int) (floatValue2 * 255.0f));
                            r1Var2.c();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new s81(this, 7));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final r1 f29484b;

                {
                    this.f29484b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            r1 r1Var = this.f29484b;
                            r1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            r1Var.f29501l.setAlpha(i10);
                            r1Var.f29500k.setAlpha((int) (floatValue * 102.0f));
                            r1Var.f29499j.setAlpha(i10);
                            r1Var.c();
                            return;
                        default:
                            r1 r1Var2 = this.f29484b;
                            r1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) r1Var2.f29494b.f7312a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) r1Var2.f29493a.f7312a).setAlpha((int) (floatValue2 * 255.0f));
                            r1Var2.c();
                            return;
                    }
                }
            });
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setStartDelay(80L);
            ofFloat2.setDuration(80L);
            ofFloat2.start();
        } else {
            this.f29498i = z10;
        }
        c();
    }
}
