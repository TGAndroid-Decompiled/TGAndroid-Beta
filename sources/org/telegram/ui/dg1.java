package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;
public final class dg1 extends s4.w {
    public boolean d;
    public final eg1 f37009e;

    public dg1(eg1 eg1Var) {
        this.f37009e = eg1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f47748a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.d1 d1Var) {
        int l4 = s4.w.l(0, 0);
        int b10 = d1Var.b();
        if (b10 >= 0) {
            eg1 eg1Var = this.f37009e;
            if (b10 < eg1Var.f37314b.size() && ((vf1) eg1Var.f37314b.get(b10)).f43006c != null && ChatObject.canManageTopics(eg1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((vf1) eg1Var.f37314b.get(b10)).f43006c;
                if (eg1Var.f37312a0.isEmpty()) {
                    View view = d1Var.f47748a;
                    if ((view instanceof bg1) && tL_forumTopic.f20084id == 1) {
                        this.d = true;
                        ((bg1) view).setSliding(true);
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
        return !this.f37009e.f37312a0.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.d1 d1Var, s4.d1 d1Var2) {
        int b10;
        eg1 eg1Var = this.f37009e;
        ArrayList arrayList = eg1Var.f37314b;
        if (d1Var.f47752f == d1Var2.f47752f && (b10 = d1Var2.b()) >= 0 && b10 < arrayList.size() && ((vf1) arrayList.get(b10)).f43006c != null && ((vf1) arrayList.get(b10)).f43006c.pinned) {
            tf1 tf1Var = eg1Var.f37345r;
            int b11 = d1Var.b();
            int b12 = d1Var2.b();
            eg1 eg1Var2 = tf1Var.d;
            ArrayList arrayList2 = eg1Var2.f37314b;
            arrayList2.add(b12, (vf1) arrayList2.remove(b11));
            s4.n0 itemAnimator = eg1Var2.N.getItemAnimator();
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
    public final void p(s4.d1 d1Var, int i10) {
        eg1 eg1Var = this.f37009e;
        if (i10 == 0) {
            ArrayList arrayList = eg1Var.f37314b;
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((vf1) arrayList.get(i11)).f43006c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f20084id));
                }
            }
            eg1Var.getMessagesController().getTopicsController().reorderPinnedTopics(eg1Var.f37311a, arrayList2);
            return;
        }
        eg1Var.N.I0(false);
        d1Var.f47748a.setPressed(true);
    }

    @Override
    public final void q(s4.d1 d1Var) {
        if (d1Var != null) {
            bg1 bg1Var = (bg1) d1Var.f47748a;
            TLRPC.TL_forumTopic tL_forumTopic = bg1Var.N;
            eg1 eg1Var = this.f37009e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = eg1Var.getMessagesController().getTopicsController();
                long j3 = eg1Var.f37311a;
                TLRPC.TL_forumTopic tL_forumTopic2 = bg1Var.N;
                topicsController.toggleShowTopic(j3, tL_forumTopic2.f20084id, tL_forumTopic2.hidden);
            }
            eg1Var.f37316b1 = bg1Var;
            int i10 = cg1.f36697f3;
            eg1Var.N.A1(!bg1Var.N.hidden, bg1Var);
            eg1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = bg1Var.f36376c5;
            if (tL_forumTopic3 != null) {
                bg1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
