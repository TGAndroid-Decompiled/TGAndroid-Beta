package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class jm implements mm0 {
    public final ChatAttachAlertPhotoLayout f27724a;

    public jm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f27724a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void a(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f27724a;
        chatAttachAlertPhotoLayout.L = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.E.e1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f27724a.G.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f27724a.K && (view instanceof org.telegram.ui.Cells.s5)) {
            org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
            s5Var.f23255w.b(s5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        MediaController.PhotoEntry M = this.f27724a.G.M(i10);
        if (M != null && ChatAttachAlertPhotoLayout.f24225s1.containsKey(Integer.valueOf(M.imageId))) {
            return true;
        }
        return false;
    }
}
