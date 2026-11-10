package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class da1 extends rg.b {
    public final fa1 d;

    public da1(fa1 fa1Var) {
        this.d = fa1Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57056f;
        if (i7 == 1 || i7 == 2 || i7 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.d.size();
    }

    @Override
    public final int d(int i7) {
        return ((ea1) this.d.d.get(i7)).f54543a;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        long j3;
        String M0;
        fa1 fa1Var = this.d;
        ArrayList arrayList = fa1Var.d;
        if (((ea1) arrayList.get(i7)).f54543a == 2) {
            org.telegram.ui.Cells.ia iaVar = (org.telegram.ui.Cells.ia) d1Var.f57052a;
            long j10 = fa1Var.f45671c;
            TLRPC.TL_forumTopic tL_forumTopic = ((ea1) arrayList.get(i7)).f45222c;
            org.telegram.ui.Components.k9 k9Var = iaVar.f29344b;
            boolean z9 = false;
            qg.d.p(k9Var, tL_forumTopic, false, false, null);
            if (k9Var != null && k9Var.getImageReceiver() != null && (k9Var.getImageReceiver().t() instanceof qg.c)) {
                ((qg.c) k9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27875c9, false));
            }
            iaVar.f29345c.setText(tL_forumTopic.title);
            TextView textView = iaVar.d;
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0);
            if (s12.getMessagesController().r2(j10, tL_forumTopic.f27012id, null)) {
                int i10 = s12.f24768d7.getInt("notifyuntil_" + org.telegram.messenger.dt.v(j10, j3, false), 0);
                if (i10 >= s12.getConnectionsManager().getCurrentTime()) {
                    M0 = org.telegram.messenger.id.a0("NotificationsMutedForHint", null, 2131747900, org.telegram.messenger.id.c0(i10));
                } else {
                    M0 = org.telegram.messenger.id.M0(2131747901, null);
                }
            } else {
                M0 = org.telegram.messenger.id.M0(2131747856, null);
            }
            textView.setText(M0);
            if (i7 == arrayList.size() - 1 || ((ea1) arrayList.get(i7 + 1)).f54543a == 2) {
                z9 = true;
            }
            iaVar.f29343a = z9;
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.m8 m8Var;
        View view = null;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                        m8Var2.k(org.telegram.messenger.id.M0(2131747915, null), false);
                        m8Var2.g(-1, org.telegram.ui.ActionBar.m6.f28111p7);
                        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, m8Var2, null);
                        m8Var = m8Var2;
                    }
                    return jg.g.r(view, view, -1, -2);
                }
                m8Var = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
            } else {
                Context context = viewGroup.getContext();
                ?? frameLayout = new FrameLayout(context);
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
                frameLayout.f29344b = k9Var;
                frameLayout.addView(k9Var, c8.ha.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f29345c = textView;
                org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.m6.G6, null, 1, 16.0f);
                textView.setMaxLines(1);
                frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
                TextView textView2 = new TextView(context);
                frameLayout.d = textView2;
                org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f28282y6, null);
                textView2.setTextSize(1, 14.0f);
                frameLayout.addView(textView2, c8.ha.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, frameLayout, null);
                m8Var = frameLayout;
            }
        } else {
            org.telegram.ui.Cells.m8 m8Var3 = new org.telegram.ui.Cells.m8(viewGroup.getContext());
            m8Var3.o(2131232099, org.telegram.messenger.id.M0(2131747923, null), true);
            m8Var3.g(org.telegram.ui.ActionBar.m6.f28225v6, org.telegram.ui.ActionBar.m6.f28206u6);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, m8Var3, null);
            m8Var = m8Var3;
        }
        view = m8Var;
        return jg.g.r(view, view, -1, -2);
    }
}
