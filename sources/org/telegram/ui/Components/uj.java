package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class uj extends ul0 {
    public final Context f28692c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public tj f28693f;
    public int h;
    public final yj f28694n;

    public uj(yj yjVar, Context context) {
        this.f28694n = yjVar;
        this.f28692c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42977f == 0) {
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
        this.f28694n.N();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        TLRPC.User user;
        if (c1Var.f42977f == 0) {
            xj xjVar = (xj) c1Var.f42974a;
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
                    xjVar.setCurrentId(contact.contact_id);
                    xjVar.a(null, (CharSequence) this.e.get(i10 - 1), new qj(contact, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                xjVar.a(user, (CharSequence) this.e.get(i10 - 1), new rj(1, user), z10);
            }
            boolean containsKey = this.f28694n.f30566w.containsKey(oj.a(E));
            np npVar = xjVar.d;
            if (npVar.getVisibility() != 0) {
                npVar.setVisibility(0);
            }
            npVar.a(containsKey, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View xjVar;
        Context context = this.f28692c;
        if (i10 != 0) {
            if (i10 != 1) {
                xjVar = new View(context);
                xjVar.setTag(-33024);
            } else {
                xjVar = new View(context);
                xjVar.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                xjVar.setTag(-33024);
            }
        } else {
            xjVar = new xj(context, this.f28694n.f26654a);
        }
        return new s4.c1(xjVar);
    }
}
