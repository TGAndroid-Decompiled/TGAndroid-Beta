package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class wl implements tl0 {
    public final ChatAttachAlertPhotoLayout f30307a;

    public wl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f30307a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void a(boolean z4) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f30307a;
        chatAttachAlertPhotoLayout.I = z4 ? 1 : 0;
        chatAttachAlertPhotoLayout.B.c1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f30307a.D.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z4) {
        if (z4 == this.f30307a.H && (view instanceof org.telegram.ui.Cells.s5)) {
            org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
            s5Var.f22291w.b(s5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        MediaController.PhotoEntry M = this.f30307a.D.M(i10);
        if (M != null && ChatAttachAlertPhotoLayout.f22869p1.containsKey(Integer.valueOf(M.imageId))) {
            return true;
        }
        return false;
    }
}
