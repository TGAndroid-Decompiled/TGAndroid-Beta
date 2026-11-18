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
public final class lo0 extends au0 {
    public boolean f37158g0;
    public final RectF f37159h0;
    public boolean f37160i0;
    public int f37161j0;
    public int f37162k0;
    public int f37163l0;
    public int m0;
    public int f37164n0;
    public int f37165o0;
    public final c6 f37166p0;
    public final yo0 f37167q0;

    public lo0(yo0 yo0Var, Context context) {
        super(context, null);
        this.f37167q0 = yo0Var;
        this.f37158g0 = false;
        this.f37159h0 = new RectF();
        this.I = new ko0(this, this);
        org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29467h5, yo0Var.J0));
        this.f37166p0 = new c6(this, 0L, 350L, lr.h);
    }

    @Override
    public final void J(Canvas canvas, ArrayList arrayList) {
        yo0 yo0Var = this.f37167q0;
        ao0 ao0Var = yo0Var.C1;
        ck0 ck0Var = yo0Var.A1;
        ao0 ao0Var2 = yo0Var.B1;
        if (ao0Var2.getVisibility() == 0 && ao0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(ao0Var2.getX(), ao0Var2.getY());
            ao0Var2.draw(canvas);
            canvas.restore();
        }
        if (ck0Var.getVisibility() == 0 && ck0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(ck0Var.getX(), ck0Var.getY());
            ck0Var.draw(canvas);
            canvas.restore();
        }
        if (ao0Var.getVisibility() == 0 && ao0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(ao0Var.getX(), ao0Var.getY());
            ao0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        yo0 yo0Var = this.f37167q0;
        canvas.clipRect(0.0f, getPaddingTop() + yo0Var.f42570p2, getMeasuredWidth(), getMeasuredHeight() + yo0Var.f42570p2 + org.telegram.messenger.g0.L(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof ry) {
            yo0 yo0Var = this.f37167q0;
            if (yo0Var.Q2 != null) {
                canvas.save();
                yo0Var.Q2.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(yo0Var.Q2.R.f11644k);
                yo0Var.Q2.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final org.telegram.ui.ActionBar.i6 getResourceProvider() {
        return this.f37167q0.J0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.j1 j1Var = this.I;
        j1Var.f29019b = this;
        j1Var.c();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.d();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        boolean z10;
        int i7;
        int L;
        Paint paint;
        boolean z11;
        canvas.save();
        yo0 yo0Var = this.f37167q0;
        Drawable drawable = yo0Var.N1;
        FrameLayout frameLayout = yo0Var.f42585x1;
        canvas.translate(0.0f, yo0Var.f42570p2);
        int L2 = org.telegram.messenger.g0.L(6.0f) + (yo0Var.f42563l2 - yo0Var.f30224t0) + this.f37161j0;
        int L3 = ((yo0Var.f42563l2 - yo0Var.f30224t0) - org.telegram.messenger.g0.L(13.0f)) + this.f37161j0;
        yo0Var.T1 = L3;
        int L4 = org.telegram.messenger.g0.L(60.0f) + getMeasuredHeight();
        int i10 = yo0Var.f30224t0;
        int i11 = L4 + i10;
        boolean z12 = true;
        if (!yo0Var.W) {
            int i12 = yo0Var.C2.f15890b;
            L2 += i12;
            if (this.f37160i0 && L3 + i10 < i12) {
                z11 = true;
            } else {
                z11 = false;
            }
            f10 = this.f37166p0.d(z11);
            L3 = org.telegram.messenger.g0.W1(f10, L3 + i12, -i10);
        } else {
            f10 = 0.0f;
        }
        drawable.setBounds(0, L3, getMeasuredWidth(), i11);
        drawable.draw(canvas);
        float f11 = yo0Var.f30224t0 + L3 + yo0Var.f42570p2;
        if (yo0Var.f42575s1 != f11) {
            yo0Var.f42575s1 = f11;
            yo0Var.f42564m1.invalidate();
        }
        if (frameLayout != null) {
            if (L3 <= yo0Var.C2.f15890b && frameLayout.getChildCount() > 0) {
                frameLayout.setTranslationY(0.0f);
                gc gcVar = gc.f35453w;
                if (gcVar != null) {
                    lb lbVar = gcVar.f35457e;
                    if (lbVar != null) {
                        lbVar.setTop(true);
                    }
                    gcVar.b();
                }
            } else {
                frameLayout.setTranslationY(Math.max(0, ((L3 + yo0Var.f30224t0) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            }
        }
        if (f10 < 1.0f) {
            float f12 = L2;
            float measuredWidth = (getMeasuredWidth() + org.telegram.messenger.g0.L(36.0f)) / 2;
            float L5 = org.telegram.messenger.g0.L(4.0f) + L2;
            RectF rectF = this.f37159h0;
            rectF.set((getMeasuredWidth() - L) / 2, f12, measuredWidth, L5);
            org.telegram.ui.ActionBar.n6.f29685t0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.zj, yo0Var.J0));
            org.telegram.ui.ActionBar.n6.f29685t0.setAlpha((int) ((1.0f - f10) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.f29685t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29467h5, yo0Var.J0)) > 0.721f && 0 > yo0Var.C2.f15890b * 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((systemUiVisibility & 8192) <= 0) {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                i7 = systemUiVisibility | 8192;
            } else {
                i7 = systemUiVisibility & (-8193);
            }
            setSystemUiVisibility(i7);
        }
        canvas.restore();
        this.f37162k0 = this.f37161j0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f37160i0;
        yo0 yo0Var = this.f37167q0;
        if (!z10) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f37161j0 - org.telegram.messenger.g0.L(30.0f)) {
                yo0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && yo0Var.f42563l2 != 0 && motionEvent.getY() < yo0Var.f42563l2 - org.telegram.messenger.g0.L(30.0f)) {
            yo0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lo0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        boolean z12;
        int i13;
        int i14;
        int i15;
        int emojiPadding;
        lo0 lo0Var = this;
        yo0 yo0Var = lo0Var.f37167q0;
        ao0 ao0Var = yo0Var.C1;
        FrameLayout frameLayout = yo0Var.Y1;
        ao0 ao0Var2 = yo0Var.B1;
        ck0 ck0Var = yo0Var.A1;
        if (lo0Var.getLayoutParams().height > 0) {
            size = lo0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i10);
        }
        v4.t tVar = yo0Var.D1;
        int i16 = 0;
        if (lo0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tVar.G = z10;
        vy vyVar = yo0Var.F1;
        if (lo0Var.getLayoutParams().height <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        vyVar.G = z11;
        if (!yo0Var.W) {
            lo0Var.f37158g0 = true;
            int i17 = yo0Var.f30225u0;
            lo0Var.setPadding(i17, yo0Var.C2.f15890b, i17, 0);
            lo0Var.f37158g0 = false;
        }
        int paddingTop = size - lo0Var.getPaddingTop();
        int max = Math.max(yo0Var.I1.b(), yo0Var.G1.b() - 1);
        int D = org.telegram.messenger.f3.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(103.0f)) + yo0Var.f30224t0;
        if (ck0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.f3.D(103.0f, Math.max(2, (int) Math.ceil((yo0Var.H1.b() - 1) / 4.0f)), org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(103.0f)) + yo0Var.f30224t0;
            if (D2 > D) {
                D = org.telegram.messenger.g0.W1(ck0Var.getAlpha(), D, D2);
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
        int L = org.telegram.messenger.g0.L(i12 + 100) + yo0Var.C2.d;
        if (ao0Var2.getPaddingTop() != i11 || ao0Var2.getPaddingBottom() != L) {
            lo0Var.f37158g0 = true;
            ao0Var2.setPadding(0, i11, 0, L);
            ck0Var.setPadding(0, i11, 0, L);
            lo0Var.f37158g0 = false;
        }
        if (yo0Var.d && lo0Var.getLayoutParams().height <= 0 && ao0Var.getPaddingTop() != i11) {
            lo0Var.f37158g0 = true;
            if (frameLayout == null) {
                i18 = 0;
            }
            ao0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(i18 + 60) + yo0Var.C2.d);
            lo0Var.f37158g0 = false;
        }
        if (D >= size) {
            z12 = true;
        } else {
            z12 = false;
        }
        lo0Var.f37160i0 = z12;
        if (z12) {
            i13 = 0;
        } else {
            i13 = size - D;
        }
        lo0Var.f37161j0 = i13;
        lo0Var.f37158g0 = true;
        yo0Var.L0(false);
        lo0Var.f37158g0 = false;
        lo0Var.setMeasuredDimension(View.MeasureSpec.getSize(i7), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i7);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        int i19 = yo0Var.f30225u0;
        FrameLayout frameLayout2 = yo0Var.f42579u1;
        eo0 eo0Var = yo0Var.f42567o1;
        int i20 = size2 - (i19 * 2);
        int Q = lo0Var.Q();
        yo0Var.J2 = Q;
        if (!eo0Var.O && Q <= org.telegram.messenger.g0.L(20.0f) && !eo0Var.f41789e && !eo0Var.P) {
            lo0Var.f37158g0 = true;
            eo0Var.j();
            lo0Var.f37158g0 = false;
        }
        lo0Var.f37158g0 = true;
        if (yo0Var.J2 <= org.telegram.messenger.g0.L(20.0f)) {
            if (!org.telegram.messenger.g0.E) {
                if (yo0Var.d) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = eo0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (eo0Var.f41789e) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i15);
            }
            i14 = 8;
        } else {
            if (!eo0Var.m()) {
                eo0Var.j();
            }
            i14 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i21 = makeMeasureSpec;
        int i22 = size3;
        lo0Var.f37158g0 = false;
        int childCount = lo0Var.getChildCount();
        while (i16 < childCount) {
            View childAt = lo0Var.getChildAt(i16);
            if (childAt != null && childAt.getVisibility() != i14) {
                if (eo0Var.l(childAt)) {
                    if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(200.0f), lo0Var.getPaddingTop() + (i22 - yo0Var.C2.f15890b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(lo0Var.getPaddingTop() + (i22 - yo0Var.C2.f15890b), 1073741824));
                    }
                } else {
                    lo0Var.measureChildWithMargins(childAt, i7, 0, i21, 0);
                }
            }
            i16++;
            lo0Var = this;
        }
        yo0Var.a1();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f37167q0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f37158g0) {
            return;
        }
        super.requestLayout();
    }
}
