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
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47706f;
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
        return ((kg1) this.d.d.get(i10)).f17129a;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        lg1 lg1Var = this.d;
        ArrayList arrayList = lg1Var.d;
        if (((kg1) arrayList.get(i10)).f17129a == 2) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) d1Var.f47702a;
            long j3 = lg1Var.f39620c;
            TLRPC.TL_forumTopic tL_forumTopic = ((kg1) arrayList.get(i10)).f39334c;
            org.telegram.ui.Components.y9 y9Var = paVar.f22673b;
            boolean z10 = false;
            ng.d.p(y9Var, tL_forumTopic, false, false, null);
            if (y9Var != null && y9Var.getImageReceiver() != null && (y9Var.getImageReceiver().getDrawable() instanceof ng.c)) {
                ((ng.c) y9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20787c9, false));
            }
            paVar.f22674c.setText(tL_forumTopic.title);
            paVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j3, tL_forumTopic.f20094id));
            if (i10 == arrayList.size() - 1 || ((kg1) arrayList.get(i10 + 1)).f17129a == 2) {
                z10 = true;
            }
            paVar.f22672a = z10;
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.r8 r8Var;
        View view = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(viewGroup.getContext());
                        r8Var2.i(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        r8Var2.e(-1, org.telegram.ui.ActionBar.i6.f21022p7);
                        r8Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false));
                        r8Var = r8Var2;
                    }
                    return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
                }
                r8Var = new org.telegram.ui.Cells.b7(viewGroup.getContext(), (org.telegram.ui.Cells.c1) null);
            } else {
                Context context = viewGroup.getContext();
                ?? frameLayout = new FrameLayout(context);
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                frameLayout.f22673b = y9Var;
                frameLayout.addView(y9Var, w7.x5.a(30.0f, 20.0f, 0.0f, 0.0f, 0.0f, 30, 16));
                TextView textView = new TextView(context);
                frameLayout.f22674c = textView;
                textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
                textView.setTextSize(1, 16.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setMaxLines(1);
                frameLayout.addView(textView, w7.x5.a(-2.0f, 72.0f, 8.0f, 12.0f, 0.0f, -1, 0));
                TextView textView2 = new TextView(context);
                frameLayout.d = textView2;
                textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21185y6, false));
                textView2.setTextSize(1, 14.0f);
                frameLayout.addView(textView2, w7.x5.a(-2.0f, 72.0f, 32.0f, 12.0f, 0.0f, -1, 0));
                frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false));
                r8Var = frameLayout;
            }
        } else {
            org.telegram.ui.Cells.r8 r8Var3 = new org.telegram.ui.Cells.r8(viewGroup.getContext());
            r8Var3.m(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            r8Var3.e(org.telegram.ui.ActionBar.i6.f21132v6, org.telegram.ui.ActionBar.i6.f21114u6);
            r8Var3.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false));
            r8Var = r8Var3;
        }
        view = r8Var;
        return com.google.android.gms.internal.vision.e2.k(view, view, -1, -2);
    }
}
