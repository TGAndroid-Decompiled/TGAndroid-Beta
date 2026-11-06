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
public class ExternalActionActivity extends Activity implements org.telegram.ui.ActionBar.n4 {
    public boolean f41198a;
    public org.telegram.ui.Components.ec0 f41199b;
    public ActionBarLayout f41200c;
    public ActionBarLayout d;
    public org.telegram.ui.Components.rt0 f41201e;
    public org.telegram.ui.ActionBar.n3 f41202f;
    public Intent h;
    public boolean f41203n;
    public int f41204r;
    public int f41205s;
    public boolean f41206w;
    public m4 f41207x;
    public static final ArrayList f41197y = new ArrayList();
    public static final ArrayList D = new ArrayList();

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z9) {
        if (org.telegram.messenger.g0.Q1() && actionBarLayout == this.d) {
            this.f41200c.X(z9, z9);
        }
    }

    public final boolean c(Intent intent, boolean z9, boolean z10, boolean z11, int i7, int i10) {
        if (z11 || (!org.telegram.messenger.g0.p2(true) && !org.telegram.messenger.iz.C)) {
            return true;
        }
        i();
        this.h = intent;
        this.f41203n = z9;
        this.f41206w = z10;
        this.f41204r = i7;
        this.f41205s = i10;
        org.telegram.messenger.p10.i(i7).v(false);
        return false;
    }

    public void d(final Intent intent, final boolean z9, final boolean z10, final boolean z11, final int i7, int i10) {
        if (!c(intent, z9, z10, z11, i7, i10)) {
            return;
        }
        if ("org.telegram.passport.AUTHORIZE".equals(intent.getAction())) {
            if (i10 == 0) {
                int c10 = org.telegram.messenger.p10.c();
                if (c10 == 0) {
                    this.h = intent;
                    this.f41203n = z9;
                    this.f41206w = z10;
                    this.f41204r = i7;
                    this.f41205s = i10;
                    ce0 ce0Var = new ce0();
                    if (org.telegram.messenger.g0.Q1()) {
                        this.d.c(-1, ce0Var);
                    } else {
                        this.f41200c.c(-1, ce0Var);
                    }
                    if (!org.telegram.messenger.g0.Q1()) {
                        this.f41201e.setVisibility(8);
                    }
                    this.f41200c.f0();
                    if (org.telegram.messenger.g0.Q1()) {
                        this.d.f0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    String M0 = org.telegram.messenger.hd.M0(2131689472, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.hd.M0(2131747205, null);
                    jg.g.C(null, 2131747830, alertDialog$Builder, null);
                    return;
                } else if (c10 >= 2) {
                    org.telegram.ui.ActionBar.u1 i11 = org.telegram.ui.Components.v4.i(this, new org.telegram.ui.Components.r4() {
                        @Override
                        public final void a(int i12) {
                            int i13;
                            ExternalActionActivity externalActionActivity = ExternalActionActivity.this;
                            int i14 = i7;
                            Intent intent2 = intent;
                            boolean z12 = z9;
                            boolean z13 = z10;
                            boolean z14 = z11;
                            ArrayList arrayList = ExternalActionActivity.f41197y;
                            if (i12 != i14 && i12 != (i13 = org.telegram.messenger.p10.f24459s0)) {
                                ConnectionsManager.getInstance(i13).setAppPaused(true, false);
                                org.telegram.messenger.p10.f24459s0 = i12;
                                org.telegram.messenger.p10.i(0).v(false);
                                if (!org.telegram.messenger.t0.f25563x) {
                                    ConnectionsManager.getInstance(org.telegram.messenger.p10.f24459s0).setAppPaused(false, false);
                                }
                            }
                            externalActionActivity.d(intent2, z12, z13, z14, i12, 1);
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
                org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, this, null);
                u1Var2.setOnCancelListener(new px(i7, 0, iArr));
                u1Var2.show();
                iArr[0] = ConnectionsManager.getInstance(i7).sendRequest(getauthorizationform, new t8(this, iArr, i7, u1Var2, getauthorizationform, stringExtra2, stringExtra, 1), 10);
                return;
            }
            finish();
            return;
        }
        if (org.telegram.messenger.g0.Q1()) {
            if (this.d.getFragmentStack().isEmpty()) {
                this.d.c(-1, new y6());
            }
        } else if (this.f41200c.getFragmentStack().isEmpty()) {
            this.f41200c.c(-1, new y6());
        }
        if (!org.telegram.messenger.g0.Q1()) {
            this.f41201e.setVisibility(8);
        }
        this.f41200c.f0();
        if (org.telegram.messenger.g0.Q1()) {
            this.d.f0();
        }
        intent.setAction(null);
    }

    public final void f() {
        ActionBarLayout actionBarLayout;
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) actionBarLayout.getView().getLayoutParams();
            Point point = org.telegram.messenger.g0.f22537q;
            layoutParams.leftMargin = (point.x - layoutParams.width) / 2;
            int i7 = org.telegram.messenger.g0.f22531m;
            layoutParams.topMargin = (((point.y - layoutParams.height) - i7) / 2) + i7;
            this.d.getView().setLayoutParams(layoutParams);
            if (org.telegram.messenger.g0.P1() && getResources().getConfiguration().orientation != 2) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f41200c.getView().getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                this.f41200c.getView().setLayoutParams(layoutParams2);
                return;
            }
            int i10 = (point.x / 100) * 35;
            if (i10 < org.telegram.messenger.g0.L(320.0f)) {
                i10 = org.telegram.messenger.g0.L(320.0f);
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f41200c.getView().getLayoutParams();
            layoutParams3.width = i10;
            layoutParams3.height = -1;
            this.f41200c.getView().setLayoutParams(layoutParams3);
            if (org.telegram.messenger.g0.P1() && this.f41200c.getFragmentStack().size() == 2) {
                ((org.telegram.ui.ActionBar.f2) this.f41200c.getFragmentStack().get(1)).onPause();
                this.f41200c.getFragmentStack().remove(1);
                this.f41200c.f0();
            }
        }
    }

    public final void g() {
        if (this.f41198a) {
            return;
        }
        m4 m4Var = this.f41207x;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.f41207x = null;
        }
        this.f41198a = true;
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.f2 f2Var, ActionBarLayout actionBarLayout) {
        return true;
    }

    public final void i() {
        if (this.f41199b == null) {
            return;
        }
        org.telegram.messenger.iz.f23420x = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f41909s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer.p1().z0(false, true);
        } else if (g4.G() && g4.v().V) {
            g4.v().m(false, true);
        }
        this.f41199b.m(false, -1, -1, null);
        org.telegram.messenger.iz.C = true;
        this.f41199b.setDelegate(new wr(this, 10));
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (org.telegram.messenger.g0.Q1()) {
            if (actionBarLayout == this.f41200c && actionBarLayout.getFragmentStack().size() <= 1) {
                g();
                finish();
                return false;
            } else if (actionBarLayout == this.d && this.f41200c.getFragmentStack().isEmpty() && this.d.getFragmentStack().size() == 1) {
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
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.o4 o4Var) {
        org.telegram.ui.ActionBar.f2 f2Var = o4Var.f28338a;
        return true;
    }

    @Override
    public final void onBackPressed() {
        ActionBarLayout actionBarLayout;
        if (this.f41199b.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.p1().P1()) {
            PhotoViewer.p1().z0(true, false);
        } else if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            if (actionBarLayout.getView().getVisibility() == 0) {
                this.d.I();
            } else {
                this.f41200c.I();
            }
        } else {
            this.f41200c.I();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ActionBarLayout actionBarLayout;
        org.telegram.messenger.g0.v(this, configuration);
        org.telegram.messenger.g0.x3(getWindow());
        super.onConfigurationChanged(configuration);
        if (!org.telegram.messenger.g0.Q1() || (actionBarLayout = this.f41200c) == null) {
            return;
        }
        actionBarLayout.getView().getViewTreeObserver().addOnGlobalLayoutListener(new qx(this));
    }

    @Override
    public final void onCreate(Bundle bundle) {
        boolean z9;
        int i7;
        org.telegram.messenger.t0.w();
        requestWindowFeature(1);
        setTheme(2131755318);
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.r6(1));
        if (!org.telegram.messenger.iz.f23406s.isEmpty() && !org.telegram.messenger.iz.A) {
            try {
                getWindow().setFlags(8192, 8192);
                org.telegram.messenger.g0.h2();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        super.onCreate(bundle);
        if (!org.telegram.messenger.iz.f23406s.isEmpty() && org.telegram.messenger.iz.f23420x) {
            org.telegram.messenger.iz.B = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = org.telegram.messenger.g0.f22509a;
        org.telegram.ui.ActionBar.k6.T(this);
        org.telegram.ui.ActionBar.k6.K(this, false);
        this.f41200c = new ActionBarLayout(this, false);
        org.telegram.ui.ActionBar.n3 n3Var = new org.telegram.ui.ActionBar.n3(this);
        this.f41202f = n3Var;
        setContentView(n3Var, new ViewGroup.LayoutParams(-1, -1));
        if (org.telegram.messenger.g0.Q1()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f41202f.addView(relativeLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            kg.l1 l1Var = new kg.l1(this, null, 2);
            this.f41201e = l1Var;
            l1Var.setOccupyStatusBar(false);
            this.f41201e.U(org.telegram.ui.ActionBar.k6.s0());
            relativeLayout.addView(this.f41201e, c8.ha.w(-1, -1));
            relativeLayout.addView(this.f41200c.getView(), c8.ha.w(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(2130706432);
            relativeLayout.addView(frameLayout, c8.ha.w(-1, -1));
            frameLayout.setOnTouchListener(new d0(this, 2));
            frameLayout.setOnClickListener(new bi.l1(16));
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
            relativeLayout.addView(view, c8.ha.w(530, i7));
            this.d.setFragmentStack(D);
            this.d.setDelegate(this);
            this.d.setDrawerLayoutContainer(this.f41202f);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.f41202f.addView(relativeLayout2, c8.ha.c(-1.0f, -1));
            kg.l1 l1Var2 = new kg.l1(this, null, 3);
            this.f41201e = l1Var2;
            l1Var2.setOccupyStatusBar(false);
            this.f41201e.U(org.telegram.ui.ActionBar.k6.s0());
            relativeLayout2.addView(this.f41201e, c8.ha.w(-1, -1));
            relativeLayout2.addView(this.f41200c.getView(), c8.ha.w(-1, -1));
        }
        this.f41202f.setParentActionBarLayout(this.f41200c);
        this.f41200c.setDrawerLayoutContainer(this.f41202f);
        this.f41200c.setFragmentStack(f41197y);
        this.f41200c.setDelegate(this);
        org.telegram.ui.Components.ec0 ec0Var = new org.telegram.ui.Components.ec0(this);
        this.f41199b = ec0Var;
        this.f41202f.addView(ec0Var, c8.ha.c(-1.0f, -1));
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25012k4, this);
        this.f41200c.a0();
        ActionBarLayout actionBarLayout2 = this.d;
        if (actionBarLayout2 != null) {
            actionBarLayout2.a0();
        }
        Intent intent = getIntent();
        if (bundle != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        d(intent, false, z9, false, org.telegram.messenger.p10.f24459s0, 0);
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
        this.f41200c.M();
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.M();
        }
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        d(intent, true, false, false, org.telegram.messenger.p10.f24459s0, 0);
    }

    @Override
    public final void onPause() {
        ActionBarLayout actionBarLayout;
        super.onPause();
        this.f41200c.O();
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.O();
        }
        org.telegram.messenger.t0.D = true;
        m4 m4Var = this.f41207x;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.f41207x = null;
        }
        if (!org.telegram.messenger.iz.f23406s.isEmpty()) {
            org.telegram.messenger.iz.B = (int) (SystemClock.elapsedRealtime() / 1000);
            m4 m4Var2 = new m4(this, 4);
            this.f41207x = m4Var2;
            if (org.telegram.messenger.iz.f23420x) {
                org.telegram.messenger.g0.i3(m4Var2, 1000L);
            } else {
                int i7 = org.telegram.messenger.iz.f23423y;
                if (i7 != 0) {
                    org.telegram.messenger.g0.i3(m4Var2, (i7 * 1000) + 1000);
                }
            }
        } else {
            org.telegram.messenger.iz.B = 0;
        }
        org.telegram.messenger.iz.y();
        org.telegram.ui.Components.ec0 ec0Var = this.f41199b;
        if (ec0Var != null) {
            ec0Var.k();
        }
    }

    @Override
    public final void onResume() {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        super.onResume();
        this.f41200c.P();
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout3 = this.d) != null) {
            actionBarLayout3.P();
        }
        org.telegram.messenger.t0.D = false;
        m4 m4Var = this.f41207x;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.f41207x = null;
        }
        if (org.telegram.messenger.g0.p2(true)) {
            i();
        }
        if (org.telegram.messenger.iz.B != 0) {
            org.telegram.messenger.iz.B = 0;
            org.telegram.messenger.iz.y();
        }
        if (this.f41199b.getVisibility() != 0) {
            this.f41200c.P();
            if (org.telegram.messenger.g0.Q1() && (actionBarLayout2 = this.d) != null) {
                actionBarLayout2.P();
                return;
            }
            return;
        }
        this.f41200c.n();
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.n();
        }
        this.f41199b.l();
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void e(int[] iArr) {
    }
}
