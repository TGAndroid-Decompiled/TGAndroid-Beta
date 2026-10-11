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
public final class wj extends nm0 {
    public final int f32714r = UserConfig.selectedAccount;
    public final Context f32715s;
    public final ck v;

    public wj(ck ckVar, Context context) {
        this.v = ckVar;
        this.f32715s = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(rm0 rm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        if (i10 == 0 || i10 == R() - 1) {
            return 1;
        }
        int i11 = i10 - 1;
        int i12 = this.f32714r;
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
        int i13 = this.f32714r;
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
        return ContactsController.getInstance(this.f32714r).phoneBookSectionsArray.size() + 2;
    }

    @Override
    public final View T(int i10, View view) {
        return null;
    }

    @Override
    public final boolean V(int i10, int i11, s4.d1 d1Var) {
        if (i10 != 0 && i10 != R() - 1) {
            int i12 = this.f32714r;
            if (i11 < ContactsController.getInstance(i12).phoneBookSectionsDict.get(ContactsController.getInstance(i12).phoneBookSectionsArray.get(i10 - 1)).size()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.d1 d1Var) {
        TLRPC.User user;
        if (d1Var.f47786f == 0) {
            bk bkVar = (bk) d1Var.f47782a;
            Object O = O(i10, i11);
            boolean z10 = true;
            if (i10 == R() - 2 && i11 == M(i10) - 1) {
                z10 = false;
            }
            if (O instanceof ContactsController.Contact) {
                ContactsController.Contact contact = (ContactsController.Contact) O;
                user = contact.user;
                if (user == null) {
                    bkVar.setCurrentId(contact.contact_id);
                    bkVar.a(null, ContactsController.formatName(contact.first_name, contact.last_name), new uj(contact, 0), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) O;
            }
            if (user != null) {
                bkVar.a(user, null, new vj(0, user), z10);
            }
            boolean containsKey = this.v.f25376w.containsKey(sj.a(O));
            dq dqVar = bkVar.d;
            if (dqVar.getVisibility() != 0) {
                dqVar.setVisibility(0);
            }
            dqVar.a(containsKey, false);
        }
    }

    @Override
    public final void l() {
        X(false);
        this.v.Q();
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View bkVar;
        Context context = this.f32715s;
        if (i10 != 0) {
            if (i10 != 1) {
                bkVar = new View(context);
                bkVar.setTag(-33024);
            } else {
                bkVar = new View(context);
                bkVar.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(56.0f)));
                bkVar.setTag(-33024);
            }
        } else {
            bkVar = new bk(context, this.v.f30244a);
        }
        return new s4.d1(bkVar);
    }
}
