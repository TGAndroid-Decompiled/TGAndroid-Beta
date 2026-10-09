package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class g7 extends uu0 {
    public org.telegram.ui.Components.qm0 f37897a;
    public final r7 f37898b;

    public g7(r7 r7Var) {
        this.f37898b = r7Var;
    }

    @Override
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.t7 t7Var;
        org.telegram.ui.Components.qm0 listView = this.f37898b.getListView();
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
        ev0 ev0Var = new ev0();
        ev0Var.f37355b = iArr[0];
        ev0Var.f37356c = iArr[1];
        ev0Var.d = this.f37897a;
        ImageReceiver imageReceiver = t7Var.f23065c;
        ev0Var.f37354a = imageReceiver;
        ev0Var.f37357e = imageReceiver.getBitmapSafe();
        ev0Var.f37362k = t7Var.getScaleX();
        return ev0Var;
    }
}
