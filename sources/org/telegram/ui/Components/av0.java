package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class av0 {
    public boolean f22748g;
    public boolean h;
    public int f22751k;
    public int f22753m;
    public int f22754n;
    public boolean f22755o;
    public int f22756p;
    public boolean f22758r;
    public int f22760t;
    public int f22761u;
    public boolean v;
    public boolean f22762w;
    public final ArrayList f22744a = new ArrayList();
    public final SparseArray[] f22745b = {new SparseArray(), new SparseArray()};
    public final ArrayList f22746c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f22747f = {0, 0};
    public final boolean[] f22749i = {false, true};
    public final int[] f22750j = {0, 0};
    public boolean f22752l = true;
    public int f22757q = 0;
    public final ArrayList f22759s = new ArrayList();
    public s4.u0 f22763x = new s4.u0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f22745b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f22746c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f22744a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f22750j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f22751k = Math.max(messageObject.getId(), this.f22751k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f22751k = Math.min(messageObject.getId(), this.f22751k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f22762w && messageObject.isPhoto()) {
            this.f22762w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f22745b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i11].get(i10);
        if (messageObject == null) {
            return null;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            return null;
        }
        arrayList.remove(messageObject);
        this.f22744a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f22746c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f22747f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f22758r) {
            return this.f22759s;
        }
        return this.f22744a;
    }

    public final int d() {
        if (this.f22758r) {
            return this.f22760t;
        }
        return this.f22753m;
    }

    public final int e() {
        int[] iArr = this.f22747f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f22745b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f18364id = i12;
            int[] iArr = this.f22750j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f22758r != z10) {
            this.f22758r = z10;
            if (z10) {
                this.f22760t = this.f22753m;
                this.f22761u = this.f22754n;
                ArrayList arrayList = this.f22759s;
                arrayList.clear();
                arrayList.addAll(this.f22744a);
            }
        }
    }
}
