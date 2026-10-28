package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class px0 implements org.telegram.ui.ActionBar.b2 {
    public final int f42525a;
    public final PrivacySettingsActivity f42526b;

    public px0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f42525a = i10;
        this.f42526b = privacySettingsActivity;
    }

    public void a() {
        int i10;
        switch (this.f42525a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.f42526b;
                qx0 qx0Var = privacySettingsActivity.f35959a;
                if (qx0Var != null && (i10 = privacySettingsActivity.f35968s) >= 0) {
                    qx0Var.m(i10);
                    return;
                }
                return;
            default:
                PrivacySettingsActivity.V(this.f42526b);
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        String string;
        switch (this.f42525a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f42526b;
                try {
                    Dialog dialog = privacySettingsActivity.visibleDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                alertDialog$Builder.f22369a.R = LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle);
                alertDialog$Builder.f22369a.T = LocaleController.getString("PrivacyPaymentsClearAlert", R.string.PrivacyPaymentsClearAlert);
                alertDialog$Builder.k(LocaleController.getString("ClearButton", R.string.ClearButton), new px0(privacySettingsActivity, 1));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                privacySettingsActivity.showDialog(alertDialog$Builder.f22369a);
                org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder.f22369a;
                privacySettingsActivity.showDialog(e2Var2);
                TextView textView = (TextView) e2Var2.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, null);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                PrivacySettingsActivity privacySettingsActivity2 = this.f42526b;
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
                PrivacySettingsActivity privacySettingsActivity3 = this.f42526b;
                org.telegram.ui.ActionBar.e2 p10 = new AlertDialog$Builder(privacySettingsActivity3.getParentActivity(), 3, null).p();
                privacySettingsActivity3.f35963c = p10;
                p10.f22576i0 = false;
                if (privacySettingsActivity3.S != privacySettingsActivity3.T) {
                    UserConfig userConfig = privacySettingsActivity3.getUserConfig();
                    boolean z11 = privacySettingsActivity3.T;
                    userConfig.syncContacts = z11;
                    privacySettingsActivity3.S = z11;
                    privacySettingsActivity3.getUserConfig().saveConfig(false);
                }
                privacySettingsActivity3.getContactsController().deleteAllContacts(new ox0(privacySettingsActivity3, 1));
                return;
            case 4:
                ig0 ig0Var = new ig0();
                PrivacySettingsActivity privacySettingsActivity4 = this.f42526b;
                ox0 ox0Var = new ox0(privacySettingsActivity4, 2);
                ig0Var.F = 3;
                ig0Var.f40140a = 12;
                ig0Var.f40146d0 = ox0Var;
                privacySettingsActivity4.presentFragment(ig0Var);
                return;
        }
    }
}
