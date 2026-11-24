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
public class ExternalActionActivity extends Activity implements qi5 {
    public boolean a;
    public yv7 b;
    public ActionBarLayout c;
    public ActionBarLayout d;
    public cja e;
    public mq3 f;
    public Intent h;
    public boolean n;
    public int r;
    public boolean s;
    public boolean w;
    public ez3 x;
    public static final ArrayList y = new ArrayList();
    public static final ArrayList E = new ArrayList();

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z) {
        if (gl.O1() && actionBarLayout == this.d) {
            this.c.W(z, z);
        }
    }

    public final boolean c(Intent intent, boolean z, boolean z2, boolean z3, int i, int i2) {
        if (z3 || (!gl.n2(true) && !gba.B)) {
            return true;
        }
        i();
        this.h = intent;
        this.n = z;
        this.w = z2;
        this.r = i;
        this.s = i2;
        y6c.h(i).u(false);
        return false;
    }

    public void d(final Intent intent, final boolean z, final boolean z2, final boolean z3, final int i, int i2) {
        if (!c(intent, z, z2, z3, i, i2)) {
            return;
        }
        if ("org.telegram.passport.AUTHORIZE".equals(intent.getAction())) {
            if (i2 == 0) {
                int c = y6c.c();
                if (c == 0) {
                    this.h = intent;
                    this.n = z;
                    this.w = z2;
                    this.r = i;
                    this.s = i2;
                    mf6 mf6Var = new mf6();
                    if (gl.O1()) {
                        this.d.b(-1, mf6Var);
                    } else {
                        this.c.b(-1, mf6Var);
                    }
                    if (!gl.O1()) {
                        this.e.setVisibility(8);
                    }
                    this.c.e0();
                    if (gl.O1()) {
                        this.d.e0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    String M0 = k96.M0(2131689472, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    hdVar.U = k96.M0(2131747013, null);
                    b00.t(null, 2131747638, alertDialog$Builder, null);
                    return;
                } else if (c >= 2) {
                    hd i3 = ij.i(this, new ej() {
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
                            if (i4 != i6 && i4 != (i5 = y6c.t0)) {
                                ConnectionsManager.getInstance(i5).setAppPaused(true, false);
                                y6c.t0 = i4;
                                y6c.h(0).u(false);
                                if (!a.x) {
                                    ConnectionsManager.getInstance(y6c.t0).setAppPaused(false, false);
                                }
                            }
                            externalActionActivity.d(intent2, z4, z5, z6, i4, 1);
                        }
                    });
                    i3.show();
                    i3.setCanceledOnTouchOutside(false);
                    i3.setOnDismissListener(new n1(this, (byte) 19));
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
                hd hdVar2 = new hd(3, null, this);
                hdVar2.setOnCancelListener(new f74(i, iArr, (byte) 0));
                hdVar2.show();
                iArr[0] = ConnectionsManager.getInstance(i).sendRequest(getauthorizationform, new l81(this, iArr, i, hdVar2, getauthorizationform, stringExtra2, stringExtra, (byte) 1), 10);
                return;
            }
            finish();
            return;
        }
        if (gl.O1()) {
            if (this.d.getFragmentStack().isEmpty()) {
                this.d.b(-1, new r61());
            }
        } else if (this.c.getFragmentStack().isEmpty()) {
            this.c.b(-1, new r61());
        }
        if (!gl.O1()) {
            this.e.setVisibility(8);
        }
        this.c.e0();
        if (gl.O1()) {
            this.d.e0();
        }
        intent.setAction(null);
    }

    public final void f() {
        ActionBarLayout actionBarLayout;
        if (gl.O1() && (actionBarLayout = this.d) != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) actionBarLayout.getView().getLayoutParams();
            Point point = gl.q;
            layoutParams.leftMargin = (point.x - layoutParams.width) / 2;
            int i = gl.m;
            layoutParams.topMargin = (((point.y - layoutParams.height) - i) / 2) + i;
            this.d.getView().setLayoutParams(layoutParams);
            if (gl.N1() && getResources().getConfiguration().orientation != 2) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.c.getView().getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                this.c.getView().setLayoutParams(layoutParams2);
                return;
            }
            int i2 = (point.x / 100) * 35;
            if (i2 < gl.L(320.0f)) {
                i2 = gl.L(320.0f);
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.c.getView().getLayoutParams();
            layoutParams3.width = i2;
            layoutParams3.height = -1;
            this.c.getView().setLayoutParams(layoutParams3);
            if (gl.N1() && this.c.getFragmentStack().size() == 2) {
                ((org.telegram.ui.ActionBar.d) this.c.getFragmentStack().get(1)).onPause();
                this.c.getFragmentStack().remove(1);
                this.c.e0();
            }
        }
    }

    public final void g() {
        if (this.a) {
            return;
        }
        ez3 ez3Var = this.x;
        if (ez3Var != null) {
            gl.r(ez3Var);
            this.x = null;
        }
        this.a = true;
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.d dVar, ActionBarLayout actionBarLayout) {
        return true;
    }

    public final void i() {
        if (this.b == null) {
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
        this.b.m(false, -1, -1, null);
        gba.B = true;
        this.b.setDelegate(new kx3(this, (byte) 13));
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (gl.O1()) {
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
    public final boolean l(ActionBarLayout actionBarLayout, ri5 ri5Var) {
        org.telegram.ui.ActionBar.d dVar = ri5Var.a;
        return true;
    }

    @Override
    public final void onBackPressed() {
        ActionBarLayout actionBarLayout;
        if (this.b.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.r0().U0()) {
            PhotoViewer.r0().B(true, false);
        } else if (gl.O1() && (actionBarLayout = this.d) != null) {
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
        gl.v(this, configuration);
        gl.s3(getWindow());
        super.onConfigurationChanged(configuration);
        if (!gl.O1() || (actionBarLayout = this.c) == null) {
            return;
        }
        actionBarLayout.getView().getViewTreeObserver().addOnGlobalLayoutListener(new up(this, (byte) 3));
    }

    @Override
    public final void onCreate(Bundle bundle) {
        boolean z;
        int i;
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
        this.c = new ActionBarLayout(this, false);
        mq3 mq3Var = new mq3(this);
        this.f = mq3Var;
        setContentView(mq3Var, new ViewGroup.LayoutParams(-1, -1));
        if (gl.O1()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f.addView(relativeLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            g74 g74Var = new g74(this, null, (byte) 0);
            this.e = g74Var;
            g74Var.setOccupyStatusBar(false);
            this.e.U(bkb.r0());
            relativeLayout.addView(this.e, nme.w(-1, -1));
            relativeLayout.addView(this.c.getView(), nme.w(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(2130706432);
            relativeLayout.addView(frameLayout, nme.w(-1, -1));
            frameLayout.setOnTouchListener(new a7(this, (byte) 5));
            frameLayout.setOnClickListener(new x00((byte) 4));
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.d = actionBarLayout;
            actionBarLayout.setRemoveActionBarExtraHeight(true);
            this.d.setBackgroundView(frameLayout);
            this.d.setUseAlphaAnimations(true);
            this.d.getView().setBackgroundResource(2131230900);
            ViewGroup view = this.d.getView();
            if (gl.N1()) {
                i = 528;
            } else {
                i = 700;
            }
            relativeLayout.addView(view, nme.w(530, i));
            this.d.setFragmentStack(E);
            this.d.setDelegate(this);
            this.d.setDrawerLayoutContainer(this.f);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.f.addView(relativeLayout2, nme.c(-1.0f, -1));
            g74 g74Var2 = new g74(this, null, (byte) 1);
            this.e = g74Var2;
            g74Var2.setOccupyStatusBar(false);
            this.e.U(bkb.r0());
            relativeLayout2.addView(this.e, nme.w(-1, -1));
            relativeLayout2.addView(this.c.getView(), nme.w(-1, -1));
        }
        this.f.setParentActionBarLayout(this.c);
        this.c.setDrawerLayoutContainer(this.f);
        this.c.setFragmentStack(y);
        this.c.setDelegate(this);
        yv7 yv7Var = new yv7(this);
        this.b = yv7Var;
        this.f.addView(yv7Var, nme.c(-1.0f, -1));
        kk7.e().k(kk7.m4, this);
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
        d(intent, false, z, false, y6c.t0, 0);
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
        if (gl.O1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.K();
        }
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        d(intent, true, false, false, y6c.t0, 0);
    }

    @Override
    public final void onPause() {
        ActionBarLayout actionBarLayout;
        super.onPause();
        this.c.M();
        if (gl.O1() && (actionBarLayout = this.d) != null) {
            actionBarLayout.M();
        }
        org.telegram.messenger.a.E = true;
        ez3 ez3Var = this.x;
        if (ez3Var != null) {
            gl.r(ez3Var);
            this.x = null;
        }
        if (!gba.r.isEmpty()) {
            gba.A = (int) (SystemClock.elapsedRealtime() / 1000);
            ez3 ez3Var2 = new ez3(this, (byte) 1);
            this.x = ez3Var2;
            if (gba.w) {
                gl.e3(ez3Var2, 1000L);
            } else {
                int i = gba.x;
                if (i != 0) {
                    gl.e3(ez3Var2, (i * 1000) + 1000);
                }
            }
        } else {
            gba.A = 0;
        }
        gba.x();
        yv7 yv7Var = this.b;
        if (yv7Var != null) {
            yv7Var.k();
        }
    }

    @Override
    public final void onResume() {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        super.onResume();
        this.c.N();
        if (gl.O1() && (actionBarLayout3 = this.d) != null) {
            actionBarLayout3.N();
        }
        org.telegram.messenger.a.E = false;
        ez3 ez3Var = this.x;
        if (ez3Var != null) {
            gl.r(ez3Var);
            this.x = null;
        }
        if (gl.n2(true)) {
            i();
        }
        if (gba.A != 0) {
            gba.A = 0;
            gba.x();
        }
        int visibility = this.b.getVisibility();
        ActionBarLayout actionBarLayout4 = this.c;
        if (visibility != 0) {
            actionBarLayout4.N();
            if (gl.O1() && (actionBarLayout2 = this.d) != null) {
                actionBarLayout2.N();
                return;
            }
            return;
        }
        actionBarLayout4.l();
        if (gl.O1() && (actionBarLayout = this.d) != null) {
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
