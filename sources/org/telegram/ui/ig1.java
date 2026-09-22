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
public final class ig1 extends og.b {
    public final kg1 d;

    public ig1(kg1 kg1Var) {
        this.d = kg1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42674f;
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
        return ((jg1) this.d.d.get(i10)).f15531a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        kg1 kg1Var = this.d;
        ArrayList arrayList = kg1Var.d;
        if (((jg1) arrayList.get(i10)).f15531a == 2) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) c1Var.f42671a;
            long j3 = kg1Var.f35158c;
            TLRPC.TL_forumTopic tL_forumTopic = ((jg1) arrayList.get(i10)).f34908c;
            org.telegram.ui.Components.u9 u9Var = saVar.f20954b;
            boolean z10 = false;
            ng.d.p(u9Var, tL_forumTopic, false, false, null);
            if (u9Var != null && u9Var.getImageReceiver() != null && (u9Var.getImageReceiver().getDrawable() instanceof ng.c)) {
                ((ng.c) u9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18819c9, false));
            }
            saVar.f20955c.setText(tL_forumTopic.title);
            saVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j3, tL_forumTopic.f18161id));
            saVar.f20953a = (i10 == arrayList.size() - 1 || ((jg1) arrayList.get(i10 + 1)).f15531a == 2) ? true : true;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        View view = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                        r8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        r8Var2.e(-1, org.telegram.ui.ActionBar.i6.f19053p7);
                        r8Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18834d6, false));
                        r8Var = r8Var2;
                    }
                    return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
                }
                r8Var = new org.telegram.ui.Cells.a7(viewGroup.getContext(), (org.telegram.ui.Cells.q3) null);
            } else {
                Context context = viewGroup.getContext();
                ?? frameLayout = new FrameLayout(context);
                org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
                frameLayout.f20954b = u9Var;
                frameLayout.addView(u9Var, w7.x5.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f20955c = textView;
                textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
                textView.setTextSize(1, 16.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setMaxLines(1);
                frameLayout.addView(textView, w7.x5.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
                TextView textView2 = new TextView(context);
                frameLayout.d = textView2;
                textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19215y6, false));
                textView2.setTextSize(1, 14.0f);
                frameLayout.addView(textView2, w7.x5.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18834d6, false));
                r8Var = frameLayout;
            }
        } else {
            org.telegram.ui.Cells.r8 r8Var3 = new org.telegram.ui.Cells.r8(viewGroup.getContext());
            r8Var3.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            r8Var3.e(org.telegram.ui.ActionBar.i6.f19163v6, org.telegram.ui.ActionBar.i6.f19145u6);
            r8Var3.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18834d6, false));
            r8Var = r8Var3;
        }
        view = r8Var;
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
