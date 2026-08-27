package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class h7 extends st0 {

    public org.telegram.ui.Components.zk0 f38692a;

    public final s7 f38693b;

    public h7(s7 s7Var) {
        this.f38693b = s7Var;
    }

    @Override
    public final cu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        org.telegram.ui.Cells.o7 o7Var;
        org.telegram.ui.Components.zk0 listView = this.f38693b.getListView();
        int i11 = 0;
        while (true) {
            if (i11 >= listView.getChildCount()) {
                o7Var = null;
                break;
            }
            View childAt = listView.getChildAt(i11);
            if (RecyclerView.R(childAt) == i10 && (childAt instanceof org.telegram.ui.Cells.o7)) {
                o7Var = (org.telegram.ui.Cells.o7) childAt;
                break;
            }
            i11++;
        }
        if (o7Var == null) {
            return null;
        }
        int[] iArr = new int[2];
        o7Var.getLocationInWindow(iArr);
        cu0 cu0Var = new cu0();
        cu0Var.f37154b = iArr[0];
        cu0Var.f37155c = iArr[1];
        cu0Var.d = this.f38692a;
        ImageReceiver imageReceiver = o7Var.f24786c;
        cu0Var.f37153a = imageReceiver;
        cu0Var.f37156e = imageReceiver.getBitmapSafe();
        cu0Var.f37161k = o7Var.getScaleX();
        return cu0Var;
    }
}
