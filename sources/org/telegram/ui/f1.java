package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class f1 extends u4.h0 {
    public final i1 f45118c;

    public f1(i1 i1Var) {
        this.f45118c = i1Var;
    }

    @Override
    public final int b() {
        TL_iv.pageBlockCollage pageblockcollage = this.f45118c.f46030s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override
    public final int d(int i3) {
        ArrayList<TL_iv.PageBlock> arrayList = this.f45118c.f46030s.items;
        if (!(arrayList.get((arrayList.size() - i3) - 1) instanceof TL_iv.pageBlockPhoto)) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        i1 i1Var = this.f45118c;
        h1 h1Var = i1Var.f46031w;
        ArrayList<TL_iv.PageBlock> arrayList = i1Var.f46030s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i3) - 1);
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
        if (i10 != 0) {
            w2 w2Var = (w2) view;
            w2Var.U = (org.telegram.messenger.ri) h1Var.f45773b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            w2Var.b(pageblockvideo, (x2) i1Var.f46033y.E.f(pageblockvideo.video_id), false, true);
            return;
        }
        b2 b2Var = (b2) view;
        b2Var.S = (org.telegram.messenger.ri) h1Var.f45773b.get(pageBlock);
        b2Var.a((TL_iv.pageBlockPhoto) pageBlock, i1Var.f46032x.F.cached_page, false, true);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View b2Var;
        i1 i1Var = this.f45118c;
        if (i3 != 0) {
            b2Var = new w2(i1Var.getContext(), i1Var.f46033y, i1Var.f46032x, 2);
        } else {
            b2Var = new b2(i1Var.getContext(), i1Var.f46033y, i1Var.f46032x, 2);
        }
        return new u4.d1(b2Var);
    }
}
