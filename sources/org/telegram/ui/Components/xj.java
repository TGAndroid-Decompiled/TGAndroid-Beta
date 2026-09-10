package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class xj extends ul0 {
    public final Context f29064c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public wj f29065f;
    public int h;
    public final bk f29066n;

    public xj(bk bkVar, Context context) {
        this.f29066n = bkVar;
        this.f29064c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f == 0) {
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
        this.f29066n.N();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        TLRPC.User user;
        if (c1Var.f41613f == 0) {
            ak akVar = (ak) c1Var.f41610a;
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
                    akVar.setCurrentId(contact.contact_id);
                    akVar.a(null, (CharSequence) this.e.get(i10 - 1), new tj(contact, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                akVar.a(user, (CharSequence) this.e.get(i10 - 1), new uj(1, user), z10);
            }
            boolean containsKey = this.f29066n.f21846w.containsKey(rj.a(E));
            tp tpVar = akVar.d;
            if (tpVar.getVisibility() != 0) {
                tpVar.setVisibility(0);
            }
            tpVar.a(containsKey, false);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View akVar;
        Context context = this.f29064c;
        if (i10 != 0) {
            if (i10 != 1) {
                akVar = new View(context);
                akVar.setTag(-33024);
            } else {
                akVar = new View(context);
                akVar.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(56.0f)));
                akVar.setTag(-33024);
            }
        } else {
            akVar = new ak(context, this.f29066n.f26421a);
        }
        return new s4.c1(akVar);
    }
}
