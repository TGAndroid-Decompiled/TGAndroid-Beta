package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class mv0 {
    public boolean f27215g;
    public boolean h;
    public int f27218k;
    public int f27220m;
    public int f27221n;
    public boolean f27222o;
    public int f27223p;
    public boolean f27225r;
    public int f27227t;
    public int f27228u;
    public boolean v;
    public boolean f27229w;
    public final ArrayList f27211a = new ArrayList();
    public final SparseArray[] f27212b = {new SparseArray(), new SparseArray()};
    public final ArrayList f27213c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f27214f = {0, 0};
    public final boolean[] f27216i = {false, true};
    public final int[] f27217j = {0, 0};
    public boolean f27219l = true;
    public int f27224q = 0;
    public final ArrayList f27226s = new ArrayList();
    public s4.t0 f27230x = new s4.t0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f27212b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f27213c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f27211a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f27217j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f27218k = Math.max(messageObject.getId(), this.f27218k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f27218k = Math.min(messageObject.getId(), this.f27218k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f27229w && messageObject.isPhoto()) {
            this.f27229w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f27212b;
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
        this.f27211a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f27213c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f27214f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f27225r) {
            return this.f27226s;
        }
        return this.f27211a;
    }

    public final int d() {
        if (this.f27225r) {
            return this.f27227t;
        }
        return this.f27220m;
    }

    public final int e() {
        int[] iArr = this.f27214f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f27212b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f18937id = i12;
            int[] iArr = this.f27217j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f27225r != z10) {
            this.f27225r = z10;
            if (z10) {
                this.f27227t = this.f27220m;
                this.f27228u = this.f27221n;
                ArrayList arrayList = this.f27226s;
                arrayList.clear();
                arrayList.addAll(this.f27211a);
            }
        }
    }
}
