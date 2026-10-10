package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class g7 extends uu0 {
    public org.telegram.ui.Components.rm0 f37943a;
    public final r7 f37944b;

    public g7(r7 r7Var) {
        this.f37944b = r7Var;
    }

    @Override
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.t7 t7Var;
        org.telegram.ui.Components.rm0 listView = this.f37944b.getListView();
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
        ev0Var.f37401b = iArr[0];
        ev0Var.f37402c = iArr[1];
        ev0Var.d = this.f37943a;
        ImageReceiver imageReceiver = t7Var.f23069c;
        ev0Var.f37400a = imageReceiver;
        ev0Var.f37403e = imageReceiver.getBitmapSafe();
        ev0Var.f37408k = t7Var.getScaleX();
        return ev0Var;
    }
}
