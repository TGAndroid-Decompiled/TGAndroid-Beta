package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class p2 extends z4.a {
    public final r2 f36302c;

    public p2(r2 r2Var) {
        this.f36302c = r2Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView(((o2) obj).f36124b);
    }

    @Override
    public final int b() {
        TL_iv.pageBlockSlideshow pageblockslideshow = this.f36302c.d;
        if (pageblockslideshow == null) {
            return 0;
        }
        return pageblockslideshow.items.size();
    }

    @Override
    public final int c(Object obj) {
        if (this.f36302c.d.items.contains(((o2) obj).f36123a)) {
            return -1;
        }
        return -2;
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        y2 y2Var;
        r2 r2Var = this.f36302c;
        h4 h4Var = r2Var.f36957w;
        j4 j4Var = r2Var.f36958x;
        TL_iv.PageBlock pageBlock = r2Var.d.items.get(i10);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            e2 e2Var = new e2(r2Var.getContext(), j4Var, h4Var, 1);
            e2Var.a((TL_iv.pageBlockPhoto) pageBlock, h4Var.E.cached_page, false, true);
            y2Var = e2Var;
        } else {
            y2 y2Var2 = new y2(r2Var.getContext(), j4Var, h4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            y2Var2.b(pageblockvideo, (z2) j4Var.f37328y.f(pageblockvideo.video_id), false, true);
            y2Var = y2Var2;
        }
        gVar.addView(y2Var);
        ?? obj = new Object();
        obj.f36124b = y2Var;
        obj.f36123a = pageBlock;
        return obj;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (((o2) obj).f36124b == view) {
            return true;
        }
        return false;
    }
}
