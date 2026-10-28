package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class os implements org.telegram.ui.Components.cm0, r0.n, org.telegram.ui.ActionBar.b2 {
    public final ContactsActivity f42185a;

    public os(ContactsActivity contactsActivity) {
        this.f42185a = contactsActivity;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        int i10 = defaultWindowInsets.d;
        ContactsActivity contactsActivity = this.f42185a;
        contactsActivity.f35493k0 = i10;
        oi.a.d(contactsActivity.d, defaultWindowInsets.f13450b, i10, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), contactsActivity.f35490h0);
        contactsActivity.f0();
        contactsActivity.e0();
        return r0.k1.f47152b;
    }

    @Override
    public boolean c(int i10, View view) {
        ContactsActivity contactsActivity = this.f42185a;
        s4.h0 adapter = contactsActivity.d.getAdapter();
        qs qsVar = contactsActivity.f35481b;
        if (adapter == qsVar) {
            int S = qsVar.S(i10);
            int Q = contactsActivity.f35481b.Q(i10);
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f31854x;
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
        ContactsActivity contactsActivity = this.f42185a;
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
