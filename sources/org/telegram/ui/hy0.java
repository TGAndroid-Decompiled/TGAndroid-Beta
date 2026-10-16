package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hy0 implements org.telegram.ui.ActionBar.z1 {
    public final int f36668a;
    public final PrivacySettingsActivity f36669b;

    public hy0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f36668a = i10;
        this.f36669b = privacySettingsActivity;
    }

    public void a() {
        int i10;
        switch (this.f36668a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.f36669b;
                iy0 iy0Var = privacySettingsActivity.f32217a;
                if (iy0Var != null && (i10 = privacySettingsActivity.f32226s) >= 0) {
                    iy0Var.m(i10);
                    return;
                }
                return;
            default:
                PrivacySettingsActivity.U(this.f36669b);
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        String string;
        switch (this.f36668a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f36669b;
                try {
                    Dialog dialog = privacySettingsActivity.visibleDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                alertDialog$Builder.f19248a.R = LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle);
                alertDialog$Builder.f19248a.T = LocaleController.getString("PrivacyPaymentsClearAlert", R.string.PrivacyPaymentsClearAlert);
                alertDialog$Builder.k(LocaleController.getString("ClearButton", R.string.ClearButton), new hy0(privacySettingsActivity, 1));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                privacySettingsActivity.showDialog(alertDialog$Builder.f19248a);
                org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder.f19248a;
                privacySettingsActivity.showDialog(a2Var2);
                TextView textView = (TextView) a2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19839q7, false));
                    return;
                }
                return;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                PrivacySettingsActivity privacySettingsActivity2 = this.f36669b;
                boolean[] zArr = privacySettingsActivity2.Z;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity2.getUserConfig().tmpPassword = null;
                privacySettingsActivity2.getUserConfig().saveConfig(false);
                privacySettingsActivity2.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new bi.g7(8));
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
                org.telegram.ui.Components.zc.a0(privacySettingsActivity2).Q(R.raw.chats_infotip, 36, string).j();
                return;
            case 2:
            case 3:
            default:
                PrivacySettingsActivity privacySettingsActivity3 = this.f36669b;
                org.telegram.ui.ActionBar.a2 o10 = new AlertDialog$Builder(privacySettingsActivity3.getParentActivity(), 3, null).o();
                privacySettingsActivity3.f32221c = o10;
                o10.f19269g0 = false;
                if (privacySettingsActivity3.S != privacySettingsActivity3.T) {
                    UserConfig userConfig = privacySettingsActivity3.getUserConfig();
                    boolean z11 = privacySettingsActivity3.T;
                    userConfig.syncContacts = z11;
                    privacySettingsActivity3.S = z11;
                    privacySettingsActivity3.getUserConfig().saveConfig(false);
                }
                privacySettingsActivity3.getContactsController().deleteAllContacts(new gy0(privacySettingsActivity3, 1));
                return;
            case 4:
                ah0 ah0Var = new ah0();
                PrivacySettingsActivity privacySettingsActivity4 = this.f36669b;
                gy0 gy0Var = new gy0(privacySettingsActivity4, 2);
                ah0Var.F = 3;
                ah0Var.f33905a = 12;
                ah0Var.f33911d0 = gy0Var;
                privacySettingsActivity4.presentFragment(ah0Var);
                return;
        }
    }
}
