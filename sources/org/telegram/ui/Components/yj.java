package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class yj extends qm0 {
    public final Context f33308c;
    public ArrayList d = new ArrayList();
    public ArrayList f33309e = new ArrayList();
    public xj f33310f;
    public int h;
    public final ck f33311n;

    public yj(ck ckVar, Context context) {
        this.f33311n = ckVar;
        this.f33308c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47706f == 0) {
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
        this.f33311n.Q();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        TLRPC.User user;
        if (d1Var.f47706f == 0) {
            bk bkVar = (bk) d1Var.f47702a;
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
                    bkVar.setCurrentId(contact.contact_id);
                    bkVar.a(null, (CharSequence) this.f33309e.get(i10 - 1), new uj(contact, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                bkVar.a(user, (CharSequence) this.f33309e.get(i10 - 1), new vj(1, user), z10);
            }
            boolean containsKey = this.f33311n.f25314w.containsKey(sj.a(E));
            dq dqVar = bkVar.d;
            if (dqVar.getVisibility() != 0) {
                dqVar.setVisibility(0);
            }
            dqVar.a(containsKey, false);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View bkVar;
        Context context = this.f33308c;
        if (i10 != 0) {
            if (i10 != 1) {
                bkVar = new View(context);
                bkVar.setTag(-33024);
            } else {
                bkVar = new View(context);
                bkVar.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
                bkVar.setTag(-33024);
            }
        } else {
            bkVar = new bk(context, this.f33311n.f30210a);
        }
        return new s4.d1(bkVar);
    }
}
