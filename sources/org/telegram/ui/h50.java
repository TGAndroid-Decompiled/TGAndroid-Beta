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
public final class h50 extends zc {
    public float A0;
    public boolean B0;
    public sc f37704z0;

    public h50(long j10) {
        super(j10);
        this.d = true;
    }

    public static void l1(h50 h50Var, int i10, org.telegram.messenger.h3 h3Var) {
        if (h3Var != null && h50Var.getParentActivity() != null) {
            g50 g50Var = new g50(h50Var, h50Var, h50Var.getParentActivity(), i10, h50Var.currentAccount, h50Var.resourceProvider);
            g50Var.A1(h3Var);
            g50Var.z1(h50Var.f43893c, true);
            g50Var.B1(h50Var.f43889a);
            g50Var.show();
            return;
        }
        h50Var.B0 = false;
    }

    public static org.telegram.ui.ActionBar.l n1(h50 h50Var) {
        return h50Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l o1(h50 h50Var) {
        return h50Var.actionBar;
    }

    @Override
    public final void C0() {
        B0();
        org.telegram.ui.Components.uk0 uk0Var = this.M;
        if (uk0Var != null) {
            uk0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20873a7));
        }
        FrameLayout frameLayout = this.O;
        if (frameLayout != null && (frameLayout.getBackground() instanceof org.telegram.ui.Components.eq)) {
            Drawable drawable = ((org.telegram.ui.Components.eq) this.O.getBackground()).f25901a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, this.resourceProvider));
                this.O.invalidate();
            }
        }
    }

    @Override
    public final void E0() {
        ag.b1 b1Var = new ag.b1(this, getParentActivity(), this.resourceProvider, 29);
        this.M = b1Var;
        b1Var.setOnScrollListener(new h3(this, 13));
        this.M.setSections(true);
    }

    @Override
    public final int G0() {
        return getMessagesController().A5;
    }

    @Override
    public final int H0() {
        return 2131749450;
    }

    @Override
    public final int I0() {
        return 2131749452;
    }

    @Override
    public final int L0() {
        return 2131749448;
    }

    @Override
    public final int M0() {
        return getMessagesController().f19289x5;
    }

    @Override
    public final int N0() {
        return 2131749449;
    }

    @Override
    public final int O0() {
        return getMessagesController().f19298y5;
    }

    @Override
    public final int P0() {
        return 4;
    }

    @Override
    public final int Q0() {
        return getMessagesController().f19279w5;
    }

    @Override
    public final int R0() {
        return 2131749413;
    }

    @Override
    public final int S0() {
        return 2131749407;
    }

    @Override
    public final int T0() {
        return 2131749408;
    }

    @Override
    public final int U0() {
        return 2131749393;
    }

    @Override
    public final int V0() {
        return getMessagesController().f19307z5;
    }

    @Override
    public final int W0() {
        return 2131749394;
    }

    @Override
    public final boolean Y0() {
        return org.telegram.messenger.w3.c0(getMessagesController().L0(Long.valueOf(-this.f43889a)));
    }

    @Override
    public final void a1(int i10) {
        if (this.f43893c != null && !this.B0) {
            this.B0 = true;
            org.telegram.messenger.wp.r1(this.currentAccount).G0().b(this.f43889a, this.f43893c, new ag.s2(this, i10, 3));
        }
    }

    @Override
    public final View createView(Context context) {
        View createView = super.createView(context);
        g1(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new f50(this, (FrameLayout) createView));
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        super.didReceivedNotification(i10, i11, objArr);
        if (i10 == org.telegram.messenger.at.T && ((TLRPC.ChatFull) objArr[0]).f19795id == (-this.f43889a)) {
            i1();
        }
    }

    @Override
    public final void e1(boolean z10) {
        int i10;
        super.e1(z10);
        sc scVar = this.f37704z0;
        if (scVar != null) {
            TextView textView = scVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f43893c;
            if (tL_premium_boostsStatus != null) {
                i10 = tL_premium_boostsStatus.boosts;
            } else {
                i10 = 0;
            }
            textView.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.G(i10, "BoostingGroupBoostCount", new Object[0])));
        }
    }

    @Override
    public final void g1(boolean z10) {
        super.g1(z10);
        this.actionBar.setBackgroundColor(0);
        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(new ColorDrawable(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d6, this.resourceProvider)), org.telegram.ui.ActionBar.t6.Y0(getParentActivity(), 2131231231, org.telegram.ui.ActionBar.t6.f20893b7), 0, 0);
        eqVar.f25909x = true;
        this.O.setBackground(eqVar);
        this.M.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20873a7));
        sc scVar = this.f37704z0;
        if (scVar != null && !z10) {
            scVar.f41337a.b(this.currentAccount, this.f43912s, false);
            this.f37704z0.f41338b.b(this.f43912s, false);
            this.f37704z0.updateColors();
        }
    }

    @Override
    public final void j1() {
        lc lcVar;
        lc lcVar2;
        this.Z = 0;
        boolean z10 = true;
        int i10 = 1 + 1;
        this.f43890a0 = 1;
        this.f43892b0 = i10;
        int i11 = i10 + 2;
        this.R = i11;
        this.f43894c0 = i10 + 1;
        if (this.f43919x == 0 && this.f43912s < 0) {
            int i12 = this.f43896e0;
            this.f43896e0 = -1;
            if (i12 >= 0 && (lcVar2 = this.N) != null) {
                lcVar2.s(i12);
                this.N.g(this.f43894c0);
            }
        } else {
            if (this.f43896e0 < 0) {
                z10 = false;
            }
            this.R = i10 + 3;
            this.f43896e0 = i11;
            if (!z10 && (lcVar = this.N) != null) {
                lcVar.i(i11);
                this.N.g(this.f43894c0);
                this.M.v0(0);
            }
        }
        int i13 = this.R;
        this.f43895d0 = i13;
        this.f43900h0 = i13 + 1;
        this.f43901i0 = i13 + 2;
        this.f43898f0 = i13 + 3;
        this.R = i13 + 5;
        this.f43899g0 = i13 + 4;
        TLRPC.ChatFull M0 = getMessagesController().M0(-this.f43889a);
        if (M0 != null && M0.can_set_stickers) {
            int i14 = this.R;
            this.f43902j0 = i14;
            this.R = i14 + 2;
            this.f43903k0 = i14 + 1;
        } else {
            this.f43902j0 = -1;
            this.f43903k0 = -1;
        }
        int i15 = this.R;
        this.S = i15;
        this.W = i15 + 1;
        this.X = i15 + 2;
        this.R = i15 + 4;
        this.Y = i15 + 3;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        sc scVar = this.f37704z0;
        if (scVar != null) {
            scVar.a();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.T);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.T);
    }
}
