package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class wj extends wl0 {
    public final Context f30092c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public vj f30093f;
    public int h;
    public final ak f30094n;

    public wj(ak akVar, Context context) {
        this.f30094n = akVar;
        this.f30092c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42962f == 0) {
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
        this.f30094n.N();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        TLRPC.User user;
        if (c1Var.f42962f == 0) {
            zj zjVar = (zj) c1Var.f42959a;
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
                    zjVar.setCurrentId(contact.contact_id);
                    zjVar.a(null, (CharSequence) this.e.get(i10 - 1), new sj(contact, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                zjVar.a(user, (CharSequence) this.e.get(i10 - 1), new tj(1, user), z10);
            }
            boolean containsKey = this.f30094n.f22680w.containsKey(qj.a(E));
            pp ppVar = zjVar.d;
            if (ppVar.getVisibility() != 0) {
                ppVar.setVisibility(0);
            }
            ppVar.a(containsKey, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View zjVar;
        Context context = this.f30092c;
        if (i10 != 0) {
            if (i10 != 1) {
                zjVar = new View(context);
                zjVar.setTag(-33024);
            } else {
                zjVar = new View(context);
                zjVar.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                zjVar.setTag(-33024);
            }
        } else {
            zjVar = new zj(context, this.f30094n.f27042a);
        }
        return new s4.c1(zjVar);
    }
}
