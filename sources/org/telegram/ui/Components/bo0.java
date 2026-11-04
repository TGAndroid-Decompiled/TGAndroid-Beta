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
public final class bo0 extends qt0 {
    public boolean f32334g0;
    public final RectF f32335h0;
    public boolean f32336i0;
    public int f32337j0;
    public int f32338k0;
    public int f32339l0;
    public int m0;
    public int f32340n0;
    public int f32341o0;
    public final u5 f32342p0;
    public final oo0 f32343q0;

    public bo0(oo0 oo0Var, Context context) {
        super(context, null);
        this.f32343q0 = oo0Var;
        this.f32334g0 = false;
        this.f32335h0 = new RectF();
        this.I = new ao0(this, this);
        org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, oo0Var.J0));
        this.f32342p0 = new u5(this, 0L, 350L, xq.h);
    }

    @Override
    public final void J(Canvas canvas, ArrayList arrayList) {
        oo0 oo0Var = this.f32343q0;
        qn0 qn0Var = oo0Var.f36913z1;
        tj0 tj0Var = oo0Var.f36909x1;
        qn0 qn0Var2 = oo0Var.f36911y1;
        if (qn0Var2.getVisibility() == 0 && qn0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(qn0Var2.getX(), qn0Var2.getY());
            qn0Var2.draw(canvas);
            canvas.restore();
        }
        if (tj0Var.getVisibility() == 0 && tj0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(tj0Var.getX(), tj0Var.getY());
            tj0Var.draw(canvas);
            canvas.restore();
        }
        if (qn0Var.getVisibility() == 0 && qn0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(qn0Var.getX(), qn0Var.getY());
            qn0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        oo0 oo0Var = this.f32343q0;
        canvas.clipRect(0.0f, getPaddingTop() + oo0Var.f36888m2, getMeasuredWidth(), getMeasuredHeight() + oo0Var.f36888m2 + org.telegram.messenger.g0.L(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof ey) {
            oo0 oo0Var = this.f32343q0;
            if (oo0Var.N2 != null) {
                canvas.save();
                oo0Var.N2.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(oo0Var.N2.R.f12307k);
                oo0Var.N2.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.f32343q0.J0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.h1 h1Var = this.I;
        h1Var.f27553b = this;
        h1Var.c();
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
        int i3;
        int L;
        Paint paint;
        boolean z11;
        canvas.save();
        oo0 oo0Var = this.f32343q0;
        Drawable drawable = oo0Var.K1;
        FrameLayout frameLayout = oo0Var.f36903u1;
        canvas.translate(0.0f, oo0Var.f36888m2);
        int L2 = org.telegram.messenger.g0.L(6.0f) + (oo0Var.f36882i2 - oo0Var.f28617t0) + this.f32337j0;
        int L3 = ((oo0Var.f36882i2 - oo0Var.f28617t0) - org.telegram.messenger.g0.L(13.0f)) + this.f32337j0;
        oo0Var.Q1 = L3;
        int L4 = org.telegram.messenger.g0.L(60.0f) + getMeasuredHeight();
        int i10 = oo0Var.f28617t0;
        int i11 = L4 + i10;
        boolean z12 = true;
        if (!oo0Var.W) {
            int i12 = oo0Var.f36914z2.f14496b;
            L2 += i12;
            if (this.f32336i0 && L3 + i10 < i12) {
                z11 = true;
            } else {
                z11 = false;
            }
            f10 = this.f32342p0.d(z11);
            L3 = org.telegram.messenger.g0.W1(f10, L3 + i12, -i10);
        } else {
            f10 = 0.0f;
        }
        drawable.setBounds(0, L3, getMeasuredWidth(), i11);
        drawable.draw(canvas);
        float f11 = oo0Var.f28617t0 + L3 + oo0Var.f36888m2;
        if (oo0Var.f36893p1 != f11) {
            oo0Var.f36893p1 = f11;
            oo0Var.f36883j1.invalidate();
        }
        if (frameLayout != null) {
            if (L3 <= oo0Var.f36914z2.f14496b && frameLayout.getChildCount() > 0) {
                frameLayout.setTranslationY(0.0f);
                ac acVar = ac.f31784w;
                if (acVar != null) {
                    fb fbVar = acVar.f31788e;
                    if (fbVar != null) {
                        fbVar.setTop(true);
                    }
                    acVar.b();
                }
            } else {
                frameLayout.setTranslationY(Math.max(0, ((L3 + oo0Var.f28617t0) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            }
        }
        if (f10 < 1.0f) {
            float f12 = L2;
            float measuredWidth = (getMeasuredWidth() + org.telegram.messenger.g0.L(36.0f)) / 2;
            float L5 = org.telegram.messenger.g0.L(4.0f) + L2;
            RectF rectF = this.f32335h0;
            rectF.set((getMeasuredWidth() - L) / 2, f12, measuredWidth, L5);
            org.telegram.ui.ActionBar.k6.f28171t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, oo0Var.J0));
            org.telegram.ui.ActionBar.k6.f28171t0.setAlpha((int) ((1.0f - f10) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.f28171t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, oo0Var.J0)) > 0.721f && 0 > oo0Var.f36914z2.f14496b * 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((systemUiVisibility & 8192) <= 0) {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                i3 = systemUiVisibility | 8192;
            } else {
                i3 = systemUiVisibility & (-8193);
            }
            setSystemUiVisibility(i3);
        }
        canvas.restore();
        this.f32338k0 = this.f32337j0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f32336i0;
        oo0 oo0Var = this.f32343q0;
        if (!z10) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f32337j0 - org.telegram.messenger.g0.L(30.0f)) {
                oo0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && oo0Var.f36882i2 != 0 && motionEvent.getY() < oo0Var.f36882i2 - org.telegram.messenger.g0.L(30.0f)) {
            oo0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bo0.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
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
        bo0 bo0Var = this;
        oo0 oo0Var = bo0Var.f32343q0;
        qn0 qn0Var = oo0Var.f36913z1;
        FrameLayout frameLayout = oo0Var.V1;
        qn0 qn0Var2 = oo0Var.f36911y1;
        tj0 tj0Var = oo0Var.f36909x1;
        if (bo0Var.getLayoutParams().height > 0) {
            size = bo0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i10);
        }
        u4.s sVar = oo0Var.A1;
        int i16 = 0;
        if (bo0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sVar.G = z10;
        iy iyVar = oo0Var.C1;
        if (bo0Var.getLayoutParams().height <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        iyVar.G = z11;
        if (!oo0Var.W) {
            bo0Var.f32334g0 = true;
            int i17 = oo0Var.f28618u0;
            bo0Var.setPadding(i17, oo0Var.f36914z2.f14496b, i17, 0);
            bo0Var.f32334g0 = false;
        }
        int paddingTop = size - bo0Var.getPaddingTop();
        int max = Math.max(oo0Var.F1.b(), oo0Var.D1.b() - 1);
        int D = org.telegram.messenger.k5.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(103.0f)) + oo0Var.f28617t0;
        if (tj0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.k5.D(103.0f, Math.max(2, (int) Math.ceil((oo0Var.E1.b() - 1) / 4.0f)), org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(103.0f)) + oo0Var.f28617t0;
            if (D2 > D) {
                D = org.telegram.messenger.g0.W1(tj0Var.getAlpha(), D, D2);
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
        int L = org.telegram.messenger.g0.L(i12 + 100) + oo0Var.f36914z2.d;
        if (qn0Var2.getPaddingTop() != i11 || qn0Var2.getPaddingBottom() != L) {
            bo0Var.f32334g0 = true;
            qn0Var2.setPadding(0, i11, 0, L);
            tj0Var.setPadding(0, i11, 0, L);
            bo0Var.f32334g0 = false;
        }
        if (oo0Var.d && bo0Var.getLayoutParams().height <= 0 && qn0Var.getPaddingTop() != i11) {
            bo0Var.f32334g0 = true;
            if (frameLayout == null) {
                i18 = 0;
            }
            qn0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(i18 + 60) + oo0Var.f36914z2.d);
            bo0Var.f32334g0 = false;
        }
        if (D >= size) {
            z12 = true;
        } else {
            z12 = false;
        }
        bo0Var.f32336i0 = z12;
        if (z12) {
            i13 = 0;
        } else {
            i13 = size - D;
        }
        bo0Var.f32337j0 = i13;
        bo0Var.f32334g0 = true;
        oo0Var.K0(false);
        bo0Var.f32334g0 = false;
        bo0Var.setMeasuredDimension(View.MeasureSpec.getSize(i3), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i3);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        int i19 = oo0Var.f28618u0;
        FrameLayout frameLayout2 = oo0Var.f36897r1;
        un0 un0Var = oo0Var.f36886l1;
        int i20 = size2 - (i19 * 2);
        int Q = bo0Var.Q();
        oo0Var.G2 = Q;
        if (!un0Var.O && Q <= org.telegram.messenger.g0.L(20.0f) && !un0Var.f35191e && !un0Var.P) {
            bo0Var.f32334g0 = true;
            un0Var.j();
            bo0Var.f32334g0 = false;
        }
        bo0Var.f32334g0 = true;
        if (oo0Var.G2 <= org.telegram.messenger.g0.L(20.0f)) {
            if (!org.telegram.messenger.g0.E) {
                if (oo0Var.d) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = un0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (un0Var.f35191e) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i15);
            }
            i14 = 8;
        } else {
            if (!un0Var.m()) {
                un0Var.j();
            }
            i14 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i21 = makeMeasureSpec;
        int i22 = size3;
        bo0Var.f32334g0 = false;
        int childCount = bo0Var.getChildCount();
        while (i16 < childCount) {
            View childAt = bo0Var.getChildAt(i16);
            if (childAt != null && childAt.getVisibility() != i14) {
                if (un0Var.l(childAt)) {
                    if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(200.0f), bo0Var.getPaddingTop() + (i22 - oo0Var.f36914z2.f14496b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(bo0Var.getPaddingTop() + (i22 - oo0Var.f36914z2.f14496b), 1073741824));
                    }
                } else {
                    bo0Var.measureChildWithMargins(childAt, i3, 0, i21, 0);
                }
            }
            i16++;
            bo0Var = this;
        }
        oo0Var.Z0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f32343q0.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f32334g0) {
            return;
        }
        super.requestLayout();
    }
}
