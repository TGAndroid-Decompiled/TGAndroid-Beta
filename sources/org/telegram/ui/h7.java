package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class h7 extends mu0 {
    public org.telegram.ui.Components.ml0 f33746a;
    public final s7 f33747b;

    public h7(s7 s7Var) {
        this.f33747b = s7Var;
    }

    @Override
    public final wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.t7 t7Var;
        org.telegram.ui.Components.ml0 listView = this.f33747b.getListView();
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
        wu0 wu0Var = new wu0();
        wu0Var.f39095b = iArr[0];
        wu0Var.f39096c = iArr[1];
        wu0Var.d = this.f33746a;
        ImageReceiver imageReceiver = t7Var.f21348c;
        wu0Var.f39094a = imageReceiver;
        wu0Var.e = imageReceiver.getBitmapSafe();
        wu0Var.f39101k = t7Var.getScaleX();
        return wu0Var;
    }
}
