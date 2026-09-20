package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class yu0 {
    public boolean f30616g;
    public boolean h;
    public int f30619k;
    public int f30621m;
    public int f30622n;
    public boolean f30623o;
    public int f30624p;
    public boolean f30626r;
    public int f30628t;
    public int f30629u;
    public boolean v;
    public boolean f30630w;
    public final ArrayList f30612a = new ArrayList();
    public final SparseArray[] f30613b = {new SparseArray(), new SparseArray()};
    public final ArrayList f30614c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f30615f = {0, 0};
    public final boolean[] f30617i = {false, true};
    public final int[] f30618j = {0, 0};
    public boolean f30620l = true;
    public int f30625q = 0;
    public final ArrayList f30627s = new ArrayList();
    public s4.u0 f30631x = new s4.u0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f30613b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f30614c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f30612a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f30618j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f30619k = Math.max(messageObject.getId(), this.f30619k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f30619k = Math.min(messageObject.getId(), this.f30619k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f30630w && messageObject.isPhoto()) {
            this.f30630w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f30613b;
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
        this.f30612a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f30614c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f30615f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f30626r) {
            return this.f30627s;
        }
        return this.f30612a;
    }

    public final int d() {
        if (this.f30626r) {
            return this.f30628t;
        }
        return this.f30621m;
    }

    public final int e() {
        int[] iArr = this.f30615f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f30613b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f18349id = i12;
            int[] iArr = this.f30618j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f30626r != z10) {
            this.f30626r = z10;
            if (z10) {
                this.f30628t = this.f30621m;
                this.f30629u = this.f30622n;
                ArrayList arrayList = this.f30627s;
                arrayList.clear();
                arrayList.addAll(this.f30612a);
            }
        }
    }
}
