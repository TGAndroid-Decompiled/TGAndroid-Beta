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
    public static final ArrayList f35465x = new ArrayList();
    public static final ArrayList f35466y = new ArrayList();
    public boolean f35467a;
    public org.telegram.ui.Components.yc0 f35468b;
    public ActionBarLayout f35469c;
    public ActionBarLayout d;
    public org.telegram.ui.Components.xu0 f35470e;
    public org.telegram.ui.ActionBar.x3 f35471f;
    public Intent h;
    public boolean f35472n;
    public int f35473r;
    public int f35474s;
    public boolean v;
    public v5 f35475w;

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (AndroidUtilities.isTablet() && actionBarLayout == this.d) {
            this.f35469c.U(z10, z10);
        }
    }

    public final boolean c(Intent intent, boolean z10, boolean z11, boolean z12, int i9, int i10) {
        if (z12 || (!AndroidUtilities.needShowPasscode(true) && !SharedConfig.isWaitingForPasscodeEnter)) {
            return true;
        }
        i();
        this.h = intent;
        this.f35472n = z10;
        this.v = z11;
        this.f35473r = i9;
        this.f35474s = i10;
        UserConfig.getInstance(i9).saveConfig(false);
        return false;
    }

    public void d(final Intent intent, final boolean z10, final boolean z11, final boolean z12, final int i9, int i10) {
        if (!c(intent, z10, z11, z12, i9, i10)) {
            return;
        }
        if ("org.telegram.passport.AUTHORIZE".equals(intent.getAction())) {
            if (i10 == 0) {
                int activatedAccountsCount = UserConfig.getActivatedAccountsCount();
                if (activatedAccountsCount == 0) {
                    this.h = intent;
                    this.f35472n = z10;
                    this.v = z11;
                    this.f35473r = i9;
                    this.f35474s = i10;
                    fg0 fg0Var = new fg0();
                    if (AndroidUtilities.isTablet()) {
                        this.d.c(-1, fg0Var);
                    } else {
                        this.f35469c.c(-1, fg0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        this.f35470e.setVisibility(8);
                    }
                    this.f35469c.c0();
                    if (AndroidUtilities.isTablet()) {
                        this.d.c0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PleaseLoginPassport);
                    org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
                    return;
                } else if (activatedAccountsCount >= 2) {
                    org.telegram.ui.ActionBar.c2 i11 = org.telegram.ui.Components.y4.i(this, new org.telegram.ui.Components.v4() {
                        @Override
                        public final void a(int i12) {
                            int i13;
                            ExternalActionActivity externalActionActivity = ExternalActionActivity.this;
                            int i14 = i9;
                            Intent intent2 = intent;
                            boolean z13 = z10;
                            boolean z14 = z11;
                            boolean z15 = z12;
                            ArrayList arrayList = ExternalActionActivity.f35465x;
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
                    i11.show();
                    i11.setCanceledOnTouchOutside(false);
                    i11.setOnDismissListener(new r5(this, 6));
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
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(this, 3, null);
                c2Var.setOnCancelListener(new xy(i9, 0, iArr));
                c2Var.show();
                iArr[0] = ConnectionsManager.getInstance(i9).sendRequest(getauthorizationform, new t8(this, iArr, i9, c2Var, getauthorizationform, stringExtra2, stringExtra, 1), 10);
                return;
            }
            finish();
            return;
        }
        if (AndroidUtilities.isTablet()) {
            if (this.d.getFragmentStack().isEmpty()) {
                this.d.c(-1, new y6());
            }
        } else if (this.f35469c.getFragmentStack().isEmpty()) {
            this.f35469c.c(-1, new y6());
        }
        if (!AndroidUtilities.isTablet()) {
            this.f35470e.setVisibility(8);
        }
        this.f35469c.c0();
        if (AndroidUtilities.isTablet()) {
            this.d.c0();
        }
        intent.setAction(null);
    }

    public final void f() {
        if (AndroidUtilities.isTablet()) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.d.getView().getLayoutParams();
            layoutParams.leftMargin = (AndroidUtilities.displaySize.x - layoutParams.width) / 2;
            int i9 = AndroidUtilities.statusBarHeight;
            layoutParams.topMargin = (((AndroidUtilities.displaySize.y - layoutParams.height) - i9) / 2) + i9;
            this.d.getView().setLayoutParams(layoutParams);
            if (AndroidUtilities.isSmallTablet() && getResources().getConfiguration().orientation != 2) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f35469c.getView().getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                this.f35469c.getView().setLayoutParams(layoutParams2);
                return;
            }
            int i10 = (AndroidUtilities.displaySize.x / 100) * 35;
            if (i10 < AndroidUtilities.dp(320.0f)) {
                i10 = AndroidUtilities.dp(320.0f);
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f35469c.getView().getLayoutParams();
            layoutParams3.width = i10;
            layoutParams3.height = -1;
            this.f35469c.getView().setLayoutParams(layoutParams3);
            if (AndroidUtilities.isSmallTablet() && this.f35469c.getFragmentStack().size() == 2) {
                ((org.telegram.ui.ActionBar.o2) this.f35469c.getFragmentStack().get(1)).onPause();
                this.f35469c.getFragmentStack().remove(1);
                this.f35469c.c0();
            }
        }
    }

    public final void g() {
        if (this.f35467a) {
            return;
        }
        v5 v5Var = this.f35475w;
        if (v5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(v5Var);
            this.f35475w = null;
        }
        this.f35467a = true;
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.o2 o2Var, ActionBarLayout actionBarLayout) {
        return true;
    }

    public final void i() {
        if (this.f35468b == null) {
            return;
        }
        SharedConfig.appLocked = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f36157s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
            PhotoViewer.t1().F0(false, true);
        } else if (l4.I() && l4.x().R) {
            l4.x().o(false, true);
        }
        this.f35468b.j(false, -1, -1, null);
        SharedConfig.isWaitingForPasscodeEnter = true;
        this.f35468b.setDelegate(new wt(this, 7));
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (AndroidUtilities.isTablet()) {
            if (actionBarLayout == this.f35469c && actionBarLayout.getFragmentStack().size() <= 1) {
                g();
                finish();
                return false;
            } else if (actionBarLayout == this.d && this.f35469c.getFragmentStack().isEmpty() && this.d.getFragmentStack().size() == 1) {
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
        org.telegram.ui.ActionBar.o2 o2Var = z4Var.f24008a;
        return true;
    }

    @Override
    public final void onBackPressed() {
        if (this.f35468b.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.t1().Q1()) {
            PhotoViewer.t1().F0(true, false);
        } else if (AndroidUtilities.isTablet()) {
            if (this.d.getView().getVisibility() == 0) {
                this.d.G();
            } else {
                this.f35469c.G();
            }
        } else {
            this.f35469c.G();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ActionBarLayout actionBarLayout;
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        super.onConfigurationChanged(configuration);
        if (!AndroidUtilities.isTablet() || (actionBarLayout = this.f35469c) == null) {
            return;
        }
        actionBarLayout.getView().getViewTreeObserver().addOnGlobalLayoutListener(new yy(this));
    }

    @Override
    public final void onCreate(Bundle bundle) {
        boolean z10;
        int i9;
        ApplicationLoader.postInitApplication();
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages);
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.m0(2));
        if (!SharedConfig.passcodeHash.isEmpty() && !SharedConfig.allowScreenCapture) {
            try {
                getWindow().setFlags(8192, 8192);
                AndroidUtilities.logFlagSecure();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        super.onCreate(bundle);
        if (!SharedConfig.passcodeHash.isEmpty() && SharedConfig.appLocked) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        AndroidUtilities.fillStatusBarHeight(this, false);
        org.telegram.ui.ActionBar.f6.R(this);
        org.telegram.ui.ActionBar.f6.J(this, false);
        this.f35469c = new ActionBarLayout(this, false);
        org.telegram.ui.ActionBar.x3 x3Var = new org.telegram.ui.ActionBar.x3(this);
        this.f35471f = x3Var;
        setContentView(x3Var, new ViewGroup.LayoutParams(-1, -1));
        if (AndroidUtilities.isTablet()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f35471f.addView(relativeLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            org.telegram.ui.Components.b51 b51Var = new org.telegram.ui.Components.b51(this, null, 1);
            this.f35470e = b51Var;
            b51Var.setOccupyStatusBar(false);
            this.f35470e.V(org.telegram.ui.ActionBar.f6.r0());
            relativeLayout.addView(this.f35470e, g7.e6.w(-1, -1));
            relativeLayout.addView(this.f35469c.getView(), g7.e6.w(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(2130706432);
            relativeLayout.addView(frameLayout, g7.e6.w(-1, -1));
            frameLayout.setOnTouchListener(new f0(this, 2));
            frameLayout.setOnClickListener(new fh.n(20));
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.d = actionBarLayout;
            actionBarLayout.setRemoveActionBarExtraHeight(true);
            this.d.setBackgroundView(frameLayout);
            this.d.setUseAlphaAnimations(true);
            this.d.getView().setBackgroundResource(R.drawable.boxshadow);
            ViewGroup view = this.d.getView();
            if (AndroidUtilities.isSmallTablet()) {
                i9 = 528;
            } else {
                i9 = 700;
            }
            relativeLayout.addView(view, g7.e6.w(530, i9));
            this.d.setFragmentStack(f35466y);
            this.d.setDelegate(this);
            this.d.setDrawerLayoutContainer(this.f35471f);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.f35471f.addView(relativeLayout2, g7.e6.c(-1.0f, -1));
            org.telegram.ui.Components.b51 b51Var2 = new org.telegram.ui.Components.b51(this, null, 2);
            this.f35470e = b51Var2;
            b51Var2.setOccupyStatusBar(false);
            this.f35470e.V(org.telegram.ui.ActionBar.f6.r0());
            relativeLayout2.addView(this.f35470e, g7.e6.w(-1, -1));
            relativeLayout2.addView(this.f35469c.getView(), g7.e6.w(-1, -1));
        }
        this.f35471f.setParentActionBarLayout(this.f35469c);
        this.f35469c.setDrawerLayoutContainer(this.f35471f);
        this.f35469c.setFragmentStack(f35465x);
        this.f35469c.setDelegate(this);
        org.telegram.ui.Components.yc0 yc0Var = new org.telegram.ui.Components.yc0(this);
        this.f35468b = yc0Var;
        this.f35471f.addView(yc0Var, g7.e6.c(-1.0f, -1));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeOtherAppActivities, this);
        this.f35469c.X();
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
        this.f35469c.J();
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
        this.f35469c.L();
        if (AndroidUtilities.isTablet()) {
            this.d.L();
        }
        ApplicationLoader.externalInterfacePaused = true;
        v5 v5Var = this.f35475w;
        if (v5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(v5Var);
            this.f35475w = null;
        }
        if (!SharedConfig.passcodeHash.isEmpty()) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            v5 v5Var2 = new v5(this, 3);
            this.f35475w = v5Var2;
            if (SharedConfig.appLocked) {
                AndroidUtilities.runOnUIThread(v5Var2, 1000L);
            } else {
                int i9 = SharedConfig.autoLockIn;
                if (i9 != 0) {
                    AndroidUtilities.runOnUIThread(v5Var2, (i9 * 1000) + 1000);
                }
            }
        } else {
            SharedConfig.lastPauseTime = 0;
        }
        SharedConfig.saveConfig();
        org.telegram.ui.Components.yc0 yc0Var = this.f35468b;
        if (yc0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(yc0Var.N);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f35469c.M();
        if (AndroidUtilities.isTablet()) {
            this.d.M();
        }
        ApplicationLoader.externalInterfacePaused = false;
        v5 v5Var = this.f35475w;
        if (v5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(v5Var);
            this.f35475w = null;
        }
        if (AndroidUtilities.needShowPasscode(true)) {
            i();
        }
        if (SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            SharedConfig.saveConfig();
        }
        if (this.f35468b.getVisibility() != 0) {
            this.f35469c.M();
            if (AndroidUtilities.isTablet()) {
                this.d.M();
                return;
            }
            return;
        }
        this.f35469c.n();
        if (AndroidUtilities.isTablet()) {
            this.d.n();
        }
        this.f35468b.i();
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void e(int[] iArr) {
    }
}
