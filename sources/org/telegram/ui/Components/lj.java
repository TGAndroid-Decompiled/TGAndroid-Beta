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
public final class lj extends fl0 {
    public final int f30350r = UserConfig.selectedAccount;
    public final Context f30351s;
    public final sj v;

    public lj(sj sjVar, Context context) {
        this.v = sjVar;
        this.f30351s = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(jl0 jl0Var, float f9, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        if (i10 == 0 || i10 == R() - 1) {
            return 1;
        }
        int i11 = i10 - 1;
        int i12 = this.f30350r;
        HashMap<String, ArrayList<Object>> hashMap = ContactsController.getInstance(i12).phoneBookSectionsDict;
        ArrayList<String> arrayList = ContactsController.getInstance(i12).phoneBookSectionsArray;
        if (i11 < arrayList.size()) {
            return hashMap.get(arrayList.get(i11)).size();
        }
        return 0;
    }

    @Override
    public final Object O(int i10, int i11) {
        if (i10 == 0) {
            return null;
        }
        int i12 = i10 - 1;
        int i13 = this.f30350r;
        HashMap<String, ArrayList<Object>> hashMap = ContactsController.getInstance(i13).phoneBookSectionsDict;
        ArrayList<String> arrayList = ContactsController.getInstance(i13).phoneBookSectionsArray;
        if (i12 < arrayList.size()) {
            ArrayList<Object> arrayList2 = hashMap.get(arrayList.get(i12));
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
        if (i10 == R() - 1) {
            return 2;
        }
        return 0;
    }

    @Override
    public final int R() {
        return ContactsController.getInstance(this.f30350r).phoneBookSectionsArray.size() + 2;
    }

    @Override
    public final View T(int i10, View view) {
        return null;
    }

    @Override
    public final boolean V(int i10, int i11, f2.n1 n1Var) {
        if (i10 != 0 && i10 != R() - 1) {
            int i12 = this.f30350r;
            if (i11 < ContactsController.getInstance(i12).phoneBookSectionsDict.get(ContactsController.getInstance(i12).phoneBookSectionsArray.get(i10 - 1)).size()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, f2.n1 n1Var) {
        TLRPC.User user;
        if (n1Var.f6436f == 0) {
            rj rjVar = (rj) n1Var.f6432a;
            Object O = O(i10, i11);
            boolean z10 = true;
            if (i10 == R() - 2 && i11 == M(i10) - 1) {
                z10 = false;
            }
            if (O instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) O;
                user = contact.user;
                if (user == null) {
                    rjVar.setCurrentId(contact.contact_id);
                    rjVar.a(null, ContactsController.formatName(contact.first_name, contact.last_name), new jj(contact, 0), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) O;
            }
            if (user != null) {
                rjVar.a(user, null, new kj(0, user), z10);
            }
            boolean containsKey = this.v.f32657w.containsKey(hj.a(O));
            hp hpVar = rjVar.d;
            if (hpVar.getVisibility() != 0) {
                hpVar.setVisibility(0);
            }
            hpVar.a(containsKey, false);
        }
    }

    @Override
    public final void l() {
        X(false);
        this.v.M();
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View rjVar;
        Context context = this.f30351s;
        if (i10 != 0) {
            if (i10 != 1) {
                rjVar = new View(context);
                rjVar.setTag(-33024);
            } else {
                rjVar = new View(context);
                rjVar.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(56.0f)));
                rjVar.setTag(-33024);
            }
        } else {
            rjVar = new rj(context, this.v.f28402a);
        }
        return new f2.n1(rjVar);
    }
}
