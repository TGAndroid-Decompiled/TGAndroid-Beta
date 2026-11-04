package org.telegram.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ThemeEditorView;
public class BubbleActivity extends i5 implements org.telegram.ui.ActionBar.n4 {
    public static BubbleActivity f28907b0;
    public boolean Q;
    public final ArrayList R = new ArrayList();
    public org.telegram.ui.Components.zb0 S;
    public ActionBarLayout T;
    public org.telegram.ui.ActionBar.l3 U;
    public Intent V;
    public boolean W;
    public int X;
    public boolean Y;
    public o4 Z;
    public long f28908a0;

    @Override
    public final boolean h(org.telegram.ui.ActionBar.d2 d2Var, ActionBarLayout actionBarLayout) {
        return true;
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (actionBarLayout.getFragmentStack().size() > 1) {
            return true;
        }
        if (!this.Q) {
            o4 o4Var = this.Z;
            if (o4Var != null) {
                org.telegram.messenger.g0.r(o4Var);
                this.Z = null;
            }
            this.Q = true;
            f28907b0 = null;
        }
        finish();
        return false;
    }

    @Override
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.o4 o4Var) {
        org.telegram.ui.ActionBar.d2 d2Var = o4Var.f28395a;
        return true;
    }

    @Override
    public final void onActivityResult(int i3, int i10, Intent intent) {
        b8.ke keVar;
        super.onActivityResult(i3, i10, intent);
        ThemeEditorView themeEditorView = ThemeEditorView.f31640p;
        if (themeEditorView != null && (keVar = themeEditorView.f31651m) != null) {
            keVar.u(i3, i10, intent);
        }
        if (!this.T.getFragmentStack().isEmpty()) {
            ((org.telegram.ui.ActionBar.d2) this.T.getFragmentStack().get(this.T.getFragmentStack().size() - 1)).onActivityResultFragment(i3, i10, intent);
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.R.size() == 1) {
            super.onBackPressed();
        } else if (this.S.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.v1().U1()) {
            PhotoViewer.v1().H0(true, false);
        } else {
            this.T.I();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        org.telegram.messenger.g0.v(this, configuration);
        org.telegram.messenger.g0.x3(getWindow());
        super.onConfigurationChanged(configuration);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        boolean z10;
        org.telegram.messenger.t0.w();
        requestWindowFeature(1);
        setTheme(2131755318);
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.q6(1));
        if (!org.telegram.messenger.az.f21661s.isEmpty() && !org.telegram.messenger.az.A) {
            try {
                getWindow().setFlags(8192, 8192);
                org.telegram.messenger.g0.h2();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        super.onCreate(bundle);
        if (!org.telegram.messenger.az.f21661s.isEmpty() && org.telegram.messenger.az.f21675x) {
            org.telegram.messenger.az.B = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = org.telegram.messenger.g0.f22580a;
        org.telegram.ui.ActionBar.k6.T(this);
        org.telegram.ui.ActionBar.k6.K(this, false);
        ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
        this.T = actionBarLayout;
        actionBarLayout.setInBubbleMode(true);
        this.T.setRemoveActionBarExtraHeight(true);
        org.telegram.ui.ActionBar.l3 l3Var = new org.telegram.ui.ActionBar.l3(this);
        this.U = l3Var;
        setContentView(l3Var, new ViewGroup.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.U.addView(relativeLayout, b8.mf.c(-1.0f, -1));
        relativeLayout.addView(this.T.getView(), b8.mf.w(-1, -1));
        this.U.setParentActionBarLayout(this.T);
        this.T.setDrawerLayoutContainer(this.U);
        this.T.setFragmentStack(this.R);
        this.T.setDelegate(this);
        org.telegram.ui.Components.zb0 zb0Var = new org.telegram.ui.Components.zb0(this);
        this.S = zb0Var;
        this.U.addView(zb0Var, b8.mf.c(-1.0f, -1));
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23257k4, this);
        this.T.a0();
        Intent intent = getIntent();
        if (bundle != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        x(intent, false, z10, false, org.telegram.messenger.h10.f22829t0);
        f28907b0 = this;
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        int i3 = this.P;
        if (i3 != -1) {
            org.telegram.messenger.us.f25748l0.c(new ci.cc((org.telegram.messenger.cs) org.telegram.messenger.us.t(org.telegram.messenger.c.a(i3).f21919a), false, this.f28908a0, 3));
            ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.P).f21919a).setAppPaused(false, false);
        }
        if (!this.Q) {
            o4 o4Var = this.Z;
            if (o4Var != null) {
                org.telegram.messenger.g0.r(o4Var);
                this.Z = null;
            }
            this.Q = true;
            f28907b0 = null;
        }
        f28907b0 = null;
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        this.T.M();
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        x(intent, true, false, false, org.telegram.messenger.h10.f22829t0);
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.T.O();
        org.telegram.messenger.t0.E = true;
        o4 o4Var = this.Z;
        if (o4Var != null) {
            org.telegram.messenger.g0.r(o4Var);
            this.Z = null;
        }
        if (!org.telegram.messenger.az.f21661s.isEmpty()) {
            org.telegram.messenger.az.B = (int) (SystemClock.elapsedRealtime() / 1000);
            o4 o4Var2 = new o4(this, 1);
            this.Z = o4Var2;
            if (org.telegram.messenger.az.f21675x) {
                org.telegram.messenger.g0.i3(o4Var2, 1000L);
            } else {
                int i3 = org.telegram.messenger.az.f21678y;
                if (i3 != 0) {
                    org.telegram.messenger.g0.i3(o4Var2, (i3 * 1000) + 1000);
                }
            }
        } else {
            org.telegram.messenger.az.B = 0;
        }
        org.telegram.messenger.az.y();
        org.telegram.ui.Components.zb0 zb0Var = this.S;
        if (zb0Var != null) {
            zb0Var.k();
        }
        f28907b0 = null;
    }

    @Override
    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i3, strArr, iArr);
        if (!u(i3, strArr, iArr)) {
            return;
        }
        if (!this.T.getFragmentStack().isEmpty()) {
            ((org.telegram.ui.ActionBar.d2) this.T.getFragmentStack().get(this.T.getFragmentStack().size() - 1)).onRequestPermissionsResultFragment(i3, strArr, iArr);
        }
        zb1.k(iArr, i3);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.T.P();
        org.telegram.messenger.t0.E = false;
        o4 o4Var = this.Z;
        if (o4Var != null) {
            org.telegram.messenger.g0.r(o4Var);
            this.Z = null;
        }
        if (org.telegram.messenger.g0.p2(true)) {
            z();
        }
        if (org.telegram.messenger.az.B != 0) {
            org.telegram.messenger.az.B = 0;
            org.telegram.messenger.az.y();
        }
        if (this.S.getVisibility() != 0) {
            this.T.P();
        } else {
            this.T.n();
            this.S.l();
        }
        f28907b0 = this;
    }

    public final void x(Intent intent, boolean z10, boolean z11, boolean z12, int i3) {
        wm wmVar;
        if (!z12 && (org.telegram.messenger.g0.p2(true) || org.telegram.messenger.az.C)) {
            z();
            this.V = intent;
            this.W = z10;
            this.Y = z11;
            this.X = i3;
            org.telegram.messenger.h10.i(i3).v(false);
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", org.telegram.messenger.h10.f22829t0);
        this.P = intExtra;
        if (!org.telegram.messenger.h10.r(intExtra)) {
            finish();
            return;
        }
        if (intent.getAction() != null && intent.getAction().startsWith("com.tmessages.openchat")) {
            long longExtra = intent.getLongExtra("chatId", 0L);
            long longExtra2 = intent.getLongExtra("userId", 0L);
            Bundle bundle = new Bundle();
            if (longExtra2 != 0) {
                this.f28908a0 = longExtra2;
                bundle.putLong("user_id", longExtra2);
            } else {
                this.f28908a0 = -longExtra;
                bundle.putLong("chat_id", longExtra);
            }
            wmVar = new wm(bundle);
            wmVar.setInBubbleMode(true);
            wmVar.setCurrentAccount(this.P);
        } else {
            wmVar = null;
        }
        if (wmVar == null) {
            finish();
            return;
        }
        org.telegram.messenger.hs.f(this.P).k(org.telegram.messenger.hs.f23305t, Long.valueOf(this.f28908a0));
        this.T.a0();
        this.T.c(-1, wmVar);
        org.telegram.messenger.us.f25748l0.c(new ci.cc((org.telegram.messenger.cs) org.telegram.messenger.us.t(org.telegram.messenger.c.a(this.P).f21919a), true, this.f28908a0, 3));
        ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.P).f21919a).setAppPaused(false, false);
        this.T.f0();
    }

    public final void z() {
        if (this.S == null) {
            return;
        }
        org.telegram.messenger.az.f21675x = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f41965s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
            PhotoViewer.v1().H0(false, true);
        } else if (i4.G() && i4.v().W) {
            i4.v().m(false, true);
        }
        this.S.m(false, -1, -1, null);
        org.telegram.messenger.az.C = true;
        this.S.setDelegate(new x0(this, 6));
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void e(int[] iArr) {
    }

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
    }
}
