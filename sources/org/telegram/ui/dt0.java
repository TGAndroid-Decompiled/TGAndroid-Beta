package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dt0 implements org.telegram.ui.ActionBar.p1 {
    public final int f44810a;
    public final PrivacySettingsActivity f44811b;

    public dt0(PrivacySettingsActivity privacySettingsActivity, int i3) {
        this.f44810a = i3;
        this.f44811b = privacySettingsActivity;
    }

    public void a() {
        int i3;
        switch (this.f44810a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.f44811b;
                et0 et0Var = privacySettingsActivity.f41704a;
                if (et0Var != null && (i3 = privacySettingsActivity.f41715s) >= 0) {
                    et0Var.g(i3);
                    return;
                }
                return;
            default:
                PrivacySettingsActivity.Z(this.f44811b);
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        String M0;
        int i10 = this.f44810a;
        PrivacySettingsActivity privacySettingsActivity = this.f44811b;
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
                String M02 = org.telegram.messenger.bd.M0(2131746802, "PrivacyPaymentsClearAlertTitle");
                org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.f27343a;
                s1Var2.S = M02;
                s1Var2.U = org.telegram.messenger.bd.M0(2131746804, "PrivacyPaymentsClearAlert");
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752099, "ClearButton"), new dt0(privacySettingsActivity, 1));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
                privacySettingsActivity.showDialog(s1Var2);
                privacySettingsActivity.showDialog(s1Var2);
                TextView textView = (TextView) s1Var2.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr = privacySettingsActivity.f41705a0;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity.getUserConfig().f22859y = null;
                privacySettingsActivity.getUserConfig().v(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new ei.u5(9));
                boolean z10 = zArr[0];
                if (z10 && zArr[1]) {
                    M0 = org.telegram.messenger.bd.M0(2131746800, "PrivacyPaymentsPaymentShippingCleared");
                } else if (z10) {
                    M0 = org.telegram.messenger.bd.M0(2131746799, "PrivacyPaymentsShippingInfoCleared");
                } else if (zArr[1]) {
                    M0 = org.telegram.messenger.bd.M0(2131746801, "PrivacyPaymentsPaymentInfoCleared");
                } else {
                    return;
                }
                org.telegram.ui.Components.fc.a0(privacySettingsActivity).Q(2131623981, 36, M0).j();
                return;
            case 2:
            case 3:
            default:
                org.telegram.ui.ActionBar.s1 p10 = new AlertDialog$Builder(3, privacySettingsActivity.getParentActivity(), null).p();
                privacySettingsActivity.f41708c = p10;
                p10.f28546j0 = false;
                if (privacySettingsActivity.T != privacySettingsActivity.U) {
                    org.telegram.messenger.h10 userConfig = privacySettingsActivity.getUserConfig();
                    boolean z11 = privacySettingsActivity.U;
                    userConfig.V = z11;
                    privacySettingsActivity.T = z11;
                    privacySettingsActivity.getUserConfig().v(false);
                }
                org.telegram.messenger.g5 contactsController = privacySettingsActivity.getContactsController();
                ct0 ct0Var = new ct0(privacySettingsActivity, 1);
                contactsController.K();
                TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
                int size = contactsController.f22653f0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    tL_contacts_deleteContacts.f27045id.add(contactsController.getMessagesController().o1(((TLRPC.TL_contact) contactsController.f22653f0.get(i11)).user_id));
                }
                contactsController.getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new org.telegram.messenger.s4(0, contactsController, ct0Var));
                return;
            case 4:
                xd0 xd0Var = new xd0();
                ct0 ct0Var2 = new ct0(privacySettingsActivity, 2);
                xd0Var.G = 3;
                xd0Var.f51946a = 12;
                xd0Var.f51954e0 = ct0Var2;
                privacySettingsActivity.presentFragment(xd0Var);
                return;
        }
    }
}
