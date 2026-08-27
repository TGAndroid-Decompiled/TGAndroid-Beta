package org.telegram.ui;

import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

public final class gi {

    public boolean f38420a;

    public final boolean f38421b;

    public final SparseArray f38422c;
    public final rn d;

    public gi(rn rnVar, boolean z10, SparseArray sparseArray) {
        this.d = rnVar;
        this.f38421b = z10;
        this.f38422c = sparseArray;
    }

    public final boolean a(int i10) {
        rn rnVar = this.d;
        int i11 = i10 - rnVar.f42252w0.F;
        if (i11 < 0 || i11 >= rnVar.q6.size()) {
            return false;
        }
        MessageObject messageObject = (MessageObject) rnVar.q6.get(i11);
        if (messageObject.contentType != 0) {
            return false;
        }
        SparseArray sparseArray = this.f38422c;
        boolean z10 = this.f38421b;
        if (z10 || sparseArray.get(messageObject.getId(), null) != null) {
            return z10 && sparseArray.get(messageObject.getId(), null) != null;
        }
        return true;
    }

    public final void b(int i10, boolean z10, float f10, float f11) {
        rn rnVar = this.d;
        ArrayList arrayList = rnVar.q6;
        SparseArray[] sparseArrayArr = rnVar.S5;
        int i11 = i10 - rnVar.f42252w0.F;
        if (this.f38421b) {
            z10 = !z10;
        }
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        MessageObject messageObject = (MessageObject) arrayList.get(i11);
        if (!z10 || (sparseArrayArr[0].indexOfKey(messageObject.getId()) < 0 && sparseArrayArr[1].indexOfKey(messageObject.getId()) < 0)) {
            if ((z10 || sparseArrayArr[0].indexOfKey(messageObject.getId()) >= 0 || sparseArrayArr[1].indexOfKey(messageObject.getId()) >= 0) && messageObject.contentType == 0) {
                if (z10) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        this.f38420a = true;
                    } else {
                        this.f38420a = false;
                    }
                } else {
                    this.f38420a = false;
                }
                f2.o1 o1VarK = rnVar.f42213t0.K(i10);
                if (o1VarK != null) {
                    View view = o1VarK.f5789a;
                    if (view instanceof org.telegram.ui.Cells.s1) {
                        rn.b2(rnVar, view, false, f10, f11);
                        return;
                    }
                }
                rnVar.x6(messageObject, false, true);
                rnVar.dc();
                rnVar.Wc(false);
            }
        }
    }
}
