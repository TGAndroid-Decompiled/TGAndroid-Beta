package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;
public final class j1 extends f2.r0 {
    public final m1 f39337c;

    public j1(m1 m1Var) {
        this.f39337c = m1Var;
    }

    @Override
    public final int h() {
        TL_iv.pageBlockCollage pageblockcollage = this.f39337c.f40291s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override
    public final int j(int i9) {
        ArrayList<TL_iv.PageBlock> arrayList = this.f39337c.f40291s.items;
        if (!(arrayList.get((arrayList.size() - i9) - 1) instanceof TL_iv.pageBlockPhoto)) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        m1 m1Var = this.f39337c;
        l1 l1Var = m1Var.v;
        ArrayList<TL_iv.PageBlock> arrayList = m1Var.f40291s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i9) - 1);
        int i10 = q1Var.f5505f;
        View view = q1Var.f5501a;
        if (i10 != 0) {
            a3 a3Var = (a3) view;
            a3Var.P = (MessageObject.GroupedMessagePosition) l1Var.f39966b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            a3Var.b(pageblockvideo, (b3) m1Var.f40293x.f36383y.f(pageblockvideo.video_id), false, true);
            return;
        }
        f2 f2Var = (f2) view;
        f2Var.N = (MessageObject.GroupedMessagePosition) l1Var.f39966b.get(pageBlock);
        f2Var.a((TL_iv.pageBlockPhoto) pageBlock, m1Var.f40292w.A.cached_page, false, true);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View f2Var;
        m1 m1Var = this.f39337c;
        if (i9 != 0) {
            f2Var = new a3(m1Var.getContext(), m1Var.f40293x, m1Var.f40292w, 2);
        } else {
            f2Var = new f2(m1Var.getContext(), m1Var.f40293x, m1Var.f40292w, 2);
        }
        return new f2.q1(f2Var);
    }
}
