package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class uj extends kl0 {
    public final Context f30908c;
    public ArrayList d = new ArrayList();
    public ArrayList f30909e = new ArrayList();
    public tj f30910f;
    public int h;
    public final yj f30911n;

    public uj(yj yjVar, Context context) {
        this.f30911n = yjVar;
        this.f30908c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45742f == 0) {
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
        this.f30911n.N();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        TLRPC.User user;
        if (c1Var.f45742f == 0) {
            xj xjVar = (xj) c1Var.f45738a;
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
                    xjVar.a(null, (CharSequence) this.f30909e.get(i10 - 1), new qj(contact, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                xjVar.a(user, (CharSequence) this.f30909e.get(i10 - 1), new rj(1, user), z10);
            }
            boolean containsKey = this.f30911n.f32934w.containsKey(oj.a(E));
            mp mpVar = xjVar.d;
            if (mpVar.getVisibility() != 0) {
                mpVar.setVisibility(0);
            }
            mpVar.a(containsKey, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View xjVar;
        Context context = this.f30908c;
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
            xjVar = new xj(context, this.f30911n.f28752a);
        }
        return new s4.c1(xjVar);
    }
}
