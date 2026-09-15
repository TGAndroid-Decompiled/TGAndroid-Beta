package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class n2 extends z4.a {
    public final p2 f35870c;

    public n2(p2 p2Var) {
        this.f35870c = p2Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView(((m2) obj).f35616b);
    }

    @Override
    public final int b() {
        TL_iv.pageBlockSlideshow pageblockslideshow = this.f35870c.d;
        if (pageblockslideshow == null) {
            return 0;
        }
        return pageblockslideshow.items.size();
    }

    @Override
    public final int c(Object obj) {
        if (this.f35870c.d.items.contains(((m2) obj).f35615a)) {
            return -1;
        }
        return -2;
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        w2 w2Var;
        p2 p2Var = this.f35870c;
        f4 f4Var = p2Var.f36397w;
        h4 h4Var = p2Var.f36398x;
        TL_iv.PageBlock pageBlock = p2Var.d.items.get(i10);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            c2 c2Var = new c2(p2Var.getContext(), h4Var, f4Var, 1);
            c2Var.a((TL_iv.pageBlockPhoto) pageBlock, f4Var.E.cached_page, false, true);
            w2Var = c2Var;
        } else {
            w2 w2Var2 = new w2(p2Var.getContext(), h4Var, f4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            w2Var2.b(pageblockvideo, (x2) h4Var.f37882y.f(pageblockvideo.video_id), false, true);
            w2Var = w2Var2;
        }
        gVar.addView(w2Var);
        ?? obj = new Object();
        obj.f35616b = w2Var;
        obj.f35615a = pageBlock;
        return obj;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (((m2) obj).f35616b == view) {
            return true;
        }
        return false;
    }
}
