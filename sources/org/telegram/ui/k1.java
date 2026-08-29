package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;
public final class k1 extends f2.p0 {
    public final n1 f39726c;

    public k1(n1 n1Var) {
        this.f39726c = n1Var;
    }

    @Override
    public final int h() {
        TL_iv.pageBlockCollage pageblockcollage = this.f39726c.f40682s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList<TL_iv.PageBlock> arrayList = this.f39726c.f40682s.items;
        if (!(arrayList.get((arrayList.size() - i10) - 1) instanceof TL_iv.pageBlockPhoto)) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        n1 n1Var2 = this.f39726c;
        m1 m1Var = n1Var2.v;
        ArrayList<TL_iv.PageBlock> arrayList = n1Var2.f40682s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i10) - 1);
        int i11 = n1Var.f6436f;
        View view = n1Var.f6432a;
        if (i11 != 0) {
            b3 b3Var = (b3) view;
            b3Var.P = (MessageObject.GroupedMessagePosition) m1Var.f40338b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            b3Var.b(pageblockvideo, (c3) n1Var2.f40684x.f37389y.f(pageblockvideo.video_id), false, true);
            return;
        }
        g2 g2Var = (g2) view;
        g2Var.N = (MessageObject.GroupedMessagePosition) m1Var.f40338b.get(pageBlock);
        g2Var.a((TL_iv.pageBlockPhoto) pageBlock, n1Var2.f40683w.A.cached_page, false, true);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View g2Var;
        n1 n1Var = this.f39726c;
        if (i10 != 0) {
            g2Var = new b3(n1Var.getContext(), n1Var.f40684x, n1Var.f40683w, 2);
        } else {
            g2Var = new g2(n1Var.getContext(), n1Var.f40684x, n1Var.f40683w, 2);
        }
        return new f2.n1(g2Var);
    }
}
