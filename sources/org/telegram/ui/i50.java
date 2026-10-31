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
public final class i50 extends zc {
    public float A0;
    public boolean B0;
    public sc f38178z0;

    public i50(long j10) {
        super(j10);
        this.d = true;
    }

    public static void k1(i50 i50Var, int i10, org.telegram.messenger.h3 h3Var) {
        if (h3Var != null && i50Var.getParentActivity() != null) {
            h50 h50Var = new h50(i50Var, i50Var, i50Var.getParentActivity(), i10, i50Var.currentAccount, i50Var.resourceProvider);
            h50Var.A1(h3Var);
            h50Var.z1(i50Var.f44090c, true);
            h50Var.B1(i50Var.f44086a);
            h50Var.show();
            return;
        }
        i50Var.B0 = false;
    }

    public static org.telegram.ui.ActionBar.l m1(i50 i50Var) {
        return i50Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l n1(i50 i50Var) {
        return i50Var.actionBar;
    }

    @Override
    public final void B0() {
        A0();
        org.telegram.ui.Components.tk0 tk0Var = this.M;
        if (tk0Var != null) {
            tk0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20872a7));
        }
        FrameLayout frameLayout = this.O;
        if (frameLayout != null && (frameLayout.getBackground() instanceof org.telegram.ui.Components.eq)) {
            Drawable drawable = ((org.telegram.ui.Components.eq) this.O.getBackground()).f25839a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, this.resourceProvider));
                this.O.invalidate();
            }
        }
    }

    @Override
    public final void D0() {
        ag.b1 b1Var = new ag.b1(this, getParentActivity(), this.resourceProvider, 29);
        this.M = b1Var;
        b1Var.setOnScrollListener(new h3(this, 13));
        this.M.setSections(true);
    }

    @Override
    public final int F0() {
        return getMessagesController().A5;
    }

    @Override
    public final int G0() {
        return 2131749450;
    }

    @Override
    public final int H0() {
        return 2131749452;
    }

    @Override
    public final int K0() {
        return 2131749448;
    }

    @Override
    public final int L0() {
        return getMessagesController().f18946x5;
    }

    @Override
    public final int M0() {
        return 2131749449;
    }

    @Override
    public final int N0() {
        return getMessagesController().f18955y5;
    }

    @Override
    public final int O0() {
        return 4;
    }

    @Override
    public final int P0() {
        return getMessagesController().f18936w5;
    }

    @Override
    public final int Q0() {
        return 2131749413;
    }

    @Override
    public final int R0() {
        return 2131749407;
    }

    @Override
    public final int S0() {
        return 2131749408;
    }

    @Override
    public final int T0() {
        return 2131749393;
    }

    @Override
    public final int U0() {
        return getMessagesController().f18964z5;
    }

    @Override
    public final int V0() {
        return 2131749394;
    }

    @Override
    public final boolean X0() {
        return org.telegram.messenger.w3.c0(getMessagesController().L0(Long.valueOf(-this.f44086a)));
    }

    @Override
    public final void Z0(int i10) {
        if (this.f44090c != null && !this.B0) {
            this.B0 = true;
            org.telegram.messenger.vp.r1(this.currentAccount).G0().b(this.f44086a, this.f44090c, new ag.s2(this, i10, 3));
        }
    }

    @Override
    public final View createView(Context context) {
        View createView = super.createView(context);
        f1(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new g50(this, (FrameLayout) createView));
        return createView;
    }

    @Override
    public final void d1(boolean z10) {
        int i10;
        super.d1(z10);
        sc scVar = this.f38178z0;
        if (scVar != null) {
            TextView textView = scVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f44090c;
            if (tL_premium_boostsStatus != null) {
                i10 = tL_premium_boostsStatus.boosts;
            } else {
                i10 = 0;
            }
            textView.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(i10, "BoostingGroupBoostCount", new Object[0])));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        super.didReceivedNotification(i10, i11, objArr);
        if (i10 == org.telegram.messenger.zs.T && ((TLRPC.ChatFull) objArr[0]).f19794id == (-this.f44086a)) {
            h1();
        }
    }

    @Override
    public final void f1(boolean z10) {
        super.f1(z10);
        this.actionBar.setBackgroundColor(0);
        org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(new ColorDrawable(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20929d6, this.resourceProvider)), org.telegram.ui.ActionBar.t6.Y0(getParentActivity(), 2131231231, org.telegram.ui.ActionBar.t6.f20892b7), 0, 0);
        eqVar.f25847x = true;
        this.O.setBackground(eqVar);
        this.M.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.t6.f20872a7));
        sc scVar = this.f38178z0;
        if (scVar != null && !z10) {
            scVar.f41466a.b(this.currentAccount, this.f44109s, false);
            this.f38178z0.f41467b.b(this.f44109s, false);
            this.f38178z0.updateColors();
        }
    }

    @Override
    public final void i1() {
        lc lcVar;
        lc lcVar2;
        this.Z = 0;
        boolean z10 = true;
        int i10 = 1 + 1;
        this.f44087a0 = 1;
        this.f44089b0 = i10;
        int i11 = i10 + 2;
        this.R = i11;
        this.f44091c0 = i10 + 1;
        if (this.f44116x == 0 && this.f44109s < 0) {
            int i12 = this.f44093e0;
            this.f44093e0 = -1;
            if (i12 >= 0 && (lcVar2 = this.N) != null) {
                lcVar2.s(i12);
                this.N.g(this.f44091c0);
            }
        } else {
            if (this.f44093e0 < 0) {
                z10 = false;
            }
            this.R = i10 + 3;
            this.f44093e0 = i11;
            if (!z10 && (lcVar = this.N) != null) {
                lcVar.i(i11);
                this.N.g(this.f44091c0);
                this.M.v0(0);
            }
        }
        int i13 = this.R;
        this.f44092d0 = i13;
        this.f44097h0 = i13 + 1;
        this.f44098i0 = i13 + 2;
        this.f44095f0 = i13 + 3;
        this.R = i13 + 5;
        this.f44096g0 = i13 + 4;
        TLRPC.ChatFull M0 = getMessagesController().M0(-this.f44086a);
        if (M0 != null && M0.can_set_stickers) {
            int i14 = this.R;
            this.f44099j0 = i14;
            this.R = i14 + 2;
            this.f44100k0 = i14 + 1;
        } else {
            this.f44099j0 = -1;
            this.f44100k0 = -1;
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
        sc scVar = this.f38178z0;
        if (scVar != null) {
            scVar.a();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.T);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.T);
    }
}
