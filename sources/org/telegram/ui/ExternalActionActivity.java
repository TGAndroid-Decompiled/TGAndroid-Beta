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
public class ExternalActionActivity extends Activity implements org.telegram.ui.ActionBar.p4 {
    public boolean f43039a;
    public org.telegram.ui.Components.pc0 f43040b;
    public ActionBarLayout f43041c;
    public ActionBarLayout d;
    public org.telegram.ui.Components.au0 f43042e;
    public org.telegram.ui.ActionBar.p3 f43043f;
    public Intent h;
    public boolean f43044n;
    public int f43045r;
    public int f43046s;
    public boolean f43047w;
    public m4 f43048x;
    public static final ArrayList f43038y = new ArrayList();
    public static final ArrayList E = new ArrayList();

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (org.telegram.messenger.g0.Q1() && actionBarLayout == this.d) {
            this.f43041c.X(z10, z10);
        }
    }

    @Override
    public final boolean c(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.h2 h2Var) {
        return true;
    }

    public final boolean d(Intent intent, boolean z10, boolean z11, boolean z12, int i7, int i10) {
        if (z12 || (!org.telegram.messenger.g0.p2(true) && !org.telegram.messenger.bz.C)) {
            return true;
        }
        i();
        this.h = intent;
        this.f43044n = z10;
        this.f43047w = z11;
        this.f43045r = i7;
        this.f43046s = i10;
        org.telegram.messenger.j10.i(i7).v(false);
        return false;
    }

    public void e(final Intent intent, final boolean z10, final boolean z11, final boolean z12, final int i7, int i10) {
        if (!d(intent, z10, z11, z12, i7, i10)) {
            return;
        }
        if ("org.telegram.passport.AUTHORIZE".equals(intent.getAction())) {
            if (i10 == 0) {
                int c10 = org.telegram.messenger.j10.c();
                if (c10 == 0) {
                    this.h = intent;
                    this.f43044n = z10;
                    this.f43047w = z11;
                    this.f43045r = i7;
                    this.f43046s = i10;
                    ee0 ee0Var = new ee0();
                    if (org.telegram.messenger.g0.Q1()) {
                        this.d.c(-1, ee0Var);
                    } else {
                        this.f43041c.c(-1, ee0Var);
                    }
                    if (!org.telegram.messenger.g0.Q1()) {
                        this.f43042e.setVisibility(8);
                    }
                    this.f43041c.f0();
                    if (org.telegram.messenger.g0.Q1()) {
                        this.d.f0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    String M0 = org.telegram.messenger.gd.M0(2131689472, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                    u1Var.S = M0;
                    u1Var.U = org.telegram.messenger.gd.M0(2131747013, null);
                    org.telegram.messenger.f3.m(null, 2131747638, alertDialog$Builder, null);
                    return;
                } else if (c10 >= 2) {
                    org.telegram.ui.ActionBar.u1 i11 = org.telegram.ui.Components.b5.i(this, new org.telegram.ui.Components.x4() {
                        @Override
                        public final void a(int i12) {
                            int i13;
                            ExternalActionActivity externalActionActivity = ExternalActionActivity.this;
                            int i14 = i7;
                            Intent intent2 = intent;
                            boolean z13 = z10;
                            boolean z14 = z11;
                            boolean z15 = z12;
                            ArrayList arrayList = ExternalActionActivity.f43038y;
                            if (i12 != i14 && i12 != (i13 = org.telegram.messenger.j10.f24770t0)) {
                                ConnectionsManager.getInstance(i13).setAppPaused(true, false);
                                org.telegram.messenger.j10.f24770t0 = i12;
                                org.telegram.messenger.j10.i(0).v(false);
                                if (!org.telegram.messenger.t0.f26921x) {
                                    ConnectionsManager.getInstance(org.telegram.messenger.j10.f24770t0).setAppPaused(false, false);
                                }
                            }
                            externalActionActivity.e(intent2, z13, z14, z15, i12, 1);
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
                u1Var2.setOnCancelListener(new tx(i7, 0, iArr));
                u1Var2.show();
                iArr[0] = ConnectionsManager.getInstance(i7).sendRequest(getauthorizationform, new t8(this, iArr, i7, u1Var2, getauthorizationform, stringExtra2, stringExtra, 1), 10);
                return;
            }
            finish();
            return;
        }
        if (org.telegram.messenger.g0.Q1()) {
            if (this.d.getFragmentStack().isEmpty()) {
                this.d.c(-1, new x6());
            }
        } else if (this.f43041c.getFragmentStack().isEmpty()) {
            this.f43041c.c(-1, new x6());
        }
        if (!org.telegram.messenger.g0.Q1()) {
            this.f43042e.setVisibility(8);
        }
        this.f43041c.f0();
        if (org.telegram.messenger.g0.Q1()) {
            this.d.f0();
        }
        intent.setAction(null);
    }

    public final void g() {
        ActionBarLayout actionBarLayout;
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) actionBarLayout.getView().getLayoutParams();
            Point point = org.telegram.messenger.g0.f24118q;
            layoutParams.leftMargin = (point.x - layoutParams.width) / 2;
            int i7 = org.telegram.messenger.g0.f24112m;
            layoutParams.topMargin = (((point.y - layoutParams.height) - i7) / 2) + i7;
            this.d.getView().setLayoutParams(layoutParams);
            if (org.telegram.messenger.g0.P1() && getResources().getConfiguration().orientation != 2) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f43041c.getView().getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                this.f43041c.getView().setLayoutParams(layoutParams2);
                return;
            }
            int i10 = (point.x / 100) * 35;
            if (i10 < org.telegram.messenger.g0.L(320.0f)) {
                i10 = org.telegram.messenger.g0.L(320.0f);
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f43041c.getView().getLayoutParams();
            layoutParams3.width = i10;
            layoutParams3.height = -1;
            this.f43041c.getView().setLayoutParams(layoutParams3);
            if (org.telegram.messenger.g0.P1() && this.f43041c.getFragmentStack().size() == 2) {
                ((org.telegram.ui.ActionBar.h2) this.f43041c.getFragmentStack().get(1)).onPause();
                this.f43041c.getFragmentStack().remove(1);
                this.f43041c.f0();
            }
        }
    }

    public final void h() {
        if (this.f43039a) {
            return;
        }
        m4 m4Var = this.f43048x;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.f43048x = null;
        }
        this.f43039a = true;
    }

    public final void i() {
        if (this.f43040b == null) {
            return;
        }
        org.telegram.messenger.bz.f23208x = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f43754s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer.p1().z0(false, true);
        } else if (g4.G() && g4.v().W) {
            g4.v().m(false, true);
        }
        this.f43040b.m(false, -1, -1, null);
        org.telegram.messenger.bz.C = true;
        this.f43040b.setDelegate(new zr(this, 10));
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (org.telegram.messenger.g0.Q1()) {
            if (actionBarLayout == this.f43041c && actionBarLayout.getFragmentStack().size() <= 1) {
                h();
                finish();
                return false;
            } else if (actionBarLayout == this.d && this.f43041c.getFragmentStack().isEmpty() && this.d.getFragmentStack().size() == 1) {
                h();
                finish();
                return false;
            }
        } else if (actionBarLayout.getFragmentStack().size() <= 1) {
            h();
            finish();
            return false;
        }
        return true;
    }

    @Override
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.q4 q4Var) {
        org.telegram.ui.ActionBar.h2 h2Var = q4Var.f29901a;
        return true;
    }

    @Override
    public final void onBackPressed() {
        ActionBarLayout actionBarLayout;
        if (this.f43040b.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.p1().P1()) {
            PhotoViewer.p1().z0(true, false);
        } else if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            if (actionBarLayout.getView().getVisibility() == 0) {
                this.d.I();
            } else {
                this.f43041c.I();
            }
        } else {
            this.f43041c.I();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ActionBarLayout actionBarLayout;
        org.telegram.messenger.g0.v(this, configuration);
        org.telegram.messenger.g0.v3(getWindow());
        super.onConfigurationChanged(configuration);
        if (!org.telegram.messenger.g0.Q1() || (actionBarLayout = this.f43041c) == null) {
            return;
        }
        actionBarLayout.getView().getViewTreeObserver().addOnGlobalLayoutListener(new ux(this));
    }

    @Override
    public final void onCreate(Bundle bundle) {
        boolean z10;
        int i7;
        org.telegram.messenger.t0.w();
        requestWindowFeature(1);
        setTheme(2131755318);
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.s6(1));
        if (!org.telegram.messenger.bz.f23194s.isEmpty() && !org.telegram.messenger.bz.A) {
            try {
                getWindow().setFlags(8192, 8192);
                org.telegram.messenger.g0.h2();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        super.onCreate(bundle);
        if (!org.telegram.messenger.bz.f23194s.isEmpty() && org.telegram.messenger.bz.f23208x) {
            org.telegram.messenger.bz.B = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = org.telegram.messenger.g0.f24090a;
        org.telegram.ui.ActionBar.n6.T(this);
        org.telegram.ui.ActionBar.n6.K(this, false);
        this.f43041c = new ActionBarLayout(this, false);
        org.telegram.ui.ActionBar.p3 p3Var = new org.telegram.ui.ActionBar.p3(this);
        this.f43043f = p3Var;
        setContentView(p3Var, new ViewGroup.LayoutParams(-1, -1));
        if (org.telegram.messenger.g0.Q1()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f43043f.addView(relativeLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            kg.o1 o1Var = new kg.o1(this, null, 2);
            this.f43042e = o1Var;
            o1Var.setOccupyStatusBar(false);
            this.f43042e.U(org.telegram.ui.ActionBar.n6.s0());
            relativeLayout.addView(this.f43042e, c8.ma.w(-1, -1));
            relativeLayout.addView(this.f43041c.getView(), c8.ma.w(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(2130706432);
            relativeLayout.addView(frameLayout, c8.ma.w(-1, -1));
            frameLayout.setOnTouchListener(new d0(this, 2));
            frameLayout.setOnClickListener(new bi.o(21));
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
            relativeLayout.addView(view, c8.ma.w(530, i7));
            this.d.setFragmentStack(E);
            this.d.setDelegate(this);
            this.d.setDrawerLayoutContainer(this.f43043f);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.f43043f.addView(relativeLayout2, c8.ma.c(-1.0f, -1));
            kg.o1 o1Var2 = new kg.o1(this, null, 3);
            this.f43042e = o1Var2;
            o1Var2.setOccupyStatusBar(false);
            this.f43042e.U(org.telegram.ui.ActionBar.n6.s0());
            relativeLayout2.addView(this.f43042e, c8.ma.w(-1, -1));
            relativeLayout2.addView(this.f43041c.getView(), c8.ma.w(-1, -1));
        }
        this.f43043f.setParentActionBarLayout(this.f43041c);
        this.f43041c.setDrawerLayoutContainer(this.f43043f);
        this.f43041c.setFragmentStack(f43038y);
        this.f43041c.setDelegate(this);
        org.telegram.ui.Components.pc0 pc0Var = new org.telegram.ui.Components.pc0(this);
        this.f43040b = pc0Var;
        this.f43043f.addView(pc0Var, c8.ma.c(-1.0f, -1));
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25158n4, this);
        this.f43041c.a0();
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
        e(intent, false, z10, false, org.telegram.messenger.j10.f24770t0, 0);
        g();
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        h();
    }

    @Override
    public final void onLowMemory() {
        ActionBarLayout actionBarLayout;
        super.onLowMemory();
        this.f43041c.M();
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.M();
        }
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        e(intent, true, false, false, org.telegram.messenger.j10.f24770t0, 0);
    }

    @Override
    public final void onPause() {
        ActionBarLayout actionBarLayout;
        super.onPause();
        this.f43041c.O();
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.O();
        }
        org.telegram.messenger.t0.E = true;
        m4 m4Var = this.f43048x;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.f43048x = null;
        }
        if (!org.telegram.messenger.bz.f23194s.isEmpty()) {
            org.telegram.messenger.bz.B = (int) (SystemClock.elapsedRealtime() / 1000);
            m4 m4Var2 = new m4(this, 4);
            this.f43048x = m4Var2;
            if (org.telegram.messenger.bz.f23208x) {
                org.telegram.messenger.g0.h3(m4Var2, 1000L);
            } else {
                int i7 = org.telegram.messenger.bz.f23211y;
                if (i7 != 0) {
                    org.telegram.messenger.g0.h3(m4Var2, (i7 * 1000) + 1000);
                }
            }
        } else {
            org.telegram.messenger.bz.B = 0;
        }
        org.telegram.messenger.bz.y();
        org.telegram.ui.Components.pc0 pc0Var = this.f43040b;
        if (pc0Var != null) {
            pc0Var.k();
        }
    }

    @Override
    public final void onResume() {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        super.onResume();
        this.f43041c.P();
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout3 = this.d) != null) {
            actionBarLayout3.P();
        }
        org.telegram.messenger.t0.E = false;
        m4 m4Var = this.f43048x;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.f43048x = null;
        }
        if (org.telegram.messenger.g0.p2(true)) {
            i();
        }
        if (org.telegram.messenger.bz.B != 0) {
            org.telegram.messenger.bz.B = 0;
            org.telegram.messenger.bz.y();
        }
        if (this.f43040b.getVisibility() != 0) {
            this.f43041c.P();
            if (org.telegram.messenger.g0.Q1() && (actionBarLayout2 = this.d) != null) {
                actionBarLayout2.P();
                return;
            }
            return;
        }
        this.f43041c.n();
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.n();
        }
        this.f43040b.l();
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void f(int[] iArr) {
    }
}
