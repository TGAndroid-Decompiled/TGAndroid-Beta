package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class j7 extends ou0 {
    public org.telegram.ui.Components.zl0 f37590a;
    public final v7 f37591b;

    public j7(v7 v7Var) {
        this.f37591b = v7Var;
    }

    @Override
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.t7 t7Var;
        org.telegram.ui.Components.zl0 listView = this.f37591b.getListView();
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
        yu0 yu0Var = new yu0();
        yu0Var.f43621b = iArr[0];
        yu0Var.f43622c = iArr[1];
        yu0Var.d = this.f37590a;
        ImageReceiver imageReceiver = t7Var.f23072c;
        yu0Var.f43620a = imageReceiver;
        yu0Var.f43623e = imageReceiver.getBitmapSafe();
        yu0Var.f43628k = t7Var.getScaleX();
        return yu0Var;
    }
}
