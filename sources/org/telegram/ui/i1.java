package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;
public final class i1 extends f2.p0 {
    public final l1 f37521c;

    public i1(l1 l1Var) {
        this.f37521c = l1Var;
    }

    @Override
    public final int h() {
        TL_iv.pageBlockCollage pageblockcollage = this.f37521c.f38461s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList<TL_iv.PageBlock> arrayList = this.f37521c.f38461s.items;
        if (!(arrayList.get((arrayList.size() - i10) - 1) instanceof TL_iv.pageBlockPhoto)) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        l1 l1Var = this.f37521c;
        k1 k1Var = l1Var.v;
        ArrayList<TL_iv.PageBlock> arrayList = l1Var.f38461s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i10) - 1);
        int i11 = m1Var.f5879f;
        View view = m1Var.f5875a;
        if (i11 != 0) {
            z2 z2Var = (z2) view;
            z2Var.Q = (MessageObject.GroupedMessagePosition) k1Var.f38157b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            z2Var.b(pageblockvideo, (a3) l1Var.f38463x.f39563y.f(pageblockvideo.video_id), false, true);
            return;
        }
        e2 e2Var = (e2) view;
        e2Var.O = (MessageObject.GroupedMessagePosition) k1Var.f38157b.get(pageBlock);
        e2Var.a((TL_iv.pageBlockPhoto) pageBlock, l1Var.f38462w.B.cached_page, false, true);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View e2Var;
        l1 l1Var = this.f37521c;
        if (i10 != 0) {
            e2Var = new z2(l1Var.getContext(), l1Var.f38463x, l1Var.f38462w, 2);
        } else {
            e2Var = new e2(l1Var.getContext(), l1Var.f38463x, l1Var.f38462w, 2);
        }
        return new f2.m1(e2Var);
    }
}
