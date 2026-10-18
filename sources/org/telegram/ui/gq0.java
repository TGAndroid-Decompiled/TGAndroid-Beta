package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class gq0 implements org.telegram.ui.Components.jm0 {
    public final lq0 f37313a;

    public gq0(lq0 lq0Var) {
        this.f37313a = lq0Var;
    }

    @Override
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        lq0 lq0Var = this.f37313a;
        lq0Var.W = z10 ? 1 : 0;
        if (z10) {
            d5Var = ((org.telegram.ui.ActionBar.n2) lq0Var).parentLayout;
            d5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        lq0Var.K.d1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f37313a.L.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f37313a.X && (view instanceof org.telegram.ui.Cells.s5)) {
            org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
            s5Var.f23013w.c(s5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        Object obj;
        lq0 lq0Var = this.f37313a;
        MediaController.AlbumEntry albumEntry = lq0Var.J;
        if (albumEntry != null) {
            obj = Integer.valueOf(albumEntry.photos.get(i10).imageId);
        } else {
            obj = ((MediaController.SearchImage) lq0Var.f38919f.get(i10)).f17796id;
        }
        return lq0Var.f38913b.containsKey(obj);
    }
}
