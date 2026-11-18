package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class m2 extends c5.a {
    public final o2 f49693c;

    public m2(o2 o2Var) {
        this.f49693c = o2Var;
    }

    @Override
    public final void a(c5.l lVar, Object obj) {
        lVar.removeView(((l2) obj).f49410b);
    }

    @Override
    public final int b() {
        TL_iv.pageBlockSlideshow pageblockslideshow = this.f49693c.f50386e;
        if (pageblockslideshow == null) {
            return 0;
        }
        return pageblockslideshow.items.size();
    }

    @Override
    public final int c(Object obj) {
        if (this.f49693c.f50386e.items.contains(((l2) obj).f49409a)) {
            return -1;
        }
        return -2;
    }

    @Override
    public final Object e(c5.l lVar, int i7) {
        v2 v2Var;
        o2 o2Var = this.f49693c;
        e4 e4Var = o2Var.f50393y;
        g4 g4Var = o2Var.E;
        TL_iv.PageBlock pageBlock = o2Var.f50386e.items.get(i7);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            a2 a2Var = new a2(o2Var.getContext(), g4Var, e4Var, 1);
            a2Var.a((TL_iv.pageBlockPhoto) pageBlock, e4Var.F.cached_page, false, true);
            v2Var = a2Var;
        } else {
            v2 v2Var2 = new v2(o2Var.getContext(), g4Var, e4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            v2Var2.b(pageblockvideo, (w2) g4Var.E.f(pageblockvideo.video_id), false, true);
            v2Var = v2Var2;
        }
        lVar.addView(v2Var);
        ?? obj = new Object();
        obj.f49410b = v2Var;
        obj.f49409a = pageBlock;
        return obj;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (((l2) obj).f49410b == view) {
            return true;
        }
        return false;
    }
}
