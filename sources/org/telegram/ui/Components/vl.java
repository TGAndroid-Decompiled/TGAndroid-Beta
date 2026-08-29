package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class vl implements kl0 {
    public final ChatAttachAlertPhotoLayout f33567a;

    public vl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f33567a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void a(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33567a;
        chatAttachAlertPhotoLayout.H = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.A.d1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f33567a.C.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f33567a.G && (view instanceof org.telegram.ui.Cells.r5)) {
            org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
            r5Var.f25223w.d(r5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        MediaController.PhotoEntry M = this.f33567a.C.M(i10);
        if (M != null && ChatAttachAlertPhotoLayout.f26254o1.containsKey(Integer.valueOf(M.imageId))) {
            return true;
        }
        return false;
    }
}
