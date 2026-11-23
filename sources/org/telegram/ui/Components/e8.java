package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class e8 extends dk0 {
    public final Context f34695c;
    public ArrayList d = new ArrayList();
    public String f34696e;
    public c8 f34697f;
    public boolean h;
    public final f8 f34698n;

    public e8(f8 f8Var, Context context) {
        this.f34698n = f8Var;
        this.f34695c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (this.f34698n.f35128p2 && f1Var.b() == 0) {
            return false;
        }
        return true;
    }

    public final void E(String str) {
        if (this.f34697f != null) {
            Utilities.f22812g.a(this.f34697f);
            this.f34697f = null;
        }
        if (str == null) {
            this.f34696e = null;
            this.d.clear();
            f();
            return;
        }
        org.telegram.messenger.q5 q5Var = Utilities.f22812g;
        c8 c8Var = new c8(this, str, 0);
        this.f34697f = c8Var;
        q5Var.d(c8Var, 300L);
    }

    @Override
    public final int b() {
        int size;
        f8 f8Var = this.f34698n;
        boolean z10 = f8Var.f35128p2;
        if (f8Var.f35129q1) {
            size = this.d.size();
        } else if (f8Var.f35132r2.size() > 1) {
            size = f8Var.f35132r2.size();
        } else {
            return 0;
        }
        return size + (z10 ? 1 : 0);
    }

    @Override
    public final int d(int i7) {
        if (this.f34698n.f35128p2 && i7 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void f() {
        boolean z10;
        boolean z11;
        super.f();
        f8 f8Var = this.f34698n;
        View view = f8Var.f35127p1;
        m7 m7Var = f8Var.f35145y1;
        r7 r7Var = f8Var.f35133s1;
        int i7 = 0;
        if (f8Var.f35132r2.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            if (f8Var.f35132r2.size() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.h = z11;
            if (z11) {
                r7Var.setVisibility(0);
                r7Var.setTranslationY(org.telegram.messenger.g0.f24046q.y);
                r7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final e8 f33786b;

                    {
                        this.f33786b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                this.f33786b.f34698n.f30176b.invalidate();
                                return;
                            default:
                                this.f33786b.f34698n.f30176b.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(nr.h).start();
            } else {
                r7Var.animate().translationY(org.telegram.messenger.g0.f24046q.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final e8 f33786b;

                    {
                        this.f33786b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                this.f33786b.f34698n.f30176b.invalidate();
                                return;
                            default:
                                this.f33786b.f34698n.f30176b.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(nr.h).withEndAction(new og(this, 9)).start();
            }
        }
        if (f8Var.f35132r2.size() > 1) {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.Ij, m7Var, f8Var.J0);
            view.setVisibility(0);
            r7Var.setPadding(0, r7Var.getPaddingTop(), 0, org.telegram.messenger.g0.L(231.0f));
        } else {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.Ij, m7Var, f8Var.J0);
            view.setVisibility(0);
            r7Var.setPadding(0, r7Var.getPaddingTop(), 0, 0);
        }
        f8Var.f35139v1.setVisibility((f8Var.f35131r1 && f8Var.f35137u1.b() == 0) ? 8 : 8);
        f8Var.a1();
    }

    @Override
    public final void t(v4.f1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e8.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        Context context = this.f34695c;
        int i10 = 1;
        if (i7 == 1) {
            ln lnVar = new ln(context, 9);
            lnVar.setTag(-33024);
            return new v4.f1(lnVar);
        }
        if (MediaController.B().D0 == null) {
            i10 = 0;
        }
        return new v4.f1(new org.telegram.ui.Cells.w(i10, context, this.f34698n.J0));
    }
}
