package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class eq0 implements org.telegram.ui.Components.km0 {
    public final jq0 f36762a;

    public eq0(jq0 jq0Var) {
        this.f36762a = jq0Var;
    }

    @Override
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        jq0 jq0Var = this.f36762a;
        jq0Var.W = z10 ? 1 : 0;
        if (z10) {
            d5Var = ((org.telegram.ui.ActionBar.n2) jq0Var).parentLayout;
            d5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        jq0Var.K.d1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f36762a.L.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f36762a.X && (view instanceof org.telegram.ui.Cells.s5)) {
            org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
            s5Var.f23013w.c(s5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        Object obj;
        jq0 jq0Var = this.f36762a;
        MediaController.AlbumEntry albumEntry = jq0Var.J;
        if (albumEntry != null) {
            obj = Integer.valueOf(albumEntry.photos.get(i10).imageId);
        } else {
            obj = ((MediaController.SearchImage) jq0Var.f38312f.get(i10)).f17793id;
        }
        return jq0Var.f38306b.containsKey(obj);
    }
}
