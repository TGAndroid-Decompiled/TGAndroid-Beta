package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class vj extends ll0 {
    public final Context f28758c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public uj f28759f;
    public int h;
    public final zj f28760n;

    public vj(zj zjVar, Context context) {
        this.f28760n = zjVar;
        this.f28758c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42630f == 0) {
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
        this.f28760n.N();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        TLRPC.User user;
        if (c1Var.f42630f == 0) {
            yj yjVar = (yj) c1Var.f42627a;
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
            boolean containsKey = this.f28760n.f30610w.containsKey(pj.a(E));
            op opVar = yjVar.d;
            if (opVar.getVisibility() != 0) {
                opVar.setVisibility(0);
            }
            opVar.a(containsKey, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View yjVar;
        Context context = this.f28758c;
        if (i10 != 0) {
            if (i10 != 1) {
                yjVar = new View(context);
                yjVar.setTag(-33024);
            } else {
                yjVar = new View(context);
                yjVar.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                yjVar.setTag(-33024);
            }
        } else {
            yjVar = new yj(context, this.f28760n.f26743a);
        }
        return new s4.c1(yjVar);
    }
}
