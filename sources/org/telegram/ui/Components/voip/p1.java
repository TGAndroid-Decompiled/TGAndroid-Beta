package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.zn0;
public final class p1 {
    public final com.google.firebase.messaging.n f28338a;
    public final com.google.firebase.messaging.n f28339b;
    public com.google.firebase.messaging.n f28340c;
    public com.google.firebase.messaging.n d;
    public boolean e;
    public int f28341f;
    public int f28342g;
    public int h;
    public boolean f28343i;
    public final Paint f28344j;
    public final Paint f28345k;
    public final Paint f28346l;
    public final ArrayList f28347m;

    public p1() {
        com.google.firebase.messaging.n nVar = new com.google.firebase.messaging.n(80, 80);
        this.f28338a = nVar;
        com.google.firebase.messaging.n nVar2 = new com.google.firebase.messaging.n(80, 80);
        this.f28339b = nVar2;
        this.f28341f = 0;
        this.f28342g = 0;
        Paint paint = new Paint(1);
        this.f28344j = paint;
        Paint paint2 = new Paint(1);
        this.f28345k = paint2;
        Paint paint3 = new Paint(1);
        this.f28346l = paint3;
        this.f28347m = new ArrayList();
        nVar2.z(0.0f, 0.0f, 80.0f, 80.0f);
        nVar.z(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) nVar2.f6103a).setAlpha(180);
    }

    public final void a(View view) {
        this.f28347m.add(view);
    }

    public final Paint b() {
        if (this.f28343i) {
            return this.f28345k;
        }
        return (Paint) this.f28339b.f6103a;
    }

    public final void c() {
        ArrayList arrayList = this.f28347m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f7, float f10) {
        float f11 = this.f28342g * 1.12f;
        com.google.firebase.messaging.n nVar = this.f28339b;
        float f12 = -f7;
        float f13 = -f10;
        nVar.B(f12 - ((f11 - this.f28341f) / 2.0f), f13 - ((f11 - this.f28342g) / 2.0f), f11 / ((Bitmap) nVar.f6105c).getHeight(), this.h);
        this.d.z(f12, f13, this.f28341f - f7, this.f28342g - f10);
    }

    public final void e(boolean z10) {
        if (this.f28343i && !z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final p1 f28306b;

                {
                    this.f28306b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            p1 p1Var = this.f28306b;
                            p1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            p1Var.f28346l.setAlpha(i10);
                            p1Var.f28345k.setAlpha((int) (floatValue * 102.0f));
                            p1Var.f28344j.setAlpha(i10);
                            p1Var.c();
                            return;
                        default:
                            p1 p1Var2 = this.f28306b;
                            p1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) p1Var2.f28339b.f6103a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) p1Var2.f28338a.f6103a).setAlpha((int) (floatValue2 * 255.0f));
                            p1Var2.c();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new zn0(this, 26));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final p1 f28306b;

                {
                    this.f28306b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            p1 p1Var = this.f28306b;
                            p1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            p1Var.f28346l.setAlpha(i10);
                            p1Var.f28345k.setAlpha((int) (floatValue * 102.0f));
                            p1Var.f28344j.setAlpha(i10);
                            p1Var.c();
                            return;
                        default:
                            p1 p1Var2 = this.f28306b;
                            p1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) p1Var2.f28339b.f6103a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) p1Var2.f28338a.f6103a).setAlpha((int) (floatValue2 * 255.0f));
                            p1Var2.c();
                            return;
                    }
                }
            });
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setStartDelay(80L);
            ofFloat2.setDuration(80L);
            ofFloat2.start();
        } else {
            this.f28343i = z10;
        }
        c();
    }
}
