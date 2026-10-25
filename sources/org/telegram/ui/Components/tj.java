package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class tj extends lm0 {
    public final Context f33086c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public sj f33087f;
    public int h;
    public final xj f33088n;

    public tj(xj xjVar, Context context) {
        this.f33088n = xjVar;
        this.f33086c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47738f == 0) {
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
        this.f33088n.Q();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        TLRPC.User user;
        if (e1Var.f47738f == 0) {
            wj wjVar = (wj) e1Var.f47735a;
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
            boolean containsKey = this.f33088n.f34729w.containsKey(nj.a(E));
            zp zpVar = wjVar.d;
            if (zpVar.getVisibility() != 0) {
                zpVar.setVisibility(0);
            }
            zpVar.a(containsKey, false);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View wjVar;
        Context context = this.f33086c;
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
            wjVar = new wj(context, this.f33088n.f30212a);
        }
        return new s4.e1(wjVar);
    }
}
