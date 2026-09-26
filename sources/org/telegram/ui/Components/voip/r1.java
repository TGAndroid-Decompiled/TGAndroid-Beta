package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.r81;
public final class r1 {
    public final com.google.firebase.messaging.n f29498a;
    public final com.google.firebase.messaging.n f29499b;
    public com.google.firebase.messaging.n f29500c;
    public com.google.firebase.messaging.n d;
    public boolean e;
    public int f29501f;
    public int f29502g;
    public int h;
    public boolean f29503i;
    public final Paint f29504j;
    public final Paint f29505k;
    public final Paint f29506l;
    public final ArrayList f29507m;

    public r1() {
        com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n(80, 80);
        this.f29498a = nVar;
        com.google.firebase.messaging.n nVar2 = new com.google.firebase.messaging.n(80, 80);
        this.f29499b = nVar2;
        this.f29501f = 0;
        this.f29502g = 0;
        Paint paint = new Paint(1);
        this.f29504j = paint;
        Paint paint2 = new Paint(1);
        this.f29505k = paint2;
        Paint paint3 = new Paint(1);
        this.f29506l = paint3;
        this.f29507m = new ArrayList();
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
        this.f29507m.add(view);
    }

    public final Paint b() {
        if (this.f29503i) {
            return this.f29505k;
        }
        return (Paint) this.f29499b.f7312a;
    }

    public final void c() {
        ArrayList arrayList = this.f29507m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f7, float f10) {
        float f11 = this.f29502g * 1.12f;
        com.google.firebase.messaging.n nVar = this.f29499b;
        float f12 = -f7;
        float f13 = -f10;
        nVar.B(f12 - ((f11 - this.f29501f) / 2.0f), f13 - ((f11 - this.f29502g) / 2.0f), f11 / ((Bitmap) nVar.f7314c).getHeight(), this.h);
        this.d.z(f12, f13, this.f29501f - f7, this.f29502g - f10);
    }

    public final void e(boolean z10) {
        if (this.f29503i && !z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final r1 f29489b;

                {
                    this.f29489b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            r1 r1Var = this.f29489b;
                            r1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            r1Var.f29506l.setAlpha(i10);
                            r1Var.f29505k.setAlpha((int) (floatValue * 102.0f));
                            r1Var.f29504j.setAlpha(i10);
                            r1Var.c();
                            return;
                        default:
                            r1 r1Var2 = this.f29489b;
                            r1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) r1Var2.f29499b.f7312a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) r1Var2.f29498a.f7312a).setAlpha((int) (floatValue2 * 255.0f));
                            r1Var2.c();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new r81(this, 7));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final r1 f29489b;

                {
                    this.f29489b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            r1 r1Var = this.f29489b;
                            r1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            r1Var.f29506l.setAlpha(i10);
                            r1Var.f29505k.setAlpha((int) (floatValue * 102.0f));
                            r1Var.f29504j.setAlpha(i10);
                            r1Var.c();
                            return;
                        default:
                            r1 r1Var2 = this.f29489b;
                            r1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) r1Var2.f29499b.f7312a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) r1Var2.f29498a.f7312a).setAlpha((int) (floatValue2 * 255.0f));
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
            this.f29503i = z10;
        }
        c();
    }
}
