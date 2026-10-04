package org.telegram.ui;

import android.util.SparseArray;
import org.telegram.messenger.MessageObject;
public final class oi {
    public boolean f39195a;
    public final boolean f39196b;
    public final SparseArray f39197c;
    public final yn d;

    public oi(yn ynVar, boolean z10, SparseArray sparseArray) {
        this.d = ynVar;
        this.f39196b = z10;
        this.f39197c = sparseArray;
    }

    public final boolean a(int i10) {
        yn ynVar = this.d;
        int i11 = i10 - ynVar.f43564y0.J;
        if (i11 >= 0 && i11 < ynVar.f43493s6.size()) {
            MessageObject messageObject = (MessageObject) ynVar.f43493s6.get(i11);
            if (messageObject.contentType == 0) {
                SparseArray sparseArray = this.f39197c;
                boolean z10 = this.f39196b;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oi.b(int, boolean, float, float):void");
    }
}
