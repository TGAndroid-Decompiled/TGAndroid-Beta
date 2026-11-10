package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ca1 implements org.telegram.ui.Components.bj0 {
    public final fa1 f44287a;

    public ca1(fa1 fa1Var) {
        this.f44287a = fa1Var;
    }

    @Override
    public final void c(int i7, View view) {
        fa1 fa1Var = this.f44287a;
        ArrayList arrayList = fa1Var.d;
        if (((ea1) arrayList.get(i7)).f54543a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -fa1Var.f45671c);
            bundle.putBoolean("for_select", true);
            z91 z91Var = new z91(bundle);
            z91Var.A0 = fa1Var.f45672e;
            z91Var.f52386w = new aa1(this);
            fa1Var.presentFragment(z91Var);
        }
        if (((ea1) arrayList.get(i7)).f54543a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((ea1) arrayList.get(i7)).f45222c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", fa1Var.f45671c);
            bundle2.putLong("topic_id", tL_forumTopic.f27012id);
            bundle2.putBoolean("exception", false);
            lx0 lx0Var = new lx0(bundle2, null);
            lx0Var.f47730s = new ba1(this, tL_forumTopic);
            fa1Var.presentFragment(lx0Var);
        }
        if (((ea1) arrayList.get(i7)).f54543a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fa1Var.getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131747913, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131747914, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new aa1(this));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            fa1Var.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28131q7, null);
            }
        }
    }
}
