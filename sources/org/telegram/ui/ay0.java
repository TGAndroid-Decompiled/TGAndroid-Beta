package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ay0 implements org.telegram.ui.ActionBar.a2, ki.e {
    public final int f32006a;
    public final PrivacySettingsActivity f32007b;

    public ay0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f32006a = i10;
        this.f32007b = privacySettingsActivity;
    }

    public void a() {
        int i10;
        switch (this.f32006a) {
            case 3:
                PrivacySettingsActivity privacySettingsActivity = this.f32007b;
                cy0 cy0Var = privacySettingsActivity.f31224a;
                if (cy0Var != null && (i10 = privacySettingsActivity.f31234s) >= 0) {
                    cy0Var.m(i10);
                    return;
                }
                return;
            default:
                PrivacySettingsActivity.V(this.f32007b);
                return;
        }
    }

    @Override
    public int e() {
        PrivacySettingsActivity privacySettingsActivity = this.f32007b;
        privacySettingsActivity.getClass();
        return privacySettingsActivity.getThemedColor(org.telegram.ui.ActionBar.i6.f18780a7);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        String string;
        switch (this.f32006a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f32007b;
                org.telegram.ui.ActionBar.b2 o9 = new AlertDialog$Builder(privacySettingsActivity.getParentActivity(), 3, null).o();
                privacySettingsActivity.f31228c = o9;
                o9.f18473g0 = false;
                if (privacySettingsActivity.S != privacySettingsActivity.T) {
                    UserConfig userConfig = privacySettingsActivity.getUserConfig();
                    boolean z10 = privacySettingsActivity.T;
                    userConfig.syncContacts = z10;
                    privacySettingsActivity.S = z10;
                    privacySettingsActivity.getUserConfig().saveConfig(false);
                }
                privacySettingsActivity.getContactsController().deleteAllContacts(new by0(privacySettingsActivity, 1));
                return;
            case 1:
                PrivacySettingsActivity privacySettingsActivity2 = this.f32007b;
                try {
                    Dialog dialog = privacySettingsActivity2.visibleDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity2.getParentActivity());
                alertDialog$Builder.f18437a.R = LocaleController.getString("PrivacyPaymentsClearAlertTitle", R.string.PrivacyPaymentsClearAlertTitle);
                alertDialog$Builder.f18437a.T = LocaleController.getString("PrivacyPaymentsClearAlert", R.string.PrivacyPaymentsClearAlert);
                alertDialog$Builder.k(LocaleController.getString("ClearButton", R.string.ClearButton), new ay0(privacySettingsActivity2, 2));
                alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                privacySettingsActivity2.showDialog(alertDialog$Builder.f18437a);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f18437a;
                privacySettingsActivity2.showDialog(b2Var2);
                TextView textView = (TextView) b2Var2.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19074q7, false));
                    return;
                }
                return;
            case 2:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                PrivacySettingsActivity privacySettingsActivity3 = this.f32007b;
                boolean[] zArr = privacySettingsActivity3.Z;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity3.getUserConfig().tmpPassword = null;
                privacySettingsActivity3.getUserConfig().saveConfig(false);
                privacySettingsActivity3.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new ai.t7(8));
                boolean z11 = zArr[0];
                if (z11 && zArr[1]) {
                    string = LocaleController.getString("PrivacyPaymentsPaymentShippingCleared", R.string.PrivacyPaymentsPaymentShippingCleared);
                } else if (z11) {
                    string = LocaleController.getString("PrivacyPaymentsShippingInfoCleared", R.string.PrivacyPaymentsShippingInfoCleared);
                } else if (zArr[1]) {
                    string = LocaleController.getString("PrivacyPaymentsPaymentInfoCleared", R.string.PrivacyPaymentsPaymentInfoCleared);
                } else {
                    return;
                }
                org.telegram.ui.Components.vc.a0(privacySettingsActivity3).Q(R.raw.chats_infotip, 36, string).j();
                return;
            default:
                wg0 wg0Var = new wg0();
                PrivacySettingsActivity privacySettingsActivity4 = this.f32007b;
                by0 by0Var = new by0(privacySettingsActivity4, 2);
                wg0Var.F = 3;
                wg0Var.f39193a = 12;
                wg0Var.f39199d0 = by0Var;
                privacySettingsActivity4.presentFragment(wg0Var);
                return;
        }
    }
}
