package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class oq0 implements org.telegram.ui.Components.qm0 {
    public final tq0 f42177a;

    public oq0(tq0 tq0Var) {
        this.f42177a = tq0Var;
    }

    @Override
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.j5 j5Var;
        tq0 tq0Var = this.f42177a;
        tq0Var.W = z10 ? 1 : 0;
        if (z10) {
            j5Var = ((org.telegram.ui.ActionBar.r2) tq0Var).parentLayout;
            j5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        tq0Var.K.d1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f42177a.L.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f42177a.X && (view instanceof org.telegram.ui.Cells.x5)) {
            org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) view;
            x5Var.f25708w.b(x5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        Object obj;
        tq0 tq0Var = this.f42177a;
        MediaController.AlbumEntry albumEntry = tq0Var.J;
        if (albumEntry != null) {
            obj = Integer.valueOf(albumEntry.photos.get(i10).imageId);
        } else {
            obj = ((MediaController.SearchImage) tq0Var.f43736f.get(i10)).f19542id;
        }
        return tq0Var.f43730b.containsKey(obj);
    }
}
