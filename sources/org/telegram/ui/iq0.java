package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class iq0 implements org.telegram.ui.Components.tl0 {
    public final mq0 f35017a;

    public iq0(mq0 mq0Var) {
        this.f35017a = mq0Var;
    }

    @Override
    public final void a(boolean z4) {
        org.telegram.ui.ActionBar.e5 e5Var;
        mq0 mq0Var = this.f35017a;
        mq0Var.T = z4 ? 1 : 0;
        if (z4) {
            e5Var = ((org.telegram.ui.ActionBar.p2) mq0Var).parentLayout;
            e5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        mq0Var.H.c1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f35017a.I.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z4) {
        if (z4 == this.f35017a.U && (view instanceof org.telegram.ui.Cells.s5)) {
            org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
            s5Var.f22291w.b(s5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        Object obj;
        mq0 mq0Var = this.f35017a;
        MediaController.AlbumEntry albumEntry = mq0Var.G;
        if (albumEntry != null) {
            obj = Integer.valueOf(albumEntry.photos.get(i10).imageId);
        } else {
            obj = ((MediaController.SearchImage) mq0Var.f36169f.get(i10)).f16643id;
        }
        return mq0Var.f36163b.containsKey(obj);
    }
}
