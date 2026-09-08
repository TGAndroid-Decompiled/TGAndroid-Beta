package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;
public final class dg1 extends s4.v {
    public boolean d;
    public final eg1 f35812e;

    public dg1(eg1 eg1Var) {
        this.f35812e = eg1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f45766a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        int l4 = s4.v.l(0, 0);
        int b10 = c1Var.b();
        if (b10 >= 0) {
            eg1 eg1Var = this.f35812e;
            if (b10 < eg1Var.f36055b.size() && ((vf1) eg1Var.f36055b.get(b10)).f41560c != null && ChatObject.canManageTopics(eg1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((vf1) eg1Var.f36055b.get(b10)).f41560c;
                if (eg1Var.f36053a0.isEmpty()) {
                    View view = c1Var.f45766a;
                    if ((view instanceof bg1) && tL_forumTopic.f19948id == 1) {
                        this.d = true;
                        ((bg1) view).setSliding(true);
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
        return !this.f35812e.f36053a0.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int b10;
        eg1 eg1Var = this.f35812e;
        ArrayList arrayList = eg1Var.f36055b;
        if (c1Var.f45770f == c1Var2.f45770f && (b10 = c1Var2.b()) >= 0 && b10 < arrayList.size() && ((vf1) arrayList.get(b10)).f41560c != null && ((vf1) arrayList.get(b10)).f41560c.pinned) {
            tf1 tf1Var = eg1Var.f36086r;
            int b11 = c1Var.b();
            int b12 = c1Var2.b();
            eg1 eg1Var2 = tf1Var.d;
            ArrayList arrayList2 = eg1Var2.f36055b;
            arrayList2.add(b12, (vf1) arrayList2.remove(b11));
            s4.m0 itemAnimator = eg1Var2.N.getItemAnimator();
            rf1 rf1Var = eg1Var2.I0;
            if (itemAnimator != rf1Var) {
                eg1Var2.N.setItemAnimator(rf1Var);
            }
            tf1Var.p(b11, b12);
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        eg1 eg1Var = this.f35812e;
        if (i10 == 0) {
            ArrayList arrayList = eg1Var.f36055b;
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((vf1) arrayList.get(i11)).f41560c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f19948id));
                }
            }
            eg1Var.getMessagesController().getTopicsController().reorderPinnedTopics(eg1Var.f36052a, arrayList2);
            return;
        }
        eg1Var.N.I0(false);
        c1Var.f45766a.setPressed(true);
    }

    @Override
    public final void q(s4.c1 c1Var) {
        if (c1Var != null) {
            bg1 bg1Var = (bg1) c1Var.f45766a;
            TLRPC.TL_forumTopic tL_forumTopic = bg1Var.N;
            eg1 eg1Var = this.f35812e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = eg1Var.getMessagesController().getTopicsController();
                long j3 = eg1Var.f36052a;
                TLRPC.TL_forumTopic tL_forumTopic2 = bg1Var.N;
                topicsController.toggleShowTopic(j3, tL_forumTopic2.f19948id, tL_forumTopic2.hidden);
            }
            eg1Var.f36057b1 = bg1Var;
            int i10 = cg1.f35131h3;
            eg1Var.N.y1(!bg1Var.N.hidden, bg1Var);
            eg1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = bg1Var.Y4;
            if (tL_forumTopic3 != null) {
                bg1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
