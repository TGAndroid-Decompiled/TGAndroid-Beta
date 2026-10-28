package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class tj extends mm0 {
    public final Context f33061c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public sj f33062f;
    public int h;
    public final xj f33063n;

    public tj(xj xjVar, Context context) {
        this.f33063n = xjVar;
        this.f33061c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47776f == 0) {
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
        this.f33063n.Q();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        TLRPC.User user;
        if (e1Var.f47776f == 0) {
            wj wjVar = (wj) e1Var.f47773a;
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
                    wjVar.setCurrentId(contact.contact_id);
                    wjVar.a(null, (CharSequence) this.e.get(i10 - 1), new pj(contact, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                wjVar.a(user, (CharSequence) this.e.get(i10 - 1), new qj(1, user), z10);
            }
            boolean containsKey = this.f33063n.f34785w.containsKey(nj.a(E));
            aq aqVar = wjVar.d;
            if (aqVar.getVisibility() != 0) {
                aqVar.setVisibility(0);
            }
            aqVar.a(containsKey, false);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View wjVar;
        Context context = this.f33061c;
        if (i10 != 0) {
            if (i10 != 1) {
                wjVar = new View(context);
                wjVar.setTag(-33024);
            } else {
                wjVar = new View(context);
                wjVar.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
                wjVar.setTag(-33024);
            }
        } else {
            wjVar = new wj(context, this.f33063n.f30253a);
        }
        return new s4.e1(wjVar);
    }
}
