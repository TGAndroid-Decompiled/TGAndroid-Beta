package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;
public final class i1 extends f2.o0 {
    public final l1 f34993c;

    public i1(l1 l1Var) {
        this.f34993c = l1Var;
    }

    @Override
    public final int h() {
        TL_iv.pageBlockCollage pageblockcollage = this.f34993c.f35869s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList<TL_iv.PageBlock> arrayList = this.f34993c.f35869s.items;
        if (!(arrayList.get((arrayList.size() - i10) - 1) instanceof TL_iv.pageBlockPhoto)) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        l1 l1Var2 = this.f34993c;
        k1 k1Var = l1Var2.v;
        ArrayList<TL_iv.PageBlock> arrayList = l1Var2.f35869s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i10) - 1);
        int i11 = l1Var.f5788f;
        View view = l1Var.f5785a;
        if (i11 != 0) {
            z2 z2Var = (z2) view;
            z2Var.Q = (MessageObject.GroupedMessagePosition) k1Var.f35542b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            z2Var.b(pageblockvideo, (a3) l1Var2.f35871x.f36484y.f(pageblockvideo.video_id), false, true);
            return;
        }
        e2 e2Var = (e2) view;
        e2Var.O = (MessageObject.GroupedMessagePosition) k1Var.f35542b.get(pageBlock);
        e2Var.a((TL_iv.pageBlockPhoto) pageBlock, l1Var2.f35870w.B.cached_page, false, true);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View e2Var;
        l1 l1Var = this.f34993c;
        if (i10 != 0) {
            e2Var = new z2(l1Var.getContext(), l1Var.f35871x, l1Var.f35870w, 2);
        } else {
            e2Var = new e2(l1Var.getContext(), l1Var.f35871x, l1Var.f35870w, 2);
        }
        return new f2.l1(e2Var);
    }
}
