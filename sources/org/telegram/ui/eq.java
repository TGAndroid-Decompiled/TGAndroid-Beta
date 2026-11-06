package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class eq implements q0.a {
    public final int f45394a;

    public eq(int i7) {
        this.f45394a = i7;
    }

    @Override
    public final void accept(Object obj) {
        boolean z9;
        boolean z10;
        long j3;
        boolean z11 = true;
        switch (this.f45394a) {
            case 0:
                TLRPC.User user = (TLRPC.User) obj;
                return;
            case 1:
                View view = (View) obj;
                boolean z12 = ChatAttachAlertPhotoLayout.f31183q1;
                if (view instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                    if (q5Var.getPhotoEntry() != null && q5Var.getPhotoEntry().M) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    q5Var.c(z9, Float.valueOf(250.0f));
                    if (q5Var.getPhotoEntry() != null && q5Var.getPhotoEntry().c()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    q5Var.setHighQuality(z10);
                    if (q5Var.getPhotoEntry() != null) {
                        j3 = q5Var.getPhotoEntry().N;
                    } else {
                        j3 = 0;
                    }
                    if (ChatAttachAlertPhotoLayout.f31185s1.size() <= 1) {
                        z11 = false;
                    }
                    q5Var.f(j3, z11);
                    return;
                }
                return;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Components.pl0) {
                    ((org.telegram.ui.Components.pl0) view2).a(false, true);
                    return;
                }
                return;
            default:
                View view3 = (View) obj;
                if (view3 instanceof org.telegram.ui.Components.pl0) {
                    ((org.telegram.ui.Components.pl0) view3).a(false, true);
                    return;
                }
                return;
        }
    }
}
