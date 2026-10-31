package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class fr implements q0.a {
    public final int f37335a;

    public fr(int i10) {
        this.f37335a = i10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        boolean z11;
        long j10;
        boolean z12 = true;
        switch (this.f37335a) {
            case 0:
                TLRPC.User user = (TLRPC.User) obj;
                return;
            case 1:
                View view = (View) obj;
                boolean z13 = ChatAttachAlertPhotoLayout.f23845q1;
                if (view instanceof org.telegram.ui.Cells.v5) {
                    org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
                    if (v5Var.getPhotoEntry() != null && v5Var.getPhotoEntry().M) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    v5Var.c(z10, Float.valueOf(250.0f));
                    if (v5Var.getPhotoEntry() != null && v5Var.getPhotoEntry().c()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    v5Var.setHighQuality(z11);
                    if (v5Var.getPhotoEntry() != null) {
                        j10 = v5Var.getPhotoEntry().N;
                    } else {
                        j10 = 0;
                    }
                    if (ChatAttachAlertPhotoLayout.f23847s1.size() <= 1) {
                        z12 = false;
                    }
                    v5Var.f(j10, z12);
                    return;
                }
                return;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Components.qm0) {
                    ((org.telegram.ui.Components.qm0) view2).a(false, true);
                    return;
                }
                return;
            default:
                View view3 = (View) obj;
                if (view3 instanceof org.telegram.ui.Components.qm0) {
                    ((org.telegram.ui.Components.qm0) view3).a(false, true);
                    return;
                }
                return;
        }
    }
}
