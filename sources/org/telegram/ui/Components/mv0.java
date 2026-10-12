package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class mv0 {
    public boolean f27512g;
    public boolean h;
    public int f27515k;
    public int f27517m;
    public int f27518n;
    public boolean f27519o;
    public int f27520p;
    public boolean f27522r;
    public int f27524t;
    public int f27525u;
    public boolean v;
    public boolean f27526w;
    public final ArrayList f27508a = new ArrayList();
    public final SparseArray[] f27509b = {new SparseArray(), new SparseArray()};
    public final ArrayList f27510c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f27511f = {0, 0};
    public final boolean[] f27513i = {false, true};
    public final int[] f27514j = {0, 0};
    public boolean f27516l = true;
    public int f27521q = 0;
    public final ArrayList f27523s = new ArrayList();
    public s4.t0 f27527x = new s4.t0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f27509b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f27510c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f27508a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f27514j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f27515k = Math.max(messageObject.getId(), this.f27515k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f27515k = Math.min(messageObject.getId(), this.f27515k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f27526w && messageObject.isPhoto()) {
            this.f27526w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f27509b;
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
        this.f27508a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f27510c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f27511f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f27522r) {
            return this.f27523s;
        }
        return this.f27508a;
    }

    public final int d() {
        if (this.f27522r) {
            return this.f27524t;
        }
        return this.f27517m;
    }

    public final int e() {
        int[] iArr = this.f27511f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f27509b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f19237id = i12;
            int[] iArr = this.f27514j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f27522r != z10) {
            this.f27522r = z10;
            if (z10) {
                this.f27524t = this.f27517m;
                this.f27525u = this.f27518n;
                ArrayList arrayList = this.f27523s;
                arrayList.clear();
                arrayList.addAll(this.f27508a);
            }
        }
    }
}
