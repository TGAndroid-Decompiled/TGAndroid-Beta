package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class ar0 implements org.telegram.ui.Components.nm0 {
    public final fr0 f34076a;

    public ar0(fr0 fr0Var) {
        this.f34076a = fr0Var;
    }

    @Override
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        fr0 fr0Var = this.f34076a;
        fr0Var.W = z10 ? 1 : 0;
        if (z10) {
            b5Var = ((org.telegram.ui.ActionBar.m2) fr0Var).parentLayout;
            b5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        fr0Var.K.d1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f34076a.L.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f34076a.X && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.f21787w.c(t5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        Object obj;
        fr0 fr0Var = this.f34076a;
        MediaController.AlbumEntry albumEntry = fr0Var.J;
        if (albumEntry != null) {
            obj = Integer.valueOf(albumEntry.photos.get(i10).imageId);
        } else {
            obj = ((MediaController.SearchImage) fr0Var.f35919f.get(i10)).f16394id;
        }
        return fr0Var.f35913b.containsKey(obj);
    }
}
