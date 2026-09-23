package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class bm implements nl0 {
    public final ChatAttachAlertPhotoLayout f22779a;

    public bm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f22779a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void a(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f22779a;
        chatAttachAlertPhotoLayout.L = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.E.d1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f22779a.G.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f22779a.K && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.f21331w.b(t5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        MediaController.PhotoEntry M = this.f22779a.G.M(i10);
        if (M != null && ChatAttachAlertPhotoLayout.f21871s1.containsKey(Integer.valueOf(M.imageId))) {
            return true;
        }
        return false;
    }
}
