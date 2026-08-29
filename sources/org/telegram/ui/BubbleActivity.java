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
public class BubbleActivity extends h5 implements org.telegram.ui.ActionBar.y4 {
    public static BubbleActivity W;
    public boolean L;
    public final ArrayList M = new ArrayList();
    public org.telegram.ui.Components.nd0 N;
    public ActionBarLayout O;
    public org.telegram.ui.ActionBar.x3 P;
    public Intent Q;
    public boolean R;
    public int S;
    public boolean T;
    public w5 U;
    public long V;

    @Override
    public final boolean h(org.telegram.ui.ActionBar.o2 o2Var, ActionBarLayout actionBarLayout) {
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
        if (!this.L) {
            w5 w5Var = this.U;
            if (w5Var != null) {
                AndroidUtilities.cancelRunOnUIThread(w5Var);
                this.U = null;
            }
            this.L = true;
            W = null;
        }
        finish();
        return false;
    }

    @Override
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.z4 z4Var) {
        org.telegram.ui.ActionBar.o2 o2Var = z4Var.f24012a;
        return true;
    }

    @Override
    public final void onActivityResult(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.g81 g81Var;
        super.onActivityResult(i10, i11, intent);
        ThemeEditorView themeEditorView = ThemeEditorView.f26564n;
        if (themeEditorView != null && (g81Var = themeEditorView.f26573k) != null) {
            g81Var.a(i10, i11, intent);
        }
        if (!this.O.getFragmentStack().isEmpty()) {
            ((org.telegram.ui.ActionBar.o2) this.O.getFragmentStack().get(this.O.getFragmentStack().size() - 1)).onActivityResultFragment(i10, i11, intent);
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.M.size() == 1) {
            super.onBackPressed();
        } else if (this.N.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.t1().Q1()) {
            PhotoViewer.t1().G0(true, false);
        } else {
            this.O.G();
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
        boolean z10;
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
        org.telegram.ui.ActionBar.g6.R(this);
        org.telegram.ui.ActionBar.g6.J(this, false);
        ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
        this.O = actionBarLayout;
        actionBarLayout.setInBubbleMode(true);
        this.O.setRemoveActionBarExtraHeight(true);
        org.telegram.ui.ActionBar.x3 x3Var = new org.telegram.ui.ActionBar.x3(this);
        this.P = x3Var;
        setContentView(x3Var, new ViewGroup.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.P.addView(relativeLayout, i7.f6.c(-1.0f, -1));
        relativeLayout.addView(this.O.getView(), i7.f6.w(-1, -1));
        this.P.setParentActionBarLayout(this.O);
        this.O.setDrawerLayoutContainer(this.P);
        this.O.setFragmentStack(this.M);
        this.O.setDelegate(this);
        org.telegram.ui.Components.nd0 nd0Var = new org.telegram.ui.Components.nd0(this);
        this.N = nd0Var;
        this.P.addView(nd0Var, i7.f6.c(-1.0f, -1));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeOtherAppActivities, this);
        this.O.X();
        Intent intent = getIntent();
        if (bundle != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        y(intent, false, z10, false, UserConfig.selectedAccount);
        W = this;
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        int i10 = this.K;
        if (i10 != -1) {
            AccountInstance.getInstance(i10).getNotificationsController().setOpenedInBubble(this.V, false);
            AccountInstance.getInstance(this.K).getConnectionsManager().setAppPaused(false, false);
        }
        if (!this.L) {
            w5 w5Var = this.U;
            if (w5Var != null) {
                AndroidUtilities.cancelRunOnUIThread(w5Var);
                this.U = null;
            }
            this.L = true;
            W = null;
        }
        W = null;
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        this.O.J();
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        y(intent, true, false, false, UserConfig.selectedAccount);
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.O.L();
        ApplicationLoader.externalInterfacePaused = true;
        w5 w5Var = this.U;
        if (w5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(w5Var);
            this.U = null;
        }
        if (!SharedConfig.passcodeHash.isEmpty()) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            w5 w5Var2 = new w5(this, 0);
            this.U = w5Var2;
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
        org.telegram.ui.Components.nd0 nd0Var = this.N;
        if (nd0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(nd0Var.N);
        }
        W = null;
    }

    @Override
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (!u(i10, strArr, iArr)) {
            return;
        }
        if (!this.O.getFragmentStack().isEmpty()) {
            ((org.telegram.ui.ActionBar.o2) this.O.getFragmentStack().get(this.O.getFragmentStack().size() - 1)).onRequestPermissionsResultFragment(i10, strArr, iArr);
        }
        oh1.q(i10, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.O.M();
        ApplicationLoader.externalInterfacePaused = false;
        w5 w5Var = this.U;
        if (w5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(w5Var);
            this.U = null;
        }
        if (AndroidUtilities.needShowPasscode(true)) {
            z();
        }
        if (SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            SharedConfig.saveConfig();
        }
        if (this.N.getVisibility() != 0) {
            this.O.M();
        } else {
            this.O.n();
            this.N.i();
        }
        W = this;
    }

    public final void y(Intent intent, boolean z10, boolean z11, boolean z12, int i10) {
        tn tnVar;
        if (!z12 && (AndroidUtilities.needShowPasscode(true) || SharedConfig.isWaitingForPasscodeEnter)) {
            z();
            this.Q = intent;
            this.R = z10;
            this.T = z11;
            this.S = i10;
            UserConfig.getInstance(i10).saveConfig(false);
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", UserConfig.selectedAccount);
        this.K = intExtra;
        if (!UserConfig.isValidAccount(intExtra)) {
            finish();
            return;
        }
        if (intent.getAction() != null && intent.getAction().startsWith("com.tmessages.openchat")) {
            long longExtra = intent.getLongExtra("chatId", 0L);
            long longExtra2 = intent.getLongExtra("userId", 0L);
            Bundle bundle = new Bundle();
            if (longExtra2 != 0) {
                this.V = longExtra2;
                bundle.putLong("user_id", longExtra2);
            } else {
                this.V = -longExtra;
                bundle.putLong("chat_id", longExtra);
            }
            tnVar = new tn(bundle);
            tnVar.setInBubbleMode(true);
            tnVar.setCurrentAccount(this.K);
        } else {
            tnVar = null;
        }
        if (tnVar == null) {
            finish();
            return;
        }
        NotificationCenter.getInstance(this.K).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(this.V));
        this.O.X();
        this.O.c(-1, tnVar);
        AccountInstance.getInstance(this.K).getNotificationsController().setOpenedInBubble(this.V, true);
        AccountInstance.getInstance(this.K).getConnectionsManager().setAppPaused(false, false);
        this.O.c0();
    }

    public final void z() {
        if (this.N == null) {
            return;
        }
        SharedConfig.appLocked = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f36222s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
            PhotoViewer.t1().G0(false, true);
        } else if (m4.I() && m4.x().R) {
            m4.x().o(false, true);
        }
        this.N.j(false, -1, -1, null);
        SharedConfig.isWaitingForPasscodeEnter = true;
        this.N.setDelegate(new c1(this, 6));
    }

    @Override
    public final void a(float f9) {
    }

    @Override
    public final void e(int[] iArr) {
    }

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
    }
}
