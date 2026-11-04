package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class n2 extends b5.a {
    public final p2 f47853c;

    public n2(p2 p2Var) {
        this.f47853c = p2Var;
    }

    @Override
    public final void a(b5.l lVar, Object obj) {
        lVar.removeView(((m2) obj).f47485b);
    }

    @Override
    public final int b() {
        TL_iv.pageBlockSlideshow pageblockslideshow = this.f47853c.f48414e;
        if (pageblockslideshow == null) {
            return 0;
        }
        return pageblockslideshow.items.size();
    }

    @Override
    public final int c(Object obj) {
        if (this.f47853c.f48414e.items.contains(((m2) obj).f47484a)) {
            return -1;
        }
        return -2;
    }

    @Override
    public final Object e(b5.l lVar, int i3) {
        w2 w2Var;
        p2 p2Var = this.f47853c;
        g4 g4Var = p2Var.f48421y;
        i4 i4Var = p2Var.E;
        TL_iv.PageBlock pageBlock = p2Var.f48414e.items.get(i3);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            b2 b2Var = new b2(p2Var.getContext(), i4Var, g4Var, 1);
            b2Var.a((TL_iv.pageBlockPhoto) pageBlock, g4Var.F.cached_page, false, true);
            w2Var = b2Var;
        } else {
            w2 w2Var2 = new w2(p2Var.getContext(), i4Var, g4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            w2Var2.b(pageblockvideo, (x2) i4Var.E.f(pageblockvideo.video_id), false, true);
            w2Var = w2Var2;
        }
        lVar.addView(w2Var);
        ?? obj = new Object();
        obj.f47485b = w2Var;
        obj.f47484a = pageBlock;
        return obj;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (((m2) obj).f47485b == view) {
            return true;
        }
        return false;
    }
}
