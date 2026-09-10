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
public final class vj extends rl0 {
    public final int f27948r = UserConfig.selectedAccount;
    public final Context f27949s;
    public final bk v;

    public vj(bk bkVar, Context context) {
        this.v = bkVar;
        this.f27949s = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(vl0 vl0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        if (i10 == 0 || i10 == R() - 1) {
            return 1;
        }
        int i11 = i10 - 1;
        int i12 = this.f27948r;
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
        int i13 = this.f27948r;
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
        return ContactsController.getInstance(this.f27948r).phoneBookSectionsArray.size() + 2;
    }

    @Override
    public final View T(int i10, View view) {
        return null;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        if (i10 != 0 && i10 != R() - 1) {
            int i12 = this.f27948r;
            if (i11 < ContactsController.getInstance(i12).phoneBookSectionsDict.get(ContactsController.getInstance(i12).phoneBookSectionsArray.get(i10 - 1)).size()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.c1 c1Var) {
        TLRPC.User user;
        if (c1Var.f41613f == 0) {
            ak akVar = (ak) c1Var.f41610a;
            Object O = O(i10, i11);
            boolean z10 = true;
            if (i10 == R() - 2 && i11 == M(i10) - 1) {
                z10 = false;
            }
            if (O instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) O;
                user = contact.user;
                if (user == null) {
                    akVar.setCurrentId(contact.contact_id);
                    akVar.a(null, ContactsController.formatName(contact.first_name, contact.last_name), new tj(contact, 0), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) O;
            }
            if (user != null) {
                akVar.a(user, null, new uj(0, user), z10);
            }
            boolean containsKey = this.v.f21846w.containsKey(rj.a(O));
            tp tpVar = akVar.d;
            if (tpVar.getVisibility() != 0) {
                tpVar.setVisibility(0);
            }
            tpVar.a(containsKey, false);
        }
    }

    @Override
    public final void l() {
        X(false);
        this.v.N();
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View akVar;
        Context context = this.f27949s;
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
            akVar = new ak(context, this.v.f26421a);
        }
        return new s4.c1(akVar);
    }
}
