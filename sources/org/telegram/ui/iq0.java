package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class iq0 implements org.telegram.ui.Components.ul0 {
    public final mq0 f37764a;

    public iq0(mq0 mq0Var) {
        this.f37764a = mq0Var;
    }

    @Override
    public final void a(boolean z4) {
        org.telegram.ui.ActionBar.f5 f5Var;
        mq0 mq0Var = this.f37764a;
        mq0Var.T = z4 ? 1 : 0;
        if (z4) {
            f5Var = ((org.telegram.ui.ActionBar.p2) mq0Var).parentLayout;
            f5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        mq0Var.H.c1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f37764a.I.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z4) {
        if (z4 == this.f37764a.U && (view instanceof org.telegram.ui.Cells.t5)) {
            org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
            t5Var.f24159w.b(t5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        Object obj;
        mq0 mq0Var = this.f37764a;
        MediaController.AlbumEntry albumEntry = mq0Var.G;
        if (albumEntry != null) {
            obj = Integer.valueOf(albumEntry.photos.get(i10).imageId);
        } else {
            obj = ((MediaController.SearchImage) mq0Var.f39040f.get(i10)).f18051id;
        }
        return mq0Var.f39033b.containsKey(obj);
    }
}
