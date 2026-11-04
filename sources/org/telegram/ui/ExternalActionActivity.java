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
    public boolean f41255a;
    public org.telegram.ui.Components.zb0 f41256b;
    public ActionBarLayout f41257c;
    public ActionBarLayout d;
    public org.telegram.ui.Components.qt0 f41258e;
    public org.telegram.ui.ActionBar.l3 f41259f;
    public Intent h;
    public boolean f41260n;
    public int f41261r;
    public int f41262s;
    public boolean f41263w;
    public o4 f41264x;
    public static final ArrayList f41254y = new ArrayList();
    public static final ArrayList E = new ArrayList();

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (org.telegram.messenger.g0.Q1() && actionBarLayout == this.d) {
            this.f41257c.X(z10, z10);
        }
    }

    public final boolean c(Intent intent, boolean z10, boolean z11, boolean z12, int i3, int i10) {
        if (z12 || (!org.telegram.messenger.g0.p2(true) && !org.telegram.messenger.az.C)) {
            return true;
        }
        i();
        this.h = intent;
        this.f41260n = z10;
        this.f41263w = z11;
        this.f41261r = i3;
        this.f41262s = i10;
        org.telegram.messenger.h10.i(i3).v(false);
        return false;
    }

    public void d(final Intent intent, final boolean z10, final boolean z11, final boolean z12, final int i3, int i10) {
        if (!c(intent, z10, z11, z12, i3, i10)) {
            return;
        }
        if ("org.telegram.passport.AUTHORIZE".equals(intent.getAction())) {
            if (i10 == 0) {
                int c2 = org.telegram.messenger.h10.c();
                if (c2 == 0) {
                    this.h = intent;
                    this.f41260n = z10;
                    this.f41263w = z11;
                    this.f41261r = i3;
                    this.f41262s = i10;
                    xd0 xd0Var = new xd0();
                    if (org.telegram.messenger.g0.Q1()) {
                        this.d.c(-1, xd0Var);
                    } else {
                        this.f41257c.c(-1, xd0Var);
                    }
                    if (!org.telegram.messenger.g0.Q1()) {
                        this.f41258e.setVisibility(8);
                    }
                    this.f41257c.f0();
                    if (org.telegram.messenger.g0.Q1()) {
                        this.d.f0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    String M0 = org.telegram.messenger.bd.M0(2131689472, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.S = M0;
                    s1Var.U = org.telegram.messenger.bd.M0(2131747214, null);
                    k2.p1.B(null, 2131747839, alertDialog$Builder, null);
                    return;
                } else if (c2 >= 2) {
                    org.telegram.ui.ActionBar.s1 i11 = org.telegram.ui.Components.t4.i(this, new org.telegram.ui.Components.p4() {
                        @Override
                        public final void a(int i12) {
                            int i13;
                            ExternalActionActivity externalActionActivity = ExternalActionActivity.this;
                            int i14 = i3;
                            Intent intent2 = intent;
                            boolean z13 = z10;
                            boolean z14 = z11;
                            boolean z15 = z12;
                            ArrayList arrayList = ExternalActionActivity.f41254y;
                            if (i12 != i14 && i12 != (i13 = org.telegram.messenger.h10.f22829t0)) {
                                ConnectionsManager.getInstance(i13).setAppPaused(true, false);
                                org.telegram.messenger.h10.f22829t0 = i12;
                                org.telegram.messenger.h10.i(0).v(false);
                                if (!org.telegram.messenger.t0.f25465x) {
                                    ConnectionsManager.getInstance(org.telegram.messenger.h10.f22829t0).setAppPaused(false, false);
                                }
                            }
                            externalActionActivity.d(intent2, z13, z14, z15, i12, 1);
                        }
                    });
                    i11.show();
                    i11.setCanceledOnTouchOutside(false);
                    i11.setOnDismissListener(new s5(this, 6));
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
                org.telegram.ui.ActionBar.s1 s1Var2 = new org.telegram.ui.ActionBar.s1(3, this, null);
                s1Var2.setOnCancelListener(new mx(i3, 0, iArr));
                s1Var2.show();
                iArr[0] = ConnectionsManager.getInstance(i3).sendRequest(getauthorizationform, new t8(this, iArr, i3, s1Var2, getauthorizationform, stringExtra2, stringExtra, 1), 10);
                return;
            }
            finish();
            return;
        }
        if (org.telegram.messenger.g0.Q1()) {
            if (this.d.getFragmentStack().isEmpty()) {
                this.d.c(-1, new z6());
            }
        } else if (this.f41257c.getFragmentStack().isEmpty()) {
            this.f41257c.c(-1, new z6());
        }
        if (!org.telegram.messenger.g0.Q1()) {
            this.f41258e.setVisibility(8);
        }
        this.f41257c.f0();
        if (org.telegram.messenger.g0.Q1()) {
            this.d.f0();
        }
        intent.setAction(null);
    }

    public final void f() {
        ActionBarLayout actionBarLayout;
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) actionBarLayout.getView().getLayoutParams();
            Point point = org.telegram.messenger.g0.f22608q;
            layoutParams.leftMargin = (point.x - layoutParams.width) / 2;
            int i3 = org.telegram.messenger.g0.f22602m;
            layoutParams.topMargin = (((point.y - layoutParams.height) - i3) / 2) + i3;
            this.d.getView().setLayoutParams(layoutParams);
            if (org.telegram.messenger.g0.P1() && getResources().getConfiguration().orientation != 2) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f41257c.getView().getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                this.f41257c.getView().setLayoutParams(layoutParams2);
                return;
            }
            int i10 = (point.x / 100) * 35;
            if (i10 < org.telegram.messenger.g0.L(320.0f)) {
                i10 = org.telegram.messenger.g0.L(320.0f);
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f41257c.getView().getLayoutParams();
            layoutParams3.width = i10;
            layoutParams3.height = -1;
            this.f41257c.getView().setLayoutParams(layoutParams3);
            if (org.telegram.messenger.g0.P1() && this.f41257c.getFragmentStack().size() == 2) {
                ((org.telegram.ui.ActionBar.d2) this.f41257c.getFragmentStack().get(1)).onPause();
                this.f41257c.getFragmentStack().remove(1);
                this.f41257c.f0();
            }
        }
    }

    public final void g() {
        if (this.f41255a) {
            return;
        }
        o4 o4Var = this.f41264x;
        if (o4Var != null) {
            org.telegram.messenger.g0.r(o4Var);
            this.f41264x = null;
        }
        this.f41255a = true;
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.d2 d2Var, ActionBarLayout actionBarLayout) {
        return true;
    }

    public final void i() {
        if (this.f41256b == null) {
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
        this.f41256b.m(false, -1, -1, null);
        org.telegram.messenger.az.C = true;
        this.f41256b.setDelegate(new ur(this, 10));
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (org.telegram.messenger.g0.Q1()) {
            if (actionBarLayout == this.f41257c && actionBarLayout.getFragmentStack().size() <= 1) {
                g();
                finish();
                return false;
            } else if (actionBarLayout == this.d && this.f41257c.getFragmentStack().isEmpty() && this.d.getFragmentStack().size() == 1) {
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
        org.telegram.ui.ActionBar.d2 d2Var = o4Var.f28395a;
        return true;
    }

    @Override
    public final void onBackPressed() {
        ActionBarLayout actionBarLayout;
        if (this.f41256b.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.v1().U1()) {
            PhotoViewer.v1().H0(true, false);
        } else if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            if (actionBarLayout.getView().getVisibility() == 0) {
                this.d.I();
            } else {
                this.f41257c.I();
            }
        } else {
            this.f41257c.I();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ActionBarLayout actionBarLayout;
        org.telegram.messenger.g0.v(this, configuration);
        org.telegram.messenger.g0.x3(getWindow());
        super.onConfigurationChanged(configuration);
        if (!org.telegram.messenger.g0.Q1() || (actionBarLayout = this.f41257c) == null) {
            return;
        }
        actionBarLayout.getView().getViewTreeObserver().addOnGlobalLayoutListener(new nx(this));
    }

    @Override
    public final void onCreate(Bundle bundle) {
        boolean z10;
        int i3;
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
        this.f41257c = new ActionBarLayout(this, false);
        org.telegram.ui.ActionBar.l3 l3Var = new org.telegram.ui.ActionBar.l3(this);
        this.f41259f = l3Var;
        setContentView(l3Var, new ViewGroup.LayoutParams(-1, -1));
        if (org.telegram.messenger.g0.Q1()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f41259f.addView(relativeLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            lg.m1 m1Var = new lg.m1(this, null, 2);
            this.f41258e = m1Var;
            m1Var.setOccupyStatusBar(false);
            this.f41258e.U(org.telegram.ui.ActionBar.k6.s0());
            relativeLayout.addView(this.f41258e, b8.mf.w(-1, -1));
            relativeLayout.addView(this.f41257c.getView(), b8.mf.w(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(2130706432);
            relativeLayout.addView(frameLayout, b8.mf.w(-1, -1));
            frameLayout.setOnTouchListener(new e0(this, 2));
            frameLayout.setOnClickListener(new ai.t(22));
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.d = actionBarLayout;
            actionBarLayout.setRemoveActionBarExtraHeight(true);
            this.d.setBackgroundView(frameLayout);
            this.d.setUseAlphaAnimations(true);
            this.d.getView().setBackgroundResource(2131230900);
            ViewGroup view = this.d.getView();
            if (org.telegram.messenger.g0.P1()) {
                i3 = 528;
            } else {
                i3 = 700;
            }
            relativeLayout.addView(view, b8.mf.w(530, i3));
            this.d.setFragmentStack(E);
            this.d.setDelegate(this);
            this.d.setDrawerLayoutContainer(this.f41259f);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.f41259f.addView(relativeLayout2, b8.mf.c(-1.0f, -1));
            lg.m1 m1Var2 = new lg.m1(this, null, 3);
            this.f41258e = m1Var2;
            m1Var2.setOccupyStatusBar(false);
            this.f41258e.U(org.telegram.ui.ActionBar.k6.s0());
            relativeLayout2.addView(this.f41258e, b8.mf.w(-1, -1));
            relativeLayout2.addView(this.f41257c.getView(), b8.mf.w(-1, -1));
        }
        this.f41259f.setParentActionBarLayout(this.f41257c);
        this.f41257c.setDrawerLayoutContainer(this.f41259f);
        this.f41257c.setFragmentStack(f41254y);
        this.f41257c.setDelegate(this);
        org.telegram.ui.Components.zb0 zb0Var = new org.telegram.ui.Components.zb0(this);
        this.f41256b = zb0Var;
        this.f41259f.addView(zb0Var, b8.mf.c(-1.0f, -1));
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23257k4, this);
        this.f41257c.a0();
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
        d(intent, false, z10, false, org.telegram.messenger.h10.f22829t0, 0);
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
        this.f41257c.M();
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.M();
        }
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        d(intent, true, false, false, org.telegram.messenger.h10.f22829t0, 0);
    }

    @Override
    public final void onPause() {
        ActionBarLayout actionBarLayout;
        super.onPause();
        this.f41257c.O();
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.O();
        }
        org.telegram.messenger.t0.E = true;
        o4 o4Var = this.f41264x;
        if (o4Var != null) {
            org.telegram.messenger.g0.r(o4Var);
            this.f41264x = null;
        }
        if (!org.telegram.messenger.az.f21661s.isEmpty()) {
            org.telegram.messenger.az.B = (int) (SystemClock.elapsedRealtime() / 1000);
            o4 o4Var2 = new o4(this, 4);
            this.f41264x = o4Var2;
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
        org.telegram.ui.Components.zb0 zb0Var = this.f41256b;
        if (zb0Var != null) {
            zb0Var.k();
        }
    }

    @Override
    public final void onResume() {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        super.onResume();
        this.f41257c.P();
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout3 = this.d) != null) {
            actionBarLayout3.P();
        }
        org.telegram.messenger.t0.E = false;
        o4 o4Var = this.f41264x;
        if (o4Var != null) {
            org.telegram.messenger.g0.r(o4Var);
            this.f41264x = null;
        }
        if (org.telegram.messenger.g0.p2(true)) {
            i();
        }
        if (org.telegram.messenger.az.B != 0) {
            org.telegram.messenger.az.B = 0;
            org.telegram.messenger.az.y();
        }
        if (this.f41256b.getVisibility() != 0) {
            this.f41257c.P();
            if (org.telegram.messenger.g0.Q1() && (actionBarLayout2 = this.d) != null) {
                actionBarLayout2.P();
                return;
            }
            return;
        }
        this.f41257c.n();
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.n();
        }
        this.f41256b.l();
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void e(int[] iArr) {
    }
}
