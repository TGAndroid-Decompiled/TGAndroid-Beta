package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class hr implements q0.a {
    public final int f34743a;

    public hr(int i10) {
        this.f34743a = i10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z4;
        boolean z10;
        long j10;
        boolean z11 = true;
        switch (this.f34743a) {
            case 0:
                TLRPC.User user = (TLRPC.User) obj;
                return;
            case 1:
                View view = (View) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.f22867n1;
                if (view instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                    if (s5Var.getPhotoEntry() != null && s5Var.getPhotoEntry().hasSpoiler) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    s5Var.c(z4, Float.valueOf(250.0f));
                    if (s5Var.getPhotoEntry() != null && s5Var.getPhotoEntry().isHighQuality()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    s5Var.setHighQuality(z10);
                    if (s5Var.getPhotoEntry() != null) {
                        j10 = s5Var.getPhotoEntry().starsAmount;
                    } else {
                        j10 = 0;
                    }
                    if (ChatAttachAlertPhotoLayout.f22869p1.size() <= 1) {
                        z11 = false;
                    }
                    s5Var.f(j10, z11);
                    return;
                }
                return;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Components.mn0) {
                    ((org.telegram.ui.Components.mn0) view2).a(false, true);
                    return;
                }
                return;
            default:
                View view3 = (View) obj;
                if (view3 instanceof org.telegram.ui.Components.mn0) {
                    ((org.telegram.ui.Components.mn0) view3).a(false, true);
                    return;
                }
                return;
        }
    }
}
