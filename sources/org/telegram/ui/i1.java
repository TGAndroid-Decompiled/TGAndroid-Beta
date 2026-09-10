package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;
public final class i1 extends s4.h0 {
    public final l1 f33511c;

    public i1(l1 l1Var) {
        this.f33511c = l1Var;
    }

    @Override
    public final int h() {
        TL_iv.pageBlockCollage pageblockcollage = this.f33511c.f34507s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList<TL_iv.PageBlock> arrayList = this.f33511c.f34507s.items;
        if (!(arrayList.get((arrayList.size() - i10) - 1) instanceof TL_iv.pageBlockPhoto)) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        l1 l1Var = this.f33511c;
        k1 k1Var = l1Var.v;
        ArrayList<TL_iv.PageBlock> arrayList = l1Var.f34507s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i10) - 1);
        int i11 = c1Var.f41613f;
        View view = c1Var.f41610a;
        if (i11 != 0) {
            y2 y2Var = (y2) view;
            y2Var.T = (MessageObject.GroupedMessagePosition) k1Var.f34187b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            y2Var.b(pageblockvideo, (z2) l1Var.f34509x.f36863y.f(pageblockvideo.video_id), false, true);
            return;
        }
        e2 e2Var = (e2) view;
        e2Var.R = (MessageObject.GroupedMessagePosition) k1Var.f34187b.get(pageBlock);
        e2Var.a((TL_iv.pageBlockPhoto) pageBlock, l1Var.f34508w.E.cached_page, false, true);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View e2Var;
        l1 l1Var = this.f33511c;
        if (i10 != 0) {
            e2Var = new y2(l1Var.getContext(), l1Var.f34509x, l1Var.f34508w, 2);
        } else {
            e2Var = new e2(l1Var.getContext(), l1Var.f34509x, l1Var.f34508w, 2);
        }
        return new s4.c1(e2Var);
    }
}
