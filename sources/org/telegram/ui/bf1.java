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
public final class bf1 extends wf.b {
    public final df1 d;

    public bf1(df1 df1Var) {
        this.d = df1Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 == 1 || i9 == 2 || i9 == 4) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.d.d.size();
    }

    @Override
    public final int j(int i9) {
        return ((cf1) this.d.d.get(i9)).f48814a;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        df1 df1Var = this.d;
        ArrayList arrayList = df1Var.d;
        if (((cf1) arrayList.get(i9)).f48814a == 2) {
            org.telegram.ui.Cells.oa oaVar = (org.telegram.ui.Cells.oa) q1Var.f5501a;
            long j10 = df1Var.f37532c;
            TLRPC.TL_forumTopic tL_forumTopic = ((cf1) arrayList.get(i9)).f37197c;
            org.telegram.ui.Components.o9 o9Var = oaVar.f24848b;
            boolean z10 = false;
            vf.c.p(o9Var, tL_forumTopic, false, false, null);
            if (o9Var != null && o9Var.getImageReceiver() != null && (o9Var.getImageReceiver().getDrawable() instanceof vf.b)) {
                ((vf.b) o9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22986c9, false));
            }
            oaVar.f24849c.setText(tL_forumTopic.title);
            oaVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j10, tL_forumTopic.f22432id));
            oaVar.f24847a = (i9 == arrayList.size() - 1 || ((cf1) arrayList.get(i9 + 1)).f48814a == 2) ? true : true;
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.p8 p8Var;
        View view = null;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 == 4) {
                        org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(viewGroup.getContext());
                        p8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        p8Var2.e(-1, org.telegram.ui.ActionBar.f6.f23212p7);
                        p8Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                        p8Var = p8Var2;
                    }
                    return j3.r0.s(view, view, -1, -2);
                }
                p8Var = new org.telegram.ui.Cells.z6(viewGroup.getContext(), (org.telegram.ui.Cells.j2) null);
            } else {
                Context context = viewGroup.getContext();
                ?? frameLayout = new FrameLayout(context);
                org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
                frameLayout.f24848b = o9Var;
                frameLayout.addView(o9Var, g7.e6.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f24849c = textView;
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
                textView.setTextSize(1, 16.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setMaxLines(1);
                frameLayout.addView(textView, g7.e6.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
                TextView textView2 = new TextView(context);
                frameLayout.d = textView2;
                textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23369y6, false));
                textView2.setTextSize(1, 14.0f);
                frameLayout.addView(textView2, g7.e6.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
                p8Var = frameLayout;
            }
        } else {
            org.telegram.ui.Cells.p8 p8Var3 = new org.telegram.ui.Cells.p8(viewGroup.getContext());
            p8Var3.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            p8Var3.e(org.telegram.ui.ActionBar.f6.f23319v6, org.telegram.ui.ActionBar.f6.f23303u6);
            p8Var3.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
            p8Var = p8Var3;
        }
        view = p8Var;
        return j3.r0.s(view, view, -1, -2);
    }
}
