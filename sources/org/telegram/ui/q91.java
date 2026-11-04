package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class q91 extends sg.b {
    public final s91 d;

    public q91(s91 s91Var) {
        this.d = s91Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 == 1 || i3 == 2 || i3 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.d.d.size();
    }

    @Override
    public final int d(int i3) {
        return ((r91) this.d.d.get(i3)).f54715a;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        long j10;
        String M0;
        s91 s91Var = this.d;
        ArrayList arrayList = s91Var.d;
        if (((r91) arrayList.get(i3)).f54715a == 2) {
            org.telegram.ui.Cells.ia iaVar = (org.telegram.ui.Cells.ia) d1Var.f55540a;
            long j11 = s91Var.f49453c;
            TLRPC.TL_forumTopic tL_forumTopic = ((r91) arrayList.get(i3)).f49148c;
            org.telegram.ui.Components.k9 k9Var = iaVar.f29396b;
            boolean z10 = false;
            rg.c.p(k9Var, tL_forumTopic, false, false, null);
            if (k9Var != null && k9Var.getImageReceiver() != null && (k9Var.getImageReceiver().t() instanceof rg.b)) {
                ((rg.b) k9Var.getImageReceiver().t()).a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27864c9, false));
            }
            iaVar.f29397c.setText(tL_forumTopic.title);
            TextView textView = iaVar.d;
            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0);
            if (s12.getMessagesController().r2(j11, tL_forumTopic.f27053id, null)) {
                int i10 = s12.f22989d7.getInt("notifyuntil_" + org.telegram.messenger.us.v(j11, j10, false), 0);
                if (i10 >= s12.getConnectionsManager().getCurrentTime()) {
                    M0 = org.telegram.messenger.bd.a0("NotificationsMutedForHint", null, 2131747908, org.telegram.messenger.bd.c0(i10));
                } else {
                    M0 = org.telegram.messenger.bd.M0(2131747909, null);
                }
            } else {
                M0 = org.telegram.messenger.bd.M0(2131747864, null);
            }
            textView.setText(M0);
            if (i3 == arrayList.size() - 1 || ((r91) arrayList.get(i3 + 1)).f54715a == 2) {
                z10 = true;
            }
            iaVar.f29395a = z10;
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.l8 l8Var;
        View view = null;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                        l8Var2.k(org.telegram.messenger.bd.M0(2131747923, null), false);
                        l8Var2.g(-1, org.telegram.ui.ActionBar.k6.f28102p7);
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, l8Var2, null);
                        l8Var = l8Var2;
                    }
                    return k2.p1.p(view, view, -1, -2);
                }
                l8Var = new org.telegram.ui.Cells.x6(viewGroup.getContext(), (org.telegram.ui.Cells.f1) null);
            } else {
                Context context = viewGroup.getContext();
                ?? frameLayout = new FrameLayout(context);
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
                frameLayout.f29396b = k9Var;
                frameLayout.addView(k9Var, b8.mf.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f29397c = textView;
                org.telegram.messenger.k5.n(textView, org.telegram.ui.ActionBar.k6.G6, null, 1, 16.0f);
                textView.setMaxLines(1);
                frameLayout.addView(textView, b8.mf.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
                TextView textView2 = new TextView(context);
                frameLayout.d = textView2;
                org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28273y6, null);
                textView2.setTextSize(1, 14.0f);
                frameLayout.addView(textView2, b8.mf.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, frameLayout, null);
                l8Var = frameLayout;
            }
        } else {
            org.telegram.ui.Cells.l8 l8Var3 = new org.telegram.ui.Cells.l8(viewGroup.getContext());
            l8Var3.o(2131232099, org.telegram.messenger.bd.M0(2131747931, null), true);
            l8Var3.g(org.telegram.ui.ActionBar.k6.f28214v6, org.telegram.ui.ActionBar.k6.f28196u6);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, l8Var3, null);
            l8Var = l8Var3;
        }
        view = l8Var;
        return k2.p1.p(view, view, -1, -2);
    }
}
