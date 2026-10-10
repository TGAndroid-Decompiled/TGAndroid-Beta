package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;
public final class h1 extends s4.i0 {
    public final k1 f38225c;

    public h1(k1 k1Var) {
        this.f38225c = k1Var;
    }

    @Override
    public final int h() {
        TL_iv.pageBlockCollage pageblockcollage = this.f38225c.f39106s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList<TL_iv.PageBlock> arrayList = this.f38225c.f39106s.items;
        if (!(arrayList.get((arrayList.size() - i10) - 1) instanceof TL_iv.pageBlockPhoto)) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        k1 k1Var = this.f38225c;
        j1 j1Var = k1Var.v;
        ArrayList<TL_iv.PageBlock> arrayList = k1Var.f39106s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i10) - 1);
        int i11 = d1Var.f47706f;
        View view = d1Var.f47702a;
        if (i11 != 0) {
            x2 x2Var = (x2) view;
            x2Var.T = (MessageObject.GroupedMessagePosition) j1Var.f38844b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            x2Var.b(pageblockvideo, (y2) k1Var.f39108x.f41938y.f(pageblockvideo.video_id), false, true);
            return;
        }
        d2 d2Var = (d2) view;
        d2Var.R = (MessageObject.GroupedMessagePosition) j1Var.f38844b.get(pageBlock);
        d2Var.a((TL_iv.pageBlockPhoto) pageBlock, k1Var.f39107w.E.cached_page, false, true);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View d2Var;
        k1 k1Var = this.f38225c;
        if (i10 != 0) {
            d2Var = new x2(k1Var.getContext(), k1Var.f39108x, k1Var.f39107w, 2);
        } else {
            d2Var = new d2(k1Var.getContext(), k1Var.f39108x, k1Var.f39107w, 2);
        }
        return new s4.d1(d2Var);
    }
}
