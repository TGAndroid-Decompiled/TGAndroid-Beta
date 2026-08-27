package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

public final class ej extends vk0 {

    public final int f28071r = UserConfig.selectedAccount;

    public final Context f28072s;
    public final lj v;

    public ej(lj ljVar, Context context) {
        this.v = ljVar;
        this.f28072s = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(zk0 zk0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        if (i10 == 0 || i10 == R() - 1) {
            return 1;
        }
        int i11 = i10 - 1;
        int i12 = this.f28071r;
        HashMap<String, ArrayList<Object>> map = ContactsController.getInstance(i12).phoneBookSectionsDict;
        ArrayList<String> arrayList = ContactsController.getInstance(i12).phoneBookSectionsArray;
        if (i11 < arrayList.size()) {
            return map.get(arrayList.get(i11)).size();
        }
        return 0;
    }

    @Override
    public final Object O(int i10, int i11) {
        if (i10 == 0) {
            return null;
        }
        int i12 = i10 - 1;
        int i13 = this.f28071r;
        HashMap<String, ArrayList<Object>> map = ContactsController.getInstance(i13).phoneBookSectionsDict;
        ArrayList<String> arrayList = ContactsController.getInstance(i13).phoneBookSectionsArray;
        if (i12 < arrayList.size()) {
            ArrayList<Object> arrayList2 = map.get(arrayList.get(i12));
            if (i11 < arrayList2.size()) {
                return arrayList2.get(i11);
            }
        }
        return null;
    }

    @Override
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        return i10 == R() - 1 ? 2 : 0;
    }

    @Override
    public final int R() {
        return ContactsController.getInstance(this.f28071r).phoneBookSectionsArray.size() + 2;
    }

    @Override
    public final View T(int i10, View view) {
        return null;
    }

    @Override
    public final boolean V(int i10, int i11, f2.o1 o1Var) {
        if (i10 == 0 || i10 == R() - 1) {
            return false;
        }
        int i12 = this.f28071r;
        return i11 < ContactsController.getInstance(i12).phoneBookSectionsDict.get(ContactsController.getInstance(i12).phoneBookSectionsArray.get(i10 + (-1))).size();
    }

    @Override
    public final void W(int i10, int i11, f2.o1 o1Var) {
        TLRPC.User user;
        if (o1Var.f5793f == 0) {
            kj kjVar = (kj) o1Var.f5789a;
            Object objO = O(i10, i11);
            boolean z10 = true;
            if (i10 == R() - 2 && i11 == M(i10) - 1) {
                z10 = false;
            }
            if (objO instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) objO;
                user = contact.user;
                if (user == null) {
                    kjVar.setCurrentId(contact.contact_id);
                    kjVar.a(null, ContactsController.formatName(contact.first_name, contact.last_name), new cj(contact, 0), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) objO;
            }
            if (user != null) {
                kjVar.a(user, null, new dj(0, user), z10);
            }
            boolean zContainsKey = this.v.f30398w.containsKey(aj.a(objO));
            bp bpVar = kjVar.d;
            if (bpVar.getVisibility() != 0) {
                bpVar.setVisibility(0);
            }
            bpVar.a(zContainsKey, false);
        }
    }

    @Override
    public final void l() {
        X(false);
        this.v.N();
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View kjVar;
        Context context = this.f28072s;
        if (i10 == 0) {
            kjVar = new kj(context, this.v.f34899a);
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
