package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class mt0 implements org.telegram.ui.ActionBar.r1 {
    public final int f47875a;
    public final PrivacySettingsActivity f47876b;

    public mt0(PrivacySettingsActivity privacySettingsActivity, int i7) {
        this.f47875a = i7;
        this.f47876b = privacySettingsActivity;
    }

    public void a() {
        int i7;
        switch (this.f47875a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.f47876b;
                ot0 ot0Var = privacySettingsActivity.f41673a;
                if (ot0Var != null && (i7 = privacySettingsActivity.f41683s) >= 0) {
                    ot0Var.g(i7);
                    return;
                }
                return;
            default:
                PrivacySettingsActivity.Z(this.f47876b);
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        String M0;
        int i10 = this.f47875a;
        PrivacySettingsActivity privacySettingsActivity = this.f47876b;
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
                String M02 = org.telegram.messenger.hd.M0(2131746793, "PrivacyPaymentsClearAlertTitle");
                org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.f27293a;
                u1Var2.R = M02;
                u1Var2.T = org.telegram.messenger.hd.M0(2131746795, "PrivacyPaymentsClearAlert");
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752099, "ClearButton"), new mt0(privacySettingsActivity, 1));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
                privacySettingsActivity.showDialog(u1Var2);
                privacySettingsActivity.showDialog(u1Var2);
                TextView textView = (TextView) u1Var2.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28090q7, null);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr = privacySettingsActivity.Z;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity.getUserConfig().f24496y = null;
                privacySettingsActivity.getUserConfig().v(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new di.u5(9));
                boolean z9 = zArr[0];
                if (z9 && zArr[1]) {
                    M0 = org.telegram.messenger.hd.M0(2131746791, "PrivacyPaymentsPaymentShippingCleared");
                } else if (z9) {
                    M0 = org.telegram.messenger.hd.M0(2131746790, "PrivacyPaymentsShippingInfoCleared");
                } else if (zArr[1]) {
                    M0 = org.telegram.messenger.hd.M0(2131746792, "PrivacyPaymentsPaymentInfoCleared");
                } else {
                    return;
                }
                org.telegram.ui.Components.hc.a0(privacySettingsActivity).Q(2131623981, 36, M0).j();
                return;
            case 2:
            case 3:
            default:
                org.telegram.ui.ActionBar.u1 p10 = new AlertDialog$Builder(3, privacySettingsActivity.getParentActivity(), null).p();
                privacySettingsActivity.f41677c = p10;
                p10.f28569i0 = false;
                if (privacySettingsActivity.S != privacySettingsActivity.T) {
                    org.telegram.messenger.p10 userConfig = privacySettingsActivity.getUserConfig();
                    boolean z10 = privacySettingsActivity.T;
                    userConfig.U = z10;
                    privacySettingsActivity.S = z10;
                    privacySettingsActivity.getUserConfig().v(false);
                }
                org.telegram.messenger.g5 contactsController = privacySettingsActivity.getContactsController();
                lt0 lt0Var = new lt0(privacySettingsActivity, 1);
                contactsController.K();
                TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
                int size = contactsController.f22589e0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    tL_contacts_deleteContacts.f26997id.add(contactsController.getMessagesController().o1(((TLRPC.TL_contact) contactsController.f22589e0.get(i11)).user_id));
                }
                contactsController.getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new org.telegram.messenger.s4(0, contactsController, lt0Var));
                return;
            case 4:
                ce0 ce0Var = new ce0();
                lt0 lt0Var2 = new lt0(privacySettingsActivity, 2);
                ce0Var.F = 3;
                ce0Var.f44756a = 12;
                ce0Var.f44762d0 = lt0Var2;
                privacySettingsActivity.presentFragment(ce0Var);
                return;
        }
    }
}
