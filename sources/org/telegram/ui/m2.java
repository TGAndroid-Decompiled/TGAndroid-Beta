package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class m2 extends c5.a {
    public final o2 f47632c;

    public m2(o2 o2Var) {
        this.f47632c = o2Var;
    }

    @Override
    public final void a(c5.k kVar, Object obj) {
        kVar.removeView(((l2) obj).f47388b);
    }

    @Override
    public final int b() {
        TL_iv.pageBlockSlideshow pageblockslideshow = this.f47632c.f48212e;
        if (pageblockslideshow == null) {
            return 0;
        }
        return pageblockslideshow.items.size();
    }

    @Override
    public final int c(Object obj) {
        if (this.f47632c.f48212e.items.contains(((l2) obj).f47387a)) {
            return -1;
        }
        return -2;
    }

    @Override
    public final Object e(c5.k kVar, int i7) {
        v2 v2Var;
        o2 o2Var = this.f47632c;
        e4 e4Var = o2Var.f48219y;
        g4 g4Var = o2Var.D;
        TL_iv.PageBlock pageBlock = o2Var.f48212e.items.get(i7);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            a2 a2Var = new a2(o2Var.getContext(), g4Var, e4Var, 1);
            a2Var.a((TL_iv.pageBlockPhoto) pageBlock, e4Var.E.cached_page, false, true);
            v2Var = a2Var;
        } else {
            v2 v2Var2 = new v2(o2Var.getContext(), g4Var, e4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            v2Var2.b(pageblockvideo, (w2) g4Var.D.f(pageblockvideo.video_id), false, true);
            v2Var = v2Var2;
        }
        kVar.addView(v2Var);
        ?? obj = new Object();
        obj.f47388b = v2Var;
        obj.f47387a = pageBlock;
        return obj;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (((l2) obj).f47388b == view) {
            return true;
        }
        return false;
    }
}
