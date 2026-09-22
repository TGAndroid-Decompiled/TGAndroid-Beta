package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;
public final class g1 extends s4.h0 {
    public final j1 f33805c;

    public g1(j1 j1Var) {
        this.f33805c = j1Var;
    }

    @Override
    public final int h() {
        TL_iv.pageBlockCollage pageblockcollage = this.f33805c.f34753s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList<TL_iv.PageBlock> arrayList = this.f33805c.f34753s.items;
        if (!(arrayList.get((arrayList.size() - i10) - 1) instanceof TL_iv.pageBlockPhoto)) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        j1 j1Var = this.f33805c;
        i1 i1Var = j1Var.v;
        ArrayList<TL_iv.PageBlock> arrayList = j1Var.f34753s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i10) - 1);
        int i11 = c1Var.f42998f;
        View view = c1Var.f42995a;
        if (i11 != 0) {
            w2 w2Var = (w2) view;
            w2Var.T = (MessageObject.GroupedMessagePosition) i1Var.f34350b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            w2Var.b(pageblockvideo, (x2) j1Var.f34755x.f37989y.f(pageblockvideo.video_id), false, true);
            return;
        }
        c2 c2Var = (c2) view;
        c2Var.R = (MessageObject.GroupedMessagePosition) i1Var.f34350b.get(pageBlock);
        c2Var.a((TL_iv.pageBlockPhoto) pageBlock, j1Var.f34754w.E.cached_page, false, true);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View c2Var;
        j1 j1Var = this.f33805c;
        if (i10 != 0) {
            c2Var = new w2(j1Var.getContext(), j1Var.f34755x, j1Var.f34754w, 2);
        } else {
            c2Var = new c2(j1Var.getContext(), j1Var.f34755x, j1Var.f34754w, 2);
        }
        return new s4.c1(c2Var);
    }
}
