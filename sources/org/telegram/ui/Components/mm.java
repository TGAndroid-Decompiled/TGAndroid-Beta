package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class mm implements pm0 {
    public final ChatAttachAlertPhotoLayout f30615a;

    public mm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f30615a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void a(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30615a;
        chatAttachAlertPhotoLayout.L = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.E.d1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f30615a.G.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f30615a.K && (view instanceof org.telegram.ui.Cells.x5)) {
            org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) view;
            x5Var.f25706w.b(x5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        MediaController.PhotoEntry M = this.f30615a.G.M(i10);
        if (M != null && ChatAttachAlertPhotoLayout.f26017s1.containsKey(Integer.valueOf(M.imageId))) {
            return true;
        }
        return false;
    }
}
