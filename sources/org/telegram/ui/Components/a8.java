package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class a8 extends oj0 {
    public final Context f31727c;
    public ArrayList d = new ArrayList();
    public String f31728e;
    public y7 f31729f;
    public boolean h;
    public final b8 f31730n;

    public a8(b8 b8Var, Context context) {
        this.f31730n = b8Var;
        this.f31727c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (this.f31730n.f32096l2 && d1Var.b() == 0) {
            return false;
        }
        return true;
    }

    public final void E(String str) {
        if (this.f31729f != null) {
            Utilities.f21338g.a(this.f31729f);
            this.f31729f = null;
        }
        if (str == null) {
            this.f31728e = null;
            this.d.clear();
            f();
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.f21338g;
        y7 y7Var = new y7(this, str, 0);
        this.f31729f = y7Var;
        p5Var.d(y7Var, 300L);
    }

    @Override
    public final int b() {
        int size;
        b8 b8Var = this.f31730n;
        boolean z9 = b8Var.f32096l2;
        if (b8Var.f32097m1) {
            size = this.d.size();
        } else if (b8Var.f32099n2.size() > 1) {
            size = b8Var.f32099n2.size();
        } else {
            return 0;
        }
        return size + (z9 ? 1 : 0);
    }

    @Override
    public final int d(int i7) {
        if (this.f31730n.f32096l2 && i7 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void f() {
        boolean z9;
        boolean z10;
        super.f();
        b8 b8Var = this.f31730n;
        View view = b8Var.l1;
        i7 i7Var = b8Var.f32112u1;
        n7 n7Var = b8Var.f32100o1;
        int i7 = 0;
        if (b8Var.f32099n2.size() > 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 != this.h) {
            if (b8Var.f32099n2.size() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.h = z10;
            if (z10) {
                n7Var.setVisibility(0);
                n7Var.setTranslationY(org.telegram.messenger.g0.f22563q.y);
                n7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final a8 f40238b;

                    {
                        this.f40238b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                this.f40238b.f31730n.f28619b.invalidate();
                                return;
                            default:
                                this.f40238b.f31730n.f28619b.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(xq.h).start();
            } else {
                n7Var.animate().translationY(org.telegram.messenger.g0.f22563q.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final a8 f40238b;

                    {
                        this.f40238b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                this.f40238b.f31730n.f28619b.invalidate();
                                return;
                            default:
                                this.f40238b.f31730n.f28619b.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(xq.h).withEndAction(new xf(this, 9)).start();
            }
        }
        if (b8Var.f32099n2.size() > 1) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.Fj, i7Var, b8Var.I0);
            view.setVisibility(0);
            n7Var.setPadding(0, n7Var.getPaddingTop(), 0, org.telegram.messenger.g0.L(231.0f));
        } else {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.Fj, i7Var, b8Var.I0);
            view.setVisibility(0);
            n7Var.setPadding(0, n7Var.getPaddingTop(), 0, 0);
        }
        b8Var.f32106r1.setVisibility((b8Var.n1 && b8Var.f32104q1.b() == 0) ? 8 : 8);
        b8Var.Z0();
    }

    @Override
    public final void t(v4.d1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a8.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        Context context = this.f31727c;
        int i10 = 1;
        if (i7 == 1) {
            tm tmVar = new tm(context, 9);
            tmVar.setTag(-33024);
            return new v4.d1(tmVar);
        }
        if (MediaController.B().C0 == null) {
            i10 = 0;
        }
        return new v4.d1(new org.telegram.ui.Cells.w(i10, context, this.f31730n.I0));
    }
}
