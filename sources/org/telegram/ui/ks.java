package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ks implements org.telegram.ui.ActionBar.a2, org.telegram.ui.Components.kl0, org.telegram.ui.Components.yl0, r0.n {
    public final ContactsActivity f38674a;

    public ks(ContactsActivity contactsActivity) {
        this.f38674a = contactsActivity;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        int i10 = AndroidUtilities.getDefaultWindowInsets(k1Var, false).d;
        ContactsActivity contactsActivity = this.f38674a;
        contactsActivity.f33083q0 = i10;
        contactsActivity.j0();
        contactsActivity.i0();
        contactsActivity.h0();
        return r0.k1.f44852b;
    }

    @Override
    public boolean a(int i10, View view) {
        ContactsActivity contactsActivity = this.f38674a;
        s4.g0 adapter = contactsActivity.f33071f.getAdapter();
        ps psVar = contactsActivity.d;
        if (adapter == psVar) {
            int S = psVar.S(i10);
            int Q = contactsActivity.d.Q(i10);
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29632w;
            if (qcVar != null) {
                qcVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.K;
        if (!z10 && !contactsActivity.L && (view instanceof org.telegram.ui.Cells.va)) {
            contactsActivity.r0((org.telegram.ui.Cells.va) view);
            return true;
        } else if (!z10 && !contactsActivity.L && (view instanceof org.telegram.ui.Cells.h6)) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (h6Var.getUser() != null && h6Var.getUser().contact) {
                contactsActivity.r0(h6Var);
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void b() {
        this.f38674a.g0();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ContactsActivity contactsActivity = this.f38674a;
        contactsActivity.getClass();
        a0.h hVar = contactsActivity.f33069d0;
        ArrayList arrayList = new ArrayList(hVar.m());
        for (int i11 = 0; i11 < hVar.m(); i11++) {
            arrayList.add((TLRPC.User) hVar.f(hVar.j(i11)));
        }
        contactsActivity.getContactsController().deleteContactsUndoable(contactsActivity.getParentActivity(), contactsActivity, arrayList);
        contactsActivity.o0();
    }
}
