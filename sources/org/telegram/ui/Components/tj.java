package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;
public final class tj extends im0 {
    public final Context f30617c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public sj f30618f;
    public int h;
    public final xj f30619n;

    public tj(xj xjVar, Context context) {
        this.f30619n = xjVar;
        this.f30617c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f45924f == 0) {
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
        this.f30619n.Q();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        TLRPC.User user;
        if (b1Var.f45924f == 0) {
            wj wjVar = (wj) b1Var.f45921a;
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
            boolean containsKey = this.f30619n.f32441w.containsKey(nj.a(E));
            xp xpVar = wjVar.d;
            if (xpVar.getVisibility() != 0) {
                xpVar.setVisibility(0);
            }
            xpVar.a(containsKey, false);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View wjVar;
        Context context = this.f30617c;
        if (i10 != 0) {
            if (i10 != 1) {
                wjVar = new View(context);
                wjVar.setTag(-33024);
            } else {
                wjVar = new View(context);
                wjVar.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
                wjVar.setTag(-33024);
            }
        } else {
            wjVar = new wj(context, this.f30619n.f28176a);
        }
        return new s4.b1(wjVar);
    }
}
