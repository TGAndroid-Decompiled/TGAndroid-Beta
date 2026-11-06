package org.telegram.ui.Components.voip;

import a8.b8;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.va;
public final class i1 {
    public final b8 f39202a;
    public final b8 f39203b;
    public b8 f39204c;
    public b8 d;
    public boolean f39205e;
    public int f39206f;
    public int f39207g;
    public int h;
    public boolean f39208i;
    public final Paint f39209j;
    public final Paint f39210k;
    public final Paint f39211l;
    public final ArrayList f39212m;

    public i1() {
        b8 b8Var = new b8(80, 80);
        this.f39202a = b8Var;
        b8 b8Var2 = new b8(80, 80);
        this.f39203b = b8Var2;
        this.f39206f = 0;
        this.f39207g = 0;
        Paint paint = new Paint(1);
        this.f39209j = paint;
        Paint paint2 = new Paint(1);
        this.f39210k = paint2;
        Paint paint3 = new Paint(1);
        this.f39211l = paint3;
        this.f39212m = new ArrayList();
        b8Var2.k(0.0f, 0.0f, 80.0f, 80.0f);
        b8Var.k(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) b8Var2.f335a).setAlpha(180);
    }

    public final void a(View view) {
        this.f39212m.add(view);
    }

    public final Paint b() {
        if (this.f39208i) {
            return this.f39210k;
        }
        return (Paint) this.f39203b.f335a;
    }

    public final void c() {
        ArrayList arrayList = this.f39212m;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f10, float f11) {
        float f12 = this.f39207g * 1.12f;
        b8 b8Var = this.f39203b;
        float f13 = -f10;
        float f14 = -f11;
        b8Var.m(f13 - ((f12 - this.f39206f) / 2.0f), f14 - ((f12 - this.f39207g) / 2.0f), f12 / ((Bitmap) b8Var.f337c).getHeight(), this.h);
        this.d.k(f13, f14, this.f39206f - f10, this.f39207g - f11);
    }

    public final void e(boolean z9) {
        if (this.f39208i && !z9) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final i1 f39190b;

                {
                    this.f39190b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            i1 i1Var = this.f39190b;
                            i1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i7 = (int) (35.0f * floatValue);
                            i1Var.f39211l.setAlpha(i7);
                            i1Var.f39210k.setAlpha((int) (floatValue * 102.0f));
                            i1Var.f39209j.setAlpha(i7);
                            i1Var.c();
                            return;
                        default:
                            i1 i1Var2 = this.f39190b;
                            i1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) i1Var2.f39203b.f335a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) i1Var2.f39202a.f335a).setAlpha((int) (floatValue2 * 255.0f));
                            i1Var2.c();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new va(this, 14));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final i1 f39190b;

                {
                    this.f39190b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            i1 i1Var = this.f39190b;
                            i1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i7 = (int) (35.0f * floatValue);
                            i1Var.f39211l.setAlpha(i7);
                            i1Var.f39210k.setAlpha((int) (floatValue * 102.0f));
                            i1Var.f39209j.setAlpha(i7);
                            i1Var.c();
                            return;
                        default:
                            i1 i1Var2 = this.f39190b;
                            i1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) i1Var2.f39203b.f335a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) i1Var2.f39202a.f335a).setAlpha((int) (floatValue2 * 255.0f));
                            i1Var2.c();
                            return;
                    }
                }
            });
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setStartDelay(80L);
            ofFloat2.setDuration(80L);
            ofFloat2.start();
        } else {
            this.f39208i = z9;
        }
        c();
    }
}
