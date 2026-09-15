package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;
public final class cg1 extends s4.v {
    public boolean d;
    public final dg1 e;

    public cg1(dg1 dg1Var) {
        this.e = dg1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f42675a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        int l4 = s4.v.l(0, 0);
        int b10 = c1Var.b();
        if (b10 >= 0) {
            dg1 dg1Var = this.e;
            if (b10 < dg1Var.f33015b.size() && ((uf1) dg1Var.f33015b.get(b10)).f37995c != null && ChatObject.canManageTopics(dg1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((uf1) dg1Var.f33015b.get(b10)).f37995c;
                if (dg1Var.f33013a0.isEmpty()) {
                    View view = c1Var.f42675a;
                    if ((view instanceof ag1) && tL_forumTopic.f18164id == 1) {
                        this.d = true;
                        ((ag1) view).setSliding(true);
                        return s4.v.l(0, 4);
                    }
                }
                if (!tL_forumTopic.pinned) {
                    return l4;
                }
                return s4.v.l(3, 0);
            }
        }
        return l4;
    }

    @Override
    public final boolean k() {
        return !this.e.f33013a0.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int b10;
        dg1 dg1Var = this.e;
        ArrayList arrayList = dg1Var.f33015b;
        if (c1Var.f42678f == c1Var2.f42678f && (b10 = c1Var2.b()) >= 0 && b10 < arrayList.size() && ((uf1) arrayList.get(b10)).f37995c != null && ((uf1) arrayList.get(b10)).f37995c.pinned) {
            sf1 sf1Var = dg1Var.f33045r;
            int b11 = c1Var.b();
            int b12 = c1Var2.b();
            dg1 dg1Var2 = sf1Var.d;
            ArrayList arrayList2 = dg1Var2.f33015b;
            arrayList2.add(b12, (uf1) arrayList2.remove(b11));
            s4.m0 itemAnimator = dg1Var2.N.getItemAnimator();
            qf1 qf1Var = dg1Var2.I0;
            if (itemAnimator != qf1Var) {
                dg1Var2.N.setItemAnimator(qf1Var);
            }
            sf1Var.p(b11, b12);
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        dg1 dg1Var = this.e;
        if (i10 == 0) {
            ArrayList arrayList = dg1Var.f33015b;
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((uf1) arrayList.get(i11)).f37995c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f18164id));
                }
            }
            dg1Var.getMessagesController().getTopicsController().reorderPinnedTopics(dg1Var.f33012a, arrayList2);
            return;
        }
        dg1Var.N.I0(false);
        c1Var.f42675a.setPressed(true);
    }

    @Override
    public final void q(s4.c1 c1Var) {
        if (c1Var != null) {
            ag1 ag1Var = (ag1) c1Var.f42675a;
            TLRPC.TL_forumTopic tL_forumTopic = ag1Var.N;
            dg1 dg1Var = this.e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = dg1Var.getMessagesController().getTopicsController();
                long j3 = dg1Var.f33012a;
                TLRPC.TL_forumTopic tL_forumTopic2 = ag1Var.N;
                topicsController.toggleShowTopic(j3, tL_forumTopic2.f18164id, tL_forumTopic2.hidden);
            }
            dg1Var.f33017b1 = ag1Var;
            int i10 = bg1.f32159h3;
            dg1Var.N.z1(!ag1Var.N.hidden, ag1Var);
            dg1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = ag1Var.Y4;
            if (tL_forumTopic3 != null) {
                ag1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
