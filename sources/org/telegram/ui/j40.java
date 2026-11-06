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
public final class j40 extends rc {
    public float A0;
    public boolean B0;
    public kc f46835z0;

    public j40(long j3) {
        super(j3);
        this.d = true;
    }

    public static void l1(j40 j40Var, int i7, org.telegram.messenger.e3 e3Var) {
        if (e3Var != null && j40Var.getParentActivity() != null) {
            i40 i40Var = new i40(j40Var, j40Var, j40Var.getParentActivity(), i7, j40Var.currentAccount, j40Var.resourceProvider);
            i40Var.A1(e3Var);
            i40Var.z1(j40Var.f49450c, true);
            i40Var.B1(j40Var.f49446a);
            i40Var.show();
            return;
        }
        j40Var.B0 = false;
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
        org.telegram.ui.Components.pj0 pj0Var = this.M;
        if (pj0Var != null) {
            pj0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27793a7));
        }
        FrameLayout frameLayout = this.O;
        if (frameLayout != null && (frameLayout.getBackground() instanceof org.telegram.ui.Components.xp)) {
            Drawable drawable = ((org.telegram.ui.Components.xp) this.O.getBackground()).f40331a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27849d6, this.resourceProvider));
                this.O.invalidate();
            }
        }
    }

    @Override
    public final void E0() {
        zs zsVar = new zs(this, getParentActivity(), this.resourceProvider, 4);
        this.M = zsVar;
        zsVar.setOnScrollListener(new g3(this, 13));
        this.M.setSections(true);
    }

    @Override
    public final int G0() {
        return getMessagesController().f24952z5;
    }

    @Override
    public final int H0() {
        return 2131749440;
    }

    @Override
    public final int I0() {
        return 2131749442;
    }

    @Override
    public final int L0() {
        return 2131749438;
    }

    @Override
    public final int M0() {
        return getMessagesController().f24923w5;
    }

    @Override
    public final int N0() {
        return 2131749439;
    }

    @Override
    public final int O0() {
        return getMessagesController().f24933x5;
    }

    @Override
    public final int P0() {
        return 4;
    }

    @Override
    public final int Q0() {
        return getMessagesController().f24913v5;
    }

    @Override
    public final int R0() {
        return 2131749403;
    }

    @Override
    public final int S0() {
        return 2131749397;
    }

    @Override
    public final int T0() {
        return 2131749398;
    }

    @Override
    public final int U0() {
        return 2131749383;
    }

    @Override
    public final int V0() {
        return getMessagesController().f24943y5;
    }

    @Override
    public final int W0() {
        return 2131749384;
    }

    @Override
    public final boolean Y0() {
        return org.telegram.messenger.t3.c0(getMessagesController().M0(Long.valueOf(-this.f49446a)));
    }

    @Override
    public final void a1(int i7) {
        if (this.f49450c != null && !this.B0) {
            this.B0 = true;
            org.telegram.messenger.qp.s1(this.currentAccount).G0().b(this.f49446a, this.f49450c, new fi.t3(this, i7, 5));
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
        if (i7 == org.telegram.messenger.qs.T && ((TLRPC.ChatFull) objArr[0]).f26954id == (-this.f49446a)) {
            i1();
        }
    }

    @Override
    public final void e1(boolean z9) {
        int i7;
        super.e1(z9);
        kc kcVar = this.f46835z0;
        if (kcVar != null) {
            TextView textView = kcVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f49450c;
            if (tL_premium_boostsStatus != null) {
                i7 = tL_premium_boostsStatus.boosts;
            } else {
                i7 = 0;
            }
            textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(i7, "BoostingGroupBoostCount", new Object[0])));
        }
    }

    @Override
    public final void g1(boolean z9) {
        super.g1(z9);
        this.actionBar.setBackgroundColor(0);
        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27849d6, this.resourceProvider)), org.telegram.ui.ActionBar.k6.Y0(getParentActivity(), 2131231230, org.telegram.ui.ActionBar.k6.f27813b7), 0, 0);
        xpVar.f40340x = true;
        this.O.setBackground(xpVar);
        this.M.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27793a7));
        kc kcVar = this.f46835z0;
        if (kcVar != null && !z9) {
            kcVar.f47161a.b(this.currentAccount, this.f49470s, false);
            this.f46835z0.f47162b.b(this.f49470s, false);
            this.f46835z0.updateColors();
        }
    }

    @Override
    public final void j1() {
        ec ecVar;
        ec ecVar2;
        this.Z = 0;
        boolean z9 = true;
        int i7 = 1 + 1;
        this.f49447a0 = 1;
        this.f49449b0 = i7;
        int i10 = i7 + 2;
        this.R = i10;
        this.f49451c0 = i7 + 1;
        if (this.f49477x == 0 && this.f49470s < 0) {
            int i11 = this.f49454e0;
            this.f49454e0 = -1;
            if (i11 >= 0 && (ecVar2 = this.N) != null) {
                ecVar2.s(i11);
                this.N.g(this.f49451c0);
            }
        } else {
            if (this.f49454e0 < 0) {
                z9 = false;
            }
            this.R = i7 + 3;
            this.f49454e0 = i10;
            if (!z9 && (ecVar = this.N) != null) {
                ecVar.i(i10);
                this.N.g(this.f49451c0);
                this.M.v0(0);
            }
        }
        int i12 = this.R;
        this.f49452d0 = i12;
        this.f49458h0 = i12 + 1;
        this.f49459i0 = i12 + 2;
        this.f49456f0 = i12 + 3;
        this.R = i12 + 5;
        this.f49457g0 = i12 + 4;
        TLRPC.ChatFull N0 = getMessagesController().N0(-this.f49446a);
        if (N0 != null && N0.can_set_stickers) {
            int i13 = this.R;
            this.f49460j0 = i13;
            this.R = i13 + 2;
            this.f49461k0 = i13 + 1;
        } else {
            this.f49460j0 = -1;
            this.f49461k0 = -1;
        }
        int i14 = this.R;
        this.S = i14;
        this.W = i14 + 1;
        this.X = i14 + 2;
        this.R = i14 + 4;
        this.Y = i14 + 3;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        kc kcVar = this.f46835z0;
        if (kcVar != null) {
            kcVar.a();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.T);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.T);
    }
}
