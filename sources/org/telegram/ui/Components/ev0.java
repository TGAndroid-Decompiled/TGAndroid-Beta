package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class ev0 {
    public boolean f26143g;
    public boolean h;
    public int f26146k;
    public int f26148m;
    public int f26149n;
    public boolean f26150o;
    public int f26151p;
    public boolean f26153r;
    public int f26155t;
    public int f26156u;
    public boolean v;
    public boolean f26157w;
    public final ArrayList f26138a = new ArrayList();
    public final SparseArray[] f26139b = {new SparseArray(), new SparseArray()};
    public final ArrayList f26140c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f26141e = new ArrayList();
    public final int[] f26142f = {0, 0};
    public final boolean[] f26144i = {false, true};
    public final int[] f26145j = {0, 0};
    public boolean f26147l = true;
    public int f26152q = 0;
    public final ArrayList f26154s = new ArrayList();
    public s4.u0 f26158x = new s4.u0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f26139b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f26140c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f26138a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f26145j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f26146k = Math.max(messageObject.getId(), this.f26146k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f26146k = Math.min(messageObject.getId(), this.f26146k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f26157w && messageObject.isPhoto()) {
            this.f26157w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f26139b;
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
        this.f26138a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f26140c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f26142f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f26153r) {
            return this.f26154s;
        }
        return this.f26138a;
    }

    public final int d() {
        if (this.f26153r) {
            return this.f26155t;
        }
        return this.f26148m;
    }

    public final int e() {
        int[] iArr = this.f26142f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f26139b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f20058id = i12;
            int[] iArr = this.f26145j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f26153r != z10) {
            this.f26153r = z10;
            if (z10) {
                this.f26155t = this.f26148m;
                this.f26156u = this.f26149n;
                ArrayList arrayList = this.f26154s;
                arrayList.clear();
                arrayList.addAll(this.f26138a);
            }
        }
    }
}
