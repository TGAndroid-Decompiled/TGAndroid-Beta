package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.ui.Components.f91;
public final class o1 {
    public final a9.a f32232a;
    public final a9.a f32233b;
    public a9.a f32234c;
    public a9.a d;
    public boolean f32235e;
    public int f32236f;
    public int f32237g;
    public int h;
    public boolean f32238i;
    public final Paint f32239j;
    public final Paint f32240k;
    public final Paint f32241l;
    public final ArrayList f32242m;

    public o1() {
        a9.a aVar = new a9.a(80, 80);
        this.f32232a = aVar;
        a9.a aVar2 = new a9.a(80, 80);
        this.f32233b = aVar2;
        this.f32236f = 0;
        this.f32237g = 0;
        Paint paint = new Paint(1);
        this.f32239j = paint;
        Paint paint2 = new Paint(1);
        this.f32240k = paint2;
        Paint paint3 = new Paint(1);
        this.f32241l = paint3;
        this.f32242m = new ArrayList();
        aVar2.x(0.0f, 0.0f, 80.0f, 80.0f);
        aVar.x(0.0f, 0.0f, 80.0f, 80.0f);
        paint.setColor(-1);
        paint.setAlpha(35);
        paint2.setColor(-16777216);
        paint2.setAlpha(102);
        paint3.setColor(-16777216);
        paint3.setAlpha(35);
        ((Paint) aVar2.f155a).setAlpha(180);
    }

    public final void a(View view) {
        this.f32242m.add(view);
    }

    public final Paint b() {
        if (this.f32238i) {
            return this.f32240k;
        }
        return (Paint) this.f32233b.f155a;
    }

    public final void c() {
        ArrayList arrayList = this.f32242m;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).invalidate();
        }
    }

    public final void d(float f10, float f11) {
        float f12 = this.f32237g * 1.12f;
        a9.a aVar = this.f32233b;
        float f13 = -f10;
        float f14 = -f11;
        aVar.z(f13 - ((f12 - this.f32236f) / 2.0f), f14 - ((f12 - this.f32237g) / 2.0f), f12 / ((Bitmap) aVar.f157c).getHeight(), this.h);
        this.d.x(f13, f14, this.f32236f - f10, this.f32237g - f11);
    }

    public final void e(boolean z4) {
        if (this.f32238i && !z4) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final o1 f32205b;

                {
                    this.f32205b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            o1 o1Var = this.f32205b;
                            o1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            o1Var.f32241l.setAlpha(i10);
                            o1Var.f32240k.setAlpha((int) (floatValue * 102.0f));
                            o1Var.f32239j.setAlpha(i10);
                            o1Var.c();
                            return;
                        default:
                            o1 o1Var2 = this.f32205b;
                            o1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) o1Var2.f32233b.f155a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) o1Var2.f32232a.f155a).setAlpha((int) (floatValue2 * 255.0f));
                            o1Var2.c();
                            return;
                    }
                }
            });
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(80L);
            ofFloat.addListener(new f91(this, 5));
            ofFloat.start();
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final o1 f32205b;

                {
                    this.f32205b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            o1 o1Var = this.f32205b;
                            o1Var.getClass();
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            int i10 = (int) (35.0f * floatValue);
                            o1Var.f32241l.setAlpha(i10);
                            o1Var.f32240k.setAlpha((int) (floatValue * 102.0f));
                            o1Var.f32239j.setAlpha(i10);
                            o1Var.c();
                            return;
                        default:
                            o1 o1Var2 = this.f32205b;
                            o1Var2.getClass();
                            float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ((Paint) o1Var2.f32233b.f155a).setAlpha((int) (180.0f * floatValue2));
                            ((Paint) o1Var2.f32232a.f155a).setAlpha((int) (floatValue2 * 255.0f));
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
            this.f32238i = z4;
        }
        c();
    }
}
