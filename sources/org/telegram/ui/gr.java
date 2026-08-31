package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class gr implements q0.a {
    public final int f37252a;

    public gr(int i10) {
        this.f37252a = i10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z4;
        boolean z10;
        long j10;
        boolean z11 = true;
        switch (this.f37252a) {
            case 0:
                TLRPC.User user = (TLRPC.User) obj;
                return;
            case 1:
                View view = (View) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.f24736n1;
                if (view instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                    if (t5Var.getPhotoEntry() != null && t5Var.getPhotoEntry().hasSpoiler) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    t5Var.c(z4, Float.valueOf(250.0f));
                    if (t5Var.getPhotoEntry() != null && t5Var.getPhotoEntry().isHighQuality()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t5Var.setHighQuality(z10);
                    if (t5Var.getPhotoEntry() != null) {
                        j10 = t5Var.getPhotoEntry().starsAmount;
                    } else {
                        j10 = 0;
                    }
                    if (ChatAttachAlertPhotoLayout.f24738p1.size() <= 1) {
                        z11 = false;
                    }
                    t5Var.f(j10, z11);
                    return;
                }
                return;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Components.on0) {
                    ((org.telegram.ui.Components.on0) view2).a(false, true);
                    return;
                }
                return;
            default:
                View view3 = (View) obj;
                if (view3 instanceof org.telegram.ui.Components.on0) {
                    ((org.telegram.ui.Components.on0) view3).a(false, true);
                    return;
                }
                return;
        }
    }
}
