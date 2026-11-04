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
public final class e40 extends pc {
    public ic A0;
    public float B0;
    public boolean C0;

    public e40(long j10) {
        super(j10);
        this.d = true;
    }

    public static void l1(e40 e40Var, int i3, org.telegram.messenger.e3 e3Var) {
        if (e3Var != null && e40Var.getParentActivity() != null) {
            d40 d40Var = new d40(e40Var, e40Var, e40Var.getParentActivity(), i3, e40Var.currentAccount, e40Var.resourceProvider);
            d40Var.A1(e3Var);
            d40Var.z1(e40Var.f48514c, true);
            d40Var.B1(e40Var.f48510a);
            d40Var.show();
            return;
        }
        e40Var.C0 = false;
    }

    @Override
    public final void C0() {
        B0();
        org.telegram.ui.Components.tj0 tj0Var = this.N;
        if (tj0Var != null) {
            tj0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27824a7));
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout != null && (frameLayout.getBackground() instanceof org.telegram.ui.Components.xp)) {
            Drawable drawable = ((org.telegram.ui.Components.xp) this.P.getBackground()).f40438a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, this.resourceProvider));
                this.P.invalidate();
            }
        }
    }

    @Override
    public final void E0() {
        xs xsVar = new xs(this, getParentActivity(), this.resourceProvider, 4);
        this.N = xsVar;
        xsVar.setOnScrollListener(new h3(this, 13));
        this.N.setSections(true);
    }

    @Override
    public final int G0() {
        return getMessagesController().f23184z5;
    }

    @Override
    public final int H0() {
        return 2131749449;
    }

    @Override
    public final int I0() {
        return 2131749451;
    }

    @Override
    public final int L0() {
        return 2131749447;
    }

    @Override
    public final int M0() {
        return getMessagesController().f23155w5;
    }

    @Override
    public final int N0() {
        return 2131749448;
    }

    @Override
    public final int O0() {
        return getMessagesController().f23165x5;
    }

    @Override
    public final int P0() {
        return 4;
    }

    @Override
    public final int Q0() {
        return getMessagesController().f23145v5;
    }

    @Override
    public final int R0() {
        return 2131749412;
    }

    @Override
    public final int S0() {
        return 2131749406;
    }

    @Override
    public final int T0() {
        return 2131749407;
    }

    @Override
    public final int U0() {
        return 2131749392;
    }

    @Override
    public final int V0() {
        return getMessagesController().f23175y5;
    }

    @Override
    public final int W0() {
        return 2131749393;
    }

    @Override
    public final boolean Y0() {
        return org.telegram.messenger.t3.c0(getMessagesController().M0(Long.valueOf(-this.f48510a)));
    }

    @Override
    public final void a1(int i3) {
        if (this.f48514c != null && !this.C0) {
            this.C0 = true;
            org.telegram.messenger.hp.s1(this.currentAccount).G0().b(this.f48510a, this.f48514c, new gi.s3(this, i3, 5));
        }
    }

    @Override
    public final View createView(Context context) {
        View createView = super.createView(context);
        g1(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new c40(this, (FrameLayout) createView));
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        super.didReceivedNotification(i3, i10, objArr);
        if (i3 == org.telegram.messenger.hs.T && ((TLRPC.ChatFull) objArr[0]).f27002id == (-this.f48510a)) {
            i1();
        }
    }

    @Override
    public final void e1(boolean z10) {
        int i3;
        super.e1(z10);
        ic icVar = this.A0;
        if (icVar != null) {
            TextView textView = icVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f48514c;
            if (tL_premium_boostsStatus != null) {
                i3 = tL_premium_boostsStatus.boosts;
            } else {
                i3 = 0;
            }
            textView.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(i3, "BoostingGroupBoostCount", new Object[0])));
        }
    }

    @Override
    public final void g1(boolean z10) {
        super.g1(z10);
        this.actionBar.setBackgroundColor(0);
        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, this.resourceProvider)), org.telegram.ui.ActionBar.k6.Y0(getParentActivity(), 2131231230, org.telegram.ui.ActionBar.k6.f27843b7), 0, 0);
        xpVar.f40447x = true;
        this.P.setBackground(xpVar);
        this.N.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f27824a7));
        ic icVar = this.A0;
        if (icVar != null && !z10) {
            icVar.f46233a.b(this.currentAccount, this.f48534s, false);
            this.A0.f46234b.b(this.f48534s, false);
            this.A0.updateColors();
        }
    }

    @Override
    public final void j1() {
        cc ccVar;
        cc ccVar2;
        this.f48511a0 = 0;
        boolean z10 = true;
        int i3 = 1 + 1;
        this.f48513b0 = 1;
        this.f48515c0 = i3;
        int i10 = i3 + 2;
        this.S = i10;
        this.f48516d0 = i3 + 1;
        if (this.f48541x == 0 && this.f48534s < 0) {
            int i11 = this.f48520f0;
            this.f48520f0 = -1;
            if (i11 >= 0 && (ccVar2 = this.O) != null) {
                ccVar2.s(i11);
                this.O.g(this.f48516d0);
            }
        } else {
            if (this.f48520f0 < 0) {
                z10 = false;
            }
            this.S = i3 + 3;
            this.f48520f0 = i10;
            if (!z10 && (ccVar = this.O) != null) {
                ccVar.i(i10);
                this.O.g(this.f48516d0);
                this.N.v0(0);
            }
        }
        int i12 = this.S;
        this.f48518e0 = i12;
        this.f48523i0 = i12 + 1;
        this.f48524j0 = i12 + 2;
        this.f48521g0 = i12 + 3;
        this.S = i12 + 5;
        this.f48522h0 = i12 + 4;
        TLRPC.ChatFull N0 = getMessagesController().N0(-this.f48510a);
        if (N0 != null && N0.can_set_stickers) {
            int i13 = this.S;
            this.f48525k0 = i13;
            this.S = i13 + 2;
            this.f48526l0 = i13 + 1;
        } else {
            this.f48525k0 = -1;
            this.f48526l0 = -1;
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
        ic icVar = this.A0;
        if (icVar != null) {
            icVar.a();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.T);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.T);
    }
}
