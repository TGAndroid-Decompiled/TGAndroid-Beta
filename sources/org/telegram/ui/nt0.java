package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class nt0 implements org.telegram.ui.ActionBar.q1 {
    public final int f50318a;
    public final PrivacySettingsActivity f50319b;

    public nt0(PrivacySettingsActivity privacySettingsActivity, int i7) {
        this.f50318a = i7;
        this.f50319b = privacySettingsActivity;
    }

    public void a() {
        int i7;
        switch (this.f50318a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.f50319b;
                ot0 ot0Var = privacySettingsActivity.f43537a;
                if (ot0Var != null && (i7 = privacySettingsActivity.f43548s) >= 0) {
                    ot0Var.g(i7);
                    return;
                }
                return;
            default:
                PrivacySettingsActivity.Z(this.f50319b);
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        String N0;
        int i10 = this.f50318a;
        PrivacySettingsActivity privacySettingsActivity = this.f50319b;
        switch (i10) {
            case 0:
                try {
                    Dialog dialog = privacySettingsActivity.visibleDialog;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(privacySettingsActivity.getParentActivity());
                String N02 = org.telegram.messenger.hd.N0(2131746600, "PrivacyPaymentsClearAlertTitle");
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28777a;
                t1Var2.S = N02;
                t1Var2.U = org.telegram.messenger.hd.N0(2131746602, "PrivacyPaymentsClearAlert");
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131752087, "ClearButton"), new nt0(privacySettingsActivity, 1));
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, "Cancel"), null);
                privacySettingsActivity.showDialog(t1Var2);
                privacySettingsActivity.showDialog(t1Var2);
                TextView textView = (TextView) t1Var2.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29622q7, null);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr = privacySettingsActivity.f43538a0;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity.getUserConfig().f24998y = null;
                privacySettingsActivity.getUserConfig().v(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new fi.l5(9));
                boolean z10 = zArr[0];
                if (z10 && zArr[1]) {
                    N0 = org.telegram.messenger.hd.N0(2131746598, "PrivacyPaymentsPaymentShippingCleared");
                } else if (z10) {
                    N0 = org.telegram.messenger.hd.N0(2131746597, "PrivacyPaymentsShippingInfoCleared");
                } else if (zArr[1]) {
                    N0 = org.telegram.messenger.hd.N0(2131746599, "PrivacyPaymentsPaymentInfoCleared");
                } else {
                    return;
                }
                org.telegram.ui.Components.lc.b0(privacySettingsActivity).Q(2131623982, 36, N0).j();
                return;
            case 2:
            case 3:
            default:
                org.telegram.ui.ActionBar.t1 p10 = new AlertDialog$Builder(3, privacySettingsActivity.getParentActivity(), null).p();
                privacySettingsActivity.f43541c = p10;
                p10.f30033j0 = false;
                if (privacySettingsActivity.T != privacySettingsActivity.U) {
                    org.telegram.messenger.k10 userConfig = privacySettingsActivity.getUserConfig();
                    boolean z11 = privacySettingsActivity.U;
                    userConfig.V = z11;
                    privacySettingsActivity.T = z11;
                    privacySettingsActivity.getUserConfig().v(false);
                }
                org.telegram.messenger.i5 contactsController = privacySettingsActivity.getContactsController();
                mt0 mt0Var = new mt0(privacySettingsActivity, 1);
                contactsController.K();
                TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
                int size = contactsController.f24605f0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    tL_contacts_deleteContacts.f28478id.add(contactsController.getMessagesController().q1(((TLRPC.TL_contact) contactsController.f24605f0.get(i11)).user_id));
                }
                contactsController.getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new org.telegram.messenger.t4(0, contactsController, mt0Var));
                return;
            case 4:
                de0 de0Var = new de0();
                mt0 mt0Var2 = new mt0(privacySettingsActivity, 2);
                de0Var.G = 3;
                de0Var.f46926a = 12;
                de0Var.f46934e0 = mt0Var2;
                privacySettingsActivity.presentFragment(de0Var);
                return;
        }
    }
}
