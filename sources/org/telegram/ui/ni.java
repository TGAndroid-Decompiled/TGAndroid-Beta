package org.telegram.ui;

import android.util.SparseArray;
import org.telegram.messenger.MessageObject;
public final class ni {
    public boolean f35890a;
    public final boolean f35891b;
    public final SparseArray f35892c;
    public final wn d;

    public ni(wn wnVar, boolean z10, SparseArray sparseArray) {
        this.d = wnVar;
        this.f35891b = z10;
        this.f35892c = sparseArray;
    }

    public final boolean a(int i10) {
        wn wnVar = this.d;
        int i11 = i10 - wnVar.A0.J;
        if (i11 >= 0 && i11 < wnVar.f39662u6.size()) {
            MessageObject messageObject = (MessageObject) wnVar.f39662u6.get(i11);
            if (messageObject.contentType == 0) {
                SparseArray sparseArray = this.f35892c;
                boolean z10 = this.f35891b;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ni.b(int, boolean, float, float):void");
    }
}
