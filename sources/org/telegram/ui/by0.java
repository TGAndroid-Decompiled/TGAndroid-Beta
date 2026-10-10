package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class by0 implements org.telegram.ui.ActionBar.a2 {
    public final int f36502a;
    public final PrivacySettingsActivity f36503b;

    public by0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f36502a = i10;
        this.f36503b = privacySettingsActivity;
    }

    public void a() {
        int i10;
        switch (this.f36502a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.f36503b;
                cy0 cy0Var = privacySettingsActivity.f34235a;
                if (cy0Var != null && (i10 = privacySettingsActivity.f34245s) >= 0) {
                    cy0Var.m(i10);
                    return;
                }
                return;
            default:
                PrivacySettingsActivity.U(this.f36503b);
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        String string;
        switch (this.f36502a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f36503b;
                try {
                    Dialog dialog = privacySettingsActivity.visibleDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                alertDialog$Builder.f20378a.R = LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle);
                alertDialog$Builder.f20378a.T = LocaleController.getString("PrivacyPaymentsClearAlert", R.string.PrivacyPaymentsClearAlert);
                alertDialog$Builder.k(LocaleController.getString("ClearButton", R.string.ClearButton), new by0(privacySettingsActivity, 1));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                privacySettingsActivity.showDialog(alertDialog$Builder.f20378a);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f20378a;
                privacySettingsActivity.showDialog(b2Var2);
                TextView textView = (TextView) b2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21041q7, false));
                    return;
                }
                return;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                PrivacySettingsActivity privacySettingsActivity2 = this.f36503b;
                boolean[] zArr = privacySettingsActivity2.Z;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity2.getUserConfig().tmpPassword = null;
                privacySettingsActivity2.getUserConfig().saveConfig(false);
                privacySettingsActivity2.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new ai.v7(8));
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
                org.telegram.ui.Components.ad.a0(privacySettingsActivity2).Q(R.raw.chats_infotip, 36, string).j();
                return;
            case 2:
            case 3:
            default:
                PrivacySettingsActivity privacySettingsActivity3 = this.f36503b;
                org.telegram.ui.ActionBar.b2 o9 = new AlertDialog$Builder(privacySettingsActivity3.getParentActivity(), 3, null).o();
                privacySettingsActivity3.f34239c = o9;
                o9.f20424g0 = false;
                if (privacySettingsActivity3.S != privacySettingsActivity3.T) {
                    UserConfig userConfig = privacySettingsActivity3.getUserConfig();
                    boolean z11 = privacySettingsActivity3.T;
                    userConfig.syncContacts = z11;
                    privacySettingsActivity3.S = z11;
                    privacySettingsActivity3.getUserConfig().saveConfig(false);
                }
                privacySettingsActivity3.getContactsController().deleteAllContacts(new ay0(privacySettingsActivity3, 1));
                return;
            case 4:
                wg0 wg0Var = new wg0();
                PrivacySettingsActivity privacySettingsActivity4 = this.f36503b;
                ay0 ay0Var = new ay0(privacySettingsActivity4, 2);
                wg0Var.F = 3;
                wg0Var.f43618a = 12;
                wg0Var.f43624d0 = ay0Var;
                privacySettingsActivity4.presentFragment(wg0Var);
                return;
        }
    }
}
