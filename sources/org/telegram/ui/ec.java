package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class ec extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public org.telegram.ui.ActionBar.n5 f47154a;
    public org.telegram.ui.Components.vy0 f47155b;
    public org.telegram.ui.Components.m5 f47156c;
    public org.telegram.ui.ActionBar.i6 d;
    public boolean f47157e;
    public int f47158f;

    public final void a(int i7, int i10, boolean z10) {
        org.telegram.messenger.cp cpVar;
        org.telegram.messenger.bp bpVar = null;
        if (i10 < 0) {
            b(null);
        } else if (i10 < 7) {
            this.f47158f = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29655r8[i10], this.d);
        } else {
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(i7);
            if (z10) {
                cpVar = u12.f25767t4;
            } else {
                cpVar = u12.f25775u4;
            }
            if (cpVar != null) {
                bpVar = cpVar.d(i10);
            }
            b(bpVar);
        }
        invalidate();
    }

    public final void b(org.telegram.messenger.bp bpVar) {
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        if (bpVar == null) {
            int i7 = org.telegram.ui.ActionBar.n6.f29674s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(i7, i6Var)) > 0.8f) {
                this.f47158f = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29576n6, i6Var);
                return;
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(i7, i6Var)) < 0.2f) {
                this.f47158f = org.telegram.ui.ActionBar.n6.r1(0.5f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.A8, i6Var));
                return;
            } else {
                this.f47158f = org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29394d6, i6Var), org.telegram.ui.ActionBar.n6.r1(0.7f, lm0.B0(org.telegram.ui.ActionBar.n6.w0(i7, i6Var))));
                return;
            }
        }
        this.f47158f = bpVar.e(0, i6Var);
    }

    public final void c(long j3, boolean z10, boolean z11) {
        org.telegram.ui.Components.m5 m5Var = this.f47156c;
        if (j3 == 0) {
            m5Var.g(null, z11);
            if (this.f47155b == null) {
                this.f47155b = new org.telegram.ui.Components.vy0(org.telegram.messenger.gd.M0(2131752300, null), 16.0f, null);
            }
        } else {
            m5Var.j(j3, z11);
            this.f47155b = null;
        }
        m5Var.m(z10, z11);
    }

    public final void d(TLRPC.Document document) {
        org.telegram.ui.Components.m5 m5Var = this.f47156c;
        if (document == null) {
            m5Var.g(null, false);
            if (this.f47155b == null) {
                this.f47155b = new org.telegram.ui.Components.vy0(org.telegram.messenger.gd.M0(2131752300, null), 16.0f, null);
            }
        } else {
            m5Var.i(document, false);
            this.f47155b = null;
        }
        m5Var.m(false, false);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        Paint paint;
        float L;
        int i7;
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        super.dispatchDraw(canvas);
        f();
        org.telegram.ui.Components.m5 m5Var = this.f47156c;
        m5Var.k(Integer.valueOf(this.f47158f));
        org.telegram.ui.Components.vy0 vy0Var = this.f47155b;
        if (vy0Var != null) {
            canvas2 = canvas;
            vy0Var.c((getMeasuredWidth() - this.f47155b.k()) - org.telegram.messenger.g0.L(19.0f), getMeasuredHeight() / 2.0f, 1.0f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29634q6, i6Var), canvas2);
        } else {
            canvas2 = canvas;
            m5Var.draw(canvas2);
        }
        if (this.f47157e) {
            if (i6Var != null) {
                paint = i6Var.g("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.n6.f29517k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                if (org.telegram.messenger.gd.f24213a0) {
                    L = 0.0f;
                } else {
                    L = org.telegram.messenger.g0.L(23.0f);
                }
                float f10 = L;
                float measuredHeight = getMeasuredHeight() - 1;
                int measuredWidth = getMeasuredWidth();
                if (org.telegram.messenger.gd.f24213a0) {
                    i7 = org.telegram.messenger.g0.L(23.0f);
                } else {
                    i7 = 0;
                }
                canvas2.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    public final void e(int i7) {
        org.telegram.ui.ActionBar.n5 n5Var = this.f47154a;
        if (i7 <= 0) {
            n5Var.i(null);
            return;
        }
        n5Var.i(new org.telegram.ui.ActionBar.w2(i7, getContext(), this.d, false));
        n5Var.setDrawablePadding(org.telegram.messenger.g0.L(6.0f));
    }

    public final void f() {
        org.telegram.ui.Components.m5 m5Var = this.f47156c;
        m5Var.setBounds((getWidth() - m5Var.f37364s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - m5Var.f37364s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + m5Var.f37364s) / 2);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47156c.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47156c.b();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.n5 n5Var = this.f47154a;
        if (n5Var != null) {
            n5Var.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, this.d));
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
