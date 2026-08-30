package org.telegram.ui;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ThemeEditorView;
public class BubbleActivity extends j5 implements org.telegram.ui.ActionBar.b5 {
    public static BubbleActivity X;
    public boolean M;
    public final ArrayList N = new ArrayList();
    public org.telegram.ui.Components.vd0 O;
    public ActionBarLayout P;
    public org.telegram.ui.ActionBar.y3 Q;
    public Intent R;
    public boolean S;
    public int T;
    public boolean U;
    public z5 V;
    public long W;

    @Override
    public final boolean h(org.telegram.ui.ActionBar.p2 p2Var, ActionBarLayout actionBarLayout) {
        return true;
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final boolean k(ActionBarLayout actionBarLayout) {
        if (actionBarLayout.getFragmentStack().size() > 1) {
            return true;
        }
        if (!this.M) {
            z5 z5Var = this.V;
            if (z5Var != null) {
                AndroidUtilities.cancelRunOnUIThread(z5Var);
                this.V = null;
            }
            this.M = true;
            X = null;
        }
        finish();
        return false;
    }

    @Override
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.c5 c5Var) {
        org.telegram.ui.ActionBar.p2 p2Var = c5Var.f19549a;
        return true;
    }

    @Override
    public final void onActivityResult(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.s81 s81Var;
        super.onActivityResult(i10, i11, intent);
        ThemeEditorView themeEditorView = ThemeEditorView.f23192n;
        if (themeEditorView != null && (s81Var = themeEditorView.f23200k) != null) {
            s81Var.a(i10, i11, intent);
        }
        if (!this.P.getFragmentStack().isEmpty()) {
            ((org.telegram.ui.ActionBar.p2) this.P.getFragmentStack().get(this.P.getFragmentStack().size() - 1)).onActivityResultFragment(i10, i11, intent);
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.N.size() == 1) {
            super.onBackPressed();
        } else if (this.O.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.t1().Q1()) {
            PhotoViewer.t1().G0(true, false);
        } else {
            this.P.G();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        super.onConfigurationChanged(configuration);
    }

    @Override
    public final void onCreate(Bundle bundle) {
        boolean z4;
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
        ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
        this.P = actionBarLayout;
        actionBarLayout.setInBubbleMode(true);
        this.P.setRemoveActionBarExtraHeight(true);
        org.telegram.ui.ActionBar.y3 y3Var = new org.telegram.ui.ActionBar.y3(this);
        this.Q = y3Var;
        setContentView(y3Var, new ViewGroup.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.Q.addView(relativeLayout, k7.b6.c(-1.0f, -1));
        relativeLayout.addView(this.P.getView(), k7.b6.w(-1, -1));
        this.Q.setParentActionBarLayout(this.P);
        this.P.setDrawerLayoutContainer(this.Q);
        this.P.setFragmentStack(this.N);
        this.P.setDelegate(this);
        org.telegram.ui.Components.vd0 vd0Var = new org.telegram.ui.Components.vd0(this);
        this.O = vd0Var;
        this.Q.addView(vd0Var, k7.b6.c(-1.0f, -1));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeOtherAppActivities, this);
        this.P.X();
        Intent intent = getIntent();
        if (bundle != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        y(intent, false, z4, false, UserConfig.selectedAccount);
        X = this;
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        int i10 = this.L;
        if (i10 != -1) {
            AccountInstance.getInstance(i10).getNotificationsController().setOpenedInBubble(this.W, false);
            AccountInstance.getInstance(this.L).getConnectionsManager().setAppPaused(false, false);
        }
        if (!this.M) {
            z5 z5Var = this.V;
            if (z5Var != null) {
                AndroidUtilities.cancelRunOnUIThread(z5Var);
                this.V = null;
            }
            this.M = true;
            X = null;
        }
        X = null;
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        this.P.J();
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        y(intent, true, false, false, UserConfig.selectedAccount);
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.P.L();
        ApplicationLoader.externalInterfacePaused = true;
        z5 z5Var = this.V;
        if (z5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(z5Var);
            this.V = null;
        }
        if (!SharedConfig.passcodeHash.isEmpty()) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            z5 z5Var2 = new z5(this, 0);
            this.V = z5Var2;
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
        org.telegram.ui.Components.vd0 vd0Var = this.O;
        if (vd0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(vd0Var.O);
        }
        X = null;
    }

    @Override
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (!u(i10, strArr, iArr)) {
            return;
        }
        if (!this.P.getFragmentStack().isEmpty()) {
            ((org.telegram.ui.ActionBar.p2) this.P.getFragmentStack().get(this.P.getFragmentStack().size() - 1)).onRequestPermissionsResultFragment(i10, strArr, iArr);
        }
        ai1.q(i10, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.P.M();
        ApplicationLoader.externalInterfacePaused = false;
        z5 z5Var = this.V;
        if (z5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(z5Var);
            this.V = null;
        }
        if (AndroidUtilities.needShowPasscode(true)) {
            z();
        }
        if (SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            SharedConfig.saveConfig();
        }
        if (this.O.getVisibility() != 0) {
            this.P.M();
        } else {
            this.P.n();
            this.O.i();
        }
        X = this;
    }

    public final void y(Intent intent, boolean z4, boolean z10, boolean z11, int i10) {
        xn xnVar;
        if (!z11 && (AndroidUtilities.needShowPasscode(true) || SharedConfig.isWaitingForPasscodeEnter)) {
            z();
            this.R = intent;
            this.S = z4;
            this.U = z10;
            this.T = i10;
            UserConfig.getInstance(i10).saveConfig(false);
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", UserConfig.selectedAccount);
        this.L = intExtra;
        if (!UserConfig.isValidAccount(intExtra)) {
            finish();
            return;
        }
        if (intent.getAction() != null && intent.getAction().startsWith("com.tmessages.openchat")) {
            long longExtra = intent.getLongExtra("chatId", 0L);
            long longExtra2 = intent.getLongExtra("userId", 0L);
            Bundle bundle = new Bundle();
            if (longExtra2 != 0) {
                this.W = longExtra2;
                bundle.putLong("user_id", longExtra2);
            } else {
                this.W = -longExtra;
                bundle.putLong("chat_id", longExtra);
            }
            xnVar = new xn(bundle);
            xnVar.setInBubbleMode(true);
            xnVar.setCurrentAccount(this.L);
        } else {
            xnVar = null;
        }
        if (xnVar == null) {
            finish();
            return;
        }
        NotificationCenter.getInstance(this.L).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(this.W));
        this.P.X();
        this.P.c(-1, xnVar);
        AccountInstance.getInstance(this.L).getNotificationsController().setOpenedInBubble(this.W, true);
        AccountInstance.getInstance(this.L).getConnectionsManager().setAppPaused(false, false);
        this.P.c0();
    }

    public final void z() {
        if (this.O == null) {
            return;
        }
        SharedConfig.appLocked = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f32264s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
            PhotoViewer.t1().G0(false, true);
        } else if (l4.I() && l4.x().S) {
            l4.x().o(false, true);
        }
        this.O.j(false, -1, -1, null);
        SharedConfig.isWaitingForPasscodeEnter = true;
        this.O.setDelegate(new a1(this, 6));
    }

    @Override
    public final void a(float f10) {
    }

    @Override
    public final void e(int[] iArr) {
    }

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z4) {
    }
}
