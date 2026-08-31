package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class yl implements vl0 {
    public final ChatAttachAlertPhotoLayout f33536a;

    public yl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f33536a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void a(boolean z4) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f33536a;
        chatAttachAlertPhotoLayout.I = z4 ? 1 : 0;
        chatAttachAlertPhotoLayout.B.d1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f33536a.D.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z4) {
        if (z4 == this.f33536a.H && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.f24157w.b(t5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        MediaController.PhotoEntry M = this.f33536a.D.M(i10);
        if (M != null && ChatAttachAlertPhotoLayout.f24738p1.containsKey(Integer.valueOf(M.imageId))) {
            return true;
        }
        return false;
    }
}
