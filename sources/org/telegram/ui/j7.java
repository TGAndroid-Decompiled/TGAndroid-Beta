package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class j7 extends vu0 {
    public org.telegram.ui.Components.ml0 f34789a;
    public final u7 f34790b;

    public j7(u7 u7Var) {
        this.f34790b = u7Var;
    }

    @Override
    public final fv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.t7 t7Var;
        org.telegram.ui.Components.ml0 listView = this.f34790b.getListView();
        int i11 = 0;
        while (true) {
            if (i11 < listView.getChildCount()) {
                View childAt = listView.getChildAt(i11);
                if (RecyclerView.S(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.t7)) {
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
        fv0 fv0Var = new fv0();
        fv0Var.f33768b = iArr[0];
        fv0Var.f33769c = iArr[1];
        fv0Var.d = this.f34789a;
        ImageReceiver imageReceiver = t7Var.f21386c;
        fv0Var.f33767a = imageReceiver;
        fv0Var.e = imageReceiver.getBitmapSafe();
        fv0Var.f33774k = t7Var.getScaleX();
        return fv0Var;
    }
}
