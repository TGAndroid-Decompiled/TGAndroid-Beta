package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hx0 implements org.telegram.ui.ActionBar.c2 {
    public final int f34963a;
    public final PrivacySettingsActivity f34964b;

    public hx0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f34963a = i10;
        this.f34964b = privacySettingsActivity;
    }

    public void a() {
        int i10;
        switch (this.f34963a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.f34964b;
                ix0 ix0Var = privacySettingsActivity.f32018a;
                if (ix0Var != null && (i10 = privacySettingsActivity.f32024s) >= 0) {
                    ix0Var.m(i10);
                    return;
                }
                return;
            default:
                PrivacySettingsActivity.U(this.f34964b);
                return;
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        String string;
        switch (this.f34963a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f34964b;
                try {
                    Dialog dialog = privacySettingsActivity.visibleDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                alertDialog$Builder.f19503a.O = LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle);
                alertDialog$Builder.f19503a.Q = LocaleController.getString("PrivacyPaymentsClearAlert", R.string.PrivacyPaymentsClearAlert);
                alertDialog$Builder.k(LocaleController.getString("ClearButton", R.string.ClearButton), new hx0(privacySettingsActivity, 1));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                privacySettingsActivity.showDialog(alertDialog$Builder.f19503a);
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.f19503a;
                privacySettingsActivity.showDialog(d2Var2);
                TextView textView = (TextView) d2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20141q7, false));
                    return;
                }
                return;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                PrivacySettingsActivity privacySettingsActivity2 = this.f34964b;
                boolean[] zArr = privacySettingsActivity2.W;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity2.getUserConfig().tmpPassword = null;
                privacySettingsActivity2.getUserConfig().saveConfig(false);
                privacySettingsActivity2.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new nh.p5(4));
                boolean z4 = zArr[0];
                if (z4 && zArr[1]) {
                    string = LocaleController.getString("PrivacyPaymentsPaymentShippingCleared", R.string.PrivacyPaymentsPaymentShippingCleared);
                } else if (z4) {
                    string = LocaleController.getString("PrivacyPaymentsShippingInfoCleared", R.string.PrivacyPaymentsShippingInfoCleared);
                } else if (zArr[1]) {
                    string = LocaleController.getString("PrivacyPaymentsPaymentInfoCleared", R.string.PrivacyPaymentsPaymentInfoCleared);
                } else {
                    return;
                }
                org.telegram.ui.Components.qc.a0(privacySettingsActivity2).Q(R.raw.chats_infotip, 36, string).j();
                return;
            case 2:
            case 3:
            default:
                PrivacySettingsActivity privacySettingsActivity3 = this.f34964b;
                org.telegram.ui.ActionBar.d2 o10 = new AlertDialog$Builder(privacySettingsActivity3.getParentActivity(), 3, null).o();
                privacySettingsActivity3.f32020c = o10;
                o10.f19590d0 = false;
                if (privacySettingsActivity3.P != privacySettingsActivity3.Q) {
                    UserConfig userConfig = privacySettingsActivity3.getUserConfig();
                    boolean z10 = privacySettingsActivity3.Q;
                    userConfig.syncContacts = z10;
                    privacySettingsActivity3.P = z10;
                    privacySettingsActivity3.getUserConfig().saveConfig(false);
                }
                privacySettingsActivity3.getContactsController().deleteAllContacts(new gx0(privacySettingsActivity3, 1));
                return;
            case 4:
                ng0 ng0Var = new ng0();
                PrivacySettingsActivity privacySettingsActivity4 = this.f34964b;
                gx0 gx0Var = new gx0(privacySettingsActivity4, 2);
                ng0Var.C = 3;
                ng0Var.f36622a = 12;
                ng0Var.f36623a0 = gx0Var;
                privacySettingsActivity4.presentFragment(ng0Var);
                return;
        }
    }
}
