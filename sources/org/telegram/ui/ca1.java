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
        int i7 = f1Var.f59165f;
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
        return ((da1) this.d.d.get(i7)).f56630a;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        long j3;
        String N0;
        ea1 ea1Var = this.d;
        ArrayList arrayList = ea1Var.d;
        if (((da1) arrayList.get(i7)).f56630a == 2) {
            org.telegram.ui.Cells.ka kaVar = (org.telegram.ui.Cells.ka) f1Var.f59161a;
            long j10 = ea1Var.f47216c;
            TLRPC.TL_forumTopic tL_forumTopic = ((da1) arrayList.get(i7)).f46906c;
            org.telegram.ui.Components.q9 q9Var = kaVar.f30973b;
            boolean z10 = false;
            qg.c.q(q9Var, tL_forumTopic, false, false, null);
            if (q9Var != null && q9Var.getImageReceiver() != null && (q9Var.getImageReceiver().t() instanceof qg.b)) {
                ((qg.b) q9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29363c9, false));
            }
            kaVar.f30974c.setText(tL_forumTopic.title);
            TextView textView = kaVar.d;
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24798t0);
            if (u12.getMessagesController().u2(j10, tL_forumTopic.f28483id, null)) {
                int i10 = u12.f25686g7.getInt("notifyuntil_" + org.telegram.messenger.xs.v(j10, j3, false), 0);
                if (i10 >= u12.getConnectionsManager().getCurrentTime()) {
                    N0 = org.telegram.messenger.gd.a0("NotificationsMutedForHint", null, 2131747706, org.telegram.messenger.gd.c0(i10));
                } else {
                    N0 = org.telegram.messenger.gd.N0(2131747707, null);
                }
            } else {
                N0 = org.telegram.messenger.gd.N0(2131747662, null);
            }
            textView.setText(N0);
            if (i7 == arrayList.size() - 1 || ((da1) arrayList.get(i7 + 1)).f56630a == 2) {
                z10 = true;
            }
            kaVar.f30972a = z10;
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.n8 n8Var;
        View view = null;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(viewGroup.getContext());
                        n8Var2.k(org.telegram.messenger.gd.N0(2131747721, null), false);
                        n8Var2.g(-1, org.telegram.ui.ActionBar.m6.f29599p7);
                        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29378d6, n8Var2, null);
                        n8Var = n8Var2;
                    }
                    return i5.c.q(view, view, -1, -2);
                }
                n8Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.c0) null);
            } else {
                Context context = viewGroup.getContext();
                ?? frameLayout = new FrameLayout(context);
                org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
                frameLayout.f30973b = q9Var;
                frameLayout.addView(q9Var, c8.ma.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f30974c = textView;
                org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.m6.G6, null, 1, 16.0f);
                textView.setMaxLines(1);
                frameLayout.addView(textView, c8.ma.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
                TextView textView2 = new TextView(context);
                frameLayout.d = textView2;
                org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29770y6, null);
                textView2.setTextSize(1, 14.0f);
                frameLayout.addView(textView2, c8.ma.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29378d6, frameLayout, null);
                n8Var = frameLayout;
            }
        } else {
            org.telegram.ui.Cells.n8 n8Var3 = new org.telegram.ui.Cells.n8(viewGroup.getContext());
            n8Var3.o(2131232101, org.telegram.messenger.gd.N0(2131747729, null), true);
            n8Var3.g(org.telegram.ui.ActionBar.m6.f29713v6, org.telegram.ui.ActionBar.m6.f29694u6);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29378d6, n8Var3, null);
            n8Var = n8Var3;
        }
        view = n8Var;
        return i5.c.q(view, view, -1, -2);
    }
}
