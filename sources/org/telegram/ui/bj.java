package org.telegram.ui;

import android.util.SparseArray;
import org.telegram.messenger.MessageObject;
public final class bj {
    public boolean f36343a;
    public final boolean f36344b;
    public final SparseArray f36345c;
    public final zn d;

    public bj(zn znVar, boolean z10, SparseArray sparseArray) {
        this.d = znVar;
        this.f36344b = z10;
        this.f36345c = sparseArray;
    }

    public final boolean a(int i10) {
        zn znVar = this.d;
        int i11 = i10 - znVar.A0.J;
        if (i11 >= 0 && i11 < znVar.f44954u6.size()) {
            MessageObject messageObject = (MessageObject) znVar.f44954u6.get(i11);
            if (messageObject.contentType == 0) {
                SparseArray sparseArray = this.f36345c;
                boolean z10 = this.f36344b;
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
