package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;
public final class qe1 extends s4.v {
    public boolean d;
    public final re1 e;

    public qe1(re1 re1Var) {
        this.e = re1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.f45921a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        int l4 = s4.v.l(0, 0);
        int b10 = b1Var.b();
        if (b10 >= 0) {
            re1 re1Var = this.e;
            if (b10 < re1Var.f41155b.size() && ((ie1) re1Var.f41155b.get(b10)).f37963c != null && ChatObject.canManageTopics(re1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((ie1) re1Var.f41155b.get(b10)).f37963c;
                if (re1Var.f41153a0.isEmpty()) {
                    View view = b1Var.f45921a;
                    if ((view instanceof oe1) && tL_forumTopic.f20332id == 1) {
                        this.d = true;
                        ((oe1) view).setSliding(true);
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
        return !this.e.f41153a0.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        int b10;
        re1 re1Var = this.e;
        ArrayList arrayList = re1Var.f41155b;
        if (b1Var.f45924f == b1Var2.f45924f && (b10 = b1Var2.b()) >= 0 && b10 < arrayList.size() && ((ie1) arrayList.get(b10)).f37963c != null && ((ie1) arrayList.get(b10)).f37963c.pinned) {
            ge1 ge1Var = re1Var.f41185r;
            int b11 = b1Var.b();
            int b12 = b1Var2.b();
            re1 re1Var2 = ge1Var.d;
            ArrayList arrayList2 = re1Var2.f41155b;
            arrayList2.add(b12, (ie1) arrayList2.remove(b11));
            s4.l0 itemAnimator = re1Var2.N.getItemAnimator();
            ee1 ee1Var = re1Var2.I0;
            if (itemAnimator != ee1Var) {
                re1Var2.N.setItemAnimator(ee1Var);
            }
            ge1Var.p(b11, b12);
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        re1 re1Var = this.e;
        if (i10 == 0) {
            ArrayList arrayList = re1Var.f41155b;
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((ie1) arrayList.get(i11)).f37963c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f20332id));
                }
            }
            re1Var.getMessagesController().getTopicsController().reorderPinnedTopics(re1Var.f41152a, arrayList2);
            return;
        }
        re1Var.N.I0(false);
        b1Var.f45921a.setPressed(true);
    }

    @Override
    public final void q(s4.b1 b1Var) {
        if (b1Var != null) {
            oe1 oe1Var = (oe1) b1Var.f45921a;
            TLRPC.TL_forumTopic tL_forumTopic = oe1Var.N;
            re1 re1Var = this.e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = re1Var.getMessagesController().getTopicsController();
                long j10 = re1Var.f41152a;
                TLRPC.TL_forumTopic tL_forumTopic2 = oe1Var.N;
                topicsController.toggleShowTopic(j10, tL_forumTopic2.f20332id, tL_forumTopic2.hidden);
            }
            re1Var.f41157b1 = oe1Var;
            int i10 = pe1.f40206f3;
            re1Var.N.A1(!oe1Var.N.hidden, oe1Var);
            re1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = oe1Var.f39869c5;
            if (tL_forumTopic3 != null) {
                oe1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
