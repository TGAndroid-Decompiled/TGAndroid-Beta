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
public final class l6 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public float[] D;
    public final y6 E;
    public final org.telegram.ui.Components.f6 f39062a;
    public final TextView[] f39063b;
    public final RectF f39064c;
    public final org.telegram.ui.Components.t80 d;
    public Float e;
    public Float f39065f;
    public final org.telegram.ui.Components.t5 h;
    public final org.telegram.ui.Components.t5 f39066n;
    public final org.telegram.ui.Components.t5 f39067r;
    public final Paint f39068s;
    public final Paint f39069w;
    public final Paint f39070x;
    public Path f39071y;

    public l6(y6 y6Var, Context context) {
        super(context);
        float f7;
        this.E = y6Var;
        this.f39063b = new TextView[3];
        this.f39064c = new RectF();
        this.d = new org.telegram.ui.Components.t80();
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.h = new org.telegram.ui.Components.t5(this, 450L, grVar);
        this.f39066n = new org.telegram.ui.Components.t5(this, 450L, grVar);
        this.f39067r = new org.telegram.ui.Components.t5(this, 450L, grVar);
        this.f39068s = new Paint(1);
        this.f39069w = new Paint(1);
        this.f39070x = new Paint(1);
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, false, false);
        this.f39062a = f6Var;
        f6Var.b(0.35f, 350L, grVar);
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        f6Var.setTextSize(org.telegram.messenger.i0.L(20.0f));
        f6Var.setText(org.telegram.messenger.cd.L0(2131744834, null));
        f6Var.setGravity(17);
        org.telegram.ui.ActionBar.a7.Z(f6Var, org.telegram.ui.ActionBar.t6.G6, null);
        addView(f6Var, w7.b6.e(-2, 26, 49));
        for (int i10 = 0; i10 < 3; i10++) {
            this.f39063b[i10] = new TextView(context);
            this.f39063b[i10].setTextSize(1, 13.0f);
            this.f39063b[i10].setGravity(17);
            this.f39063b[i10].setPadding(org.telegram.messenger.i0.L(24.0f), 0, org.telegram.messenger.i0.L(24.0f), 0);
            if (i10 == 0) {
                this.f39063b[i10].setText(org.telegram.messenger.cd.L0(2131744833, null));
            } else if (i10 == 1) {
                this.f39063b[i10].setAlpha(0.0f);
                this.f39063b[i10].setText(org.telegram.messenger.cd.L0(2131744831, null));
                this.f39063b[i10].setVisibility(4);
            } else if (i10 == 2) {
                this.f39063b[i10].setText(org.telegram.messenger.cd.L0(2131744839, null));
                this.f39063b[i10].setAlpha(0.0f);
                this.f39063b[i10].setVisibility(4);
            }
            org.telegram.ui.ActionBar.a7.V(this.f39063b[i10], org.telegram.ui.ActionBar.t6.B6, null);
            View view = this.f39063b[i10];
            if (i10 == 2) {
                f7 = 12.0f;
            } else {
                f7 = -6.0f;
            }
            addView(view, w7.b6.d(-2, -2.0f, 17, 0.0f, f7, 0.0f, 0.0f));
        }
        this.d.f(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21332z8, false), org.telegram.ui.ActionBar.t6.r1(0.2f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.B6, false)));
        this.d.k(4.0f);
        this.d.setCallback(this);
    }

    public final void a(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        Path path = this.f39071y;
        if (path == null) {
            this.f39071y = new Path();
        } else {
            path.rewind();
        }
        if (this.D == null) {
            this.D = new float[8];
        }
        float[] fArr = this.D;
        fArr[7] = f7;
        fArr[6] = f7;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[5] = f10;
        fArr[4] = f10;
        fArr[3] = f10;
        fArr[2] = f10;
        this.f39071y.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(this.f39071y, paint);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21332z8));
    }

    public final void b(float f7, float f10, boolean z10) {
        String L0;
        if (z10) {
            L0 = org.telegram.messenger.cd.L0(2131744834, null);
        } else {
            L0 = org.telegram.messenger.cd.L0(2131744840, null);
        }
        this.f39062a.setText(L0);
        if (z10) {
            int i10 = (f7 > 0.01f ? 1 : (f7 == 0.01f ? 0 : -1));
            y6 y6Var = this.E;
            TextView[] textViewArr = this.f39063b;
            if (i10 < 0) {
                textViewArr[1].setText(org.telegram.messenger.cd.a0(null, null, 2131744830, y6.i0(y6Var, f7)));
            } else {
                textViewArr[1].setText(org.telegram.messenger.cd.a0(null, null, 2131744831, y6.i0(y6Var, f7)));
            }
            c(1);
        } else {
            c(2);
        }
        this.e = Float.valueOf(f7);
        this.f39065f = Float.valueOf(f10);
        invalidate();
    }

    public final void c(int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (System.currentTimeMillis() - this.E.f43716a0 > 40) {
            z10 = true;
        } else {
            z10 = false;
        }
        TextView[] textViewArr = this.f39063b;
        TextView textView = textViewArr[0];
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        d(textView, z11, z10);
        TextView textView2 = textViewArr[1];
        if (i10 == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        d(textView2, z12, z10);
        TextView textView3 = textViewArr[2];
        if (i10 == 2) {
            z13 = true;
        }
        d(textView3, z13, z10);
    }

    public final void d(TextView textView, boolean z10, boolean z11) {
        if (textView == null) {
            return;
        }
        int i10 = 0;
        if (textView.getParent() == null) {
            z11 = false;
        }
        Integer num = null;
        textView.animate().setListener(null).cancel();
        float f7 = 1.0f;
        float f10 = 0.0f;
        if (!z11) {
            if (!z10) {
                i10 = 4;
            }
            textView.setVisibility(i10);
            if (z10) {
                num = 1;
            }
            textView.setTag(num);
            if (!z10) {
                f7 = 0.0f;
            }
            textView.setAlpha(f7);
            if (!z10) {
                f10 = org.telegram.messenger.i0.L(8.0f);
            }
            textView.setTranslationY(f10);
            invalidate();
        } else if (z10) {
            if (textView.getVisibility() != 0) {
                textView.setVisibility(0);
                textView.setAlpha(0.0f);
                textView.setTranslationY(org.telegram.messenger.i0.L(8.0f));
            }
            textView.animate().alpha(1.0f).translationY(0.0f).setInterpolator(org.telegram.ui.Components.gr.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final l6 f38694b;

                {
                    this.f38694b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            this.f38694b.invalidate();
                            return;
                        default:
                            this.f38694b.invalidate();
                            return;
                    }
                }
            }).start();
        } else {
            textView.animate().alpha(0.0f).translationY(org.telegram.messenger.i0.L(8.0f)).setListener(new eg.m(textView)).setInterpolator(org.telegram.ui.Components.gr.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final l6 f38694b;

                {
                    this.f38694b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            this.f38694b.invalidate();
                            return;
                        default:
                            this.f38694b.invalidate();
                            return;
                    }
                }
            }).start();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float floatValue;
        float floatValue2;
        RectF rectF;
        int i10;
        float f10;
        float f11;
        float alpha = 1.0f - this.f39063b[2].getAlpha();
        if (this.e == null) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        float e = this.f39067r.e(false, f7);
        Float f12 = this.e;
        if (f12 == null) {
            floatValue = 0.0f;
        } else {
            floatValue = f12.floatValue();
        }
        org.telegram.ui.Components.t5 t5Var = this.h;
        float e7 = t5Var.e(false, floatValue);
        Float f13 = this.f39065f;
        if (f13 == null) {
            floatValue2 = 0.0f;
        } else {
            floatValue2 = f13.floatValue();
        }
        float e10 = this.f39066n.e(false, floatValue2);
        int i11 = org.telegram.ui.ActionBar.t6.f21332z8;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i11, false);
        Paint paint = this.f39068s;
        paint.setColor(x02);
        paint.setAlpha((int) (paint.getAlpha() * alpha));
        RectF rectF2 = org.telegram.messenger.i0.P;
        RectF rectF3 = this.f39064c;
        float f14 = 1.0f - e;
        rectF2.set(Math.max((Math.max(org.telegram.messenger.i0.L(4.0f), rectF3.width() * e10) * f14) + rectF3.left, (Math.max(org.telegram.messenger.i0.L(4.0f), rectF3.width() * e7) * f14) + rectF3.left) + org.telegram.messenger.i0.L(1.0f), rectF3.top, rectF3.right, rectF3.bottom);
        if (rectF2.left < rectF2.right && rectF2.width() > org.telegram.messenger.i0.L(3.0f)) {
            rectF = rectF3;
            a(org.telegram.messenger.i0.L(org.telegram.messenger.i0.W1(e, 1, 2)), org.telegram.messenger.i0.L(2.0f), canvas, paint, rectF2);
        } else {
            rectF = rectF3;
        }
        org.telegram.ui.Components.t80 t80Var = this.d;
        t80Var.e(rectF);
        t80Var.setAlpha((int) (255.0f * alpha * e));
        t80Var.draw(canvas);
        int i12 = org.telegram.ui.ActionBar.t6.f21003h7;
        int f15 = i0.b.f(0.75f, org.telegram.ui.ActionBar.t6.x0(null, i12, false), org.telegram.ui.ActionBar.t6.x0(null, i11, false));
        Paint paint2 = this.f39070x;
        paint2.setColor(f15);
        paint2.setAlpha((int) (paint2.getAlpha() * alpha));
        rectF2.set((Math.max(org.telegram.messenger.i0.L(4.0f), rectF.width() * e7) * f14) + rectF.left + org.telegram.messenger.i0.L(1.0f), rectF.top, (Math.max(org.telegram.messenger.i0.L(4.0f), rectF.width() * e10) * f14) + rectF.left, rectF.bottom);
        if (rectF2.width() > org.telegram.messenger.i0.L(3.0f)) {
            float L = org.telegram.messenger.i0.L(1.0f);
            if (e10 > 0.97f) {
                f11 = 2.0f;
            } else {
                f11 = 1.0f;
            }
            float L2 = org.telegram.messenger.i0.L(f11);
            i10 = i12;
            a(L, L2, canvas, paint2, rectF2);
        } else {
            i10 = i12;
        }
        int x03 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        Paint paint3 = this.f39069w;
        paint3.setColor(x03);
        paint3.setAlpha((int) (paint3.getAlpha() * alpha));
        float f16 = rectF.left;
        rectF2.set(f16, rectF.top, (Math.max(org.telegram.messenger.i0.L(4.0f), rectF.width() * e7) * f14) + f16, rectF.bottom);
        float L3 = org.telegram.messenger.i0.L(2.0f);
        if (e7 > 0.97f) {
            f10 = 2.0f;
        } else {
            f10 = 1.0f;
        }
        a(L3, org.telegram.messenger.i0.L(f10), canvas, paint3, rectF2);
        if (e > 0.0f || t5Var.f30448i) {
            invalidate();
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int min = (int) Math.min(org.telegram.messenger.i0.L(174.0f), size * 0.8d);
        measureChildren(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
        int L = org.telegram.messenger.i0.L(72.0f);
        int i14 = 0;
        int i15 = 0;
        while (true) {
            TextView[] textViewArr = this.f39063b;
            if (i14 < textViewArr.length) {
                int measuredHeight = textViewArr[i14].getMeasuredHeight();
                if (i14 == 2) {
                    i13 = org.telegram.messenger.i0.L(16.0f);
                } else {
                    i13 = 0;
                }
                i15 = Math.max(i15, measuredHeight - i13);
                i14++;
            } else {
                setMeasuredDimension(size, L + i15);
                this.f39064c.set((size - min) / 2.0f, i12 - org.telegram.messenger.i0.L(30.0f), (size + min) / 2.0f, i12 - org.telegram.messenger.i0.L(26.0f));
                return;
            }
        }
    }

    @Override
    public final void updateColors() {
        try {
            org.telegram.ui.Components.t80 t80Var = this.d;
            if (t80Var != null) {
                t80Var.f(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21332z8, false), org.telegram.ui.ActionBar.t6.r1(0.2f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.B6, false)));
                invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
