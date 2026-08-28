package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ls implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.ck0, org.telegram.ui.Components.ok0, r0.o {
    public final ContactsActivity f40223a;

    public ls(ContactsActivity contactsActivity) {
        this.f40223a = contactsActivity;
    }

    @Override
    public r0.m1 L0(View view, r0.m1 m1Var) {
        int i9 = AndroidUtilities.getDefaultWindowInsets(m1Var, false).d;
        ContactsActivity contactsActivity = this.f40223a;
        contactsActivity.m0 = i9;
        contactsActivity.i0();
        contactsActivity.h0();
        contactsActivity.g0();
        return r0.m1.f46928b;
    }

    @Override
    public boolean a(int i9, View view) {
        ContactsActivity contactsActivity = this.f40223a;
        f2.r0 adapter = contactsActivity.f35420f.getAdapter();
        qs qsVar = contactsActivity.d;
        if (adapter == qsVar) {
            int S = qsVar.S(i9);
            int Q = contactsActivity.d.Q(i9);
            org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f28729w;
            if (gcVar != null) {
                gcVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.G;
        if (!z10 && !contactsActivity.H && (view instanceof org.telegram.ui.Cells.va)) {
            contactsActivity.q0((org.telegram.ui.Cells.va) view);
            return true;
        } else if (!z10 && !contactsActivity.H && (view instanceof org.telegram.ui.Cells.h6)) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (h6Var.getUser() != null && h6Var.getUser().contact) {
                contactsActivity.q0(h6Var);
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void b() {
        this.f40223a.f0();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        ContactsActivity contactsActivity = this.f40223a;
        contactsActivity.getClass();
        a0.h hVar = contactsActivity.Z;
        ArrayList arrayList = new ArrayList(hVar.m());
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            arrayList.add((TLRPC.User) hVar.f(hVar.j(i10)));
        }
        contactsActivity.getContactsController().deleteContactsUndoable(contactsActivity.getParentActivity(), contactsActivity, arrayList);
        contactsActivity.n0();
    }
}
