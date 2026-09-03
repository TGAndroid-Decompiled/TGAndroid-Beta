package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class mj extends ql0 {
    public final Context f27073c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public kj f27074f;
    public int h;
    public final qj f27075n;

    public mj(qj qjVar, Context context) {
        this.f27075n = qjVar;
        this.f27073c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f == 0) {
            return true;
        }
        return false;
    }

    public final Object E(int i10) {
        int i11 = i10 - 1;
        if (i11 >= 0 && i11 < this.d.size()) {
            return this.d.get(i11);
        }
        return null;
    }

    @Override
    public final int h() {
        return this.d.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == h() - 1) {
            return 2;
        }
        return 0;
    }

    @Override
    public final void l() {
        super.l();
        this.f27075n.N();
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        TLRPC.User user;
        if (l1Var.f5777f == 0) {
            pj pjVar = (pj) l1Var.f5774a;
            if (i10 != h() - 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object E = E(i10);
            if (E instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) E;
                user = contact.user;
                if (user == null) {
                    pjVar.setCurrentId(contact.contact_id);
                    pjVar.a(null, (CharSequence) this.e.get(i10 - 1), new hj(contact, 1), z4);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                pjVar.a(user, (CharSequence) this.e.get(i10 - 1), new ij(1, user), z4);
            }
            boolean containsKey = this.f27075n.f28195w.containsKey(fj.a(E));
            kp kpVar = pjVar.d;
            if (kpVar.getVisibility() != 0) {
                kpVar.setVisibility(0);
            }
            kpVar.a(containsKey, false);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View pjVar;
        Context context = this.f27073c;
        if (i10 != 0) {
            if (i10 != 1) {
                pjVar = new View(context);
                pjVar.setTag(-33024);
            } else {
                pjVar = new View(context);
                pjVar.setLayoutParams(new f2.w0(-1, AndroidUtilities.dp(56.0f)));
                pjVar.setTag(-33024);
            }
        } else {
            pjVar = new pj(context, this.f27075n.f24281a);
        }
        return new f2.l1(pjVar);
    }
}
