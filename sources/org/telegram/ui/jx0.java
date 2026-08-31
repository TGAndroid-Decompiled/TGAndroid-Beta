package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class jx0 implements org.telegram.ui.ActionBar.c2 {
    public final int f38235a;
    public final PrivacySettingsActivity f38236b;

    public jx0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f38235a = i10;
        this.f38236b = privacySettingsActivity;
    }

    public void a() {
        int i10;
        switch (this.f38235a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.f38236b;
                kx0 kx0Var = privacySettingsActivity.f34549a;
                if (kx0Var != null && (i10 = privacySettingsActivity.f34556s) >= 0) {
                    kx0Var.m(i10);
                    return;
                }
                return;
            default:
                PrivacySettingsActivity.U(this.f38236b);
                return;
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        String string;
        switch (this.f38235a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f38236b;
                try {
                    Dialog dialog = privacySettingsActivity.visibleDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                alertDialog$Builder.f21166a.O = LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle);
                alertDialog$Builder.f21166a.Q = LocaleController.getString("PrivacyPaymentsClearAlert", R.string.PrivacyPaymentsClearAlert);
                alertDialog$Builder.k(LocaleController.getString("ClearButton", R.string.ClearButton), new jx0(privacySettingsActivity, 1));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                privacySettingsActivity.showDialog(alertDialog$Builder.f21166a);
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.f21166a;
                privacySettingsActivity.showDialog(d2Var2);
                TextView textView = (TextView) d2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21895q7, false));
                    return;
                }
                return;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                PrivacySettingsActivity privacySettingsActivity2 = this.f38236b;
                boolean[] zArr = privacySettingsActivity2.W;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity2.getUserConfig().tmpPassword = null;
                privacySettingsActivity2.getUserConfig().saveConfig(false);
                privacySettingsActivity2.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new oh.p5(4));
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
                PrivacySettingsActivity privacySettingsActivity3 = this.f38236b;
                org.telegram.ui.ActionBar.d2 o10 = new AlertDialog$Builder(privacySettingsActivity3.getParentActivity(), 3, null).o();
                privacySettingsActivity3.f34551c = o10;
                o10.f21241d0 = false;
                if (privacySettingsActivity3.P != privacySettingsActivity3.Q) {
                    UserConfig userConfig = privacySettingsActivity3.getUserConfig();
                    boolean z10 = privacySettingsActivity3.Q;
                    userConfig.syncContacts = z10;
                    privacySettingsActivity3.P = z10;
                    privacySettingsActivity3.getUserConfig().saveConfig(false);
                }
                privacySettingsActivity3.getContactsController().deleteAllContacts(new ix0(privacySettingsActivity3, 1));
                return;
            case 4:
                og0 og0Var = new og0();
                PrivacySettingsActivity privacySettingsActivity4 = this.f38236b;
                ix0 ix0Var = new ix0(privacySettingsActivity4, 2);
                og0Var.C = 3;
                og0Var.f39750a = 12;
                og0Var.f39751a0 = ix0Var;
                privacySettingsActivity4.presentFragment(og0Var);
                return;
        }
    }
}
