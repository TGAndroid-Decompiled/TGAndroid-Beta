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
public class BubbleActivity extends tg0 implements qi5 {
    public static BubbleActivity b0;
    public boolean Q;
    public final ArrayList R = new ArrayList();
    public yv7 S;
    public ActionBarLayout T;
    public mq3 U;
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
        gba.w = true;
        if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
            SecretMediaViewer.d().c(false, false);
        } else if (PhotoViewer.C0() && PhotoViewer.r0().U0()) {
            PhotoViewer.r0().B(false, true);
        } else if (o.F() && o.u().W) {
            o.u().l(false, true);
        }
        this.S.m(false, -1, -1, null);
        gba.B = true;
        this.S.setDelegate(new sg0(this, (byte) 15));
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
                gl.r(o1Var);
                this.Z = null;
            }
            this.Q = true;
            b0 = null;
        }
        finish();
        return false;
    }

    @Override
    public final boolean l(ActionBarLayout actionBarLayout, ri5 ri5Var) {
        org.telegram.ui.ActionBar.d dVar = ri5Var.a;
        return true;
    }

    @Override
    public final void onActivityResult(int i, int i2, Intent intent) {
        gl2 gl2Var;
        super.onActivityResult(i, i2, intent);
        ThemeEditorView themeEditorView = ThemeEditorView.p;
        if (themeEditorView != null && (gl2Var = themeEditorView.m) != null) {
            gl2Var.F(i, i2, intent);
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
        } else if (PhotoViewer.r0().U0()) {
            PhotoViewer.r0().B(true, false);
        } else {
            this.T.G();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        gl.v(this, configuration);
        gl.s3(getWindow());
        super.onConfigurationChanged(configuration);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        boolean z;
        org.telegram.messenger.a.v();
        requestWindowFeature(1);
        setTheme(2131755318);
        getWindow().setBackgroundDrawable(new x9((byte) 0));
        if (!gba.r.isEmpty() && !gba.z) {
            try {
                getWindow().setFlags(8192, 8192);
                gl.f2();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        super.onCreate(bundle);
        if (!gba.r.isEmpty() && gba.w) {
            gba.A = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = gl.a;
        bkb.S(this);
        bkb.J(this, false);
        ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
        this.T = actionBarLayout;
        actionBarLayout.setInBubbleMode(true);
        this.T.setRemoveActionBarExtraHeight(true);
        mq3 mq3Var = new mq3(this);
        this.U = mq3Var;
        setContentView(mq3Var, new ViewGroup.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.U.addView(relativeLayout, nme.c(-1.0f, -1));
        relativeLayout.addView(this.T.getView(), nme.w(-1, -1));
        this.U.setParentActionBarLayout(this.T);
        this.T.setDrawerLayoutContainer(this.U);
        this.T.setFragmentStack(this.R);
        this.T.setDelegate(this);
        yv7 yv7Var = new yv7(this);
        this.S = yv7Var;
        this.U.addView(yv7Var, nme.c(-1.0f, -1));
        kk7.e().k(kk7.m4, this);
        this.T.Z();
        Intent intent = getIntent();
        if (bundle != null) {
            z = true;
        } else {
            z = false;
        }
        z(intent, false, z, false, y6c.t0);
        b0 = this;
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        int i = this.P;
        if (i != -1) {
            im7.l0.c(new ko2((gk7) im7.n(j5.a(i).a), false, this.a0, (byte) 1));
            ConnectionsManager.getInstance(j5.a(this.P).a).setAppPaused(false, false);
        }
        if (!this.Q) {
            o1 o1Var = this.Z;
            if (o1Var != null) {
                gl.r(o1Var);
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
        z(intent, true, false, false, y6c.t0);
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.T.M();
        org.telegram.messenger.a.E = true;
        o1 o1Var = this.Z;
        if (o1Var != null) {
            gl.r(o1Var);
            this.Z = null;
        }
        if (!gba.r.isEmpty()) {
            gba.A = (int) (SystemClock.elapsedRealtime() / 1000);
            o1 o1Var2 = new o1(this, (byte) 10);
            this.Z = o1Var2;
            if (gba.w) {
                gl.e3(o1Var2, 1000L);
            } else {
                int i = gba.x;
                if (i != 0) {
                    gl.e3(o1Var2, (i * 1000) + 1000);
                }
            }
        } else {
            gba.A = 0;
        }
        gba.x();
        yv7 yv7Var = this.S;
        if (yv7Var != null) {
            yv7Var.k();
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
        hgc.h(iArr, i);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.T.N();
        org.telegram.messenger.a.E = false;
        o1 o1Var = this.Z;
        if (o1Var != null) {
            gl.r(o1Var);
            this.Z = null;
        }
        if (gl.n2(true)) {
            A();
        }
        if (gba.A != 0) {
            gba.A = 0;
            gba.x();
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
        mu1 mu1Var;
        if (!z3 && (gl.n2(true) || gba.B)) {
            A();
            this.V = intent;
            this.W = z;
            this.Y = z2;
            this.X = i;
            y6c.h(i).u(false);
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", y6c.t0);
        this.P = intExtra;
        if (!y6c.q(intExtra)) {
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
            mu1Var = new mu1(bundle);
            mu1Var.setInBubbleMode(true);
            mu1Var.setCurrentAccount(this.P);
        } else {
            mu1Var = null;
        }
        if (mu1Var == null) {
            finish();
            return;
        }
        kk7.f(this.P).k(kk7.s, Long.valueOf(this.a0));
        this.T.Z();
        this.T.b(-1, mu1Var);
        im7.l0.c(new ko2((gk7) im7.n(j5.a(this.P).a), true, this.a0, (byte) 1));
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
