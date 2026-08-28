package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class lj extends vk0 {
    public final Context f30462c;
    public ArrayList d = new ArrayList();
    public ArrayList f30463e = new ArrayList();
    public jj f30464f;
    public int h;
    public final pj f30465n;

    public lj(pj pjVar, Context context) {
        this.f30465n = pjVar;
        this.f30462c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 0) {
            return true;
        }
        return false;
    }

    public final Object E(int i9) {
        int i10 = i9 - 1;
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.d.size() + 2;
    }

    @Override
    public final int j(int i9) {
        if (i9 == 0) {
            return 1;
        }
        if (i9 == h() - 1) {
            return 2;
        }
        return 0;
    }

    @Override
    public final void l() {
        super.l();
        this.f30465n.M();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        TLRPC.User user;
        if (q1Var.f5505f == 0) {
            oj ojVar = (oj) q1Var.f5501a;
            if (i9 != h() - 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object E = E(i9);
            if (E instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) E;
                user = contact.user;
                if (user == null) {
                    ojVar.setCurrentId(contact.contact_id);
                    ojVar.a(null, (CharSequence) this.f30463e.get(i9 - 1), new gj(contact, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                ojVar.a(user, (CharSequence) this.f30463e.get(i9 - 1), new hj(1, user), z10);
            }
            boolean containsKey = this.f30465n.f31680w.containsKey(ej.a(E));
            dp dpVar = ojVar.d;
            if (dpVar.getVisibility() != 0) {
                dpVar.setVisibility(0);
            }
            dpVar.a(containsKey, false);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View ojVar;
        Context context = this.f30462c;
        if (i9 != 0) {
            if (i9 != 1) {
                ojVar = new View(context);
                ojVar.setTag(-33024);
            } else {
                ojVar = new View(context);
                ojVar.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(56.0f)));
                ojVar.setTag(-33024);
            }
        } else {
            ojVar = new oj(context, this.f30465n.f27492a);
        }
        return new f2.q1(ojVar);
    }
}
