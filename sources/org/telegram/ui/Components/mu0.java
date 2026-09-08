package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class mu0 {
    public boolean f28548g;
    public boolean h;
    public int f28551k;
    public int f28553m;
    public int f28554n;
    public boolean f28555o;
    public int f28556p;
    public boolean f28558r;
    public int f28560t;
    public int f28561u;
    public boolean v;
    public boolean f28562w;
    public final ArrayList f28543a = new ArrayList();
    public final SparseArray[] f28544b = {new SparseArray(), new SparseArray()};
    public final ArrayList f28545c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f28546e = new ArrayList();
    public final int[] f28547f = {0, 0};
    public final boolean[] f28549i = {false, true};
    public final int[] f28550j = {0, 0};
    public boolean f28552l = true;
    public int f28557q = 0;
    public final ArrayList f28559s = new ArrayList();
    public s4.u0 f28563x = new s4.u0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f28544b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f28545c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f28543a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f28550j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f28551k = Math.max(messageObject.getId(), this.f28551k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f28551k = Math.min(messageObject.getId(), this.f28551k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f28562w && messageObject.isPhoto()) {
            this.f28562w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f28544b;
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
        this.f28543a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f28545c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f28547f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f28558r) {
            return this.f28559s;
        }
        return this.f28543a;
    }

    public final int d() {
        if (this.f28558r) {
            return this.f28560t;
        }
        return this.f28553m;
    }

    public final int e() {
        int[] iArr = this.f28547f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f28544b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f19917id = i12;
            int[] iArr = this.f28550j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f28558r != z10) {
            this.f28558r = z10;
            if (z10) {
                this.f28560t = this.f28553m;
                this.f28561u = this.f28554n;
                ArrayList arrayList = this.f28559s;
                arrayList.clear();
                arrayList.addAll(this.f28543a);
            }
        }
    }
}
