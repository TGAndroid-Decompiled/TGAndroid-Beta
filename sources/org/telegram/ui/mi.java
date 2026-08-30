package org.telegram.ui;

import android.util.SparseArray;
import org.telegram.messenger.MessageObject;
public final class mi {
    public boolean f36320a;
    public final boolean f36321b;
    public final SparseArray f36322c;
    public final xn d;

    public mi(xn xnVar, boolean z4, SparseArray sparseArray) {
        this.d = xnVar;
        this.f36321b = z4;
        this.f36322c = sparseArray;
    }

    public final boolean a(int i10) {
        xn xnVar = this.d;
        int i11 = i10 - xnVar.f40234x0.G;
        if (i11 >= 0 && i11 < xnVar.f40164r6.size()) {
            MessageObject messageObject = (MessageObject) xnVar.f40164r6.get(i11);
            if (messageObject.contentType == 0) {
                SparseArray sparseArray = this.f36322c;
                boolean z4 = this.f36321b;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mi.b(int, boolean, float, float):void");
    }
}
