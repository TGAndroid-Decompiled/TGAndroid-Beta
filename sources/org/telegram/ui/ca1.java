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
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f59115f;
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
        return ((da1) this.d.d.get(i7)).f56599a;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        long j3;
        String N0;
        ea1 ea1Var = this.d;
        ArrayList arrayList = ea1Var.d;
        if (((da1) arrayList.get(i7)).f56599a == 2) {
            org.telegram.ui.Cells.ka kaVar = (org.telegram.ui.Cells.ka) e1Var.f59111a;
            long j10 = ea1Var.f47189c;
            TLRPC.TL_forumTopic tL_forumTopic = ((da1) arrayList.get(i7)).f46869c;
            org.telegram.ui.Components.q9 q9Var = kaVar.f30942b;
            boolean z10 = false;
            qg.c.q(q9Var, tL_forumTopic, false, false, null);
            if (q9Var != null && q9Var.getImageReceiver() != null && (q9Var.getImageReceiver().t() instanceof qg.b)) {
                ((qg.b) q9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29332c9, false));
            }
            kaVar.f30943c.setText(tL_forumTopic.title);
            TextView textView = kaVar.d;
            org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24932t0);
            if (u12.getMessagesController().u2(j10, tL_forumTopic.f28450id, null)) {
                int i10 = u12.f25821g7.getInt("notifyuntil_" + org.telegram.messenger.ys.v(j10, j3, false), 0);
                if (i10 >= u12.getConnectionsManager().getCurrentTime()) {
                    N0 = org.telegram.messenger.hd.a0("NotificationsMutedForHint", null, 2131747706, org.telegram.messenger.hd.c0(i10));
                } else {
                    N0 = org.telegram.messenger.hd.N0(2131747707, null);
                }
            } else {
                N0 = org.telegram.messenger.hd.N0(2131747662, null);
            }
            textView.setText(N0);
            if (i7 == arrayList.size() - 1 || ((da1) arrayList.get(i7 + 1)).f56599a == 2) {
                z10 = true;
            }
            kaVar.f30941a = z10;
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.n8 n8Var;
        View view = null;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(viewGroup.getContext());
                        n8Var2.k(org.telegram.messenger.hd.N0(2131747721, null), false);
                        n8Var2.g(-1, org.telegram.ui.ActionBar.m6.f29568p7);
                        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, n8Var2, null);
                        n8Var = n8Var2;
                    }
                    return i5.c.q(view, view, -1, -2);
                }
                n8Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.c0) null);
            } else {
                Context context = viewGroup.getContext();
                ?? frameLayout = new FrameLayout(context);
                org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
                frameLayout.f30942b = q9Var;
                frameLayout.addView(q9Var, c8.na.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f30943c = textView;
                org.telegram.messenger.f3.l(textView, org.telegram.ui.ActionBar.m6.G6, null, 1, 16.0f);
                textView.setMaxLines(1);
                frameLayout.addView(textView, c8.na.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
                TextView textView2 = new TextView(context);
                frameLayout.d = textView2;
                org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29739y6, null);
                textView2.setTextSize(1, 14.0f);
                frameLayout.addView(textView2, c8.na.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, frameLayout, null);
                n8Var = frameLayout;
            }
        } else {
            org.telegram.ui.Cells.n8 n8Var3 = new org.telegram.ui.Cells.n8(viewGroup.getContext());
            n8Var3.o(2131232101, org.telegram.messenger.hd.N0(2131747729, null), true);
            n8Var3.g(org.telegram.ui.ActionBar.m6.f29682v6, org.telegram.ui.ActionBar.m6.f29663u6);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, n8Var3, null);
            n8Var = n8Var3;
        }
        view = n8Var;
        return i5.c.q(view, view, -1, -2);
    }
}
