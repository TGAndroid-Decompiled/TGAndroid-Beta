package org.telegram.ui;

import android.util.SparseArray;
import org.telegram.messenger.MessageObject;
public final class fj {
    public boolean f37799a;
    public final boolean f37800b;
    public final SparseArray f37801c;
    public final eo d;

    public fj(eo eoVar, boolean z10, SparseArray sparseArray) {
        this.d = eoVar;
        this.f37800b = z10;
        this.f37801c = sparseArray;
    }

    public final boolean a(int i10) {
        eo eoVar = this.d;
        int i11 = i10 - eoVar.A0.J;
        if (i11 >= 0 && i11 < eoVar.f37444u6.size()) {
            MessageObject messageObject = (MessageObject) eoVar.f37444u6.get(i11);
            if (messageObject.contentType == 0) {
                SparseArray sparseArray = this.f37801c;
                boolean z10 = this.f37800b;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fj.b(int, boolean, float, float):void");
    }
}
