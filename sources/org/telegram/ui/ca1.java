package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ca1 extends rg.b {
    public final ea1 d;

    public ca1(ea1 ea1Var) {
        this.d = ea1Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57060f;
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
        return ((da1) this.d.d.get(i7)).f54544a;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        long j3;
        String M0;
        ea1 ea1Var = this.d;
        ArrayList arrayList = ea1Var.d;
        if (((da1) arrayList.get(i7)).f54544a == 2) {
            org.telegram.ui.Cells.ia iaVar = (org.telegram.ui.Cells.ia) d1Var.f57056a;
            long j10 = ea1Var.f45349c;
            TLRPC.TL_forumTopic tL_forumTopic = ((da1) arrayList.get(i7)).f44903c;
            org.telegram.ui.Components.l9 l9Var = iaVar.f29333b;
            boolean z9 = false;
            qg.d.p(l9Var, tL_forumTopic, false, false, null);
            if (l9Var != null && l9Var.getImageReceiver() != null && (l9Var.getImageReceiver().t() instanceof qg.c)) {
                ((qg.c) l9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27850c9, false));
            }
            iaVar.f29334c.setText(tL_forumTopic.title);
            TextView textView = iaVar.d;
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0);
            if (s12.getMessagesController().r2(j10, tL_forumTopic.f27008id, null)) {
                int i10 = s12.f24764d7.getInt("notifyuntil_" + org.telegram.messenger.dt.v(j10, j3, false), 0);
                if (i10 >= s12.getConnectionsManager().getCurrentTime()) {
                    M0 = org.telegram.messenger.id.a0("NotificationsMutedForHint", null, 2131747900, org.telegram.messenger.id.c0(i10));
                } else {
                    M0 = org.telegram.messenger.id.M0(2131747901, null);
                }
            } else {
                M0 = org.telegram.messenger.id.M0(2131747856, null);
            }
            textView.setText(M0);
            if (i7 == arrayList.size() - 1 || ((da1) arrayList.get(i7 + 1)).f54544a == 2) {
                z9 = true;
            }
            iaVar.f29332a = z9;
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
                        m8Var2.g(-1, org.telegram.ui.ActionBar.l6.f28086p7);
                        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, m8Var2, null);
                        m8Var = m8Var2;
                    }
                    return jg.g.r(view, view, -1, -2);
                }
                m8Var = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
            } else {
                Context context = viewGroup.getContext();
                ?? frameLayout = new FrameLayout(context);
                org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
                frameLayout.f29333b = l9Var;
                frameLayout.addView(l9Var, c8.ha.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f29334c = textView;
                org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.l6.G6, null, 1, 16.0f);
                textView.setMaxLines(1);
                frameLayout.addView(textView, c8.ha.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
                TextView textView2 = new TextView(context);
                frameLayout.d = textView2;
                org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.f28257y6, null);
                textView2.setTextSize(1, 14.0f);
                frameLayout.addView(textView2, c8.ha.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
                org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, frameLayout, null);
                m8Var = frameLayout;
            }
        } else {
            org.telegram.ui.Cells.m8 m8Var3 = new org.telegram.ui.Cells.m8(viewGroup.getContext());
            m8Var3.o(2131232099, org.telegram.messenger.id.M0(2131747923, null), true);
            m8Var3.g(org.telegram.ui.ActionBar.l6.f28200v6, org.telegram.ui.ActionBar.l6.f28181u6);
            org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27865d6, m8Var3, null);
            m8Var = m8Var3;
        }
        view = m8Var;
        return jg.g.r(view, view, -1, -2);
    }
}
