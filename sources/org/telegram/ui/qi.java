package org.telegram.ui;

import android.util.SparseArray;
import org.telegram.messenger.MessageObject;
public final class qi {
    public boolean f36887a;
    public final boolean f36888b;
    public final SparseArray f36889c;
    public final bo d;

    public qi(bo boVar, boolean z10, SparseArray sparseArray) {
        this.d = boVar;
        this.f36888b = z10;
        this.f36889c = sparseArray;
    }

    public final boolean a(int i10) {
        bo boVar = this.d;
        int i11 = i10 - boVar.A0.J;
        if (i11 >= 0 && i11 < boVar.f32486u6.size()) {
            MessageObject messageObject = (MessageObject) boVar.f32486u6.get(i11);
            if (messageObject.contentType == 0) {
                SparseArray sparseArray = this.f36889c;
                boolean z10 = this.f36888b;
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
