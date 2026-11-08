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
public class BubbleActivity extends g5 implements org.telegram.ui.ActionBar.n4 {
    public static BubbleActivity f28850a0;
    public boolean P;
    public final ArrayList Q = new ArrayList();
    public org.telegram.ui.Components.ec0 R;
    public ActionBarLayout S;
    public org.telegram.ui.ActionBar.n3 T;
    public Intent U;
    public boolean V;
    public int W;
    public boolean X;
    public m4 Y;
    public long Z;

    @Override
    public final boolean h(org.telegram.ui.ActionBar.f2 f2Var, ActionBarLayout actionBarLayout) {
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
        if (!this.P) {
            m4 m4Var = this.Y;
            if (m4Var != null) {
                org.telegram.messenger.g0.r(m4Var);
                this.Y = null;
            }
            this.P = true;
            f28850a0 = null;
        }
        finish();
        return false;
    }

    @Override
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.o4 o4Var) {
        org.telegram.ui.ActionBar.f2 f2Var = o4Var.f28342a;
        return true;
    }

    @Override
    public final void onActivityResult(int i7, int i10, Intent intent) {
        a8.r7 r7Var;
        super.onActivityResult(i7, i10, intent);
        ThemeEditorView themeEditorView = ThemeEditorView.f31566p;
        if (themeEditorView != null && (r7Var = themeEditorView.f31577m) != null) {
            r7Var.t(i7, i10, intent);
        }
        if (!this.S.getFragmentStack().isEmpty()) {
            ((org.telegram.ui.ActionBar.f2) this.S.getFragmentStack().get(this.S.getFragmentStack().size() - 1)).onActivityResultFragment(i7, i10, intent);
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.Q.size() == 1) {
            super.onBackPressed();
        } else if (this.R.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.p1().P1()) {
            PhotoViewer.p1().z0(true, false);
        } else {
            this.S.I();
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
        boolean z9;
        org.telegram.messenger.t0.w();
        requestWindowFeature(1);
        setTheme(2131755318);
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.r6(1));
        if (!org.telegram.messenger.iz.f23434s.isEmpty() && !org.telegram.messenger.iz.A) {
            try {
                getWindow().setFlags(8192, 8192);
                org.telegram.messenger.g0.h2();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        super.onCreate(bundle);
        if (!org.telegram.messenger.iz.f23434s.isEmpty() && org.telegram.messenger.iz.f23448x) {
            org.telegram.messenger.iz.B = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = org.telegram.messenger.g0.f22535a;
        org.telegram.ui.ActionBar.k6.T(this);
        org.telegram.ui.ActionBar.k6.K(this, false);
        ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
        this.S = actionBarLayout;
        actionBarLayout.setInBubbleMode(true);
        this.S.setRemoveActionBarExtraHeight(true);
        org.telegram.ui.ActionBar.n3 n3Var = new org.telegram.ui.ActionBar.n3(this);
        this.T = n3Var;
        setContentView(n3Var, new ViewGroup.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.T.addView(relativeLayout, c8.ha.c(-1.0f, -1));
        relativeLayout.addView(this.S.getView(), c8.ha.w(-1, -1));
        this.T.setParentActionBarLayout(this.S);
        this.S.setDrawerLayoutContainer(this.T);
        this.S.setFragmentStack(this.Q);
        this.S.setDelegate(this);
        org.telegram.ui.Components.ec0 ec0Var = new org.telegram.ui.Components.ec0(this);
        this.R = ec0Var;
        this.T.addView(ec0Var, c8.ha.c(-1.0f, -1));
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25029k4, this);
        this.S.a0();
        Intent intent = getIntent();
        if (bundle != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        x(intent, false, z9, false, org.telegram.messenger.p10.f24470s0);
        f28850a0 = this;
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        int i7 = this.O;
        if (i7 != -1) {
            org.telegram.messenger.dt.f22076k0.c(new bi.kd((org.telegram.messenger.ls) org.telegram.messenger.dt.t(org.telegram.messenger.c.a(i7).f21765a), false, this.Z, 3));
            ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.O).f21765a).setAppPaused(false, false);
        }
        if (!this.P) {
            m4 m4Var = this.Y;
            if (m4Var != null) {
                org.telegram.messenger.g0.r(m4Var);
                this.Y = null;
            }
            this.P = true;
            f28850a0 = null;
        }
        f28850a0 = null;
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        this.S.M();
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        x(intent, true, false, false, org.telegram.messenger.p10.f24470s0);
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.S.O();
        org.telegram.messenger.t0.D = true;
        m4 m4Var = this.Y;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.Y = null;
        }
        if (!org.telegram.messenger.iz.f23434s.isEmpty()) {
            org.telegram.messenger.iz.B = (int) (SystemClock.elapsedRealtime() / 1000);
            m4 m4Var2 = new m4(this, 1);
            this.Y = m4Var2;
            if (org.telegram.messenger.iz.f23448x) {
                org.telegram.messenger.g0.i3(m4Var2, 1000L);
            } else {
                int i7 = org.telegram.messenger.iz.f23451y;
                if (i7 != 0) {
                    org.telegram.messenger.g0.i3(m4Var2, (i7 * 1000) + 1000);
                }
            }
        } else {
            org.telegram.messenger.iz.B = 0;
        }
        org.telegram.messenger.iz.y();
        org.telegram.ui.Components.ec0 ec0Var = this.R;
        if (ec0Var != null) {
            ec0Var.k();
        }
        f28850a0 = null;
    }

    @Override
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        if (!u(i7, strArr, iArr)) {
            return;
        }
        if (!this.S.getFragmentStack().isEmpty()) {
            ((org.telegram.ui.ActionBar.f2) this.S.getFragmentStack().get(this.S.getFragmentStack().size() - 1)).onRequestPermissionsResultFragment(i7, strArr, iArr);
        }
        fc1.h(iArr, i7);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.S.P();
        org.telegram.messenger.t0.D = false;
        m4 m4Var = this.Y;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.Y = null;
        }
        if (org.telegram.messenger.g0.p2(true)) {
            z();
        }
        if (org.telegram.messenger.iz.B != 0) {
            org.telegram.messenger.iz.B = 0;
            org.telegram.messenger.iz.y();
        }
        if (this.R.getVisibility() != 0) {
            this.S.P();
        } else {
            this.S.n();
            this.R.l();
        }
        f28850a0 = this;
    }

    public final void x(Intent intent, boolean z9, boolean z10, boolean z11, int i7) {
        an anVar;
        if (!z11 && (org.telegram.messenger.g0.p2(true) || org.telegram.messenger.iz.C)) {
            z();
            this.U = intent;
            this.V = z9;
            this.X = z10;
            this.W = i7;
            org.telegram.messenger.p10.i(i7).v(false);
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", org.telegram.messenger.p10.f24470s0);
        this.O = intExtra;
        if (!org.telegram.messenger.p10.r(intExtra)) {
            finish();
            return;
        }
        if (intent.getAction() != null && intent.getAction().startsWith("com.tmessages.openchat")) {
            long longExtra = intent.getLongExtra("chatId", 0L);
            long longExtra2 = intent.getLongExtra("userId", 0L);
            Bundle bundle = new Bundle();
            if (longExtra2 != 0) {
                this.Z = longExtra2;
                bundle.putLong("user_id", longExtra2);
            } else {
                this.Z = -longExtra;
                bundle.putLong("chat_id", longExtra);
            }
            anVar = new an(bundle);
            anVar.setInBubbleMode(true);
            anVar.setCurrentAccount(this.O);
        } else {
            anVar = null;
        }
        if (anVar == null) {
            finish();
            return;
        }
        org.telegram.messenger.qs.f(this.O).k(org.telegram.messenger.qs.f25076t, Long.valueOf(this.Z));
        this.S.a0();
        this.S.c(-1, anVar);
        org.telegram.messenger.dt.f22076k0.c(new bi.kd((org.telegram.messenger.ls) org.telegram.messenger.dt.t(org.telegram.messenger.c.a(this.O).f21765a), true, this.Z, 3));
        ConnectionsManager.getInstance(org.telegram.messenger.c.a(this.O).f21765a).setAppPaused(false, false);
        this.S.f0();
    }

    public final void z() {
        if (this.R == null) {
            return;
        }
        org.telegram.messenger.iz.f23448x = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f41937s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer.p1().z0(false, true);
        } else if (g4.G() && g4.v().V) {
            g4.v().m(false, true);
        }
        this.R.m(false, -1, -1, null);
        org.telegram.messenger.iz.C = true;
        this.R.setDelegate(new w0(this, 6));
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void e(int[] iArr) {
    }

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z9) {
    }
}
