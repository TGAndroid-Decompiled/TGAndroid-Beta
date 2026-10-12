package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class pg1 extends pg.b {
    public final rg1 d;

    public pg1(rg1 rg1Var) {
        this.d = rg1Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 == 1 || i10 == 2 || i10 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.d.size();
    }

    @Override
    public final int j(int i10) {
        return ((qg1) this.d.d.get(i10)).f43203a;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        rg1 rg1Var = this.d;
        ArrayList arrayList = rg1Var.d;
        if (((qg1) arrayList.get(i10)).f43203a == 2) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) b1Var.f44838a;
            long j10 = rg1Var.f39797c;
            TLRPC.TL_forumTopic tL_forumTopic = ((qg1) arrayList.get(i10)).f39443c;
            org.telegram.ui.Components.z9 z9Var = paVar.f21714b;
            boolean z10 = false;
            og.d.p(z9Var, tL_forumTopic, false, false, null);
            if (z9Var != null && z9Var.getImageReceiver() != null && (z9Var.getImageReceiver().getDrawable() instanceof og.c)) {
                ((og.c) z9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19885c9, false));
            }
            paVar.f21715c.setText(tL_forumTopic.title);
            paVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j10, tL_forumTopic.f19268id));
            if (i10 == arrayList.size() - 1 || ((qg1) arrayList.get(i10 + 1)).f43203a == 2) {
                z10 = true;
            }
            paVar.f21713a = z10;
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        View view = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                        r8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        r8Var2.e(-1, org.telegram.ui.ActionBar.g6.f20122p7);
                        r8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
                        r8Var = r8Var2;
                    }
                    return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
                }
                r8Var = new org.telegram.ui.Cells.b7(viewGroup.getContext(), (org.telegram.ui.Cells.d0) null);
            } else {
                Context context = viewGroup.getContext();
                ?? frameLayout = new FrameLayout(context);
                org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
                frameLayout.f21714b = z9Var;
                frameLayout.addView(z9Var, w7.a6.a(30.0f, 20.0f, 0.0f, 0.0f, 0.0f, 30, 16));
                TextView textView = new TextView(context);
                frameLayout.f21715c = textView;
                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
                textView.setTextSize(1, 16.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setMaxLines(1);
                frameLayout.addView(textView, w7.a6.a(-2.0f, 72.0f, 8.0f, 12.0f, 0.0f, -1, 0));
                TextView textView2 = new TextView(context);
                frameLayout.d = textView2;
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20288y6, false));
                textView2.setTextSize(1, 14.0f);
                frameLayout.addView(textView2, w7.a6.a(-2.0f, 72.0f, 32.0f, 12.0f, 0.0f, -1, 0));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
                r8Var = frameLayout;
            }
        } else {
            org.telegram.ui.Cells.r8 r8Var3 = new org.telegram.ui.Cells.r8(viewGroup.getContext());
            r8Var3.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            r8Var3.e(org.telegram.ui.ActionBar.g6.f20233v6, org.telegram.ui.ActionBar.g6.f20216u6);
            r8Var3.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
            r8Var = r8Var3;
        }
        view = r8Var;
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}
