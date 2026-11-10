package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class e1 extends v4.g0 {
    public final h1 f45090c;

    public e1(h1 h1Var) {
        this.f45090c = h1Var;
    }

    @Override
    public final int b() {
        TL_iv.pageBlockCollage pageblockcollage = this.f45090c.f46198s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override
    public final int d(int i7) {
        ArrayList<TL_iv.PageBlock> arrayList = this.f45090c.f46198s.items;
        if (!(arrayList.get((arrayList.size() - i7) - 1) instanceof TL_iv.pageBlockPhoto)) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        h1 h1Var = this.f45090c;
        g1 g1Var = h1Var.f46199w;
        ArrayList<TL_iv.PageBlock> arrayList = h1Var.f46198s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i7) - 1);
        int i10 = d1Var.f57056f;
        View view = d1Var.f57052a;
        if (i10 != 0) {
            v2 v2Var = (v2) view;
            v2Var.T = (org.telegram.messenger.aj) g1Var.f45903b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            v2Var.b(pageblockvideo, (w2) h1Var.f46201y.D.f(pageblockvideo.video_id), false, true);
            return;
        }
        a2 a2Var = (a2) view;
        a2Var.R = (org.telegram.messenger.aj) g1Var.f45903b.get(pageBlock);
        a2Var.a((TL_iv.pageBlockPhoto) pageBlock, h1Var.f46200x.E.cached_page, false, true);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View a2Var;
        h1 h1Var = this.f45090c;
        if (i7 != 0) {
            a2Var = new v2(h1Var.getContext(), h1Var.f46201y, h1Var.f46200x, 2);
        } else {
            a2Var = new a2(h1Var.getContext(), h1Var.f46201y, h1Var.f46200x, 2);
        }
        return new v4.d1(a2Var);
    }
}
