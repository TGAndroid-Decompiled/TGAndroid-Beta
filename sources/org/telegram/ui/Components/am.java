package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class am implements zl0 {
    public final ChatAttachAlertPhotoLayout f22689a;

    public am(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.f22689a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final void a(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.f22689a;
        chatAttachAlertPhotoLayout.L = z10 ? 1 : 0;
        chatAttachAlertPhotoLayout.E.e1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f22689a.G.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f22689a.K && (view instanceof org.telegram.ui.Cells.u5)) {
            org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
            u5Var.f21629w.b(u5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        MediaController.PhotoEntry M = this.f22689a.G.M(i10);
        if (M != null && ChatAttachAlertPhotoLayout.f22137s1.containsKey(Integer.valueOf(M.imageId))) {
            return true;
        }
        return false;
    }
}
