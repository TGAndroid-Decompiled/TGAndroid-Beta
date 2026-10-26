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
public class ExternalActionActivity extends Activity implements org.telegram.ui.ActionBar.f5 {
    public static final ArrayList f35498x = new ArrayList();
    public static final ArrayList f35499y = new ArrayList();
    public boolean f35500a;
    public org.telegram.ui.Components.le0 f35501b;
    public ActionBarLayout f35502c;
    public ActionBarLayout d;
    public org.telegram.ui.Components.vw0 e;
    public org.telegram.ui.ActionBar.d4 f35503f;
    public Intent h;
    public boolean f35504n;
    public int f35505r;
    public int f35506s;
    public boolean v;
    public y5 f35507w;

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (AndroidUtilities.isTablet() && actionBarLayout == this.d) {
            this.f35502c.W(z10, z10);
        }
    }

    public final boolean c(Intent intent, boolean z10, boolean z11, boolean z12, int i10, int i11) {
        if (z12 || (!AndroidUtilities.needShowPasscode(true) && !SharedConfig.isWaitingForPasscodeEnter)) {
            return true;
        }
        i();
        this.h = intent;
        this.f35504n = z10;
        this.v = z11;
        this.f35505r = i10;
        this.f35506s = i11;
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
                    this.f35504n = z10;
                    this.v = z11;
                    this.f35505r = i10;
                    this.f35506s = i11;
                    gg0 gg0Var = new gg0();
                    if (AndroidUtilities.isTablet()) {
                        this.d.c(-1, gg0Var);
                    } else {
                        this.f35502c.c(-1, gg0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        this.e.setVisibility(8);
                    }
                    this.f35502c.e0();
                    if (AndroidUtilities.isTablet()) {
                        this.d.e0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.PleaseLoginPassport);
                    org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
                    return;
                } else if (activatedAccountsCount >= 2) {
                    org.telegram.ui.ActionBar.e2 i12 = org.telegram.ui.Components.g5.i(this, new org.telegram.ui.Components.c5() {
                        @Override
                        public final void a(int i13) {
                            int i14;
                            ExternalActionActivity externalActionActivity = ExternalActionActivity.this;
                            int i15 = i10;
                            Intent intent2 = intent;
                            boolean z13 = z10;
                            boolean z14 = z11;
                            boolean z15 = z12;
                            ArrayList arrayList = ExternalActionActivity.f35498x;
                            if (i13 != i15 && i13 != (i14 = UserConfig.selectedAccount)) {
                                ConnectionsManager.getInstance(i14).setAppPaused(true, false);
                                UserConfig.selectedAccount = i13;
                                UserConfig.getInstance(0).saveConfig(false);
                                if (!ApplicationLoader.mainInterfacePaused) {
                                    ConnectionsManager.getInstance(UserConfig.selectedAccount).setAppPaused(false, false);
                                }
                            }
                            externalActionActivity.d(intent2, z13, z14, z15, i13, 1);
                        }
                    });
                    i12.show();
                    i12.setCanceledOnTouchOutside(false);
                    i12.setOnDismissListener(new u5(this, 6));
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
                org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(this, 3, null);
                e2Var.setOnCancelListener(new wy(i10, 0, iArr));
                e2Var.show();
                iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getauthorizationform, new y8(this, iArr, i10, e2Var, getauthorizationform, stringExtra2, stringExtra, 1), 10);
                return;
            }
            finish();
            return;
        }
        if (AndroidUtilities.isTablet()) {
            if (this.d.getFragmentStack().isEmpty()) {
                this.d.c(-1, new c7());
            }
        } else if (this.f35502c.getFragmentStack().isEmpty()) {
            this.f35502c.c(-1, new c7());
        }
        if (!AndroidUtilities.isTablet()) {
            this.e.setVisibility(8);
        }
        this.f35502c.e0();
        if (AndroidUtilities.isTablet()) {
            this.d.e0();
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
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f35502c.getView().getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                this.f35502c.getView().setLayoutParams(layoutParams2);
                return;
            }
            int i11 = (AndroidUtilities.displaySize.x / 100) * 35;
            if (i11 < AndroidUtilities.dp(320.0f)) {
                i11 = AndroidUtilities.dp(320.0f);
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f35502c.getView().getLayoutParams();
            layoutParams3.width = i11;
            layoutParams3.height = -1;
            this.f35502c.getView().setLayoutParams(layoutParams3);
            if (AndroidUtilities.isSmallTablet() && this.f35502c.getFragmentStack().size() == 2) {
                ((org.telegram.ui.ActionBar.r2) this.f35502c.getFragmentStack().get(1)).onPause();
                this.f35502c.getFragmentStack().remove(1);
                this.f35502c.e0();
            }
        }
    }

    public final void g() {
        if (this.f35500a) {
            return;
        }
        y5 y5Var = this.f35507w;
        if (y5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(y5Var);
            this.f35507w = null;
        }
        this.f35500a = true;
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.r2 r2Var, ActionBarLayout actionBarLayout) {
        return true;
    }

    public final void i() {
        if (this.f35501b == null) {
            return;
        }
        SharedConfig.appLocked = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f36191s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.E1() && PhotoViewer.u1().T1()) {
            PhotoViewer.u1().H0(false, true);
        } else if (j4.I() && j4.x().V) {
            j4.x().o(false, true);
        }
        this.f35501b.m(false, -1, -1, null);
        SharedConfig.isWaitingForPasscodeEnter = true;
        this.f35501b.setDelegate(new qt(this, 9));
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (AndroidUtilities.isTablet()) {
            if (actionBarLayout == this.f35502c && actionBarLayout.getFragmentStack().size() <= 1) {
                g();
                finish();
                return false;
            } else if (actionBarLayout == this.d && this.f35502c.getFragmentStack().isEmpty() && this.d.getFragmentStack().size() == 1) {
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
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.g5 g5Var) {
        org.telegram.ui.ActionBar.r2 r2Var = g5Var.f22662a;
        return true;
    }

    @Override
    public final void onBackPressed() {
        if (this.f35501b.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.u1().T1()) {
            PhotoViewer.u1().H0(true, false);
        } else if (AndroidUtilities.isTablet()) {
            if (this.d.getView().getVisibility() == 0) {
                this.d.H();
            } else {
                this.f35502c.H();
            }
        } else {
            this.f35502c.H();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ActionBarLayout actionBarLayout;
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        super.onConfigurationChanged(configuration);
        if (!AndroidUtilities.isTablet() || (actionBarLayout = this.f35502c) == null) {
            return;
        }
        actionBarLayout.getView().getViewTreeObserver().addOnGlobalLayoutListener(new xy(this));
    }

    @Override
    public final void onCreate(Bundle bundle) {
        boolean z10;
        int i10;
        ApplicationLoader.postInitApplication();
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages);
        getWindow().setBackgroundDrawable(new org.telegram.ui.Cells.y6(1));
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
        org.telegram.ui.ActionBar.y6.S(this);
        org.telegram.ui.ActionBar.y6.J(this, false);
        this.f35502c = new ActionBarLayout(this, false);
        org.telegram.ui.ActionBar.d4 d4Var = new org.telegram.ui.ActionBar.d4(this);
        this.f35503f = d4Var;
        setContentView(d4Var, new ViewGroup.LayoutParams(-1, -1));
        if (AndroidUtilities.isTablet()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f35503f.addView(relativeLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            jg.r1 r1Var = new jg.r1(this, null, 2);
            this.e = r1Var;
            r1Var.setOccupyStatusBar(false);
            this.e.U(org.telegram.ui.ActionBar.y6.s0());
            relativeLayout.addView(this.e, org.telegram.ui.Components.gb1.A(-1, -1));
            relativeLayout.addView(this.f35502c.getView(), org.telegram.ui.Components.gb1.A(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(2130706432);
            relativeLayout.addView(frameLayout, org.telegram.ui.Components.gb1.A(-1, -1));
            frameLayout.setOnTouchListener(new d0(this, 2));
            frameLayout.setOnClickListener(new bh.f(19));
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
            relativeLayout.addView(view, org.telegram.ui.Components.gb1.A(530, i10));
            this.d.setFragmentStack(f35499y);
            this.d.setDelegate(this);
            this.d.setDrawerLayoutContainer(this.f35503f);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.f35503f.addView(relativeLayout2, org.telegram.ui.Components.gb1.g(-1.0f, -1));
            jg.r1 r1Var2 = new jg.r1(this, null, 3);
            this.e = r1Var2;
            r1Var2.setOccupyStatusBar(false);
            this.e.U(org.telegram.ui.ActionBar.y6.s0());
            relativeLayout2.addView(this.e, org.telegram.ui.Components.gb1.A(-1, -1));
            relativeLayout2.addView(this.f35502c.getView(), org.telegram.ui.Components.gb1.A(-1, -1));
        }
        this.f35503f.setParentActionBarLayout(this.f35502c);
        this.f35502c.setDrawerLayoutContainer(this.f35503f);
        this.f35502c.setFragmentStack(f35498x);
        this.f35502c.setDelegate(this);
        org.telegram.ui.Components.le0 le0Var = new org.telegram.ui.Components.le0(this);
        this.f35501b = le0Var;
        this.f35503f.addView(le0Var, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeOtherAppActivities, this);
        this.f35502c.Z();
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
        this.f35502c.L();
        if (AndroidUtilities.isTablet()) {
            this.d.L();
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
        this.f35502c.N();
        if (AndroidUtilities.isTablet()) {
            this.d.N();
        }
        ApplicationLoader.externalInterfacePaused = true;
        y5 y5Var = this.f35507w;
        if (y5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(y5Var);
            this.f35507w = null;
        }
        if (!SharedConfig.passcodeHash.isEmpty()) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            y5 y5Var2 = new y5(this, 3);
            this.f35507w = y5Var2;
            if (SharedConfig.appLocked) {
                AndroidUtilities.runOnUIThread(y5Var2, 1000L);
            } else {
                int i10 = SharedConfig.autoLockIn;
                if (i10 != 0) {
                    AndroidUtilities.runOnUIThread(y5Var2, (i10 * 1000) + 1000);
                }
            }
        } else {
            SharedConfig.lastPauseTime = 0;
        }
        SharedConfig.saveConfig();
        org.telegram.ui.Components.le0 le0Var = this.f35501b;
        if (le0Var != null) {
            le0Var.k();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f35502c.O();
        if (AndroidUtilities.isTablet()) {
            this.d.O();
        }
        ApplicationLoader.externalInterfacePaused = false;
        y5 y5Var = this.f35507w;
        if (y5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(y5Var);
            this.f35507w = null;
        }
        if (AndroidUtilities.needShowPasscode(true)) {
            i();
        }
        if (SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            SharedConfig.saveConfig();
        }
        if (this.f35501b.getVisibility() != 0) {
            this.f35502c.O();
            if (AndroidUtilities.isTablet()) {
                this.d.O();
                return;
            }
            return;
        }
        this.f35502c.n();
        if (AndroidUtilities.isTablet()) {
            this.d.n();
        }
        this.f35501b.l();
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void e(int[] iArr) {
    }
}
