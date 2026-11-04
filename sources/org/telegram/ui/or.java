package org.telegram.ui;

import android.app.Activity;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class or implements org.telegram.ui.Components.hj0, r0.m, org.telegram.ui.ActionBar.p1 {
    public final ContactsActivity f48334a;

    public or(ContactsActivity contactsActivity) {
        this.f48334a = contactsActivity;
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        int i3 = I0.d;
        ContactsActivity contactsActivity = this.f48334a;
        contactsActivity.f41223l0 = i3;
        pi.a.e(contactsActivity.d, I0.f14496b, i3, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), contactsActivity.f41220i0);
        contactsActivity.j0();
        contactsActivity.i0();
        return r0.k1.f54025b;
    }

    @Override
    public boolean f(int i3, View view) {
        ContactsActivity contactsActivity = this.f48334a;
        u4.h0 adapter = contactsActivity.d.getAdapter();
        qr qrVar = contactsActivity.f41209b;
        if (adapter == qrVar) {
            int S = qrVar.S(i3);
            int Q = contactsActivity.f41209b.Q(i3);
            org.telegram.ui.Components.ac acVar = org.telegram.ui.Components.ac.f31784w;
            if (acVar != null) {
                acVar.b();
            }
            if (Q < 0 || S < 0) {
                return false;
            }
        }
        boolean z10 = contactsActivity.J;
        if (!z10 && !contactsActivity.K && (view instanceof org.telegram.ui.Cells.pa)) {
            contactsActivity.p0((org.telegram.ui.Cells.pa) view);
            return true;
        } else if (!z10 && !contactsActivity.K && (view instanceof org.telegram.ui.Cells.f6)) {
            org.telegram.ui.Cells.f6 f6Var = (org.telegram.ui.Cells.f6) view;
            if (f6Var.getUser() != null && f6Var.getUser().contact) {
                contactsActivity.p0(f6Var);
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        ContactsActivity contactsActivity = this.f48334a;
        a0.h hVar = contactsActivity.f41208a0;
        ArrayList arrayList = new ArrayList(hVar.m());
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            arrayList.add((TLRPC.User) hVar.f(hVar.j(i10)));
        }
        org.telegram.messenger.g5 contactsController = contactsActivity.getContactsController();
        Activity parentActivity = contactsActivity.getParentActivity();
        contactsController.getClass();
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.User user = (TLRPC.User) arrayList.get(i11);
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) contactsController.f22654g0.get(Long.valueOf(user.f27150id));
                user.contact = false;
                contactsController.f22653f0.remove(tL_contact);
                contactsController.f22654g0.remove(Long.valueOf(user.f27150id));
                hashMap.put(user, tL_contact);
            }
            contactsController.d(false);
            org.telegram.messenger.hs notificationCenter = contactsController.getNotificationCenter();
            int i12 = org.telegram.messenger.hp.C8;
            notificationCenter.k(org.telegram.messenger.hs.f23292r, 1);
            contactsController.getNotificationCenter().k(org.telegram.messenger.hs.O, new Object[0]);
            org.telegram.ui.Components.sb sbVar = new org.telegram.ui.Components.sb(parentActivity, contactsActivity.getResourceProvider());
            sbVar.setTimer();
            sbVar.f37963b.setText(org.telegram.messenger.bd.G(hashMap.size(), "ContactsDeletedUndo", new Object[0]));
            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(parentActivity, contactsActivity.getResourceProvider(), true, true);
            ybVar.f40672b = new org.telegram.messenger.b4(27, contactsController, hashMap);
            ybVar.f40673c = new org.telegram.messenger.w4(contactsController, arrayList, 1);
            sbVar.setButton(ybVar);
            org.telegram.ui.Components.ac.g(contactsActivity, sbVar, 5000).j();
        }
        contactsActivity.m0();
    }
}
