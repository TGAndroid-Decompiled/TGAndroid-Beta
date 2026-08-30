package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class bq0 implements org.telegram.ui.Components.ul0 {
    public final fq0 f33016a;

    public bq0(fq0 fq0Var) {
        this.f33016a = fq0Var;
    }

    @Override
    public final void a(boolean z4) {
        org.telegram.ui.ActionBar.e5 e5Var;
        fq0 fq0Var = this.f33016a;
        fq0Var.T = z4 ? 1 : 0;
        if (z4) {
            e5Var = ((org.telegram.ui.ActionBar.p2) fq0Var).parentLayout;
            e5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        fq0Var.H.d1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f33016a.I.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z4) {
        if (z4 == this.f33016a.U && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.f22354w.b(t5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        Object obj;
        fq0 fq0Var = this.f33016a;
        MediaController.AlbumEntry albumEntry = fq0Var.G;
        if (albumEntry != null) {
            obj = Integer.valueOf(albumEntry.photos.get(i10).imageId);
        } else {
            obj = ((MediaController.SearchImage) fq0Var.f34321f.get(i10)).f16663id;
        }
        return fq0Var.f34315b.containsKey(obj);
    }
}
