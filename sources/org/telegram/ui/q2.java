package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class q2 extends z4.a {
    public final s2 f39328c;

    public q2(s2 s2Var) {
        this.f39328c = s2Var;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView(((p2) obj).f39105b);
    }

    @Override
    public final int b() {
        TL_iv.pageBlockSlideshow pageblockslideshow = this.f39328c.d;
        if (pageblockslideshow == null) {
            return 0;
        }
        return pageblockslideshow.items.size();
    }

    @Override
    public final int c(Object obj) {
        if (this.f39328c.d.items.contains(((p2) obj).f39104a)) {
            return -1;
        }
        return -2;
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        z2 z2Var;
        s2 s2Var = this.f39328c;
        i4 i4Var = s2Var.f39938w;
        k4 k4Var = s2Var.f39939x;
        TL_iv.PageBlock pageBlock = s2Var.d.items.get(i10);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            f2 f2Var = new f2(s2Var.getContext(), k4Var, i4Var, 1);
            f2Var.a((TL_iv.pageBlockPhoto) pageBlock, i4Var.E.cached_page, false, true);
            z2Var = f2Var;
        } else {
            z2 z2Var2 = new z2(s2Var.getContext(), k4Var, i4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            z2Var2.b(pageblockvideo, (a3) k4Var.f42509y.f(pageblockvideo.video_id), false, true);
            z2Var = z2Var2;
        }
        gVar.addView(z2Var);
        ?? obj = new Object();
        obj.f39105b = z2Var;
        obj.f39104a = pageBlock;
        return obj;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (((p2) obj).f39105b == view) {
            return true;
        }
        return false;
    }
}
