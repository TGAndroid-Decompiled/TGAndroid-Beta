package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class lm implements km0 {
    public final ChatAttachAlertPhotoLayout f28218a;

    public lm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f28218a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void a(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f28218a;
        chatAttachAlertPhotoLayout.L = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.E.d1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f28218a.G.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f28218a.K && (view instanceof org.telegram.ui.Cells.s5)) {
            org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
            s5Var.f23010w.c(s5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        MediaController.PhotoEntry M = this.f28218a.G.M(i10);
        if (M != null && ChatAttachAlertPhotoLayout.f24079s1.containsKey(Integer.valueOf(M.imageId))) {
            return true;
        }
        return false;
    }
}
