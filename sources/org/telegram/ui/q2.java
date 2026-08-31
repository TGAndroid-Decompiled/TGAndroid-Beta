package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class q2 extends m2.a {
    public final s2 f40323c;

    public q2(s2 s2Var) {
        this.f40323c = s2Var;
    }

    @Override
    public final void a(m2.h hVar, Object obj) {
        hVar.removeView(((p2) obj).f39899b);
    }

    @Override
    public final int b() {
        TL_iv.pageBlockSlideshow pageblockslideshow = this.f40323c.d;
        if (pageblockslideshow == null) {
            return 0;
        }
        return pageblockslideshow.items.size();
    }

    @Override
    public final int c(Object obj) {
        if (this.f40323c.d.items.contains(((p2) obj).f39898a)) {
            return -1;
        }
        return -2;
    }

    @Override
    public final Object e(m2.h hVar, int i10) {
        z2 z2Var;
        s2 s2Var = this.f40323c;
        j4 j4Var = s2Var.f41115w;
        l4 l4Var = s2Var.f41116x;
        TL_iv.PageBlock pageBlock = s2Var.d.items.get(i10);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            e2 e2Var = new e2(s2Var.getContext(), l4Var, j4Var, 1);
            e2Var.a((TL_iv.pageBlockPhoto) pageBlock, j4Var.B.cached_page, false, true);
            z2Var = e2Var;
        } else {
            z2 z2Var2 = new z2(s2Var.getContext(), l4Var, j4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            z2Var2.b(pageblockvideo, (a3) l4Var.f39618y.f(pageblockvideo.video_id), false, true);
            z2Var = z2Var2;
        }
        hVar.addView(z2Var);
        ?? obj = new Object();
        obj.f39899b = z2Var;
        obj.f39898a = pageBlock;
        return obj;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (((p2) obj).f39899b == view) {
            return true;
        }
        return false;
    }
}
