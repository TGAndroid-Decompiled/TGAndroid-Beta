package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class h7 extends tu0 {
    public org.telegram.ui.Components.ll0 f34180a;
    public final s7 f34181b;

    public h7(s7 s7Var) {
        this.f34181b = s7Var;
    }

    @Override
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.t7 t7Var;
        org.telegram.ui.Components.ll0 listView = this.f34181b.getListView();
        int i11 = 0;
        while (true) {
            if (i11 < listView.getChildCount()) {
                View childAt = listView.getChildAt(i11);
                if (RecyclerView.R(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.t7)) {
                    t7Var = (org.telegram.ui.Cells.t7) childAt;
                    break;
                }
                i11++;
            } else {
                t7Var = null;
                break;
            }
        }
        if (t7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        t7Var.getLocationInWindow(iArr);
        dv0 dv0Var = new dv0();
        dv0Var.f33135b = iArr[0];
        dv0Var.f33136c = iArr[1];
        dv0Var.d = this.f34180a;
        ImageReceiver imageReceiver = t7Var.f21375c;
        dv0Var.f33134a = imageReceiver;
        dv0Var.e = imageReceiver.getBitmapSafe();
        dv0Var.f33141k = t7Var.getScaleX();
        return dv0Var;
    }
}
