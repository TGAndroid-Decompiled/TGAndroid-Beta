package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class j7 extends fu0 {
    public org.telegram.ui.Components.sl0 f37853a;
    public final u7 f37854b;

    public j7(u7 u7Var) {
        this.f37854b = u7Var;
    }

    @Override
    public final qu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z4, boolean z10) {
        org.telegram.ui.Cells.r7 r7Var;
        org.telegram.ui.Components.sl0 listView = this.f37854b.getListView();
        int i11 = 0;
        while (true) {
            if (i11 < listView.getChildCount()) {
                View childAt = listView.getChildAt(i11);
                if (RecyclerView.R(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.r7)) {
                    r7Var = (org.telegram.ui.Cells.r7) childAt;
                    break;
                }
                i11++;
            } else {
                r7Var = null;
                break;
            }
        }
        if (r7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        r7Var.getLocationInWindow(iArr);
        qu0 qu0Var = new qu0();
        qu0Var.f40679b = iArr[0];
        qu0Var.f40680c = iArr[1];
        qu0Var.d = this.f37853a;
        ImageReceiver imageReceiver = r7Var.f23563c;
        qu0Var.f40678a = imageReceiver;
        qu0Var.f40681e = imageReceiver.getBitmapSafe();
        qu0Var.f40686k = r7Var.getScaleX();
        return qu0Var;
    }
}
