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
public class BubbleActivity extends g5 implements org.telegram.ui.ActionBar.o4 {
    public static BubbleActivity f30335b0;
    public boolean Q;
    public final ArrayList R = new ArrayList();
    public org.telegram.ui.Components.qc0 S;
    public ActionBarLayout T;
    public org.telegram.ui.ActionBar.o3 U;
    public Intent V;
    public boolean W;
    public int X;
    public boolean Y;
    public m4 Z;
    public long f30336a0;

    @Override
    public final boolean c(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.g2 g2Var) {
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
            f30335b0 = null;
        }
        finish();
        return false;
    }

    @Override
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.p4 p4Var) {
        org.telegram.ui.ActionBar.g2 g2Var = p4Var.f29853a;
        return true;
    }

    @Override
    public final void onActivityResult(int i7, int i10, Intent intent) {
        a8.r7 r7Var;
        super.onActivityResult(i7, i10, intent);
        ThemeEditorView themeEditorView = ThemeEditorView.f33146p;
        if (themeEditorView != null && (r7Var = themeEditorView.f33157m) != null) {
            r7Var.w(i7, i10, intent);
        }
        if (!this.T.getFragmentStack().isEmpty()) {
            ((org.telegram.ui.ActionBar.g2) this.T.getFragmentStack().get(this.T.getFragmentStack().size() - 1)).onActivityResultFragment(i7, i10, intent);
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
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.s6(1));
        if (!org.telegram.messenger.cz.f23403s.isEmpty() && !org.telegram.messenger.cz.A) {
            try {
                getWindow().setFlags(8192, 8192);
                org.telegram.messenger.g0.h2();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        super.onCreate(bundle);
        if (!org.telegram.messenger.cz.f23403s.isEmpty() && org.telegram.messenger.cz.f23417x) {
            org.telegram.messenger.cz.B = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = org.telegram.messenger.g0.f23982a;
        org.telegram.ui.ActionBar.m6.T(this);
        org.telegram.ui.ActionBar.m6.K(this, false);
        ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
        this.T = actionBarLayout;
        actionBarLayout.setInBubbleMode(true);
        this.T.setRemoveActionBarExtraHeight(true);
        org.telegram.ui.ActionBar.o3 o3Var = new org.telegram.ui.ActionBar.o3(this);
        this.U = o3Var;
        setContentView(o3Var, new ViewGroup.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.U.addView(relativeLayout, c8.na.c(-1.0f, -1));
        relativeLayout.addView(this.T.getView(), c8.na.w(-1, -1));
        this.U.setParentActionBarLayout(this.T);
        this.T.setDrawerLayoutContainer(this.U);
        this.T.setFragmentStack(this.R);
        this.T.setDelegate(this);
        org.telegram.ui.Components.qc0 qc0Var = new org.telegram.ui.Components.qc0(this);
        this.S = qc0Var;
        this.U.addView(qc0Var, c8.na.c(-1.0f, -1));
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25316n4, this);
        this.T.a0();
        Intent intent = getIntent();
        if (bundle != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        x(intent, false, z10, false, org.telegram.messenger.k10.f24932t0);
        f30335b0 = this;
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        int i7 = this.P;
        if (i7 != -1) {
            org.telegram.messenger.ys.f28133l0.c(new di.vb((org.telegram.messenger.gs) org.telegram.messenger.ys.t(org.telegram.messenger.c.a(i7).f23166a), false, this.f30336a0, 3));
            ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.P).f23166a).setAppPaused(false, false);
        }
        if (!this.Q) {
            m4 m4Var = this.Z;
            if (m4Var != null) {
                org.telegram.messenger.g0.r(m4Var);
                this.Z = null;
            }
            this.Q = true;
            f30335b0 = null;
        }
        f30335b0 = null;
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        this.T.M();
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        x(intent, true, false, false, org.telegram.messenger.k10.f24932t0);
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
        if (!org.telegram.messenger.cz.f23403s.isEmpty()) {
            org.telegram.messenger.cz.B = (int) (SystemClock.elapsedRealtime() / 1000);
            m4 m4Var2 = new m4(this, 1);
            this.Z = m4Var2;
            if (org.telegram.messenger.cz.f23417x) {
                org.telegram.messenger.g0.h3(m4Var2, 1000L);
            } else {
                int i7 = org.telegram.messenger.cz.f23420y;
                if (i7 != 0) {
                    org.telegram.messenger.g0.h3(m4Var2, (i7 * 1000) + 1000);
                }
            }
        } else {
            org.telegram.messenger.cz.B = 0;
        }
        org.telegram.messenger.cz.y();
        org.telegram.ui.Components.qc0 qc0Var = this.S;
        if (qc0Var != null) {
            qc0Var.k();
        }
        f30335b0 = null;
    }

    @Override
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        if (!u(i7, strArr, iArr)) {
            return;
        }
        if (!this.T.getFragmentStack().isEmpty()) {
            ((org.telegram.ui.ActionBar.g2) this.T.getFragmentStack().get(this.T.getFragmentStack().size() - 1)).onRequestPermissionsResultFragment(i7, strArr, iArr);
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
        if (org.telegram.messenger.cz.B != 0) {
            org.telegram.messenger.cz.B = 0;
            org.telegram.messenger.cz.y();
        }
        if (this.S.getVisibility() != 0) {
            this.T.P();
        } else {
            this.T.n();
            this.S.l();
        }
        f30335b0 = this;
    }

    public final void x(Intent intent, boolean z10, boolean z11, boolean z12, int i7) {
        bn bnVar;
        if (!z12 && (org.telegram.messenger.g0.p2(true) || org.telegram.messenger.cz.C)) {
            z();
            this.V = intent;
            this.W = z10;
            this.Y = z11;
            this.X = i7;
            org.telegram.messenger.k10.i(i7).v(false);
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", org.telegram.messenger.k10.f24932t0);
        this.P = intExtra;
        if (!org.telegram.messenger.k10.r(intExtra)) {
            finish();
            return;
        }
        if (intent.getAction() != null && intent.getAction().startsWith("com.tmessages.openchat")) {
            long longExtra = intent.getLongExtra("chatId", 0L);
            long longExtra2 = intent.getLongExtra("userId", 0L);
            Bundle bundle = new Bundle();
            if (longExtra2 != 0) {
                this.f30336a0 = longExtra2;
                bundle.putLong("user_id", longExtra2);
            } else {
                this.f30336a0 = -longExtra;
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
        org.telegram.messenger.ls.f(this.P).k(org.telegram.messenger.ls.f25348t, Long.valueOf(this.f30336a0));
        this.T.a0();
        this.T.c(-1, bnVar);
        org.telegram.messenger.ys.f28133l0.c(new di.vb((org.telegram.messenger.gs) org.telegram.messenger.ys.t(org.telegram.messenger.c.a(this.P).f23166a), true, this.f30336a0, 3));
        ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.P).f23166a).setAppPaused(false, false);
        this.T.f0();
    }

    public final void z() {
        if (this.S == null) {
            return;
        }
        org.telegram.messenger.cz.f23417x = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f43764s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer.p1().z0(false, true);
        } else if (g4.G() && g4.v().W) {
            g4.v().m(false, true);
        }
        this.S.m(false, -1, -1, null);
        org.telegram.messenger.cz.C = true;
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
