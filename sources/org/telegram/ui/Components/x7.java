package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class x7 extends tj0 {
    public final Context f41608c;
    public ArrayList d = new ArrayList();
    public String f41609e;
    public v7 f41610f;
    public boolean h;
    public final y7 f41611n;

    public x7(y7 y7Var, Context context) {
        this.f41611n = y7Var;
        this.f41608c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (this.f41611n.f41911p2 && e1Var.b() == 0) {
            return false;
        }
        return true;
    }

    public final void E(String str) {
        if (this.f41610f != null) {
            Utilities.f22418g.a(this.f41610f);
            this.f41610f = null;
        }
        if (str == null) {
            this.f41609e = null;
            this.d.clear();
            f();
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.f22418g;
        v7 v7Var = new v7(this, str, 0);
        this.f41610f = v7Var;
        p5Var.d(v7Var, 300L);
    }

    @Override
    public final int b() {
        int size;
        y7 y7Var = this.f41611n;
        boolean z10 = y7Var.f41911p2;
        if (y7Var.f41912q1) {
            size = this.d.size();
        } else if (y7Var.f41915r2.size() > 1) {
            size = y7Var.f41915r2.size();
        } else {
            return 0;
        }
        return size + (z10 ? 1 : 0);
    }

    @Override
    public final int d(int i7) {
        if (this.f41611n.f41911p2 && i7 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void f() {
        boolean z10;
        boolean z11;
        super.f();
        y7 y7Var = this.f41611n;
        View view = y7Var.f41910p1;
        f7 f7Var = y7Var.f41928y1;
        k7 k7Var = y7Var.f41916s1;
        int i7 = 0;
        if (y7Var.f41915r2.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            if (y7Var.f41915r2.size() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.h = z11;
            if (z11) {
                k7Var.setVisibility(0);
                k7Var.setTranslationY(org.telegram.messenger.g0.f23609q.y);
                k7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final x7 f39941b;

                    {
                        this.f39941b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                this.f39941b.f41611n.f29682b.invalidate();
                                return;
                            default:
                                this.f39941b.f41611n.f29682b.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(er.h).start();
            } else {
                k7Var.animate().translationY(org.telegram.messenger.g0.f23609q.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final x7 f39941b;

                    {
                        this.f39941b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                this.f39941b.f41611n.f29682b.invalidate();
                                return;
                            default:
                                this.f39941b.f41611n.f29682b.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(er.h).withEndAction(new dg(this, 9)).start();
            }
        }
        if (y7Var.f41915r2.size() > 1) {
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.Ij, f7Var, y7Var.J0);
            view.setVisibility(0);
            k7Var.setPadding(0, k7Var.getPaddingTop(), 0, org.telegram.messenger.g0.L(231.0f));
        } else {
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.Ij, f7Var, y7Var.J0);
            view.setVisibility(0);
            k7Var.setPadding(0, k7Var.getPaddingTop(), 0, 0);
        }
        y7Var.f41922v1.setVisibility((y7Var.f41914r1 && y7Var.f41920u1.b() == 0) ? 8 : 8);
        y7Var.Z0();
    }

    @Override
    public final void t(v4.e1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x7.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        Context context = this.f41608c;
        int i10 = 1;
        if (i7 == 1) {
            bn bnVar = new bn(context, 9);
            bnVar.setTag(-33024);
            return new v4.e1(bnVar);
        }
        if (MediaController.B().D0 == null) {
            i10 = 0;
        }
        return new v4.e1(new org.telegram.ui.Cells.w(i10, context, this.f41611n.J0));
    }
}
