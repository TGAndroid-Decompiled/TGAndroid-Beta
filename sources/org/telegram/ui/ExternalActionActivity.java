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
public class ExternalActionActivity extends Activity implements org.telegram.ui.ActionBar.v4 {
    public boolean f33322a;
    public org.telegram.ui.Components.zc0 f33323b;
    public ActionBarLayout f33324c;
    public ActionBarLayout d;
    public org.telegram.ui.Components.uu0 e;
    public org.telegram.ui.ActionBar.s3 f33325f;
    public Intent h;
    public boolean f33326n;
    public int f33327r;
    public int f33328s;
    public boolean f33329w;
    public m4 f33330x;
    public static final ArrayList f33321y = new ArrayList();
    public static final ArrayList D = new ArrayList();

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (org.telegram.messenger.i0.Q1() && actionBarLayout == this.d) {
            this.f33324c.W(z10, z10);
        }
    }

    public final boolean c(Intent intent, boolean z10, boolean z11, boolean z12, int i10, int i11) {
        if (z12 || (!org.telegram.messenger.i0.p2(true) && !org.telegram.messenger.tz.C)) {
            return true;
        }
        i();
        this.h = intent;
        this.f33326n = z10;
        this.f33329w = z11;
        this.f33327r = i10;
        this.f33328s = i11;
        org.telegram.messenger.d20.i(i10).v(false);
        return false;
    }

    public void d(final Intent intent, final boolean z10, final boolean z11, final boolean z12, final int i10, int i11) {
        if (!c(intent, z10, z11, z12, i10, i11)) {
            return;
        }
        if ("org.telegram.passport.AUTHORIZE".equals(intent.getAction())) {
            if (i11 == 0) {
                int c10 = org.telegram.messenger.d20.c();
                if (c10 == 0) {
                    this.h = intent;
                    this.f33326n = z10;
                    this.f33329w = z11;
                    this.f33327r = i10;
                    this.f33328s = i11;
                    hf0 hf0Var = new hf0();
                    if (org.telegram.messenger.i0.Q1()) {
                        this.d.c(-1, hf0Var);
                    } else {
                        this.f33324c.c(-1, hf0Var);
                    }
                    if (!org.telegram.messenger.i0.Q1()) {
                        this.e.setVisibility(8);
                    }
                    this.f33324c.e0();
                    if (org.telegram.messenger.i0.Q1()) {
                        this.d.e0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    String L0 = org.telegram.messenger.cd.L0(2131689472, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.R = L0;
                    x1Var.T = org.telegram.messenger.cd.L0(2131747221, null);
                    i0.a.w(null, 2131747847, alertDialog$Builder, null);
                    return;
                } else if (c10 >= 2) {
                    org.telegram.ui.ActionBar.x1 i12 = org.telegram.ui.Components.s4.i(this, new org.telegram.ui.Components.o4() {
                        @Override
                        public final void a(int i13) {
                            int i14;
                            ExternalActionActivity externalActionActivity = ExternalActionActivity.this;
                            int i15 = i10;
                            Intent intent2 = intent;
                            boolean z13 = z10;
                            boolean z14 = z11;
                            boolean z15 = z12;
                            ArrayList arrayList = ExternalActionActivity.f33321y;
                            if (i13 != i15 && i13 != (i14 = org.telegram.messenger.d20.f15147s0)) {
                                ConnectionsManager.getInstance(i14).setAppPaused(true, false);
                                org.telegram.messenger.d20.f15147s0 = i13;
                                org.telegram.messenger.d20.i(0).v(false);
                                if (!org.telegram.messenger.w0.f19032x) {
                                    ConnectionsManager.getInstance(org.telegram.messenger.d20.f15147s0).setAppPaused(false, false);
                                }
                            }
                            externalActionActivity.d(intent2, z13, z14, z15, i13, 1);
                        }
                    });
                    i12.show();
                    i12.setCanceledOnTouchOutside(false);
                    i12.setOnDismissListener(new q5(this, 6));
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
                org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, this, null);
                x1Var2.setOnCancelListener(new sy(i10, 0, iArr));
                x1Var2.show();
                iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getauthorizationform, new t8(this, iArr, i10, x1Var2, getauthorizationform, stringExtra2, stringExtra, 1), 10);
                return;
            }
            finish();
            return;
        }
        if (org.telegram.messenger.i0.Q1()) {
            if (this.d.getFragmentStack().isEmpty()) {
                this.d.c(-1, new y6());
            }
        } else if (this.f33324c.getFragmentStack().isEmpty()) {
            this.f33324c.c(-1, new y6());
        }
        if (!org.telegram.messenger.i0.Q1()) {
            this.e.setVisibility(8);
        }
        this.f33324c.e0();
        if (org.telegram.messenger.i0.Q1()) {
            this.d.e0();
        }
        intent.setAction(null);
    }

    public final void f() {
        ActionBarLayout actionBarLayout;
        if (org.telegram.messenger.i0.Q1() && (actionBarLayout = this.d) != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) actionBarLayout.getView().getLayoutParams();
            Point point = org.telegram.messenger.i0.f16026q;
            layoutParams.leftMargin = (point.x - layoutParams.width) / 2;
            int i10 = org.telegram.messenger.i0.f16020m;
            layoutParams.topMargin = (((point.y - layoutParams.height) - i10) / 2) + i10;
            this.d.getView().setLayoutParams(layoutParams);
            if (org.telegram.messenger.i0.P1() && getResources().getConfiguration().orientation != 2) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f33324c.getView().getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                this.f33324c.getView().setLayoutParams(layoutParams2);
                return;
            }
            int i11 = (point.x / 100) * 35;
            if (i11 < org.telegram.messenger.i0.L(320.0f)) {
                i11 = org.telegram.messenger.i0.L(320.0f);
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f33324c.getView().getLayoutParams();
            layoutParams3.width = i11;
            layoutParams3.height = -1;
            this.f33324c.getView().setLayoutParams(layoutParams3);
            if (org.telegram.messenger.i0.P1() && this.f33324c.getFragmentStack().size() == 2) {
                ((org.telegram.ui.ActionBar.k2) this.f33324c.getFragmentStack().get(1)).onPause();
                this.f33324c.getFragmentStack().remove(1);
                this.f33324c.e0();
            }
        }
    }

    public final void g() {
        if (this.f33322a) {
            return;
        }
        m4 m4Var = this.f33330x;
        if (m4Var != null) {
            org.telegram.messenger.i0.r(m4Var);
            this.f33330x = null;
        }
        this.f33322a = true;
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.k2 k2Var, ActionBarLayout actionBarLayout) {
        return true;
    }

    public final void i() {
        if (this.f33323b == null) {
            return;
        }
        org.telegram.messenger.tz.f18194x = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f34016s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.F1() && PhotoViewer.v1().U1()) {
            PhotoViewer.v1().H0(false, true);
        } else if (h4.G() && h4.v().V) {
            h4.v().m(false, true);
        }
        this.f33323b.m(false, -1, -1, null);
        org.telegram.messenger.tz.C = true;
        this.f33323b.setDelegate(new tt(this, 9));
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (org.telegram.messenger.i0.Q1()) {
            if (actionBarLayout == this.f33324c && actionBarLayout.getFragmentStack().size() <= 1) {
                g();
                finish();
                return false;
            } else if (actionBarLayout == this.d && this.f33324c.getFragmentStack().isEmpty() && this.d.getFragmentStack().size() == 1) {
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
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.w4 w4Var) {
        org.telegram.ui.ActionBar.k2 k2Var = w4Var.f21445a;
        return true;
    }

    @Override
    public final void onBackPressed() {
        ActionBarLayout actionBarLayout;
        if (this.f33323b.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.v1().U1()) {
            PhotoViewer.v1().H0(true, false);
        } else if (org.telegram.messenger.i0.Q1() && (actionBarLayout = this.d) != null) {
            if (actionBarLayout.getView().getVisibility() == 0) {
                this.d.H();
            } else {
                this.f33324c.H();
            }
        } else {
            this.f33324c.H();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ActionBarLayout actionBarLayout;
        org.telegram.messenger.i0.v(this, configuration);
        org.telegram.messenger.i0.w3(getWindow());
        super.onConfigurationChanged(configuration);
        if (!org.telegram.messenger.i0.Q1() || (actionBarLayout = this.f33324c) == null) {
            return;
        }
        actionBarLayout.getView().getViewTreeObserver().addOnGlobalLayoutListener(new ty(this));
    }

    @Override
    public final void onCreate(Bundle bundle) {
        boolean z10;
        int i10;
        org.telegram.messenger.w0.w();
        requestWindowFeature(1);
        setTheme(2131755318);
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.v6(1));
        if (!org.telegram.messenger.tz.f18180s.isEmpty() && !org.telegram.messenger.tz.A) {
            try {
                getWindow().setFlags(8192, 8192);
                org.telegram.messenger.i0.h2();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        super.onCreate(bundle);
        if (!org.telegram.messenger.tz.f18180s.isEmpty() && org.telegram.messenger.tz.f18194x) {
            org.telegram.messenger.tz.B = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = org.telegram.messenger.i0.f15999a;
        org.telegram.ui.ActionBar.t6.T(this);
        org.telegram.ui.ActionBar.t6.K(this, false);
        this.f33324c = new ActionBarLayout(this, false);
        org.telegram.ui.ActionBar.s3 s3Var = new org.telegram.ui.ActionBar.s3(this);
        this.f33325f = s3Var;
        setContentView(s3Var, new ViewGroup.LayoutParams(-1, -1));
        if (org.telegram.messenger.i0.Q1()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f33325f.addView(relativeLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            ag.t2 t2Var = new ag.t2(this, null, 2);
            this.e = t2Var;
            t2Var.setOccupyStatusBar(false);
            this.e.U(org.telegram.ui.ActionBar.t6.s0());
            relativeLayout.addView(this.e, w7.b6.w(-1, -1));
            relativeLayout.addView(this.f33324c.getView(), w7.b6.w(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(2130706432);
            relativeLayout.addView(frameLayout, w7.b6.w(-1, -1));
            frameLayout.setOnTouchListener(new d0(this, 2));
            frameLayout.setOnClickListener(new bh.c(14));
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.d = actionBarLayout;
            actionBarLayout.setRemoveActionBarExtraHeight(true);
            this.d.setBackgroundView(frameLayout);
            this.d.setUseAlphaAnimations(true);
            this.d.getView().setBackgroundResource(2131230900);
            ViewGroup view = this.d.getView();
            if (org.telegram.messenger.i0.P1()) {
                i10 = 528;
            } else {
                i10 = 700;
            }
            relativeLayout.addView(view, w7.b6.w(530, i10));
            this.d.setFragmentStack(D);
            this.d.setDelegate(this);
            this.d.setDrawerLayoutContainer(this.f33325f);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.f33325f.addView(relativeLayout2, w7.b6.c(-1.0f, -1));
            ag.t2 t2Var2 = new ag.t2(this, null, 3);
            this.e = t2Var2;
            t2Var2.setOccupyStatusBar(false);
            this.e.U(org.telegram.ui.ActionBar.t6.s0());
            relativeLayout2.addView(this.e, w7.b6.w(-1, -1));
            relativeLayout2.addView(this.f33324c.getView(), w7.b6.w(-1, -1));
        }
        this.f33325f.setParentActionBarLayout(this.f33324c);
        this.f33324c.setDrawerLayoutContainer(this.f33325f);
        this.f33324c.setFragmentStack(f33321y);
        this.f33324c.setDelegate(this);
        org.telegram.ui.Components.zc0 zc0Var = new org.telegram.ui.Components.zc0(this);
        this.f33323b = zc0Var;
        this.f33325f.addView(zc0Var, w7.b6.c(-1.0f, -1));
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19642k4, this);
        this.f33324c.Z();
        ActionBarLayout actionBarLayout2 = this.d;
        if (actionBarLayout2 != null) {
            actionBarLayout2.Z();
        }
        Intent intent = getIntent();
        if (bundle != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d(intent, false, z10, false, org.telegram.messenger.d20.f15147s0, 0);
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
        this.f33324c.L();
        if (org.telegram.messenger.i0.Q1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.L();
        }
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        d(intent, true, false, false, org.telegram.messenger.d20.f15147s0, 0);
    }

    @Override
    public final void onPause() {
        ActionBarLayout actionBarLayout;
        super.onPause();
        this.f33324c.N();
        if (org.telegram.messenger.i0.Q1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.N();
        }
        org.telegram.messenger.w0.D = true;
        m4 m4Var = this.f33330x;
        if (m4Var != null) {
            org.telegram.messenger.i0.r(m4Var);
            this.f33330x = null;
        }
        if (!org.telegram.messenger.tz.f18180s.isEmpty()) {
            org.telegram.messenger.tz.B = (int) (SystemClock.elapsedRealtime() / 1000);
            m4 m4Var2 = new m4(this, 4);
            this.f33330x = m4Var2;
            if (org.telegram.messenger.tz.f18194x) {
                org.telegram.messenger.i0.h3(m4Var2, 1000L);
            } else {
                int i10 = org.telegram.messenger.tz.f18197y;
                if (i10 != 0) {
                    org.telegram.messenger.i0.h3(m4Var2, (i10 * 1000) + 1000);
                }
            }
        } else {
            org.telegram.messenger.tz.B = 0;
        }
        org.telegram.messenger.tz.y();
        org.telegram.ui.Components.zc0 zc0Var = this.f33323b;
        if (zc0Var != null) {
            zc0Var.k();
        }
    }

    @Override
    public final void onResume() {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        super.onResume();
        this.f33324c.O();
        if (org.telegram.messenger.i0.Q1() && (actionBarLayout3 = this.d) != null) {
            actionBarLayout3.O();
        }
        org.telegram.messenger.w0.D = false;
        m4 m4Var = this.f33330x;
        if (m4Var != null) {
            org.telegram.messenger.i0.r(m4Var);
            this.f33330x = null;
        }
        if (org.telegram.messenger.i0.p2(true)) {
            i();
        }
        if (org.telegram.messenger.tz.B != 0) {
            org.telegram.messenger.tz.B = 0;
            org.telegram.messenger.tz.y();
        }
        if (this.f33323b.getVisibility() != 0) {
            this.f33324c.O();
            if (org.telegram.messenger.i0.Q1() && (actionBarLayout2 = this.d) != null) {
                actionBarLayout2.O();
                return;
            }
            return;
        }
        this.f33324c.n();
        if (org.telegram.messenger.i0.Q1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.n();
        }
        this.f33323b.l();
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void e(int[] iArr) {
    }
}
