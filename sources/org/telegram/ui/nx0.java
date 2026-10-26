package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class nx0 implements org.telegram.ui.ActionBar.b2 {
    public final int f42017a;
    public final PrivacySettingsActivity f42018b;

    public nx0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f42017a = i10;
        this.f42018b = privacySettingsActivity;
    }

    public void a() {
        int i10;
        switch (this.f42017a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.f42018b;
                ox0 ox0Var = privacySettingsActivity.f35935a;
                if (ox0Var != null && (i10 = privacySettingsActivity.f35944s) >= 0) {
                    ox0Var.m(i10);
                    return;
                }
                return;
            default:
                PrivacySettingsActivity.V(this.f42018b);
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        String string;
        switch (this.f42017a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f42018b;
                try {
                    Dialog dialog = privacySettingsActivity.visibleDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                alertDialog$Builder.f22368a.R = LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle);
                alertDialog$Builder.f22368a.T = LocaleController.getString("PrivacyPaymentsClearAlert", R.string.PrivacyPaymentsClearAlert);
                alertDialog$Builder.k(LocaleController.getString("ClearButton", R.string.ClearButton), new nx0(privacySettingsActivity, 1));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                privacySettingsActivity.showDialog(alertDialog$Builder.f22368a);
                org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder.f22368a;
                privacySettingsActivity.showDialog(e2Var2);
                TextView textView = (TextView) e2Var2.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23598q7, null);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                PrivacySettingsActivity privacySettingsActivity2 = this.f42018b;
                boolean[] zArr = privacySettingsActivity2.Z;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity2.getUserConfig().tmpPassword = null;
                privacySettingsActivity2.getUserConfig().saveConfig(false);
                privacySettingsActivity2.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new di.d6(8));
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
                org.telegram.ui.Components.wc.b0(privacySettingsActivity2).R(R.raw.chats_infotip, 36, string).j();
                return;
            case 2:
            case 3:
            default:
                PrivacySettingsActivity privacySettingsActivity3 = this.f42018b;
                org.telegram.ui.ActionBar.e2 p10 = new AlertDialog$Builder(privacySettingsActivity3.getParentActivity(), 3, null).p();
                privacySettingsActivity3.f35939c = p10;
                p10.f22575i0 = false;
                if (privacySettingsActivity3.S != privacySettingsActivity3.T) {
                    UserConfig userConfig = privacySettingsActivity3.getUserConfig();
                    boolean z11 = privacySettingsActivity3.T;
                    userConfig.syncContacts = z11;
                    privacySettingsActivity3.S = z11;
                    privacySettingsActivity3.getUserConfig().saveConfig(false);
                }
                privacySettingsActivity3.getContactsController().deleteAllContacts(new mx0(privacySettingsActivity3, 1));
                return;
            case 4:
                gg0 gg0Var = new gg0();
                PrivacySettingsActivity privacySettingsActivity4 = this.f42018b;
                mx0 mx0Var = new mx0(privacySettingsActivity4, 2);
                gg0Var.F = 3;
                gg0Var.f39651a = 12;
                gg0Var.f39657d0 = mx0Var;
                privacySettingsActivity4.presentFragment(gg0Var);
                return;
        }
    }
}
