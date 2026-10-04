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
    public static final ArrayList f33746x = new ArrayList();
    public static final ArrayList f33747y = new ArrayList();
    public boolean f33748a;
    public org.telegram.ui.Components.ee0 f33749b;
    public ActionBarLayout f33750c;
    public ActionBarLayout d;
    public org.telegram.ui.Components.lw0 f33751e;
    public org.telegram.ui.ActionBar.y3 f33752f;
    public Intent h;
    public boolean f33753n;
    public int f33754r;
    public int f33755s;
    public boolean v;
    public x5 f33756w;

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
        if (AndroidUtilities.isTablet() && actionBarLayout == this.d) {
            this.f33750c.U(z10, z10);
        }
    }

    public final boolean c(Intent intent, boolean z10, boolean z11, boolean z12, int i10, int i11) {
        if (z12 || (!AndroidUtilities.needShowPasscode(true) && !SharedConfig.isWaitingForPasscodeEnter)) {
            return true;
        }
        i();
        this.h = intent;
        this.f33753n = z10;
        this.v = z11;
        this.f33754r = i10;
        this.f33755s = i11;
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
                    this.f33753n = z10;
                    this.v = z11;
                    this.f33754r = i10;
                    this.f33755s = i11;
                    ug0 ug0Var = new ug0();
                    if (AndroidUtilities.isTablet()) {
                        this.d.c(-1, ug0Var);
                    } else {
                        this.f33750c.c(-1, ug0Var);
                    }
                    if (!AndroidUtilities.isTablet()) {
                        this.f33751e.setVisibility(8);
                    }
                    this.f33750c.c0();
                    if (AndroidUtilities.isTablet()) {
                        this.d.c0();
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
                    alertDialog$Builder.f20372a.R = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.f20372a.T = LocaleController.getString(R.string.PleaseLoginPassport);
                    org.telegram.messenger.q.o(R.string.OK, alertDialog$Builder, null);
                    return;
                } else if (activatedAccountsCount >= 2) {
                    org.telegram.ui.ActionBar.b2 i12 = org.telegram.ui.Components.e5.i(this, new org.telegram.ui.Components.b5() {
                        @Override
                        public final void a(int i13) {
                            int i14;
                            ExternalActionActivity externalActionActivity = ExternalActionActivity.this;
                            int i15 = i10;
                            Intent intent2 = intent;
                            boolean z13 = z10;
                            boolean z14 = z11;
                            boolean z15 = z12;
                            ArrayList arrayList = ExternalActionActivity.f33746x;
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
                org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(this, 3, null);
                b2Var.setOnCancelListener(new oz(i10, 0, iArr));
                b2Var.show();
                iArr[0] = ConnectionsManager.getInstance(i10).sendRequest(getauthorizationform, new w8(this, iArr, i10, b2Var, getauthorizationform, stringExtra2, stringExtra, 1), 10);
                return;
            }
            finish();
            return;
        }
        if (AndroidUtilities.isTablet()) {
            if (this.d.getFragmentStack().isEmpty()) {
                this.d.c(-1, new a7());
            }
        } else if (this.f33750c.getFragmentStack().isEmpty()) {
            this.f33750c.c(-1, new a7());
        }
        if (!AndroidUtilities.isTablet()) {
            this.f33751e.setVisibility(8);
        }
        this.f33750c.c0();
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
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f33750c.getView().getLayoutParams();
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                this.f33750c.getView().setLayoutParams(layoutParams2);
                return;
            }
            int i11 = (AndroidUtilities.displaySize.x / 100) * 35;
            if (i11 < AndroidUtilities.dp(320.0f)) {
                i11 = AndroidUtilities.dp(320.0f);
            }
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.f33750c.getView().getLayoutParams();
            layoutParams3.width = i11;
            layoutParams3.height = -1;
            this.f33750c.getView().setLayoutParams(layoutParams3);
            if (AndroidUtilities.isSmallTablet() && this.f33750c.getFragmentStack().size() == 2) {
                ((org.telegram.ui.ActionBar.n2) this.f33750c.getFragmentStack().get(1)).onPause();
                this.f33750c.getFragmentStack().remove(1);
                this.f33750c.c0();
            }
        }
    }

    public final void g() {
        if (this.f33748a) {
            return;
        }
        x5 x5Var = this.f33756w;
        if (x5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x5Var);
            this.f33756w = null;
        }
        this.f33748a = true;
    }

    @Override
    public final boolean h(org.telegram.ui.ActionBar.n2 n2Var, ActionBarLayout actionBarLayout) {
        return true;
    }

    public final void i() {
        if (this.f33749b == null) {
            return;
        }
        SharedConfig.appLocked = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f34450s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.D1() && PhotoViewer.t1().R1()) {
            PhotoViewer.t1().G0(false, true);
        } else if (i4.I() && i4.x().V) {
            i4.x().o(false, true);
        }
        this.f33749b.j(false, -1, -1, null);
        SharedConfig.isWaitingForPasscodeEnter = true;
        this.f33749b.setDelegate(new bu(this, 9));
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (AndroidUtilities.isTablet()) {
            if (actionBarLayout == this.f33750c && actionBarLayout.getFragmentStack().size() <= 1) {
                g();
                finish();
                return false;
            } else if (actionBarLayout == this.d && this.f33750c.getFragmentStack().isEmpty() && this.d.getFragmentStack().size() == 1) {
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
        org.telegram.ui.ActionBar.n2 n2Var = a5Var.f20383a;
        return true;
    }

    @Override
    public final void onBackPressed() {
        if (this.f33749b.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.t1().R1()) {
            PhotoViewer.t1().G0(true, false);
        } else if (AndroidUtilities.isTablet()) {
            if (this.d.getView().getVisibility() == 0) {
                this.d.G();
            } else {
                this.f33750c.G();
            }
        } else {
            this.f33750c.G();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        ActionBarLayout actionBarLayout;
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        super.onConfigurationChanged(configuration);
        if (!AndroidUtilities.isTablet() || (actionBarLayout = this.f33750c) == null) {
            return;
        }
        actionBarLayout.getView().getViewTreeObserver().addOnGlobalLayoutListener(new pz(this));
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
        org.telegram.ui.ActionBar.i6.R(this);
        org.telegram.ui.ActionBar.i6.J(this, false);
        this.f33750c = new ActionBarLayout(this, false);
        org.telegram.ui.ActionBar.y3 y3Var = new org.telegram.ui.ActionBar.y3(this);
        this.f33752f = y3Var;
        setContentView(y3Var, new ViewGroup.LayoutParams(-1, -1));
        if (AndroidUtilities.isTablet()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.f33752f.addView(relativeLayout);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            relativeLayout.setLayoutParams(layoutParams);
            hg.q1 q1Var = new hg.q1(this, null, 2);
            this.f33751e = q1Var;
            q1Var.setOccupyStatusBar(false);
            this.f33751e.V(org.telegram.ui.ActionBar.i6.r0());
            relativeLayout.addView(this.f33751e, w7.z5.w(-1, -1));
            relativeLayout.addView(this.f33750c.getView(), w7.z5.w(-1, -1));
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.setBackgroundColor(2130706432);
            relativeLayout.addView(frameLayout, w7.z5.w(-1, -1));
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
            relativeLayout.addView(view, w7.z5.w(530, i10));
            this.d.setFragmentStack(f33747y);
            this.d.setDelegate(this);
            this.d.setDrawerLayoutContainer(this.f33752f);
        } else {
            RelativeLayout relativeLayout2 = new RelativeLayout(this);
            this.f33752f.addView(relativeLayout2, w7.z5.c(-1.0f, -1));
            hg.q1 q1Var2 = new hg.q1(this, null, 3);
            this.f33751e = q1Var2;
            q1Var2.setOccupyStatusBar(false);
            this.f33751e.V(org.telegram.ui.ActionBar.i6.r0());
            relativeLayout2.addView(this.f33751e, w7.z5.w(-1, -1));
            relativeLayout2.addView(this.f33750c.getView(), w7.z5.w(-1, -1));
        }
        this.f33752f.setParentActionBarLayout(this.f33750c);
        this.f33750c.setDrawerLayoutContainer(this.f33752f);
        this.f33750c.setFragmentStack(f33746x);
        this.f33750c.setDelegate(this);
        org.telegram.ui.Components.ee0 ee0Var = new org.telegram.ui.Components.ee0(this);
        this.f33749b = ee0Var;
        this.f33752f.addView(ee0Var, w7.z5.c(-1.0f, -1));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeOtherAppActivities, this);
        this.f33750c.X();
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
        this.f33750c.J();
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
        this.f33750c.L();
        if (AndroidUtilities.isTablet()) {
            this.d.L();
        }
        ApplicationLoader.externalInterfacePaused = true;
        x5 x5Var = this.f33756w;
        if (x5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x5Var);
            this.f33756w = null;
        }
        if (!SharedConfig.passcodeHash.isEmpty()) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            x5 x5Var2 = new x5(this, 3);
            this.f33756w = x5Var2;
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
        org.telegram.ui.Components.ee0 ee0Var = this.f33749b;
        if (ee0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ee0Var.R);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f33750c.M();
        if (AndroidUtilities.isTablet()) {
            this.d.M();
        }
        ApplicationLoader.externalInterfacePaused = false;
        x5 x5Var = this.f33756w;
        if (x5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x5Var);
            this.f33756w = null;
        }
        if (AndroidUtilities.needShowPasscode(true)) {
            i();
        }
        if (SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            SharedConfig.saveConfig();
        }
        if (this.f33749b.getVisibility() != 0) {
            this.f33750c.M();
            if (AndroidUtilities.isTablet()) {
                this.d.M();
                return;
            }
            return;
        }
        this.f33750c.n();
        if (AndroidUtilities.isTablet()) {
            this.d.n();
        }
        this.f33749b.i();
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void e(int[] iArr) {
    }
}
