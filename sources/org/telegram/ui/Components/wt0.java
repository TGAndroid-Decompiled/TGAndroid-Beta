package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;

public final class wt0 {

    public boolean f34330g;
    public boolean h;

    public int f34333k;

    public int f34335m;

    public int f34336n;

    public boolean f34337o;

    public int f34338p;

    public boolean f34340r;

    public int f34342t;

    public int f34343u;
    public boolean v;

    public boolean f34344w;

    public final ArrayList f34325a = new ArrayList();

    public final SparseArray[] f34326b = {new SparseArray(), new SparseArray()};

    public final ArrayList f34327c = new ArrayList();
    public final HashMap d = new HashMap();

    public final ArrayList f34328e = new ArrayList();

    public final int[] f34329f = {0, 0};

    public final boolean[] f34331i = {false, true};

    public final int[] f34332j = {0, 0};

    public boolean f34334l = true;

    public int f34339q = 0;

    public final ArrayList f34341s = new ArrayList();

    public f2.d1 f34345x = new f2.d1();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f34326b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap map = this.d;
        ArrayList arrayList = (ArrayList) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f34327c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f34325a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f34332j;
        if (z11) {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f34333k = Math.min(messageObject.getId(), this.f34333k);
        } else if (messageObject.getId() > 0) {
            iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
            this.f34333k = Math.max(messageObject.getId(), this.f34333k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f34344w && messageObject.isPhoto()) {
            this.f34344w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f34326b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i11].get(i10);
        if (messageObject == null) {
            return null;
        }
        String str = messageObject.monthKey;
        HashMap map = this.d;
        ArrayList arrayList = (ArrayList) map.get(str);
        if (arrayList == null) {
            return null;
        }
        arrayList.remove(messageObject);
        this.f34325a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            map.remove(messageObject.monthKey);
            this.f34327c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f34329f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        return this.f34340r ? this.f34341s : this.f34325a;
    }

    public final int d() {
        return this.f34340r ? this.f34342t : this.f34335m;
    }

    public final int e() {
        int[] iArr = this.f34329f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f34326b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f22401id = i12;
            int[] iArr = this.f34332j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f34340r == z10) {
            return;
        }
        this.f34340r = z10;
        if (z10) {
            this.f34342t = this.f34335m;
            this.f34343u = this.f34336n;
            ArrayList arrayList = this.f34341s;
            arrayList.clear();
            arrayList.addAll(this.f34325a);
        }
    }
}
