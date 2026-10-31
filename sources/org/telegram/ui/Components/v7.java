package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class v7 extends sk0 {
    public final Context f31154c;
    public ArrayList d = new ArrayList();
    public String e;
    public t7 f31155f;
    public boolean h;
    public final w7 f31156n;

    public v7(w7 w7Var, Context context) {
        this.f31156n = w7Var;
        this.f31154c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (this.f31156n.f32057l2 && c1Var.b() == 0) {
            return false;
        }
        return true;
    }

    public final void E(String str) {
        if (this.f31155f != null) {
            Utilities.f14522g.a(this.f31155f);
            this.f31155f = null;
        }
        if (str == null) {
            this.e = null;
            this.d.clear();
            f();
            return;
        }
        org.telegram.messenger.r5 r5Var = Utilities.f14522g;
        t7 t7Var = new t7(this, str, 0);
        this.f31155f = t7Var;
        r5Var.d(t7Var, 300L);
    }

    @Override
    public final int b() {
        int size;
        w7 w7Var = this.f31156n;
        boolean z10 = w7Var.f32057l2;
        if (w7Var.f32058m1) {
            size = this.d.size();
        } else if (w7Var.f32061n2.size() > 1) {
            size = w7Var.f32061n2.size();
        } else {
            return 0;
        }
        return size + (z10 ? 1 : 0);
    }

    @Override
    public final int d(int i10) {
        if (this.f31156n.f32057l2 && i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void f() {
        boolean z10;
        boolean z11;
        super.f();
        w7 w7Var = this.f31156n;
        View view = w7Var.l1;
        e7 e7Var = w7Var.f32074u1;
        j7 j7Var = w7Var.f32062o1;
        int i10 = 0;
        if (w7Var.f32061n2.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            if (w7Var.f32061n2.size() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.h = z11;
            if (z11) {
                j7Var.setVisibility(0);
                j7Var.setTranslationY(org.telegram.messenger.i0.f16026q.y);
                j7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final v7 f30169b;

                    {
                        this.f30169b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                this.f30169b.f31156n.f21586b.invalidate();
                                return;
                            default:
                                this.f30169b.f31156n.f21586b.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(gr.h).start();
            } else {
                j7Var.animate().translationY(org.telegram.messenger.i0.f16026q.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final v7 f30169b;

                    {
                        this.f30169b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                this.f30169b.f31156n.f21586b.invalidate();
                                return;
                            default:
                                this.f30169b.f31156n.f21586b.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(gr.h).withEndAction(new tf(this, 10)).start();
            }
        }
        if (w7Var.f32061n2.size() > 1) {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.Fj, e7Var, w7Var.I0);
            view.setVisibility(0);
            j7Var.setPadding(0, j7Var.getPaddingTop(), 0, org.telegram.messenger.i0.L(231.0f));
        } else {
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.Fj, e7Var, w7Var.I0);
            view.setVisibility(0);
            j7Var.setPadding(0, j7Var.getPaddingTop(), 0, 0);
        }
        w7Var.f32068r1.setVisibility((w7Var.f32060n1 && w7Var.f32066q1.b() == 0) ? 8 : 8);
        w7Var.Z0();
    }

    @Override
    public final void t(s4.c1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v7.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        Context context = this.f31154c;
        int i11 = 1;
        if (i10 == 1) {
            bn bnVar = new bn(context, 6);
            bnVar.setTag(-33024);
            return new s4.c1(bnVar);
        }
        if (MediaController.B().C0 == null) {
            i11 = 0;
        }
        return new s4.c1(new org.telegram.ui.Cells.w(i11, context, this.f31156n.I0));
    }
}
