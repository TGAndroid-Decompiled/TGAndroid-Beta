package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class am implements wl0 {
    public final ChatAttachAlertPhotoLayout f22715a;

    public am(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f22715a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void a(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f22715a;
        chatAttachAlertPhotoLayout.L = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.E.e1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f22715a.G.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f22715a.K && (view instanceof org.telegram.ui.Cells.u5)) {
            org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
            u5Var.f21614w.a(u5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        MediaController.PhotoEntry M = this.f22715a.G.M(i10);
        if (M != null && ChatAttachAlertPhotoLayout.f22121s1.containsKey(Integer.valueOf(M.imageId))) {
            return true;
        }
        return false;
    }
}
