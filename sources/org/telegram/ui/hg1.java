package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;
public final class hg1 extends s4.v {
    public boolean d;
    public final ig1 e;

    public hg1(ig1 ig1Var) {
        this.e = ig1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f41610a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        int l4 = s4.v.l(0, 0);
        int b10 = c1Var.b();
        if (b10 >= 0) {
            ig1 ig1Var = this.e;
            if (b10 < ig1Var.f33684b.size() && ((zf1) ig1Var.f33684b.get(b10)).f39309c != null && ChatObject.canManageTopics(ig1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((zf1) ig1Var.f33684b.get(b10)).f39309c;
                if (ig1Var.f33682a0.isEmpty()) {
                    View view = c1Var.f41610a;
                    if ((view instanceof fg1) && tL_forumTopic.f17247id == 1) {
                        this.d = true;
                        ((fg1) view).setSliding(true);
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
        return !this.e.f33682a0.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int b10;
        ig1 ig1Var = this.e;
        ArrayList arrayList = ig1Var.f33684b;
        if (c1Var.f41613f == c1Var2.f41613f && (b10 = c1Var2.b()) >= 0 && b10 < arrayList.size() && ((zf1) arrayList.get(b10)).f39309c != null && ((zf1) arrayList.get(b10)).f39309c.pinned) {
            xf1 xf1Var = ig1Var.f33714r;
            int b11 = c1Var.b();
            int b12 = c1Var2.b();
            ig1 ig1Var2 = xf1Var.d;
            ArrayList arrayList2 = ig1Var2.f33684b;
            arrayList2.add(b12, (zf1) arrayList2.remove(b11));
            s4.m0 itemAnimator = ig1Var2.N.getItemAnimator();
            vf1 vf1Var = ig1Var2.I0;
            if (itemAnimator != vf1Var) {
                ig1Var2.N.setItemAnimator(vf1Var);
            }
            xf1Var.p(b11, b12);
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        ig1 ig1Var = this.e;
        if (i10 == 0) {
            ArrayList arrayList = ig1Var.f33684b;
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((zf1) arrayList.get(i11)).f39309c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f17247id));
                }
            }
            ig1Var.getMessagesController().getTopicsController().reorderPinnedTopics(ig1Var.f33681a, arrayList2);
            return;
        }
        ig1Var.N.I0(false);
        c1Var.f41610a.setPressed(true);
    }

    @Override
    public final void q(s4.c1 c1Var) {
        if (c1Var != null) {
            fg1 fg1Var = (fg1) c1Var.f41610a;
            TLRPC.TL_forumTopic tL_forumTopic = fg1Var.N;
            ig1 ig1Var = this.e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = ig1Var.getMessagesController().getTopicsController();
                long j3 = ig1Var.f33681a;
                TLRPC.TL_forumTopic tL_forumTopic2 = fg1Var.N;
                topicsController.toggleShowTopic(j3, tL_forumTopic2.f17247id, tL_forumTopic2.hidden);
            }
            ig1Var.f33686b1 = fg1Var;
            int i10 = gg1.f33095h3;
            ig1Var.N.y1(!fg1Var.N.hidden, fg1Var);
            ig1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = fg1Var.Y4;
            if (tL_forumTopic3 != null) {
                fg1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
