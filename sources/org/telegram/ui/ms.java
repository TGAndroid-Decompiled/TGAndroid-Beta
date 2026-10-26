package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ms implements org.telegram.ui.Components.bm0, r0.n, org.telegram.ui.ActionBar.b2 {
    public final ContactsActivity f41653a;

    public ms(ContactsActivity contactsActivity) {
        this.f41653a = contactsActivity;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        int i10 = defaultWindowInsets.d;
        ContactsActivity contactsActivity = this.f41653a;
        contactsActivity.f35469k0 = i10;
        oi.a.d(contactsActivity.d, defaultWindowInsets.f13451b, i10, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), contactsActivity.f35466h0);
        contactsActivity.f0();
        contactsActivity.e0();
        return r0.k1.f47117b;
    }

    @Override
    public boolean c(int i10, View view) {
        ContactsActivity contactsActivity = this.f41653a;
        s4.h0 adapter = contactsActivity.d.getAdapter();
        os osVar = contactsActivity.f35457b;
        if (adapter == osVar) {
            int S = osVar.S(i10);
            int Q = contactsActivity.f35457b.Q(i10);
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f31882x;
            if (qcVar != null) {
                qcVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.I;
        if (!z10 && !contactsActivity.J && (view instanceof org.telegram.ui.Cells.ab)) {
            contactsActivity.l0((org.telegram.ui.Cells.ab) view);
            return true;
        } else if (!z10 && !contactsActivity.J && (view instanceof org.telegram.ui.Cells.m6)) {
            org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) view;
            if (m6Var.getUser() != null && m6Var.getUser().contact) {
                contactsActivity.l0(m6Var);
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        ContactsActivity contactsActivity = this.f41653a;
        contactsActivity.getClass();
        a0.h hVar = contactsActivity.Z;
        ArrayList arrayList = new ArrayList(hVar.m());
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            arrayList.add((TLRPC.User) hVar.f(hVar.j(i11)));
        }
        contactsActivity.getContactsController().deleteContactsUndoable(contactsActivity.getParentActivity(), contactsActivity, arrayList);
        contactsActivity.i0();
    }
}
