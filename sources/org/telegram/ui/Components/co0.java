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
public final class co0 extends st0 {
    public boolean f33642g0;
    public final RectF f33643h0;
    public boolean f33644i0;
    public int f33645j0;
    public int f33646k0;
    public int f33647l0;
    public int m0;
    public int f33648n0;
    public int f33649o0;
    public final u5 f33650p0;
    public final po0 f33651q0;

    public co0(po0 po0Var, Context context) {
        super(context, null);
        this.f33651q0 = po0Var;
        this.f33642g0 = false;
        this.f33643h0 = new RectF();
        this.I = new bo0(this, this);
        org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, po0Var.J0));
        this.f33650p0 = new u5(this, 0L, 350L, er.h);
    }

    @Override
    public final void J(Canvas canvas, ArrayList arrayList) {
        po0 po0Var = this.f33651q0;
        rn0 rn0Var = po0Var.C1;
        uj0 uj0Var = po0Var.A1;
        rn0 rn0Var2 = po0Var.B1;
        if (rn0Var2.getVisibility() == 0 && rn0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(rn0Var2.getX(), rn0Var2.getY());
            rn0Var2.draw(canvas);
            canvas.restore();
        }
        if (uj0Var.getVisibility() == 0 && uj0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(uj0Var.getX(), uj0Var.getY());
            uj0Var.draw(canvas);
            canvas.restore();
        }
        if (rn0Var.getVisibility() == 0 && rn0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(rn0Var.getX(), rn0Var.getY());
            rn0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        po0 po0Var = this.f33651q0;
        canvas.clipRect(0.0f, getPaddingTop() + po0Var.f38357p2, getMeasuredWidth(), getMeasuredHeight() + po0Var.f38357p2 + org.telegram.messenger.g0.L(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof ly) {
            po0 po0Var = this.f33651q0;
            if (po0Var.Q2 != null) {
                canvas.save();
                po0Var.Q2.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(po0Var.Q2.R.f11327k);
                po0Var.Q2.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.f33651q0.J0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.i1 i1Var = this.I;
        i1Var.f28646b = this;
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
        po0 po0Var = this.f33651q0;
        Drawable drawable = po0Var.N1;
        FrameLayout frameLayout = po0Var.f38372x1;
        canvas.translate(0.0f, po0Var.f38357p2);
        int L2 = org.telegram.messenger.g0.L(6.0f) + (po0Var.f38350l2 - po0Var.f29716t0) + this.f33645j0;
        int L3 = ((po0Var.f38350l2 - po0Var.f29716t0) - org.telegram.messenger.g0.L(13.0f)) + this.f33645j0;
        po0Var.T1 = L3;
        int L4 = org.telegram.messenger.g0.L(60.0f) + getMeasuredHeight();
        int i10 = po0Var.f29716t0;
        int i11 = L4 + i10;
        boolean z12 = true;
        if (!po0Var.W) {
            int i12 = po0Var.C2.f15575b;
            L2 += i12;
            if (this.f33644i0 && L3 + i10 < i12) {
                z11 = true;
            } else {
                z11 = false;
            }
            f10 = this.f33650p0.d(z11);
            L3 = org.telegram.messenger.g0.W1(f10, L3 + i12, -i10);
        } else {
            f10 = 0.0f;
        }
        drawable.setBounds(0, L3, getMeasuredWidth(), i11);
        drawable.draw(canvas);
        float f11 = po0Var.f29716t0 + L3 + po0Var.f38357p2;
        if (po0Var.f38362s1 != f11) {
            po0Var.f38362s1 = f11;
            po0Var.f38351m1.invalidate();
        }
        if (frameLayout != null) {
            if (L3 <= po0Var.C2.f15575b && frameLayout.getChildCount() > 0) {
                frameLayout.setTranslationY(0.0f);
                xb xbVar = xb.f41635w;
                if (xbVar != null) {
                    cb cbVar = xbVar.f41639e;
                    if (cbVar != null) {
                        cbVar.setTop(true);
                    }
                    xbVar.b();
                }
            } else {
                frameLayout.setTranslationY(Math.max(0, ((L3 + po0Var.f29716t0) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            }
        }
        if (f10 < 1.0f) {
            float f12 = L2;
            float measuredWidth = (getMeasuredWidth() + org.telegram.messenger.g0.L(36.0f)) / 2;
            float L5 = org.telegram.messenger.g0.L(4.0f) + L2;
            RectF rectF = this.f33643h0;
            rectF.set((getMeasuredWidth() - L) / 2, f12, measuredWidth, L5);
            org.telegram.ui.ActionBar.j6.f29140t0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.zj, po0Var.J0));
            org.telegram.ui.ActionBar.j6.f29140t0.setAlpha((int) ((1.0f - f10) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.j6.f29140t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, po0Var.J0)) > 0.721f && 0 > po0Var.C2.f15575b * 0.5f) {
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
        this.f33646k0 = this.f33645j0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f33644i0;
        po0 po0Var = this.f33651q0;
        if (!z10) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f33645j0 - org.telegram.messenger.g0.L(30.0f)) {
                po0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && po0Var.f38350l2 != 0 && motionEvent.getY() < po0Var.f38350l2 - org.telegram.messenger.g0.L(30.0f)) {
            po0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.co0.onLayout(boolean, int, int, int, int):void");
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
        co0 co0Var = this;
        po0 po0Var = co0Var.f33651q0;
        rn0 rn0Var = po0Var.C1;
        FrameLayout frameLayout = po0Var.Y1;
        rn0 rn0Var2 = po0Var.B1;
        uj0 uj0Var = po0Var.A1;
        if (co0Var.getLayoutParams().height > 0) {
            size = co0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i10);
        }
        v4.s sVar = po0Var.D1;
        int i16 = 0;
        if (co0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sVar.G = z10;
        py pyVar = po0Var.F1;
        if (co0Var.getLayoutParams().height <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        pyVar.G = z11;
        if (!po0Var.W) {
            co0Var.f33642g0 = true;
            int i17 = po0Var.f29717u0;
            co0Var.setPadding(i17, po0Var.C2.f15575b, i17, 0);
            co0Var.f33642g0 = false;
        }
        int paddingTop = size - co0Var.getPaddingTop();
        int max = Math.max(po0Var.I1.b(), po0Var.G1.b() - 1);
        int D = org.telegram.messenger.k5.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(103.0f)) + po0Var.f29716t0;
        if (uj0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.k5.D(103.0f, Math.max(2, (int) Math.ceil((po0Var.H1.b() - 1) / 4.0f)), org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(103.0f)) + po0Var.f29716t0;
            if (D2 > D) {
                D = org.telegram.messenger.g0.W1(uj0Var.getAlpha(), D, D2);
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
        int L = org.telegram.messenger.g0.L(i12 + 100) + po0Var.C2.d;
        if (rn0Var2.getPaddingTop() != i11 || rn0Var2.getPaddingBottom() != L) {
            co0Var.f33642g0 = true;
            rn0Var2.setPadding(0, i11, 0, L);
            uj0Var.setPadding(0, i11, 0, L);
            co0Var.f33642g0 = false;
        }
        if (po0Var.d && co0Var.getLayoutParams().height <= 0 && rn0Var.getPaddingTop() != i11) {
            co0Var.f33642g0 = true;
            if (frameLayout == null) {
                i18 = 0;
            }
            rn0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(i18 + 60) + po0Var.C2.d);
            co0Var.f33642g0 = false;
        }
        if (D >= size) {
            z12 = true;
        } else {
            z12 = false;
        }
        co0Var.f33644i0 = z12;
        if (z12) {
            i13 = 0;
        } else {
            i13 = size - D;
        }
        co0Var.f33645j0 = i13;
        co0Var.f33642g0 = true;
        po0Var.K0(false);
        co0Var.f33642g0 = false;
        co0Var.setMeasuredDimension(View.MeasureSpec.getSize(i7), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i7);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        int i19 = po0Var.f29717u0;
        FrameLayout frameLayout2 = po0Var.f38366u1;
        vn0 vn0Var = po0Var.f38354o1;
        int i20 = size2 - (i19 * 2);
        int Q = co0Var.Q();
        po0Var.J2 = Q;
        if (!vn0Var.O && Q <= org.telegram.messenger.g0.L(20.0f) && !vn0Var.f39059e && !vn0Var.P) {
            co0Var.f33642g0 = true;
            vn0Var.j();
            co0Var.f33642g0 = false;
        }
        co0Var.f33642g0 = true;
        if (po0Var.J2 <= org.telegram.messenger.g0.L(20.0f)) {
            if (!org.telegram.messenger.g0.E) {
                if (po0Var.d) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = vn0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (vn0Var.f39059e) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i15);
            }
            i14 = 8;
        } else {
            if (!vn0Var.m()) {
                vn0Var.j();
            }
            i14 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i21 = makeMeasureSpec;
        int i22 = size3;
        co0Var.f33642g0 = false;
        int childCount = co0Var.getChildCount();
        while (i16 < childCount) {
            View childAt = co0Var.getChildAt(i16);
            if (childAt != null && childAt.getVisibility() != i14) {
                if (vn0Var.l(childAt)) {
                    if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(200.0f), co0Var.getPaddingTop() + (i22 - po0Var.C2.f15575b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(co0Var.getPaddingTop() + (i22 - po0Var.C2.f15575b), 1073741824));
                    }
                } else {
                    co0Var.measureChildWithMargins(childAt, i7, 0, i21, 0);
                }
            }
            i16++;
            co0Var = this;
        }
        po0Var.Z0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f33651q0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f33642g0) {
            return;
        }
        super.requestLayout();
    }
}
