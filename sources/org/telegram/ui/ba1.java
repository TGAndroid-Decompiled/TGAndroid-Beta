package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ba1 implements org.telegram.ui.Components.qj0 {
    public final ea1 f45830a;

    public ba1(ea1 ea1Var) {
        this.f45830a = ea1Var;
    }

    @Override
    public final void c(int i7, View view) {
        ea1 ea1Var = this.f45830a;
        ArrayList arrayList = ea1Var.d;
        if (((da1) arrayList.get(i7)).f56634a == 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -ea1Var.f47220c);
            bundle.putBoolean("for_select", true);
            y91 y91Var = new y91(bundle);
            y91Var.B0 = ea1Var.f47221e;
            y91Var.f54144w = new z91(this);
            ea1Var.presentFragment(y91Var);
        }
        if (((da1) arrayList.get(i7)).f56634a == 2) {
            TLRPC.TL_forumTopic tL_forumTopic = ((da1) arrayList.get(i7)).f46909c;
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ea1Var.f47220c);
            bundle2.putLong("topic_id", tL_forumTopic.f28486id);
            bundle2.putBoolean("exception", false);
            jx0 jx0Var = new jx0(bundle2, null);
            jx0Var.f49131s = new aa1(this, tL_forumTopic);
            ea1Var.presentFragment(jx0Var);
        }
        if (((da1) arrayList.get(i7)).f56634a == 4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ea1Var.getParentActivity());
            String N0 = org.telegram.messenger.hd.N0(2131747719, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.hd.N0(2131747720, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new z91(this));
            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
            ea1Var.showDialog(t1Var);
            TextView textView = (TextView) t1Var.d(-1);
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29622q7, null);
            }
        }
    }
}
