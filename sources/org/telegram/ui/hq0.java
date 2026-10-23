package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class hq0 implements org.telegram.ui.Components.nm0 {
    public final mq0 f37909a;

    public hq0(mq0 mq0Var) {
        this.f37909a = mq0Var;
    }

    @Override
    public final void a(boolean z10) {
        org.telegram.ui.ActionBar.h5 h5Var;
        mq0 mq0Var = this.f37909a;
        mq0Var.W = z10 ? 1 : 0;
        if (z10) {
            h5Var = ((org.telegram.ui.ActionBar.o2) mq0Var).parentLayout;
            h5Var.getView().requestDisallowInterceptTouchEvent(true);
        }
        mq0Var.K.e1(true);
    }

    @Override
    public final boolean b(int i10) {
        if (this.f37909a.L.j(i10) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(View view, boolean z10) {
        if (z10 == this.f37909a.X && (view instanceof org.telegram.ui.Cells.s5)) {
            org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
            s5Var.f23254w.b(s5Var);
        }
    }

    @Override
    public final boolean d(int i10) {
        Object obj;
        mq0 mq0Var = this.f37909a;
        MediaController.AlbumEntry albumEntry = mq0Var.J;
        if (albumEntry != null) {
            obj = Integer.valueOf(albumEntry.photos.get(i10).imageId);
        } else {
            obj = ((MediaController.SearchImage) mq0Var.f39651f.get(i10)).f17856id;
        }
        return mq0Var.f39645b.containsKey(obj);
    }
}
