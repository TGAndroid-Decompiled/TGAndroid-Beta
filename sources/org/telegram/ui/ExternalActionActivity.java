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
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ExternalActionActivity;
public class ExternalActionActivity extends Activity implements sk5 {
    public boolean a;
    public fz7 b;
    public ActionBarLayout c;
    public ActionBarLayout d;
    public wma e;
    public dr3 f;
    public Intent h;
    public boolean n;
    public int r;
    public boolean s;
    public boolean w;
    public zz3 x;
    public static final ArrayList y = new ArrayList();
    public static final ArrayList E = new ArrayList();

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z) {
        if (hl.O1() && actionBarLayout == this.d) {
            this.c.W(z, z);
        }
    }

    public final boolean c(Intent intent, boolean z, boolean z2, boolean z3, int i, int i2) {
        if (z3 || (!hl.n2(true) && !xea.B)) {
            return true;
        }
        i();
        this.h = intent;
        this.n = z;
        this.w = z2;
        this.r = i;
        this.s = i2;
        yac.h(i).u(false);
        return false;
    }

    public void d(final Intent intent, final boolean z, final boolean z2, final boolean z3, final int i, int i2) {
        if (!c(intent, z, z2, z3, i, i2)) {
            return;
        }
        if ("org.telegram.passport.AUTHORIZE".equals(intent.getAction())) {
            if (i2 == 0) {
                int c = yac.c();
                if (c == 0) {
                    this.h = intent;
                    this.n = z;
                    this.w = z2;
                    this.r = i;
                    this.s = i2;
                    qh6 qh6Var = new qh6();
                    if (hl.O1()) {
                        this.d.b(-1, qh6Var);
                    } else {
                        this.c.b(-1, qh6Var);
                    }
                    if (!hl.O1()) {
                        this.e.setVisibility(8);
                    }
                    this.c.e0();
                    if (hl.O1()) {
                        this.d.e0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    String M0 = ob6.M0(2131689472, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M0;
                    idVar.U = ob6.M0(2131746933, null);
                    c00.u(null, 2131747558, alertDialog$Builder, null);
                    return;
                } else if (c >= 2) {
                    id i3 = jj.i(this, new fj() {
                        @Override
                        public final void a(int i4) {
                            int i5;
                            ExternalActionActivity externalActionActivity = ExternalActionActivity.this;
                            int i6 = i;
                            Intent intent2 = intent;
                            boolean z4 = z;
                            boolean z5 = z2;
                            boolean z6 = z3;
                            ArrayList arrayList = ExternalActionActivity.y;
                            if (i4 != i6 && i4 != (i5 = yac.t0)) {
                                ConnectionsManager.getInstance(i5).setAppPaused(true, false);
                                yac.t0 = i4;
                                yac.h(0).u(false);
                                if (!a.x) {
                                    ConnectionsManager.getInstance(yac.t0).setAppPaused(false, false);
                                }
                            }
                            externalActionActivity.d(intent2, z4, z5, z6, i4, 1);
                        }
                    });
                    i3.show();
                    i3.setCanceledOnTouchOutside(false);
                    i3.setOnDismissListener(new o1(this, (byte) 19));
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
                id idVar2 = new id(3, null, this);
                idVar2.setOnCancelListener(new z74((byte) 0, i, iArr));
                idVar2.show();
                iArr[0] = ConnectionsManager.getInstance(i).sendRequest(getauthorizationform, new u81(this, iArr, i, idVar2, getauthorizationform, stringExtra2, stringExtra, (byte) 1), 10);
                return;
            }
            finish();
            return;
        }
        if (hl.O1()) {
            if (this.d.getFragmentStack().isEmpty()) {
                this.d.b(-1, new z61());
            }
        } else if (this.c.getFragmentStack().isEmpty()) {
            this.c.b(-1, new z61());
        }
        if (!hl.O1()) {
            this.e.setVisibility(8);
        }
        this.c.e0();
        if (hl.O1()) {
            this.d.e0();
        }
        intent.setAction(null);
    }

    public final void f() {
        ActionBarLayout actionBarLayout;
        if (hl.O1() && (actionBarLayout = this.d) != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) actionBarLayout.getView().getLayoutParams();
            Point point = hl.q;
            layoutParams.leftMargin = (point.x - layoutParams.width) / 2;
            int i = hl.m;
            layoutParams.topMargin = (((point.y - layoutParams.height) - i) / 2) + i;
            this.d.getView().setLayoutParams(layoutParams);
            if (hl.N1() && getResources().getConfiguration().orientation != 2) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.c.getView().getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                this.c.getView().setLayoutParams(layoutParams2);
                return;
            }
            int i2 = (point.x / 100) * 35;
            if (i2 < hl.L(320.0f)) {
                i2 = hl.L(320.0f);
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.c.getView().getLayoutParams();
            layoutParams3.width = i2;
            layoutParams3.height = -1;
            this.c.getView().setLayoutParams(layoutParams3);
            if (hl.N1() && this.c.getFragmentStack().size() == 2) {
                ((org.telegram.ui.ActionBar.e) this.c.getFragmentStack().get(1)).onPause();
                this.c.getFragmentStack().remove(1);
                this.c.e0();
            }
        }
    }

    public final void g() {
        if (this.a) {
            return;
        }
        zz3 zz3Var = this.x;
        if (zz3Var != null) {
            hl.r(zz3Var);
            this.x = null;
        }
        this.a = true;
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.e eVar, ActionBarLayout actionBarLayout) {
        return true;
    }

    public final void i() {
        if (this.b == null) {
            return;
        }
        xea.w = true;
        if (SecretMediaViewer.e() && SecretMediaViewer.d().s) {
            SecretMediaViewer.d().c(false, false);
        } else if (PhotoViewer.C0() && PhotoViewer.q0().V0()) {
            PhotoViewer.q0().A(false, true);
        } else if (o.F() && o.u().W) {
            o.u().l(false, true);
        }
        this.b.m(false, -1, -1, null);
        xea.B = true;
        this.b.setDelegate(new lu3(this, (byte) 15));
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (hl.O1()) {
            if (actionBarLayout == this.c && actionBarLayout.getFragmentStack().size() <= 1) {
                g();
                finish();
                return false;
            } else if (actionBarLayout == this.d && this.c.getFragmentStack().isEmpty() && this.d.getFragmentStack().size() == 1) {
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
    public final boolean l(ActionBarLayout actionBarLayout, tk5 tk5Var) {
        org.telegram.ui.ActionBar.e eVar = tk5Var.a;
        return true;
    }

    @Override
    public final void onBackPressed() {
        ActionBarLayout actionBarLayout;
        if (this.b.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.q0().V0()) {
            PhotoViewer.q0().A(true, false);
        } else if (hl.O1() && (actionBarLayout = this.d) != null) {
            if (actionBarLayout.getView().getVisibility() == 0) {
                this.d.G();
            } else {
                this.c.G();
            }
        } else {
            this.c.G();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ActionBarLayout actionBarLayout;
        hl.v(this, configuration);
        hl.r3(getWindow());
        super.onConfigurationChanged(configuration);
        if (!hl.O1() || (actionBarLayout = this.c) == null) {
            return;
        }
        actionBarLayout.getView().getViewTreeObserver().addOnGlobalLayoutListener(new vp(this, (byte) 3));
    }

    @Override
    public final void onCreate(Bundle bundle) {
        boolean z;
        int i;
        org.telegram.messenger.a.v();
        requestWindowFeature(1);
        setTheme(2131755318);
        getWindow().setBackgroundDrawable(new y9((byte) 0));
        if (!xea.r.isEmpty() && !xea.z) {
            try {
                getWindow().setFlags(8192, 8192);
                hl.f2();
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        super.onCreate(bundle);
        if (!xea.r.isEmpty() && xea.w) {
            xea.A = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        Typeface typeface = hl.a;
        aob.S(this);
        aob.J(this, false);
        this.c = new ActionBarLayout(this, false);
        dr3 dr3Var = new dr3(this);
        this.f = dr3Var;
        setContentView(dr3Var, new ViewGroup.LayoutParams(-1, -1));
        if (hl.O1()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f.addView(relativeLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            b84 b84Var = new b84(this, null, (byte) 0);
            this.e = b84Var;
            b84Var.setOccupyStatusBar(false);
            this.e.U(aob.r0());
            relativeLayout.addView(this.e, tre.w(-1, -1));
            relativeLayout.addView(this.c.getView(), tre.w(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(2130706432);
            relativeLayout.addView(frameLayout, tre.w(-1, -1));
            frameLayout.setOnTouchListener(new b7(this, (byte) 5));
            frameLayout.setOnClickListener(new y00((byte) 4));
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.d = actionBarLayout;
            actionBarLayout.setRemoveActionBarExtraHeight(true);
            this.d.setBackgroundView(frameLayout);
            this.d.setUseAlphaAnimations(true);
            this.d.getView().setBackgroundResource(2131230900);
            ViewGroup view = this.d.getView();
            if (hl.N1()) {
                i = 528;
            } else {
                i = 700;
            }
            relativeLayout.addView(view, tre.w(530, i));
            this.d.setFragmentStack(E);
            this.d.setDelegate(this);
            this.d.setDrawerLayoutContainer(this.f);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.f.addView(relativeLayout2, tre.c(-1.0f, -1));
            b84 b84Var2 = new b84(this, null, (byte) 1);
            this.e = b84Var2;
            b84Var2.setOccupyStatusBar(false);
            this.e.U(aob.r0());
            relativeLayout2.addView(this.e, tre.w(-1, -1));
            relativeLayout2.addView(this.c.getView(), tre.w(-1, -1));
        }
        this.f.setParentActionBarLayout(this.c);
        this.c.setDrawerLayoutContainer(this.f);
        this.c.setFragmentStack(y);
        this.c.setDelegate(this);
        fz7 fz7Var = new fz7(this);
        this.b = fz7Var;
        this.f.addView(fz7Var, tre.c(-1.0f, -1));
        jn7.e().k(jn7.n4, this);
        this.c.Z();
        ActionBarLayout actionBarLayout2 = this.d;
        if (actionBarLayout2 != null) {
            actionBarLayout2.Z();
        }
        Intent intent = getIntent();
        if (bundle != null) {
            z = true;
        } else {
            z = false;
        }
        d(intent, false, z, false, yac.t0, 0);
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
        this.c.K();
        if (hl.O1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.K();
        }
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        d(intent, true, false, false, yac.t0, 0);
    }

    @Override
    public final void onPause() {
        ActionBarLayout actionBarLayout;
        super.onPause();
        this.c.M();
        if (hl.O1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.M();
        }
        org.telegram.messenger.a.E = true;
        zz3 zz3Var = this.x;
        if (zz3Var != null) {
            hl.r(zz3Var);
            this.x = null;
        }
        if (!xea.r.isEmpty()) {
            xea.A = (int) (SystemClock.elapsedRealtime() / 1000);
            zz3 zz3Var2 = new zz3(this, (byte) 1);
            this.x = zz3Var2;
            if (xea.w) {
                hl.d3(zz3Var2, 1000L);
            } else {
                int i = xea.x;
                if (i != 0) {
                    hl.d3(zz3Var2, (i * 1000) + 1000);
                }
            }
        } else {
            xea.A = 0;
        }
        xea.x();
        fz7 fz7Var = this.b;
        if (fz7Var != null) {
            fz7Var.k();
        }
    }

    @Override
    public final void onResume() {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        super.onResume();
        this.c.N();
        if (hl.O1() && (actionBarLayout3 = this.d) != null) {
            actionBarLayout3.N();
        }
        org.telegram.messenger.a.E = false;
        zz3 zz3Var = this.x;
        if (zz3Var != null) {
            hl.r(zz3Var);
            this.x = null;
        }
        if (hl.n2(true)) {
            i();
        }
        if (xea.A != 0) {
            xea.A = 0;
            xea.x();
        }
        int visibility = this.b.getVisibility();
        ActionBarLayout actionBarLayout4 = this.c;
        if (visibility != 0) {
            actionBarLayout4.N();
            if (hl.O1() && (actionBarLayout2 = this.d) != null) {
                actionBarLayout2.N();
                return;
            }
            return;
        }
        actionBarLayout4.l();
        if (hl.O1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.l();
        }
        this.b.l();
    }

    @Override
    public final void a(float f) {
    }

    @Override
    public final void e(int[] iArr) {
    }
}
