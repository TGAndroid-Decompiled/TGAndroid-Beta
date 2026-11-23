package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class e1 extends v4.i0 {
    public final h1 f47103c;

    public e1(h1 h1Var) {
        this.f47103c = h1Var;
    }

    @Override
    public final int b() {
        TL_iv.pageBlockCollage pageblockcollage = this.f47103c.f48201s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override
    public final int d(int i7) {
        ArrayList<TL_iv.PageBlock> arrayList = this.f47103c.f48201s.items;
        if (!(arrayList.get((arrayList.size() - i7) - 1) instanceof TL_iv.pageBlockPhoto)) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        h1 h1Var = this.f47103c;
        g1 g1Var = h1Var.f48202w;
        ArrayList<TL_iv.PageBlock> arrayList = h1Var.f48201s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i7) - 1);
        int i10 = f1Var.f59169f;
        View view = f1Var.f59165a;
        if (i10 != 0) {
            v2 v2Var = (v2) view;
            v2Var.U = (org.telegram.messenger.yi) g1Var.f47904b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            v2Var.b(pageblockvideo, (w2) h1Var.f48204y.E.f(pageblockvideo.video_id), false, true);
            return;
        }
        a2 a2Var = (a2) view;
        a2Var.S = (org.telegram.messenger.yi) g1Var.f47904b.get(pageBlock);
        a2Var.a((TL_iv.pageBlockPhoto) pageBlock, h1Var.f48203x.F.cached_page, false, true);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View a2Var;
        h1 h1Var = this.f47103c;
        if (i7 != 0) {
            a2Var = new v2(h1Var.getContext(), h1Var.f48204y, h1Var.f48203x, 2);
        } else {
            a2Var = new a2(h1Var.getContext(), h1Var.f48204y, h1Var.f48203x, 2);
        }
        return new v4.f1(a2Var);
    }
}
