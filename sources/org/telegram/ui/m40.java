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
public final class m40 extends qc {
    public jc A0;
    public float B0;
    public boolean C0;

    public m40(long j3) {
        super(j3);
        this.d = true;
    }

    public static void l1(m40 m40Var, int i7, org.telegram.messenger.g3 g3Var) {
        if (g3Var != null && m40Var.getParentActivity() != null) {
            l40 l40Var = new l40(m40Var, m40Var, m40Var.getParentActivity(), i7, m40Var.currentAccount, m40Var.resourceProvider);
            l40Var.B1(g3Var);
            l40Var.A1(m40Var.f51144c, true);
            l40Var.C1(m40Var.f51140a);
            l40Var.show();
            return;
        }
        m40Var.C0 = false;
    }

    public static org.telegram.ui.ActionBar.k n1(m40 m40Var) {
        return m40Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k o1(m40 m40Var) {
        return m40Var.actionBar;
    }

    @Override
    public final void C0() {
        B0();
        org.telegram.ui.Components.ek0 ek0Var = this.N;
        if (ek0Var != null) {
            ek0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.m6.f29290a7));
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout != null && (frameLayout.getBackground() instanceof org.telegram.ui.Components.oq)) {
            Drawable drawable = ((org.telegram.ui.Components.oq) this.P.getBackground()).f38300a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29347d6, this.resourceProvider));
                this.P.invalidate();
            }
        }
    }

    @Override
    public final void E0() {
        et etVar = new et(this, getParentActivity(), this.resourceProvider, 4);
        this.N = etVar;
        etVar.setOnScrollListener(new g3(this, 13));
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
        return getMessagesController().f25987z5;
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
        return getMessagesController().f25978y5;
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
        return org.telegram.messenger.v3.c0(getMessagesController().O0(Long.valueOf(-this.f51140a)));
    }

    @Override
    public final void a1(int i7) {
        if (this.f51144c != null && !this.C0) {
            this.C0 = true;
            org.telegram.messenger.np.u1(this.currentAccount).I0().b(this.f51140a, this.f51144c, new hi.r3(this, i7, 6));
        }
    }

    @Override
    public final View createView(Context context) {
        View createView = super.createView(context);
        g1(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new k40(this, (FrameLayout) createView));
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        super.didReceivedNotification(i7, i10, objArr);
        if (i7 == org.telegram.messenger.ls.T && ((TLRPC.ChatFull) objArr[0]).f28399id == (-this.f51140a)) {
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
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f51144c;
            if (tL_premium_boostsStatus != null) {
                i7 = tL_premium_boostsStatus.boosts;
            } else {
                i7 = 0;
            }
            textView.setText(org.telegram.messenger.g0.W2(org.telegram.messenger.hd.G(i7, "BoostingGroupBoostCount", new Object[0])));
        }
    }

    @Override
    public final void g1(boolean z10) {
        super.g1(z10);
        this.actionBar.setBackgroundColor(0);
        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(new ColorDrawable(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29347d6, this.resourceProvider)), org.telegram.ui.ActionBar.m6.Y0(getParentActivity(), 2131231230, org.telegram.ui.ActionBar.m6.f29311b7), 0, 0);
        oqVar.f38309x = true;
        this.P.setBackground(oqVar);
        this.N.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.m6.f29290a7));
        jc jcVar = this.A0;
        if (jcVar != null && !z10) {
            jcVar.f48962a.b(this.currentAccount, this.f51164s, false);
            this.A0.f48963b.b(this.f51164s, false);
            this.A0.updateColors();
        }
    }

    @Override
    public final void j1() {
        dc dcVar;
        dc dcVar2;
        this.f51141a0 = 0;
        boolean z10 = true;
        int i7 = 1 + 1;
        this.f51143b0 = 1;
        this.f51145c0 = i7;
        int i10 = i7 + 2;
        this.S = i10;
        this.f51146d0 = i7 + 1;
        if (this.f51171x == 0 && this.f51164s < 0) {
            int i11 = this.f51150f0;
            this.f51150f0 = -1;
            if (i11 >= 0 && (dcVar2 = this.O) != null) {
                dcVar2.s(i11);
                this.O.g(this.f51146d0);
            }
        } else {
            if (this.f51150f0 < 0) {
                z10 = false;
            }
            this.S = i7 + 3;
            this.f51150f0 = i10;
            if (!z10 && (dcVar = this.O) != null) {
                dcVar.i(i10);
                this.O.g(this.f51146d0);
                this.N.v0(0);
            }
        }
        int i12 = this.S;
        this.f51148e0 = i12;
        this.f51153i0 = i12 + 1;
        this.f51154j0 = i12 + 2;
        this.f51151g0 = i12 + 3;
        this.S = i12 + 5;
        this.f51152h0 = i12 + 4;
        TLRPC.ChatFull P0 = getMessagesController().P0(-this.f51140a);
        if (P0 != null && P0.can_set_stickers) {
            int i13 = this.S;
            this.f51155k0 = i13;
            this.S = i13 + 2;
            this.f51156l0 = i13 + 1;
        } else {
            this.f51155k0 = -1;
            this.f51156l0 = -1;
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
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.T);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.T);
    }
}
