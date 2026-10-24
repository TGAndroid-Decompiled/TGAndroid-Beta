package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class rj extends km0 {
    public final Context f30218c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public qj f30219f;
    public int h;
    public final vj f30220n;

    public rj(vj vjVar, Context context) {
        this.f30220n = vjVar;
        this.f30218c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46345f == 0) {
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
        this.f30220n.Q();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        TLRPC.User user;
        if (b1Var.f46345f == 0) {
            uj ujVar = (uj) b1Var.f46342a;
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
                    ujVar.setCurrentId(contact.contact_id);
                    ujVar.a(null, (CharSequence) this.e.get(i10 - 1), new nj(contact, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                ujVar.a(user, (CharSequence) this.e.get(i10 - 1), new oj(1, user), z10);
            }
            boolean containsKey = this.f30220n.f31467w.containsKey(lj.a(E));
            vp vpVar = ujVar.d;
            if (vpVar.getVisibility() != 0) {
                vpVar.setVisibility(0);
            }
            vpVar.a(containsKey, false);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View ujVar;
        Context context = this.f30218c;
        if (i10 != 0) {
            if (i10 != 1) {
                ujVar = new View(context);
                ujVar.setTag(-33024);
            } else {
                ujVar = new View(context);
                ujVar.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
                ujVar.setTag(-33024);
            }
        } else {
            ujVar = new uj(context, this.f30220n.f27703a);
        }
        return new s4.b1(ujVar);
    }
}
