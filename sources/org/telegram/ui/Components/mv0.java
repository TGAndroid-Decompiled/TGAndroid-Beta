package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class mv0 {
    public boolean f28761g;
    public boolean h;
    public int f28764k;
    public int f28766m;
    public int f28767n;
    public boolean f28768o;
    public int f28769p;
    public boolean f28771r;
    public int f28773t;
    public int f28774u;
    public boolean v;
    public boolean f28775w;
    public final ArrayList f28757a = new ArrayList();
    public final SparseArray[] f28758b = {new SparseArray(), new SparseArray()};
    public final ArrayList f28759c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f28760f = {0, 0};
    public final boolean[] f28762i = {false, true};
    public final int[] f28763j = {0, 0};
    public boolean f28765l = true;
    public int f28770q = 0;
    public final ArrayList f28772s = new ArrayList();
    public s4.t0 f28776x = new s4.t0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f28758b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f28759c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f28757a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f28763j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f28764k = Math.max(messageObject.getId(), this.f28764k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f28764k = Math.min(messageObject.getId(), this.f28764k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f28775w && messageObject.isPhoto()) {
            this.f28775w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f28758b;
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
        this.f28757a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f28759c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f28760f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f28771r) {
            return this.f28772s;
        }
        return this.f28757a;
    }

    public final int d() {
        if (this.f28771r) {
            return this.f28773t;
        }
        return this.f28766m;
    }

    public final int e() {
        int[] iArr = this.f28760f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f28758b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f20364id = i12;
            int[] iArr = this.f28763j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f28771r != z10) {
            this.f28771r = z10;
            if (z10) {
                this.f28773t = this.f28766m;
                this.f28774u = this.f28767n;
                ArrayList arrayList = this.f28772s;
                arrayList.clear();
                arrayList.addAll(this.f28757a);
            }
        }
    }
}
