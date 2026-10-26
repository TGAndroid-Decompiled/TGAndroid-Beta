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
public final class ef1 extends qg.b {
    public final gf1 d;

    public ef1(gf1 gf1Var) {
        this.d = gf1Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47741f;
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
        return ((ff1) this.d.d.get(i10)).f47040a;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        gf1 gf1Var = this.d;
        ArrayList arrayList = gf1Var.d;
        if (((ff1) arrayList.get(i10)).f47040a == 2) {
            org.telegram.ui.Cells.ta taVar = (org.telegram.ui.Cells.ta) e1Var.f47738a;
            long j10 = gf1Var.f39646c;
            TLRPC.TL_forumTopic tL_forumTopic = ((ff1) arrayList.get(i10)).f39358c;
            org.telegram.ui.Components.y9 y9Var = taVar.f25467b;
            boolean z10 = false;
            pg.d.p(y9Var, tL_forumTopic, false, false, null);
            if (y9Var != null && y9Var.getImageReceiver() != null && (y9Var.getImageReceiver().getDrawable() instanceof pg.c)) {
                ((pg.c) y9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23340c9, false));
            }
            taVar.f25468c.setText(tL_forumTopic.title);
            taVar.d.setText(MessagesController.getInstance(UserConfig.selectedAccount).getMutedString(j10, tL_forumTopic.f22079id));
            if (i10 == arrayList.size() - 1 || ((ff1) arrayList.get(i10 + 1)).f47040a == 2) {
                z10 = true;
            }
            taVar.f25466a = z10;
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v8 v8Var;
        View view = null;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        org.telegram.ui.Cells.v8 v8Var2 = new org.telegram.ui.Cells.v8(viewGroup.getContext());
                        v8Var2.k(LocaleController.getString(R.string.NotificationsDeleteAllException), false);
                        v8Var2.g(-1, org.telegram.ui.ActionBar.y6.f23581p7);
                        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, v8Var2, null);
                        v8Var = v8Var2;
                    }
                    return ic.a.n(view, view, -1, -2);
                }
                v8Var = new org.telegram.ui.Cells.f7(viewGroup.getContext(), (d3) null);
            } else {
                Context context = viewGroup.getContext();
                ?? frameLayout = new FrameLayout(context);
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                frameLayout.f25467b = y9Var;
                frameLayout.addView(y9Var, org.telegram.ui.Components.gb1.h(30, 30.0f, 16, 20.0f, 0.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                frameLayout.f25468c = textView;
                org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.G6, null, 1, 16.0f);
                textView.setMaxLines(1);
                frameLayout.addView(textView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 72.0f, 8.0f, 12.0f, 0.0f));
                TextView textView2 = new TextView(context);
                frameLayout.d = textView2;
                org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23748y6, null);
                textView2.setTextSize(1, 14.0f);
                frameLayout.addView(textView2, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 72.0f, 32.0f, 12.0f, 0.0f));
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, frameLayout, null);
                v8Var = frameLayout;
            }
        } else {
            org.telegram.ui.Cells.v8 v8Var3 = new org.telegram.ui.Cells.v8(viewGroup.getContext());
            v8Var3.o(R.drawable.msg_contact_add, LocaleController.getString(R.string.NotificationsAddAnException), true);
            v8Var3.g(org.telegram.ui.ActionBar.y6.f23692v6, org.telegram.ui.ActionBar.y6.f23673u6);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, v8Var3, null);
            v8Var = v8Var3;
        }
        view = v8Var;
        return ic.a.n(view, view, -1, -2);
    }
}
