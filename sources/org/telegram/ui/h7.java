package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class h7 extends qq0 {
    public org.telegram.ui.Components.pj0 f46234a;
    public final t7 f46235b;

    public h7(t7 t7Var) {
        this.f46235b = t7Var;
    }

    @Override
    public final zq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        org.telegram.ui.Cells.o7 o7Var;
        org.telegram.ui.Components.pj0 listView = this.f46235b.getListView();
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
        zq0 zq0Var = new zq0();
        zq0Var.f52504b = iArr[0];
        zq0Var.f52505c = iArr[1];
        zq0Var.d = this.f46234a;
        ImageReceiver imageReceiver = o7Var.f29679c;
        zq0Var.f52503a = imageReceiver;
        zq0Var.f52506e = imageReceiver.p();
        zq0Var.f52511k = o7Var.getScaleX();
        return zq0Var;
    }
}
