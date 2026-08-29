package org.telegram.ui;

import android.util.SparseArray;
import org.telegram.messenger.MessageObject;
public final class hi {
    public boolean f38938a;
    public final boolean f38939b;
    public final SparseArray f38940c;
    public final tn d;

    public hi(tn tnVar, boolean z10, SparseArray sparseArray) {
        this.d = tnVar;
        this.f38939b = z10;
        this.f38940c = sparseArray;
    }

    public final boolean a(int i10) {
        tn tnVar = this.d;
        int i11 = i10 - tnVar.f43013w0.F;
        if (i11 >= 0 && i11 < tnVar.q6.size()) {
            MessageObject messageObject = (MessageObject) tnVar.q6.get(i11);
            if (messageObject.contentType == 0) {
                SparseArray sparseArray = this.f38940c;
                boolean z10 = this.f38939b;
                if (!z10 && sparseArray.get(messageObject.getId(), null) == null) {
                    return true;
                }
                if (z10 && sparseArray.get(messageObject.getId(), null) != null) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void b(int r8, boolean r9, float r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hi.b(int, boolean, float, float):void");
    }
}
