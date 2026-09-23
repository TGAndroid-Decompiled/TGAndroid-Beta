package org.telegram.ui;

import android.util.SparseArray;
import org.telegram.messenger.MessageObject;
public final class ni {
    public boolean f35530a;
    public final boolean f35531b;
    public final SparseArray f35532c;
    public final xn d;

    public ni(xn xnVar, boolean z10, SparseArray sparseArray) {
        this.d = xnVar;
        this.f35531b = z10;
        this.f35532c = sparseArray;
    }

    public final boolean a(int i10) {
        xn xnVar = this.d;
        int i11 = i10 - xnVar.A0.J;
        if (i11 >= 0 && i11 < xnVar.f39563u6.size()) {
            MessageObject messageObject = (MessageObject) xnVar.f39563u6.get(i11);
            if (messageObject.contentType == 0) {
                SparseArray sparseArray = this.f35532c;
                boolean z10 = this.f35531b;
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
