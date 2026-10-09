package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;
public final class eg1 extends s4.w {
    public boolean d;
    public final fg1 f37255e;

    public eg1(fg1 fg1Var) {
        this.f37255e = fg1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f47658a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        int l4 = s4.w.l(0, 0);
        int b10 = d1Var.b();
        if (b10 >= 0) {
            fg1 fg1Var = this.f37255e;
            if (b10 < fg1Var.f37561b.size() && ((wf1) fg1Var.f37561b.get(b10)).f43570c != null && ChatObject.canManageTopics(fg1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((wf1) fg1Var.f37561b.get(b10)).f43570c;
                if (fg1Var.f37559a0.isEmpty()) {
                    View view = d1Var.f47658a;
                    if ((view instanceof cg1) && tL_forumTopic.f20090id == 1) {
                        this.d = true;
                        ((cg1) view).setSliding(true);
                        return s4.w.l(0, 4);
                    }
                }
                if (!tL_forumTopic.pinned) {
                    return l4;
                }
                return s4.w.l(3, 0);
            }
        }
        return l4;
    }

    @Override
    public final boolean k() {
        return !this.f37255e.f37559a0.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        int b10;
        fg1 fg1Var = this.f37255e;
        ArrayList arrayList = fg1Var.f37561b;
        if (d1Var.f47662f == d1Var2.f47662f && (b10 = d1Var2.b()) >= 0 && b10 < arrayList.size() && ((wf1) arrayList.get(b10)).f43570c != null && ((wf1) arrayList.get(b10)).f43570c.pinned) {
            uf1 uf1Var = fg1Var.f37592r;
            int b11 = d1Var.b();
            int b12 = d1Var2.b();
            fg1 fg1Var2 = uf1Var.d;
            ArrayList arrayList2 = fg1Var2.f37561b;
            arrayList2.add(b12, (wf1) arrayList2.remove(b11));
            s4.n0 itemAnimator = fg1Var2.N.getItemAnimator();
            sf1 sf1Var = fg1Var2.I0;
            if (itemAnimator != sf1Var) {
                fg1Var2.N.setItemAnimator(sf1Var);
            }
            uf1Var.p(b11, b12);
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.d1 d1Var, int i10) {
        fg1 fg1Var = this.f37255e;
        if (i10 == 0) {
            ArrayList arrayList = fg1Var.f37561b;
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((wf1) arrayList.get(i11)).f43570c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f20090id));
                }
            }
            fg1Var.getMessagesController().getTopicsController().reorderPinnedTopics(fg1Var.f37558a, arrayList2);
            return;
        }
        fg1Var.N.I0(false);
        d1Var.f47658a.setPressed(true);
    }

    @Override
    public final void q(s4.d1 d1Var) {
        if (d1Var != null) {
            cg1 cg1Var = (cg1) d1Var.f47658a;
            TLRPC.TL_forumTopic tL_forumTopic = cg1Var.N;
            fg1 fg1Var = this.f37255e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = fg1Var.getMessagesController().getTopicsController();
                long j3 = fg1Var.f37558a;
                TLRPC.TL_forumTopic tL_forumTopic2 = cg1Var.N;
                topicsController.toggleShowTopic(j3, tL_forumTopic2.f20090id, tL_forumTopic2.hidden);
            }
            fg1Var.f37563b1 = cg1Var;
            int i10 = dg1.f36961f3;
            fg1Var.N.A1(!cg1Var.N.hidden, cg1Var);
            fg1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = cg1Var.f36659c5;
            if (tL_forumTopic3 != null) {
                cg1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
