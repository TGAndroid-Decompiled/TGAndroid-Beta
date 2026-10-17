package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class fq0 implements org.telegram.ui.Components.jm0 {
    public final kq0 f37031a;

    public fq0(kq0 kq0Var) {
        this.f37031a = kq0Var;
    }

    @Override
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        kq0 kq0Var = this.f37031a;
        kq0Var.W = z10 ? 1 : 0;
        if (z10) {
            d5Var = ((org.telegram.ui.ActionBar.n2) kq0Var).parentLayout;
            d5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        kq0Var.K.d1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f37031a.L.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f37031a.X && (view instanceof org.telegram.ui.Cells.s5)) {
            org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
            s5Var.f23009w.c(s5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        Object obj;
        kq0 kq0Var = this.f37031a;
        MediaController.AlbumEntry albumEntry = kq0Var.J;
        if (albumEntry != null) {
            obj = Integer.valueOf(albumEntry.photos.get(i10).imageId);
        } else {
            obj = ((MediaController.SearchImage) kq0Var.f38645f.get(i10)).f17789id;
        }
        return kq0Var.f38639b.containsKey(obj);
    }
}
