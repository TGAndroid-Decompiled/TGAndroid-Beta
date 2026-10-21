package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;
public final class j1 extends s4.g0 {
    public final m1 f38142c;

    public j1(m1 m1Var) {
        this.f38142c = m1Var;
    }

    @Override
    public final int h() {
        TL_iv.pageBlockCollage pageblockcollage = this.f38142c.f39090s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override
    public final int j(int i10) {
        ArrayList<TL_iv.PageBlock> arrayList = this.f38142c.f39090s.items;
        if (!(arrayList.get((arrayList.size() - i10) - 1) instanceof TL_iv.pageBlockPhoto)) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        m1 m1Var = this.f38142c;
        l1 l1Var = m1Var.v;
        ArrayList<TL_iv.PageBlock> arrayList = m1Var.f39090s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i10) - 1);
        int i11 = b1Var.f45920f;
        View view = b1Var.f45917a;
        if (i11 != 0) {
            z2 z2Var = (z2) view;
            z2Var.T = (MessageObject.GroupedMessagePosition) l1Var.f38719b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            z2Var.b(pageblockvideo, (a3) m1Var.f39092x.f35531y.f(pageblockvideo.video_id), false, true);
            return;
        }
        f2 f2Var = (f2) view;
        f2Var.R = (MessageObject.GroupedMessagePosition) l1Var.f38719b.get(pageBlock);
        f2Var.a((TL_iv.pageBlockPhoto) pageBlock, m1Var.f39091w.E.cached_page, false, true);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View f2Var;
        m1 m1Var = this.f38142c;
        if (i10 != 0) {
            f2Var = new z2(m1Var.getContext(), m1Var.f39092x, m1Var.f39091w, 2);
        } else {
            f2Var = new f2(m1Var.getContext(), m1Var.f39092x, m1Var.f39091w, 2);
        }
        return new s4.b1(f2Var);
    }
}
