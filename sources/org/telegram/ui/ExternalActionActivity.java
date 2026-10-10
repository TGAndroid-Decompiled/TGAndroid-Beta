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
public class ExternalActionActivity extends Activity implements org.telegram.ui.ActionBar.z4 {
    public static final ArrayList f33787x = new ArrayList();
    public static final ArrayList f33788y = new ArrayList();
    public boolean f33789a;
    public org.telegram.ui.Components.ue0 f33790b;
    public ActionBarLayout f33791c;
    public ActionBarLayout d;
    public org.telegram.ui.Components.tw0 f33792e;
    public org.telegram.ui.ActionBar.y3 f33793f;
    public Intent h;
    public boolean f33794n;
    public int f33795r;
    public int f33796s;
    public boolean v;
    public w5 f33797w;

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (AndroidUtilities.isTablet() && actionBarLayout == this.d) {
            this.f33791c.U(z10, z10);
        }
    }

    public final boolean c(Intent intent, boolean z10, boolean z11, boolean z12, int i10, int i11) {
        if (z12 || (!AndroidUtilities.needShowPasscode(true) && !SharedConfig.isWaitingForPasscodeEnter)) {
            return true;
        }
        i();
        this.h = intent;
        this.f33794n = z10;
        this.v = z11;
        this.f33795r = i10;
        this.f33796s = i11;
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
                    this.f33794n = z10;
                    this.v = z11;
                    this.f33795r = i10;
                    this.f33796s = i11;
                    wg0 wg0Var = new wg0();
                    if (AndroidUtilities.isTablet()) {
                        this.d.c(-1, wg0Var);
                    } else {
                        this.f33791c.c(-1, wg0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        this.f33792e.setVisibility(8);
                    }
                    this.f33791c.c0();
                    if (AndroidUtilities.isTablet()) {
                        this.d.c0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    alertDialog$Builder.f20378a.R = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.f20378a.T = LocaleController.getString(R.string.PleaseLoginPassport);
                    org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
                    return;
                } else if (activatedAccountsCount >= 2) {
                    org.telegram.ui.ActionBar.b2 h = org.telegram.ui.Components.g5.h(this, new org.telegram.ui.Components.d5() {
                        @Override
                        public final void a(int i12) {
                            int i13;
                            ExternalActionActivity externalActionActivity = ExternalActionActivity.this;
                            int i14 = i10;
                            Intent intent2 = intent;
                            boolean z13 = z10;
                            boolean z14 = z11;
                            boolean z15 = z12;
                            ArrayList arrayList = ExternalActionActivity.f33787x;
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
                    h.setOnDismissListener(new r5(this, 6));
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
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(this, 3, null);
                b2Var.setOnCancelListener(new nz(i10, 0, iArr));
                b2Var.show();
                iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getauthorizationform, new t8(this, iArr, i10, b2Var, getauthorizationform, stringExtra2, stringExtra, 1), 10);
                return;
            }
            finish();
            return;
        }
        if (AndroidUtilities.isTablet()) {
            if (this.d.getFragmentStack().isEmpty()) {
                this.d.c(-1, new y6());
            }
        } else if (this.f33791c.getFragmentStack().isEmpty()) {
            this.f33791c.c(-1, new y6());
        }
        if (!AndroidUtilities.isTablet()) {
            this.f33792e.setVisibility(8);
        }
        this.f33791c.c0();
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
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f33791c.getView().getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                this.f33791c.getView().setLayoutParams(layoutParams2);
                return;
            }
            int i11 = (AndroidUtilities.displaySize.x / 100) * 35;
            if (i11 < AndroidUtilities.dp(320.0f)) {
                i11 = AndroidUtilities.dp(320.0f);
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f33791c.getView().getLayoutParams();
            layoutParams3.width = i11;
            layoutParams3.height = -1;
            this.f33791c.getView().setLayoutParams(layoutParams3);
            if (AndroidUtilities.isSmallTablet() && this.f33791c.getFragmentStack().size() == 2) {
                ((org.telegram.ui.ActionBar.n2) this.f33791c.getFragmentStack().get(1)).onPause();
                this.f33791c.getFragmentStack().remove(1);
                this.f33791c.c0();
            }
        }
    }

    public final void g() {
        if (this.f33789a) {
            return;
        }
        w5 w5Var = this.f33797w;
        if (w5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(w5Var);
            this.f33797w = null;
        }
        this.f33789a = true;
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.n2 n2Var, ActionBarLayout actionBarLayout) {
        return true;
    }

    public final void i() {
        if (this.f33790b == null) {
            return;
        }
        SharedConfig.appLocked = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f34491s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.D1() && PhotoViewer.t1().R1()) {
            PhotoViewer.t1().G0(false, true);
        } else if (i4.I() && i4.x().V) {
            i4.x().o(false, true);
        }
        this.f33790b.l(false, -1, -1, null);
        SharedConfig.isWaitingForPasscodeEnter = true;
        this.f33790b.setDelegate(new gu(this, 7));
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (AndroidUtilities.isTablet()) {
            if (actionBarLayout == this.f33791c && actionBarLayout.getFragmentStack().size() <= 1) {
                g();
                finish();
                return false;
            } else if (actionBarLayout == this.d && this.f33791c.getFragmentStack().isEmpty() && this.d.getFragmentStack().size() == 1) {
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
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.a5 a5Var) {
        org.telegram.ui.ActionBar.n2 n2Var = a5Var.f20389a;
        return true;
    }

    @Override
    public final void onBackPressed() {
        if (this.f33790b.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.t1().R1()) {
            PhotoViewer.t1().G0(true, false);
        } else if (AndroidUtilities.isTablet()) {
            if (this.d.getView().getVisibility() == 0) {
                this.d.G();
            } else {
                this.f33791c.G();
            }
        } else {
            this.f33791c.G();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ActionBarLayout actionBarLayout;
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        super.onConfigurationChanged(configuration);
        if (!AndroidUtilities.isTablet() || (actionBarLayout = this.f33791c) == null) {
            return;
        }
        actionBarLayout.getView().getViewTreeObserver().addOnGlobalLayoutListener(new oz(this));
    }

    @Override
    public final void onCreate(Bundle bundle) {
        boolean z10;
        int i10;
        ApplicationLoader.postInitApplication();
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages);
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.m0(2));
        if (!SharedConfig.passcodeHash.isEmpty() && !SharedConfig.allowScreenCapture) {
            try {
                getWindow().setFlags(8192, 8192);
                AndroidUtilities.logFlagSecure();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        super.onCreate(bundle);
        if (!SharedConfig.passcodeHash.isEmpty() && SharedConfig.appLocked) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        AndroidUtilities.fillStatusBarHeight(this, false);
        org.telegram.ui.ActionBar.i6.S(this);
        org.telegram.ui.ActionBar.i6.J(this, false);
        this.f33791c = new ActionBarLayout(this, false);
        org.telegram.ui.ActionBar.y3 y3Var = new org.telegram.ui.ActionBar.y3(this);
        this.f33793f = y3Var;
        setContentView(y3Var, new ViewGroup.LayoutParams(-1, -1));
        if (AndroidUtilities.isTablet()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f33793f.addView(relativeLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            hg.r1 r1Var = new hg.r1(this, null, 2);
            this.f33792e = r1Var;
            r1Var.setOccupyStatusBar(false);
            this.f33792e.V(org.telegram.ui.ActionBar.i6.s0());
            relativeLayout.addView(this.f33792e, w7.x5.w(-1, -1));
            relativeLayout.addView(this.f33791c.getView(), w7.x5.w(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(2130706432);
            relativeLayout.addView(frameLayout, w7.x5.w(-1, -1));
            frameLayout.setOnTouchListener(new e0(this, 2));
            frameLayout.setOnClickListener(new ai.e2(17));
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
            relativeLayout.addView(view, w7.x5.w(530, i10));
            this.d.setFragmentStack(f33788y);
            this.d.setDelegate(this);
            this.d.setDrawerLayoutContainer(this.f33793f);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.f33793f.addView(relativeLayout2, w7.x5.d(-1.0f, -1));
            hg.r1 r1Var2 = new hg.r1(this, null, 3);
            this.f33792e = r1Var2;
            r1Var2.setOccupyStatusBar(false);
            this.f33792e.V(org.telegram.ui.ActionBar.i6.s0());
            relativeLayout2.addView(this.f33792e, w7.x5.w(-1, -1));
            relativeLayout2.addView(this.f33791c.getView(), w7.x5.w(-1, -1));
        }
        this.f33793f.setParentActionBarLayout(this.f33791c);
        this.f33791c.setDrawerLayoutContainer(this.f33793f);
        this.f33791c.setFragmentStack(f33787x);
        this.f33791c.setDelegate(this);
        org.telegram.ui.Components.ue0 ue0Var = new org.telegram.ui.Components.ue0(this);
        this.f33790b = ue0Var;
        this.f33793f.addView(ue0Var, w7.x5.d(-1.0f, -1));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeOtherAppActivities, this);
        this.f33791c.X();
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
        this.f33791c.J();
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
        this.f33791c.L();
        if (AndroidUtilities.isTablet()) {
            this.d.L();
        }
        ApplicationLoader.externalInterfacePaused = true;
        w5 w5Var = this.f33797w;
        if (w5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(w5Var);
            this.f33797w = null;
        }
        if (!SharedConfig.passcodeHash.isEmpty()) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            w5 w5Var2 = new w5(this, 3);
            this.f33797w = w5Var2;
            if (SharedConfig.appLocked) {
                AndroidUtilities.runOnUIThread(w5Var2, 1000L);
            } else {
                int i10 = SharedConfig.autoLockIn;
                if (i10 != 0) {
                    AndroidUtilities.runOnUIThread(w5Var2, (i10 * 1000) + 1000);
                }
            }
        } else {
            SharedConfig.lastPauseTime = 0;
        }
        SharedConfig.saveConfig();
        org.telegram.ui.Components.ue0 ue0Var = this.f33790b;
        if (ue0Var != null) {
            ue0Var.j();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f33791c.M();
        if (AndroidUtilities.isTablet()) {
            this.d.M();
        }
        ApplicationLoader.externalInterfacePaused = false;
        w5 w5Var = this.f33797w;
        if (w5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(w5Var);
            this.f33797w = null;
        }
        if (AndroidUtilities.needShowPasscode(true)) {
            i();
        }
        if (SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            SharedConfig.saveConfig();
        }
        if (this.f33790b.getVisibility() != 0) {
            this.f33791c.M();
            if (AndroidUtilities.isTablet()) {
                this.d.M();
                return;
            }
            return;
        }
        this.f33791c.n();
        if (AndroidUtilities.isTablet()) {
            this.d.n();
        }
        this.f33790b.k();
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void e(int[] iArr) {
    }
}
