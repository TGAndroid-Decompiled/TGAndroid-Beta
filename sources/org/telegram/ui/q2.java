package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;
public final class q2 extends m2.a {
    public final s2 f37576c;

    public q2(s2 s2Var) {
        this.f37576c = s2Var;
    }

    @Override
    public final void a(m2.h hVar, Object obj) {
        hVar.removeView(((p2) obj).f37153b);
    }

    @Override
    public final int b() {
        TL_iv.pageBlockSlideshow pageblockslideshow = this.f37576c.d;
        if (pageblockslideshow == null) {
            return 0;
        }
        return pageblockslideshow.items.size();
    }

    @Override
    public final int c(Object obj) {
        if (this.f37576c.d.items.contains(((p2) obj).f37152a)) {
            return -1;
        }
        return -2;
    }

    @Override
    public final Object e(m2.h hVar, int i10) {
        z2 z2Var;
        s2 s2Var = this.f37576c;
        j4 j4Var = s2Var.f38179w;
        l4 l4Var = s2Var.f38180x;
        TL_iv.PageBlock pageBlock = s2Var.d.items.get(i10);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            e2 e2Var = new e2(s2Var.getContext(), l4Var, j4Var, 1);
            e2Var.a((TL_iv.pageBlockPhoto) pageBlock, j4Var.B.cached_page, false, true);
            z2Var = e2Var;
        } else {
            z2 z2Var2 = new z2(s2Var.getContext(), l4Var, j4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            z2Var2.b(pageblockvideo, (a3) l4Var.f36484y.f(pageblockvideo.video_id), false, true);
            z2Var = z2Var2;
        }
        hVar.addView(z2Var);
        ?? obj = new Object();
        obj.f37153b = z2Var;
        obj.f37152a = pageBlock;
        return obj;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (((p2) obj).f37153b == view) {
            return true;
        }
        return false;
    }
}
