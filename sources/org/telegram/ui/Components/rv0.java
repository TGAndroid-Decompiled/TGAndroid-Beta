package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class rv0 {
    public boolean f30583g;
    public boolean h;
    public int f30586k;
    public int f30588m;
    public int f30589n;
    public boolean f30590o;
    public int f30591p;
    public boolean f30593r;
    public int f30595t;
    public int f30596u;
    public boolean v;
    public boolean f30597w;
    public final ArrayList f30578a = new ArrayList();
    public final SparseArray[] f30579b = {new SparseArray(), new SparseArray()};
    public final ArrayList f30580c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f30581e = new ArrayList();
    public final int[] f30582f = {0, 0};
    public final boolean[] f30584i = {false, true};
    public final int[] f30585j = {0, 0};
    public boolean f30587l = true;
    public int f30592q = 0;
    public final ArrayList f30594s = new ArrayList();
    public s4.v0 f30598x = new s4.v0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f30579b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f30580c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f30578a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f30585j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f30586k = Math.max(messageObject.getId(), this.f30586k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f30586k = Math.min(messageObject.getId(), this.f30586k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f30597w && messageObject.isPhoto()) {
            this.f30597w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f30579b;
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
        this.f30578a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f30580c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f30582f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f30593r) {
            return this.f30594s;
        }
        return this.f30578a;
    }

    public final int d() {
        if (this.f30593r) {
            return this.f30595t;
        }
        return this.f30588m;
    }

    public final int e() {
        int[] iArr = this.f30582f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f30579b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f20063id = i12;
            int[] iArr = this.f30585j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f30593r != z10) {
            this.f30593r = z10;
            if (z10) {
                this.f30595t = this.f30588m;
                this.f30596u = this.f30589n;
                ArrayList arrayList = this.f30594s;
                arrayList.clear();
                arrayList.addAll(this.f30578a);
            }
        }
    }
}
