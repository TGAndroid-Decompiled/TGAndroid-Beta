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
public class BubbleActivity extends h5 implements org.telegram.ui.ActionBar.a5 {
    public static BubbleActivity f21576a0;
    public boolean P;
    public final ArrayList Q = new ArrayList();
    public org.telegram.ui.Components.sd0 R;
    public ActionBarLayout S;
    public org.telegram.ui.ActionBar.z3 T;
    public Intent U;
    public boolean V;
    public int W;
    public boolean X;
    public w5 Y;
    public long Z;

    @Override
    public final boolean h(org.telegram.ui.ActionBar.n2 n2Var, ActionBarLayout actionBarLayout) {
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
        if (!this.P) {
            w5 w5Var = this.Y;
            if (w5Var != null) {
                AndroidUtilities.cancelRunOnUIThread(w5Var);
                this.Y = null;
            }
            this.P = true;
            f21576a0 = null;
        }
        finish();
        return false;
    }

    @Override
    public final boolean l(ActionBarLayout actionBarLayout, org.telegram.ui.ActionBar.b5 b5Var) {
        org.telegram.ui.ActionBar.n2 n2Var = b5Var.f20268a;
        return true;
    }

    @Override
    public final void onActivityResult(int i10, int i11, Intent intent) {
        org.telegram.ui.Components.p81 p81Var;
        super.onActivityResult(i10, i11, intent);
        ThemeEditorView themeEditorView = ThemeEditorView.f24159n;
        if (themeEditorView != null && (p81Var = themeEditorView.f24168k) != null) {
            p81Var.a(i10, i11, intent);
        }
        if (!this.S.getFragmentStack().isEmpty()) {
            ((org.telegram.ui.ActionBar.n2) this.S.getFragmentStack().get(this.S.getFragmentStack().size() - 1)).onActivityResultFragment(i10, i11, intent);
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.Q.size() == 1) {
            super.onBackPressed();
        } else if (this.R.getVisibility() == 0) {
            finish();
        } else if (PhotoViewer.t1().Q1()) {
            PhotoViewer.t1().G0(true, false);
        } else {
            this.S.G();
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
            } catch (Exception e7) {
                FileLog.e(e7);
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
        this.S = actionBarLayout;
        actionBarLayout.setInBubbleMode(true);
        this.S.setRemoveActionBarExtraHeight(true);
        org.telegram.ui.ActionBar.z3 z3Var = new org.telegram.ui.ActionBar.z3(this);
        this.T = z3Var;
        setContentView(z3Var, new ViewGroup.LayoutParams(-1, -1));
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.T.addView(relativeLayout, w7.x5.c(-1.0f, -1));
        relativeLayout.addView(this.S.getView(), w7.x5.w(-1, -1));
        this.T.setParentActionBarLayout(this.S);
        this.S.setDrawerLayoutContainer(this.T);
        this.S.setFragmentStack(this.Q);
        this.S.setDelegate(this);
        org.telegram.ui.Components.sd0 sd0Var = new org.telegram.ui.Components.sd0(this);
        this.R = sd0Var;
        this.T.addView(sd0Var, w7.x5.c(-1.0f, -1));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeOtherAppActivities, this);
        this.S.X();
        Intent intent = getIntent();
        if (bundle != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        y(intent, false, z10, false, UserConfig.selectedAccount);
        f21576a0 = this;
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        int i10 = this.O;
        if (i10 != -1) {
            AccountInstance.getInstance(i10).getNotificationsController().setOpenedInBubble(this.Z, false);
            AccountInstance.getInstance(this.O).getConnectionsManager().setAppPaused(false, false);
        }
        if (!this.P) {
            w5 w5Var = this.Y;
            if (w5Var != null) {
                AndroidUtilities.cancelRunOnUIThread(w5Var);
                this.Y = null;
            }
            this.P = true;
            f21576a0 = null;
        }
        f21576a0 = null;
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        this.S.J();
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        y(intent, true, false, false, UserConfig.selectedAccount);
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.S.L();
        ApplicationLoader.externalInterfacePaused = true;
        w5 w5Var = this.Y;
        if (w5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(w5Var);
            this.Y = null;
        }
        if (!SharedConfig.passcodeHash.isEmpty()) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            w5 w5Var2 = new w5(this, 0);
            this.Y = w5Var2;
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
        org.telegram.ui.Components.sd0 sd0Var = this.R;
        if (sd0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(sd0Var.R);
        }
        f21576a0 = null;
    }

    @Override
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (!v(i10, strArr, iArr)) {
            return;
        }
        if (!this.S.getFragmentStack().isEmpty()) {
            ((org.telegram.ui.ActionBar.n2) this.S.getFragmentStack().get(this.S.getFragmentStack().size() - 1)).onRequestPermissionsResultFragment(i10, strArr, iArr);
        }
        ui1.q(i10, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.S.M();
        ApplicationLoader.externalInterfacePaused = false;
        w5 w5Var = this.Y;
        if (w5Var != null) {
            AndroidUtilities.cancelRunOnUIThread(w5Var);
            this.Y = null;
        }
        if (AndroidUtilities.needShowPasscode(true)) {
            z();
        }
        if (SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            SharedConfig.saveConfig();
        }
        if (this.R.getVisibility() != 0) {
            this.S.M();
        } else {
            this.S.n();
            this.R.i();
        }
        f21576a0 = this;
    }

    public final void y(Intent intent, boolean z10, boolean z11, boolean z12, int i10) {
        co coVar;
        if (!z12 && (AndroidUtilities.needShowPasscode(true) || SharedConfig.isWaitingForPasscodeEnter)) {
            z();
            this.U = intent;
            this.V = z10;
            this.X = z11;
            this.W = i10;
            UserConfig.getInstance(i10).saveConfig(false);
            return;
        }
        int intExtra = intent.getIntExtra("currentAccount", UserConfig.selectedAccount);
        this.O = intExtra;
        if (!UserConfig.isValidAccount(intExtra)) {
            finish();
            return;
        }
        if (intent.getAction() != null && intent.getAction().startsWith("com.tmessages.openchat")) {
            long longExtra = intent.getLongExtra("chatId", 0L);
            long longExtra2 = intent.getLongExtra("userId", 0L);
            Bundle bundle = new Bundle();
            if (longExtra2 != 0) {
                this.Z = longExtra2;
                bundle.putLong("user_id", longExtra2);
            } else {
                this.Z = -longExtra;
                bundle.putLong("chat_id", longExtra);
            }
            coVar = new co(bundle);
            coVar.setInBubbleMode(true);
            coVar.setCurrentAccount(this.O);
        } else {
            coVar = null;
        }
        if (coVar == null) {
            finish();
            return;
        }
        NotificationCenter.getInstance(this.O).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(this.Z));
        this.S.X();
        this.S.c(-1, coVar);
        AccountInstance.getInstance(this.O).getNotificationsController().setOpenedInBubble(this.Z, true);
        AccountInstance.getInstance(this.O).getConnectionsManager().setAppPaused(false, false);
        this.S.c0();
    }

    public final void z() {
        if (this.R == null) {
            return;
        }
        SharedConfig.appLocked = true;
        if (SecretMediaViewer.g() && SecretMediaViewer.f().f34098s) {
            SecretMediaViewer.f().e(false, false);
        } else if (PhotoViewer.C1() && PhotoViewer.t1().Q1()) {
            PhotoViewer.t1().G0(false, true);
        } else if (i4.I() && i4.x().V) {
            i4.x().o(false, true);
        }
        this.R.j(false, -1, -1, null);
        SharedConfig.isWaitingForPasscodeEnter = true;
        this.R.setDelegate(new z0(this, 6));
    }

    @Override
    public final void a(float f7) {
    }

    @Override
    public final void e(int[] iArr) {
    }

    @Override
    public final void b(ActionBarLayout actionBarLayout, boolean z10) {
    }
}
