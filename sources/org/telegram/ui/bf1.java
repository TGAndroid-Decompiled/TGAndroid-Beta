package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class bf1 extends pg.b {
    public final df1 d;

    public bf1(df1 df1Var) {
        this.d = df1Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46345f;
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
        return ((cf1) this.d.d.get(i10)).f44712a;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        df1 df1Var = this.d;
        ArrayList arrayList = df1Var.d;
        if (((cf1) arrayList.get(i10)).f44712a == 2) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) b1Var.f46342a;
            long j10 = df1Var.f36621c;
            TLRPC.TL_forumTopic tL_forumTopic = ((cf1) arrayList.get(i10)).f36326c;
            org.telegram.ui.Components.u9 u9Var = paVar.f22909b;
            boolean z10 = false;
            og.d.p(u9Var, tL_forumTopic, false, false, null);
            if (u9Var != null && u9Var.getImageReceiver() != null && (u9Var.getImageReceiver().getDrawable() instanceof og.c)) {
                ((og.c) u9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21168c9, false));
            }
            paVar.f22910c.setText(tL_forumTopic.title);
            paVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j10, tL_forumTopic.f20396id));
            if (i10 == arrayList.size() - 1 || ((cf1) arrayList.get(i10 + 1)).f44712a == 2) {
                z10 = true;
            }
            paVar.f22908a = z10;
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
                        r8Var2.k(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        r8Var2.g(-1, org.telegram.ui.ActionBar.k6.f21405p7);
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, r8Var2, null);
                        r8Var = r8Var2;
                    }
                    return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
                }
                r8Var = new org.telegram.ui.Cells.b7(viewGroup.getContext(), (org.telegram.ui.Cells.b1) null);
            } else {
                Context context = viewGroup.getContext();
                ?? frameLayout = new FrameLayout(context);
                org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
                frameLayout.f22909b = u9Var;
                frameLayout.addView(u9Var, w7.z5.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f22910c = textView;
                org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.G6, null, 1, 16.0f);
                textView.setMaxLines(1);
                frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
                TextView textView2 = new TextView(context);
                frameLayout.d = textView2;
                org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21572y6, null);
                textView2.setTextSize(1, 14.0f);
                frameLayout.addView(textView2, w7.z5.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, frameLayout, null);
                r8Var = frameLayout;
            }
        } else {
            org.telegram.ui.Cells.r8 r8Var3 = new org.telegram.ui.Cells.r8(viewGroup.getContext());
            r8Var3.o(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            r8Var3.g(org.telegram.ui.ActionBar.k6.f21517v6, org.telegram.ui.ActionBar.k6.f21500u6);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, r8Var3, null);
            r8Var = r8Var3;
        }
        view = r8Var;
        return com.google.android.gms.internal.play_billing.k3.l(view, view, -1, -2);
    }
}
