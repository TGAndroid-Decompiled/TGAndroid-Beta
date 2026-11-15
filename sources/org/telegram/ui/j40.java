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
public final class j40 extends qc {
    public jc A0;
    public float B0;
    public boolean C0;

    public j40(long j3) {
        super(j3);
        this.d = true;
    }

    public static void l1(j40 j40Var, int i7, org.telegram.messenger.e3 e3Var) {
        if (e3Var != null && j40Var.getParentActivity() != null) {
            i40 i40Var = new i40(j40Var, j40Var, j40Var.getParentActivity(), i7, j40Var.currentAccount, j40Var.resourceProvider);
            i40Var.A1(e3Var);
            i40Var.z1(j40Var.f50556c, true);
            i40Var.B1(j40Var.f50552a);
            i40Var.show();
            return;
        }
        j40Var.C0 = false;
    }

    public static org.telegram.ui.ActionBar.k n1(j40 j40Var) {
        return j40Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k o1(j40 j40Var) {
        return j40Var.actionBar;
    }

    @Override
    public final void C0() {
        B0();
        org.telegram.ui.Components.uj0 uj0Var = this.N;
        if (uj0Var != null) {
            uj0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f28792a7));
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout != null && (frameLayout.getBackground() instanceof org.telegram.ui.Components.fq)) {
            Drawable drawable = ((org.telegram.ui.Components.fq) this.P.getBackground()).f34669a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, this.resourceProvider));
                this.P.invalidate();
            }
        }
    }

    @Override
    public final void E0() {
        ct ctVar = new ct(this, getParentActivity(), this.resourceProvider, 4);
        this.N = ctVar;
        ctVar.setOnScrollListener(new g3(this, 13));
        this.N.setSections(true);
    }

    @Override
    public final int G0() {
        return getMessagesController().A5;
    }

    @Override
    public final int H0() {
        return 2131749441;
    }

    @Override
    public final int I0() {
        return 2131749443;
    }

    @Override
    public final int L0() {
        return 2131749439;
    }

    @Override
    public final int M0() {
        return getMessagesController().f25436x5;
    }

    @Override
    public final int N0() {
        return 2131749440;
    }

    @Override
    public final int O0() {
        return getMessagesController().f25446y5;
    }

    @Override
    public final int P0() {
        return 4;
    }

    @Override
    public final int Q0() {
        return getMessagesController().f25426w5;
    }

    @Override
    public final int R0() {
        return 2131749404;
    }

    @Override
    public final int S0() {
        return 2131749398;
    }

    @Override
    public final int T0() {
        return 2131749399;
    }

    @Override
    public final int U0() {
        return 2131749384;
    }

    @Override
    public final int V0() {
        return getMessagesController().f25455z5;
    }

    @Override
    public final int W0() {
        return 2131749385;
    }

    @Override
    public final boolean Y0() {
        return org.telegram.messenger.t3.c0(getMessagesController().M0(Long.valueOf(-this.f50552a)));
    }

    @Override
    public final void a1(int i7) {
        if (this.f50556c != null && !this.C0) {
            this.C0 = true;
            org.telegram.messenger.np.s1(this.currentAccount).G0().b(this.f50552a, this.f50556c, new ai.x1(this, i7, 6));
        }
    }

    @Override
    public final View createView(Context context) {
        View createView = super.createView(context);
        g1(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new h40(this, (FrameLayout) createView));
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        super.didReceivedNotification(i7, i10, objArr);
        if (i7 == org.telegram.messenger.ns.T && ((TLRPC.ChatFull) objArr[0]).f28052id == (-this.f50552a)) {
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
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f50556c;
            if (tL_premium_boostsStatus != null) {
                i7 = tL_premium_boostsStatus.boosts;
            } else {
                i7 = 0;
            }
            textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(i7, "BoostingGroupBoostCount", new Object[0])));
        }
    }

    @Override
    public final void g1(boolean z10) {
        super.g1(z10);
        this.actionBar.setBackgroundColor(0);
        org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(new ColorDrawable(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, this.resourceProvider)), org.telegram.ui.ActionBar.j6.Y0(getParentActivity(), 2131231230, org.telegram.ui.ActionBar.j6.f28813b7), 0, 0);
        fqVar.f34678x = true;
        this.P.setBackground(fqVar);
        this.N.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.j6.f28792a7));
        jc jcVar = this.A0;
        if (jcVar != null && !z10) {
            jcVar.f48299a.b(this.currentAccount, this.f50576s, false);
            this.A0.f48300b.b(this.f50576s, false);
            this.A0.updateColors();
        }
    }

    @Override
    public final void j1() {
        dc dcVar;
        dc dcVar2;
        this.f50553a0 = 0;
        boolean z10 = true;
        int i7 = 1 + 1;
        this.f50555b0 = 1;
        this.f50557c0 = i7;
        int i10 = i7 + 2;
        this.S = i10;
        this.f50558d0 = i7 + 1;
        if (this.f50583x == 0 && this.f50576s < 0) {
            int i11 = this.f50562f0;
            this.f50562f0 = -1;
            if (i11 >= 0 && (dcVar2 = this.O) != null) {
                dcVar2.s(i11);
                this.O.g(this.f50558d0);
            }
        } else {
            if (this.f50562f0 < 0) {
                z10 = false;
            }
            this.S = i7 + 3;
            this.f50562f0 = i10;
            if (!z10 && (dcVar = this.O) != null) {
                dcVar.i(i10);
                this.O.g(this.f50558d0);
                this.N.v0(0);
            }
        }
        int i12 = this.S;
        this.f50560e0 = i12;
        this.f50565i0 = i12 + 1;
        this.f50566j0 = i12 + 2;
        this.f50563g0 = i12 + 3;
        this.S = i12 + 5;
        this.f50564h0 = i12 + 4;
        TLRPC.ChatFull N0 = getMessagesController().N0(-this.f50552a);
        if (N0 != null && N0.can_set_stickers) {
            int i13 = this.S;
            this.f50567k0 = i13;
            this.S = i13 + 2;
            this.f50568l0 = i13 + 1;
        } else {
            this.f50567k0 = -1;
            this.f50568l0 = -1;
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
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.T);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.T);
    }
}
