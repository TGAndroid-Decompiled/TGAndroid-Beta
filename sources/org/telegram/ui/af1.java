package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

public final class af1 extends xf.b {
    public final cf1 d;

    public af1(cf1 cf1Var) {
        this.d = cf1Var;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        return i10 == 1 || i10 == 2 || i10 == 4;
    }

    @Override
    public final int h() {
        return this.d.d.size();
    }

    @Override
    public final int j(int i10) {
        return ((bf1) this.d.d.get(i10)).f49413a;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        cf1 cf1Var = this.d;
        ArrayList arrayList = cf1Var.d;
        if (((bf1) arrayList.get(i10)).f49413a == 2) {
            org.telegram.ui.Cells.ka kaVar = (org.telegram.ui.Cells.ka) o1Var.f5789a;
            long j10 = cf1Var.f37079c;
            TLRPC.TL_forumTopic tL_forumTopic = ((bf1) arrayList.get(i10)).f36810c;
            org.telegram.ui.Components.n9 n9Var = kaVar.f24605b;
            wf.c.p(n9Var, tL_forumTopic, false, false, null);
            if (n9Var != null && n9Var.getImageReceiver() != null && (n9Var.getImageReceiver().getDrawable() instanceof wf.b)) {
                ((wf.b) n9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23039c9, false));
            }
            kaVar.f24606c.setText(tL_forumTopic.title);
            kaVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j10, tL_forumTopic.f22432id));
            kaVar.f24604a = i10 == arrayList.size() - 1 || ((bf1) arrayList.get(i10 + 1)).f49413a == 2;
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        Object w6Var;
        ?? r10 = 0;
        if (i10 == 1) {
            org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(viewGroup.getContext());
            l8Var.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            l8Var.e(org.telegram.ui.ActionBar.g6.f23373v6, org.telegram.ui.ActionBar.g6.f23357u6);
            l8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            w6Var = l8Var;
        } else if (i10 == 2) {
            Context context = viewGroup.getContext();
            org.telegram.ui.Cells.ka kaVar = new org.telegram.ui.Cells.ka(context);
            org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
            kaVar.f24605b = n9Var;
            kaVar.addView(n9Var, h7.z5.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            kaVar.f24606c = textView;
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
            textView.setTextSize(1, 16.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setMaxLines(1);
            kaVar.addView(textView, h7.z5.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
            TextView textView2 = new TextView(context);
            kaVar.d = textView2;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23423y6, false));
            textView2.setTextSize(1, 14.0f);
            kaVar.addView(textView2, h7.z5.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
            kaVar.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
            w6Var = kaVar;
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(viewGroup.getContext());
                    l8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                    l8Var2.e(-1, org.telegram.ui.ActionBar.g6.f23269p7);
                    l8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
                    w6Var = l8Var2;
                }
                return org.telegram.ui.Cells.pa.l(r10, r10, -1, -2);
            }
            w6Var = new org.telegram.ui.Cells.w6(viewGroup.getContext(), (org.telegram.messenger.rl) null);
        }
        r10 = w6Var;
        return org.telegram.ui.Cells.pa.l(r10, r10, -1, -2);
    }
}
