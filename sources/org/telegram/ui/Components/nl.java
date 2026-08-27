package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;

public final class nl implements al0 {

    public final ChatAttachAlertPhotoLayout f30988a;

    public nl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f30988a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void a(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30988a;
        chatAttachAlertPhotoLayout.H = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.A.d1(true);
    }

    @Override
    public final boolean b(int i10) {
        return this.f30988a.C.j(i10) == 0;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f30988a.G && (view instanceof org.telegram.ui.Cells.q5)) {
            org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
            q5Var.f25061w.d(q5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        MediaController.PhotoEntry photoEntryM = this.f30988a.C.M(i10);
        return photoEntryM != null && ChatAttachAlertPhotoLayout.f26239o1.containsKey(Integer.valueOf(photoEntryM.imageId));
    }
}
