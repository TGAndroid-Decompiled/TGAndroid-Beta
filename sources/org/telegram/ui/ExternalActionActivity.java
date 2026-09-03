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
public class ExternalActionActivity extends Activity implements org.telegram.ui.ActionBar.b5 {
    public static final ArrayList f31561x = new ArrayList();
    public static final ArrayList f31562y = new ArrayList();
    public boolean f31563a;
    public org.telegram.ui.Components.wd0 f31564b;
    public ActionBarLayout f31565c;
    public ActionBarLayout d;
    public org.telegram.ui.Components.qv0 e;
    public org.telegram.ui.ActionBar.y3 f31566f;
    public Intent h;
    public boolean f31567n;
    public int f31568r;
    public int f31569s;
    public boolean v;
    public b6 f31570w;

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z4) {
        if (AndroidUtilities.isTablet() && actionBarLayout == this.d) {
            this.f31565c.U(z4, z4);
        }
    }

    public final boolean c(Intent intent, boolean z4, boolean z10, boolean z11, int i10, int i11) {
        if (z11 || (!AndroidUtilities.needShowPasscode(true) && !SharedConfig.isWaitingForPasscodeEnter)) {
            return true;
        }
        i();
        this.h = intent;
        this.f31567n = z4;
        this.v = z10;
        this.f31568r = i10;
        this.f31569s = i11;
        UserConfig.getInstance(i10).saveConfig(false);
        return false;
    }

    public void d(final Intent intent, final boolean z4, final boolean z10, final boolean z11, final int i10, int i11) {
        if (!c(intent, z4, z10, z11, i10, i11)) {
            return;
        }
        if ("org.telegram.passport.AUTHORIZE".equals(intent.getAction())) {
            if (i11 == 0) {
                int activatedAccountsCount = UserConfig.getActivatedAccountsCount();
                if (activatedAccountsCount == 0) {
                    this.h = intent;
                    this.f31567n = z4;
                    this.v = z10;
                    this.f31568r = i10;
                    this.f31569s = i11;
                    pg0 pg0Var = new pg0();
                    if (AndroidUtilities.isTablet()) {
                        this.d.c(-1, pg0Var);
                    } else {
                        this.f31565c.c(-1, pg0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        this.e.setVisibility(8);
                    }
                    this.f31565c.c0();
                    if (AndroidUtilities.isTablet()) {
                        this.d.c0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.PleaseLoginPassport);
                    kf.k0.C(R.string.OK, alertDialog$Builder, null);
                    return;
                } else if (activatedAccountsCount >= 2) {
                    org.telegram.ui.ActionBar.d2 i12 = org.telegram.ui.Components.z4.i(this, new org.telegram.ui.Components.w4() {
                        @Override
                        public final void a(int i13) {
                            int i14;
                            ExternalActionActivity externalActionActivity = ExternalActionActivity.this;
                            int i15 = i10;
                            Intent intent2 = intent;
                            boolean z12 = z4;
                            boolean z13 = z10;
                            boolean z14 = z11;
                            ArrayList arrayList = ExternalActionActivity.f31561x;
                            if (i13 != i15 && i13 != (i14 = UserConfig.selectedAccount)) {
                                ConnectionsManager.getInstance(i14).setAppPaused(true, false);
                                UserConfig.selectedAccount = i13;
                                UserConfig.getInstance(0).saveConfig(false);
                                if (!ApplicationLoader.mainInterfacePaused) {
                                    ConnectionsManager.getInstance(UserConfig.selectedAccount).setAppPaused(false, false);
                                }
                            }
                            externalActionActivity.d(intent2, z12, z13, z14, i13, 1);
                        }
                    });
                    i12.show();
                    i12.setCanceledOnTouchOutside(false);
                    i12.setOnDismissListener(new x5(this, 6));
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
                org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(this, 3, null);
                d2Var.setOnCancelListener(new lz(i10, 0, iArr));
                d2Var.show();
                iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getauthorizationform, new y8(this, iArr, i10, d2Var, getauthorizationform, stringExtra2, stringExtra, 1), 10);
                return;
            }
            finish();
            return;
        }
        if (AndroidUtilities.isTablet()) {
            if (this.d.getFragmentStack().isEmpty()) {
                this.d.c(-1, new d7());
            }
        } else if (this.f31565c.getFragmentStack().isEmpty()) {
            this.f31565c.c(-1, new d7());
        }
        if (!AndroidUtilities.isTablet()) {
            this.e.setVisibility(8);
        }
        this.f31565c.c0();
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
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f31565c.getView().getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                this.f31565c.getView().setLayoutParams(layoutParams2);
                return;
            }
            int i11 = (AndroidUtilities.displaySize.x / 100) * 35;
            if (i11 < AndroidUtilities.dp(320.0f)) {
                i11 = AndroidUtilities.dp(320.0f);
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f31565c.getView().getLayoutParams();
            layoutParams3.width = i11;
            layoutParams3.height = -1;
            this.f31565c.getView().setLayoutParams(layoutParams3);
            if (AndroidUtilities.isSmallTablet() && this.f31565c.getFragmentStack().size() == 2) {
                ((org.telegram.ui.ActionBar.p2) this.f31565c.getFragmentStack().get(1)).onPause();
                this.f31565c.getFragmentStack().remove(1);
                this.f31565c.c0();
            }
        }
    }

    public final void g() {
        if (this.f31563a) {
            return;
        }
        b6 b6Var = this.f31570w;
        if (b6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(b6Var);
            this.f31570w = null;
        }
        this.f31563a = true;
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.p2 p2Var, ActionBarLayout actionBarLayout) {
        return true;
    }

    public final void i() {
        if (this.f31564b == null) {
            return;
        }
        SharedConfig.appLocked = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f32238s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
            PhotoViewer.t1().G0(false, true);
        } else if (n4.I() && n4.x().S) {
            n4.x().o(false, true);
        }
        this.f31564b.j(false, -1, -1, null);
        SharedConfig.isWaitingForPasscodeEnter = true;
        this.f31564b.setDelegate(new hu(this, 7));
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (AndroidUtilities.isTablet()) {
            if (actionBarLayout == this.f31565c && actionBarLayout.getFragmentStack().size() <= 1) {
                g();
                finish();
                return false;
            } else if (actionBarLayout == this.d && this.f31565c.getFragmentStack().isEmpty() && this.d.getFragmentStack().size() == 1) {
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
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.c5 c5Var) {
        org.telegram.ui.ActionBar.p2 p2Var = c5Var.f19524a;
        return true;
    }

    @Override
    public final void onBackPressed() {
        if (this.f31564b.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.t1().Q1()) {
            PhotoViewer.t1().G0(true, false);
        } else if (AndroidUtilities.isTablet()) {
            if (this.d.getView().getVisibility() == 0) {
                this.d.G();
            } else {
                this.f31565c.G();
            }
        } else {
            this.f31565c.G();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ActionBarLayout actionBarLayout;
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        super.onConfigurationChanged(configuration);
        if (!AndroidUtilities.isTablet() || (actionBarLayout = this.f31565c) == null) {
            return;
        }
        actionBarLayout.getView().getViewTreeObserver().addOnGlobalLayoutListener(new mz(this));
    }

    @Override
    public final void onCreate(Bundle bundle) {
        boolean z4;
        int i10;
        ApplicationLoader.postInitApplication();
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages);
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.m0(2));
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
        org.telegram.ui.ActionBar.j6.R(this);
        org.telegram.ui.ActionBar.j6.J(this, false);
        this.f31565c = new ActionBarLayout(this, false);
        org.telegram.ui.ActionBar.y3 y3Var = new org.telegram.ui.ActionBar.y3(this);
        this.f31566f = y3Var;
        setContentView(y3Var, new ViewGroup.LayoutParams(-1, -1));
        if (AndroidUtilities.isTablet()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f31566f.addView(relativeLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            org.telegram.ui.Components.z51 z51Var = new org.telegram.ui.Components.z51(this, null, 1);
            this.e = z51Var;
            z51Var.setOccupyStatusBar(false);
            this.e.V(org.telegram.ui.ActionBar.j6.r0());
            relativeLayout.addView(this.e, k7.b6.w(-1, -1));
            relativeLayout.addView(this.f31565c.getView(), k7.b6.w(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(2130706432);
            relativeLayout.addView(frameLayout, k7.b6.w(-1, -1));
            frameLayout.setOnTouchListener(new g0(this, 2));
            frameLayout.setOnClickListener(new dg.m(19));
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
            relativeLayout.addView(view, k7.b6.w(530, i10));
            this.d.setFragmentStack(f31562y);
            this.d.setDelegate(this);
            this.d.setDrawerLayoutContainer(this.f31566f);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.f31566f.addView(relativeLayout2, k7.b6.c(-1.0f, -1));
            org.telegram.ui.Components.z51 z51Var2 = new org.telegram.ui.Components.z51(this, null, 2);
            this.e = z51Var2;
            z51Var2.setOccupyStatusBar(false);
            this.e.V(org.telegram.ui.ActionBar.j6.r0());
            relativeLayout2.addView(this.e, k7.b6.w(-1, -1));
            relativeLayout2.addView(this.f31565c.getView(), k7.b6.w(-1, -1));
        }
        this.f31566f.setParentActionBarLayout(this.f31565c);
        this.f31565c.setDrawerLayoutContainer(this.f31566f);
        this.f31565c.setFragmentStack(f31561x);
        this.f31565c.setDelegate(this);
        org.telegram.ui.Components.wd0 wd0Var = new org.telegram.ui.Components.wd0(this);
        this.f31564b = wd0Var;
        this.f31566f.addView(wd0Var, k7.b6.c(-1.0f, -1));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeOtherAppActivities, this);
        this.f31565c.X();
        ActionBarLayout actionBarLayout2 = this.d;
        if (actionBarLayout2 != null) {
            actionBarLayout2.X();
        }
        Intent intent = getIntent();
        if (bundle != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        d(intent, false, z4, false, UserConfig.selectedAccount, 0);
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
        this.f31565c.J();
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
        this.f31565c.L();
        if (AndroidUtilities.isTablet()) {
            this.d.L();
        }
        ApplicationLoader.externalInterfacePaused = true;
        b6 b6Var = this.f31570w;
        if (b6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(b6Var);
            this.f31570w = null;
        }
        if (!SharedConfig.passcodeHash.isEmpty()) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            b6 b6Var2 = new b6(this, 3);
            this.f31570w = b6Var2;
            if (SharedConfig.appLocked) {
                AndroidUtilities.runOnUIThread(b6Var2, 1000L);
            } else {
                int i10 = SharedConfig.autoLockIn;
                if (i10 != 0) {
                    AndroidUtilities.runOnUIThread(b6Var2, (i10 * 1000) + 1000);
                }
            }
        } else {
            SharedConfig.lastPauseTime = 0;
        }
        SharedConfig.saveConfig();
        org.telegram.ui.Components.wd0 wd0Var = this.f31564b;
        if (wd0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(wd0Var.O);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f31565c.M();
        if (AndroidUtilities.isTablet()) {
            this.d.M();
        }
        ApplicationLoader.externalInterfacePaused = false;
        b6 b6Var = this.f31570w;
        if (b6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(b6Var);
            this.f31570w = null;
        }
        if (AndroidUtilities.needShowPasscode(true)) {
            i();
        }
        if (SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            SharedConfig.saveConfig();
        }
        if (this.f31564b.getVisibility() != 0) {
            this.f31565c.M();
            if (AndroidUtilities.isTablet()) {
                this.d.M();
                return;
            }
            return;
        }
        this.f31565c.n();
        if (AndroidUtilities.isTablet()) {
            this.d.n();
        }
        this.f31564b.i();
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void e(int[] iArr) {
    }
}
