package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class pq0 implements org.telegram.ui.Components.nl0 {
    public final uq0 f36165a;

    public pq0(uq0 uq0Var) {
        this.f36165a = uq0Var;
    }

    @Override
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.c5 c5Var;
        uq0 uq0Var = this.f36165a;
        uq0Var.W = z10 ? 1 : 0;
        if (z10) {
            c5Var = ((org.telegram.ui.ActionBar.n2) uq0Var).parentLayout;
            c5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        uq0Var.K.d1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f36165a.L.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f36165a.X && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.f21331w.b(t5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        Object obj;
        uq0 uq0Var = this.f36165a;
        MediaController.AlbumEntry albumEntry = uq0Var.J;
        if (albumEntry != null) {
            obj = Integer.valueOf(albumEntry.photos.get(i10).imageId);
        } else {
            obj = ((MediaController.SearchImage) uq0Var.f38175f.get(i10)).f15571id;
        }
        return uq0Var.f38169b.containsKey(obj);
    }
}
