package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class d8 extends dk0 {
    public final Context f34230c;
    public ArrayList d = new ArrayList();
    public String f34231e;
    public b8 f34232f;
    public boolean h;
    public final e8 f34233n;

    public d8(e8 e8Var, Context context) {
        this.f34233n = e8Var;
        this.f34230c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (this.f34233n.f34609p2 && f1Var.b() == 0) {
            return false;
        }
        return true;
    }

    public final void E(String str) {
        if (this.f34232f != null) {
            Utilities.f22879g.a(this.f34232f);
            this.f34232f = null;
        }
        if (str == null) {
            this.f34231e = null;
            this.d.clear();
            f();
            return;
        }
        org.telegram.messenger.q5 q5Var = Utilities.f22879g;
        b8 b8Var = new b8(this, str, 0);
        this.f34232f = b8Var;
        q5Var.d(b8Var, 300L);
    }

    @Override
    public final int b() {
        int size;
        e8 e8Var = this.f34233n;
        boolean z10 = e8Var.f34609p2;
        if (e8Var.f34610q1) {
            size = this.d.size();
        } else if (e8Var.f34613r2.size() > 1) {
            size = e8Var.f34613r2.size();
        } else {
            return 0;
        }
        return size + (z10 ? 1 : 0);
    }

    @Override
    public final int d(int i7) {
        if (this.f34233n.f34609p2 && i7 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void f() {
        boolean z10;
        boolean z11;
        super.f();
        e8 e8Var = this.f34233n;
        View view = e8Var.f34608p1;
        l7 l7Var = e8Var.f34626y1;
        q7 q7Var = e8Var.f34614s1;
        int i7 = 0;
        if (e8Var.f34613r2.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.h) {
            if (e8Var.f34613r2.size() > 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.h = z11;
            if (z11) {
                q7Var.setVisibility(0);
                q7Var.setTranslationY(org.telegram.messenger.g0.f24226q.y);
                q7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final d8 f33382b;

                    {
                        this.f33382b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                this.f33382b.f34233n.f30226b.invalidate();
                                return;
                            default:
                                this.f33382b.f34233n.f30226b.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(kr.h).start();
            } else {
                q7Var.animate().translationY(org.telegram.messenger.g0.f24226q.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final d8 f33382b;

                    {
                        this.f33382b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                this.f33382b.f34233n.f30226b.invalidate();
                                return;
                            default:
                                this.f33382b.f34233n.f30226b.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(kr.h).withEndAction(new ng(this, 9)).start();
            }
        }
        if (e8Var.f34613r2.size() > 1) {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.Ij, l7Var, e8Var.J0);
            view.setVisibility(0);
            q7Var.setPadding(0, q7Var.getPaddingTop(), 0, org.telegram.messenger.g0.L(231.0f));
        } else {
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.Ij, l7Var, e8Var.J0);
            view.setVisibility(0);
            q7Var.setPadding(0, q7Var.getPaddingTop(), 0, 0);
        }
        e8Var.f34620v1.setVisibility((e8Var.f34612r1 && e8Var.f34618u1.b() == 0) ? 8 : 8);
        e8Var.a1();
    }

    @Override
    public final void t(v4.f1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d8.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        Context context = this.f34230c;
        int i10 = 1;
        if (i7 == 1) {
            in inVar = new in(context, 9);
            inVar.setTag(-33024);
            return new v4.f1(inVar);
        }
        if (MediaController.B().D0 == null) {
            i10 = 0;
        }
        return new v4.f1(new org.telegram.ui.Cells.w(i10, context, this.f34233n.J0));
    }
}
