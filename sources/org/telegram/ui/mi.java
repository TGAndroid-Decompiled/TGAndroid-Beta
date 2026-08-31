package org.telegram.ui;

import android.util.SparseArray;
import org.telegram.messenger.MessageObject;
public final class mi {
    public boolean f39160a;
    public final boolean f39161b;
    public final SparseArray f39162c;
    public final xn d;

    public mi(xn xnVar, boolean z4, SparseArray sparseArray) {
        this.d = xnVar;
        this.f39161b = z4;
        this.f39162c = sparseArray;
    }

    public final boolean a(int i10) {
        xn xnVar = this.d;
        int i11 = i10 - xnVar.f43403x0.G;
        if (i11 >= 0 && i11 < xnVar.f43333r6.size()) {
            MessageObject messageObject = (MessageObject) xnVar.f43333r6.get(i11);
            if (messageObject.contentType == 0) {
                SparseArray sparseArray = this.f39162c;
                boolean z4 = this.f39161b;
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
