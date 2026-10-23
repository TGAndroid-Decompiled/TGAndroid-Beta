package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ls implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.ol0, org.telegram.ui.Components.cm0, r0.n {
    public final ContactsActivity f39319a;

    public ls(ContactsActivity contactsActivity) {
        this.f39319a = contactsActivity;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(k1Var, false).d;
        ContactsActivity contactsActivity = this.f39319a;
        contactsActivity.f33397q0 = i10;
        contactsActivity.j0();
        contactsActivity.i0();
        contactsActivity.h0();
        return r0.k1.f45250b;
    }

    @Override
    public void a() {
        this.f39319a.f0();
    }

    @Override
    public boolean d(int i10, View view) {
        ContactsActivity contactsActivity = this.f39319a;
        s4.g0 adapter = contactsActivity.f33385f.getAdapter();
        qs qsVar = contactsActivity.d;
        if (adapter == qsVar) {
            int S = qsVar.S(i10);
            int Q = contactsActivity.d.Q(i10);
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29825w;
            if (qcVar != null) {
                qcVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.K;
        if (!z10 && !contactsActivity.L && (view instanceof org.telegram.ui.Cells.wa)) {
            contactsActivity.r0((org.telegram.ui.Cells.wa) view);
            return true;
        } else if (!z10 && !contactsActivity.L && (view instanceof org.telegram.ui.Cells.i6)) {
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
            if (i6Var.getUser() != null && i6Var.getUser().contact) {
                contactsActivity.r0(i6Var);
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ContactsActivity contactsActivity = this.f39319a;
        contactsActivity.getClass();
        a0.h hVar = contactsActivity.f33383d0;
        ArrayList arrayList = new ArrayList(hVar.m());
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            arrayList.add((TLRPC.User) hVar.f(hVar.j(i11)));
        }
        contactsActivity.getContactsController().deleteContactsUndoable(contactsActivity.getParentActivity(), contactsActivity, arrayList);
        contactsActivity.o0();
    }
}
