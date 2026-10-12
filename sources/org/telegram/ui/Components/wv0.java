package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class wv0 {
    public boolean f32558g;
    public boolean h;
    public int f32561k;
    public int f32563m;
    public int f32564n;
    public boolean f32565o;
    public int f32566p;
    public boolean f32568r;
    public int f32570t;
    public int f32571u;
    public boolean v;
    public boolean f32572w;
    public final ArrayList f32553a = new ArrayList();
    public final SparseArray[] f32554b = {new SparseArray(), new SparseArray()};
    public final ArrayList f32555c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f32556e = new ArrayList();
    public final int[] f32557f = {0, 0};
    public final boolean[] f32559i = {false, true};
    public final int[] f32560j = {0, 0};
    public boolean f32562l = true;
    public int f32567q = 0;
    public final ArrayList f32569s = new ArrayList();
    public s4.v0 f32573x = new s4.v0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f32554b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f32555c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f32553a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f32560j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f32561k = Math.max(messageObject.getId(), this.f32561k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f32561k = Math.min(messageObject.getId(), this.f32561k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f32572w && messageObject.isPhoto()) {
            this.f32572w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f32554b;
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
        this.f32553a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f32555c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f32557f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f32568r) {
            return this.f32569s;
        }
        return this.f32553a;
    }

    public final int d() {
        if (this.f32568r) {
            return this.f32570t;
        }
        return this.f32563m;
    }

    public final int e() {
        int[] iArr = this.f32557f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f32554b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f19823id = i12;
            int[] iArr = this.f32560j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f32568r != z10) {
            this.f32568r = z10;
            if (z10) {
                this.f32570t = this.f32563m;
                this.f32571u = this.f32564n;
                ArrayList arrayList = this.f32569s;
                arrayList.clear();
                arrayList.addAll(this.f32553a);
            }
        }
    }
}
