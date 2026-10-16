package org.telegram.ui;

import android.util.SparseArray;
import org.telegram.messenger.MessageObject;
public final class fj {
    public boolean f35546a;
    public final boolean f35547b;
    public final SparseArray f35548c;
    public final fo d;

    public fj(fo foVar, boolean z10, SparseArray sparseArray) {
        this.d = foVar;
        this.f35547b = z10;
        this.f35548c = sparseArray;
    }

    public final boolean a(int i10) {
        fo foVar = this.d;
        int i11 = i10 - foVar.A0.J;
        if (i11 >= 0 && i11 < foVar.f35828u6.size()) {
            MessageObject messageObject = (MessageObject) foVar.f35828u6.get(i11);
            if (messageObject.contentType == 0) {
                SparseArray sparseArray = this.f35548c;
                boolean z10 = this.f35547b;
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
