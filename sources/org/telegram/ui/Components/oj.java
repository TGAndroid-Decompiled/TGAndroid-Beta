package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class oj extends il0 {
    public final Context f31373c;
    public ArrayList d = new ArrayList();
    public ArrayList f31374e = new ArrayList();
    public mj f31375f;
    public int h;
    public final sj f31376n;

    public oj(sj sjVar, Context context) {
        this.f31376n = sjVar;
        this.f31373c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        if (n1Var.f6436f == 0) {
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
        this.f31376n.M();
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        boolean z10;
        TLRPC.User user;
        if (n1Var.f6436f == 0) {
            rj rjVar = (rj) n1Var.f6432a;
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
                    rjVar.setCurrentId(contact.contact_id);
                    rjVar.a(null, (CharSequence) this.f31374e.get(i10 - 1), new jj(contact, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                rjVar.a(user, (CharSequence) this.f31374e.get(i10 - 1), new kj(1, user), z10);
            }
            boolean containsKey = this.f31376n.f32657w.containsKey(hj.a(E));
            hp hpVar = rjVar.d;
            if (hpVar.getVisibility() != 0) {
                hpVar.setVisibility(0);
            }
            hpVar.a(containsKey, false);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View rjVar;
        Context context = this.f31373c;
        if (i10 != 0) {
            if (i10 != 1) {
                rjVar = new View(context);
                rjVar.setTag(-33024);
            } else {
                rjVar = new View(context);
                rjVar.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
                rjVar.setTag(-33024);
            }
        } else {
            rjVar = new rj(context, this.f31376n.f28402a);
        }
        return new f2.n1(rjVar);
    }
}
