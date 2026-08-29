package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class fu0 {
    public boolean f28539g;
    public boolean h;
    public int f28542k;
    public int f28544m;
    public int f28545n;
    public boolean f28546o;
    public int f28547p;
    public boolean f28549r;
    public int f28551t;
    public int f28552u;
    public boolean v;
    public boolean f28553w;
    public final ArrayList f28534a = new ArrayList();
    public final SparseArray[] f28535b = {new SparseArray(), new SparseArray()};
    public final ArrayList f28536c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f28537e = new ArrayList();
    public final int[] f28538f = {0, 0};
    public final boolean[] f28540i = {false, true};
    public final int[] f28541j = {0, 0};
    public boolean f28543l = true;
    public int f28548q = 0;
    public final ArrayList f28550s = new ArrayList();
    public f2.c1 f28554x = new f2.c1();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f28535b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f28536c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f28534a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f28541j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f28542k = Math.max(messageObject.getId(), this.f28542k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f28542k = Math.min(messageObject.getId(), this.f28542k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f28553w && messageObject.isPhoto()) {
            this.f28553w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f28535b;
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
        this.f28534a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f28536c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f28538f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f28549r) {
            return this.f28550s;
        }
        return this.f28534a;
    }

    public final int d() {
        if (this.f28549r) {
            return this.f28551t;
        }
        return this.f28544m;
    }

    public final int e() {
        int[] iArr = this.f28538f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f28535b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f22413id = i12;
            int[] iArr = this.f28541j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f28549r != z10) {
            this.f28549r = z10;
            if (z10) {
                this.f28551t = this.f28544m;
                this.f28552u = this.f28545n;
                ArrayList arrayList = this.f28550s;
                arrayList.clear();
                arrayList.addAll(this.f28534a);
            }
        }
    }
}
