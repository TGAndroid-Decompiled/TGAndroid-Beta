package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class g1 extends s4.g0 {
    public final j1 f37268c;

    public g1(j1 j1Var) {
        this.f37268c = j1Var;
    }

    @Override
    public final int b() {
        TL_iv.pageBlockCollage pageblockcollage = this.f37268c.f38247s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override
    public final int d(int i10) {
        ArrayList<TL_iv.PageBlock> arrayList = this.f37268c.f38247s.items;
        if (!(arrayList.get((arrayList.size() - i10) - 1) instanceof TL_iv.pageBlockPhoto)) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        j1 j1Var = this.f37268c;
        i1 i1Var = j1Var.f38248w;
        ArrayList<TL_iv.PageBlock> arrayList = j1Var.f38247s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i10) - 1);
        int i11 = c1Var.f47912f;
        View view = c1Var.f47909a;
        if (i11 != 0) {
            v2 v2Var = (v2) view;
            v2Var.T = (org.telegram.messenger.cj) i1Var.f37922b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            v2Var.b(pageblockvideo, (w2) j1Var.f38250y.D.f(pageblockvideo.video_id), false, true);
            return;
        }
        b2 b2Var = (b2) view;
        b2Var.R = (org.telegram.messenger.cj) i1Var.f37922b.get(pageBlock);
        b2Var.a((TL_iv.pageBlockPhoto) pageBlock, j1Var.f38249x.E.cached_page, false, true);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View b2Var;
        j1 j1Var = this.f37268c;
        if (i10 != 0) {
            b2Var = new v2(j1Var.getContext(), j1Var.f38250y, j1Var.f38249x, 2);
        } else {
            b2Var = new b2(j1Var.getContext(), j1Var.f38250y, j1Var.f38249x, 2);
        }
        return new s4.c1(b2Var);
    }
}
