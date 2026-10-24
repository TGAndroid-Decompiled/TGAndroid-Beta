package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class p2 extends z4.a {
    public final r2 f40313c;

    public p2(r2 r2Var) {
        this.f40313c = r2Var;
    }

    @Override
    public final void a(z4.h hVar, Object obj) {
        hVar.removeView(((o2) obj).f40061b);
    }

    @Override
    public final int b() {
        TL_iv.pageBlockSlideshow pageblockslideshow = this.f40313c.e;
        if (pageblockslideshow == null) {
            return 0;
        }
        return pageblockslideshow.items.size();
    }

    @Override
    public final int c(Object obj) {
        if (this.f40313c.e.items.contains(((o2) obj).f40060a)) {
            return -1;
        }
        return -2;
    }

    @Override
    public final Object e(z4.h hVar, int i10) {
        y2 y2Var;
        r2 r2Var = this.f40313c;
        i4 i4Var = r2Var.f40988x;
        k4 k4Var = r2Var.f40989y;
        TL_iv.PageBlock pageBlock = r2Var.e.items.get(i10);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            e2 e2Var = new e2(r2Var.getContext(), k4Var, i4Var, 1);
            e2Var.a((TL_iv.pageBlockPhoto) pageBlock, i4Var.E.cached_page, false, true);
            y2Var = e2Var;
        } else {
            y2 y2Var2 = new y2(r2Var.getContext(), k4Var, i4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            y2Var2.b(pageblockvideo, (z2) k4Var.f37223y.f(pageblockvideo.video_id), false, true);
            y2Var = y2Var2;
        }
        hVar.addView(y2Var);
        ?? obj = new Object();
        obj.f40061b = y2Var;
        obj.f40060a = pageBlock;
        return obj;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (((o2) obj).f40061b == view) {
            return true;
        }
        return false;
    }
}
