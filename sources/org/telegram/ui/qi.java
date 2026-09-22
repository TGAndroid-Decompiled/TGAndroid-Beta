package org.telegram.ui;

import android.util.SparseArray;
import org.telegram.messenger.MessageObject;
public final class qi {
    public boolean f36942a;
    public final boolean f36943b;
    public final SparseArray f36944c;
    public final zn d;

    public qi(zn znVar, boolean z10, SparseArray sparseArray) {
        this.d = znVar;
        this.f36943b = z10;
        this.f36944c = sparseArray;
    }

    public final boolean a(int i10) {
        zn znVar = this.d;
        int i11 = i10 - znVar.A0.J;
        if (i11 >= 0 && i11 < znVar.f40518u6.size()) {
            MessageObject messageObject = (MessageObject) znVar.f40518u6.get(i11);
            if (messageObject.contentType == 0) {
                SparseArray sparseArray = this.f36944c;
                boolean z10 = this.f36943b;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qi.b(int, boolean, float, float):void");
    }
}
