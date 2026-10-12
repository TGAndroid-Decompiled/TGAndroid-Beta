package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class ExternalActionActivity extends Activity implements org.telegram.ui.ActionBar.y4 {
    public static final ArrayList f32078x = new ArrayList();
    public static final ArrayList f32079y = new ArrayList();
    public boolean f32080a;
    public org.telegram.ui.Components.re0 f32081b;
    public ActionBarLayout f32082c;
    public ActionBarLayout d;
    public org.telegram.ui.Components.ow0 e;
    public org.telegram.ui.ActionBar.x3 f32083f;
    public Intent h;
    public boolean f32084n;
    public int f32085r;
    public int f32086s;
    public boolean v;
    public a6 f32087w;

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (AndroidUtilities.isTablet() && actionBarLayout == this.d) {
            this.f32082c.U(z10, z10);
        }
    }

    public final boolean c(Intent intent, boolean z10, boolean z11, boolean z12, int i10, int i11) {
        if (z12 || (!AndroidUtilities.needShowPasscode(true) && !SharedConfig.isWaitingForPasscodeEnter)) {
            return true;
        }
        i();
        this.h = intent;
        this.f32084n = z10;
        this.v = z11;
        this.f32085r = i10;
        this.f32086s = i11;
        UserConfig.getInstance(i10).saveConfig(false);
        return false;
    }

    public void d(final Intent intent, final boolean z10, final boolean z11, final boolean z12, final int i10, int i11) {
        if (!c(intent, z10, z11, z12, i10, i11)) {
            return;
        }
        if ("org.telegram.passport.AUTHORIZE".equals(intent.getAction())) {
            if (i11 == 0) {
                int activatedAccountsCount = UserConfig.getActivatedAccountsCount();
                if (activatedAccountsCount == 0) {
                    this.h = intent;
                    this.f32084n = z10;
                    this.v = z11;
                    this.f32085r = i10;
                    this.f32086s = i11;
                    bh0 bh0Var = new bh0();
                    if (AndroidUtilities.isTablet()) {
                        this.d.c(-1, bh0Var);
                    } else {
                        this.f32082c.c(-1, bh0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        this.e.setVisibility(8);
                    }
                    this.f32082c.c0();
                    if (AndroidUtilities.isTablet()) {
                        this.d.c0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.PleaseLoginPassport);
                    org.telegram.messenger.q.A(R.string.OK, alertDialog$Builder, null);
                    return;
                } else if (activatedAccountsCount >= 2) {
                    org.telegram.ui.ActionBar.a2 h = org.telegram.ui.Components.g5.h(this, new org.telegram.ui.Components.d5() {
                        @Override
                        public final void a(int i12) {
                            int i13;
                            ExternalActionActivity externalActionActivity = ExternalActionActivity.this;
                            int i14 = i10;
                            Intent intent2 = intent;
                            boolean z13 = z10;
                            boolean z14 = z11;
                            boolean z15 = z12;
                            ArrayList arrayList = ExternalActionActivity.f32078x;
                            if (i12 != i14 && i12 != (i13 = UserConfig.selectedAccount)) {
                                ConnectionsManager.getInstance(i13).setAppPaused(true, false);
                                UserConfig.selectedAccount = i12;
                                UserConfig.getInstance(0).saveConfig(false);
                                if (!ApplicationLoader.mainInterfacePaused) {
                                    ConnectionsManager.getInstance(UserConfig.selectedAccount).setAppPaused(false, false);
                                }
                            }
                            externalActionActivity.d(intent2, z13, z14, z15, i12, 1);
                        }
                    });
                    h.show();
                    h.setCanceledOnTouchOutside(false);
                    h.setOnDismissListener(new v5(this, 6));
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
                org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(this, 3, null);
                a2Var.setOnCancelListener(new sz(i10, 0, iArr));
                a2Var.show();
                iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getauthorizationform, new x8(this, iArr, i10, a2Var, getauthorizationform, stringExtra2, stringExtra, 1), 10);
                return;
            }
            finish();
            return;
        }
        if (AndroidUtilities.isTablet()) {
            if (this.d.getFragmentStack().isEmpty()) {
                this.d.c(-1, new d7());
            }
        } else if (this.f32082c.getFragmentStack().isEmpty()) {
            this.f32082c.c(-1, new d7());
        }
        if (!AndroidUtilities.isTablet()) {
            this.e.setVisibility(8);
        }
        this.f32082c.c0();
        if (AndroidUtilities.isTablet()) {
            this.d.c0();
        }
        intent.setAction(null);
    }

    public final void f() {
        if (AndroidUtilities.isTablet()) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.d.getView().getLayoutParams();
            layoutParams.leftMargin = (AndroidUtilities.displaySize.x - layoutParams.width) / 2;
            int i10 = AndroidUtilities.statusBarHeight;
            layoutParams.topMargin = (((AndroidUtilities.displaySize.y - layoutParams.height) - i10) / 2) + i10;
            this.d.getView().setLayoutParams(layoutParams);
            if (AndroidUtilities.isSmallTablet() && getResources().getConfiguration().orientation != 2) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f32082c.getView().getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                this.f32082c.getView().setLayoutParams(layoutParams2);
                return;
            }
            int i11 = (AndroidUtilities.displaySize.x / 100) * 35;
            if (i11 < AndroidUtilities.dp(320.0f)) {
                i11 = AndroidUtilities.dp(320.0f);
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f32082c.getView().getLayoutParams();
            layoutParams3.width = i11;
            layoutParams3.height = -1;
            this.f32082c.getView().setLayoutParams(layoutParams3);
            if (AndroidUtilities.isSmallTablet() && this.f32082c.getFragmentStack().size() == 2) {
                ((org.telegram.ui.ActionBar.m2) this.f32082c.getFragmentStack().get(1)).onPause();
                this.f32082c.getFragmentStack().remove(1);
                this.f32082c.c0();
            }
        }
    }

    public final void g() {
        if (this.f32080a) {
            return;
        }
        a6 a6Var = this.f32087w;
        if (a6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a6Var);
            this.f32087w = null;
        }
        this.f32080a = true;
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.m2 m2Var, ActionBarLayout actionBarLayout) {
        return true;
    }

    public final void i() {
        if (this.f32081b == null) {
            return;
        }
        SharedConfig.appLocked = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f32767s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.D1() && PhotoViewer.t1().R1()) {
            PhotoViewer.t1().G0(false, true);
        } else if (k4.I() && k4.x().V) {
            k4.x().o(false, true);
        }
        this.f32081b.l(false, -1, -1, null);
        SharedConfig.isWaitingForPasscodeEnter = true;
        this.f32081b.setDelegate(new mu(this, 7));
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (AndroidUtilities.isTablet()) {
            if (actionBarLayout == this.f32082c && actionBarLayout.getFragmentStack().size() <= 1) {
                g();
                finish();
                return false;
            } else if (actionBarLayout == this.d && this.f32082c.getFragmentStack().isEmpty() && this.d.getFragmentStack().size() == 1) {
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
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.z4 z4Var) {
        org.telegram.ui.ActionBar.m2 m2Var = z4Var.f20842a;
        return true;
    }

    @Override
    public final void onBackPressed() {
        if (this.f32081b.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.t1().R1()) {
            PhotoViewer.t1().G0(true, false);
        } else if (AndroidUtilities.isTablet()) {
            if (this.d.getView().getVisibility() == 0) {
                this.d.G();
            } else {
                this.f32082c.G();
            }
        } else {
            this.f32082c.G();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ActionBarLayout actionBarLayout;
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        super.onConfigurationChanged(configuration);
        if (!AndroidUtilities.isTablet() || (actionBarLayout = this.f32082c) == null) {
            return;
        }
        actionBarLayout.getView().getViewTreeObserver().addOnGlobalLayoutListener(new tz(this));
    }

    @Override
    public final void onCreate(Bundle bundle) {
        boolean z10;
        int i10;
        ApplicationLoader.postInitApplication();
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages);
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.n0(2));
        if (!SharedConfig.passcodeHash.isEmpty() && !SharedConfig.allowScreenCapture) {
            try {
                getWindow().setFlags(8192, 8192);
                AndroidUtilities.logFlagSecure();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        super.onCreate(bundle);
        if (!SharedConfig.passcodeHash.isEmpty() && SharedConfig.appLocked) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        AndroidUtilities.fillStatusBarHeight(this, false);
        org.telegram.ui.ActionBar.g6.S(this);
        org.telegram.ui.ActionBar.g6.J(this, false);
        this.f32082c = new ActionBarLayout(this, false);
        org.telegram.ui.ActionBar.x3 x3Var = new org.telegram.ui.ActionBar.x3(this);
        this.f32083f = x3Var;
        setContentView(x3Var, new ViewGroup.LayoutParams(-1, -1));
        if (AndroidUtilities.isTablet()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f32083f.addView(relativeLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            ig.q1 q1Var = new ig.q1(this, null, 2);
            this.e = q1Var;
            q1Var.setOccupyStatusBar(false);
            this.e.V(org.telegram.ui.ActionBar.g6.s0());
            relativeLayout.addView(this.e, w7.a6.w(-1, -1));
            relativeLayout.addView(this.f32082c.getView(), w7.a6.w(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(2130706432);
            relativeLayout.addView(frameLayout, w7.a6.w(-1, -1));
            frameLayout.setOnTouchListener(new e0(this, 2));
            frameLayout.setOnClickListener(new ah.f(18));
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.d = actionBarLayout;
            actionBarLayout.setRemoveActionBarExtraHeight(true);
            this.d.setBackgroundView(frameLayout);
            this.d.setUseAlphaAnimations(true);
            this.d.getView().setBackgroundResource(R.drawable.boxshadow);
            ViewGroup view = this.d.getView();
            if (AndroidUtilities.isSmallTablet()) {
                i10 = 528;
            } else {
                i10 = 700;
            }
            relativeLayout.addView(view, w7.a6.w(530, i10));
            this.d.setFragmentStack(f32079y);
            this.d.setDelegate(this);
            this.d.setDrawerLayoutContainer(this.f32083f);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.f32083f.addView(relativeLayout2, w7.a6.d(-1.0f, -1));
            ig.q1 q1Var2 = new ig.q1(this, null, 3);
            this.e = q1Var2;
            q1Var2.setOccupyStatusBar(false);
            this.e.V(org.telegram.ui.ActionBar.g6.s0());
            relativeLayout2.addView(this.e, w7.a6.w(-1, -1));
            relativeLayout2.addView(this.f32082c.getView(), w7.a6.w(-1, -1));
        }
        this.f32083f.setParentActionBarLayout(this.f32082c);
        this.f32082c.setDrawerLayoutContainer(this.f32083f);
        this.f32082c.setFragmentStack(f32078x);
        this.f32082c.setDelegate(this);
        org.telegram.ui.Components.re0 re0Var = new org.telegram.ui.Components.re0(this);
        this.f32081b = re0Var;
        this.f32083f.addView(re0Var, w7.a6.d(-1.0f, -1));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeOtherAppActivities, this);
        this.f32082c.X();
        ActionBarLayout actionBarLayout2 = this.d;
        if (actionBarLayout2 != null) {
            actionBarLayout2.X();
        }
        Intent intent = getIntent();
        if (bundle != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        d(intent, false, z10, false, UserConfig.selectedAccount, 0);
        f();
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        g();
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        this.f32082c.J();
        if (AndroidUtilities.isTablet()) {
            this.d.J();
        }
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        d(intent, true, false, false, UserConfig.selectedAccount, 0);
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.f32082c.L();
        if (AndroidUtilities.isTablet()) {
            this.d.L();
        }
        ApplicationLoader.externalInterfacePaused = true;
        a6 a6Var = this.f32087w;
        if (a6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a6Var);
            this.f32087w = null;
        }
        if (!SharedConfig.passcodeHash.isEmpty()) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            a6 a6Var2 = new a6(this, 3);
            this.f32087w = a6Var2;
            if (SharedConfig.appLocked) {
                AndroidUtilities.runOnUIThread(a6Var2, 1000L);
            } else {
                int i10 = SharedConfig.autoLockIn;
                if (i10 != 0) {
                    AndroidUtilities.runOnUIThread(a6Var2, (i10 * 1000) + 1000);
                }
            }
        } else {
            SharedConfig.lastPauseTime = 0;
        }
        SharedConfig.saveConfig();
        org.telegram.ui.Components.re0 re0Var = this.f32081b;
        if (re0Var != null) {
            re0Var.j();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f32082c.M();
        if (AndroidUtilities.isTablet()) {
            this.d.M();
        }
        ApplicationLoader.externalInterfacePaused = false;
        a6 a6Var = this.f32087w;
        if (a6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a6Var);
            this.f32087w = null;
        }
        if (AndroidUtilities.needShowPasscode(true)) {
            i();
        }
        if (SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            SharedConfig.saveConfig();
        }
        if (this.f32081b.getVisibility() != 0) {
            this.f32082c.M();
            if (AndroidUtilities.isTablet()) {
                this.d.M();
                return;
            }
            return;
        }
        this.f32082c.n();
        if (AndroidUtilities.isTablet()) {
            this.d.n();
        }
        this.f32081b.k();
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void e(int[] iArr) {
    }
}
