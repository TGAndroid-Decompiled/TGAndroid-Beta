package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ob1 extends s4.u {
    public boolean d;
    public final pb1 e;

    public ob1(pb1 pb1Var) {
        this.e = pb1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f47898a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        pb1 pb1Var = this.e;
        ArrayList arrayList = pb1Var.f40569b;
        int l4 = s4.u.l(0, 0);
        int b10 = c1Var.b();
        if (b10 >= 0 && b10 < arrayList.size() && ((hb1) arrayList.get(b10)).f37887c != null && org.telegram.messenger.w3.y(15, pb1Var.g())) {
            TLRPC.TL_forumTopic tL_forumTopic = ((hb1) arrayList.get(b10)).f37887c;
            if (pb1Var.f40567a0.isEmpty()) {
                View view = c1Var.f47898a;
                if ((view instanceof mb1) && tL_forumTopic.f19845id == 1) {
                    this.d = true;
                    ((mb1) view).setSliding(true);
                    return s4.u.l(0, 4);
                }
            }
            if (tL_forumTopic.pinned) {
                return s4.u.l(3, 0);
            }
        }
        return l4;
    }

    @Override
    public final boolean k() {
        return !this.e.f40567a0.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int b10;
        pb1 pb1Var = this.e;
        ArrayList arrayList = pb1Var.f40569b;
        if (c1Var.f47901f == c1Var2.f47901f && (b10 = c1Var2.b()) >= 0 && b10 < arrayList.size() && ((hb1) arrayList.get(b10)).f37887c != null && ((hb1) arrayList.get(b10)).f37887c.pinned) {
            gb1 gb1Var = pb1Var.f40602r;
            int b11 = c1Var.b();
            int b12 = c1Var2.b();
            pb1 pb1Var2 = gb1Var.d;
            ArrayList arrayList2 = pb1Var2.f40569b;
            arrayList2.add(b12, (hb1) arrayList2.remove(b11));
            s4.l0 itemAnimator = pb1Var2.N.getItemAnimator();
            eb1 eb1Var = pb1Var2.I0;
            if (itemAnimator != eb1Var) {
                pb1Var2.N.setItemAnimator(eb1Var);
            }
            gb1Var.j(b11, b12);
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        pb1 pb1Var = this.e;
        if (i10 == 0) {
            ArrayList arrayList = pb1Var.f40569b;
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((hb1) arrayList.get(i11)).f37887c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f19845id));
                }
            }
            pb1Var.getMessagesController().f18891r7.w(arrayList2, pb1Var.f40566a);
            return;
        }
        pb1Var.N.I0(false);
        c1Var.f47898a.setPressed(true);
    }

    @Override
    public final void q(s4.c1 c1Var) {
        if (c1Var != null) {
            mb1 mb1Var = (mb1) c1Var.f47898a;
            TLRPC.TL_forumTopic tL_forumTopic = mb1Var.N;
            pb1 pb1Var = this.e;
            if (tL_forumTopic != null) {
                org.telegram.messenger.x00 x00Var = pb1Var.getMessagesController().f18891r7;
                long j10 = pb1Var.f40566a;
                TLRPC.TL_forumTopic tL_forumTopic2 = mb1Var.N;
                x00Var.A(tL_forumTopic2.f19845id, j10, tL_forumTopic2.hidden);
            }
            pb1Var.f40574c1 = mb1Var;
            int i10 = nb1.f39896n3;
            pb1Var.N.B1(!mb1Var.N.hidden, mb1Var);
            pb1Var.Y0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = mb1Var.f39628c5;
            if (tL_forumTopic3 != null) {
                mb1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
