package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class h7 extends mq0 {
    public org.telegram.ui.Components.pj0 f46210a;
    public final t7 f46211b;

    public h7(t7 t7Var) {
        this.f46211b = t7Var;
    }

    @Override
    public final vq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        org.telegram.ui.Cells.o7 o7Var;
        org.telegram.ui.Components.pj0 listView = this.f46211b.getListView();
        int i10 = 0;
        while (true) {
            if (i10 < listView.getChildCount()) {
                View childAt = listView.getChildAt(i10);
                if (RecyclerView.R(childAt) == i7 && (childAt instanceof org.telegram.ui.Cells.o7)) {
                    o7Var = (org.telegram.ui.Cells.o7) childAt;
                    break;
                }
                i10++;
            } else {
                o7Var = null;
                break;
            }
        }
        if (o7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        o7Var.getLocationInWindow(iArr);
        vq0 vq0Var = new vq0();
        vq0Var.f50791b = iArr[0];
        vq0Var.f50792c = iArr[1];
        vq0Var.d = this.f46210a;
        ImageReceiver imageReceiver = o7Var.f29660c;
        vq0Var.f50790a = imageReceiver;
        vq0Var.f50793e = imageReceiver.p();
        vq0Var.f50798k = o7Var.getScaleX();
        return vq0Var;
    }
}
