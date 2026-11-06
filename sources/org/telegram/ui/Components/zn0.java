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
public final class zn0 extends rt0 {
    public boolean f41036f0;
    public final RectF f41037g0;
    public boolean f41038h0;
    public int f41039i0;
    public int f41040j0;
    public int f41041k0;
    public int f41042l0;
    public int m0;
    public int f41043n0;
    public final w5 f41044o0;
    public final mo0 f41045p0;

    public zn0(mo0 mo0Var, Context context) {
        super(context, null);
        this.f41045p0 = mo0Var;
        this.f41036f0 = false;
        this.f41037g0 = new RectF();
        this.H = new yn0(this, this);
        org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, mo0Var.I0));
        this.f41044o0 = new w5(this, 0L, 350L, xq.h);
    }

    @Override
    public final void J(Canvas canvas, ArrayList arrayList) {
        mo0 mo0Var = this.f41045p0;
        on0 on0Var = mo0Var.f36091y1;
        pj0 pj0Var = mo0Var.f36087w1;
        on0 on0Var2 = mo0Var.f36089x1;
        if (on0Var2.getVisibility() == 0 && on0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(on0Var2.getX(), on0Var2.getY());
            on0Var2.draw(canvas);
            canvas.restore();
        }
        if (pj0Var.getVisibility() == 0 && pj0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(pj0Var.getX(), pj0Var.getY());
            pj0Var.draw(canvas);
            canvas.restore();
        }
        if (on0Var.getVisibility() == 0 && on0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(on0Var.getX(), on0Var.getY());
            on0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        mo0 mo0Var = this.f41045p0;
        canvas.clipRect(0.0f, getPaddingTop() + mo0Var.f36067l2, getMeasuredWidth(), getMeasuredHeight() + mo0Var.f36067l2 + org.telegram.messenger.g0.L(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof gy) {
            mo0 mo0Var = this.f41045p0;
            if (mo0Var.M2 != null) {
                canvas.save();
                mo0Var.M2.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(mo0Var.M2.Q.f11513k);
                mo0Var.M2.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.f41045p0.I0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.i1 i1Var = this.H;
        i1Var.f27542b = this;
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
        mo0 mo0Var = this.f41045p0;
        Drawable drawable = mo0Var.J1;
        FrameLayout frameLayout = mo0Var.f36081t1;
        canvas.translate(0.0f, mo0Var.f36067l2);
        int L2 = org.telegram.messenger.g0.L(6.0f) + (mo0Var.f36060h2 - mo0Var.f28644s0) + this.f41039i0;
        int L3 = ((mo0Var.f36060h2 - mo0Var.f28644s0) - org.telegram.messenger.g0.L(13.0f)) + this.f41039i0;
        mo0Var.P1 = L3;
        int L4 = org.telegram.messenger.g0.L(60.0f) + getMeasuredHeight();
        int i10 = mo0Var.f28644s0;
        int i11 = L4 + i10;
        boolean z11 = true;
        if (!mo0Var.V) {
            int i12 = mo0Var.f36092y2.f15118b;
            L2 += i12;
            if (this.f41038h0 && L3 + i10 < i12) {
                z10 = true;
            } else {
                z10 = false;
            }
            f10 = this.f41044o0.d(z10);
            L3 = org.telegram.messenger.g0.W1(f10, L3 + i12, -i10);
        } else {
            f10 = 0.0f;
        }
        drawable.setBounds(0, L3, getMeasuredWidth(), i11);
        drawable.draw(canvas);
        float f11 = mo0Var.f28644s0 + L3 + mo0Var.f36067l2;
        if (mo0Var.f36071o1 != f11) {
            mo0Var.f36071o1 = f11;
            mo0Var.f36061i1.invalidate();
        }
        if (frameLayout != null) {
            if (L3 <= mo0Var.f36092y2.f15118b && frameLayout.getChildCount() > 0) {
                frameLayout.setTranslationY(0.0f);
                cc ccVar = cc.f32515w;
                if (ccVar != null) {
                    gb gbVar = ccVar.f32519e;
                    if (gbVar != null) {
                        gbVar.setTop(true);
                    }
                    ccVar.b();
                }
            } else {
                frameLayout.setTranslationY(Math.max(0, ((L3 + mo0Var.f28644s0) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            }
        }
        if (f10 < 1.0f) {
            float f12 = L2;
            float measuredWidth = (getMeasuredWidth() + org.telegram.messenger.g0.L(36.0f)) / 2;
            float L5 = org.telegram.messenger.g0.L(4.0f) + L2;
            RectF rectF = this.f41037g0;
            rectF.set((getMeasuredWidth() - L) / 2, f12, measuredWidth, L5);
            org.telegram.ui.ActionBar.k6.f28139t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, mo0Var.I0));
            org.telegram.ui.ActionBar.k6.f28139t0.setAlpha((int) ((1.0f - f10) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.f28139t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, mo0Var.I0)) > 0.721f && 0 > mo0Var.f36092y2.f15118b * 0.5f) {
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
        this.f41040j0 = this.f41039i0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z9 = this.f41038h0;
        mo0 mo0Var = this.f41045p0;
        if (!z9) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f41039i0 - org.telegram.messenger.g0.L(30.0f)) {
                mo0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && mo0Var.f36060h2 != 0 && motionEvent.getY() < mo0Var.f36060h2 - org.telegram.messenger.g0.L(30.0f)) {
            mo0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zn0.onLayout(boolean, int, int, int, int):void");
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
        zn0 zn0Var = this;
        mo0 mo0Var = zn0Var.f41045p0;
        on0 on0Var = mo0Var.f36091y1;
        FrameLayout frameLayout = mo0Var.U1;
        on0 on0Var2 = mo0Var.f36089x1;
        pj0 pj0Var = mo0Var.f36087w1;
        if (zn0Var.getLayoutParams().height > 0) {
            size = zn0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i10);
        }
        v4.s sVar = mo0Var.f36093z1;
        int i16 = 0;
        if (zn0Var.getLayoutParams().height <= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        sVar.G = z9;
        ky kyVar = mo0Var.B1;
        if (zn0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        kyVar.G = z10;
        if (!mo0Var.V) {
            zn0Var.f41036f0 = true;
            int i17 = mo0Var.f28645t0;
            zn0Var.setPadding(i17, mo0Var.f36092y2.f15118b, i17, 0);
            zn0Var.f41036f0 = false;
        }
        int paddingTop = size - zn0Var.getPaddingTop();
        int max = Math.max(mo0Var.E1.b(), mo0Var.C1.b() - 1);
        int D = org.telegram.messenger.k5.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(103.0f)) + mo0Var.f28644s0;
        if (pj0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.k5.D(103.0f, Math.max(2, (int) Math.ceil((mo0Var.D1.b() - 1) / 4.0f)), org.telegram.messenger.g0.L(48.0f) + org.telegram.messenger.g0.L(103.0f)) + mo0Var.f28644s0;
            if (D2 > D) {
                D = org.telegram.messenger.g0.W1(pj0Var.getAlpha(), D, D2);
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
        int L = org.telegram.messenger.g0.L(i12 + 100) + mo0Var.f36092y2.d;
        if (on0Var2.getPaddingTop() != i11 || on0Var2.getPaddingBottom() != L) {
            zn0Var.f41036f0 = true;
            on0Var2.setPadding(0, i11, 0, L);
            pj0Var.setPadding(0, i11, 0, L);
            zn0Var.f41036f0 = false;
        }
        if (mo0Var.d && zn0Var.getLayoutParams().height <= 0 && on0Var.getPaddingTop() != i11) {
            zn0Var.f41036f0 = true;
            if (frameLayout == null) {
                i18 = 0;
            }
            on0Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(i18 + 60) + mo0Var.f36092y2.d);
            zn0Var.f41036f0 = false;
        }
        if (D >= size) {
            z11 = true;
        } else {
            z11 = false;
        }
        zn0Var.f41038h0 = z11;
        if (z11) {
            i13 = 0;
        } else {
            i13 = size - D;
        }
        zn0Var.f41039i0 = i13;
        zn0Var.f41036f0 = true;
        mo0Var.K0(false);
        zn0Var.f41036f0 = false;
        zn0Var.setMeasuredDimension(View.MeasureSpec.getSize(i7), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i7);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        int i19 = mo0Var.f28645t0;
        FrameLayout frameLayout2 = mo0Var.f36075q1;
        sn0 sn0Var = mo0Var.f36065k1;
        int i20 = size2 - (i19 * 2);
        int Q = zn0Var.Q();
        mo0Var.F2 = Q;
        if (!sn0Var.N && Q <= org.telegram.messenger.g0.L(20.0f) && !sn0Var.f35416e && !sn0Var.O) {
            zn0Var.f41036f0 = true;
            sn0Var.j();
            zn0Var.f41036f0 = false;
        }
        zn0Var.f41036f0 = true;
        if (mo0Var.F2 <= org.telegram.messenger.g0.L(20.0f)) {
            if (!org.telegram.messenger.g0.E) {
                if (mo0Var.d) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = sn0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (sn0Var.f35416e) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i15);
            }
            i14 = 8;
        } else {
            if (!sn0Var.m()) {
                sn0Var.j();
            }
            i14 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i21 = makeMeasureSpec;
        int i22 = size3;
        zn0Var.f41036f0 = false;
        int childCount = zn0Var.getChildCount();
        while (i16 < childCount) {
            View childAt = zn0Var.getChildAt(i16);
            if (childAt != null && childAt.getVisibility() != i14) {
                if (sn0Var.l(childAt)) {
                    if (!org.telegram.messenger.g0.E && !org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (org.telegram.messenger.g0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.g0.L(200.0f), zn0Var.getPaddingTop() + (i22 - mo0Var.f36092y2.f15118b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i20, 1073741824), View.MeasureSpec.makeMeasureSpec(zn0Var.getPaddingTop() + (i22 - mo0Var.f36092y2.f15118b), 1073741824));
                    }
                } else {
                    zn0Var.measureChildWithMargins(childAt, i7, 0, i21, 0);
                }
            }
            i16++;
            zn0Var = this;
        }
        mo0Var.Z0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f41045p0.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f41036f0) {
            return;
        }
        super.requestLayout();
    }
}
