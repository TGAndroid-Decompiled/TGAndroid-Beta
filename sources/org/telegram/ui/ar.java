package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class ar implements q0.a {
    public final int f37885a;

    public ar(int i10) {
        this.f37885a = i10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        boolean z11;
        long j10;
        boolean z12 = true;
        switch (this.f37885a) {
            case 0:
                TLRPC.User user = (TLRPC.User) obj;
                return;
            case 1:
                View view = (View) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f26015q1;
                if (view instanceof org.telegram.ui.Cells.x5) {
                    org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) view;
                    if (x5Var.getPhotoEntry() != null && x5Var.getPhotoEntry().hasSpoiler) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    x5Var.c(z10, Float.valueOf(250.0f));
                    if (x5Var.getPhotoEntry() != null && x5Var.getPhotoEntry().isHighQuality()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    x5Var.setHighQuality(z11);
                    if (x5Var.getPhotoEntry() != null) {
                        j10 = x5Var.getPhotoEntry().starsAmount;
                    } else {
                        j10 = 0;
                    }
                    if (ChatAttachAlertPhotoLayout.f26017s1.size() <= 1) {
                        z12 = false;
                    }
                    x5Var.f(j10, z12);
                    return;
                }
                return;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Components.no0) {
                    ((org.telegram.ui.Components.no0) view2).a(false, true);
                    return;
                }
                return;
            default:
                View view3 = (View) obj;
                if (view3 instanceof org.telegram.ui.Components.no0) {
                    ((org.telegram.ui.Components.no0) view3).a(false, true);
                    return;
                }
                return;
        }
    }
}
