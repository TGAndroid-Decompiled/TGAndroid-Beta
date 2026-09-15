package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class am implements ml0 {
    public final ChatAttachAlertPhotoLayout f22435a;

    public am(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f22435a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void a(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f22435a;
        chatAttachAlertPhotoLayout.L = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.E.d1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f22435a.G.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f22435a.K && (view instanceof org.telegram.ui.Cells.s5)) {
            org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
            s5Var.f20956w.b(s5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        MediaController.PhotoEntry M = this.f22435a.G.M(i10);
        if (M != null && ChatAttachAlertPhotoLayout.f21900s1.containsKey(Integer.valueOf(M.imageId))) {
            return true;
        }
        return false;
    }
}
