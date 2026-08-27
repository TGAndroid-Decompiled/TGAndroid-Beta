package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.tgnet.TLRPC;

public final class hj extends yk0 {

    public final Context f29037c;
    public ArrayList d = new ArrayList();

    public ArrayList f29038e = new ArrayList();

    public fj f29039f;
    public int h;

    public final lj f29040n;

    public hj(lj ljVar, Context context) {
        this.f29040n = ljVar;
        this.f29037c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f == 0;
    }

    public final Object E(int i10) {
        int i11 = i10 - 1;
        if (i11 < 0 || i11 >= this.d.size()) {
            return null;
        }
        return this.d.get(i11);
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
        return i10 == h() - 1 ? 2 : 0;
    }

    @Override
    public final void l() {
        super.l();
        this.f29040n.N();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        TLRPC.User user;
        if (o1Var.f5793f == 0) {
            kj kjVar = (kj) o1Var.f5789a;
            boolean z10 = i10 != h() + (-2);
            Object objE = E(i10);
            if (objE instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) objE;
                user = contact.user;
                if (user == null) {
                    kjVar.setCurrentId(contact.contact_id);
                    kjVar.a(null, (CharSequence) this.f29038e.get(i10 - 1), new cj(contact, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) objE;
            }
            if (user != null) {
                kjVar.a(user, (CharSequence) this.f29038e.get(i10 - 1), new dj(1, user), z10);
            }
            boolean zContainsKey = this.f29040n.f30398w.containsKey(aj.a(objE));
            bp bpVar = kjVar.d;
            if (bpVar.getVisibility() != 0) {
                bpVar.setVisibility(0);
            }
            bpVar.a(zContainsKey, false);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View kjVar;
        Context context = this.f29037c;
        if (i10 == 0) {
            kjVar = new kj(context, this.f29040n.f34899a);
        } else if (i10 != 1) {
            kjVar = new View(context);
            kjVar.setTag(-33024);
        } else {
            kjVar = new View(context);
            kjVar.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(56.0f)));
            kjVar.setTag(-33024);
        }
        return new lk0(kjVar);
    }
}
