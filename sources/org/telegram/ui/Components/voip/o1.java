package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.v61;
public final class o1 {
    public final com.google.firebase.messaging.m f30048a;
    public final com.google.firebase.messaging.m f30049b;
    public com.google.firebase.messaging.m f30050c;
    public com.google.firebase.messaging.m d;
    public boolean e;
    public int f30051f;
    public int f30052g;
    public int h;
    public boolean f30053i;
    public final Paint f30054j;
    public final Paint f30055k;
    public final Paint f30056l;
    public final ArrayList f30057m;

    public o1() {
        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m(80, 80);
        this.f30048a = mVar;
        com.google.firebase.messaging.m mVar2 = new com.google.firebase.messaging.m(80, 80);
        this.f30049b = mVar2;
        this.f30051f = 0;
        this.f30052g = 0;
        Paint paint = new Paint(1);
        this.f30054j = paint;
        Paint paint2 = new Paint(1);
        this.f30055k = paint2;
        Paint paint3 = new Paint(1);
        this.f30056l = paint3;
        this.f30057m = new ArrayList();
        mVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        mVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) mVar2.f6194a).setAlpha(180);
    }

    public final void a(View view) {
        this.f30057m.add(view);
    }

    public final Paint b() {
        if (this.f30053i) {
            return this.f30055k;
        }
        return (Paint) this.f30049b.f6194a;
    }

    public final void c() {
        ArrayList arrayList = this.f30057m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f7, float f10) {
        float f11 = this.f30052g * 1.12f;
        com.google.firebase.messaging.m mVar = this.f30049b;
        float f12 = -f7;
        float f13 = -f10;
        mVar.B(f12 - ((f11 - this.f30051f) / 2.0f), f13 - ((f11 - this.f30052g) / 2.0f), f11 / ((Bitmap) mVar.f6196c).getHeight(), this.h);
        this.d.z(f12, f13, this.f30051f - f7, this.f30052g - f10);
    }

    public final void e(boolean z10) {
        if (this.f30053i && !z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final o1 f30005b;

                {
                    this.f30005b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            o1 o1Var = this.f30005b;
                            o1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            o1Var.f30056l.setAlpha(i10);
                            o1Var.f30055k.setAlpha((int) (floatValue * 102.0f));
                            o1Var.f30054j.setAlpha(i10);
                            o1Var.c();
                            return;
                        default:
                            o1 o1Var2 = this.f30005b;
                            o1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) o1Var2.f30049b.f6194a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) o1Var2.f30048a.f6194a).setAlpha((int) (floatValue2 * 255.0f));
                            o1Var2.c();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new v61(this, 10));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final o1 f30005b;

                {
                    this.f30005b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            o1 o1Var = this.f30005b;
                            o1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            o1Var.f30056l.setAlpha(i10);
                            o1Var.f30055k.setAlpha((int) (floatValue * 102.0f));
                            o1Var.f30054j.setAlpha(i10);
                            o1Var.c();
                            return;
                        default:
                            o1 o1Var2 = this.f30005b;
                            o1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) o1Var2.f30049b.f6194a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) o1Var2.f30048a.f6194a).setAlpha((int) (floatValue2 * 255.0f));
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
            this.f30053i = z10;
        }
        c();
    }
}
