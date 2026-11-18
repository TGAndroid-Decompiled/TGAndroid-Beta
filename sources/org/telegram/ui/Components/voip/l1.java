package org.telegram.ui.Components.voip;

import a8.b8;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Cells.x9;
public final class l1 {
    public final b8 f41018a;
    public final b8 f41019b;
    public b8 f41020c;
    public b8 d;
    public boolean f41021e;
    public int f41022f;
    public int f41023g;
    public int h;
    public boolean f41024i;
    public final Paint f41025j;
    public final Paint f41026k;
    public final Paint f41027l;
    public final ArrayList f41028m;

    public l1() {
        b8 b8Var = new b8(80, 80);
        this.f41018a = b8Var;
        b8 b8Var2 = new b8(80, 80);
        this.f41019b = b8Var2;
        this.f41022f = 0;
        this.f41023g = 0;
        Paint paint = new Paint(1);
        this.f41025j = paint;
        Paint paint2 = new Paint(1);
        this.f41026k = paint2;
        Paint paint3 = new Paint(1);
        this.f41027l = paint3;
        this.f41028m = new ArrayList();
        b8Var2.k(0.0f, 0.0f, 80.0f, 80.0f);
        b8Var.k(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) b8Var2.f341a).setAlpha(180);
    }

    public final void a(View view) {
        this.f41028m.add(view);
    }

    public final Paint b() {
        if (this.f41024i) {
            return this.f41026k;
        }
        return (Paint) this.f41019b.f341a;
    }

    public final void c() {
        ArrayList arrayList = this.f41028m;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f10, float f11) {
        float f12 = this.f41023g * 1.12f;
        b8 b8Var = this.f41019b;
        float f13 = -f10;
        float f14 = -f11;
        b8Var.m(f13 - ((f12 - this.f41022f) / 2.0f), f14 - ((f12 - this.f41023g) / 2.0f), f12 / ((Bitmap) b8Var.f343c).getHeight(), this.h);
        this.d.k(f13, f14, this.f41022f - f10, this.f41023g - f11);
    }

    public final void e(boolean z10) {
        if (this.f41024i && !z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final l1 f41008b;

                {
                    this.f41008b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            l1 l1Var = this.f41008b;
                            l1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i7 = (int) (35.0f * floatValue);
                            l1Var.f41027l.setAlpha(i7);
                            l1Var.f41026k.setAlpha((int) (floatValue * 102.0f));
                            l1Var.f41025j.setAlpha(i7);
                            l1Var.c();
                            return;
                        default:
                            l1 l1Var2 = this.f41008b;
                            l1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) l1Var2.f41019b.f341a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) l1Var2.f41018a.f341a).setAlpha((int) (floatValue2 * 255.0f));
                            l1Var2.c();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new x9(this, 15));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final l1 f41008b;

                {
                    this.f41008b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            l1 l1Var = this.f41008b;
                            l1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i7 = (int) (35.0f * floatValue);
                            l1Var.f41027l.setAlpha(i7);
                            l1Var.f41026k.setAlpha((int) (floatValue * 102.0f));
                            l1Var.f41025j.setAlpha(i7);
                            l1Var.c();
                            return;
                        default:
                            l1 l1Var2 = this.f41008b;
                            l1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) l1Var2.f41019b.f341a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) l1Var2.f41018a.f341a).setAlpha((int) (floatValue2 * 255.0f));
                            l1Var2.c();
                            return;
                    }
                }
            });
            ofFloat2.setInterpolator(new LinearInterpolator());
            ofFloat2.setStartDelay(80L);
            ofFloat2.setDuration(80L);
            ofFloat2.start();
        } else {
            this.f41024i = z10;
        }
        c();
    }
}
