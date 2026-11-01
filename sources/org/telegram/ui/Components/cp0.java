package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class cp0 extends vu0 {
    public boolean f25200f0;
    public final RectF f25201g0;
    public boolean f25202h0;
    public int f25203i0;
    public int f25204j0;
    public int f25205k0;
    public int f25206l0;
    public int m0;
    public int f25207n0;
    public final t5 f25208o0;
    public final pp0 f25209p0;

    public cp0(pp0 pp0Var, Context context) {
        super(context, null);
        this.f25209p0 = pp0Var;
        this.f25200f0 = false;
        this.f25201g0 = new RectF();
        this.H = new bp0(this, this);
        org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, pp0Var.I0));
        this.f25208o0 = new t5(this, 0L, 350L, gr.h);
    }

    @Override
    public final void J(Canvas canvas, ArrayList arrayList) {
        pp0 pp0Var = this.f25209p0;
        po0 po0Var = pp0Var.f29506y1;
        uk0 uk0Var = pp0Var.f29502w1;
        po0 po0Var2 = pp0Var.f29504x1;
        if (po0Var2.getVisibility() == 0 && po0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(po0Var2.getX(), po0Var2.getY());
            po0Var2.draw(canvas);
            canvas.restore();
        }
        if (uk0Var.getVisibility() == 0 && uk0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(uk0Var.getX(), uk0Var.getY());
            uk0Var.draw(canvas);
            canvas.restore();
        }
        if (po0Var.getVisibility() == 0 && po0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(po0Var.getX(), po0Var.getY());
            po0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        pp0 pp0Var = this.f25209p0;
        canvas.clipRect(0.0f, getPaddingTop() + pp0Var.f29481l2, getMeasuredWidth(), getMeasuredHeight() + pp0Var.f29481l2 + org.telegram.messenger.i0.L(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof vy) {
            pp0 pp0Var = this.f25209p0;
            if (pp0Var.M2 != null) {
                canvas.save();
                pp0Var.M2.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(pp0Var.M2.P.f50852k);
                pp0Var.M2.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.f25209p0.I0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.m1 m1Var = this.H;
        m1Var.f20564b = this;
        m1Var.c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        boolean z10;
        int i10;
        int L;
        Paint paint;
        boolean z11;
        canvas.save();
        pp0 pp0Var = this.f25209p0;
        Drawable drawable = pp0Var.J1;
        FrameLayout frameLayout = pp0Var.f29496t1;
        canvas.translate(0.0f, pp0Var.f29481l2);
        int L2 = org.telegram.messenger.i0.L(6.0f) + (pp0Var.f29474h2 - pp0Var.f21615s0) + this.f25203i0;
        int L3 = ((pp0Var.f29474h2 - pp0Var.f21615s0) - org.telegram.messenger.i0.L(13.0f)) + this.f25203i0;
        pp0Var.P1 = L3;
        int L4 = org.telegram.messenger.i0.L(60.0f) + getMeasuredHeight();
        int i11 = pp0Var.f21615s0;
        int i12 = L4 + i11;
        boolean z12 = true;
        if (!pp0Var.V) {
            int i13 = pp0Var.f29507y2.f7767b;
            L2 += i13;
            if (this.f25202h0 && L3 + i11 < i13) {
                z11 = true;
            } else {
                z11 = false;
            }
            f7 = this.f25208o0.d(z11);
            L3 = org.telegram.messenger.i0.W1(f7, L3 + i13, -i11);
        } else {
            f7 = 0.0f;
        }
        drawable.setBounds(0, L3, getMeasuredWidth(), i12);
        drawable.draw(canvas);
        float f10 = pp0Var.f21615s0 + L3 + pp0Var.f29481l2;
        if (pp0Var.f29486o1 != f10) {
            pp0Var.f29486o1 = f10;
            pp0Var.f29475i1.invalidate();
        }
        if (frameLayout != null) {
            if (L3 <= pp0Var.f29507y2.f7767b && frameLayout.getChildCount() > 0) {
                frameLayout.setTranslationY(0.0f);
                wb wbVar = wb.f32194w;
                if (wbVar != null) {
                    bb bbVar = wbVar.e;
                    if (bbVar != null) {
                        bbVar.setTop(true);
                    }
                    wbVar.b();
                }
            } else {
                frameLayout.setTranslationY(Math.max(0, ((L3 + pp0Var.f21615s0) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            }
        }
        if (f7 < 1.0f) {
            float f11 = L2;
            float measuredWidth = (getMeasuredWidth() + org.telegram.messenger.i0.L(36.0f)) / 2;
            float L5 = org.telegram.messenger.i0.L(4.0f) + L2;
            RectF rectF = this.f25201g0;
            rectF.set((getMeasuredWidth() - L) / 2, f11, measuredWidth, L5);
            org.telegram.ui.ActionBar.t6.f21218t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.wj, pp0Var.I0));
            org.telegram.ui.ActionBar.t6.f21218t0.setAlpha((int) ((1.0f - f7) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.f21218t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, pp0Var.I0)) > 0.721f && 0 > pp0Var.f29507y2.f7767b * 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((systemUiVisibility & 8192) <= 0) {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                i10 = systemUiVisibility | 8192;
            } else {
                i10 = systemUiVisibility & (-8193);
            }
            setSystemUiVisibility(i10);
        }
        canvas.restore();
        this.f25204j0 = this.f25203i0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f25202h0;
        pp0 pp0Var = this.f25209p0;
        if (!z10) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f25203i0 - org.telegram.messenger.i0.L(30.0f)) {
                pp0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && pp0Var.f29474h2 != 0 && motionEvent.getY() < pp0Var.f29474h2 - org.telegram.messenger.i0.L(30.0f)) {
            pp0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cp0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        boolean z12;
        int i14;
        int i15;
        int i16;
        int emojiPadding;
        cp0 cp0Var = this;
        pp0 pp0Var = cp0Var.f25209p0;
        po0 po0Var = pp0Var.f29506y1;
        FrameLayout frameLayout = pp0Var.U1;
        po0 po0Var2 = pp0Var.f29504x1;
        uk0 uk0Var = pp0Var.f29502w1;
        if (cp0Var.getLayoutParams().height > 0) {
            size = cp0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        s4.r rVar = pp0Var.f29508z1;
        int i17 = 0;
        if (cp0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.G = z10;
        zy zyVar = pp0Var.B1;
        if (cp0Var.getLayoutParams().height <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        zyVar.G = z11;
        if (!pp0Var.V) {
            cp0Var.f25200f0 = true;
            int i18 = pp0Var.f21616t0;
            cp0Var.setPadding(i18, pp0Var.f29507y2.f7767b, i18, 0);
            cp0Var.f25200f0 = false;
        }
        int paddingTop = size - cp0Var.getPaddingTop();
        int max = Math.max(pp0Var.E1.b(), pp0Var.C1.b() - 1);
        int D = org.telegram.messenger.m5.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), org.telegram.messenger.i0.L(48.0f) + org.telegram.messenger.i0.L(103.0f)) + pp0Var.f21615s0;
        if (uk0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.m5.D(103.0f, Math.max(2, (int) Math.ceil((pp0Var.D1.b() - 1) / 4.0f)), org.telegram.messenger.i0.L(48.0f) + org.telegram.messenger.i0.L(103.0f)) + pp0Var.f21615s0;
            if (D2 > D) {
                D = org.telegram.messenger.i0.W1(uk0Var.getAlpha(), D, D2);
            }
        }
        if (D < paddingTop) {
            i12 = 0;
        } else {
            i12 = paddingTop - ((paddingTop / 5) * 3);
        }
        int i19 = 48;
        if (frameLayout != null) {
            i13 = 48;
        } else {
            i13 = 0;
        }
        int L = org.telegram.messenger.i0.L(i13 + 100) + pp0Var.f29507y2.d;
        if (po0Var2.getPaddingTop() != i12 || po0Var2.getPaddingBottom() != L) {
            cp0Var.f25200f0 = true;
            po0Var2.setPadding(0, i12, 0, L);
            uk0Var.setPadding(0, i12, 0, L);
            cp0Var.f25200f0 = false;
        }
        if (pp0Var.d && cp0Var.getLayoutParams().height <= 0 && po0Var.getPaddingTop() != i12) {
            cp0Var.f25200f0 = true;
            if (frameLayout == null) {
                i19 = 0;
            }
            po0Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(i19 + 60) + pp0Var.f29507y2.d);
            cp0Var.f25200f0 = false;
        }
        if (D >= size) {
            z12 = true;
        } else {
            z12 = false;
        }
        cp0Var.f25202h0 = z12;
        if (z12) {
            i14 = 0;
        } else {
            i14 = size - D;
        }
        cp0Var.f25203i0 = i14;
        cp0Var.f25200f0 = true;
        pp0Var.K0(false);
        cp0Var.f25200f0 = false;
        cp0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        int i20 = pp0Var.f21616t0;
        FrameLayout frameLayout2 = pp0Var.f29490q1;
        uo0 uo0Var = pp0Var.f29479k1;
        int i21 = size2 - (i20 * 2);
        int Q = cp0Var.Q();
        pp0Var.F2 = Q;
        if (!uo0Var.N && Q <= org.telegram.messenger.i0.L(20.0f) && !uo0Var.e && !uo0Var.O) {
            cp0Var.f25200f0 = true;
            uo0Var.j();
            cp0Var.f25200f0 = false;
        }
        cp0Var.f25200f0 = true;
        if (pp0Var.F2 <= org.telegram.messenger.i0.L(20.0f)) {
            if (!org.telegram.messenger.i0.E) {
                if (pp0Var.d) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = uo0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (uo0Var.e) {
                i16 = 8;
            } else {
                i16 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i16);
            }
            i15 = 8;
        } else {
            if (!uo0Var.m()) {
                uo0Var.j();
            }
            i15 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i22 = makeMeasureSpec;
        int i23 = size3;
        cp0Var.f25200f0 = false;
        int childCount = cp0Var.getChildCount();
        while (i17 < childCount) {
            View childAt = cp0Var.getChildAt(i17);
            if (childAt != null && childAt.getVisibility() != i15) {
                if (uo0Var.l(childAt)) {
                    if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i21, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (org.telegram.messenger.i0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i21, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(200.0f), cp0Var.getPaddingTop() + (i23 - pp0Var.f29507y2.f7767b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i21, 1073741824), View.MeasureSpec.makeMeasureSpec(cp0Var.getPaddingTop() + (i23 - pp0Var.f29507y2.f7767b), 1073741824));
                    }
                } else {
                    cp0Var.measureChildWithMargins(childAt, i10, 0, i22, 0);
                }
            }
            i17++;
            cp0Var = this;
        }
        pp0Var.Z0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f25209p0.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f25200f0) {
            return;
        }
        super.requestLayout();
    }
}
