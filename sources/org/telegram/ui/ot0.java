package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ot0 implements org.telegram.ui.ActionBar.r1 {
    public final int f48516a;
    public final PrivacySettingsActivity f48517b;

    public ot0(PrivacySettingsActivity privacySettingsActivity, int i7) {
        this.f48516a = i7;
        this.f48517b = privacySettingsActivity;
    }

    public void a() {
        int i7;
        switch (this.f48516a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.f48517b;
                qt0 qt0Var = privacySettingsActivity.f41684a;
                if (qt0Var != null && (i7 = privacySettingsActivity.f41694s) >= 0) {
                    qt0Var.g(i7);
                    return;
                }
                return;
            default:
                PrivacySettingsActivity.Z(this.f48517b);
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        String M0;
        int i10 = this.f48516a;
        PrivacySettingsActivity privacySettingsActivity = this.f48517b;
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
                String M02 = org.telegram.messenger.id.M0(2131746794, "PrivacyPaymentsClearAlertTitle");
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.f27296a;
                u1Var2.R = M02;
                u1Var2.T = org.telegram.messenger.id.M0(2131746796, "PrivacyPaymentsClearAlert");
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131752099, "ClearButton"), new ot0(privacySettingsActivity, 1));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
                privacySettingsActivity.showDialog(u1Var2);
                privacySettingsActivity.showDialog(u1Var2);
                TextView textView = (TextView) u1Var2.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28106q7, null);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity.getUserConfig().f24499y = null;
                privacySettingsActivity.getUserConfig().v(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new di.v5(9));
                boolean z9 = zArr[0];
                if (z9 && zArr[1]) {
                    M0 = org.telegram.messenger.id.M0(2131746792, "PrivacyPaymentsPaymentShippingCleared");
                } else if (z9) {
                    M0 = org.telegram.messenger.id.M0(2131746791, "PrivacyPaymentsShippingInfoCleared");
                } else if (zArr[1]) {
                    M0 = org.telegram.messenger.id.M0(2131746793, "PrivacyPaymentsPaymentInfoCleared");
                } else {
                    return;
                }
                org.telegram.ui.Components.hc.a0(privacySettingsActivity).Q(2131623981, 36, M0).j();
                return;
            case 2:
            case 3:
            default:
                org.telegram.ui.ActionBar.u1 p10 = new AlertDialog$Builder(3, privacySettingsActivity.getParentActivity(), null).p();
                privacySettingsActivity.f41688c = p10;
                p10.f28563i0 = false;
                if (privacySettingsActivity.S != privacySettingsActivity.T) {
                    org.telegram.messenger.p10 userConfig = privacySettingsActivity.getUserConfig();
                    boolean z10 = privacySettingsActivity.T;
                    userConfig.U = z10;
                    privacySettingsActivity.S = z10;
                    privacySettingsActivity.getUserConfig().v(false);
                }
                org.telegram.messenger.g5 contactsController = privacySettingsActivity.getContactsController();
                nt0 nt0Var = new nt0(privacySettingsActivity, 1);
                contactsController.K();
                TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
                int size = contactsController.f22608e0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    tL_contacts_deleteContacts.f27000id.add(contactsController.getMessagesController().o1(((TLRPC.TL_contact) contactsController.f22608e0.get(i11)).user_id));
                }
                contactsController.getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new org.telegram.messenger.r4(0, contactsController, nt0Var));
                return;
            case 4:
                ee0 ee0Var = new ee0();
                nt0 nt0Var2 = new nt0(privacySettingsActivity, 2);
                ee0Var.F = 3;
                ee0Var.f45368a = 12;
                ee0Var.f45374d0 = nt0Var2;
                privacySettingsActivity.presentFragment(ee0Var);
                return;
        }
    }
}
