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
public class ExternalActionActivity extends Activity implements org.telegram.ui.ActionBar.a5 {
    public static final ArrayList f33131x = new ArrayList();
    public static final ArrayList f33132y = new ArrayList();
    public boolean f33133a;
    public org.telegram.ui.Components.me0 f33134b;
    public ActionBarLayout f33135c;
    public ActionBarLayout d;
    public org.telegram.ui.Components.lw0 e;
    public org.telegram.ui.ActionBar.y3 f33136f;
    public Intent h;
    public boolean f33137n;
    public int f33138r;
    public int f33139s;
    public boolean v;
    public a6 f33140w;

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (AndroidUtilities.isTablet() && actionBarLayout == this.d) {
            this.f33135c.U(z10, z10);
        }
    }

    public final boolean c(Intent intent, boolean z10, boolean z11, boolean z12, int i10, int i11) {
        if (z12 || (!AndroidUtilities.needShowPasscode(true) && !SharedConfig.isWaitingForPasscodeEnter)) {
            return true;
        }
        i();
        this.h = intent;
        this.f33137n = z10;
        this.v = z11;
        this.f33138r = i10;
        this.f33139s = i11;
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
                    this.f33137n = z10;
                    this.v = z11;
                    this.f33138r = i10;
                    this.f33139s = i11;
                    dg0 dg0Var = new dg0();
                    if (AndroidUtilities.isTablet()) {
                        this.d.c(-1, dg0Var);
                    } else {
                        this.f33135c.c(-1, dg0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        this.e.setVisibility(8);
                    }
                    this.f33135c.c0();
                    if (AndroidUtilities.isTablet()) {
                        this.d.c0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.f20605a.T = LocaleController.getString(R.string.PleaseLoginPassport);
                    org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
                    return;
                } else if (activatedAccountsCount >= 2) {
                    org.telegram.ui.ActionBar.b2 h = org.telegram.ui.Components.f5.h(this, new org.telegram.ui.Components.c5() {
                        @Override
                        public final void a(int i12) {
                            int i13;
                            ExternalActionActivity externalActionActivity = ExternalActionActivity.this;
                            int i14 = i10;
                            Intent intent2 = intent;
                            boolean z13 = z10;
                            boolean z14 = z11;
                            boolean z15 = z12;
                            ArrayList arrayList = ExternalActionActivity.f33131x;
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
                    h.setOnDismissListener(new w5(this, 6));
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
                b2Var.setOnCancelListener(new wy(i10, 0, iArr));
                b2Var.show();
                iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getauthorizationform, new w8(this, iArr, i10, b2Var, getauthorizationform, stringExtra2, stringExtra, 1), 10);
                return;
            }
            finish();
            return;
        }
        if (AndroidUtilities.isTablet()) {
            if (this.d.getFragmentStack().isEmpty()) {
                this.d.c(-1, new c7());
            }
        } else if (this.f33135c.getFragmentStack().isEmpty()) {
            this.f33135c.c(-1, new c7());
        }
        if (!AndroidUtilities.isTablet()) {
            this.e.setVisibility(8);
        }
        this.f33135c.c0();
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
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f33135c.getView().getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                this.f33135c.getView().setLayoutParams(layoutParams2);
                return;
            }
            int i11 = (AndroidUtilities.displaySize.x / 100) * 35;
            if (i11 < AndroidUtilities.dp(320.0f)) {
                i11 = AndroidUtilities.dp(320.0f);
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f33135c.getView().getLayoutParams();
            layoutParams3.width = i11;
            layoutParams3.height = -1;
            this.f33135c.getView().setLayoutParams(layoutParams3);
            if (AndroidUtilities.isSmallTablet() && this.f33135c.getFragmentStack().size() == 2) {
                ((org.telegram.ui.ActionBar.n2) this.f33135c.getFragmentStack().get(1)).onPause();
                this.f33135c.getFragmentStack().remove(1);
                this.f33135c.c0();
            }
        }
    }

    public final void g() {
        if (this.f33133a) {
            return;
        }
        a6 a6Var = this.f33140w;
        if (a6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a6Var);
            this.f33140w = null;
        }
        this.f33133a = true;
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.n2 n2Var, ActionBarLayout actionBarLayout) {
        return true;
    }

    public final void i() {
        if (this.f33134b == null) {
            return;
        }
        SharedConfig.appLocked = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f33824s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.E1() && PhotoViewer.u1().T1()) {
            PhotoViewer.u1().H0(false, true);
        } else if (l4.I() && l4.x().V) {
            l4.x().o(false, true);
        }
        this.f33134b.m(false, -1, -1, null);
        SharedConfig.isWaitingForPasscodeEnter = true;
        this.f33134b.setDelegate(new ut(this, 7));
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (AndroidUtilities.isTablet()) {
            if (actionBarLayout == this.f33135c && actionBarLayout.getFragmentStack().size() <= 1) {
                g();
                finish();
                return false;
            } else if (actionBarLayout == this.d && this.f33135c.getFragmentStack().isEmpty() && this.d.getFragmentStack().size() == 1) {
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
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.b5 b5Var) {
        org.telegram.ui.ActionBar.n2 n2Var = b5Var.f20704a;
        return true;
    }

    @Override
    public final void onBackPressed() {
        if (this.f33134b.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.u1().T1()) {
            PhotoViewer.u1().H0(true, false);
        } else if (AndroidUtilities.isTablet()) {
            if (this.d.getView().getVisibility() == 0) {
                this.d.G();
            } else {
                this.f33135c.G();
            }
        } else {
            this.f33135c.G();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ActionBarLayout actionBarLayout;
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        super.onConfigurationChanged(configuration);
        if (!AndroidUtilities.isTablet() || (actionBarLayout = this.f33135c) == null) {
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
        org.telegram.ui.ActionBar.h6.S(this);
        org.telegram.ui.ActionBar.h6.J(this, false);
        this.f33135c = new ActionBarLayout(this, false);
        org.telegram.ui.ActionBar.y3 y3Var = new org.telegram.ui.ActionBar.y3(this);
        this.f33136f = y3Var;
        setContentView(y3Var, new ViewGroup.LayoutParams(-1, -1));
        if (AndroidUtilities.isTablet()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f33136f.addView(relativeLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            ig.p1 p1Var = new ig.p1(this, null, 2);
            this.e = p1Var;
            p1Var.setOccupyStatusBar(false);
            this.e.V(org.telegram.ui.ActionBar.h6.s0());
            relativeLayout.addView(this.e, w7.z5.w(-1, -1));
            relativeLayout.addView(this.f33135c.getView(), w7.z5.w(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(2130706432);
            relativeLayout.addView(frameLayout, w7.z5.w(-1, -1));
            frameLayout.setOnTouchListener(new e0(this, 2));
            frameLayout.setOnClickListener(new ah.f(19));
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
            relativeLayout.addView(view, w7.z5.w(530, i10));
            this.d.setFragmentStack(f33132y);
            this.d.setDelegate(this);
            this.d.setDrawerLayoutContainer(this.f33136f);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.f33136f.addView(relativeLayout2, w7.z5.c(-1.0f, -1));
            ig.p1 p1Var2 = new ig.p1(this, null, 3);
            this.e = p1Var2;
            p1Var2.setOccupyStatusBar(false);
            this.e.V(org.telegram.ui.ActionBar.h6.s0());
            relativeLayout2.addView(this.e, w7.z5.w(-1, -1));
            relativeLayout2.addView(this.f33135c.getView(), w7.z5.w(-1, -1));
        }
        this.f33136f.setParentActionBarLayout(this.f33135c);
        this.f33135c.setDrawerLayoutContainer(this.f33136f);
        this.f33135c.setFragmentStack(f33131x);
        this.f33135c.setDelegate(this);
        org.telegram.ui.Components.me0 me0Var = new org.telegram.ui.Components.me0(this);
        this.f33134b = me0Var;
        this.f33136f.addView(me0Var, w7.z5.c(-1.0f, -1));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeOtherAppActivities, this);
        this.f33135c.X();
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
        this.f33135c.J();
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
        this.f33135c.L();
        if (AndroidUtilities.isTablet()) {
            this.d.L();
        }
        ApplicationLoader.externalInterfacePaused = true;
        a6 a6Var = this.f33140w;
        if (a6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a6Var);
            this.f33140w = null;
        }
        if (!SharedConfig.passcodeHash.isEmpty()) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            a6 a6Var2 = new a6(this, 3);
            this.f33140w = a6Var2;
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
        org.telegram.ui.Components.me0 me0Var = this.f33134b;
        if (me0Var != null) {
            me0Var.k();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f33135c.M();
        if (AndroidUtilities.isTablet()) {
            this.d.M();
        }
        ApplicationLoader.externalInterfacePaused = false;
        a6 a6Var = this.f33140w;
        if (a6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(a6Var);
            this.f33140w = null;
        }
        if (AndroidUtilities.needShowPasscode(true)) {
            i();
        }
        if (SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            SharedConfig.saveConfig();
        }
        if (this.f33134b.getVisibility() != 0) {
            this.f33135c.M();
            if (AndroidUtilities.isTablet()) {
                this.d.M();
                return;
            }
            return;
        }
        this.f33135c.n();
        if (AndroidUtilities.isTablet()) {
            this.d.n();
        }
        this.f33134b.l();
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void e(int[] iArr) {
    }
}
