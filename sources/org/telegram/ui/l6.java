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
public final class l6 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public float[] E;
    public final y6 F;
    public final org.telegram.ui.Components.h6 f48854a;
    public final TextView[] f48855b;
    public final RectF f48856c;
    public final org.telegram.ui.Components.d80 d;
    public Float f48857e;
    public Float f48858f;
    public final org.telegram.ui.Components.u5 h;
    public final org.telegram.ui.Components.u5 f48859n;
    public final org.telegram.ui.Components.u5 f48860r;
    public final Paint f48861s;
    public final Paint f48862w;
    public final Paint f48863x;
    public Path f48864y;

    public l6(y6 y6Var, Context context) {
        super(context);
        float f10;
        this.F = y6Var;
        this.f48855b = new TextView[3];
        this.f48856c = new RectF();
        this.d = new org.telegram.ui.Components.d80();
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        this.h = new org.telegram.ui.Components.u5(this, 450L, erVar);
        this.f48859n = new org.telegram.ui.Components.u5(this, 450L, erVar);
        this.f48860r = new org.telegram.ui.Components.u5(this, 450L, erVar);
        this.f48861s = new Paint(1);
        this.f48862w = new Paint(1);
        this.f48863x = new Paint(1);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, false, false);
        this.f48854a = h6Var;
        h6Var.b(0.35f, 350L, erVar);
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        h6Var.setTextSize(org.telegram.messenger.g0.L(20.0f));
        h6Var.setText(org.telegram.messenger.hd.M0(2131744816, null));
        h6Var.setGravity(17);
        org.telegram.ui.ActionBar.q6.Y(h6Var, org.telegram.ui.ActionBar.j6.G6, null);
        addView(h6Var, c8.ja.e(-2, 26, 49));
        for (int i7 = 0; i7 < 3; i7++) {
            this.f48855b[i7] = new TextView(context);
            this.f48855b[i7].setTextSize(1, 13.0f);
            this.f48855b[i7].setGravity(17);
            this.f48855b[i7].setPadding(org.telegram.messenger.g0.L(24.0f), 0, org.telegram.messenger.g0.L(24.0f), 0);
            if (i7 == 0) {
                this.f48855b[i7].setText(org.telegram.messenger.hd.M0(2131744815, null));
            } else if (i7 == 1) {
                this.f48855b[i7].setAlpha(0.0f);
                this.f48855b[i7].setText(org.telegram.messenger.hd.M0(2131744813, null));
                this.f48855b[i7].setVisibility(4);
            } else if (i7 == 2) {
                this.f48855b[i7].setText(org.telegram.messenger.hd.M0(2131744821, null));
                this.f48855b[i7].setAlpha(0.0f);
                this.f48855b[i7].setVisibility(4);
            }
            org.telegram.ui.ActionBar.q6.U(this.f48855b[i7], org.telegram.ui.ActionBar.j6.B6, null);
            View view = this.f48855b[i7];
            if (i7 == 2) {
                f10 = 12.0f;
            } else {
                f10 = -6.0f;
            }
            addView(view, c8.ja.d(-2, -2.0f, 17, 0.0f, f10, 0.0f, 0.0f));
        }
        this.d.f(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29262z8, false), org.telegram.ui.ActionBar.j6.r1(0.2f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.B6, false)));
        this.d.k(4.0f);
        this.d.setCallback(this);
    }

    public final void a(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        Path path = this.f48864y;
        if (path == null) {
            this.f48864y = new Path();
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
        this.f48864y.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(this.f48864y, paint);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29262z8));
    }

    public final void b(float f10, float f11, boolean z10) {
        String M0;
        if (z10) {
            M0 = org.telegram.messenger.hd.M0(2131744816, null);
        } else {
            M0 = org.telegram.messenger.hd.M0(2131744822, null);
        }
        this.f48854a.setText(M0);
        if (z10) {
            int i7 = (f10 > 0.01f ? 1 : (f10 == 0.01f ? 0 : -1));
            y6 y6Var = this.F;
            TextView[] textViewArr = this.f48855b;
            if (i7 < 0) {
                textViewArr[1].setText(org.telegram.messenger.hd.a0(null, null, 2131744812, y6.j0(y6Var, f10)));
            } else {
                textViewArr[1].setText(org.telegram.messenger.hd.a0(null, null, 2131744813, y6.j0(y6Var, f10)));
            }
            c(1);
        } else {
            c(2);
        }
        this.f48857e = Float.valueOf(f10);
        this.f48858f = Float.valueOf(f11);
        invalidate();
    }

    public final void c(int i7) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (System.currentTimeMillis() - this.F.f53441b0 > 40) {
            z10 = true;
        } else {
            z10 = false;
        }
        TextView[] textViewArr = this.f48855b;
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
            textView.animate().alpha(1.0f).translationY(0.0f).setInterpolator(org.telegram.ui.Components.er.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final l6 f48549b;

                {
                    this.f48549b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            this.f48549b.invalidate();
                            return;
                        default:
                            this.f48549b.invalidate();
                            return;
                    }
                }
            }).start();
        } else {
            textView.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(8.0f)).setListener(new nn(textView)).setInterpolator(org.telegram.ui.Components.er.h).setDuration(340L).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final l6 f48549b;

                {
                    this.f48549b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (r2) {
                        case 0:
                            this.f48549b.invalidate();
                            return;
                        default:
                            this.f48549b.invalidate();
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
        float alpha = 1.0f - this.f48855b[2].getAlpha();
        if (this.f48857e == null) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float e10 = this.f48860r.e(false, f10);
        Float f13 = this.f48857e;
        if (f13 == null) {
            floatValue = 0.0f;
        } else {
            floatValue = f13.floatValue();
        }
        org.telegram.ui.Components.u5 u5Var = this.h;
        float e11 = u5Var.e(false, floatValue);
        Float f14 = this.f48858f;
        if (f14 == null) {
            floatValue2 = 0.0f;
        } else {
            floatValue2 = f14.floatValue();
        }
        float e12 = this.f48859n.e(false, floatValue2);
        int i10 = org.telegram.ui.ActionBar.j6.f29262z8;
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, i10, false);
        Paint paint = this.f48861s;
        paint.setColor(x02);
        paint.setAlpha((int) (paint.getAlpha() * alpha));
        RectF rectF2 = org.telegram.messenger.g0.P;
        RectF rectF3 = this.f48856c;
        float f15 = 1.0f - e10;
        rectF2.set(Math.max((Math.max(org.telegram.messenger.g0.L(4.0f), rectF3.width() * e12) * f15) + rectF3.left, (Math.max(org.telegram.messenger.g0.L(4.0f), rectF3.width() * e11) * f15) + rectF3.left) + org.telegram.messenger.g0.L(1.0f), rectF3.top, rectF3.right, rectF3.bottom);
        if (rectF2.left < rectF2.right && rectF2.width() > org.telegram.messenger.g0.L(3.0f)) {
            rectF = rectF3;
            a(org.telegram.messenger.g0.L(org.telegram.messenger.g0.W1(e10, 1, 2)), org.telegram.messenger.g0.L(2.0f), canvas, paint, rectF2);
        } else {
            rectF = rectF3;
        }
        org.telegram.ui.Components.d80 d80Var = this.d;
        d80Var.e(rectF);
        d80Var.setAlpha((int) (255.0f * alpha * e10));
        d80Var.draw(canvas);
        int i11 = org.telegram.ui.ActionBar.j6.h7;
        int f16 = i0.a.f(0.75f, org.telegram.ui.ActionBar.j6.x0(null, i11, false), org.telegram.ui.ActionBar.j6.x0(null, i10, false));
        Paint paint2 = this.f48863x;
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
        int x03 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        Paint paint3 = this.f48862w;
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
        if (e10 > 0.0f || u5Var.f39904i) {
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
            TextView[] textViewArr = this.f48855b;
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
                this.f48856c.set((size - min) / 2.0f, i11 - org.telegram.messenger.g0.L(30.0f), (size + min) / 2.0f, i11 - org.telegram.messenger.g0.L(26.0f));
                return;
            }
        }
    }

    @Override
    public final void updateColors() {
        try {
            org.telegram.ui.Components.d80 d80Var = this.d;
            if (d80Var != null) {
                d80Var.f(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29262z8, false), org.telegram.ui.ActionBar.j6.r1(0.2f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.B6, false)));
                invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
