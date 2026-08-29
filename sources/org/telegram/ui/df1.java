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
public final class df1 extends zf.b {
    public final ff1 d;

    public df1(ff1 ff1Var) {
        this.d = ff1Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
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
        return ((ef1) this.d.d.get(i10)).f50845a;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        ff1 ff1Var = this.d;
        ArrayList arrayList = ff1Var.d;
        if (((ef1) arrayList.get(i10)).f50845a == 2) {
            org.telegram.ui.Cells.la laVar = (org.telegram.ui.Cells.la) n1Var.f6432a;
            long j10 = ff1Var.f38145c;
            TLRPC.TL_forumTopic tL_forumTopic = ((ef1) arrayList.get(i10)).f37806c;
            org.telegram.ui.Components.t9 t9Var = laVar.f24658b;
            boolean z10 = false;
            yf.d.p(t9Var, tL_forumTopic, false, false, null);
            if (t9Var != null && t9Var.getImageReceiver() != null && (t9Var.getImageReceiver().getDrawable() instanceof yf.c)) {
                ((yf.c) t9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23047c9, false));
            }
            laVar.f24659c.setText(tL_forumTopic.title);
            laVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j10, tL_forumTopic.f22444id));
            laVar.f24657a = (i10 == arrayList.size() - 1 || ((ef1) arrayList.get(i10 + 1)).f50845a == 2) ? true : true;
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m8 m8Var;
        View view = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(viewGroup.getContext());
                        m8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        m8Var2.e(-1, org.telegram.ui.ActionBar.g6.f23279p7);
                        m8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                        m8Var = m8Var2;
                    }
                    return th.m(view, view, -1, -2);
                }
                m8Var = new org.telegram.ui.Cells.x6(viewGroup.getContext(), (b) null);
            } else {
                Context context = viewGroup.getContext();
                ?? frameLayout = new FrameLayout(context);
                org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
                frameLayout.f24658b = t9Var;
                frameLayout.addView(t9Var, i7.f6.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f24659c = textView;
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
                textView.setTextSize(1, 16.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setMaxLines(1);
                frameLayout.addView(textView, i7.f6.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
                TextView textView2 = new TextView(context);
                frameLayout.d = textView2;
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23433y6, false));
                textView2.setTextSize(1, 14.0f);
                frameLayout.addView(textView2, i7.f6.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
                m8Var = frameLayout;
            }
        } else {
            org.telegram.ui.Cells.m8 m8Var3 = new org.telegram.ui.Cells.m8(viewGroup.getContext());
            m8Var3.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            m8Var3.e(org.telegram.ui.ActionBar.g6.f23383v6, org.telegram.ui.ActionBar.g6.f23365u6);
            m8Var3.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
            m8Var = m8Var3;
        }
        view = m8Var;
        return th.m(view, view, -1, -2);
    }
}
