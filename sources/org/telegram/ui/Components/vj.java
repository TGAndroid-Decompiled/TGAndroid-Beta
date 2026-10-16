package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class vj extends lm0 {
    public final Context f29740c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public uj f29741f;
    public int h;
    public final zj f29742n;

    public vj(zj zjVar, Context context) {
        this.f29742n = zjVar;
        this.f29740c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f == 0) {
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
        this.f29742n.Q();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        TLRPC.User user;
        if (b1Var.f44841f == 0) {
            yj yjVar = (yj) b1Var.f44838a;
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
                    yjVar.setCurrentId(contact.contact_id);
                    yjVar.a(null, (CharSequence) this.e.get(i10 - 1), new rj(contact, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                yjVar.a(user, (CharSequence) this.e.get(i10 - 1), new sj(1, user), z10);
            }
            boolean containsKey = this.f29742n.f31580w.containsKey(pj.a(E));
            aq aqVar = yjVar.d;
            if (aqVar.getVisibility() != 0) {
                aqVar.setVisibility(0);
            }
            aqVar.a(containsKey, false);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View yjVar;
        Context context = this.f29740c;
        if (i10 != 0) {
            if (i10 != 1) {
                yjVar = new View(context);
                yjVar.setTag(-33024);
            } else {
                yjVar = new View(context);
                yjVar.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
                yjVar.setTag(-33024);
            }
        } else {
            yjVar = new yj(context, this.f29742n.f27359a);
        }
        return new s4.b1(yjVar);
    }
}
