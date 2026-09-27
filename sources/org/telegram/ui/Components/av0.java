package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class av0 {
    public boolean f22771g;
    public boolean h;
    public int f22774k;
    public int f22776m;
    public int f22777n;
    public boolean f22778o;
    public int f22779p;
    public boolean f22781r;
    public int f22783t;
    public int f22784u;
    public boolean v;
    public boolean f22785w;
    public final ArrayList f22767a = new ArrayList();
    public final SparseArray[] f22768b = {new SparseArray(), new SparseArray()};
    public final ArrayList f22769c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f22770f = {0, 0};
    public final boolean[] f22772i = {false, true};
    public final int[] f22773j = {0, 0};
    public boolean f22775l = true;
    public int f22780q = 0;
    public final ArrayList f22782s = new ArrayList();
    public s4.u0 f22786x = new s4.u0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f22768b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f22769c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f22767a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f22773j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f22774k = Math.max(messageObject.getId(), this.f22774k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f22774k = Math.min(messageObject.getId(), this.f22774k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f22785w && messageObject.isPhoto()) {
            this.f22785w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f22768b;
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
        this.f22767a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f22769c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f22770f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f22781r) {
            return this.f22782s;
        }
        return this.f22767a;
    }

    public final int d() {
        if (this.f22781r) {
            return this.f22783t;
        }
        return this.f22776m;
    }

    public final int e() {
        int[] iArr = this.f22770f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f22768b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f18350id = i12;
            int[] iArr = this.f22773j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f22781r != z10) {
            this.f22781r = z10;
            if (z10) {
                this.f22783t = this.f22776m;
                this.f22784u = this.f22777n;
                ArrayList arrayList = this.f22782s;
                arrayList.clear();
                arrayList.addAll(this.f22767a);
            }
        }
    }
}
