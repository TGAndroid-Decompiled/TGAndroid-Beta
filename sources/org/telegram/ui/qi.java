package org.telegram.ui;

import android.util.SparseArray;
import org.telegram.messenger.MessageObject;
public final class qi {
    public boolean f39882a;
    public final boolean f39883b;
    public final SparseArray f39884c;
    public final co d;

    public qi(co coVar, boolean z10, SparseArray sparseArray) {
        this.d = coVar;
        this.f39883b = z10;
        this.f39884c = sparseArray;
    }

    public final boolean a(int i10) {
        co coVar = this.d;
        int i11 = i10 - coVar.A0.J;
        if (i11 >= 0 && i11 < coVar.f35440u6.size()) {
            MessageObject messageObject = (MessageObject) coVar.f35440u6.get(i11);
            if (messageObject.contentType == 0) {
                SparseArray sparseArray = this.f39884c;
                boolean z10 = this.f39883b;
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
