package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class l7 extends zu0 {
    public org.telegram.ui.Components.mm0 f37626a;
    public final w7 f37627b;

    public l7(w7 w7Var) {
        this.f37627b = w7Var;
    }

    @Override
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.t7 t7Var;
        org.telegram.ui.Components.mm0 listView = this.f37627b.getListView();
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
        jv0 jv0Var = new jv0();
        jv0Var.f37146b = iArr[0];
        jv0Var.f37147c = iArr[1];
        jv0Var.d = this.f37626a;
        ImageReceiver imageReceiver = t7Var.f21804c;
        jv0Var.f37145a = imageReceiver;
        jv0Var.e = imageReceiver.getBitmapSafe();
        jv0Var.f37152k = t7Var.getScaleX();
        return jv0Var;
    }
}
