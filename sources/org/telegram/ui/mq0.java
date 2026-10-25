package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class mq0 implements org.telegram.ui.Components.pm0 {
    public final rq0 f41642a;

    public mq0(rq0 rq0Var) {
        this.f41642a = rq0Var;
    }

    @Override
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.j5 j5Var;
        rq0 rq0Var = this.f41642a;
        rq0Var.W = z10 ? 1 : 0;
        if (z10) {
            j5Var = ((org.telegram.ui.ActionBar.r2) rq0Var).parentLayout;
            j5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        rq0Var.K.d1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f41642a.L.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f41642a.X && (view instanceof org.telegram.ui.Cells.x5)) {
            org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) view;
            x5Var.f25704w.b(x5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        Object obj;
        rq0 rq0Var = this.f41642a;
        MediaController.AlbumEntry albumEntry = rq0Var.J;
        if (albumEntry != null) {
            obj = Integer.valueOf(albumEntry.photos.get(i10).imageId);
        } else {
            obj = ((MediaController.SearchImage) rq0Var.f43247f.get(i10)).f19543id;
        }
        return rq0Var.f43241b.containsKey(obj);
    }
}
