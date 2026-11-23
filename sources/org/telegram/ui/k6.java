package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
public final class k6 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public float[] E;
    public final x6 F;
    public final org.telegram.ui.Components.o6 f49212a;
    public final TextView[] f49213b;
    public final RectF f49214c;
    public final org.telegram.ui.Components.q80 d;
    public Float f49215e;
    public Float f49216f;
    public final org.telegram.ui.Components.d6 h;
    public final org.telegram.ui.Components.d6 f49217n;
    public final org.telegram.ui.Components.d6 f49218r;
    public final Paint f49219s;
    public final Paint f49220w;
    public final Paint f49221x;
    public Path f49222y;

    public k6(x6 x6Var, Context context) {
        super(context);
        float f10;
        this.F = x6Var;
        this.f49213b = new TextView[3];
        this.f49214c = new RectF();
        this.d = new org.telegram.ui.Components.q80();
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        this.h = new org.telegram.ui.Components.d6(this, 450L, nrVar);
        this.f49217n = new org.telegram.ui.Components.d6(this, 450L, nrVar);
        this.f49218r = new org.telegram.ui.Components.d6(this, 450L, nrVar);
        this.f49219s = new Paint(1);
        this.f49220w = new Paint(1);
        this.f49221x = new Paint(1);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
        this.f49212a = o6Var;
        o6Var.b(0.35f, 350L, nrVar);
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        o6Var.setTextSize(org.telegram.messenger.g0.L(20.0f));
        o6Var.setText(org.telegram.messenger.hd.N0(2131744573, null));
        o6Var.setGravity(17);
        org.telegram.ui.ActionBar.t6.Y(o6Var, org.telegram.ui.ActionBar.m6.G6, null);
        addView(o6Var, c8.ma.e(-2, 26, 49));
        for (int i7 = 0; i7 < 3; i7++) {
            this.f49213b[i7] = new TextView(context);
            this.f49213b[i7].setTextSize(1, 13.0f);
            this.f49213b[i7].setGravity(17);
            this.f49213b[i7].setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
            if (i7 == 0) {
                this.f49213b[i7].setText(org.telegram.messenger.hd.N0(2131744572, null));
            } else if (i7 == 1) {
                this.f49213b[i7].setAlpha(0.0f);
                this.f49213b[i7].setText(org.telegram.messenger.hd.N0(2131744570, null));
                this.f49213b[i7].setVisibility(4);
            } else if (i7 == 2) {
                this.f49213b[i7].setText(org.telegram.messenger.hd.N0(2131744578, null));
                this.f49213b[i7].setAlpha(0.0f);
                this.f49213b[i7].setVisibility(4);
            }
            org.telegram.ui.ActionBar.t6.U(this.f49213b[i7], org.telegram.ui.ActionBar.m6.B6, null);
            View view = this.f49213b[i7];
            if (i7 == 2) {
                f10 = 12.0f;
            } else {
                f10 = -6.0f;
            }
            addView(view, c8.ma.d(-2, -2.0f, 17, 0.0f, f10, 0.0f, 0.0f));
        }
        this.d.f(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29794z8, false), org.telegram.ui.ActionBar.m6.r1(0.2f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.B6, false)));
        this.d.k(4.0f);
        this.d.setCallback(this);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        Path path = this.f49222y;
        if (path == null) {
            this.f49222y = new Path();
        } else {
            path.rewind();
        }
        if (this.E == null) {
            this.E = new float[8];
        }
        float[] fArr = this.E;
        fArr[7] = f10;
        fArr[6] = f10;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[5] = f11;
        fArr[4] = f11;
        fArr[3] = f11;
        fArr[2] = f11;
        this.f49222y.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(this.f49222y, paint);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29794z8));
    }

    public final void b(float f10, float f11, boolean z10) {
        String N0;
        if (z10) {
            N0 = org.telegram.messenger.hd.N0(2131744573, null);
        } else {
            N0 = org.telegram.messenger.hd.N0(2131744579, null);
        }
        this.f49212a.setText(N0);
        if (z10) {
            int i7 = (f10 > 0.01f ? 1 : (f10 == 0.01f ? 0 : -1));
            x6 x6Var = this.F;
            TextView[] textViewArr = this.f49213b;
            if (i7 < 0) {
                textViewArr[1].setText(org.telegram.messenger.hd.a0(null, null, 2131744569, x6.j0(x6Var, f10)));
            } else {
                textViewArr[1].setText(org.telegram.messenger.hd.a0(null, null, 2131744570, x6.j0(x6Var, f10)));
            }
            c(1);
        } else {
            c(2);
        }
        this.f49215e = Float.valueOf(f10);
        this.f49216f = Float.valueOf(f11);
        invalidate();
    }

    public final void c(int i7) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (System.currentTimeMillis() - this.F.f53651b0 > 40) {
            z10 = true;
        } else {
            z10 = false;
        }
        TextView[] textViewArr = this.f49213b;
        TextView textView = textViewArr[0];
        if (i7 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        d(textView, z11, z10);
        TextView textView2 = textViewArr[1];
        if (i7 == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        d(textView2, z12, z10);
        TextView textView3 = textViewArr[2];
        if (i7 == 2) {
            z13 = true;
        }
        d(textView3, z13, z10);
    }

    public final void d(TextView textView, boolean z10, boolean z11) {
        if (textView == null) {
            return;
        }
        int i7 = 0;
        if (textView.getParent() == null) {
            z11 = false;
        }
        Integer num = null;
        textView.animate().setListener(null).cancel();
        float f10 = 1.0f;
        float f11 = 0.0f;
        if (!z11) {
            if (!z10) {
                i7 = 4;
            }
            textView.setVisibility(i7);
            if (z10) {
                num = 1;
            }
            textView.setTag(num);
            if (!z10) {
                f10 = 0.0f;
            }
            textView.setAlpha(f10);
            if (!z10) {
                f11 = org.telegram.messenger.g0.L(8.0f);
            }
            textView.setTranslationY(f11);
            invalidate();
        } else if (z10) {
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
                textView.setTranslationY(org.telegram.messenger.g0.L(8.0f));
            }
            textView.animate().alpha(1.0f).translationY(0.0f).setInterpolator(org.telegram.ui.Components.nr.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final k6 f48904b;

                {
                    this.f48904b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            this.f48904b.invalidate();
                            return;
                        default:
                            this.f48904b.invalidate();
                            return;
                    }
                }
            }).start();
        } else {
            textView.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(8.0f)).setListener(new on(textView)).setInterpolator(org.telegram.ui.Components.nr.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final k6 f48904b;

                {
                    this.f48904b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            this.f48904b.invalidate();
                            return;
                        default:
                            this.f48904b.invalidate();
                            return;
                    }
                }
            }).start();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float floatValue;
        float floatValue2;
        RectF rectF;
        int i7;
        float f11;
        float f12;
        float alpha = 1.0f - this.f49213b[2].getAlpha();
        if (this.f49215e == null) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = this.f49218r.e(false, f10);
        Float f13 = this.f49215e;
        if (f13 == null) {
            floatValue = 0.0f;
        } else {
            floatValue = f13.floatValue();
        }
        org.telegram.ui.Components.d6 d6Var = this.h;
        float e11 = d6Var.e(false, floatValue);
        Float f14 = this.f49216f;
        if (f14 == null) {
            floatValue2 = 0.0f;
        } else {
            floatValue2 = f14.floatValue();
        }
        float e12 = this.f49217n.e(false, floatValue2);
        int i10 = org.telegram.ui.ActionBar.m6.f29794z8;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i10, false);
        Paint paint = this.f49219s;
        paint.setColor(x02);
        paint.setAlpha((int) (paint.getAlpha() * alpha));
        RectF rectF2 = org.telegram.messenger.g0.P;
        RectF rectF3 = this.f49214c;
        float f15 = 1.0f - e10;
        rectF2.set(Math.max((Math.max(org.telegram.messenger.g0.L(4.0f), rectF3.width() * e12) * f15) + rectF3.left, (Math.max(org.telegram.messenger.g0.L(4.0f), rectF3.width() * e11) * f15) + rectF3.left) + org.telegram.messenger.g0.L(1.0f), rectF3.top, rectF3.right, rectF3.bottom);
        if (rectF2.left < rectF2.right && rectF2.width() > org.telegram.messenger.g0.L(3.0f)) {
            rectF = rectF3;
            a(org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(e10, 1, 2)), org.telegram.messenger.g0.L(2.0f), canvas, paint, rectF2);
        } else {
            rectF = rectF3;
        }
        org.telegram.ui.Components.q80 q80Var = this.d;
        q80Var.e(rectF);
        q80Var.setAlpha((int) (255.0f * alpha * e10));
        q80Var.draw(canvas);
        int i11 = org.telegram.ui.ActionBar.m6.h7;
        int f16 = i0.a.f(0.75f, org.telegram.ui.ActionBar.m6.x0(null, i11, false), org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        Paint paint2 = this.f49221x;
        paint2.setColor(f16);
        paint2.setAlpha((int) (paint2.getAlpha() * alpha));
        rectF2.set((Math.max(org.telegram.messenger.g0.L(4.0f), rectF.width() * e11) * f15) + rectF.left + org.telegram.messenger.g0.L(1.0f), rectF.top, (Math.max(org.telegram.messenger.g0.L(4.0f), rectF.width() * e12) * f15) + rectF.left, rectF.bottom);
        if (rectF2.width() > org.telegram.messenger.g0.L(3.0f)) {
            float L = org.telegram.messenger.g0.L(1.0f);
            if (e12 > 0.97f) {
                f12 = 2.0f;
            } else {
                f12 = 1.0f;
            }
            float L2 = org.telegram.messenger.g0.L(f12);
            i7 = i11;
            a(L, L2, canvas, paint2, rectF2);
        } else {
            i7 = i11;
        }
        int x03 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        Paint paint3 = this.f49220w;
        paint3.setColor(x03);
        paint3.setAlpha((int) (paint3.getAlpha() * alpha));
        float f17 = rectF.left;
        rectF2.set(f17, rectF.top, (Math.max(org.telegram.messenger.g0.L(4.0f), rectF.width() * e11) * f15) + f17, rectF.bottom);
        float L3 = org.telegram.messenger.g0.L(2.0f);
        if (e11 > 0.97f) {
            f11 = 2.0f;
        } else {
            f11 = 1.0f;
        }
        a(L3, org.telegram.messenger.g0.L(f11), canvas, paint3, rectF2);
        if (e10 > 0.0f || d6Var.f34390i) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int size = View.MeasureSpec.getSize(i7);
        int min = (int) Math.min(org.telegram.messenger.g0.L(174.0f), size * 0.8d);
        measureChildren(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i10);
        int L = org.telegram.messenger.g0.L(72.0f);
        int i13 = 0;
        int i14 = 0;
        while (true) {
            TextView[] textViewArr = this.f49213b;
            if (i13 < textViewArr.length) {
                int measuredHeight = textViewArr[i13].getMeasuredHeight();
                if (i13 == 2) {
                    i12 = org.telegram.messenger.g0.L(16.0f);
                } else {
                    i12 = 0;
                }
                i14 = Math.max(i14, measuredHeight - i12);
                i13++;
            } else {
                setMeasuredDimension(size, L + i14);
                this.f49214c.set((size - min) / 2.0f, i11 - org.telegram.messenger.g0.L(30.0f), (size + min) / 2.0f, i11 - org.telegram.messenger.g0.L(26.0f));
                return;
            }
        }
    }

    @Override
    public final void updateColors() {
        try {
            org.telegram.ui.Components.q80 q80Var = this.d;
            if (q80Var != null) {
                q80Var.f(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29794z8, false), org.telegram.ui.ActionBar.m6.r1(0.2f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.B6, false)));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
