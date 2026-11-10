package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
public final class z7 extends oj0 {
    public final Context f40889c;
    public ArrayList d = new ArrayList();
    public String f40890e;
    public x7 f40891f;
    public boolean h;
    public final a8 f40892n;

    public z7(a8 a8Var, Context context) {
        this.f40892n = a8Var;
        this.f40889c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (this.f40892n.f31749o2 && d1Var.b() == 0) {
            return false;
        }
        return true;
    }

    public final void E(String str) {
        if (this.f40891f != null) {
            Utilities.f21343g.a(this.f40891f);
            this.f40891f = null;
        }
        if (str == null) {
            this.f40890e = null;
            this.d.clear();
            f();
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.f21343g;
        x7 x7Var = new x7(this, str, 0);
        this.f40891f = x7Var;
        p5Var.d(x7Var, 300L);
    }

    @Override
    public final int b() {
        int size;
        a8 a8Var = this.f40892n;
        boolean z9 = a8Var.f31749o2;
        if (a8Var.f31750p1) {
            size = this.d.size();
        } else if (a8Var.f31753q2.size() > 1) {
            size = a8Var.f31753q2.size();
        } else {
            return 0;
        }
        return size + (z9 ? 1 : 0);
    }

    @Override
    public final int d(int i7) {
        if (this.f40892n.f31749o2 && i7 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void f() {
        boolean z9;
        boolean z10;
        super.f();
        a8 a8Var = this.f40892n;
        View view = a8Var.f31748o1;
        h7 h7Var = a8Var.f31766x1;
        m7 m7Var = a8Var.f31754r1;
        int i7 = 0;
        if (a8Var.f31753q2.size() > 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 != this.h) {
            if (a8Var.f31753q2.size() > 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.h = z10;
            if (z10) {
                m7Var.setVisibility(0);
                m7Var.setTranslationY(org.telegram.messenger.g0.f22567q.y);
                m7Var.animate().translationY(0.0f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final z7 f39909b;

                    {
                        this.f39909b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                this.f39909b.f40892n.f28672b.invalidate();
                                return;
                            default:
                                this.f39909b.f40892n.f28672b.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(wq.h).start();
            } else {
                m7Var.animate().translationY(org.telegram.messenger.g0.f22567q.y).setUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final z7 f39909b;

                    {
                        this.f39909b = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (r2) {
                            case 0:
                                this.f39909b.f40892n.f28672b.invalidate();
                                return;
                            default:
                                this.f39909b.f40892n.f28672b.invalidate();
                                return;
                        }
                    }
                }).setDuration(420L).setInterpolator(wq.h).withEndAction(new wf(this, 9)).start();
            }
        }
        if (a8Var.f31753q2.size() > 1) {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.Fj, h7Var, a8Var.I0);
            view.setVisibility(0);
            m7Var.setPadding(0, m7Var.getPaddingTop(), 0, org.telegram.messenger.g0.L(231.0f));
        } else {
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.Fj, h7Var, a8Var.I0);
            view.setVisibility(0);
            m7Var.setPadding(0, m7Var.getPaddingTop(), 0, 0);
        }
        a8Var.f31760u1.setVisibility((a8Var.f31752q1 && a8Var.f31758t1.b() == 0) ? 8 : 8);
        a8Var.Z0();
    }

    @Override
    public final void t(v4.d1 r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z7.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        Context context = this.f40889c;
        int i10 = 1;
        if (i7 == 1) {
            sm smVar = new sm(context, 9);
            smVar.setTag(-33024);
            return new v4.d1(smVar);
        }
        if (MediaController.B().C0 == null) {
            i10 = 0;
        }
        return new v4.d1(new org.telegram.ui.Cells.w(i10, context, this.f40892n.I0));
    }
}
