package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class or implements q0.a {
    public final int f39030a;

    public or(int i10) {
        this.f39030a = i10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        boolean z11;
        long j10;
        boolean z12 = true;
        switch (this.f39030a) {
            case 0:
                TLRPC.User user = (TLRPC.User) obj;
                return;
            case 1:
                View view = (View) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f23018q1;
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
                        j10 = t5Var.getPhotoEntry().starsAmount;
                    } else {
                        j10 = 0;
                    }
                    if (ChatAttachAlertPhotoLayout.f23020s1.size() <= 1) {
                        z12 = false;
                    }
                    t5Var.f(j10, z12);
                    return;
                }
                return;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Components.jo0) {
                    ((org.telegram.ui.Components.jo0) view2).a(false, true);
                    return;
                }
                return;
            default:
                View view3 = (View) obj;
                if (view3 instanceof org.telegram.ui.Components.jo0) {
                    ((org.telegram.ui.Components.jo0) view3).a(false, true);
                    return;
                }
                return;
        }
    }
}
