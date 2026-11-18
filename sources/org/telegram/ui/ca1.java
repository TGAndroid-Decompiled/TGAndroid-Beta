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
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59126f;
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
        return ((da1) this.d.d.get(i7)).f56589a;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        long j3;
        String M0;
        ea1 ea1Var = this.d;
        ArrayList arrayList = ea1Var.d;
        if (((da1) arrayList.get(i7)).f56589a == 2) {
            org.telegram.ui.Cells.ja jaVar = (org.telegram.ui.Cells.ja) f1Var.f59122a;
            long j10 = ea1Var.f47191c;
            TLRPC.TL_forumTopic tL_forumTopic = ((da1) arrayList.get(i7)).f46904c;
            org.telegram.ui.Components.q9 q9Var = jaVar.f30893b;
            boolean z10 = false;
            qg.c.q(q9Var, tL_forumTopic, false, false, null);
            if (q9Var != null && q9Var.getImageReceiver() != null && (q9Var.getImageReceiver().t() instanceof qg.b)) {
                ((qg.b) q9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29381c9, false));
            }
            jaVar.f30894c.setText(tL_forumTopic.title);
            TextView textView = jaVar.d;
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24773t0);
            if (u12.getMessagesController().u2(j10, tL_forumTopic.f28457id, null)) {
                int i10 = u12.f25660g7.getInt("notifyuntil_" + org.telegram.messenger.xs.v(j10, j3, false), 0);
                if (i10 >= u12.getConnectionsManager().getCurrentTime()) {
                    M0 = org.telegram.messenger.gd.a0("NotificationsMutedForHint", null, 2131747707, org.telegram.messenger.gd.c0(i10));
                } else {
                    M0 = org.telegram.messenger.gd.M0(2131747708, null);
                }
            } else {
                M0 = org.telegram.messenger.gd.M0(2131747663, null);
            }
            textView.setText(M0);
            if (i7 == arrayList.size() - 1 || ((da1) arrayList.get(i7 + 1)).f56589a == 2) {
                z10 = true;
            }
            jaVar.f30892a = z10;
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.m8 m8Var;
        View view = null;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                        m8Var2.k(org.telegram.messenger.gd.M0(2131747722, null), false);
                        m8Var2.g(-1, org.telegram.ui.ActionBar.n6.f29617p7);
                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, m8Var2, null);
                        m8Var = m8Var2;
                    }
                    return i5.c.q(view, view, -1, -2);
                }
                m8Var = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (org.telegram.ui.Cells.c0) null);
            } else {
                Context context = viewGroup.getContext();
                ?? frameLayout = new FrameLayout(context);
                org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
                frameLayout.f30893b = q9Var;
                frameLayout.addView(q9Var, c8.ma.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f30894c = textView;
                org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.G6, null, 1, 16.0f);
                textView.setMaxLines(1);
                frameLayout.addView(textView, c8.ma.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
                TextView textView2 = new TextView(context);
                frameLayout.d = textView2;
                org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29788y6, null);
                textView2.setTextSize(1, 14.0f);
                frameLayout.addView(textView2, c8.ma.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, frameLayout, null);
                m8Var = frameLayout;
            }
        } else {
            org.telegram.ui.Cells.m8 m8Var3 = new org.telegram.ui.Cells.m8(viewGroup.getContext());
            m8Var3.o(2131232101, org.telegram.messenger.gd.M0(2131747730, null), true);
            m8Var3.g(org.telegram.ui.ActionBar.n6.f29731v6, org.telegram.ui.ActionBar.n6.f29712u6);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, m8Var3, null);
            m8Var = m8Var3;
        }
        view = m8Var;
        return i5.c.q(view, view, -1, -2);
    }
}
