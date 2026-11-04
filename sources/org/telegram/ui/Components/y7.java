package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class y7 extends sj0 {
    public final Context f40639c;
    public ArrayList d = new ArrayList();
    public String f40640e;
    public w7 f40641f;
    public boolean h;
    public final z7 f40642n;

    public y7(z7 z7Var, Context context) {
        this.f40642n = z7Var;
        this.f40639c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (this.f40642n.f40953m2 && d1Var.b() == 0) {
            return false;
        }
        return true;
    }

    public final void E(String str) {
        if (this.f40641f != null) {
            Utilities.f21389g.a(this.f40641f);
            this.f40641f = null;
        }
        if (str == null) {
            this.f40640e = null;
            this.d.clear();
            f();
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.f21389g;
        w7 w7Var = new w7(this, str, 0);
        this.f40641f = w7Var;
        p5Var.e(w7Var, 300L);
    }

    @Override
    public final int b() {
        int size;
        z7 z7Var = this.f40642n;
        boolean z10 = z7Var.f40953m2;
        if (z7Var.f40954n1) {
            size = this.d.size();
        } else if (z7Var.f40957o2.size() > 1) {
            size = z7Var.f40957o2.size();
        } else {
            return 0;
        }
        return size + (z10 ? 1 : 0);
    }

    @Override
    public final int d(int i3) {
        if (this.f40642n.f40953m2 && i3 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void f() {
        boolean z10;
        boolean z11;
        super.f();
        z7 z7Var = this.f40642n;
        View view = z7Var.m1;
        g7 g7Var = z7Var.f40970v1;
        l7 l7Var = z7Var.f40958p1;
        int i3 = 0;
        if (z7Var.f40957o2.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            if (z7Var.f40957o2.size() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.h = z11;
            if (z11) {
                l7Var.setVisibility(0);
                l7Var.setTranslationY(org.telegram.messenger.g0.f22608q.y);
                l7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final y7 f39024b;

                    {
                        this.f39024b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                this.f39024b.f40642n.f28586b.invalidate();
                                return;
                            default:
                                this.f39024b.f40642n.f28586b.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(xq.h).start();
            } else {
                l7Var.animate().translationY(org.telegram.messenger.g0.f22608q.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final y7 f39024b;

                    {
                        this.f39024b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                this.f39024b.f40642n.f28586b.invalidate();
                                return;
                            default:
                                this.f39024b.f40642n.f28586b.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(xq.h).withEndAction(new vf(this, 9)).start();
            }
        }
        if (z7Var.f40957o2.size() > 1) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.Fj, g7Var, z7Var.J0);
            view.setVisibility(0);
            l7Var.setPadding(0, l7Var.getPaddingTop(), 0, org.telegram.messenger.g0.L(231.0f));
        } else {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.Fj, g7Var, z7Var.J0);
            view.setVisibility(0);
            l7Var.setPadding(0, l7Var.getPaddingTop(), 0, 0);
        }
        z7Var.f40964s1.setVisibility((z7Var.f40956o1 && z7Var.f40962r1.b() == 0) ? 8 : 8);
        z7Var.Z0();
    }

    @Override
    public final void t(u4.d1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y7.t(u4.d1, int):void");
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        Context context = this.f40639c;
        int i10 = 1;
        if (i3 == 1) {
            sm smVar = new sm(context, 10);
            smVar.setTag(-33024);
            return new u4.d1(smVar);
        }
        if (MediaController.B().D0 == null) {
            i10 = 0;
        }
        return new u4.d1(new org.telegram.ui.Cells.w(i10, context, this.f40642n.J0));
    }
}
