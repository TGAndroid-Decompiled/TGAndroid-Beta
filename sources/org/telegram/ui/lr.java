package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class lr implements q0.a {
    public final int f38495a;

    public lr(int i10) {
        this.f38495a = i10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        boolean z11;
        long j3;
        boolean z12 = true;
        switch (this.f38495a) {
            case 0:
                TLRPC.User user = (TLRPC.User) obj;
                return;
            case 1:
                View view = (View) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f23858q1;
                if (view instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                    if (s5Var.getPhotoEntry() != null && s5Var.getPhotoEntry().hasSpoiler) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    s5Var.c(z10, Float.valueOf(250.0f));
                    if (s5Var.getPhotoEntry() != null && s5Var.getPhotoEntry().isHighQuality()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    s5Var.setHighQuality(z11);
                    if (s5Var.getPhotoEntry() != null) {
                        j3 = s5Var.getPhotoEntry().starsAmount;
                    } else {
                        j3 = 0;
                    }
                    if (ChatAttachAlertPhotoLayout.f23860s1.size() <= 1) {
                        z12 = false;
                    }
                    s5Var.f(j3, z12);
                    return;
                }
                return;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Components.gn0) {
                    ((org.telegram.ui.Components.gn0) view2).a(false, true);
                    return;
                }
                return;
            default:
                View view3 = (View) obj;
                if (view3 instanceof org.telegram.ui.Components.gn0) {
                    ((org.telegram.ui.Components.gn0) view3).a(false, true);
                    return;
                }
                return;
        }
    }
}
