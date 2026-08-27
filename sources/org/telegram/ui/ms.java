package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

public final class ms implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.ek0, org.telegram.ui.Components.rk0, r0.o {

    public final ContactsActivity f40590a;

    public ms(ContactsActivity contactsActivity) {
        this.f40590a = contactsActivity;
    }

    @Override
    public r0.m1 I0(View view, r0.m1 m1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(m1Var, false).d;
        ContactsActivity contactsActivity = this.f40590a;
        contactsActivity.m0 = i10;
        contactsActivity.j0();
        contactsActivity.i0();
        contactsActivity.h0();
        return r0.m1.f46618b;
    }

    @Override
    public boolean a(int i10, View view) {
        ContactsActivity contactsActivity = this.f40590a;
        f2.q0 adapter = contactsActivity.f35423f.getAdapter();
        rs rsVar = contactsActivity.d;
        if (adapter == rsVar) {
            int iS = rsVar.S(i10);
            int iQ = contactsActivity.d.Q(i10);
            org.telegram.ui.Components.ec ecVar = org.telegram.ui.Components.ec.f28012w;
            if (ecVar != null) {
                ecVar.b();
            }
            if (iQ < 0 || iS < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.G;
        if (!z10 && !contactsActivity.H && (view instanceof org.telegram.ui.Cells.sa)) {
            contactsActivity.r0((org.telegram.ui.Cells.sa) view);
            return true;
        }
        if (z10 || contactsActivity.H || !(view instanceof org.telegram.ui.Cells.e6)) {
            return false;
        }
        org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
        if (e6Var.getUser() != null && e6Var.getUser().contact) {
            contactsActivity.r0(e6Var);
        }
        return true;
    }

    @Override
    public void b() {
        this.f40590a.g0();
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ContactsActivity contactsActivity = this.f40590a;
        contactsActivity.getClass();
        a0.h hVar = contactsActivity.Z;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hVar.m());
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            arrayList.add((TLRPC.User) hVar.f(hVar.j(i11)));
        }
        contactsActivity.getContactsController().deleteContactsUndoable(contactsActivity.getParentActivity(), contactsActivity, arrayList);
        contactsActivity.o0();
    }
}
