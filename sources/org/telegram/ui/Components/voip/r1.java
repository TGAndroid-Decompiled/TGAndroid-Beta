package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.s81;
public final class r1 {
    public final com.google.firebase.messaging.n f29499a;
    public final com.google.firebase.messaging.n f29500b;
    public com.google.firebase.messaging.n f29501c;
    public com.google.firebase.messaging.n d;
    public boolean e;
    public int f29502f;
    public int f29503g;
    public int h;
    public boolean f29504i;
    public final Paint f29505j;
    public final Paint f29506k;
    public final Paint f29507l;
    public final ArrayList f29508m;

    public r1() {
        com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n(80, 80);
        this.f29499a = nVar;
        com.google.firebase.messaging.n nVar2 = new com.google.firebase.messaging.n(80, 80);
        this.f29500b = nVar2;
        this.f29502f = 0;
        this.f29503g = 0;
        Paint paint = new Paint(1);
        this.f29505j = paint;
        Paint paint2 = new Paint(1);
        this.f29506k = paint2;
        Paint paint3 = new Paint(1);
        this.f29507l = paint3;
        this.f29508m = new ArrayList();
        nVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        nVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) nVar2.f7324a).setAlpha(180);
    }

    public final void a(View view) {
        this.f29508m.add(view);
    }

    public final Paint b() {
        if (this.f29504i) {
            return this.f29506k;
        }
        return (Paint) this.f29500b.f7324a;
    }

    public final void c() {
        ArrayList arrayList = this.f29508m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f7, float f10) {
        float f11 = this.f29503g * 1.12f;
        com.google.firebase.messaging.n nVar = this.f29500b;
        float f12 = -f7;
        float f13 = -f10;
        nVar.B(f12 - ((f11 - this.f29502f) / 2.0f), f13 - ((f11 - this.f29503g) / 2.0f), f11 / ((Bitmap) nVar.f7326c).getHeight(), this.h);
        this.d.z(f12, f13, this.f29502f - f7, this.f29503g - f10);
    }

    public final void e(boolean z10) {
        if (this.f29504i && !z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final r1 f29490b;

                {
                    this.f29490b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            r1 r1Var = this.f29490b;
                            r1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            r1Var.f29507l.setAlpha(i10);
                            r1Var.f29506k.setAlpha((int) (floatValue * 102.0f));
                            r1Var.f29505j.setAlpha(i10);
                            r1Var.c();
                            return;
                        default:
                            r1 r1Var2 = this.f29490b;
                            r1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) r1Var2.f29500b.f7324a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) r1Var2.f29499a.f7324a).setAlpha((int) (floatValue2 * 255.0f));
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
                public final r1 f29490b;

                {
                    this.f29490b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            r1 r1Var = this.f29490b;
                            r1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            r1Var.f29507l.setAlpha(i10);
                            r1Var.f29506k.setAlpha((int) (floatValue * 102.0f));
                            r1Var.f29505j.setAlpha(i10);
                            r1Var.c();
                            return;
                        default:
                            r1 r1Var2 = this.f29490b;
                            r1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) r1Var2.f29500b.f7324a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) r1Var2.f29499a.f7324a).setAlpha((int) (floatValue2 * 255.0f));
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
            this.f29504i = z10;
        }
        c();
    }
}
