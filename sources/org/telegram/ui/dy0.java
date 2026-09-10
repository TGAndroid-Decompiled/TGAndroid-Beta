package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dy0 implements org.telegram.ui.ActionBar.c2 {
    public final int f31994a;
    public final PrivacySettingsActivity f31995b;

    public dy0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f31994a = i10;
        this.f31995b = privacySettingsActivity;
    }

    public void a() {
        int i10;
        switch (this.f31994a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.f31995b;
                gy0 gy0Var = privacySettingsActivity.f30337a;
                if (gy0Var != null && (i10 = privacySettingsActivity.f30346s) >= 0) {
                    gy0Var.m(i10);
                    return;
                }
                return;
            default:
                PrivacySettingsActivity.U(this.f31995b);
                return;
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        String string;
        switch (this.f31994a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f31995b;
                try {
                    Dialog dialog = privacySettingsActivity.visibleDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                alertDialog$Builder.f17528a.R = LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle);
                alertDialog$Builder.f17528a.T = LocaleController.getString("PrivacyPaymentsClearAlert", R.string.PrivacyPaymentsClearAlert);
                alertDialog$Builder.k(LocaleController.getString("ClearButton", R.string.ClearButton), new dy0(privacySettingsActivity, 1));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                privacySettingsActivity.showDialog(alertDialog$Builder.f17528a);
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.f17528a;
                privacySettingsActivity.showDialog(d2Var2);
                TextView textView = (TextView) d2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false));
                    return;
                }
                return;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                PrivacySettingsActivity privacySettingsActivity2 = this.f31995b;
                boolean[] zArr = privacySettingsActivity2.Z;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity2.getUserConfig().tmpPassword = null;
                privacySettingsActivity2.getUserConfig().saveConfig(false);
                privacySettingsActivity2.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new bi.g1(4));
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
                org.telegram.ui.Components.wc.a0(privacySettingsActivity2).Q(R.raw.chats_infotip, 36, string).j();
                return;
            case 2:
            case 3:
            default:
                PrivacySettingsActivity privacySettingsActivity3 = this.f31995b;
                org.telegram.ui.ActionBar.d2 o9 = new AlertDialog$Builder(privacySettingsActivity3.getParentActivity(), 3, null).o();
                privacySettingsActivity3.f30341c = o9;
                o9.f17621g0 = false;
                if (privacySettingsActivity3.S != privacySettingsActivity3.T) {
                    UserConfig userConfig = privacySettingsActivity3.getUserConfig();
                    boolean z11 = privacySettingsActivity3.T;
                    userConfig.syncContacts = z11;
                    privacySettingsActivity3.S = z11;
                    privacySettingsActivity3.getUserConfig().saveConfig(false);
                }
                privacySettingsActivity3.getContactsController().deleteAllContacts(new cy0(privacySettingsActivity3, 1));
                return;
            case 4:
                xg0 xg0Var = new xg0();
                PrivacySettingsActivity privacySettingsActivity4 = this.f31995b;
                cy0 cy0Var = new cy0(privacySettingsActivity4, 2);
                xg0Var.F = 3;
                xg0Var.f38717a = 12;
                xg0Var.f38723d0 = cy0Var;
                privacySettingsActivity4.presentFragment(xg0Var);
                return;
        }
    }
}
