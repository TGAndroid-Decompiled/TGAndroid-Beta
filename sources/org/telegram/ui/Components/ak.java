package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class ak extends vm0 {
    public final Context f24411c;
    public ArrayList d = new ArrayList();
    public ArrayList f24412e = new ArrayList();
    public zj f24413f;
    public int h;
    public final ek f24414n;

    public ak(ek ekVar, Context context) {
        this.f24414n = ekVar;
        this.f24411c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47901f == 0) {
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
        this.f24414n.Q();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        TLRPC.User user;
        if (d1Var.f47901f == 0) {
            dk dkVar = (dk) d1Var.f47897a;
            if (i10 != h() - 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object E = E(i10);
            if (E instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) E;
                user = contact.user;
                if (user == null) {
                    dkVar.setCurrentId(contact.contact_id);
                    dkVar.a(null, (CharSequence) this.f24412e.get(i10 - 1), new wj(contact, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                dkVar.a(user, (CharSequence) this.f24412e.get(i10 - 1), new xj(1, user), z10);
            }
            boolean containsKey = this.f24414n.f25719w.containsKey(uj.a(E));
            fq fqVar = dkVar.d;
            if (fqVar.getVisibility() != 0) {
                fqVar.setVisibility(0);
            }
            fqVar.a(containsKey, false);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View dkVar;
        Context context = this.f24411c;
        if (i10 != 0) {
            if (i10 != 1) {
                dkVar = new View(context);
                dkVar.setTag(-33024);
            } else {
                dkVar = new View(context);
                dkVar.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
                dkVar.setTag(-33024);
            }
        } else {
            dkVar = new dk(context, this.f24414n.f30569a);
        }
        return new s4.d1(dkVar);
    }
}
