package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class mu0 {
    public boolean f28549g;
    public boolean h;
    public int f28552k;
    public int f28554m;
    public int f28555n;
    public boolean f28556o;
    public int f28557p;
    public boolean f28559r;
    public int f28561t;
    public int f28562u;
    public boolean v;
    public boolean f28563w;
    public final ArrayList f28544a = new ArrayList();
    public final SparseArray[] f28545b = {new SparseArray(), new SparseArray()};
    public final ArrayList f28546c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f28547e = new ArrayList();
    public final int[] f28548f = {0, 0};
    public final boolean[] f28550i = {false, true};
    public final int[] f28551j = {0, 0};
    public boolean f28553l = true;
    public int f28558q = 0;
    public final ArrayList f28560s = new ArrayList();
    public s4.u0 f28564x = new s4.u0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f28545b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f28546c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f28544a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f28551j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f28552k = Math.max(messageObject.getId(), this.f28552k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f28552k = Math.min(messageObject.getId(), this.f28552k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f28563w && messageObject.isPhoto()) {
            this.f28563w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f28545b;
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
        this.f28544a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f28546c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f28548f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f28559r) {
            return this.f28560s;
        }
        return this.f28544a;
    }

    public final int d() {
        if (this.f28559r) {
            return this.f28561t;
        }
        return this.f28554m;
    }

    public final int e() {
        int[] iArr = this.f28548f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f28545b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f19917id = i12;
            int[] iArr = this.f28551j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f28559r != z10) {
            this.f28559r = z10;
            if (z10) {
                this.f28561t = this.f28554m;
                this.f28562u = this.f28555n;
                ArrayList arrayList = this.f28560s;
                arrayList.clear();
                arrayList.addAll(this.f28544a);
            }
        }
    }
}
