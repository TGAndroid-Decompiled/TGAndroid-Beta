package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class o2 extends z4.a {
    public final q2 f39086c;

    public o2(q2 q2Var) {
        this.f39086c = q2Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView(((n2) obj).f38814b);
    }

    @Override
    public final int b() {
        TL_iv.pageBlockSlideshow pageblockslideshow = this.f39086c.d;
        if (pageblockslideshow == null) {
            return 0;
        }
        return pageblockslideshow.items.size();
    }

    @Override
    public final int c(Object obj) {
        if (this.f39086c.d.items.contains(((n2) obj).f38813a)) {
            return -1;
        }
        return -2;
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        x2 x2Var;
        q2 q2Var = this.f39086c;
        g4 g4Var = q2Var.f39679w;
        i4 i4Var = q2Var.f39680x;
        TL_iv.PageBlock pageBlock = q2Var.d.items.get(i10);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            d2 d2Var = new d2(q2Var.getContext(), i4Var, g4Var, 1);
            d2Var.a((TL_iv.pageBlockPhoto) pageBlock, g4Var.E.cached_page, false, true);
            x2Var = d2Var;
        } else {
            x2 x2Var2 = new x2(q2Var.getContext(), i4Var, g4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            x2Var2.b(pageblockvideo, (y2) i4Var.f41443y.f(pageblockvideo.video_id), false, true);
            x2Var = x2Var2;
        }
        gVar.addView(x2Var);
        ?? obj = new Object();
        obj.f38814b = x2Var;
        obj.f38813a = pageBlock;
        return obj;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (((n2) obj).f38814b == view) {
            return true;
        }
        return false;
    }
}
