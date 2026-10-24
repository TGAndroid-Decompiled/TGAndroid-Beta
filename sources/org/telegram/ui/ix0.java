package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ix0 implements org.telegram.ui.ActionBar.z1 {
    public final int f38401a;
    public final PrivacySettingsActivity f38402b;

    public ix0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f38401a = i10;
        this.f38402b = privacySettingsActivity;
    }

    public void a() {
        int i10;
        switch (this.f38401a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.f38402b;
                jx0 jx0Var = privacySettingsActivity.f33871a;
                if (jx0Var != null && (i10 = privacySettingsActivity.f33880s) >= 0) {
                    jx0Var.m(i10);
                    return;
                }
                return;
            default:
                PrivacySettingsActivity.U(this.f38402b);
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        String string;
        switch (this.f38401a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f38402b;
                try {
                    Dialog dialog = privacySettingsActivity.visibleDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                alertDialog$Builder.f20679a.R = LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle);
                alertDialog$Builder.f20679a.T = LocaleController.getString("PrivacyPaymentsClearAlert", R.string.PrivacyPaymentsClearAlert);
                alertDialog$Builder.k(LocaleController.getString("ClearButton", R.string.ClearButton), new ix0(privacySettingsActivity, 1));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                privacySettingsActivity.showDialog(alertDialog$Builder.f20679a);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f20679a;
                privacySettingsActivity.showDialog(c2Var2);
                TextView textView = (TextView) c2Var2.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, null);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                PrivacySettingsActivity privacySettingsActivity2 = this.f38402b;
                boolean[] zArr = privacySettingsActivity2.Z;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity2.getUserConfig().tmpPassword = null;
                privacySettingsActivity2.getUserConfig().saveConfig(false);
                privacySettingsActivity2.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new ci.d6(8));
                boolean z10 = zArr[0];
                if (z10 && zArr[1]) {
                    string = LocaleController.getString("PrivacyPaymentsPaymentShippingCleared", R.string.PrivacyPaymentsPaymentShippingCleared);
                } else if (z10) {
                    string = LocaleController.getString("PrivacyPaymentsShippingInfoCleared", R.string.PrivacyPaymentsShippingInfoCleared);
                } else if (zArr[1]) {
                    string = LocaleController.getString("PrivacyPaymentsPaymentInfoCleared", R.string.PrivacyPaymentsPaymentInfoCleared);
                } else {
                    return;
                }
                org.telegram.ui.Components.vc.a0(privacySettingsActivity2).Q(R.raw.chats_infotip, 36, string).j();
                return;
            case 2:
            case 3:
            default:
                PrivacySettingsActivity privacySettingsActivity3 = this.f38402b;
                org.telegram.ui.ActionBar.c2 p5 = new AlertDialog$Builder(privacySettingsActivity3.getParentActivity(), 3, null).p();
                privacySettingsActivity3.f33875c = p5;
                p5.f20763i0 = false;
                if (privacySettingsActivity3.S != privacySettingsActivity3.T) {
                    UserConfig userConfig = privacySettingsActivity3.getUserConfig();
                    boolean z11 = privacySettingsActivity3.T;
                    userConfig.syncContacts = z11;
                    privacySettingsActivity3.S = z11;
                    privacySettingsActivity3.getUserConfig().saveConfig(false);
                }
                privacySettingsActivity3.getContactsController().deleteAllContacts(new hx0(privacySettingsActivity3, 1));
                return;
            case 4:
                hg0 hg0Var = new hg0();
                PrivacySettingsActivity privacySettingsActivity4 = this.f38402b;
                hx0 hx0Var = new hx0(privacySettingsActivity4, 2);
                hg0Var.F = 3;
                hg0Var.f37833a = 12;
                hg0Var.f37839d0 = hx0Var;
                privacySettingsActivity4.presentFragment(hg0Var);
                return;
        }
    }
}
