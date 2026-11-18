package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ba1 implements org.telegram.ui.Components.oj0 {
    public final ea1 f45794a;

    public ba1(ea1 ea1Var) {
        this.f45794a = ea1Var;
    }

    @Override
    public final void c(int i7, View view) {
        ea1 ea1Var = this.f45794a;
        ArrayList arrayList = ea1Var.d;
        if (((da1) arrayList.get(i7)).f56589a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -ea1Var.f47147c);
            bundle.putBoolean("for_select", true);
            y91 y91Var = new y91(bundle);
            y91Var.B0 = ea1Var.f47148e;
            y91Var.f54095w = new z91(this);
            ea1Var.presentFragment(y91Var);
        }
        if (((da1) arrayList.get(i7)).f56589a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((da1) arrayList.get(i7)).f46849c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ea1Var.f47147c);
            bundle2.putLong("topic_id", tL_forumTopic.f28455id);
            bundle2.putBoolean("exception", false);
            jx0 jx0Var = new jx0(bundle2, null);
            jx0Var.f49094s = new aa1(this, tL_forumTopic);
            ea1Var.presentFragment(jx0Var);
        }
        if (((da1) arrayList.get(i7)).f56589a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ea1Var.getParentActivity());
            String M0 = org.telegram.messenger.gd.M0(2131747720, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
            u1Var.S = M0;
            u1Var.U = org.telegram.messenger.gd.M0(2131747721, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new z91(this));
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
            ea1Var.showDialog(u1Var);
            TextView textView = (TextView) u1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29635q7, null);
            }
        }
    }
}
