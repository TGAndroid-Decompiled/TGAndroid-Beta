package org.telegram.ui;

import android.util.SparseArray;
import org.telegram.messenger.MessageObject;
public final class bj {
    public boolean f36345a;
    public final boolean f36346b;
    public final SparseArray f36347c;
    public final zn d;

    public bj(zn znVar, boolean z10, SparseArray sparseArray) {
        this.d = znVar;
        this.f36346b = z10;
        this.f36347c = sparseArray;
    }

    public final boolean a(int i10) {
        zn znVar = this.d;
        int i11 = i10 - znVar.A0.J;
        if (i11 >= 0 && i11 < znVar.f44956u6.size()) {
            MessageObject messageObject = (MessageObject) znVar.f44956u6.get(i11);
            if (messageObject.contentType == 0) {
                SparseArray sparseArray = this.f36347c;
                boolean z10 = this.f36346b;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bj.b(int, boolean, float, float):void");
    }
}
