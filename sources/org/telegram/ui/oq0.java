package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class oq0 implements org.telegram.ui.Components.xl0 {
    public final tq0 f36329a;

    public oq0(tq0 tq0Var) {
        this.f36329a = tq0Var;
    }

    @Override
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        tq0 tq0Var = this.f36329a;
        tq0Var.W = z10 ? 1 : 0;
        if (z10) {
            b5Var = ((org.telegram.ui.ActionBar.m2) tq0Var).parentLayout;
            b5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        tq0Var.K.d1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f36329a.L.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f36329a.X && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.f21205w.a(t5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        Object obj;
        tq0 tq0Var = this.f36329a;
        MediaController.AlbumEntry albumEntry = tq0Var.J;
        if (albumEntry != null) {
            obj = Integer.valueOf(albumEntry.photos.get(i10).imageId);
        } else {
            obj = ((MediaController.SearchImage) tq0Var.f38196f.get(i10)).f15826id;
        }
        return tq0Var.f38190b.containsKey(obj);
    }
}
