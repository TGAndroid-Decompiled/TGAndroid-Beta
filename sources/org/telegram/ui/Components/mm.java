package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class mm implements qm0 {
    public final ChatAttachAlertPhotoLayout f30560a;

    public mm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f30560a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void a(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30560a;
        chatAttachAlertPhotoLayout.L = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.E.d1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f30560a.G.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f30560a.K && (view instanceof org.telegram.ui.Cells.x5)) {
            org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) view;
            x5Var.f25708w.b(x5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        MediaController.PhotoEntry M = this.f30560a.G.M(i10);
        if (M != null && ChatAttachAlertPhotoLayout.f26019s1.containsKey(Integer.valueOf(M.imageId))) {
            return true;
        }
        return false;
    }
}
