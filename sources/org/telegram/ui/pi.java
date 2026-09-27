package org.telegram.ui;

import android.util.SparseArray;
import org.telegram.messenger.MessageObject;
public final class pi {
    public boolean f36489a;
    public final boolean f36490b;
    public final SparseArray f36491c;
    public final xn d;

    public pi(xn xnVar, boolean z10, SparseArray sparseArray) {
        this.d = xnVar;
        this.f36490b = z10;
        this.f36491c = sparseArray;
    }

    public final boolean a(int i10) {
        xn xnVar = this.d;
        int i11 = i10 - xnVar.A0.J;
        if (i11 >= 0 && i11 < xnVar.f39944u6.size()) {
            MessageObject messageObject = (MessageObject) xnVar.f39944u6.get(i11);
            if (messageObject.contentType == 0) {
                SparseArray sparseArray = this.f36491c;
                boolean z10 = this.f36490b;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pi.b(int, boolean, float, float):void");
    }
}
