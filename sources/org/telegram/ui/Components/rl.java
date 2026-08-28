package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class rl implements xk0 {
    public final ChatAttachAlertPhotoLayout f32194a;

    public rl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f32194a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void a(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f32194a;
        chatAttachAlertPhotoLayout.H = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.A.d1(true);
    }

    @Override
    public final boolean b(int i9) {
        if (this.f32194a.C.j(i9) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f32194a.G && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.f25691w.d(t5Var);
        }
    }

    @Override
    public final boolean d(int i9) {
        MediaController.PhotoEntry M = this.f32194a.C.M(i9);
        if (M != null && ChatAttachAlertPhotoLayout.f26243o1.containsKey(Integer.valueOf(M.imageId))) {
            return true;
        }
        return false;
    }
}
