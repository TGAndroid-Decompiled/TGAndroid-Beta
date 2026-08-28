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
public final class ij extends sk0 {
    public final int f29445r = UserConfig.selectedAccount;
    public final Context f29446s;
    public final pj v;

    public ij(pj pjVar, Context context) {
        this.v = pjVar;
        this.f29446s = context;
    }

    @Override
    public final String F(int i9) {
        return null;
    }

    @Override
    public final void G(wk0 wk0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i9) {
        if (i9 == 0 || i9 == R() - 1) {
            return 1;
        }
        int i10 = i9 - 1;
        int i11 = this.f29445r;
        HashMap<String, ArrayList<Object>> hashMap = ContactsController.getInstance(i11).phoneBookSectionsDict;
        ArrayList<String> arrayList = ContactsController.getInstance(i11).phoneBookSectionsArray;
        if (i10 < arrayList.size()) {
            return hashMap.get(arrayList.get(i10)).size();
        }
        return 0;
    }

    @Override
    public final Object O(int i9, int i10) {
        if (i9 == 0) {
            return null;
        }
        int i11 = i9 - 1;
        int i12 = this.f29445r;
        HashMap<String, ArrayList<Object>> hashMap = ContactsController.getInstance(i12).phoneBookSectionsDict;
        ArrayList<String> arrayList = ContactsController.getInstance(i12).phoneBookSectionsArray;
        if (i11 < arrayList.size()) {
            ArrayList<Object> arrayList2 = hashMap.get(arrayList.get(i11));
            if (i10 < arrayList2.size()) {
                return arrayList2.get(i10);
            }
        }
        return null;
    }

    @Override
    public final int P(int i9, int i10) {
        if (i9 == 0) {
            return 1;
        }
        if (i9 == R() - 1) {
            return 2;
        }
        return 0;
    }

    @Override
    public final int R() {
        return ContactsController.getInstance(this.f29445r).phoneBookSectionsArray.size() + 2;
    }

    @Override
    public final View T(int i9, View view) {
        return null;
    }

    @Override
    public final boolean V(int i9, int i10, f2.q1 q1Var) {
        if (i9 != 0 && i9 != R() - 1) {
            int i11 = this.f29445r;
            if (i10 < ContactsController.getInstance(i11).phoneBookSectionsDict.get(ContactsController.getInstance(i11).phoneBookSectionsArray.get(i9 - 1)).size()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i9, int i10, f2.q1 q1Var) {
        TLRPC.User user;
        if (q1Var.f5505f == 0) {
            oj ojVar = (oj) q1Var.f5501a;
            Object O = O(i9, i10);
            boolean z10 = true;
            if (i9 == R() - 2 && i10 == M(i9) - 1) {
                z10 = false;
            }
            if (O instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) O;
                user = contact.user;
                if (user == null) {
                    ojVar.setCurrentId(contact.contact_id);
                    ojVar.a(null, ContactsController.formatName(contact.first_name, contact.last_name), new gj(contact, 0), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) O;
            }
            if (user != null) {
                ojVar.a(user, null, new hj(0, user), z10);
            }
            boolean containsKey = this.v.f31680w.containsKey(ej.a(O));
            dp dpVar = ojVar.d;
            if (dpVar.getVisibility() != 0) {
                dpVar.setVisibility(0);
            }
            dpVar.a(containsKey, false);
        }
    }

    @Override
    public final void l() {
        X(false);
        this.v.M();
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View ojVar;
        Context context = this.f29446s;
        if (i9 != 0) {
            if (i9 != 1) {
                ojVar = new View(context);
                ojVar.setTag(-33024);
            } else {
                ojVar = new View(context);
                ojVar.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(56.0f)));
                ojVar.setTag(-33024);
            }
        } else {
            ojVar = new oj(context, this.v.f27492a);
        }
        return new f2.q1(ojVar);
    }
}
