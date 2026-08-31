package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class dq0 implements org.telegram.ui.Components.vl0 {
    public final hq0 f36290a;

    public dq0(hq0 hq0Var) {
        this.f36290a = hq0Var;
    }

    @Override
    public final void a(boolean z4) {
        org.telegram.ui.ActionBar.f5 f5Var;
        hq0 hq0Var = this.f36290a;
        hq0Var.T = z4 ? 1 : 0;
        if (z4) {
            f5Var = ((org.telegram.ui.ActionBar.p2) hq0Var).parentLayout;
            f5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        hq0Var.H.d1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f36290a.I.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z4) {
        if (z4 == this.f36290a.U && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.f24157w.b(t5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        Object obj;
        hq0 hq0Var = this.f36290a;
        MediaController.AlbumEntry albumEntry = hq0Var.G;
        if (albumEntry != null) {
            obj = Integer.valueOf(albumEntry.photos.get(i10).imageId);
        } else {
            obj = ((MediaController.SearchImage) hq0Var.f37580f.get(i10)).f18049id;
        }
        return hq0Var.f37573b.containsKey(obj);
    }
}
