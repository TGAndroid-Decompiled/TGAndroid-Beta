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
    public boolean f41233a;
    public org.telegram.ui.Components.fc0 f41234b;
    public ActionBarLayout f41235c;
    public ActionBarLayout d;
    public org.telegram.ui.Components.tt0 f41236e;
    public org.telegram.ui.ActionBar.n3 f41237f;
    public Intent h;
    public boolean f41238n;
    public int f41239r;
    public int f41240s;
    public boolean f41241w;
    public m4 f41242x;
    public static final ArrayList f41232y = new ArrayList();
    public static final ArrayList D = new ArrayList();

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z9) {
        if (org.telegram.messenger.g0.Q1() && actionBarLayout == this.d) {
            this.f41235c.X(z9, z9);
        }
    }

    public final boolean c(Intent intent, boolean z9, boolean z10, boolean z11, int i7, int i10) {
        if (z11 || (!org.telegram.messenger.g0.p2(true) && !org.telegram.messenger.iz.C)) {
            return true;
        }
        i();
        this.h = intent;
        this.f41238n = z9;
        this.f41241w = z10;
        this.f41239r = i7;
        this.f41240s = i10;
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
                    this.f41238n = z9;
                    this.f41241w = z10;
                    this.f41239r = i7;
                    this.f41240s = i10;
                    ee0 ee0Var = new ee0();
                    if (org.telegram.messenger.g0.Q1()) {
                        this.d.c(-1, ee0Var);
                    } else {
                        this.f41235c.c(-1, ee0Var);
                    }
                    if (!org.telegram.messenger.g0.Q1()) {
                        this.f41236e.setVisibility(8);
                    }
                    this.f41235c.f0();
                    if (org.telegram.messenger.g0.Q1()) {
                        this.d.f0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    String M0 = org.telegram.messenger.id.M0(2131689472, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.id.M0(2131747206, null);
                    jg.g.C(null, 2131747831, alertDialog$Builder, null);
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
                            ArrayList arrayList = ExternalActionActivity.f41232y;
                            if (i12 != i14 && i12 != (i13 = org.telegram.messenger.p10.f24470s0)) {
                                ConnectionsManager.getInstance(i13).setAppPaused(true, false);
                                org.telegram.messenger.p10.f24470s0 = i12;
                                org.telegram.messenger.p10.i(0).v(false);
                                if (!org.telegram.messenger.t0.f25574x) {
                                    ConnectionsManager.getInstance(org.telegram.messenger.p10.f24470s0).setAppPaused(false, false);
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
                u1Var2.setOnCancelListener(new rx(i7, 0, iArr));
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
        } else if (this.f41235c.getFragmentStack().isEmpty()) {
            this.f41235c.c(-1, new y6());
        }
        if (!org.telegram.messenger.g0.Q1()) {
            this.f41236e.setVisibility(8);
        }
        this.f41235c.f0();
        if (org.telegram.messenger.g0.Q1()) {
            this.d.f0();
        }
        intent.setAction(null);
    }

    public final void f() {
        ActionBarLayout actionBarLayout;
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) actionBarLayout.getView().getLayoutParams();
            Point point = org.telegram.messenger.g0.f22563q;
            layoutParams.leftMargin = (point.x - layoutParams.width) / 2;
            int i7 = org.telegram.messenger.g0.f22557m;
            layoutParams.topMargin = (((point.y - layoutParams.height) - i7) / 2) + i7;
            this.d.getView().setLayoutParams(layoutParams);
            if (org.telegram.messenger.g0.P1() && getResources().getConfiguration().orientation != 2) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f41235c.getView().getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                this.f41235c.getView().setLayoutParams(layoutParams2);
                return;
            }
            int i10 = (point.x / 100) * 35;
            if (i10 < org.telegram.messenger.g0.L(320.0f)) {
                i10 = org.telegram.messenger.g0.L(320.0f);
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f41235c.getView().getLayoutParams();
            layoutParams3.width = i10;
            layoutParams3.height = -1;
            this.f41235c.getView().setLayoutParams(layoutParams3);
            if (org.telegram.messenger.g0.P1() && this.f41235c.getFragmentStack().size() == 2) {
                ((org.telegram.ui.ActionBar.f2) this.f41235c.getFragmentStack().get(1)).onPause();
                this.f41235c.getFragmentStack().remove(1);
                this.f41235c.f0();
            }
        }
    }

    public final void g() {
        if (this.f41233a) {
            return;
        }
        m4 m4Var = this.f41242x;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.f41242x = null;
        }
        this.f41233a = true;
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.f2 f2Var, ActionBarLayout actionBarLayout) {
        return true;
    }

    public final void i() {
        if (this.f41234b == null) {
            return;
        }
        org.telegram.messenger.iz.f23448x = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f41944s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.A1() && PhotoViewer.p1().P1()) {
            PhotoViewer.p1().z0(false, true);
        } else if (g4.G() && g4.v().V) {
            g4.v().m(false, true);
        }
        this.f41234b.m(false, -1, -1, null);
        org.telegram.messenger.iz.C = true;
        this.f41234b.setDelegate(new yr(this, 10));
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (org.telegram.messenger.g0.Q1()) {
            if (actionBarLayout == this.f41235c && actionBarLayout.getFragmentStack().size() <= 1) {
                g();
                finish();
                return false;
            } else if (actionBarLayout == this.d && this.f41235c.getFragmentStack().isEmpty() && this.d.getFragmentStack().size() == 1) {
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
        org.telegram.ui.ActionBar.f2 f2Var = o4Var.f28342a;
        return true;
    }

    @Override
    public final void onBackPressed() {
        ActionBarLayout actionBarLayout;
        if (this.f41234b.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.p1().P1()) {
            PhotoViewer.p1().z0(true, false);
        } else if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            if (actionBarLayout.getView().getVisibility() == 0) {
                this.d.I();
            } else {
                this.f41235c.I();
            }
        } else {
            this.f41235c.I();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ActionBarLayout actionBarLayout;
        org.telegram.messenger.g0.v(this, configuration);
        org.telegram.messenger.g0.x3(getWindow());
        super.onConfigurationChanged(configuration);
        if (!org.telegram.messenger.g0.Q1() || (actionBarLayout = this.f41235c) == null) {
            return;
        }
        actionBarLayout.getView().getViewTreeObserver().addOnGlobalLayoutListener(new sx(this));
    }

    @Override
    public final void onCreate(Bundle bundle) {
        boolean z9;
        int i7;
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
        org.telegram.ui.ActionBar.l6.T(this);
        org.telegram.ui.ActionBar.l6.K(this, false);
        this.f41235c = new ActionBarLayout(this, false);
        org.telegram.ui.ActionBar.n3 n3Var = new org.telegram.ui.ActionBar.n3(this);
        this.f41237f = n3Var;
        setContentView(n3Var, new ViewGroup.LayoutParams(-1, -1));
        if (org.telegram.messenger.g0.Q1()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f41237f.addView(relativeLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            kg.l1 l1Var = new kg.l1(this, null, 2);
            this.f41236e = l1Var;
            l1Var.setOccupyStatusBar(false);
            this.f41236e.U(org.telegram.ui.ActionBar.l6.s0());
            relativeLayout.addView(this.f41236e, c8.ha.w(-1, -1));
            relativeLayout.addView(this.f41235c.getView(), c8.ha.w(-1, -1));
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
            this.d.setDrawerLayoutContainer(this.f41237f);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.f41237f.addView(relativeLayout2, c8.ha.c(-1.0f, -1));
            kg.l1 l1Var2 = new kg.l1(this, null, 3);
            this.f41236e = l1Var2;
            l1Var2.setOccupyStatusBar(false);
            this.f41236e.U(org.telegram.ui.ActionBar.l6.s0());
            relativeLayout2.addView(this.f41236e, c8.ha.w(-1, -1));
            relativeLayout2.addView(this.f41235c.getView(), c8.ha.w(-1, -1));
        }
        this.f41237f.setParentActionBarLayout(this.f41235c);
        this.f41235c.setDrawerLayoutContainer(this.f41237f);
        this.f41235c.setFragmentStack(f41232y);
        this.f41235c.setDelegate(this);
        org.telegram.ui.Components.fc0 fc0Var = new org.telegram.ui.Components.fc0(this);
        this.f41234b = fc0Var;
        this.f41237f.addView(fc0Var, c8.ha.c(-1.0f, -1));
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25029k4, this);
        this.f41235c.a0();
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
        d(intent, false, z9, false, org.telegram.messenger.p10.f24470s0, 0);
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
        this.f41235c.M();
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.M();
        }
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        d(intent, true, false, false, org.telegram.messenger.p10.f24470s0, 0);
    }

    @Override
    public final void onPause() {
        ActionBarLayout actionBarLayout;
        super.onPause();
        this.f41235c.O();
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.O();
        }
        org.telegram.messenger.t0.D = true;
        m4 m4Var = this.f41242x;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.f41242x = null;
        }
        if (!org.telegram.messenger.iz.f23434s.isEmpty()) {
            org.telegram.messenger.iz.B = (int) (SystemClock.elapsedRealtime() / 1000);
            m4 m4Var2 = new m4(this, 4);
            this.f41242x = m4Var2;
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
        org.telegram.ui.Components.fc0 fc0Var = this.f41234b;
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
        this.f41235c.P();
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout3 = this.d) != null) {
            actionBarLayout3.P();
        }
        org.telegram.messenger.t0.D = false;
        m4 m4Var = this.f41242x;
        if (m4Var != null) {
            org.telegram.messenger.g0.r(m4Var);
            this.f41242x = null;
        }
        if (org.telegram.messenger.g0.p2(true)) {
            i();
        }
        if (org.telegram.messenger.iz.B != 0) {
            org.telegram.messenger.iz.B = 0;
            org.telegram.messenger.iz.y();
        }
        if (this.f41234b.getVisibility() != 0) {
            this.f41235c.P();
            if (org.telegram.messenger.g0.Q1() && (actionBarLayout2 = this.d) != null) {
                actionBarLayout2.P();
                return;
            }
            return;
        }
        this.f41235c.n();
        if (org.telegram.messenger.g0.Q1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.n();
        }
        this.f41234b.l();
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void e(int[] iArr) {
    }
}
