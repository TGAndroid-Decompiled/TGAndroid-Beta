package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class l91 extends u4.v {
    public boolean d;
    public final m91 f47235e;

    public l91(m91 m91Var) {
        this.f47235e = m91Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, u4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f55540a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, u4.d1 d1Var) {
        m91 m91Var = this.f47235e;
        ArrayList arrayList = m91Var.f47578b;
        int l10 = u4.v.l(0, 0);
        int b10 = d1Var.b();
        if (b10 >= 0 && b10 < arrayList.size() && ((e91) arrayList.get(b10)).f44941c != null && org.telegram.messenger.t3.y(15, m91Var.g())) {
            TLRPC.TL_forumTopic tL_forumTopic = ((e91) arrayList.get(b10)).f44941c;
            if (m91Var.f47579b0.isEmpty()) {
                View view = d1Var.f55540a;
                if ((view instanceof j91) && tL_forumTopic.f27053id == 1) {
                    this.d = true;
                    ((j91) view).setSliding(true);
                    return u4.v.l(0, 4);
                }
            }
            if (tL_forumTopic.pinned) {
                return u4.v.l(3, 0);
            }
        }
        return l10;
    }

    @Override
    public final boolean k() {
        return !this.f47235e.f47579b0.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, u4.d1 d1Var, u4.d1 d1Var2) {
        int b10;
        m91 m91Var = this.f47235e;
        ArrayList arrayList = m91Var.f47578b;
        if (d1Var.f55544f == d1Var2.f55544f && (b10 = d1Var2.b()) >= 0 && b10 < arrayList.size() && ((e91) arrayList.get(b10)).f44941c != null && ((e91) arrayList.get(b10)).f44941c.pinned) {
            d91 d91Var = m91Var.f47612r;
            int b11 = d1Var.b();
            int b12 = d1Var2.b();
            m91 m91Var2 = d91Var.d;
            ArrayList arrayList2 = m91Var2.f47578b;
            arrayList2.add(b12, (e91) arrayList2.remove(b11));
            u4.m0 itemAnimator = m91Var2.O.getItemAnimator();
            b91 b91Var = m91Var2.J0;
            if (itemAnimator != b91Var) {
                m91Var2.O.setItemAnimator(b91Var);
            }
            d91Var.j(b11, b12);
            return true;
        }
        return false;
    }

    @Override
    public final void p(u4.d1 d1Var, int i3) {
        m91 m91Var = this.f47235e;
        if (i3 == 0) {
            ArrayList arrayList = m91Var.f47578b;
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((e91) arrayList.get(i10)).f44941c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f27053id));
                }
            }
            m91Var.getMessagesController().f23102q7.w(arrayList2, m91Var.f47575a);
            return;
        }
        m91Var.O.I0(false);
        d1Var.f55540a.setPressed(true);
    }

    @Override
    public final void q(u4.d1 d1Var) {
        if (d1Var != null) {
            j91 j91Var = (j91) d1Var.f55540a;
            TLRPC.TL_forumTopic tL_forumTopic = j91Var.O;
            m91 m91Var = this.f47235e;
            if (tL_forumTopic != null) {
                org.telegram.messenger.c00 c00Var = m91Var.getMessagesController().f23102q7;
                long j10 = m91Var.f47575a;
                TLRPC.TL_forumTopic tL_forumTopic2 = j91Var.O;
                c00Var.A(tL_forumTopic2.f27053id, j10, tL_forumTopic2.hidden);
            }
            m91Var.f47585d1 = j91Var;
            int i3 = k91.f46833o3;
            m91Var.O.B1(!j91Var.O.hidden, j91Var);
            m91Var.Z0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = j91Var.f46567d5;
            if (tL_forumTopic3 != null) {
                j91Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
