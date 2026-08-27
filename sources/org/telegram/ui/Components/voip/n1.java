package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.f11;

public final class n1 {

    public final com.google.firebase.messaging.m f33736a;

    public final com.google.firebase.messaging.m f33737b;

    public com.google.firebase.messaging.m f33738c;
    public com.google.firebase.messaging.m d;

    public boolean f33739e;

    public int f33740f;

    public int f33741g;
    public int h;

    public boolean f33742i;

    public final Paint f33743j;

    public final Paint f33744k;

    public final Paint f33745l;

    public final ArrayList f33746m;

    public n1() {
        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m(80, 80);
        this.f33736a = mVar;
        com.google.firebase.messaging.m mVar2 = new com.google.firebase.messaging.m(80, 80);
        this.f33737b = mVar2;
        this.f33740f = 0;
        this.f33741g = 0;
        Paint paint = new Paint(1);
        this.f33743j = paint;
        Paint paint2 = new Paint(1);
        this.f33744k = paint2;
        Paint paint3 = new Paint(1);
        this.f33745l = paint3;
        this.f33746m = new ArrayList();
        mVar2.w(0.0f, 0.0f, 80.0f, 80.0f);
        mVar.w(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) mVar2.f4602a).setAlpha(180);
    }

    public final void a(View view) {
        this.f33746m.add(view);
    }

    public final Paint b() {
        return this.f33742i ? this.f33744k : (Paint) this.f33737b.f4602a;
    }

    public final void c() {
        ArrayList arrayList = this.f33746m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f10, float f11) {
        float f12 = this.f33741g * 1.12f;
        com.google.firebase.messaging.m mVar = this.f33737b;
        float f13 = -f10;
        float f14 = -f11;
        mVar.y(f13 - ((f12 - this.f33740f) / 2.0f), f14 - ((f12 - this.f33741g) / 2.0f), f12 / ((Bitmap) mVar.f4604c).getHeight(), this.h);
        this.d.w(f13, f14, this.f33740f - f10, this.f33741g - f11);
    }

    public final void e(boolean z10) {
        if (!this.f33742i || z10) {
            this.f33742i = z10;
        } else {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            final int i10 = 0;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                public final n1 f33718b;

                {
                    this.f33718b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i10) {
                        case 0:
                            n1 n1Var = this.f33718b;
                            n1Var.getClass();
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i11 = (int) (35.0f * fFloatValue);
                            n1Var.f33745l.setAlpha(i11);
                            n1Var.f33744k.setAlpha((int) (fFloatValue * 102.0f));
                            n1Var.f33743j.setAlpha(i11);
                            n1Var.c();
                            break;
                        default:
                            n1 n1Var2 = this.f33718b;
                            n1Var2.getClass();
                            float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) n1Var2.f33737b.f4602a).setAlpha((int) (180.0f * fFloatValue2));
                            ((Paint) n1Var2.f33736a.f4602a).setAlpha((int) (fFloatValue2 * 255.0f));
                            n1Var2.c();
                            break;
                    }
                }
            });
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setDuration(80L);
            valueAnimatorOfFloat.addListener(new f11(this, 14));
            valueAnimatorOfFloat.start();
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            final int i11 = 1;
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {

                public final n1 f33718b;

                {
                    this.f33718b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i11) {
                        case 0:
                            n1 n1Var = this.f33718b;
                            n1Var.getClass();
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i12 = (int) (35.0f * fFloatValue);
                            n1Var.f33745l.setAlpha(i12);
                            n1Var.f33744k.setAlpha((int) (fFloatValue * 102.0f));
                            n1Var.f33743j.setAlpha(i12);
                            n1Var.c();
                            break;
                        default:
                            n1 n1Var2 = this.f33718b;
                            n1Var2.getClass();
                            float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) n1Var2.f33737b.f4602a).setAlpha((int) (180.0f * fFloatValue2));
                            ((Paint) n1Var2.f33736a.f4602a).setAlpha((int) (fFloatValue2 * 255.0f));
                            n1Var2.c();
                            break;
                    }
                }
            });
            valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat2.setStartDelay(80L);
            valueAnimatorOfFloat2.setDuration(80L);
            valueAnimatorOfFloat2.start();
        }
        c();
    }
}
