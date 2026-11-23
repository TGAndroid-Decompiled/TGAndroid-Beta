package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class aa1 extends rg.b {
    public final ca1 d;

    public aa1(ca1 ca1Var) {
        this.d = ca1Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
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
        return ((ba1) this.d.d.get(i7)).f56712a;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        long j3;
        String N0;
        ca1 ca1Var = this.d;
        ArrayList arrayList = ca1Var.d;
        if (((ba1) arrayList.get(i7)).f56712a == 2) {
            org.telegram.ui.Cells.la laVar = (org.telegram.ui.Cells.la) f1Var.f59245a;
            long j10 = ca1Var.f46754c;
            TLRPC.TL_forumTopic tL_forumTopic = ((ba1) arrayList.get(i7)).f45999c;
            org.telegram.ui.Components.p9 p9Var = laVar.f31096b;
            boolean z10 = false;
            qg.c.q(p9Var, tL_forumTopic, false, false, null);
            if (p9Var != null && p9Var.getImageReceiver() != null && (p9Var.getImageReceiver().t() instanceof qg.b)) {
                ((qg.b) p9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29436c9, false));
            }
            laVar.f31097c.setText(tL_forumTopic.title);
            TextView textView = laVar.d;
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0);
            if (u12.getMessagesController().u2(j10, tL_forumTopic.f28544id, null)) {
                int i10 = u12.f25753g7.getInt("notifyuntil_" + org.telegram.messenger.xs.v(j10, j3, false), 0);
                if (i10 >= u12.getConnectionsManager().getCurrentTime()) {
                    N0 = org.telegram.messenger.gd.a0("NotificationsMutedForHint", null, 2131747706, org.telegram.messenger.gd.c0(i10));
                } else {
                    N0 = org.telegram.messenger.gd.N0(2131747707, null);
                }
            } else {
                N0 = org.telegram.messenger.gd.N0(2131747662, null);
            }
            textView.setText(N0);
            if (i7 == arrayList.size() - 1 || ((ba1) arrayList.get(i7 + 1)).f56712a == 2) {
                z10 = true;
            }
            laVar.f31095a = z10;
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
                        m8Var2.k(org.telegram.messenger.gd.N0(2131747721, null), false);
                        m8Var2.g(-1, org.telegram.ui.ActionBar.n6.f29672p7);
                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, m8Var2, null);
                        m8Var = m8Var2;
                    }
                    return i5.c.q(view, view, -1, -2);
                }
                m8Var = new org.telegram.ui.Cells.y6(viewGroup.getContext(), (org.telegram.ui.Cells.c0) null);
            } else {
                Context context = viewGroup.getContext();
                ?? frameLayout = new FrameLayout(context);
                org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
                frameLayout.f31096b = p9Var;
                frameLayout.addView(p9Var, c8.na.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f31097c = textView;
                org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.n6.G6, null, 1, 16.0f);
                textView.setMaxLines(1);
                frameLayout.addView(textView, c8.na.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
                TextView textView2 = new TextView(context);
                frameLayout.d = textView2;
                org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29843y6, null);
                textView2.setTextSize(1, 14.0f);
                frameLayout.addView(textView2, c8.na.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, frameLayout, null);
                m8Var = frameLayout;
            }
        } else {
            org.telegram.ui.Cells.m8 m8Var3 = new org.telegram.ui.Cells.m8(viewGroup.getContext());
            m8Var3.o(2131232104, org.telegram.messenger.gd.N0(2131747729, null), true);
            m8Var3.g(org.telegram.ui.ActionBar.n6.f29786v6, org.telegram.ui.ActionBar.n6.f29767u6);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, m8Var3, null);
            m8Var = m8Var3;
        }
        view = m8Var;
        return i5.c.q(view, view, -1, -2);
    }
}
