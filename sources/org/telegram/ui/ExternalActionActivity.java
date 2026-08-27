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

    public static final ArrayList f35468x = new ArrayList();

    public static final ArrayList f35469y = new ArrayList();

    public boolean f35470a;

    public org.telegram.ui.Components.dd0 f35471b;

    public ActionBarLayout f35472c;
    public ActionBarLayout d;

    public org.telegram.ui.Components.zu0 f35473e;

    public org.telegram.ui.ActionBar.x3 f35474f;
    public Intent h;

    public boolean f35475n;

    public int f35476r;

    public int f35477s;
    public boolean v;

    public w5 f35478w;

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (AndroidUtilities.isTablet() && actionBarLayout == this.d) {
            this.f35472c.U(z10, z10);
        }
    }

    public final boolean c(Intent intent, boolean z10, boolean z11, boolean z12, int i10, int i11) {
        if (z12 || !(AndroidUtilities.needShowPasscode(true) || SharedConfig.isWaitingForPasscodeEnter)) {
            return true;
        }
        i();
        this.h = intent;
        this.f35475n = z10;
        this.v = z11;
        this.f35476r = i10;
        this.f35477s = i11;
        UserConfig.getInstance(i10).saveConfig(false);
        return false;
    }

    public void d(final Intent intent, final boolean z10, final boolean z11, final boolean z12, final int i10, int i11) {
        if (c(intent, z10, z11, z12, i10, i11)) {
            if (!"org.telegram.passport.AUTHORIZE".equals(intent.getAction())) {
                if (AndroidUtilities.isTablet()) {
                    if (this.d.getFragmentStack().isEmpty()) {
                        this.d.c(-1, new z6());
                    }
                } else if (this.f35472c.getFragmentStack().isEmpty()) {
                    this.f35472c.c(-1, new z6());
                }
                if (!AndroidUtilities.isTablet()) {
                    this.f35473e.setVisibility(8);
                }
                this.f35472c.c0();
                if (AndroidUtilities.isTablet()) {
                    this.d.c0();
                }
                intent.setAction(null);
                return;
            }
            if (i11 == 0) {
                int activatedAccountsCount = UserConfig.getActivatedAccountsCount();
                if (activatedAccountsCount == 0) {
                    this.h = intent;
                    this.f35475n = z10;
                    this.v = z11;
                    this.f35476r = i10;
                    this.f35477s = i11;
                    ig0 ig0Var = new ig0();
                    if (AndroidUtilities.isTablet()) {
                        this.d.c(-1, ig0Var);
                    } else {
                        this.f35472c.c(-1, ig0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        this.f35473e.setVisibility(8);
                    }
                    this.f35472c.c0();
                    if (AndroidUtilities.isTablet()) {
                        this.d.c0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PleaseLoginPassport);
                    i0.a.C(R.string.OK, alertDialog$Builder, null);
                    return;
                }
                if (activatedAccountsCount >= 2) {
                    org.telegram.ui.ActionBar.b2 b2VarI = org.telegram.ui.Components.y4.i(this, new org.telegram.ui.Components.v4() {
                        @Override
                        public final void a(int i12) {
                            int i13;
                            ExternalActionActivity externalActionActivity = this.f45273a;
                            int i14 = i10;
                            Intent intent2 = intent;
                            boolean z13 = z10;
                            boolean z14 = z11;
                            boolean z15 = z12;
                            ArrayList arrayList = ExternalActionActivity.f35468x;
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
                    b2VarI.show();
                    b2VarI.setCanceledOnTouchOutside(false);
                    b2VarI.setOnDismissListener(new s5(this, 6));
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
            if (longExtra == 0 || ((TextUtils.isEmpty(stringExtra2) && TextUtils.isEmpty(stringExtra)) || TextUtils.isEmpty(getauthorizationform.scope) || TextUtils.isEmpty(getauthorizationform.public_key))) {
                finish();
                return;
            }
            int[] iArr = {0};
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(this, 3, null);
            b2Var.setOnCancelListener(new az(i10, 0, iArr));
            b2Var.show();
            iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getauthorizationform, new u8(this, iArr, i10, b2Var, getauthorizationform, stringExtra2, stringExtra, 1), 10);
        }
    }

    public final void f() {
        if (AndroidUtilities.isTablet()) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.d.getView().getLayoutParams();
            layoutParams.leftMargin = (AndroidUtilities.displaySize.x - layoutParams.width) / 2;
            int i10 = AndroidUtilities.statusBarHeight;
            layoutParams.topMargin = (((AndroidUtilities.displaySize.y - layoutParams.height) - i10) / 2) + i10;
            this.d.getView().setLayoutParams(layoutParams);
            if (AndroidUtilities.isSmallTablet() && getResources().getConfiguration().orientation != 2) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f35472c.getView().getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                this.f35472c.getView().setLayoutParams(layoutParams2);
                return;
            }
            int iDp = (AndroidUtilities.displaySize.x / 100) * 35;
            if (iDp < AndroidUtilities.dp(320.0f)) {
                iDp = AndroidUtilities.dp(320.0f);
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f35472c.getView().getLayoutParams();
            layoutParams3.width = iDp;
            layoutParams3.height = -1;
            this.f35472c.getView().setLayoutParams(layoutParams3);
            if (AndroidUtilities.isSmallTablet() && this.f35472c.getFragmentStack().size() == 2) {
                ((org.telegram.ui.ActionBar.n2) this.f35472c.getFragmentStack().get(1)).onPause();
                this.f35472c.getFragmentStack().remove(1);
                this.f35472c.c0();
            }
        }
    }

    public final void g() {
        if (this.f35470a) {
            return;
        }
        w5 w5Var = this.f35478w;
        if (w5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(w5Var);
            this.f35478w = null;
        }
        this.f35470a = true;
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.n2 n2Var, ActionBarLayout actionBarLayout) {
        return true;
    }

    public final void i() {
        if (this.f35471b == null) {
            return;
        }
        SharedConfig.appLocked = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f36160s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
            PhotoViewer.t1().G0(false, true);
        } else if (m4.I() && m4.x().R) {
            m4.x().o(false, true);
        }
        this.f35471b.j(false, -1, -1, null);
        SharedConfig.isWaitingForPasscodeEnter = true;
        this.f35471b.setDelegate(new zt(this, 7));
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (AndroidUtilities.isTablet()) {
            if (actionBarLayout == this.f35472c && actionBarLayout.getFragmentStack().size() <= 1) {
                g();
                finish();
                return false;
            }
            if (actionBarLayout == this.d && this.f35472c.getFragmentStack().isEmpty() && this.d.getFragmentStack().size() == 1) {
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
        org.telegram.ui.ActionBar.n2 n2Var = z4Var.f23999a;
        return true;
    }

    @Override
    public final void onBackPressed() {
        if (this.f35471b.getVisibility() == 0) {
            finish();
            return;
        }
        if (PhotoViewer.t1().Q1()) {
            PhotoViewer.t1().G0(true, false);
            return;
        }
        if (!AndroidUtilities.isTablet()) {
            this.f35472c.G();
        } else if (this.d.getView().getVisibility() == 0) {
            this.d.G();
        } else {
            this.f35472c.G();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ActionBarLayout actionBarLayout;
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        super.onConfigurationChanged(configuration);
        if (AndroidUtilities.isTablet() && (actionBarLayout = this.f35472c) != null) {
            actionBarLayout.getView().getViewTreeObserver().addOnGlobalLayoutListener(new bz(this));
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        ApplicationLoader.postInitApplication();
        int i10 = 1;
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages);
        int i11 = 2;
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.m0(2));
        if (!SharedConfig.passcodeHash.isEmpty() && !SharedConfig.allowScreenCapture) {
            try {
                getWindow().setFlags(8192, 8192);
                AndroidUtilities.logFlagSecure();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        super.onCreate(bundle);
        if (!SharedConfig.passcodeHash.isEmpty() && SharedConfig.appLocked) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        AndroidUtilities.fillStatusBarHeight(this, false);
        org.telegram.ui.ActionBar.g6.R(this);
        org.telegram.ui.ActionBar.g6.J(this, false);
        this.f35472c = new ActionBarLayout(this, false);
        org.telegram.ui.ActionBar.x3 x3Var = new org.telegram.ui.ActionBar.x3(this);
        this.f35474f = x3Var;
        setContentView(x3Var, new ViewGroup.LayoutParams(-1, -1));
        org.telegram.ui.ActionBar.b5 b5Var = null;
        if (AndroidUtilities.isTablet()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f35474f.addView(relativeLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            org.telegram.ui.Components.d51 d51Var = new org.telegram.ui.Components.d51(this, b5Var, i10);
            this.f35473e = d51Var;
            d51Var.setOccupyStatusBar(false);
            this.f35473e.V(org.telegram.ui.ActionBar.g6.r0());
            relativeLayout.addView(this.f35473e, h7.z5.w(-1, -1));
            relativeLayout.addView(this.f35472c.getView(), h7.z5.w(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(2130706432);
            relativeLayout.addView(frameLayout, h7.z5.w(-1, -1));
            frameLayout.setOnTouchListener(new g0(this, i11));
            frameLayout.setOnClickListener(new ag.l2(21));
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.d = actionBarLayout;
            actionBarLayout.setRemoveActionBarExtraHeight(true);
            this.d.setBackgroundView(frameLayout);
            this.d.setUseAlphaAnimations(true);
            this.d.getView().setBackgroundResource(R.drawable.boxshadow);
            relativeLayout.addView(this.d.getView(), h7.z5.w(530, AndroidUtilities.isSmallTablet() ? 528 : 700));
            this.d.setFragmentStack(f35469y);
            this.d.setDelegate(this);
            this.d.setDrawerLayoutContainer(this.f35474f);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.f35474f.addView(relativeLayout2, h7.z5.c(-1.0f, -1));
            org.telegram.ui.Components.d51 d51Var2 = new org.telegram.ui.Components.d51(this, b5Var, i11);
            this.f35473e = d51Var2;
            d51Var2.setOccupyStatusBar(false);
            this.f35473e.V(org.telegram.ui.ActionBar.g6.r0());
            relativeLayout2.addView(this.f35473e, h7.z5.w(-1, -1));
            relativeLayout2.addView(this.f35472c.getView(), h7.z5.w(-1, -1));
        }
        this.f35474f.setParentActionBarLayout(this.f35472c);
        this.f35472c.setDrawerLayoutContainer(this.f35474f);
        this.f35472c.setFragmentStack(f35468x);
        this.f35472c.setDelegate(this);
        org.telegram.ui.Components.dd0 dd0Var = new org.telegram.ui.Components.dd0(this);
        this.f35471b = dd0Var;
        this.f35474f.addView(dd0Var, h7.z5.c(-1.0f, -1));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeOtherAppActivities, this);
        this.f35472c.X();
        ActionBarLayout actionBarLayout2 = this.d;
        if (actionBarLayout2 != null) {
            actionBarLayout2.X();
        }
        d(getIntent(), false, bundle != null, false, UserConfig.selectedAccount, 0);
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
        this.f35472c.J();
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
        this.f35472c.L();
        if (AndroidUtilities.isTablet()) {
            this.d.L();
        }
        ApplicationLoader.externalInterfacePaused = true;
        w5 w5Var = this.f35478w;
        if (w5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(w5Var);
            this.f35478w = null;
        }
        if (SharedConfig.passcodeHash.isEmpty()) {
            SharedConfig.lastPauseTime = 0;
        } else {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            w5 w5Var2 = new w5(this, 3);
            this.f35478w = w5Var2;
            if (SharedConfig.appLocked) {
                AndroidUtilities.runOnUIThread(w5Var2, 1000L);
            } else {
                int i10 = SharedConfig.autoLockIn;
                if (i10 != 0) {
                    AndroidUtilities.runOnUIThread(w5Var2, (((long) i10) * 1000) + 1000);
                }
            }
        }
        SharedConfig.saveConfig();
        org.telegram.ui.Components.dd0 dd0Var = this.f35471b;
        if (dd0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(dd0Var.N);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f35472c.M();
        if (AndroidUtilities.isTablet()) {
            this.d.M();
        }
        ApplicationLoader.externalInterfacePaused = false;
        w5 w5Var = this.f35478w;
        if (w5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(w5Var);
            this.f35478w = null;
        }
        if (AndroidUtilities.needShowPasscode(true)) {
            i();
        }
        if (SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            SharedConfig.saveConfig();
        }
        if (this.f35471b.getVisibility() != 0) {
            this.f35472c.M();
            if (AndroidUtilities.isTablet()) {
                this.d.M();
                return;
            }
            return;
        }
        this.f35472c.n();
        if (AndroidUtilities.isTablet()) {
            this.d.n();
        }
        this.f35471b.i();
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void e(int[] iArr) {
    }
}
