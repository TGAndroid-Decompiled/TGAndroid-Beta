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
public final class no0 extends du0 {
    public boolean f37911g0;
    public final RectF f37912h0;
    public boolean f37913i0;
    public int f37914j0;
    public int f37915k0;
    public int f37916l0;
    public int m0;
    public int f37917n0;
    public int f37918o0;
    public final d6 f37919p0;
    public final ap0 f37920q0;

    public no0(ap0 ap0Var, Context context) {
        super(context, null);
        this.f37920q0 = ap0Var;
        this.f37911g0 = false;
        this.f37912h0 = new RectF();
        this.I = new mo0(this, this);
        org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, ap0Var.J0));
        this.f37919p0 = new d6(this, 0L, 350L, nr.h);
    }

    @Override
    public final void J(Canvas canvas, ArrayList arrayList) {
        ap0 ap0Var = this.f37920q0;
        co0 co0Var = ap0Var.C1;
        ek0 ek0Var = ap0Var.A1;
        co0 co0Var2 = ap0Var.B1;
        if (co0Var2.getVisibility() == 0 && co0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(co0Var2.getX(), co0Var2.getY());
            co0Var2.draw(canvas);
            canvas.restore();
        }
        if (ek0Var.getVisibility() == 0 && ek0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(ek0Var.getX(), ek0Var.getY());
            ek0Var.draw(canvas);
            canvas.restore();
        }
        if (co0Var.getVisibility() == 0 && co0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(co0Var.getX(), co0Var.getY());
            co0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        ap0 ap0Var = this.f37920q0;
        canvas.clipRect(0.0f, getPaddingTop() + ap0Var.f33579p2, getMeasuredWidth(), getMeasuredHeight() + ap0Var.f33579p2 + org.telegram.messenger.g0.L(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof ty) {
            ap0 ap0Var = this.f37920q0;
            if (ap0Var.Q2 != null) {
                canvas.save();
                ap0Var.Q2.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(ap0Var.Q2.R.f11676k);
                ap0Var.Q2.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final org.telegram.ui.ActionBar.h6 getResourceProvider() {
        return this.f37920q0.J0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.i1 i1Var = this.I;
        i1Var.f29007b = this;
        i1Var.c();
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
        ap0 ap0Var = this.f37920q0;
        Drawable drawable = ap0Var.N1;
        FrameLayout frameLayout = ap0Var.f33594x1;
        canvas.translate(0.0f, ap0Var.f33579p2);
        int L2 = org.telegram.messenger.g0.L(6.0f) + (ap0Var.f33572l2 - ap0Var.f30210t0) + this.f37914j0;
        int L3 = ((ap0Var.f33572l2 - ap0Var.f30210t0) - org.telegram.messenger.g0.L(13.0f)) + this.f37914j0;
        ap0Var.T1 = L3;
        int L4 = org.telegram.messenger.g0.L(60.0f) + getMeasuredHeight();
        int i10 = ap0Var.f30210t0;
        int i11 = L4 + i10;
        boolean z12 = true;
        if (!ap0Var.W) {
            int i12 = ap0Var.C2.f15918b;
            L2 += i12;
            if (this.f37913i0 && L3 + i10 < i12) {
                z11 = true;
            } else {
                z11 = false;
            }
            f10 = this.f37919p0.d(z11);
            L3 = org.telegram.messenger.g0.W1(f10, L3 + i12, -i10);
        } else {
            f10 = 0.0f;
        }
        drawable.setBounds(0, L3, getMeasuredWidth(), i11);
        drawable.draw(canvas);
        float f11 = ap0Var.f30210t0 + L3 + ap0Var.f33579p2;
        if (ap0Var.f33584s1 != f11) {
            ap0Var.f33584s1 = f11;
            ap0Var.f33573m1.invalidate();
        }
        if (frameLayout != null) {
            if (L3 <= ap0Var.C2.f15918b && frameLayout.getChildCount() > 0) {
                frameLayout.setTranslationY(0.0f);
                gc gcVar = gc.f35519w;
                if (gcVar != null) {
                    lb lbVar = gcVar.f35523e;
                    if (lbVar != null) {
                        lbVar.setTop(true);
                    }
                    gcVar.b();
                }
            } else {
                frameLayout.setTranslationY(Math.max(0, ((L3 + ap0Var.f30210t0) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            }
        }
        if (f10 < 1.0f) {
            float f12 = L2;
            float measuredWidth = (getMeasuredWidth() + org.telegram.messenger.g0.L(36.0f)) / 2;
            float L5 = org.telegram.messenger.g0.L(4.0f) + L2;
            RectF rectF = this.f37912h0;
            rectF.set((getMeasuredWidth() - L) / 2, f12, measuredWidth, L5);
            org.telegram.ui.ActionBar.m6.f29672t0.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.zj, ap0Var.J0));
            org.telegram.ui.ActionBar.m6.f29672t0.setAlpha((int) ((1.0f - f10) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.m6.f29672t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, ap0Var.J0)) > 0.721f && 0 > ap0Var.C2.f15918b * 0.5f) {
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
        this.f37915k0 = this.f37914j0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f37913i0;
        ap0 ap0Var = this.f37920q0;
        if (!z10) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f37914j0 - org.telegram.messenger.g0.L(30.0f)) {
                ap0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && ap0Var.f33572l2 != 0 && motionEvent.getY() < ap0Var.f33572l2 - org.telegram.messenger.g0.L(30.0f)) {
            ap0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.no0.onLayout(boolean, int, int, int, int):void");
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
        no0 no0Var = this;
        ap0 ap0Var = no0Var.f37920q0;
        co0 co0Var = ap0Var.C1;
        FrameLayout frameLayout = ap0Var.Y1;
        co0 co0Var2 = ap0Var.B1;
        ek0 ek0Var = ap0Var.A1;
        if (no0Var.getLayoutParams().height > 0) {
            size = no0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i10);
        }
        v4.t tVar = ap0Var.D1;
        int i16 = 0;
        if (no0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tVar.G = z10;
        xy xyVar = ap0Var.F1;
        if (no0Var.getLayoutParams().height <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        xyVar.G = z11;
        if (!ap0Var.W) {
            no0Var.f37911g0 = true;
            int i17 = ap0Var.f30211u0;
            no0Var.setPadding(i17, ap0Var.C2.f15918b, i17, 0);
            no0Var.f37911g0 = false;
        }
        int paddingTop = size - no0Var.getPaddingTop();
        int max = Math.max(ap0Var.I1.b(), ap0Var.G1.b() - 1);
        int D = org.telegram.messenger.f3.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(103.0f)) + ap0Var.f30210t0;
        if (ek0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.f3.D(103.0f, Math.max(2, (int) Math.ceil((ap0Var.H1.b() - 1) / 4.0f)), org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(103.0f)) + ap0Var.f30210t0;
            if (D2 > D) {
                D = org.telegram.messenger.g0.W1(ek0Var.getAlpha(), D, D2);
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
        int L = org.telegram.messenger.g0.L(i12 + 100) + ap0Var.C2.d;
        if (co0Var2.getPaddingTop() != i11 || co0Var2.getPaddingBottom() != L) {
            no0Var.f37911g0 = true;
            co0Var2.setPadding(0, i11, 0, L);
            ek0Var.setPadding(0, i11, 0, L);
            no0Var.f37911g0 = false;
        }
        if (ap0Var.d && no0Var.getLayoutParams().height <= 0 && co0Var.getPaddingTop() != i11) {
            no0Var.f37911g0 = true;
            if (frameLayout == null) {
                i18 = 0;
            }
            co0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(i18 + 60) + ap0Var.C2.d);
            no0Var.f37911g0 = false;
        }
        if (D >= size) {
            z12 = true;
        } else {
            z12 = false;
        }
        no0Var.f37913i0 = z12;
        if (z12) {
            i13 = 0;
        } else {
            i13 = size - D;
        }
        no0Var.f37914j0 = i13;
        no0Var.f37911g0 = true;
        ap0Var.L0(false);
        no0Var.f37911g0 = false;
        no0Var.setMeasuredDimension(View.MeasureSpec.getSize(i7), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i7);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        int i19 = ap0Var.f30211u0;
        FrameLayout frameLayout2 = ap0Var.f33588u1;
        go0 go0Var = ap0Var.f33576o1;
        int i20 = size2 - (i19 * 2);
        int Q = no0Var.Q();
        ap0Var.J2 = Q;
        if (!go0Var.O && Q <= org.telegram.messenger.g0.L(20.0f) && !go0Var.f42538e && !go0Var.P) {
            no0Var.f37911g0 = true;
            go0Var.j();
            no0Var.f37911g0 = false;
        }
        no0Var.f37911g0 = true;
        if (ap0Var.J2 <= org.telegram.messenger.g0.L(20.0f)) {
            if (!org.telegram.messenger.g0.E) {
                if (ap0Var.d) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = go0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (go0Var.f42538e) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i15);
            }
            i14 = 8;
        } else {
            if (!go0Var.m()) {
                go0Var.j();
            }
            i14 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i21 = makeMeasureSpec;
        int i22 = size3;
        no0Var.f37911g0 = false;
        int childCount = no0Var.getChildCount();
        while (i16 < childCount) {
            View childAt = no0Var.getChildAt(i16);
            if (childAt != null && childAt.getVisibility() != i14) {
                if (go0Var.l(childAt)) {
                    if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(200.0f), no0Var.getPaddingTop() + (i22 - ap0Var.C2.f15918b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(no0Var.getPaddingTop() + (i22 - ap0Var.C2.f15918b), 1073741824));
                    }
                } else {
                    no0Var.measureChildWithMargins(childAt, i7, 0, i21, 0);
                }
            }
            i16++;
            no0Var = this;
        }
        ap0Var.a1();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f37920q0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f37911g0) {
            return;
        }
        super.requestLayout();
    }
}
