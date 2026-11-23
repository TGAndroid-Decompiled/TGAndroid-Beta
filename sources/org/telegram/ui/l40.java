package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class l40 extends qc {
    public jc A0;
    public float B0;
    public boolean C0;

    public l40(long j3) {
        super(j3);
        this.d = true;
    }

    public static void l1(l40 l40Var, int i7, org.telegram.messenger.g3 g3Var) {
        if (g3Var != null && l40Var.getParentActivity() != null) {
            k40 k40Var = new k40(l40Var, l40Var, l40Var.getParentActivity(), i7, l40Var.currentAccount, l40Var.resourceProvider);
            k40Var.B1(g3Var);
            k40Var.A1(l40Var.f51405c, true);
            k40Var.C1(l40Var.f51401a);
            k40Var.show();
            return;
        }
        l40Var.C0 = false;
    }

    public static org.telegram.ui.ActionBar.k n1(l40 l40Var) {
        return l40Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k o1(l40 l40Var) {
        return l40Var.actionBar;
    }

    @Override
    public final void C0() {
        B0();
        org.telegram.ui.Components.ek0 ek0Var = this.N;
        if (ek0Var != null) {
            ek0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29394a7));
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout != null && (frameLayout.getBackground() instanceof org.telegram.ui.Components.lq)) {
            Drawable drawable = ((org.telegram.ui.Components.lq) this.P.getBackground()).f37195a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, this.resourceProvider));
                this.P.invalidate();
            }
        }
    }

    @Override
    public final void E0() {
        dt dtVar = new dt(this, getParentActivity(), this.resourceProvider, 4);
        this.N = dtVar;
        dtVar.setOnScrollListener(new g3(this, 13));
        this.N.setSections(true);
    }

    @Override
    public final int G0() {
        return getMessagesController().C5;
    }

    @Override
    public final int H0() {
        return 2131749248;
    }

    @Override
    public final int I0() {
        return 2131749250;
    }

    @Override
    public final int L0() {
        return 2131749246;
    }

    @Override
    public final int M0() {
        return getMessagesController().f25919z5;
    }

    @Override
    public final int N0() {
        return 2131749247;
    }

    @Override
    public final int O0() {
        return getMessagesController().A5;
    }

    @Override
    public final int P0() {
        return 4;
    }

    @Override
    public final int Q0() {
        return getMessagesController().f25910y5;
    }

    @Override
    public final int R0() {
        return 2131749211;
    }

    @Override
    public final int S0() {
        return 2131749205;
    }

    @Override
    public final int T0() {
        return 2131749206;
    }

    @Override
    public final int U0() {
        return 2131749191;
    }

    @Override
    public final int V0() {
        return getMessagesController().B5;
    }

    @Override
    public final int W0() {
        return 2131749192;
    }

    @Override
    public final boolean Y0() {
        return org.telegram.messenger.v3.c0(getMessagesController().O0(Long.valueOf(-this.f51401a)));
    }

    @Override
    public final void a1(int i7) {
        if (this.f51405c != null && !this.C0) {
            this.C0 = true;
            org.telegram.messenger.mp.u1(this.currentAccount).I0().b(this.f51401a, this.f51405c, new hi.a4(this, i7, 6));
        }
    }

    @Override
    public final View createView(Context context) {
        View createView = super.createView(context);
        g1(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new j40(this, (FrameLayout) createView));
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        super.didReceivedNotification(i7, i10, objArr);
        if (i7 == org.telegram.messenger.ks.T && ((TLRPC.ChatFull) objArr[0]).f28493id == (-this.f51401a)) {
            i1();
        }
    }

    @Override
    public final void e1(boolean z10) {
        int i7;
        super.e1(z10);
        jc jcVar = this.A0;
        if (jcVar != null) {
            TextView textView = jcVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f51405c;
            if (tL_premium_boostsStatus != null) {
                i7 = tL_premium_boostsStatus.boosts;
            } else {
                i7 = 0;
            }
            textView.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(i7, "BoostingGroupBoostCount", new Object[0])));
        }
    }

    @Override
    public final void g1(boolean z10) {
        super.g1(z10);
        this.actionBar.setBackgroundColor(0);
        org.telegram.ui.Components.lq lqVar = new org.telegram.ui.Components.lq(new ColorDrawable(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, this.resourceProvider)), org.telegram.ui.ActionBar.n6.Y0(getParentActivity(), 2131231233, org.telegram.ui.ActionBar.n6.f29415b7), 0, 0);
        lqVar.f37204x = true;
        this.P.setBackground(lqVar);
        this.N.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.n6.f29394a7));
        jc jcVar = this.A0;
        if (jcVar != null && !z10) {
            jcVar.f49085a.b(this.currentAccount, this.f51425s, false);
            this.A0.f49086b.b(this.f51425s, false);
            this.A0.updateColors();
        }
    }

    @Override
    public final void j1() {
        dc dcVar;
        dc dcVar2;
        this.f51402a0 = 0;
        boolean z10 = true;
        int i7 = 1 + 1;
        this.f51404b0 = 1;
        this.f51406c0 = i7;
        int i10 = i7 + 2;
        this.S = i10;
        this.f51407d0 = i7 + 1;
        if (this.f51432x == 0 && this.f51425s < 0) {
            int i11 = this.f51411f0;
            this.f51411f0 = -1;
            if (i11 >= 0 && (dcVar2 = this.O) != null) {
                dcVar2.s(i11);
                this.O.g(this.f51407d0);
            }
        } else {
            if (this.f51411f0 < 0) {
                z10 = false;
            }
            this.S = i7 + 3;
            this.f51411f0 = i10;
            if (!z10 && (dcVar = this.O) != null) {
                dcVar.i(i10);
                this.O.g(this.f51407d0);
                this.N.v0(0);
            }
        }
        int i12 = this.S;
        this.f51409e0 = i12;
        this.f51414i0 = i12 + 1;
        this.f51415j0 = i12 + 2;
        this.f51412g0 = i12 + 3;
        this.S = i12 + 5;
        this.f51413h0 = i12 + 4;
        TLRPC.ChatFull P0 = getMessagesController().P0(-this.f51401a);
        if (P0 != null && P0.can_set_stickers) {
            int i13 = this.S;
            this.f51416k0 = i13;
            this.S = i13 + 2;
            this.f51417l0 = i13 + 1;
        } else {
            this.f51416k0 = -1;
            this.f51417l0 = -1;
        }
        int i14 = this.S;
        this.T = i14;
        this.X = i14 + 1;
        this.Y = i14 + 2;
        this.S = i14 + 4;
        this.Z = i14 + 3;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        jc jcVar = this.A0;
        if (jcVar != null) {
            jcVar.a();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.T);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.T);
    }
}
