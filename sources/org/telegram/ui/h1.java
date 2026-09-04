package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;
public final class h1 extends s4.h0 {
    public final k1 f36850c;

    public h1(k1 k1Var) {
        this.f36850c = k1Var;
    }

    @Override
    public final int h() {
        TL_iv.pageBlockCollage pageblockcollage = this.f36850c.f37884s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList<TL_iv.PageBlock> arrayList = this.f36850c.f37884s.items;
        if (!(arrayList.get((arrayList.size() - i10) - 1) instanceof TL_iv.pageBlockPhoto)) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        k1 k1Var = this.f36850c;
        j1 j1Var = k1Var.v;
        ArrayList<TL_iv.PageBlock> arrayList = k1Var.f37884s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i10) - 1);
        int i11 = c1Var.f45742f;
        View view = c1Var.f45738a;
        if (i11 != 0) {
            x2 x2Var = (x2) view;
            x2Var.T = (MessageObject.GroupedMessagePosition) j1Var.f37476b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            x2Var.b(pageblockvideo, (y2) k1Var.f37886x.f41443y.f(pageblockvideo.video_id), false, true);
            return;
        }
        d2 d2Var = (d2) view;
        d2Var.R = (MessageObject.GroupedMessagePosition) j1Var.f37476b.get(pageBlock);
        d2Var.a((TL_iv.pageBlockPhoto) pageBlock, k1Var.f37885w.E.cached_page, false, true);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View d2Var;
        k1 k1Var = this.f36850c;
        if (i10 != 0) {
            d2Var = new x2(k1Var.getContext(), k1Var.f37886x, k1Var.f37885w, 2);
        } else {
            d2Var = new d2(k1Var.getContext(), k1Var.f37886x, k1Var.f37885w, 2);
        }
        return new s4.c1(d2Var);
    }
}
