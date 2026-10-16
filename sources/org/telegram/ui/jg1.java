package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;
public final class jg1 extends s4.v {
    public boolean d;
    public final kg1 e;

    public jg1(kg1 kg1Var) {
        this.e = kg1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.f44838a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        int l4 = s4.v.l(0, 0);
        int b10 = b1Var.b();
        if (b10 >= 0) {
            kg1 kg1Var = this.e;
            if (b10 < kg1Var.f37383b.size() && ((bg1) kg1Var.f37383b.get(b10)).f34328c != null && ChatObject.canManageTopics(kg1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((bg1) kg1Var.f37383b.get(b10)).f34328c;
                if (kg1Var.f37381a0.isEmpty()) {
                    View view = b1Var.f44838a;
                    if ((view instanceof hg1) && tL_forumTopic.f18968id == 1) {
                        this.d = true;
                        ((hg1) view).setSliding(true);
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
        return !this.e.f37381a0.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        int b10;
        kg1 kg1Var = this.e;
        ArrayList arrayList = kg1Var.f37383b;
        if (b1Var.f44841f == b1Var2.f44841f && (b10 = b1Var2.b()) >= 0 && b10 < arrayList.size() && ((bg1) arrayList.get(b10)).f34328c != null && ((bg1) arrayList.get(b10)).f34328c.pinned) {
            zf1 zf1Var = kg1Var.f37413r;
            int b11 = b1Var.b();
            int b12 = b1Var2.b();
            kg1 kg1Var2 = zf1Var.d;
            ArrayList arrayList2 = kg1Var2.f37383b;
            arrayList2.add(b12, (bg1) arrayList2.remove(b11));
            s4.l0 itemAnimator = kg1Var2.N.getItemAnimator();
            xf1 xf1Var = kg1Var2.I0;
            if (itemAnimator != xf1Var) {
                kg1Var2.N.setItemAnimator(xf1Var);
            }
            zf1Var.p(b11, b12);
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        kg1 kg1Var = this.e;
        if (i10 == 0) {
            ArrayList arrayList = kg1Var.f37383b;
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((bg1) arrayList.get(i11)).f34328c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f18968id));
                }
            }
            kg1Var.getMessagesController().getTopicsController().reorderPinnedTopics(kg1Var.f37380a, arrayList2);
            return;
        }
        kg1Var.N.I0(false);
        b1Var.f44838a.setPressed(true);
    }

    @Override
    public final void q(s4.b1 b1Var) {
        if (b1Var != null) {
            hg1 hg1Var = (hg1) b1Var.f44838a;
            TLRPC.TL_forumTopic tL_forumTopic = hg1Var.N;
            kg1 kg1Var = this.e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = kg1Var.getMessagesController().getTopicsController();
                long j10 = kg1Var.f37380a;
                TLRPC.TL_forumTopic tL_forumTopic2 = hg1Var.N;
                topicsController.toggleShowTopic(j10, tL_forumTopic2.f18968id, tL_forumTopic2.hidden);
            }
            kg1Var.f37385b1 = hg1Var;
            int i10 = ig1.f36805f3;
            kg1Var.N.A1(!hg1Var.N.hidden, hg1Var);
            kg1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = hg1Var.f36550c5;
            if (tL_forumTopic3 != null) {
                hg1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
