package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;
public final class k1 extends f2.o0 {
    public final n1 f35401c;

    public k1(n1 n1Var) {
        this.f35401c = n1Var;
    }

    @Override
    public final int h() {
        TL_iv.pageBlockCollage pageblockcollage = this.f35401c.f36305s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList<TL_iv.PageBlock> arrayList = this.f35401c.f36305s.items;
        if (!(arrayList.get((arrayList.size() - i10) - 1) instanceof TL_iv.pageBlockPhoto)) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        n1 n1Var = this.f35401c;
        m1 m1Var = n1Var.v;
        ArrayList<TL_iv.PageBlock> arrayList = n1Var.f36305s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i10) - 1);
        int i11 = l1Var.f5777f;
        View view = l1Var.f5774a;
        if (i11 != 0) {
            b3 b3Var = (b3) view;
            b3Var.Q = (MessageObject.GroupedMessagePosition) m1Var.f35951b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            b3Var.b(pageblockvideo, (c3) n1Var.f36307x.f36989y.f(pageblockvideo.video_id), false, true);
            return;
        }
        g2 g2Var = (g2) view;
        g2Var.O = (MessageObject.GroupedMessagePosition) m1Var.f35951b.get(pageBlock);
        g2Var.a((TL_iv.pageBlockPhoto) pageBlock, n1Var.f36306w.B.cached_page, false, true);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View g2Var;
        n1 n1Var = this.f35401c;
        if (i10 != 0) {
            g2Var = new b3(n1Var.getContext(), n1Var.f36307x, n1Var.f36306w, 2);
        } else {
            g2Var = new g2(n1Var.getContext(), n1Var.f36307x, n1Var.f36306w, 2);
        }
        return new f2.l1(g2Var);
    }
}
