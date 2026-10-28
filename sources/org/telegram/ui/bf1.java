package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;
public final class bf1 extends s4.w {
    public boolean d;
    public final cf1 e;

    public bf1(cf1 cf1Var) {
        this.e = cf1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        e1Var.f47773a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.e1 e1Var) {
        int l4 = s4.w.l(0, 0);
        int b10 = e1Var.b();
        if (b10 >= 0) {
            cf1 cf1Var = this.e;
            if (b10 < cf1Var.f38291b.size() && ((te1) cf1Var.f38291b.get(b10)).f43620c != null && ChatObject.canManageTopics(cf1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((te1) cf1Var.f38291b.get(b10)).f43620c;
                if (cf1Var.f38289a0.isEmpty()) {
                    View view = e1Var.f47773a;
                    if ((view instanceof ze1) && tL_forumTopic.f22080id == 1) {
                        this.d = true;
                        ((ze1) view).setSliding(true);
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
        return !this.e.f38289a0.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        int b10;
        cf1 cf1Var = this.e;
        ArrayList arrayList = cf1Var.f38291b;
        if (e1Var.f47776f == e1Var2.f47776f && (b10 = e1Var2.b()) >= 0 && b10 < arrayList.size() && ((te1) arrayList.get(b10)).f43620c != null && ((te1) arrayList.get(b10)).f43620c.pinned) {
            re1 re1Var = cf1Var.f38324r;
            int b11 = e1Var.b();
            int b12 = e1Var2.b();
            cf1 cf1Var2 = re1Var.d;
            ArrayList arrayList2 = cf1Var2.f38291b;
            arrayList2.add(b12, (te1) arrayList2.remove(b11));
            s4.m0 itemAnimator = cf1Var2.N.getItemAnimator();
            pe1 pe1Var = cf1Var2.I0;
            if (itemAnimator != pe1Var) {
                cf1Var2.N.setItemAnimator(pe1Var);
            }
            re1Var.p(b11, b12);
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.e1 e1Var, int i10) {
        cf1 cf1Var = this.e;
        if (i10 == 0) {
            ArrayList arrayList = cf1Var.f38291b;
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((te1) arrayList.get(i11)).f43620c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f22080id));
                }
            }
            cf1Var.getMessagesController().getTopicsController().reorderPinnedTopics(cf1Var.f38288a, arrayList2);
            return;
        }
        cf1Var.N.I0(false);
        e1Var.f47773a.setPressed(true);
    }

    @Override
    public final void q(s4.e1 e1Var) {
        if (e1Var != null) {
            ze1 ze1Var = (ze1) e1Var.f47773a;
            TLRPC.TL_forumTopic tL_forumTopic = ze1Var.N;
            cf1 cf1Var = this.e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = cf1Var.getMessagesController().getTopicsController();
                long j10 = cf1Var.f38288a;
                TLRPC.TL_forumTopic tL_forumTopic2 = ze1Var.N;
                topicsController.toggleShowTopic(j10, tL_forumTopic2.f22080id, tL_forumTopic2.hidden);
            }
            cf1Var.f38296c1 = ze1Var;
            int i10 = af1.f37765o3;
            cf1Var.N.F1(!ze1Var.N.hidden, ze1Var);
            cf1Var.V0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = ze1Var.f46245c5;
            if (tL_forumTopic3 != null) {
                ze1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
