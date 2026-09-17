package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;
public final class eg1 extends s4.v {
    public boolean d;
    public final fg1 e;

    public eg1(fg1 fg1Var) {
        this.e = fg1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f42697a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        int l4 = s4.v.l(0, 0);
        int b10 = c1Var.b();
        if (b10 >= 0) {
            fg1 fg1Var = this.e;
            if (b10 < fg1Var.f33639b.size() && ((wf1) fg1Var.f33639b.get(b10)).f39026c != null && ChatObject.canManageTopics(fg1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((wf1) fg1Var.f33639b.get(b10)).f39026c;
                if (fg1Var.f33637a0.isEmpty()) {
                    View view = c1Var.f42697a;
                    if ((view instanceof cg1) && tL_forumTopic.f18173id == 1) {
                        this.d = true;
                        ((cg1) view).setSliding(true);
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
        return !this.e.f33637a0.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int b10;
        fg1 fg1Var = this.e;
        ArrayList arrayList = fg1Var.f33639b;
        if (c1Var.f42700f == c1Var2.f42700f && (b10 = c1Var2.b()) >= 0 && b10 < arrayList.size() && ((wf1) arrayList.get(b10)).f39026c != null && ((wf1) arrayList.get(b10)).f39026c.pinned) {
            uf1 uf1Var = fg1Var.f33669r;
            int b11 = c1Var.b();
            int b12 = c1Var2.b();
            fg1 fg1Var2 = uf1Var.d;
            ArrayList arrayList2 = fg1Var2.f33639b;
            arrayList2.add(b12, (wf1) arrayList2.remove(b11));
            s4.m0 itemAnimator = fg1Var2.N.getItemAnimator();
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
    public final void p(s4.c1 c1Var, int i10) {
        fg1 fg1Var = this.e;
        if (i10 == 0) {
            ArrayList arrayList = fg1Var.f33639b;
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((wf1) arrayList.get(i11)).f39026c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f18173id));
                }
            }
            fg1Var.getMessagesController().getTopicsController().reorderPinnedTopics(fg1Var.f33636a, arrayList2);
            return;
        }
        fg1Var.N.J0(false);
        c1Var.f42697a.setPressed(true);
    }

    @Override
    public final void q(s4.c1 c1Var) {
        if (c1Var != null) {
            cg1 cg1Var = (cg1) c1Var.f42697a;
            TLRPC.TL_forumTopic tL_forumTopic = cg1Var.N;
            fg1 fg1Var = this.e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = fg1Var.getMessagesController().getTopicsController();
                long j3 = fg1Var.f33636a;
                TLRPC.TL_forumTopic tL_forumTopic2 = cg1Var.N;
                topicsController.toggleShowTopic(j3, tL_forumTopic2.f18173id, tL_forumTopic2.hidden);
            }
            fg1Var.f33641b1 = cg1Var;
            int i10 = dg1.f33118h3;
            fg1Var.N.A1(!cg1Var.N.hidden, cg1Var);
            fg1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = cg1Var.Y4;
            if (tL_forumTopic3 != null) {
                cg1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
