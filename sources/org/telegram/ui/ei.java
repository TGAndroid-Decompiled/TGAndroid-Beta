package org.telegram.ui;

import android.util.SparseArray;
import org.telegram.messenger.MessageObject;
public final class ei {
    public boolean f37961a;
    public final boolean f37962b;
    public final SparseArray f37963c;
    public final qn d;

    public ei(qn qnVar, boolean z10, SparseArray sparseArray) {
        this.d = qnVar;
        this.f37962b = z10;
        this.f37963c = sparseArray;
    }

    public final boolean a(int i9) {
        qn qnVar = this.d;
        int i10 = i9 - qnVar.f42114w0.F;
        if (i10 >= 0 && i10 < qnVar.f42042q6.size()) {
            MessageObject messageObject = (MessageObject) qnVar.f42042q6.get(i10);
            if (messageObject.contentType == 0) {
                SparseArray sparseArray = this.f37963c;
                boolean z10 = this.f37962b;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ei.b(int, boolean, float, float):void");
    }
}
