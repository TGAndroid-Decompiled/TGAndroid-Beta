package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.y11;
public final class n1 {
    public final com.google.firebase.messaging.m f33686a;
    public final com.google.firebase.messaging.m f33687b;
    public com.google.firebase.messaging.m f33688c;
    public com.google.firebase.messaging.m d;
    public boolean f33689e;
    public int f33690f;
    public int f33691g;
    public int h;
    public boolean f33692i;
    public final Paint f33693j;
    public final Paint f33694k;
    public final Paint f33695l;
    public final ArrayList f33696m;

    public n1() {
        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m(80, 80);
        this.f33686a = mVar;
        com.google.firebase.messaging.m mVar2 = new com.google.firebase.messaging.m(80, 80);
        this.f33687b = mVar2;
        this.f33690f = 0;
        this.f33691g = 0;
        Paint paint = new Paint(1);
        this.f33693j = paint;
        Paint paint2 = new Paint(1);
        this.f33694k = paint2;
        Paint paint3 = new Paint(1);
        this.f33695l = paint3;
        this.f33696m = new ArrayList();
        mVar2.w(0.0f, 0.0f, 80.0f, 80.0f);
        mVar.w(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) mVar2.f4160a).setAlpha(180);
    }

    public final void a(View view) {
        this.f33696m.add(view);
    }

    public final Paint b() {
        if (this.f33692i) {
            return this.f33694k;
        }
        return (Paint) this.f33687b.f4160a;
    }

    public final void c() {
        ArrayList arrayList = this.f33696m;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f10, float f11) {
        float f12 = this.f33691g * 1.12f;
        com.google.firebase.messaging.m mVar = this.f33687b;
        float f13 = -f10;
        float f14 = -f11;
        mVar.y(f13 - ((f12 - this.f33690f) / 2.0f), f14 - ((f12 - this.f33691g) / 2.0f), f12 / ((Bitmap) mVar.f4162c).getHeight(), this.h);
        this.d.w(f13, f14, this.f33690f - f10, this.f33691g - f11);
    }

    public final void e(boolean z10) {
        if (this.f33692i && !z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final n1 f33668b;

                {
                    this.f33668b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            n1 n1Var = this.f33668b;
                            n1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i9 = (int) (35.0f * floatValue);
                            n1Var.f33695l.setAlpha(i9);
                            n1Var.f33694k.setAlpha((int) (floatValue * 102.0f));
                            n1Var.f33693j.setAlpha(i9);
                            n1Var.c();
                            return;
                        default:
                            n1 n1Var2 = this.f33668b;
                            n1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) n1Var2.f33687b.f4160a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) n1Var2.f33686a.f4160a).setAlpha((int) (floatValue2 * 255.0f));
                            n1Var2.c();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new y11(this, 12));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final n1 f33668b;

                {
                    this.f33668b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            n1 n1Var = this.f33668b;
                            n1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i9 = (int) (35.0f * floatValue);
                            n1Var.f33695l.setAlpha(i9);
                            n1Var.f33694k.setAlpha((int) (floatValue * 102.0f));
                            n1Var.f33693j.setAlpha(i9);
                            n1Var.c();
                            return;
                        default:
                            n1 n1Var2 = this.f33668b;
                            n1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) n1Var2.f33687b.f4160a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) n1Var2.f33686a.f4160a).setAlpha((int) (floatValue2 * 255.0f));
                            n1Var2.c();
                            return;
                    }
                }
            });
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setStartDelay(80L);
            ofFloat2.setDuration(80L);
            ofFloat2.start();
        } else {
            this.f33692i = z10;
        }
        c();
    }
}
