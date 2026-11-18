package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class f8 extends bk0 {
    public final Context f35019c;
    public ArrayList d = new ArrayList();
    public String f35020e;
    public d8 f35021f;
    public boolean h;
    public final g8 f35022n;

    public f8(g8 g8Var, Context context) {
        this.f35022n = g8Var;
        this.f35019c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (this.f35022n.f35403p2 && f1Var.b() == 0) {
            return false;
        }
        return true;
    }

    public final void E(String str) {
        if (this.f35021f != null) {
            Utilities.f22784g.a(this.f35021f);
            this.f35021f = null;
        }
        if (str == null) {
            this.f35020e = null;
            this.d.clear();
            f();
            return;
        }
        org.telegram.messenger.q5 q5Var = Utilities.f22784g;
        d8 d8Var = new d8(this, str, 0);
        this.f35021f = d8Var;
        q5Var.d(d8Var, 300L);
    }

    @Override
    public final int b() {
        int size;
        g8 g8Var = this.f35022n;
        boolean z10 = g8Var.f35403p2;
        if (g8Var.f35404q1) {
            size = this.d.size();
        } else if (g8Var.f35407r2.size() > 1) {
            size = g8Var.f35407r2.size();
        } else {
            return 0;
        }
        return size + (z10 ? 1 : 0);
    }

    @Override
    public final int d(int i7) {
        if (this.f35022n.f35403p2 && i7 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void f() {
        boolean z10;
        boolean z11;
        super.f();
        g8 g8Var = this.f35022n;
        View view = g8Var.f35402p1;
        m7 m7Var = g8Var.f35420y1;
        r7 r7Var = g8Var.f35408s1;
        int i7 = 0;
        if (g8Var.f35407r2.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            if (g8Var.f35407r2.size() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.h = z11;
            if (z11) {
                r7Var.setVisibility(0);
                r7Var.setTranslationY(org.telegram.messenger.g0.f24121q.y);
                r7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final f8 f33912b;

                    {
                        this.f33912b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                this.f33912b.f35022n.f30192b.invalidate();
                                return;
                            default:
                                this.f33912b.f35022n.f30192b.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(lr.h).start();
            } else {
                r7Var.animate().translationY(org.telegram.messenger.g0.f24121q.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final f8 f33912b;

                    {
                        this.f33912b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                this.f33912b.f35022n.f30192b.invalidate();
                                return;
                            default:
                                this.f33912b.f35022n.f30192b.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(lr.h).withEndAction(new lg(this, 9)).start();
            }
        }
        if (g8Var.f35407r2.size() > 1) {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.Ij, m7Var, g8Var.J0);
            view.setVisibility(0);
            r7Var.setPadding(0, r7Var.getPaddingTop(), 0, org.telegram.messenger.g0.L(231.0f));
        } else {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.Ij, m7Var, g8Var.J0);
            view.setVisibility(0);
            r7Var.setPadding(0, r7Var.getPaddingTop(), 0, 0);
        }
        g8Var.f35414v1.setVisibility((g8Var.f35406r1 && g8Var.f35412u1.b() == 0) ? 8 : 8);
        g8Var.a1();
    }

    @Override
    public final void t(v4.f1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.f8.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        Context context = this.f35019c;
        int i10 = 1;
        if (i7 == 1) {
            jn jnVar = new jn(context, 9);
            jnVar.setTag(-33024);
            return new v4.f1(jnVar);
        }
        if (MediaController.B().D0 == null) {
            i10 = 0;
        }
        return new v4.f1(new org.telegram.ui.Cells.w(i10, context, this.f35022n.J0));
    }
}
