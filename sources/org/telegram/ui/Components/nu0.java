package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class nu0 {
    public boolean f26579g;
    public boolean h;
    public int f26582k;
    public int f26584m;
    public int f26585n;
    public boolean f26586o;
    public int f26587p;
    public boolean f26589r;
    public int f26591t;
    public int f26592u;
    public boolean v;
    public boolean f26593w;
    public final ArrayList f26575a = new ArrayList();
    public final SparseArray[] f26576b = {new SparseArray(), new SparseArray()};
    public final ArrayList f26577c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f26578f = {0, 0};
    public final boolean[] f26580i = {false, true};
    public final int[] f26581j = {0, 0};
    public boolean f26583l = true;
    public int f26588q = 0;
    public final ArrayList f26590s = new ArrayList();
    public s4.u0 f26594x = new s4.u0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f26576b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f26577c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f26575a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f26581j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f26582k = Math.max(messageObject.getId(), this.f26582k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f26582k = Math.min(messageObject.getId(), this.f26582k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f26593w && messageObject.isPhoto()) {
            this.f26593w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f26576b;
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
        this.f26575a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f26577c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f26578f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f26589r) {
            return this.f26590s;
        }
        return this.f26575a;
    }

    public final int d() {
        if (this.f26589r) {
            return this.f26591t;
        }
        return this.f26584m;
    }

    public final int e() {
        int[] iArr = this.f26578f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f26576b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f18130id = i12;
            int[] iArr = this.f26581j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f26589r != z10) {
            this.f26589r = z10;
            if (z10) {
                this.f26591t = this.f26584m;
                this.f26592u = this.f26585n;
                ArrayList arrayList = this.f26590s;
                arrayList.clear();
                arrayList.addAll(this.f26575a);
            }
        }
    }
}
