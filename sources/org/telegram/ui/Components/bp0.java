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
public final class bp0 extends uu0 {
    public boolean f24856f0;
    public final RectF f24857g0;
    public boolean f24858h0;
    public int f24859i0;
    public int f24860j0;
    public int f24861k0;
    public int f24862l0;
    public int m0;
    public int f24863n0;
    public final t5 f24864o0;
    public final op0 f24865p0;

    public bp0(op0 op0Var, Context context) {
        super(context, null);
        this.f24865p0 = op0Var;
        this.f24856f0 = false;
        this.f24857g0 = new RectF();
        this.H = new ap0(this, this);
        org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, op0Var.I0));
        this.f24864o0 = new t5(this, 0L, 350L, gr.h);
    }

    @Override
    public final void J(Canvas canvas, ArrayList arrayList) {
        op0 op0Var = this.f24865p0;
        oo0 oo0Var = op0Var.f29151y1;
        tk0 tk0Var = op0Var.f29147w1;
        oo0 oo0Var2 = op0Var.f29149x1;
        if (oo0Var2.getVisibility() == 0 && oo0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(oo0Var2.getX(), oo0Var2.getY());
            oo0Var2.draw(canvas);
            canvas.restore();
        }
        if (tk0Var.getVisibility() == 0 && tk0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(tk0Var.getX(), tk0Var.getY());
            tk0Var.draw(canvas);
            canvas.restore();
        }
        if (oo0Var.getVisibility() == 0 && oo0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(oo0Var.getX(), oo0Var.getY());
            oo0Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        op0 op0Var = this.f24865p0;
        canvas.clipRect(0.0f, getPaddingTop() + op0Var.f29126l2, getMeasuredWidth(), getMeasuredHeight() + op0Var.f29126l2 + org.telegram.messenger.i0.L(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof vy) {
            op0 op0Var = this.f24865p0;
            if (op0Var.M2 != null) {
                canvas.save();
                op0Var.M2.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(op0Var.M2.M.f50837k);
                op0Var.M2.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.f24865p0.I0;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.m1 m1Var = this.H;
        m1Var.f20563b = this;
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
        op0 op0Var = this.f24865p0;
        Drawable drawable = op0Var.J1;
        FrameLayout frameLayout = op0Var.f29141t1;
        canvas.translate(0.0f, op0Var.f29126l2);
        int L2 = org.telegram.messenger.i0.L(6.0f) + (op0Var.f29119h2 - op0Var.f21614s0) + this.f24859i0;
        int L3 = ((op0Var.f29119h2 - op0Var.f21614s0) - org.telegram.messenger.i0.L(13.0f)) + this.f24859i0;
        op0Var.P1 = L3;
        int L4 = org.telegram.messenger.i0.L(60.0f) + getMeasuredHeight();
        int i11 = op0Var.f21614s0;
        int i12 = L4 + i11;
        boolean z12 = true;
        if (!op0Var.V) {
            int i13 = op0Var.f29152y2.f7766b;
            L2 += i13;
            if (this.f24858h0 && L3 + i11 < i13) {
                z11 = true;
            } else {
                z11 = false;
            }
            f7 = this.f24864o0.d(z11);
            L3 = org.telegram.messenger.i0.W1(f7, L3 + i13, -i11);
        } else {
            f7 = 0.0f;
        }
        drawable.setBounds(0, L3, getMeasuredWidth(), i12);
        drawable.draw(canvas);
        float f10 = op0Var.f21614s0 + L3 + op0Var.f29126l2;
        if (op0Var.f29131o1 != f10) {
            op0Var.f29131o1 = f10;
            op0Var.f29120i1.invalidate();
        }
        if (frameLayout != null) {
            if (L3 <= op0Var.f29152y2.f7766b && frameLayout.getChildCount() > 0) {
                frameLayout.setTranslationY(0.0f);
                wb wbVar = wb.f32128w;
                if (wbVar != null) {
                    bb bbVar = wbVar.e;
                    if (bbVar != null) {
                        bbVar.setTop(true);
                    }
                    wbVar.b();
                }
            } else {
                frameLayout.setTranslationY(Math.max(0, ((L3 + op0Var.f21614s0) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            }
        }
        if (f7 < 1.0f) {
            float f11 = L2;
            float measuredWidth = (getMeasuredWidth() + org.telegram.messenger.i0.L(36.0f)) / 2;
            float L5 = org.telegram.messenger.i0.L(4.0f) + L2;
            RectF rectF = this.f24857g0;
            rectF.set((getMeasuredWidth() - L) / 2, f11, measuredWidth, L5);
            org.telegram.ui.ActionBar.t6.f21217t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.wj, op0Var.I0));
            org.telegram.ui.ActionBar.t6.f21217t0.setAlpha((int) ((1.0f - f7) * paint.getAlpha()));
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.f21217t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, op0Var.I0)) > 0.721f && 0 > op0Var.f29152y2.f7766b * 0.5f) {
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
        this.f24860j0 = this.f24859i0;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.f24858h0;
        op0 op0Var = this.f24865p0;
        if (!z10) {
            if (motionEvent.getAction() == 0 && motionEvent.getY() < this.f24859i0 - org.telegram.messenger.i0.L(30.0f)) {
                op0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && op0Var.f29119h2 != 0 && motionEvent.getY() < op0Var.f29119h2 - org.telegram.messenger.i0.L(30.0f)) {
            op0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean r13, int r14, int r15, int r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bp0.onLayout(boolean, int, int, int, int):void");
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
        bp0 bp0Var = this;
        op0 op0Var = bp0Var.f24865p0;
        oo0 oo0Var = op0Var.f29151y1;
        FrameLayout frameLayout = op0Var.U1;
        oo0 oo0Var2 = op0Var.f29149x1;
        tk0 tk0Var = op0Var.f29147w1;
        if (bp0Var.getLayoutParams().height > 0) {
            size = bp0Var.getLayoutParams().height;
        } else {
            size = View.MeasureSpec.getSize(i11);
        }
        s4.r rVar = op0Var.f29153z1;
        int i17 = 0;
        if (bp0Var.getLayoutParams().height <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        rVar.G = z10;
        zy zyVar = op0Var.B1;
        if (bp0Var.getLayoutParams().height <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        zyVar.G = z11;
        if (!op0Var.V) {
            bp0Var.f24856f0 = true;
            int i18 = op0Var.f21615t0;
            bp0Var.setPadding(i18, op0Var.f29152y2.f7766b, i18, 0);
            bp0Var.f24856f0 = false;
        }
        int paddingTop = size - bp0Var.getPaddingTop();
        int max = Math.max(op0Var.E1.b(), op0Var.C1.b() - 1);
        int D = org.telegram.messenger.m5.D(103.0f, Math.max(2, (int) Math.ceil(max / 4.0f)), org.telegram.messenger.i0.L(48.0f) + org.telegram.messenger.i0.L(103.0f)) + op0Var.f21614s0;
        if (tk0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.m5.D(103.0f, Math.max(2, (int) Math.ceil((op0Var.D1.b() - 1) / 4.0f)), org.telegram.messenger.i0.L(48.0f) + org.telegram.messenger.i0.L(103.0f)) + op0Var.f21614s0;
            if (D2 > D) {
                D = org.telegram.messenger.i0.W1(tk0Var.getAlpha(), D, D2);
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
        int L = org.telegram.messenger.i0.L(i13 + 100) + op0Var.f29152y2.d;
        if (oo0Var2.getPaddingTop() != i12 || oo0Var2.getPaddingBottom() != L) {
            bp0Var.f24856f0 = true;
            oo0Var2.setPadding(0, i12, 0, L);
            tk0Var.setPadding(0, i12, 0, L);
            bp0Var.f24856f0 = false;
        }
        if (op0Var.d && bp0Var.getLayoutParams().height <= 0 && oo0Var.getPaddingTop() != i12) {
            bp0Var.f24856f0 = true;
            if (frameLayout == null) {
                i19 = 0;
            }
            oo0Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(i19 + 60) + op0Var.f29152y2.d);
            bp0Var.f24856f0 = false;
        }
        if (D >= size) {
            z12 = true;
        } else {
            z12 = false;
        }
        bp0Var.f24858h0 = z12;
        if (z12) {
            i14 = 0;
        } else {
            i14 = size - D;
        }
        bp0Var.f24859i0 = i14;
        bp0Var.f24856f0 = true;
        op0Var.K0(false);
        bp0Var.f24856f0 = false;
        bp0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        int i20 = op0Var.f21615t0;
        FrameLayout frameLayout2 = op0Var.f29135q1;
        to0 to0Var = op0Var.f29124k1;
        int i21 = size2 - (i20 * 2);
        int Q = bp0Var.Q();
        op0Var.F2 = Q;
        if (!to0Var.N && Q <= org.telegram.messenger.i0.L(20.0f) && !to0Var.e && !to0Var.O) {
            bp0Var.f24856f0 = true;
            to0Var.j();
            bp0Var.f24856f0 = false;
        }
        bp0Var.f24856f0 = true;
        if (op0Var.F2 <= org.telegram.messenger.i0.L(20.0f)) {
            if (!org.telegram.messenger.i0.E) {
                if (op0Var.d) {
                    emojiPadding = 0;
                } else {
                    emojiPadding = to0Var.getEmojiPadding();
                }
                size3 -= emojiPadding;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
            }
            if (to0Var.e) {
                i16 = 8;
            } else {
                i16 = 0;
            }
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i16);
            }
            i15 = 8;
        } else {
            if (!to0Var.m()) {
                to0Var.j();
            }
            i15 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i22 = makeMeasureSpec;
        int i23 = size3;
        bp0Var.f24856f0 = false;
        int childCount = bp0Var.getChildCount();
        while (i17 < childCount) {
            View childAt = bp0Var.getChildAt(i17);
            if (childAt != null && childAt.getVisibility() != i15) {
                if (to0Var.l(childAt)) {
                    if (!org.telegram.messenger.i0.E && !org.telegram.messenger.i0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i21, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                    } else if (org.telegram.messenger.i0.Q1()) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i21, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(org.telegram.messenger.i0.L(200.0f), bp0Var.getPaddingTop() + (i23 - op0Var.f29152y2.f7766b)), 1073741824));
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i21, 1073741824), View.MeasureSpec.makeMeasureSpec(bp0Var.getPaddingTop() + (i23 - op0Var.f29152y2.f7766b), 1073741824));
                    }
                } else {
                    bp0Var.measureChildWithMargins(childAt, i10, 0, i22, 0);
                }
            }
            i17++;
            bp0Var = this;
        }
        op0Var.Z0();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f24865p0.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f24856f0) {
            return;
        }
        super.requestLayout();
    }
}
