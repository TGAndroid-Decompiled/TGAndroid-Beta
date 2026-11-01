package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class mc extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public org.telegram.ui.ActionBar.u5 f39498a;
    public org.telegram.ui.Components.rz0 f39499b;
    public org.telegram.ui.Components.d5 f39500c;
    public org.telegram.ui.ActionBar.p6 d;
    public boolean e;
    public int f39501f;

    public final void a(int i10, int i11, boolean z10) {
        org.telegram.messenger.mp mpVar;
        org.telegram.messenger.lp lpVar = null;
        if (i11 < 0) {
            b(null);
        } else if (i11 < 7) {
            this.f39501f = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21189r8[i11], this.d);
        } else {
            org.telegram.messenger.wp r12 = org.telegram.messenger.wp.r1(i10);
            if (z10) {
                mpVar = r12.f19231r4;
            } else {
                mpVar = r12.f19241s4;
            }
            if (mpVar != null) {
                lpVar = mpVar.d(i11);
            }
            b(lpVar);
        }
        invalidate();
    }

    public final void b(org.telegram.messenger.lp lpVar) {
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        if (lpVar == null) {
            int i10 = org.telegram.ui.ActionBar.t6.f21207s8;
            if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(i10, p6Var)) > 0.8f) {
                this.f39501f = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21116n6, p6Var);
                return;
            } else if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(i10, p6Var)) < 0.2f) {
                this.f39501f = org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.A8, p6Var));
                return;
            } else {
                this.f39501f = org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, p6Var), org.telegram.ui.ActionBar.t6.r1(0.7f, rn0.B0(org.telegram.ui.ActionBar.t6.w0(i10, p6Var))));
                return;
            }
        }
        this.f39501f = lpVar.e(0, p6Var);
    }

    public final void c(long j10, boolean z10, boolean z11) {
        org.telegram.ui.Components.d5 d5Var = this.f39500c;
        if (j10 == 0) {
            d5Var.g(null, z11);
            if (this.f39499b == null) {
                this.f39499b = new org.telegram.ui.Components.rz0(org.telegram.messenger.dd.L0(2131752311, null), 16.0f, null);
            }
        } else {
            d5Var.j(j10, z11);
            this.f39499b = null;
        }
        d5Var.m(z10, z11);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.d5 d5Var = this.f39500c;
        if (document == null) {
            d5Var.g(null, false);
            if (this.f39499b == null) {
                this.f39499b = new org.telegram.ui.Components.rz0(org.telegram.messenger.dd.L0(2131752311, null), 16.0f, null);
            }
        } else {
            d5Var.i(document, false);
            this.f39499b = null;
        }
        d5Var.m(false, false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        float L;
        int i10;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        super.dispatchDraw(canvas);
        f();
        org.telegram.ui.Components.d5 d5Var = this.f39500c;
        d5Var.k(Integer.valueOf(this.f39501f));
        org.telegram.ui.Components.rz0 rz0Var = this.f39499b;
        if (rz0Var != null) {
            canvas2 = canvas;
            rz0Var.c((getMeasuredWidth() - this.f39499b.k()) - org.telegram.messenger.i0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.q6, p6Var), canvas2);
        } else {
            canvas2 = canvas;
            d5Var.draw(canvas2);
        }
        if (this.e) {
            if (p6Var != null) {
                paint = p6Var.d("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.t6.f21053k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (org.telegram.messenger.dd.X) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.i0.L(23.0f);
                }
                float f7 = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (org.telegram.messenger.dd.X) {
                    i10 = org.telegram.messenger.i0.L(23.0f);
                } else {
                    i10 = 0;
                }
                canvas2.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    public final void e(int i10) {
        org.telegram.ui.ActionBar.u5 u5Var = this.f39498a;
        if (i10 <= 0) {
            u5Var.i(null);
            return;
        }
        u5Var.i(new org.telegram.ui.ActionBar.y2(i10, getContext(), this.d, false));
        u5Var.setDrawablePadding(org.telegram.messenger.i0.L(6.0f));
    }

    public final void f() {
        org.telegram.ui.Components.d5 d5Var = this.f39500c;
        d5Var.setBounds((getWidth() - d5Var.f25375s) - org.telegram.messenger.i0.L(21.0f), (getHeight() - d5Var.f25375s) / 2, getWidth() - org.telegram.messenger.i0.L(21.0f), (getHeight() + d5Var.f25375s) / 2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39500c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f39500c.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.u5 u5Var = this.f39498a;
        if (u5Var != null) {
            u5Var.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.d));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
