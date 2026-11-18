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
public class BubbleActivity extends g5 implements org.telegram.ui.ActionBar.p4 {
    public static BubbleActivity f30340b0;
    public boolean Q;
    public final ArrayList R = new ArrayList();
    public org.telegram.ui.Components.pc0 S;
    public ActionBarLayout T;
    public org.telegram.ui.ActionBar.p3 U;
    public Intent V;
    public boolean W;
    public int X;
    public boolean Y;
    public m4 Z;
    public long f30341a0;

    @Override
    public final boolean c(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.h2 h2Var) {
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
            m4 m4Var = this.Z;
            if (m4Var != null) {
                org.telegram.messenger.g0.r(m4Var);
                this.Z = null;
            }
            this.Q = true;
            f30340b0 = null;
        }
        finish();
        return false;
    }

    @Override
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.q4 q4Var) {
        org.telegram.ui.ActionBar.h2 h2Var = q4Var.f29903a;
        return true;
    }

    @Override
    public final void onActivityResult(int i7, int i10, Intent intent) {
        a8.r7 r7Var;
        super.onActivityResult(i7, i10, intent);
        ThemeEditorView themeEditorView = ThemeEditorView.f33144p;
        if (themeEditorView != null && (r7Var = themeEditorView.f33155m) != null) {
            r7Var.w(i7, i10, intent);
        }
        if (!this.T.getFragmentStack().isEmpty()) {
            ((org.telegram.ui.ActionBar.h2) this.T.getFragmentStack().get(this.T.getFragmentStack().size() - 1)).onActivityResultFragment(i7, i10, intent);
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.R.size() == 1) {
            super.onBackPressed();
        } else if (this.S.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.p1().P1()) {
            PhotoViewer.p1().z0(true, false);
        } else {
            this.T.I();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        org.telegram.messenger.g0.v(this, configuration);
        org.telegram.messenger.g0.v3(getWindow());
        super.onConfigurationChanged(configuration);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        boolean z10;
        org.telegram.messenger.t0.w();
        requestWindowFeature(1);
        setTheme(2131755318);
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.r6(1));
        if (!org.telegram.messenger.bz.f23197s.isEmpty() && !org.telegram.messenger.bz.A) {
            try {
                getWindow().setFlags(8192, 8192);
                org.telegram.messenger.g0.h2();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        super.onCreate(bundle);
        if (!org.telegram.messenger.bz.f23197s.isEmpty() && org.telegram.messenger.bz.f23211x) {
            org.telegram.messenger.bz.B = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = org.telegram.messenger.g0.f24093a;
        org.telegram.ui.ActionBar.n6.T(this);
        org.telegram.ui.ActionBar.n6.K(this, false);
        ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
        this.T = actionBarLayout;
        actionBarLayout.setInBubbleMode(true);
        this.T.setRemoveActionBarExtraHeight(true);
        org.telegram.ui.ActionBar.p3 p3Var = new org.telegram.ui.ActionBar.p3(this);
        this.U = p3Var;
        setContentView(p3Var, new ViewGroup.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.U.addView(relativeLayout, c8.ma.c(-1.0f, -1));
        relativeLayout.addView(this.T.getView(), c8.ma.w(-1, -1));
        this.U.setParentActionBarLayout(this.T);
        this.T.setDrawerLayoutContainer(this.U);
        this.T.setFragmentStack(this.R);
        this.T.setDelegate(this);
        org.telegram.ui.Components.pc0 pc0Var = new org.telegram.ui.Components.pc0(this);
        this.S = pc0Var;
        this.U.addView(pc0Var, c8.ma.c(-1.0f, -1));
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25155m4, this);
        this.T.a0();
        Intent intent = getIntent();
        if (bundle != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        x(intent, false, z10, false, org.telegram.messenger.j10.f24773t0);
        f30340b0 = this;
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        int i7 = this.P;
        if (i7 != -1) {
            org.telegram.messenger.xs.f27959l0.c(new di.vb((org.telegram.messenger.fs) org.telegram.messenger.xs.t(org.telegram.messenger.c.a(i7).f23221a), false, this.f30341a0, 3));
            ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.P).f23221a).setAppPaused(false, false);
        }
        if (!this.Q) {
            m4 m4Var = this.Z;
            if (m4Var != null) {
                org.telegram.messenger.g0.r(m4Var);
                this.Z = null;
            }
            this.Q = true;
            f30340b0 = null;
        }
        f30340b0 = null;
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        this.T.M();
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        x(intent, true, false, false, org.telegram.messenger.j10.f24773t0);
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.T.O();
        org.telegram.messenger.t0.E = true;
        m4 m4Var = this.Z;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.Z = null;
        }
        if (!org.telegram.messenger.bz.f23197s.isEmpty()) {
            org.telegram.messenger.bz.B = (int) (SystemClock.elapsedRealtime() / 1000);
            m4 m4Var2 = new m4(this, 1);
            this.Z = m4Var2;
            if (org.telegram.messenger.bz.f23211x) {
                org.telegram.messenger.g0.h3(m4Var2, 1000L);
            } else {
                int i7 = org.telegram.messenger.bz.f23214y;
                if (i7 != 0) {
                    org.telegram.messenger.g0.h3(m4Var2, (i7 * 1000) + 1000);
                }
            }
        } else {
            org.telegram.messenger.bz.B = 0;
        }
        org.telegram.messenger.bz.y();
        org.telegram.ui.Components.pc0 pc0Var = this.S;
        if (pc0Var != null) {
            pc0Var.k();
        }
        f30340b0 = null;
    }

    @Override
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        if (!u(i7, strArr, iArr)) {
            return;
        }
        if (!this.T.getFragmentStack().isEmpty()) {
            ((org.telegram.ui.ActionBar.h2) this.T.getFragmentStack().get(this.T.getFragmentStack().size() - 1)).onRequestPermissionsResultFragment(i7, strArr, iArr);
        }
        hc1.h(iArr, i7);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.T.P();
        org.telegram.messenger.t0.E = false;
        m4 m4Var = this.Z;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.Z = null;
        }
        if (org.telegram.messenger.g0.p2(true)) {
            z();
        }
        if (org.telegram.messenger.bz.B != 0) {
            org.telegram.messenger.bz.B = 0;
            org.telegram.messenger.bz.y();
        }
        if (this.S.getVisibility() != 0) {
            this.T.P();
        } else {
            this.T.n();
            this.S.l();
        }
        f30340b0 = this;
    }

    public final void x(Intent intent, boolean z10, boolean z11, boolean z12, int i7) {
        bn bnVar;
        if (!z12 && (org.telegram.messenger.g0.p2(true) || org.telegram.messenger.bz.C)) {
            z();
            this.V = intent;
            this.W = z10;
            this.Y = z11;
            this.X = i7;
            org.telegram.messenger.j10.i(i7).v(false);
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", org.telegram.messenger.j10.f24773t0);
        this.P = intExtra;
        if (!org.telegram.messenger.j10.r(intExtra)) {
            finish();
            return;
        }
        if (intent.getAction() != null && intent.getAction().startsWith("com.tmessages.openchat")) {
            long longExtra = intent.getLongExtra("chatId", 0L);
            long longExtra2 = intent.getLongExtra("userId", 0L);
            Bundle bundle = new Bundle();
            if (longExtra2 != 0) {
                this.f30341a0 = longExtra2;
                bundle.putLong("user_id", longExtra2);
            } else {
                this.f30341a0 = -longExtra;
                bundle.putLong("chat_id", longExtra);
            }
            bnVar = new bn(bundle);
            bnVar.setInBubbleMode(true);
            bnVar.setCurrentAccount(this.P);
        } else {
            bnVar = null;
        }
        if (bnVar == null) {
            finish();
            return;
        }
        org.telegram.messenger.ks.f(this.P).k(org.telegram.messenger.ks.f25192t, Long.valueOf(this.f30341a0));
        this.T.a0();
        this.T.c(-1, bnVar);
        org.telegram.messenger.xs.f27959l0.c(new di.vb((org.telegram.messenger.fs) org.telegram.messenger.xs.t(org.telegram.messenger.c.a(this.P).f23221a), true, this.f30341a0, 3));
        ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.P).f23221a).setAppPaused(false, false);
        this.T.f0();
    }

    public final void z() {
        if (this.S == null) {
            return;
        }
        org.telegram.messenger.bz.f23211x = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f43754s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer.p1().z0(false, true);
        } else if (g4.G() && g4.v().W) {
            g4.v().m(false, true);
        }
        this.S.m(false, -1, -1, null);
        org.telegram.messenger.bz.C = true;
        this.S.setDelegate(new w0(this, 6));
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void f(int[] iArr) {
    }

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
    }
}
