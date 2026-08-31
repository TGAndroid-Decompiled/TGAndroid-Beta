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
public class ExternalActionActivity extends Activity implements org.telegram.ui.ActionBar.c5 {
    public static final ArrayList f34106x = new ArrayList();
    public static final ArrayList f34107y = new ArrayList();
    public boolean f34108a;
    public org.telegram.ui.Components.xd0 f34109b;
    public ActionBarLayout f34110c;
    public ActionBarLayout d;
    public org.telegram.ui.Components.qv0 f34111e;
    public org.telegram.ui.ActionBar.z3 f34112f;
    public Intent h;
    public boolean f34113n;
    public int f34114r;
    public int f34115s;
    public boolean v;
    public z5 f34116w;

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z4) {
        if (AndroidUtilities.isTablet() && actionBarLayout == this.d) {
            this.f34110c.U(z4, z4);
        }
    }

    public final boolean c(Intent intent, boolean z4, boolean z10, boolean z11, int i10, int i11) {
        if (z11 || (!AndroidUtilities.needShowPasscode(true) && !SharedConfig.isWaitingForPasscodeEnter)) {
            return true;
        }
        i();
        this.h = intent;
        this.f34113n = z4;
        this.v = z10;
        this.f34114r = i10;
        this.f34115s = i11;
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
                    this.f34113n = z4;
                    this.v = z10;
                    this.f34114r = i10;
                    this.f34115s = i11;
                    og0 og0Var = new og0();
                    if (AndroidUtilities.isTablet()) {
                        this.d.c(-1, og0Var);
                    } else {
                        this.f34110c.c(-1, og0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        this.f34111e.setVisibility(8);
                    }
                    this.f34110c.c0();
                    if (AndroidUtilities.isTablet()) {
                        this.d.c0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.PleaseLoginPassport);
                    l.d.C(R.string.OK, alertDialog$Builder, null);
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
                            ArrayList arrayList = ExternalActionActivity.f34106x;
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
                    i12.setOnDismissListener(new v5(this, 6));
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
                d2Var.setOnCancelListener(new kz(i10, 0, iArr));
                d2Var.show();
                iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getauthorizationform, new w8(this, iArr, i10, d2Var, getauthorizationform, stringExtra2, stringExtra, 1), 10);
                return;
            }
            finish();
            return;
        }
        if (AndroidUtilities.isTablet()) {
            if (this.d.getFragmentStack().isEmpty()) {
                this.d.c(-1, new b7());
            }
        } else if (this.f34110c.getFragmentStack().isEmpty()) {
            this.f34110c.c(-1, new b7());
        }
        if (!AndroidUtilities.isTablet()) {
            this.f34111e.setVisibility(8);
        }
        this.f34110c.c0();
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
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f34110c.getView().getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                this.f34110c.getView().setLayoutParams(layoutParams2);
                return;
            }
            int i11 = (AndroidUtilities.displaySize.x / 100) * 35;
            if (i11 < AndroidUtilities.dp(320.0f)) {
                i11 = AndroidUtilities.dp(320.0f);
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f34110c.getView().getLayoutParams();
            layoutParams3.width = i11;
            layoutParams3.height = -1;
            this.f34110c.getView().setLayoutParams(layoutParams3);
            if (AndroidUtilities.isSmallTablet() && this.f34110c.getFragmentStack().size() == 2) {
                ((org.telegram.ui.ActionBar.p2) this.f34110c.getFragmentStack().get(1)).onPause();
                this.f34110c.getFragmentStack().remove(1);
                this.f34110c.c0();
            }
        }
    }

    public final void g() {
        if (this.f34108a) {
            return;
        }
        z5 z5Var = this.f34116w;
        if (z5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(z5Var);
            this.f34116w = null;
        }
        this.f34108a = true;
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.p2 p2Var, ActionBarLayout actionBarLayout) {
        return true;
    }

    public final void i() {
        if (this.f34109b == null) {
            return;
        }
        SharedConfig.appLocked = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f34800s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
            PhotoViewer.t1().G0(false, true);
        } else if (l4.I() && l4.x().S) {
            l4.x().o(false, true);
        }
        this.f34109b.j(false, -1, -1, null);
        SharedConfig.isWaitingForPasscodeEnter = true;
        this.f34109b.setDelegate(new gu(this, 7));
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (AndroidUtilities.isTablet()) {
            if (actionBarLayout == this.f34110c && actionBarLayout.getFragmentStack().size() <= 1) {
                g();
                finish();
                return false;
            } else if (actionBarLayout == this.d && this.f34110c.getFragmentStack().isEmpty() && this.d.getFragmentStack().size() == 1) {
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
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.d5 d5Var) {
        org.telegram.ui.ActionBar.p2 p2Var = d5Var.f21276a;
        return true;
    }

    @Override
    public final void onBackPressed() {
        if (this.f34109b.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.t1().Q1()) {
            PhotoViewer.t1().G0(true, false);
        } else if (AndroidUtilities.isTablet()) {
            if (this.d.getView().getVisibility() == 0) {
                this.d.G();
            } else {
                this.f34110c.G();
            }
        } else {
            this.f34110c.G();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ActionBarLayout actionBarLayout;
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        super.onConfigurationChanged(configuration);
        if (!AndroidUtilities.isTablet() || (actionBarLayout = this.f34110c) == null) {
            return;
        }
        actionBarLayout.getView().getViewTreeObserver().addOnGlobalLayoutListener(new lz(this));
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
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        super.onCreate(bundle);
        if (!SharedConfig.passcodeHash.isEmpty() && SharedConfig.appLocked) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        AndroidUtilities.fillStatusBarHeight(this, false);
        org.telegram.ui.ActionBar.k6.R(this);
        org.telegram.ui.ActionBar.k6.J(this, false);
        this.f34110c = new ActionBarLayout(this, false);
        org.telegram.ui.ActionBar.z3 z3Var = new org.telegram.ui.ActionBar.z3(this);
        this.f34112f = z3Var;
        setContentView(z3Var, new ViewGroup.LayoutParams(-1, -1));
        if (AndroidUtilities.isTablet()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f34112f.addView(relativeLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            org.telegram.ui.Components.a61 a61Var = new org.telegram.ui.Components.a61(this, null, 1);
            this.f34111e = a61Var;
            a61Var.setOccupyStatusBar(false);
            this.f34111e.V(org.telegram.ui.ActionBar.k6.r0());
            relativeLayout.addView(this.f34111e, k7.c6.w(-1, -1));
            relativeLayout.addView(this.f34110c.getView(), k7.c6.w(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(2130706432);
            relativeLayout.addView(frameLayout, k7.c6.w(-1, -1));
            frameLayout.setOnTouchListener(new f0(this, 2));
            frameLayout.setOnClickListener(new eg.m(19));
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
            relativeLayout.addView(view, k7.c6.w(530, i10));
            this.d.setFragmentStack(f34107y);
            this.d.setDelegate(this);
            this.d.setDrawerLayoutContainer(this.f34112f);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.f34112f.addView(relativeLayout2, k7.c6.c(-1.0f, -1));
            org.telegram.ui.Components.a61 a61Var2 = new org.telegram.ui.Components.a61(this, null, 2);
            this.f34111e = a61Var2;
            a61Var2.setOccupyStatusBar(false);
            this.f34111e.V(org.telegram.ui.ActionBar.k6.r0());
            relativeLayout2.addView(this.f34111e, k7.c6.w(-1, -1));
            relativeLayout2.addView(this.f34110c.getView(), k7.c6.w(-1, -1));
        }
        this.f34112f.setParentActionBarLayout(this.f34110c);
        this.f34110c.setDrawerLayoutContainer(this.f34112f);
        this.f34110c.setFragmentStack(f34106x);
        this.f34110c.setDelegate(this);
        org.telegram.ui.Components.xd0 xd0Var = new org.telegram.ui.Components.xd0(this);
        this.f34109b = xd0Var;
        this.f34112f.addView(xd0Var, k7.c6.c(-1.0f, -1));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeOtherAppActivities, this);
        this.f34110c.X();
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
        this.f34110c.J();
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
        this.f34110c.L();
        if (AndroidUtilities.isTablet()) {
            this.d.L();
        }
        ApplicationLoader.externalInterfacePaused = true;
        z5 z5Var = this.f34116w;
        if (z5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(z5Var);
            this.f34116w = null;
        }
        if (!SharedConfig.passcodeHash.isEmpty()) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            z5 z5Var2 = new z5(this, 3);
            this.f34116w = z5Var2;
            if (SharedConfig.appLocked) {
                AndroidUtilities.runOnUIThread(z5Var2, 1000L);
            } else {
                int i10 = SharedConfig.autoLockIn;
                if (i10 != 0) {
                    AndroidUtilities.runOnUIThread(z5Var2, (i10 * 1000) + 1000);
                }
            }
        } else {
            SharedConfig.lastPauseTime = 0;
        }
        SharedConfig.saveConfig();
        org.telegram.ui.Components.xd0 xd0Var = this.f34109b;
        if (xd0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(xd0Var.O);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f34110c.M();
        if (AndroidUtilities.isTablet()) {
            this.d.M();
        }
        ApplicationLoader.externalInterfacePaused = false;
        z5 z5Var = this.f34116w;
        if (z5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(z5Var);
            this.f34116w = null;
        }
        if (AndroidUtilities.needShowPasscode(true)) {
            i();
        }
        if (SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            SharedConfig.saveConfig();
        }
        if (this.f34109b.getVisibility() != 0) {
            this.f34110c.M();
            if (AndroidUtilities.isTablet()) {
                this.d.M();
                return;
            }
            return;
        }
        this.f34110c.n();
        if (AndroidUtilities.isTablet()) {
            this.d.n();
        }
        this.f34109b.i();
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void e(int[] iArr) {
    }
}
