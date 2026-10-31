package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class h7 extends yr0 {
    public org.telegram.ui.Components.tk0 f37786a;
    public final t7 f37787b;

    public h7(t7 t7Var) {
        this.f37787b = t7Var;
    }

    @Override
    public final gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.s7 s7Var;
        org.telegram.ui.Components.tk0 listView = this.f37787b.getListView();
        int i11 = 0;
        while (true) {
            if (i11 < listView.getChildCount()) {
                View childAt = listView.getChildAt(i11);
                if (RecyclerView.R(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.s7)) {
                    s7Var = (org.telegram.ui.Cells.s7) childAt;
                    break;
                }
                i11++;
            } else {
                s7Var = null;
                break;
            }
        }
        if (s7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        s7Var.getLocationInWindow(iArr);
        gs0 gs0Var = new gs0();
        gs0Var.f37628b = iArr[0];
        gs0Var.f37629c = iArr[1];
        gs0Var.d = this.f37786a;
        ImageReceiver imageReceiver = s7Var.f23021c;
        gs0Var.f37627a = imageReceiver;
        gs0Var.e = imageReceiver.p();
        gs0Var.f37634k = s7Var.getScaleX();
        return gs0Var;
    }
}
