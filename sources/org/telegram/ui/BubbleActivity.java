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
public class BubbleActivity extends th0 implements pk5 {
    public static BubbleActivity b0;
    public boolean Q;
    public final ArrayList R = new ArrayList();
    public by7 S;
    public ActionBarLayout T;
    public wr3 U;
    public Intent V;
    public boolean W;
    public int X;
    public boolean Y;
    public o1 Z;
    public long a0;

    public final void A() {
        if (this.S == null) {
            return;
        }
        gda.w = true;
        if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
            SecretMediaViewer.d().c(false, false);
        } else if (PhotoViewer.C0() && PhotoViewer.r0().V0()) {
            PhotoViewer.r0().A(false, true);
        } else if (o.F() && o.u().W) {
            o.u().l(false, true);
        }
        this.S.m(false, -1, -1, null);
        gda.B = true;
        this.S.setDelegate(new xg0(this, (byte) 18));
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.d dVar, ActionBarLayout actionBarLayout) {
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
            o1 o1Var = this.Z;
            if (o1Var != null) {
                gm.r(o1Var);
                this.Z = null;
            }
            this.Q = true;
            b0 = null;
        }
        finish();
        return false;
    }

    @Override
    public final boolean l(ActionBarLayout actionBarLayout, qk5 qk5Var) {
        org.telegram.ui.ActionBar.d dVar = qk5Var.a;
        return true;
    }

    @Override
    public final void onActivityResult(int i, int i2, Intent intent) {
        sm2 sm2Var;
        super.onActivityResult(i, i2, intent);
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null && (sm2Var = themeEditorView.m) != null) {
            sm2Var.E(i, i2, intent);
        }
        if (!this.T.getFragmentStack().isEmpty()) {
            ((org.telegram.ui.ActionBar.d) this.T.getFragmentStack().get(this.T.getFragmentStack().size() - 1)).onActivityResultFragment(i, i2, intent);
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.R.size() == 1) {
            super.onBackPressed();
        } else if (this.S.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.r0().V0()) {
            PhotoViewer.r0().A(true, false);
        } else {
            this.T.G();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        gm.v(this, configuration);
        gm.r3(getWindow());
        super.onConfigurationChanged(configuration);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        boolean z;
        org.telegram.messenger.a.v();
        requestWindowFeature(1);
        setTheme(2131755318);
        getWindow().setBackgroundDrawable(new x9((byte) 0));
        if (!gda.r.isEmpty() && !gda.z) {
            try {
                getWindow().setFlags(8192, 8192);
                gm.f2();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        super.onCreate(bundle);
        if (!gda.r.isEmpty() && gda.w) {
            gda.A = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = gm.a;
        cmb.S(this);
        cmb.J(this, false);
        ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
        this.T = actionBarLayout;
        actionBarLayout.setInBubbleMode(true);
        this.T.setRemoveActionBarExtraHeight(true);
        wr3 wr3Var = new wr3(this);
        this.U = wr3Var;
        setContentView(wr3Var, new ViewGroup.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.U.addView(relativeLayout, qoe.c(-1.0f, -1));
        relativeLayout.addView(this.T.getView(), qoe.w(-1, -1));
        this.U.setParentActionBarLayout(this.T);
        this.T.setDrawerLayoutContainer(this.U);
        this.T.setFragmentStack(this.R);
        this.T.setDelegate(this);
        by7 by7Var = new by7(this);
        this.S = by7Var;
        this.U.addView(by7Var, qoe.c(-1.0f, -1));
        nm7.e().k(nm7.o4, this);
        this.T.Z();
        Intent intent = getIntent();
        if (bundle != null) {
            z = true;
        } else {
            z = false;
        }
        z(intent, false, z, false, z8c.t0);
        b0 = this;
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        int i = this.P;
        if (i != -1) {
            lo7.l0.c(new vp2((jm7) lo7.n(j5.a(i).a), false, this.a0, (byte) 1));
            ConnectionsManager.getInstance(j5.a(this.P).a).setAppPaused(false, false);
        }
        if (!this.Q) {
            o1 o1Var = this.Z;
            if (o1Var != null) {
                gm.r(o1Var);
                this.Z = null;
            }
            this.Q = true;
            b0 = null;
        }
        b0 = null;
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        this.T.K();
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        z(intent, true, false, false, z8c.t0);
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.T.M();
        org.telegram.messenger.a.E = true;
        o1 o1Var = this.Z;
        if (o1Var != null) {
            gm.r(o1Var);
            this.Z = null;
        }
        if (!gda.r.isEmpty()) {
            gda.A = (int) (SystemClock.elapsedRealtime() / 1000);
            o1 o1Var2 = new o1(this, (byte) 10);
            this.Z = o1Var2;
            if (gda.w) {
                gm.d3(o1Var2, 1000L);
            } else {
                int i = gda.x;
                if (i != 0) {
                    gm.d3(o1Var2, (i * 1000) + 1000);
                }
            }
        } else {
            gda.A = 0;
        }
        gda.x();
        by7 by7Var = this.S;
        if (by7Var != null) {
            by7Var.k();
        }
        b0 = null;
    }

    @Override
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (!w(i, strArr, iArr)) {
            return;
        }
        if (!this.T.getFragmentStack().isEmpty()) {
            ((org.telegram.ui.ActionBar.d) this.T.getFragmentStack().get(this.T.getFragmentStack().size() - 1)).onRequestPermissionsResultFragment(i, strArr, iArr);
        }
        iic.h(iArr, i);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.T.N();
        org.telegram.messenger.a.E = false;
        o1 o1Var = this.Z;
        if (o1Var != null) {
            gm.r(o1Var);
            this.Z = null;
        }
        if (gm.n2(true)) {
            A();
        }
        if (gda.A != 0) {
            gda.A = 0;
            gda.x();
        }
        int visibility = this.S.getVisibility();
        ActionBarLayout actionBarLayout = this.T;
        if (visibility != 0) {
            actionBarLayout.N();
        } else {
            actionBarLayout.l();
            this.S.l();
        }
        b0 = this;
    }

    public final void z(Intent intent, boolean z, boolean z2, boolean z3, int i) {
        yv1 yv1Var;
        if (!z3 && (gm.n2(true) || gda.B)) {
            A();
            this.V = intent;
            this.W = z;
            this.Y = z2;
            this.X = i;
            z8c.h(i).u(false);
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", z8c.t0);
        this.P = intExtra;
        if (!z8c.q(intExtra)) {
            finish();
            return;
        }
        if (intent.getAction() != null && intent.getAction().startsWith("com.tmessages.openchat")) {
            long longExtra = intent.getLongExtra("chatId", 0L);
            long longExtra2 = intent.getLongExtra("userId", 0L);
            Bundle bundle = new Bundle();
            if (longExtra2 != 0) {
                this.a0 = longExtra2;
                bundle.putLong("user_id", longExtra2);
            } else {
                this.a0 = -longExtra;
                bundle.putLong("chat_id", longExtra);
            }
            yv1Var = new yv1(bundle);
            yv1Var.setInBubbleMode(true);
            yv1Var.setCurrentAccount(this.P);
        } else {
            yv1Var = null;
        }
        if (yv1Var == null) {
            finish();
            return;
        }
        nm7.f(this.P).k(nm7.s, Long.valueOf(this.a0));
        this.T.Z();
        this.T.b(-1, yv1Var);
        lo7.l0.c(new vp2((jm7) lo7.n(j5.a(this.P).a), true, this.a0, (byte) 1));
        ConnectionsManager.getInstance(j5.a(this.P).a).setAppPaused(false, false);
        this.T.e0();
    }

    @Override
    public final void a(float f) {
    }

    @Override
    public final void e(int[] iArr) {
    }

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z) {
    }
}
