package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class oj extends rl0 {
    public final Context f29781c;
    public ArrayList d = new ArrayList();
    public ArrayList f29782e = new ArrayList();
    public mj f29783f;
    public int h;
    public final sj f29784n;

    public oj(sj sjVar, Context context) {
        this.f29784n = sjVar;
        this.f29781c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 0) {
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
        this.f29784n.N();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        TLRPC.User user;
        if (m1Var.f5879f == 0) {
            rj rjVar = (rj) m1Var.f5875a;
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
                    rjVar.setCurrentId(contact.contact_id);
                    rjVar.a(null, (CharSequence) this.f29782e.get(i10 - 1), new jj(contact, 1), z4);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                rjVar.a(user, (CharSequence) this.f29782e.get(i10 - 1), new kj(1, user), z4);
            }
            boolean containsKey = this.f29784n.f31070w.containsKey(hj.a(E));
            np npVar = rjVar.d;
            if (npVar.getVisibility() != 0) {
                npVar.setVisibility(0);
            }
            npVar.a(containsKey, false);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View rjVar;
        Context context = this.f29781c;
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
            rjVar = new rj(context, this.f29784n.f26589a);
        }
        return new f2.m1(rjVar);
    }
}
