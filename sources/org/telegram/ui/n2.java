package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class n2 extends a5.a {
    public final p2 f41615c;

    public n2(p2 p2Var) {
        this.f41615c = p2Var;
    }

    @Override
    public final void a(a5.m mVar, Object obj) {
        mVar.removeView(((m2) obj).f41304b);
    }

    @Override
    public final int b() {
        TL_iv.pageBlockSlideshow pageblockslideshow = this.f41615c.e;
        if (pageblockslideshow == null) {
            return 0;
        }
        return pageblockslideshow.items.size();
    }

    @Override
    public final int c(Object obj) {
        if (this.f41615c.e.items.contains(((m2) obj).f41303a)) {
            return -1;
        }
        return -2;
    }

    @Override
    public final Object e(a5.m mVar, int i10) {
        w2 w2Var;
        p2 p2Var = this.f41615c;
        h4 h4Var = p2Var.f42283x;
        j4 j4Var = p2Var.f42284y;
        TL_iv.PageBlock pageBlock = p2Var.e.items.get(i10);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            c2 c2Var = new c2(p2Var.getContext(), j4Var, h4Var, 1);
            c2Var.a((TL_iv.pageBlockPhoto) pageBlock, h4Var.E.cached_page, false, true);
            w2Var = c2Var;
        } else {
            w2 w2Var2 = new w2(p2Var.getContext(), j4Var, h4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            w2Var2.b(pageblockvideo, (x2) j4Var.f40457y.f(pageblockvideo.video_id), false, true);
            w2Var = w2Var2;
        }
        mVar.addView(w2Var);
        ?? obj = new Object();
        obj.f41304b = w2Var;
        obj.f41303a = pageBlock;
        return obj;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (((m2) obj).f41304b == view) {
            return true;
        }
        return false;
    }
}
