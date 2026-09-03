package org.telegram.ui;

import android.util.SparseArray;
import org.telegram.messenger.MessageObject;
public final class oi {
    public boolean f36821a;
    public final boolean f36822b;
    public final SparseArray f36823c;
    public final zn d;

    public oi(zn znVar, boolean z4, SparseArray sparseArray) {
        this.d = znVar;
        this.f36822b = z4;
        this.f36823c = sparseArray;
    }

    public final boolean a(int i10) {
        zn znVar = this.d;
        int i11 = i10 - znVar.f40800x0.G;
        if (i11 >= 0 && i11 < znVar.f40730r6.size()) {
            MessageObject messageObject = (MessageObject) znVar.f40730r6.get(i11);
            if (messageObject.contentType == 0) {
                SparseArray sparseArray = this.f36823c;
                boolean z4 = this.f36822b;
                if (!z4 && sparseArray.get(messageObject.getId(), null) == null) {
                    return true;
                }
                if (z4 && sparseArray.get(messageObject.getId(), null) != null) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void b(int r8, boolean r9, float r10, float r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oi.b(int, boolean, float, float):void");
    }
}
