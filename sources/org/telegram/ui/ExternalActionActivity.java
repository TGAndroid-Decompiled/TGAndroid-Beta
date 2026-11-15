package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class ExternalActionActivity extends Activity implements org.telegram.ui.ActionBar.l4 {
    public boolean f42594a;
    public org.telegram.ui.Components.fc0 f42595b;
    public ActionBarLayout f42596c;
    public ActionBarLayout d;
    public org.telegram.ui.Components.st0 f42597e;
    public org.telegram.ui.ActionBar.l3 f42598f;
    public Intent h;
    public boolean f42599n;
    public int f42600r;
    public int f42601s;
    public boolean f42602w;
    public m4 f42603x;
    public static final ArrayList f42593y = new ArrayList();
    public static final ArrayList E = new ArrayList();

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (org.telegram.messenger.g0.Q1() && actionBarLayout == this.d) {
            this.f42596c.X(z10, z10);
        }
    }

    public final boolean c(Intent intent, boolean z10, boolean z11, boolean z12, int i7, int i10) {
        if (z12 || (!org.telegram.messenger.g0.p2(true) && !org.telegram.messenger.gz.C)) {
            return true;
        }
        i();
        this.h = intent;
        this.f42599n = z10;
        this.f42602w = z11;
        this.f42600r = i7;
        this.f42601s = i10;
        org.telegram.messenger.m10.i(i7).v(false);
        return false;
    }

    public void d(final Intent intent, final boolean z10, final boolean z11, final boolean z12, final int i7, int i10) {
        if (!c(intent, z10, z11, z12, i7, i10)) {
            return;
        }
        if ("org.telegram.passport.AUTHORIZE".equals(intent.getAction())) {
            if (i10 == 0) {
                int c10 = org.telegram.messenger.m10.c();
                if (c10 == 0) {
                    this.h = intent;
                    this.f42599n = z10;
                    this.f42602w = z11;
                    this.f42600r = i7;
                    this.f42601s = i10;
                    ce0 ce0Var = new ce0();
                    if (org.telegram.messenger.g0.Q1()) {
                        this.d.c(-1, ce0Var);
                    } else {
                        this.f42596c.c(-1, ce0Var);
                    }
                    if (!org.telegram.messenger.g0.Q1()) {
                        this.f42597e.setVisibility(8);
                    }
                    this.f42596c.f0();
                    if (org.telegram.messenger.g0.Q1()) {
                        this.d.f0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    String M0 = org.telegram.messenger.hd.M0(2131689472, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                    t1Var.S = M0;
                    t1Var.U = org.telegram.messenger.hd.M0(2131747206, null);
                    i5.c.C(null, 2131747831, alertDialog$Builder, null);
                    return;
                } else if (c10 >= 2) {
                    org.telegram.ui.ActionBar.t1 i11 = org.telegram.ui.Components.t4.i(this, new org.telegram.ui.Components.p4() {
                        @Override
                        public final void a(int i12) {
                            int i13;
                            ExternalActionActivity externalActionActivity = ExternalActionActivity.this;
                            int i14 = i7;
                            Intent intent2 = intent;
                            boolean z13 = z10;
                            boolean z14 = z11;
                            boolean z15 = z12;
                            ArrayList arrayList = ExternalActionActivity.f42593y;
                            if (i12 != i14 && i12 != (i13 = org.telegram.messenger.m10.f24934t0)) {
                                ConnectionsManager.getInstance(i13).setAppPaused(true, false);
                                org.telegram.messenger.m10.f24934t0 = i12;
                                org.telegram.messenger.m10.i(0).v(false);
                                if (!org.telegram.messenger.t0.f26608x) {
                                    ConnectionsManager.getInstance(org.telegram.messenger.m10.f24934t0).setAppPaused(false, false);
                                }
                            }
                            externalActionActivity.d(intent2, z13, z14, z15, i12, 1);
                        }
                    });
                    i11.show();
                    i11.setCanceledOnTouchOutside(false);
                    i11.setOnDismissListener(new q5(this, 6));
                    return;
                }
            }
            long longExtra = intent.getLongExtra("bot_id", intent.getIntExtra("bot_id", 0));
            String stringExtra = intent.getStringExtra("nonce");
            String stringExtra2 = intent.getStringExtra("payload");
            TL_account.getAuthorizationForm getauthorizationform = new TL_account.getAuthorizationForm();
            getauthorizationform.bot_id = longExtra;
            getauthorizationform.scope = intent.getStringExtra("scope");
            getauthorizationform.public_key = intent.getStringExtra("public_key");
            if (longExtra != 0 && ((!TextUtils.isEmpty(stringExtra2) || !TextUtils.isEmpty(stringExtra)) && !TextUtils.isEmpty(getauthorizationform.scope) && !TextUtils.isEmpty(getauthorizationform.public_key))) {
                int[] iArr = {0};
                org.telegram.ui.ActionBar.t1 t1Var2 = new org.telegram.ui.ActionBar.t1(3, this, null);
                t1Var2.setOnCancelListener(new qx(i7, 0, iArr));
                t1Var2.show();
                iArr[0] = ConnectionsManager.getInstance(i7).sendRequest(getauthorizationform, new t8(this, iArr, i7, t1Var2, getauthorizationform, stringExtra2, stringExtra, 1), 10);
                return;
            }
            finish();
            return;
        }
        if (org.telegram.messenger.g0.Q1()) {
            if (this.d.getFragmentStack().isEmpty()) {
                this.d.c(-1, new y6());
            }
        } else if (this.f42596c.getFragmentStack().isEmpty()) {
            this.f42596c.c(-1, new y6());
        }
        if (!org.telegram.messenger.g0.Q1()) {
            this.f42597e.setVisibility(8);
        }
        this.f42596c.f0();
        if (org.telegram.messenger.g0.Q1()) {
            this.d.f0();
        }
        intent.setAction(null);
    }

    public final void f() {
        ActionBarLayout actionBarLayout;
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) actionBarLayout.getView().getLayoutParams();
            Point point = org.telegram.messenger.g0.f23609q;
            layoutParams.leftMargin = (point.x - layoutParams.width) / 2;
            int i7 = org.telegram.messenger.g0.f23603m;
            layoutParams.topMargin = (((point.y - layoutParams.height) - i7) / 2) + i7;
            this.d.getView().setLayoutParams(layoutParams);
            if (org.telegram.messenger.g0.P1() && getResources().getConfiguration().orientation != 2) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f42596c.getView().getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                this.f42596c.getView().setLayoutParams(layoutParams2);
                return;
            }
            int i10 = (point.x / 100) * 35;
            if (i10 < org.telegram.messenger.g0.L(320.0f)) {
                i10 = org.telegram.messenger.g0.L(320.0f);
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f42596c.getView().getLayoutParams();
            layoutParams3.width = i10;
            layoutParams3.height = -1;
            this.f42596c.getView().setLayoutParams(layoutParams3);
            if (org.telegram.messenger.g0.P1() && this.f42596c.getFragmentStack().size() == 2) {
                ((org.telegram.ui.ActionBar.e2) this.f42596c.getFragmentStack().get(1)).onPause();
                this.f42596c.getFragmentStack().remove(1);
                this.f42596c.f0();
            }
        }
    }

    public final void g() {
        if (this.f42594a) {
            return;
        }
        m4 m4Var = this.f42603x;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.f42603x = null;
        }
        this.f42594a = true;
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.e2 e2Var, ActionBarLayout actionBarLayout) {
        return true;
    }

    public final void i() {
        if (this.f42595b == null) {
            return;
        }
        org.telegram.messenger.gz.f23992x = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f43308s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer.p1().z0(false, true);
        } else if (g4.G() && g4.v().W) {
            g4.v().m(false, true);
        }
        this.f42595b.m(false, -1, -1, null);
        org.telegram.messenger.gz.C = true;
        this.f42595b.setDelegate(new zr(this, 10));
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (org.telegram.messenger.g0.Q1()) {
            if (actionBarLayout == this.f42596c && actionBarLayout.getFragmentStack().size() <= 1) {
                g();
                finish();
                return false;
            } else if (actionBarLayout == this.d && this.f42596c.getFragmentStack().isEmpty() && this.d.getFragmentStack().size() == 1) {
                g();
                finish();
                return false;
            }
        } else if (actionBarLayout.getFragmentStack().size() <= 1) {
            g();
            finish();
            return false;
        }
        return true;
    }

    @Override
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.m4 m4Var) {
        org.telegram.ui.ActionBar.e2 e2Var = m4Var.f29382a;
        return true;
    }

    @Override
    public final void onBackPressed() {
        ActionBarLayout actionBarLayout;
        if (this.f42595b.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.p1().P1()) {
            PhotoViewer.p1().z0(true, false);
        } else if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            if (actionBarLayout.getView().getVisibility() == 0) {
                this.d.I();
            } else {
                this.f42596c.I();
            }
        } else {
            this.f42596c.I();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ActionBarLayout actionBarLayout;
        org.telegram.messenger.g0.v(this, configuration);
        org.telegram.messenger.g0.w3(getWindow());
        super.onConfigurationChanged(configuration);
        if (!org.telegram.messenger.g0.Q1() || (actionBarLayout = this.f42596c) == null) {
            return;
        }
        actionBarLayout.getView().getViewTreeObserver().addOnGlobalLayoutListener(new rx(this));
    }

    @Override
    public final void onCreate(Bundle bundle) {
        boolean z10;
        int i7;
        org.telegram.messenger.t0.w();
        requestWindowFeature(1);
        setTheme(2131755318);
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.q6(1));
        if (!org.telegram.messenger.gz.f23978s.isEmpty() && !org.telegram.messenger.gz.A) {
            try {
                getWindow().setFlags(8192, 8192);
                org.telegram.messenger.g0.h2();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        super.onCreate(bundle);
        if (!org.telegram.messenger.gz.f23978s.isEmpty() && org.telegram.messenger.gz.f23992x) {
            org.telegram.messenger.gz.B = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = org.telegram.messenger.g0.f23581a;
        org.telegram.ui.ActionBar.j6.T(this);
        org.telegram.ui.ActionBar.j6.K(this, false);
        this.f42596c = new ActionBarLayout(this, false);
        org.telegram.ui.ActionBar.l3 l3Var = new org.telegram.ui.ActionBar.l3(this);
        this.f42598f = l3Var;
        setContentView(l3Var, new ViewGroup.LayoutParams(-1, -1));
        if (org.telegram.messenger.g0.Q1()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f42598f.addView(relativeLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            kg.m1 m1Var = new kg.m1(this, null, 2);
            this.f42597e = m1Var;
            m1Var.setOccupyStatusBar(false);
            this.f42597e.U(org.telegram.ui.ActionBar.j6.s0());
            relativeLayout.addView(this.f42597e, c8.ja.w(-1, -1));
            relativeLayout.addView(this.f42596c.getView(), c8.ja.w(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(2130706432);
            relativeLayout.addView(frameLayout, c8.ja.w(-1, -1));
            frameLayout.setOnTouchListener(new c0(this, 2));
            frameLayout.setOnClickListener(new bi.o(19));
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.d = actionBarLayout;
            actionBarLayout.setRemoveActionBarExtraHeight(true);
            this.d.setBackgroundView(frameLayout);
            this.d.setUseAlphaAnimations(true);
            this.d.getView().setBackgroundResource(2131230900);
            ViewGroup view = this.d.getView();
            if (org.telegram.messenger.g0.P1()) {
                i7 = 528;
            } else {
                i7 = 700;
            }
            relativeLayout.addView(view, c8.ja.w(530, i7));
            this.d.setFragmentStack(E);
            this.d.setDelegate(this);
            this.d.setDrawerLayoutContainer(this.f42598f);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.f42598f.addView(relativeLayout2, c8.ja.c(-1.0f, -1));
            kg.m1 m1Var2 = new kg.m1(this, null, 3);
            this.f42597e = m1Var2;
            m1Var2.setOccupyStatusBar(false);
            this.f42597e.U(org.telegram.ui.ActionBar.j6.s0());
            relativeLayout2.addView(this.f42597e, c8.ja.w(-1, -1));
            relativeLayout2.addView(this.f42596c.getView(), c8.ja.w(-1, -1));
        }
        this.f42598f.setParentActionBarLayout(this.f42596c);
        this.f42596c.setDrawerLayoutContainer(this.f42598f);
        this.f42596c.setFragmentStack(f42593y);
        this.f42596c.setDelegate(this);
        org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(this);
        this.f42595b = fc0Var;
        this.f42598f.addView(fc0Var, c8.ja.c(-1.0f, -1));
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25525k4, this);
        this.f42596c.a0();
        ActionBarLayout actionBarLayout2 = this.d;
        if (actionBarLayout2 != null) {
            actionBarLayout2.a0();
        }
        Intent intent = getIntent();
        if (bundle != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d(intent, false, z10, false, org.telegram.messenger.m10.f24934t0, 0);
        f();
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        g();
    }

    @Override
    public final void onLowMemory() {
        ActionBarLayout actionBarLayout;
        super.onLowMemory();
        this.f42596c.M();
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.M();
        }
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        d(intent, true, false, false, org.telegram.messenger.m10.f24934t0, 0);
    }

    @Override
    public final void onPause() {
        ActionBarLayout actionBarLayout;
        super.onPause();
        this.f42596c.O();
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.O();
        }
        org.telegram.messenger.t0.E = true;
        m4 m4Var = this.f42603x;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.f42603x = null;
        }
        if (!org.telegram.messenger.gz.f23978s.isEmpty()) {
            org.telegram.messenger.gz.B = (int) (SystemClock.elapsedRealtime() / 1000);
            m4 m4Var2 = new m4(this, 4);
            this.f42603x = m4Var2;
            if (org.telegram.messenger.gz.f23992x) {
                org.telegram.messenger.g0.i3(m4Var2, 1000L);
            } else {
                int i7 = org.telegram.messenger.gz.f23995y;
                if (i7 != 0) {
                    org.telegram.messenger.g0.i3(m4Var2, (i7 * 1000) + 1000);
                }
            }
        } else {
            org.telegram.messenger.gz.B = 0;
        }
        org.telegram.messenger.gz.y();
        org.telegram.ui.Components.fc0 fc0Var = this.f42595b;
        if (fc0Var != null) {
            fc0Var.k();
        }
    }

    @Override
    public final void onResume() {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        super.onResume();
        this.f42596c.P();
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout3 = this.d) != null) {
            actionBarLayout3.P();
        }
        org.telegram.messenger.t0.E = false;
        m4 m4Var = this.f42603x;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.f42603x = null;
        }
        if (org.telegram.messenger.g0.p2(true)) {
            i();
        }
        if (org.telegram.messenger.gz.B != 0) {
            org.telegram.messenger.gz.B = 0;
            org.telegram.messenger.gz.y();
        }
        if (this.f42595b.getVisibility() != 0) {
            this.f42596c.P();
            if (org.telegram.messenger.g0.Q1() && (actionBarLayout2 = this.d) != null) {
                actionBarLayout2.P();
                return;
            }
            return;
        }
        this.f42596c.n();
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.n();
        }
        this.f42595b.l();
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void e(int[] iArr) {
    }
}
