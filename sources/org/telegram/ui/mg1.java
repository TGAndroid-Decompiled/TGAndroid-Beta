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
public final class mg1 extends ng.b {
    public final og1 d;

    public mg1(og1 og1Var) {
        this.d = og1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f41613f;
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
        return ((ng1) this.d.d.get(i10)).f14046a;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        og1 og1Var = this.d;
        ArrayList arrayList = og1Var.d;
        if (((ng1) arrayList.get(i10)).f14046a == 2) {
            org.telegram.ui.Cells.ta taVar = (org.telegram.ui.Cells.ta) c1Var.f41610a;
            long j3 = og1Var.f35494c;
            TLRPC.TL_forumTopic tL_forumTopic = ((ng1) arrayList.get(i10)).f35271c;
            org.telegram.ui.Components.w9 w9Var = taVar.f20462b;
            boolean z10 = false;
            mg.d.p(w9Var, tL_forumTopic, false, false, null);
            if (w9Var != null && w9Var.getImageReceiver() != null && (w9Var.getImageReceiver().getDrawable() instanceof mg.c)) {
                ((mg.c) w9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17913c9, false));
            }
            taVar.f20463c.setText(tL_forumTopic.title);
            taVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j3, tL_forumTopic.f17247id));
            taVar.f20461a = (i10 == arrayList.size() - 1 || ((ng1) arrayList.get(i10 + 1)).f14046a == 2) ? true : true;
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
                        s8Var2.e(-1, org.telegram.ui.ActionBar.j6.f18144p7);
                        s8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                        s8Var = s8Var2;
                    }
                    return com.google.android.gms.internal.vision.e2.j(view, view, -1, -2);
                }
                s8Var = new org.telegram.ui.Cells.c7(viewGroup.getContext(), (org.telegram.ui.Cells.r6) null);
            } else {
                Context context = viewGroup.getContext();
                ?? frameLayout = new FrameLayout(context);
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
                frameLayout.f20462b = w9Var;
                frameLayout.addView(w9Var, w7.a6.d(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f20463c = textView;
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                textView.setTextSize(1, 16.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setMaxLines(1);
                frameLayout.addView(textView, w7.a6.d(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
                TextView textView2 = new TextView(context);
                frameLayout.d = textView2;
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18306y6, false));
                textView2.setTextSize(1, 14.0f);
                frameLayout.addView(textView2, w7.a6.d(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
                s8Var = frameLayout;
            }
        } else {
            org.telegram.ui.Cells.s8 s8Var3 = new org.telegram.ui.Cells.s8(viewGroup.getContext());
            s8Var3.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            s8Var3.e(org.telegram.ui.ActionBar.j6.f18254v6, org.telegram.ui.ActionBar.j6.f18236u6);
            s8Var3.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
            s8Var = s8Var3;
        }
        view = s8Var;
        return com.google.android.gms.internal.vision.e2.j(view, view, -1, -2);
    }
}
