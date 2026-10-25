package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.h31;
public final class r1 {
    public final aa.m0 f34040a;
    public final aa.m0 f34041b;
    public aa.m0 f34042c;
    public aa.m0 d;
    public boolean e;
    public int f34043f;
    public int f34044g;
    public int h;
    public boolean f34045i;
    public final Paint f34046j;
    public final Paint f34047k;
    public final Paint f34048l;
    public final ArrayList f34049m;

    public r1() {
        aa.m0 m0Var = new aa.m0(80, 80);
        this.f34040a = m0Var;
        aa.m0 m0Var2 = new aa.m0(80, 80);
        this.f34041b = m0Var2;
        this.f34043f = 0;
        this.f34044g = 0;
        Paint paint = new Paint(1);
        this.f34046j = paint;
        Paint paint2 = new Paint(1);
        this.f34047k = paint2;
        Paint paint3 = new Paint(1);
        this.f34048l = paint3;
        this.f34049m = new ArrayList();
        m0Var2.w(0.0f, 0.0f, 80.0f, 80.0f);
        m0Var.w(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) m0Var2.f1150a).setAlpha(180);
    }

    public final void a(View view) {
        this.f34049m.add(view);
    }

    public final Paint b() {
        if (this.f34045i) {
            return this.f34047k;
        }
        return (Paint) this.f34041b.f1150a;
    }

    public final void c() {
        ArrayList arrayList = this.f34049m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f7, float f10) {
        float f11 = this.f34044g * 1.12f;
        aa.m0 m0Var = this.f34041b;
        float f12 = -f7;
        float f13 = -f10;
        m0Var.y(f12 - ((f11 - this.f34043f) / 2.0f), f13 - ((f11 - this.f34044g) / 2.0f), f11 / ((Bitmap) m0Var.f1152c).getHeight(), this.h);
        this.d.w(f12, f13, this.f34043f - f7, this.f34044g - f10);
    }

    public final void e(boolean z10) {
        if (this.f34045i && !z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final r1 f34028b;

                {
                    this.f34028b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            r1 r1Var = this.f34028b;
                            r1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            r1Var.f34048l.setAlpha(i10);
                            r1Var.f34047k.setAlpha((int) (floatValue * 102.0f));
                            r1Var.f34046j.setAlpha(i10);
                            r1Var.c();
                            return;
                        default:
                            r1 r1Var2 = this.f34028b;
                            r1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) r1Var2.f34041b.f1150a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) r1Var2.f34040a.f1150a).setAlpha((int) (floatValue2 * 255.0f));
                            r1Var2.c();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new h31(this, 14));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final r1 f34028b;

                {
                    this.f34028b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            r1 r1Var = this.f34028b;
                            r1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            r1Var.f34048l.setAlpha(i10);
                            r1Var.f34047k.setAlpha((int) (floatValue * 102.0f));
                            r1Var.f34046j.setAlpha(i10);
                            r1Var.c();
                            return;
                        default:
                            r1 r1Var2 = this.f34028b;
                            r1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) r1Var2.f34041b.f1150a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) r1Var2.f34040a.f1150a).setAlpha((int) (floatValue2 * 255.0f));
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
            this.f34045i = z10;
        }
        c();
    }
}
