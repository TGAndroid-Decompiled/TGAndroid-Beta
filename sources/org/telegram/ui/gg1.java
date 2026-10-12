package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;
public final class gg1 extends s4.w {
    public boolean d;
    public final hg1 f38043e;

    public gg1(hg1 hg1Var) {
        this.f38043e = hg1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f47889a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        int l4 = s4.w.l(0, 0);
        int b10 = d1Var.b();
        if (b10 >= 0) {
            hg1 hg1Var = this.f38043e;
            if (b10 < hg1Var.f38379b.size() && ((yf1) hg1Var.f38379b.get(b10)).f44469c != null && ChatObject.canManageTopics(hg1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((yf1) hg1Var.f38379b.get(b10)).f44469c;
                if (hg1Var.f38377a0.isEmpty()) {
                    View view = d1Var.f47889a;
                    if ((view instanceof eg1) && tL_forumTopic.f19854id == 1) {
                        this.d = true;
                        ((eg1) view).setSliding(true);
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
        return !this.f38043e.f38377a0.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        int b10;
        hg1 hg1Var = this.f38043e;
        ArrayList arrayList = hg1Var.f38379b;
        if (d1Var.f47893f == d1Var2.f47893f && (b10 = d1Var2.b()) >= 0 && b10 < arrayList.size() && ((yf1) arrayList.get(b10)).f44469c != null && ((yf1) arrayList.get(b10)).f44469c.pinned) {
            wf1 wf1Var = hg1Var.f38410r;
            int b11 = d1Var.b();
            int b12 = d1Var2.b();
            hg1 hg1Var2 = wf1Var.d;
            ArrayList arrayList2 = hg1Var2.f38379b;
            arrayList2.add(b12, (yf1) arrayList2.remove(b11));
            s4.n0 itemAnimator = hg1Var2.N.getItemAnimator();
            uf1 uf1Var = hg1Var2.I0;
            if (itemAnimator != uf1Var) {
                hg1Var2.N.setItemAnimator(uf1Var);
            }
            wf1Var.p(b11, b12);
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.d1 d1Var, int i10) {
        hg1 hg1Var = this.f38043e;
        if (i10 == 0) {
            ArrayList arrayList = hg1Var.f38379b;
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((yf1) arrayList.get(i11)).f44469c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f19854id));
                }
            }
            hg1Var.getMessagesController().getTopicsController().reorderPinnedTopics(hg1Var.f38376a, arrayList2);
            return;
        }
        hg1Var.N.I0(false);
        d1Var.f47889a.setPressed(true);
    }

    @Override
    public final void q(s4.d1 d1Var) {
        if (d1Var != null) {
            eg1 eg1Var = (eg1) d1Var.f47889a;
            TLRPC.TL_forumTopic tL_forumTopic = eg1Var.N;
            hg1 hg1Var = this.f38043e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = hg1Var.getMessagesController().getTopicsController();
                long j3 = hg1Var.f38376a;
                TLRPC.TL_forumTopic tL_forumTopic2 = eg1Var.N;
                topicsController.toggleShowTopic(j3, tL_forumTopic2.f19854id, tL_forumTopic2.hidden);
            }
            hg1Var.f38381b1 = eg1Var;
            int i10 = fg1.f37778f3;
            hg1Var.N.A1(!eg1Var.N.hidden, eg1Var);
            hg1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = eg1Var.f37092c5;
            if (tL_forumTopic3 != null) {
                eg1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
