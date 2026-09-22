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
public final class jg1 extends og.b {
    public final lg1 d;

    public jg1(lg1 lg1Var) {
        this.d = lg1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42998f;
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
        return ((kg1) this.d.d.get(i10)).f15719a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        lg1 lg1Var = this.d;
        ArrayList arrayList = lg1Var.d;
        if (((kg1) arrayList.get(i10)).f15719a == 2) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) c1Var.f42995a;
            long j3 = lg1Var.f35462c;
            TLRPC.TL_forumTopic tL_forumTopic = ((kg1) arrayList.get(i10)).f35203c;
            org.telegram.ui.Components.v9 v9Var = saVar.f21092b;
            boolean z10 = false;
            ng.d.p(v9Var, tL_forumTopic, false, false, null);
            if (v9Var != null && v9Var.getImageReceiver() != null && (v9Var.getImageReceiver().getDrawable() instanceof ng.c)) {
                ((ng.c) v9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19094c9, false));
            }
            saVar.f21093c.setText(tL_forumTopic.title);
            saVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j3, tL_forumTopic.f18395id));
            saVar.f21091a = (i10 == arrayList.size() - 1 || ((kg1) arrayList.get(i10 + 1)).f15719a == 2) ? true : true;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s8 s8Var;
        View view = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        org.telegram.ui.Cells.s8 s8Var2 = new org.telegram.ui.Cells.s8(viewGroup.getContext());
                        s8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        s8Var2.e(-1, org.telegram.ui.ActionBar.j6.f19330p7);
                        s8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false));
                        s8Var = s8Var2;
                    }
                    return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
                }
                s8Var = new org.telegram.ui.Cells.c7(viewGroup.getContext(), (org.telegram.ui.Cells.c1) null);
            } else {
                Context context = viewGroup.getContext();
                ?? frameLayout = new FrameLayout(context);
                org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(context);
                frameLayout.f21092b = v9Var;
                frameLayout.addView(v9Var, w7.y5.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f21093c = textView;
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                textView.setTextSize(1, 16.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setMaxLines(1);
                frameLayout.addView(textView, w7.y5.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
                TextView textView2 = new TextView(context);
                frameLayout.d = textView2;
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19492y6, false));
                textView2.setTextSize(1, 14.0f);
                frameLayout.addView(textView2, w7.y5.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false));
                s8Var = frameLayout;
            }
        } else {
            org.telegram.ui.Cells.s8 s8Var3 = new org.telegram.ui.Cells.s8(viewGroup.getContext());
            s8Var3.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            s8Var3.e(org.telegram.ui.ActionBar.j6.f19440v6, org.telegram.ui.ActionBar.j6.f19422u6);
            s8Var3.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false));
            s8Var = s8Var3;
        }
        view = s8Var;
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
