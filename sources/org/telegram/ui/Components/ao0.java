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
public final class ao0 extends tt0 {
    public boolean f31925f0;
    public final RectF f31926g0;
    public boolean f31927h0;
    public int f31928i0;
    public int f31929j0;
    public int f31930k0;
    public int f31931l0;
    public int m0;
    public int f31932n0;
    public final w5 f31933o0;
    public final no0 f31934p0;

    public ao0(no0 no0Var, Context context) {
        super(context, null);
        this.f31934p0 = no0Var;
        this.f31925f0 = false;
        this.f31926g0 = new RectF();
        this.H = new zn0(this, this);
        org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, no0Var.I0));
        this.f31933o0 = new w5(this, 0L, 350L, xq.h);
    }

    @Override
    public final void J(Canvas canvas, ArrayList arrayList) {
        no0 no0Var = this.f31934p0;
        pn0 pn0Var = no0Var.f36467y1;
        qj0 qj0Var = no0Var.f36463w1;
        pn0 pn0Var2 = no0Var.f36465x1;
        if (pn0Var2.getVisibility() == 0 && pn0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(pn0Var2.getX(), pn0Var2.getY());
            pn0Var2.draw(canvas);
            canvas.restore();
        }
        if (qj0Var.getVisibility() == 0 && qj0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(qj0Var.getX(), qj0Var.getY());
            qj0Var.draw(canvas);
            canvas.restore();
        }
        if (pn0Var.getVisibility() == 0 && pn0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(pn0Var.getX(), pn0Var.getY());
            pn0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        no0 no0Var = this.f31934p0;
        canvas.clipRect(0.0f, getPaddingTop() + no0Var.f36443l2, getMeasuredWidth(), getMeasuredHeight() + no0Var.f36443l2 + org.telegram.messenger.g0.L(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof hy) {
            no0 no0Var = this.f31934p0;
            if (no0Var.M2 != null) {
                canvas.save();
                no0Var.M2.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(no0Var.M2.Q.f11513k);
                no0Var.M2.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.f31934p0.I0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.i1 i1Var = this.H;
        i1Var.f27521b = this;
        i1Var.c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        boolean z9;
        int i7;
        int L;
        Paint paint;
        boolean z10;
        canvas.save();
        no0 no0Var = this.f31934p0;
        Drawable drawable = no0Var.J1;
        FrameLayout frameLayout = no0Var.f36457t1;
        canvas.translate(0.0f, no0Var.f36443l2);
        int L2 = org.telegram.messenger.g0.L(6.0f) + (no0Var.f36436h2 - no0Var.f28653s0) + this.f31928i0;
        int L3 = ((no0Var.f36436h2 - no0Var.f28653s0) - org.telegram.messenger.g0.L(13.0f)) + this.f31928i0;
        no0Var.P1 = L3;
        int L4 = org.telegram.messenger.g0.L(60.0f) + getMeasuredHeight();
        int i10 = no0Var.f28653s0;
        int i11 = L4 + i10;
        boolean z11 = true;
        if (!no0Var.V) {
            int i12 = no0Var.f36468y2.f15121b;
            L2 += i12;
            if (this.f31927h0 && L3 + i10 < i12) {
                z10 = true;
            } else {
                z10 = false;
            }
            f10 = this.f31933o0.d(z10);
            L3 = org.telegram.messenger.g0.W1(f10, L3 + i12, -i10);
        } else {
            f10 = 0.0f;
        }
        drawable.setBounds(0, L3, getMeasuredWidth(), i11);
        drawable.draw(canvas);
        float f11 = no0Var.f28653s0 + L3 + no0Var.f36443l2;
        if (no0Var.f36447o1 != f11) {
            no0Var.f36447o1 = f11;
            no0Var.f36437i1.invalidate();
        }
        if (frameLayout != null) {
            if (L3 <= no0Var.f36468y2.f15121b && frameLayout.getChildCount() > 0) {
                frameLayout.setTranslationY(0.0f);
                cc ccVar = cc.f32619w;
                if (ccVar != null) {
                    gb gbVar = ccVar.f32623e;
                    if (gbVar != null) {
                        gbVar.setTop(true);
                    }
                    ccVar.b();
                }
            } else {
                frameLayout.setTranslationY(Math.max(0, ((L3 + no0Var.f28653s0) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            }
        }
        if (f10 < 1.0f) {
            float f12 = L2;
            float measuredWidth = (getMeasuredWidth() + org.telegram.messenger.g0.L(36.0f)) / 2;
            float L5 = org.telegram.messenger.g0.L(4.0f) + L2;
            RectF rectF = this.f31926g0;
            rectF.set((getMeasuredWidth() - L) / 2, f12, measuredWidth, L5);
            org.telegram.ui.ActionBar.l6.f28156t0.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.wj, no0Var.I0));
            org.telegram.ui.ActionBar.l6.f28156t0.setAlpha((int) ((1.0f - f10) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.l6.f28156t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, no0Var.I0)) > 0.721f && 0 > no0Var.f36468y2.f15121b * 0.5f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((systemUiVisibility & 8192) <= 0) {
            z11 = false;
        }
        if (z9 != z11) {
            if (z9) {
                i7 = systemUiVisibility | 8192;
            } else {
                i7 = systemUiVisibility & (-8193);
            }
            setSystemUiVisibility(i7);
        }
        canvas.restore();
        this.f31929j0 = this.f31928i0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z9 = this.f31927h0;
        no0 no0Var = this.f31934p0;
        if (!z9) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f31928i0 - org.telegram.messenger.g0.L(30.0f)) {
                no0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && no0Var.f36436h2 != 0 && motionEvent.getY() < no0Var.f36436h2 - org.telegram.messenger.g0.L(30.0f)) {
            no0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ao0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size;
        boolean z9;
        boolean z10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        int i14;
        int i15;
        int emojiPadding;
        ao0 ao0Var = this;
        no0 no0Var = ao0Var.f31934p0;
        pn0 pn0Var = no0Var.f36467y1;
        FrameLayout frameLayout = no0Var.U1;
        pn0 pn0Var2 = no0Var.f36465x1;
        qj0 qj0Var = no0Var.f36463w1;
        if (ao0Var.getLayoutParams().height > 0) {
            size = ao0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i10);
        }
        v4.s sVar = no0Var.f36469z1;
        int i16 = 0;
        if (ao0Var.getLayoutParams().height <= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        sVar.G = z9;
        ly lyVar = no0Var.B1;
        if (ao0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        lyVar.G = z10;
        if (!no0Var.V) {
            ao0Var.f31925f0 = true;
            int i17 = no0Var.f28654t0;
            ao0Var.setPadding(i17, no0Var.f36468y2.f15121b, i17, 0);
            ao0Var.f31925f0 = false;
        }
        int paddingTop = size - ao0Var.getPaddingTop();
        int max = Math.max(no0Var.E1.b(), no0Var.C1.b() - 1);
        int D = org.telegram.messenger.k5.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(103.0f)) + no0Var.f28653s0;
        if (qj0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.k5.D(103.0f, Math.max(2, (int) Math.ceil((no0Var.D1.b() - 1) / 4.0f)), org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(103.0f)) + no0Var.f28653s0;
            if (D2 > D) {
                D = org.telegram.messenger.g0.W1(qj0Var.getAlpha(), D, D2);
            }
        }
        if (D < paddingTop) {
            i11 = 0;
        } else {
            i11 = paddingTop - ((paddingTop / 5) * 3);
        }
        int i18 = 48;
        if (frameLayout != null) {
            i12 = 48;
        } else {
            i12 = 0;
        }
        int L = org.telegram.messenger.g0.L(i12 + 100) + no0Var.f36468y2.d;
        if (pn0Var2.getPaddingTop() != i11 || pn0Var2.getPaddingBottom() != L) {
            ao0Var.f31925f0 = true;
            pn0Var2.setPadding(0, i11, 0, L);
            qj0Var.setPadding(0, i11, 0, L);
            ao0Var.f31925f0 = false;
        }
        if (no0Var.d && ao0Var.getLayoutParams().height <= 0 && pn0Var.getPaddingTop() != i11) {
            ao0Var.f31925f0 = true;
            if (frameLayout == null) {
                i18 = 0;
            }
            pn0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(i18 + 60) + no0Var.f36468y2.d);
            ao0Var.f31925f0 = false;
        }
        if (D >= size) {
            z11 = true;
        } else {
            z11 = false;
        }
        ao0Var.f31927h0 = z11;
        if (z11) {
            i13 = 0;
        } else {
            i13 = size - D;
        }
        ao0Var.f31928i0 = i13;
        ao0Var.f31925f0 = true;
        no0Var.K0(false);
        ao0Var.f31925f0 = false;
        ao0Var.setMeasuredDimension(View.MeasureSpec.getSize(i7), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i7);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        int i19 = no0Var.f28654t0;
        FrameLayout frameLayout2 = no0Var.f36451q1;
        tn0 tn0Var = no0Var.f36441k1;
        int i20 = size2 - (i19 * 2);
        int Q = ao0Var.Q();
        no0Var.F2 = Q;
        if (!tn0Var.N && Q <= org.telegram.messenger.g0.L(20.0f) && !tn0Var.f35844e && !tn0Var.O) {
            ao0Var.f31925f0 = true;
            tn0Var.j();
            ao0Var.f31925f0 = false;
        }
        ao0Var.f31925f0 = true;
        if (no0Var.F2 <= org.telegram.messenger.g0.L(20.0f)) {
            if (!org.telegram.messenger.g0.E) {
                if (no0Var.d) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = tn0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (tn0Var.f35844e) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i15);
            }
            i14 = 8;
        } else {
            if (!tn0Var.m()) {
                tn0Var.j();
            }
            i14 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i21 = makeMeasureSpec;
        int i22 = size3;
        ao0Var.f31925f0 = false;
        int childCount = ao0Var.getChildCount();
        while (i16 < childCount) {
            View childAt = ao0Var.getChildAt(i16);
            if (childAt != null && childAt.getVisibility() != i14) {
                if (tn0Var.l(childAt)) {
                    if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(200.0f), ao0Var.getPaddingTop() + (i22 - no0Var.f36468y2.f15121b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(ao0Var.getPaddingTop() + (i22 - no0Var.f36468y2.f15121b), 1073741824));
                    }
                } else {
                    ao0Var.measureChildWithMargins(childAt, i7, 0, i21, 0);
                }
            }
            i16++;
            ao0Var = this;
        }
        no0Var.Z0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f31934p0.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f31925f0) {
            return;
        }
        super.requestLayout();
    }
}
