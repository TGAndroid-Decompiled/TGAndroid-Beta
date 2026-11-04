package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class dc extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public org.telegram.ui.ActionBar.k5 f44621a;
    public org.telegram.ui.Components.ly0 f44622b;
    public org.telegram.ui.Components.e5 f44623c;
    public org.telegram.ui.ActionBar.e6 d;
    public boolean f44624e;
    public int f44625f;

    public final void a(int i3, int i10, boolean z10) {
        org.telegram.messenger.xo xoVar;
        org.telegram.messenger.wo woVar = null;
        if (i10 < 0) {
            b(null);
        } else if (i10 < 7) {
            this.f44625f = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28142r8[i10], this.d);
        } else {
            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
            if (z10) {
                xoVar = s12.f23099q4;
            } else {
                xoVar = s12.f23109r4;
            }
            if (xoVar != null) {
                woVar = xoVar.d(i10);
            }
            b(woVar);
        }
        invalidate();
    }

    public final void b(org.telegram.messenger.wo woVar) {
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (woVar == null) {
            int i3 = org.telegram.ui.ActionBar.k6.f28160s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(i3, e6Var)) > 0.8f) {
                this.f44625f = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28062n6, e6Var);
                return;
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(i3, e6Var)) < 0.2f) {
                this.f44625f = org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, e6Var));
                return;
            } else {
                this.f44625f = org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, e6Var), org.telegram.ui.ActionBar.k6.r1(0.7f, cm0.B0(org.telegram.ui.ActionBar.k6.w0(i3, e6Var))));
                return;
            }
        }
        this.f44625f = woVar.e(0, e6Var);
    }

    public final void c(long j10, boolean z10, boolean z11) {
        org.telegram.ui.Components.e5 e5Var = this.f44623c;
        if (j10 == 0) {
            e5Var.g(null, z11);
            if (this.f44622b == null) {
                this.f44622b = new org.telegram.ui.Components.ly0(org.telegram.messenger.bd.M0(2131752311, null), 16.0f, null);
            }
        } else {
            e5Var.j(j10, z11);
            this.f44622b = null;
        }
        e5Var.m(z10, z11);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.e5 e5Var = this.f44623c;
        if (document == null) {
            e5Var.g(null, false);
            if (this.f44622b == null) {
                this.f44622b = new org.telegram.ui.Components.ly0(org.telegram.messenger.bd.M0(2131752311, null), 16.0f, null);
            }
        } else {
            e5Var.i(document, false);
            this.f44622b = null;
        }
        e5Var.m(false, false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        float L;
        int i3;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        super.dispatchDraw(canvas);
        f();
        org.telegram.ui.Components.e5 e5Var = this.f44623c;
        e5Var.k(Integer.valueOf(this.f44625f));
        org.telegram.ui.Components.ly0 ly0Var = this.f44622b;
        if (ly0Var != null) {
            canvas2 = canvas;
            ly0Var.c((getMeasuredWidth() - this.f44622b.k()) - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28121q6, e6Var), canvas2);
        } else {
            canvas2 = canvas;
            e5Var.draw(canvas2);
        }
        if (this.f44624e) {
            if (e6Var != null) {
                paint = e6Var.d("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.k6.f28002k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (org.telegram.messenger.bd.f21784a0) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.g0.L(23.0f);
                }
                float f10 = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (org.telegram.messenger.bd.f21784a0) {
                    i3 = org.telegram.messenger.g0.L(23.0f);
                } else {
                    i3 = 0;
                }
                canvas2.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    public final void e(int i3) {
        org.telegram.ui.ActionBar.k5 k5Var = this.f44621a;
        if (i3 <= 0) {
            k5Var.i(null);
            return;
        }
        k5Var.i(new org.telegram.ui.ActionBar.s2(i3, getContext(), this.d, false));
        k5Var.setDrawablePadding(org.telegram.messenger.g0.L(6.0f));
    }

    public final void f() {
        org.telegram.ui.Components.e5 e5Var = this.f44623c;
        e5Var.setBounds((getWidth() - e5Var.f33289s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - e5Var.f33289s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + e5Var.f33289s) / 2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44623c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44623c.b();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.k5 k5Var = this.f44621a;
        if (k5Var != null) {
            k5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.d));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
