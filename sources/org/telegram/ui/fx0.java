package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fx0 implements org.telegram.ui.ActionBar.a2 {
    public final int f37138a;
    public final PrivacySettingsActivity f37139b;

    public fx0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f37138a = i10;
        this.f37139b = privacySettingsActivity;
    }

    public void a() {
        int i10;
        switch (this.f37138a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.f37139b;
                gx0 gx0Var = privacySettingsActivity.f33568a;
                if (gx0Var != null && (i10 = privacySettingsActivity.f33577s) >= 0) {
                    gx0Var.m(i10);
                    return;
                }
                return;
            default:
                PrivacySettingsActivity.U(this.f37139b);
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        String string;
        switch (this.f37138a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f37139b;
                try {
                    Dialog dialog = privacySettingsActivity.visibleDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                alertDialog$Builder.f20605a.R = LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle);
                alertDialog$Builder.f20605a.T = LocaleController.getString("PrivacyPaymentsClearAlert", R.string.PrivacyPaymentsClearAlert);
                alertDialog$Builder.k(LocaleController.getString("ClearButton", R.string.ClearButton), new fx0(privacySettingsActivity, 1));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                privacySettingsActivity.showDialog(alertDialog$Builder.f20605a);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f20605a;
                privacySettingsActivity.showDialog(b2Var2);
                TextView textView = (TextView) b2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21228q7, false));
                    return;
                }
                return;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                PrivacySettingsActivity privacySettingsActivity2 = this.f37139b;
                boolean[] zArr = privacySettingsActivity2.Z;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity2.getUserConfig().tmpPassword = null;
                privacySettingsActivity2.getUserConfig().saveConfig(false);
                privacySettingsActivity2.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new ci.e6(8));
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
                org.telegram.ui.Components.xc.a0(privacySettingsActivity2).Q(R.raw.chats_infotip, 36, string).j();
                return;
            case 2:
            case 3:
            default:
                PrivacySettingsActivity privacySettingsActivity3 = this.f37139b;
                org.telegram.ui.ActionBar.b2 o10 = new AlertDialog$Builder(privacySettingsActivity3.getParentActivity(), 3, null).o();
                privacySettingsActivity3.f33572c = o10;
                o10.f20665g0 = false;
                if (privacySettingsActivity3.S != privacySettingsActivity3.T) {
                    UserConfig userConfig = privacySettingsActivity3.getUserConfig();
                    boolean z11 = privacySettingsActivity3.T;
                    userConfig.syncContacts = z11;
                    privacySettingsActivity3.S = z11;
                    privacySettingsActivity3.getUserConfig().saveConfig(false);
                }
                privacySettingsActivity3.getContactsController().deleteAllContacts(new ex0(privacySettingsActivity3, 1));
                return;
            case 4:
                dg0 dg0Var = new dg0();
                PrivacySettingsActivity privacySettingsActivity4 = this.f37139b;
                ex0 ex0Var = new ex0(privacySettingsActivity4, 2);
                dg0Var.F = 3;
                dg0Var.f36367a = 12;
                dg0Var.f36373d0 = ex0Var;
                privacySettingsActivity4.presentFragment(dg0Var);
                return;
        }
    }
}
