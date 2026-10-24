package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;
public final class i1 extends s4.g0 {
    public final l1 f38091c;

    public i1(l1 l1Var) {
        this.f38091c = l1Var;
    }

    @Override
    public final int h() {
        TL_iv.pageBlockCollage pageblockcollage = this.f38091c.f39089s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList<TL_iv.PageBlock> arrayList = this.f38091c.f39089s.items;
        if (!(arrayList.get((arrayList.size() - i10) - 1) instanceof TL_iv.pageBlockPhoto)) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        l1 l1Var = this.f38091c;
        k1 k1Var = l1Var.v;
        ArrayList<TL_iv.PageBlock> arrayList = l1Var.f39089s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i10) - 1);
        int i11 = b1Var.f46345f;
        View view = b1Var.f46342a;
        if (i11 != 0) {
            y2 y2Var = (y2) view;
            y2Var.T = (MessageObject.GroupedMessagePosition) k1Var.f38715b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            y2Var.b(pageblockvideo, (z2) l1Var.f39091x.f37223y.f(pageblockvideo.video_id), false, true);
            return;
        }
        e2 e2Var = (e2) view;
        e2Var.R = (MessageObject.GroupedMessagePosition) k1Var.f38715b.get(pageBlock);
        e2Var.a((TL_iv.pageBlockPhoto) pageBlock, l1Var.f39090w.E.cached_page, false, true);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View e2Var;
        l1 l1Var = this.f38091c;
        if (i10 != 0) {
            e2Var = new y2(l1Var.getContext(), l1Var.f39091x, l1Var.f39090w, 2);
        } else {
            e2Var = new e2(l1Var.getContext(), l1Var.f39091x, l1Var.f39090w, 2);
        }
        return new s4.b1(e2Var);
    }
}
