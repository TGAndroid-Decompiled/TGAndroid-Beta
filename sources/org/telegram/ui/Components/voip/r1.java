package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.a91;
public final class r1 {
    public final com.google.firebase.messaging.n f32109a;
    public final com.google.firebase.messaging.n f32110b;
    public com.google.firebase.messaging.n f32111c;
    public com.google.firebase.messaging.n d;
    public boolean f32112e;
    public int f32113f;
    public int f32114g;
    public int h;
    public boolean f32115i;
    public final Paint f32116j;
    public final Paint f32117k;
    public final Paint f32118l;
    public final ArrayList f32119m;

    public r1() {
        com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n(80, 80);
        this.f32109a = nVar;
        com.google.firebase.messaging.n nVar2 = new com.google.firebase.messaging.n(80, 80);
        this.f32110b = nVar2;
        this.f32113f = 0;
        this.f32114g = 0;
        Paint paint = new Paint(1);
        this.f32116j = paint;
        Paint paint2 = new Paint(1);
        this.f32117k = paint2;
        Paint paint3 = new Paint(1);
        this.f32118l = paint3;
        this.f32119m = new ArrayList();
        nVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        nVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) nVar2.f7905a).setAlpha(180);
    }

    public final void a(View view) {
        this.f32119m.add(view);
    }

    public final Paint b() {
        if (this.f32115i) {
            return this.f32117k;
        }
        return (Paint) this.f32110b.f7905a;
    }

    public final void c() {
        ArrayList arrayList = this.f32119m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f7, float f10) {
        float f11 = this.f32114g * 1.12f;
        com.google.firebase.messaging.n nVar = this.f32110b;
        float f12 = -f7;
        float f13 = -f10;
        nVar.B(f12 - ((f11 - this.f32113f) / 2.0f), f13 - ((f11 - this.f32114g) / 2.0f), f11 / ((Bitmap) nVar.f7907c).getHeight(), this.h);
        this.d.z(f12, f13, this.f32113f - f7, this.f32114g - f10);
    }

    public final void e(boolean z10) {
        if (this.f32115i && !z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final r1 f32099b;

                {
                    this.f32099b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            r1 r1Var = this.f32099b;
                            r1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            r1Var.f32118l.setAlpha(i10);
                            r1Var.f32117k.setAlpha((int) (floatValue * 102.0f));
                            r1Var.f32116j.setAlpha(i10);
                            r1Var.c();
                            return;
                        default:
                            r1 r1Var2 = this.f32099b;
                            r1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) r1Var2.f32110b.f7905a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) r1Var2.f32109a.f7905a).setAlpha((int) (floatValue2 * 255.0f));
                            r1Var2.c();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new a91(this, 7));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final r1 f32099b;

                {
                    this.f32099b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            r1 r1Var = this.f32099b;
                            r1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            r1Var.f32118l.setAlpha(i10);
                            r1Var.f32117k.setAlpha((int) (floatValue * 102.0f));
                            r1Var.f32116j.setAlpha(i10);
                            r1Var.c();
                            return;
                        default:
                            r1 r1Var2 = this.f32099b;
                            r1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) r1Var2.f32110b.f7905a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) r1Var2.f32109a.f7905a).setAlpha((int) (floatValue2 * 255.0f));
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
            this.f32115i = z10;
        }
        c();
    }
}
