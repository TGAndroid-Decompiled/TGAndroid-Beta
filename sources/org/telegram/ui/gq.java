package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class gq implements q0.a {
    public final int f47504a;

    public gq(int i7) {
        this.f47504a = i7;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        boolean z11;
        long j3;
        boolean z12 = true;
        switch (this.f47504a) {
            case 0:
                TLRPC.User user = (TLRPC.User) obj;
                return;
            case 1:
                View view = (View) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f32365r1;
                if (view instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                    if (q5Var.getPhotoEntry() != null && q5Var.getPhotoEntry().M) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q5Var.c(z10, Float.valueOf(250.0f));
                    if (q5Var.getPhotoEntry() != null && q5Var.getPhotoEntry().c()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    q5Var.setHighQuality(z11);
                    if (q5Var.getPhotoEntry() != null) {
                        j3 = q5Var.getPhotoEntry().N;
                    } else {
                        j3 = 0;
                    }
                    if (ChatAttachAlertPhotoLayout.f32367t1.size() <= 1) {
                        z12 = false;
                    }
                    q5Var.f(j3, z12);
                    return;
                }
                return;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Components.tl0) {
                    ((org.telegram.ui.Components.tl0) view2).a(false, true);
                    return;
                }
                return;
            default:
                View view3 = (View) obj;
                if (view3 instanceof org.telegram.ui.Components.tl0) {
                    ((org.telegram.ui.Components.tl0) view3).a(false, true);
                    return;
                }
                return;
        }
    }
}
