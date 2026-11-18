package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class nt0 implements org.telegram.ui.ActionBar.r1 {
    public final int f50323a;
    public final PrivacySettingsActivity f50324b;

    public nt0(PrivacySettingsActivity privacySettingsActivity, int i7) {
        this.f50323a = i7;
        this.f50324b = privacySettingsActivity;
    }

    public void a() {
        int i7;
        switch (this.f50323a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.f50324b;
                ot0 ot0Var = privacySettingsActivity.f43492a;
                if (ot0Var != null && (i7 = privacySettingsActivity.f43503s) >= 0) {
                    ot0Var.g(i7);
                    return;
                }
                return;
            default:
                PrivacySettingsActivity.Z(this.f50324b);
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        String M0;
        int i10 = this.f50323a;
        PrivacySettingsActivity privacySettingsActivity = this.f50324b;
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
                String M02 = org.telegram.messenger.gd.M0(2131746601, "PrivacyPaymentsClearAlertTitle");
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.f28746a;
                u1Var2.S = M02;
                u1Var2.U = org.telegram.messenger.gd.M0(2131746603, "PrivacyPaymentsClearAlert");
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131752088, "ClearButton"), new nt0(privacySettingsActivity, 1));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, "Cancel"), null);
                privacySettingsActivity.showDialog(u1Var2);
                privacySettingsActivity.showDialog(u1Var2);
                TextView textView = (TextView) u1Var2.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29637q7, null);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr = privacySettingsActivity.f43493a0;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity.getUserConfig().f24803y = null;
                privacySettingsActivity.getUserConfig().v(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new fi.k5(9));
                boolean z10 = zArr[0];
                if (z10 && zArr[1]) {
                    M0 = org.telegram.messenger.gd.M0(2131746599, "PrivacyPaymentsPaymentShippingCleared");
                } else if (z10) {
                    M0 = org.telegram.messenger.gd.M0(2131746598, "PrivacyPaymentsShippingInfoCleared");
                } else if (zArr[1]) {
                    M0 = org.telegram.messenger.gd.M0(2131746600, "PrivacyPaymentsPaymentInfoCleared");
                } else {
                    return;
                }
                org.telegram.ui.Components.lc.b0(privacySettingsActivity).Q(2131623982, 36, M0).j();
                return;
            case 2:
            case 3:
            default:
                org.telegram.ui.ActionBar.u1 p10 = new AlertDialog$Builder(3, privacySettingsActivity.getParentActivity(), null).p();
                privacySettingsActivity.f43496c = p10;
                p10.f30049j0 = false;
                if (privacySettingsActivity.T != privacySettingsActivity.U) {
                    org.telegram.messenger.j10 userConfig = privacySettingsActivity.getUserConfig();
                    boolean z11 = privacySettingsActivity.U;
                    userConfig.V = z11;
                    privacySettingsActivity.T = z11;
                    privacySettingsActivity.getUserConfig().v(false);
                }
                org.telegram.messenger.i5 contactsController = privacySettingsActivity.getContactsController();
                mt0 mt0Var = new mt0(privacySettingsActivity, 1);
                contactsController.K();
                TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
                int size = contactsController.f24570f0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    tL_contacts_deleteContacts.f28449id.add(contactsController.getMessagesController().q1(((TLRPC.TL_contact) contactsController.f24570f0.get(i11)).user_id));
                }
                contactsController.getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new org.telegram.messenger.t4(0, contactsController, mt0Var));
                return;
            case 4:
                de0 de0Var = new de0();
                mt0 mt0Var2 = new mt0(privacySettingsActivity, 2);
                de0Var.G = 3;
                de0Var.f46933a = 12;
                de0Var.f46941e0 = mt0Var2;
                privacySettingsActivity.presentFragment(de0Var);
                return;
        }
    }
}
