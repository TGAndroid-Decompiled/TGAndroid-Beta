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
    public static final ArrayList f29902x = new ArrayList();
    public static final ArrayList f29903y = new ArrayList();
    public boolean f29904a;
    public org.telegram.ui.Components.be0 f29905b;
    public ActionBarLayout f29906c;
    public ActionBarLayout d;
    public org.telegram.ui.Components.aw0 e;
    public org.telegram.ui.ActionBar.b4 f29907f;
    public Intent h;
    public boolean f29908n;
    public int f29909r;
    public int f29910s;
    public boolean v;
    public x5 f29911w;

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (AndroidUtilities.isTablet() && actionBarLayout == this.d) {
            this.f29906c.U(z10, z10);
        }
    }

    public final boolean c(Intent intent, boolean z10, boolean z11, boolean z12, int i10, int i11) {
        if (z12 || (!AndroidUtilities.needShowPasscode(true) && !SharedConfig.isWaitingForPasscodeEnter)) {
            return true;
        }
        i();
        this.h = intent;
        this.f29908n = z10;
        this.v = z11;
        this.f29909r = i10;
        this.f29910s = i11;
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
                    this.f29908n = z10;
                    this.v = z11;
                    this.f29909r = i10;
                    this.f29910s = i11;
                    xg0 xg0Var = new xg0();
                    if (AndroidUtilities.isTablet()) {
                        this.d.c(-1, xg0Var);
                    } else {
                        this.f29906c.c(-1, xg0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        this.e.setVisibility(8);
                    }
                    this.f29906c.c0();
                    if (AndroidUtilities.isTablet()) {
                        this.d.c0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.PleaseLoginPassport);
                    hc.b.A(R.string.OK, alertDialog$Builder, null);
                    return;
                } else if (activatedAccountsCount >= 2) {
                    org.telegram.ui.ActionBar.d2 i12 = org.telegram.ui.Components.d5.i(this, new org.telegram.ui.Components.a5() {
                        @Override
                        public final void a(int i13) {
                            int i14;
                            ExternalActionActivity externalActionActivity = ExternalActionActivity.this;
                            int i15 = i10;
                            Intent intent2 = intent;
                            boolean z13 = z10;
                            boolean z14 = z11;
                            boolean z15 = z12;
                            ArrayList arrayList = ExternalActionActivity.f29902x;
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
                    i12.setOnDismissListener(new s5(this, 6));
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
                d2Var.setOnCancelListener(new qz(i10, 0, iArr));
                d2Var.show();
                iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getauthorizationform, new u8(this, iArr, i10, d2Var, getauthorizationform, stringExtra2, stringExtra, 1), 10);
                return;
            }
            finish();
            return;
        }
        if (AndroidUtilities.isTablet()) {
            if (this.d.getFragmentStack().isEmpty()) {
                this.d.c(-1, new y6());
            }
        } else if (this.f29906c.getFragmentStack().isEmpty()) {
            this.f29906c.c(-1, new y6());
        }
        if (!AndroidUtilities.isTablet()) {
            this.e.setVisibility(8);
        }
        this.f29906c.c0();
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
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f29906c.getView().getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                this.f29906c.getView().setLayoutParams(layoutParams2);
                return;
            }
            int i11 = (AndroidUtilities.displaySize.x / 100) * 35;
            if (i11 < AndroidUtilities.dp(320.0f)) {
                i11 = AndroidUtilities.dp(320.0f);
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f29906c.getView().getLayoutParams();
            layoutParams3.width = i11;
            layoutParams3.height = -1;
            this.f29906c.getView().setLayoutParams(layoutParams3);
            if (AndroidUtilities.isSmallTablet() && this.f29906c.getFragmentStack().size() == 2) {
                ((org.telegram.ui.ActionBar.p2) this.f29906c.getFragmentStack().get(1)).onPause();
                this.f29906c.getFragmentStack().remove(1);
                this.f29906c.c0();
            }
        }
    }

    public final void g() {
        if (this.f29904a) {
            return;
        }
        x5 x5Var = this.f29911w;
        if (x5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x5Var);
            this.f29911w = null;
        }
        this.f29904a = true;
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.p2 p2Var, ActionBarLayout actionBarLayout) {
        return true;
    }

    public final void i() {
        if (this.f29905b == null) {
            return;
        }
        SharedConfig.appLocked = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f30588s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
            PhotoViewer.t1().G0(false, true);
        } else if (j4.I() && j4.x().V) {
            j4.x().o(false, true);
        }
        this.f29905b.j(false, -1, -1, null);
        SharedConfig.isWaitingForPasscodeEnter = true;
        this.f29905b.setDelegate(new iu(this, 7));
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (AndroidUtilities.isTablet()) {
            if (actionBarLayout == this.f29906c && actionBarLayout.getFragmentStack().size() <= 1) {
                g();
                finish();
                return false;
            } else if (actionBarLayout == this.d && this.f29906c.getFragmentStack().isEmpty() && this.d.getFragmentStack().size() == 1) {
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
        org.telegram.ui.ActionBar.p2 p2Var = d5Var.f17651a;
        return true;
    }

    @Override
    public final void onBackPressed() {
        if (this.f29905b.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.t1().Q1()) {
            PhotoViewer.t1().G0(true, false);
        } else if (AndroidUtilities.isTablet()) {
            if (this.d.getView().getVisibility() == 0) {
                this.d.G();
            } else {
                this.f29906c.G();
            }
        } else {
            this.f29906c.G();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ActionBarLayout actionBarLayout;
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        super.onConfigurationChanged(configuration);
        if (!AndroidUtilities.isTablet() || (actionBarLayout = this.f29906c) == null) {
            return;
        }
        actionBarLayout.getView().getViewTreeObserver().addOnGlobalLayoutListener(new rz(this));
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
        org.telegram.ui.ActionBar.j6.R(this);
        org.telegram.ui.ActionBar.j6.J(this, false);
        this.f29906c = new ActionBarLayout(this, false);
        org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4(this);
        this.f29907f = b4Var;
        setContentView(b4Var, new ViewGroup.LayoutParams(-1, -1));
        if (AndroidUtilities.isTablet()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f29907f.addView(relativeLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            gg.z1 z1Var = new gg.z1(this, null, 2);
            this.e = z1Var;
            z1Var.setOccupyStatusBar(false);
            this.e.V(org.telegram.ui.ActionBar.j6.r0());
            relativeLayout.addView(this.e, w7.a6.w(-1, -1));
            relativeLayout.addView(this.f29906c.getView(), w7.a6.w(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(2130706432);
            relativeLayout.addView(frameLayout, w7.a6.w(-1, -1));
            frameLayout.setOnTouchListener(new e0(this, 2));
            frameLayout.setOnClickListener(new bi.d5(16));
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
            this.d.setFragmentStack(f29903y);
            this.d.setDelegate(this);
            this.d.setDrawerLayoutContainer(this.f29907f);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.f29907f.addView(relativeLayout2, w7.a6.c(-1.0f, -1));
            gg.z1 z1Var2 = new gg.z1(this, null, 3);
            this.e = z1Var2;
            z1Var2.setOccupyStatusBar(false);
            this.e.V(org.telegram.ui.ActionBar.j6.r0());
            relativeLayout2.addView(this.e, w7.a6.w(-1, -1));
            relativeLayout2.addView(this.f29906c.getView(), w7.a6.w(-1, -1));
        }
        this.f29907f.setParentActionBarLayout(this.f29906c);
        this.f29906c.setDrawerLayoutContainer(this.f29907f);
        this.f29906c.setFragmentStack(f29902x);
        this.f29906c.setDelegate(this);
        org.telegram.ui.Components.be0 be0Var = new org.telegram.ui.Components.be0(this);
        this.f29905b = be0Var;
        this.f29907f.addView(be0Var, w7.a6.c(-1.0f, -1));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeOtherAppActivities, this);
        this.f29906c.X();
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
        this.f29906c.J();
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
        this.f29906c.L();
        if (AndroidUtilities.isTablet()) {
            this.d.L();
        }
        ApplicationLoader.externalInterfacePaused = true;
        x5 x5Var = this.f29911w;
        if (x5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x5Var);
            this.f29911w = null;
        }
        if (!SharedConfig.passcodeHash.isEmpty()) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            x5 x5Var2 = new x5(this, 3);
            this.f29911w = x5Var2;
            if (SharedConfig.appLocked) {
                AndroidUtilities.runOnUIThread(x5Var2, 1000L);
            } else {
                int i10 = SharedConfig.autoLockIn;
                if (i10 != 0) {
                    AndroidUtilities.runOnUIThread(x5Var2, (i10 * 1000) + 1000);
                }
            }
        } else {
            SharedConfig.lastPauseTime = 0;
        }
        SharedConfig.saveConfig();
        org.telegram.ui.Components.be0 be0Var = this.f29905b;
        if (be0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(be0Var.R);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f29906c.M();
        if (AndroidUtilities.isTablet()) {
            this.d.M();
        }
        ApplicationLoader.externalInterfacePaused = false;
        x5 x5Var = this.f29911w;
        if (x5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x5Var);
            this.f29911w = null;
        }
        if (AndroidUtilities.needShowPasscode(true)) {
            i();
        }
        if (SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            SharedConfig.saveConfig();
        }
        if (this.f29905b.getVisibility() != 0) {
            this.f29906c.M();
            if (AndroidUtilities.isTablet()) {
                this.d.M();
                return;
            }
            return;
        }
        this.f29906c.n();
        if (AndroidUtilities.isTablet()) {
            this.d.n();
        }
        this.f29905b.i();
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void e(int[] iArr) {
    }
}
