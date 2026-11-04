package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class p91 implements org.telegram.ui.Components.fj0 {
    public final s91 f48498a;

    public p91(s91 s91Var) {
        this.f48498a = s91Var;
    }

    @Override
    public final void f(int i3, View view) {
        s91 s91Var = this.f48498a;
        ArrayList arrayList = s91Var.d;
        if (((r91) arrayList.get(i3)).f54715a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -s91Var.f49453c);
            bundle.putBoolean("for_select", true);
            m91 m91Var = new m91(bundle);
            m91Var.B0 = s91Var.f49454e;
            m91Var.f47619w = new n91(this);
            s91Var.presentFragment(m91Var);
        }
        if (((r91) arrayList.get(i3)).f54715a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((r91) arrayList.get(i3)).f49148c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", s91Var.f49453c);
            bundle2.putLong("topic_id", tL_forumTopic.f27053id);
            bundle2.putBoolean("exception", false);
            yw0 yw0Var = new yw0(bundle2, null);
            yw0Var.f52429s = new o91(this, tL_forumTopic);
            s91Var.presentFragment(yw0Var);
        }
        if (((r91) arrayList.get(i3)).f54715a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s91Var.getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(2131747921, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131747922, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new n91(this));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            s91Var.showDialog(s1Var);
            TextView textView = (TextView) s1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, null);
            }
        }
    }
}
