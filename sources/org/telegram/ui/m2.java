package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class m2 extends z4.a {
    public final o2 f39457c;

    public m2(o2 o2Var) {
        this.f39457c = o2Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView(((l2) obj).f39027b);
    }

    @Override
    public final int b() {
        TL_iv.pageBlockSlideshow pageblockslideshow = this.f39457c.e;
        if (pageblockslideshow == null) {
            return 0;
        }
        return pageblockslideshow.items.size();
    }

    @Override
    public final int c(Object obj) {
        if (this.f39457c.e.items.contains(((l2) obj).f39026a)) {
            return -1;
        }
        return -2;
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        v2 v2Var;
        o2 o2Var = this.f39457c;
        f4 f4Var = o2Var.f40116y;
        h4 h4Var = o2Var.D;
        TL_iv.PageBlock pageBlock = o2Var.e.items.get(i10);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            b2 b2Var = new b2(o2Var.getContext(), h4Var, f4Var, 1);
            b2Var.a((TL_iv.pageBlockPhoto) pageBlock, f4Var.E.cached_page, false, true);
            v2Var = b2Var;
        } else {
            v2 v2Var2 = new v2(o2Var.getContext(), h4Var, f4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            v2Var2.b(pageblockvideo, (w2) h4Var.D.f(pageblockvideo.video_id), false, true);
            v2Var = v2Var2;
        }
        gVar.addView(v2Var);
        ?? obj = new Object();
        obj.f39027b = v2Var;
        obj.f39026a = pageBlock;
        return obj;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (((l2) obj).f39027b == view) {
            return true;
        }
        return false;
    }
}
