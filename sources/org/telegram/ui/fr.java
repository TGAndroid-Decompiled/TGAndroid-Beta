package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class fr implements q0.a {
    public final int f33731a;

    public fr(int i10) {
        this.f33731a = i10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        boolean z11;
        long j3;
        boolean z12 = true;
        switch (this.f33731a) {
            case 0:
                TLRPC.User user = (TLRPC.User) obj;
                return;
            case 1:
                View view = (View) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f22106q1;
                if (view instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                    if (t5Var.getPhotoEntry() != null && t5Var.getPhotoEntry().hasSpoiler) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t5Var.c(z10, Float.valueOf(250.0f));
                    if (t5Var.getPhotoEntry() != null && t5Var.getPhotoEntry().isHighQuality()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    t5Var.setHighQuality(z11);
                    if (t5Var.getPhotoEntry() != null) {
                        j3 = t5Var.getPhotoEntry().starsAmount;
                    } else {
                        j3 = 0;
                    }
                    if (ChatAttachAlertPhotoLayout.f22108s1.size() <= 1) {
                        z12 = false;
                    }
                    t5Var.f(j3, z12);
                    return;
                }
                return;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Components.tn0) {
                    ((org.telegram.ui.Components.tn0) view2).a(false, true);
                    return;
                }
                return;
            default:
                View view3 = (View) obj;
                if (view3 instanceof org.telegram.ui.Components.tn0) {
                    ((org.telegram.ui.Components.tn0) view3).a(false, true);
                    return;
                }
                return;
        }
    }
}
