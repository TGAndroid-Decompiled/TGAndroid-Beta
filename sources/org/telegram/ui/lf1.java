package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;
public final class lf1 extends f2.b0 {
    public boolean d;
    public final mf1 f38728e;

    public lf1(mf1 mf1Var) {
        this.f38728e = mf1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.m1 m1Var) {
        super.a(recyclerView, m1Var);
        m1Var.f5875a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.m1 m1Var) {
        int l10 = f2.b0.l(0, 0);
        int b10 = m1Var.b();
        if (b10 >= 0) {
            mf1 mf1Var = this.f38728e;
            if (b10 < mf1Var.f39105b.size() && ((df1) mf1Var.f39105b.get(b10)).f36216c != null && ChatObject.canManageTopics(mf1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((df1) mf1Var.f39105b.get(b10)).f36216c;
                if (mf1Var.X.isEmpty()) {
                    View view = m1Var.f5875a;
                    if ((view instanceof jf1) && tL_forumTopic.f20895id == 1) {
                        this.d = true;
                        ((jf1) view).setSliding(true);
                        return f2.b0.l(0, 4);
                    }
                }
                if (!tL_forumTopic.pinned) {
                    return l10;
                }
                return f2.b0.l(3, 0);
            }
        }
        return l10;
    }

    @Override
    public final boolean k() {
        return !this.f38728e.X.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2) {
        int b10;
        mf1 mf1Var = this.f38728e;
        ArrayList arrayList = mf1Var.f39105b;
        if (m1Var.f5879f == m1Var2.f5879f && (b10 = m1Var2.b()) >= 0 && b10 < arrayList.size() && ((df1) arrayList.get(b10)).f36216c != null && ((df1) arrayList.get(b10)).f36216c.pinned) {
            bf1 bf1Var = mf1Var.f39134r;
            int b11 = m1Var.b();
            int b12 = m1Var2.b();
            mf1 mf1Var2 = bf1Var.d;
            ArrayList arrayList2 = mf1Var2.f39105b;
            arrayList2.add(b12, (df1) arrayList2.remove(b11));
            f2.u0 itemAnimator = mf1Var2.K.getItemAnimator();
            ze1 ze1Var = mf1Var2.F0;
            if (itemAnimator != ze1Var) {
                mf1Var2.K.setItemAnimator(ze1Var);
            }
            bf1Var.p(b11, b12);
            return true;
        }
        return false;
    }

    @Override
    public final void p(f2.m1 m1Var, int i10) {
        mf1 mf1Var = this.f38728e;
        if (i10 == 0) {
            ArrayList arrayList = mf1Var.f39105b;
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((df1) arrayList.get(i11)).f36216c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f20895id));
                }
            }
            mf1Var.getMessagesController().getTopicsController().reorderPinnedTopics(mf1Var.f39102a, arrayList2);
            return;
        }
        mf1Var.K.I0(false);
        m1Var.f5875a.setPressed(true);
    }

    @Override
    public final void q(f2.m1 m1Var) {
        if (m1Var != null) {
            jf1 jf1Var = (jf1) m1Var.f5875a;
            TLRPC.TL_forumTopic tL_forumTopic = jf1Var.K;
            mf1 mf1Var = this.f38728e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = mf1Var.getMessagesController().getTopicsController();
                long j10 = mf1Var.f39102a;
                TLRPC.TL_forumTopic tL_forumTopic2 = jf1Var.K;
                topicsController.toggleShowTopic(j10, tL_forumTopic2.f20895id, tL_forumTopic2.hidden);
            }
            mf1Var.Y0 = jf1Var;
            int i10 = kf1.f38397e3;
            mf1Var.K.z1(!jf1Var.K.hidden, jf1Var);
            mf1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = jf1Var.V4;
            if (tL_forumTopic3 != null) {
                jf1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
