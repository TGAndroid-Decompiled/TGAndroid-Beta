package org.telegram.ui;

import android.app.Dialog;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class kt0 implements org.telegram.ui.ActionBar.q1 {
    public final int f48770a;
    public final PrivacySettingsActivity f48771b;

    public kt0(PrivacySettingsActivity privacySettingsActivity, int i7) {
        this.f48770a = i7;
        this.f48771b = privacySettingsActivity;
    }

    public void a() {
        int i7;
        switch (this.f48770a) {
            case 2:
                PrivacySettingsActivity privacySettingsActivity = this.f48771b;
                lt0 lt0Var = privacySettingsActivity.f43047a;
                if (lt0Var != null && (i7 = privacySettingsActivity.f43058s) >= 0) {
                    lt0Var.g(i7);
                    return;
                }
                return;
            default:
                PrivacySettingsActivity.Z(this.f48771b);
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        String M0;
        int i10 = this.f48770a;
        PrivacySettingsActivity privacySettingsActivity = this.f48771b;
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
                String M02 = org.telegram.messenger.hd.M0(2131746794, "PrivacyPaymentsClearAlertTitle");
                org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28392a;
                t1Var2.S = M02;
                t1Var2.U = org.telegram.messenger.hd.M0(2131746796, "PrivacyPaymentsClearAlert");
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752099, "ClearButton"), new kt0(privacySettingsActivity, 1));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
                privacySettingsActivity.showDialog(t1Var2);
                privacySettingsActivity.showDialog(t1Var2);
                TextView textView = (TextView) t1Var2.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, null);
                    return;
                }
                return;
            case 1:
                TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
                boolean[] zArr = privacySettingsActivity.f43048a0;
                tL_payments_clearSavedInfo.credentials = zArr[1];
                tL_payments_clearSavedInfo.info = zArr[0];
                privacySettingsActivity.getUserConfig().f24970y = null;
                privacySettingsActivity.getUserConfig().v(false);
                privacySettingsActivity.getConnectionsManager().sendRequest(tL_payments_clearSavedInfo, new fi.m5(9));
                boolean z10 = zArr[0];
                if (z10 && zArr[1]) {
                    M0 = org.telegram.messenger.hd.M0(2131746792, "PrivacyPaymentsPaymentShippingCleared");
                } else if (z10) {
                    M0 = org.telegram.messenger.hd.M0(2131746791, "PrivacyPaymentsShippingInfoCleared");
                } else if (zArr[1]) {
                    M0 = org.telegram.messenger.hd.M0(2131746793, "PrivacyPaymentsPaymentInfoCleared");
                } else {
                    return;
                }
                org.telegram.ui.Components.cc.a0(privacySettingsActivity).Q(2131623982, 36, M0).j();
                return;
            case 2:
            case 3:
            default:
                org.telegram.ui.ActionBar.t1 p10 = new AlertDialog$Builder(3, privacySettingsActivity.getParentActivity(), null).p();
                privacySettingsActivity.f43051c = p10;
                p10.f29637j0 = false;
                if (privacySettingsActivity.T != privacySettingsActivity.U) {
                    org.telegram.messenger.m10 userConfig = privacySettingsActivity.getUserConfig();
                    boolean z11 = privacySettingsActivity.U;
                    userConfig.V = z11;
                    privacySettingsActivity.T = z11;
                    privacySettingsActivity.getUserConfig().v(false);
                }
                org.telegram.messenger.g5 contactsController = privacySettingsActivity.getContactsController();
                jt0 jt0Var = new jt0(privacySettingsActivity, 1);
                contactsController.K();
                TLRPC.TL_contacts_deleteContacts tL_contacts_deleteContacts = new TLRPC.TL_contacts_deleteContacts();
                int size = contactsController.f23681f0.size();
                for (int i11 = 0; i11 < size; i11++) {
                    tL_contacts_deleteContacts.f28095id.add(contactsController.getMessagesController().o1(((TLRPC.TL_contact) contactsController.f23681f0.get(i11)).user_id));
                }
                contactsController.getConnectionsManager().sendRequest(tL_contacts_deleteContacts, new org.telegram.messenger.r4(0, contactsController, jt0Var));
                return;
            case 4:
                ce0 ce0Var = new ce0();
                jt0 jt0Var2 = new jt0(privacySettingsActivity, 2);
                ce0Var.G = 3;
                ce0Var.f46074a = 12;
                ce0Var.f46082e0 = jt0Var2;
                privacySettingsActivity.presentFragment(ce0Var);
                return;
        }
    }
}
