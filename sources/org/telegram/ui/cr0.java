package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class cr0 implements org.telegram.ui.Components.nm0 {
    public final hr0 f35056a;

    public cr0(hr0 hr0Var) {
        this.f35056a = hr0Var;
    }

    @Override
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        hr0 hr0Var = this.f35056a;
        hr0Var.W = z10 ? 1 : 0;
        if (z10) {
            b5Var = ((org.telegram.ui.ActionBar.m2) hr0Var).parentLayout;
            b5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        hr0Var.K.d1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f35056a.L.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f35056a.X && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.f22092w.c(t5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        Object obj;
        hr0 hr0Var = this.f35056a;
        MediaController.AlbumEntry albumEntry = hr0Var.J;
        if (albumEntry != null) {
            obj = Integer.valueOf(albumEntry.photos.get(i10).imageId);
        } else {
            obj = ((MediaController.SearchImage) hr0Var.f36921f.get(i10)).f16702id;
        }
        return hr0Var.f36915b.containsKey(obj);
    }
}
