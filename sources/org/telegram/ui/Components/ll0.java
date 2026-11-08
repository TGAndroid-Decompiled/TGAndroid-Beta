package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class ll0 implements TextView.OnEditorActionListener {
    public final kl0 f35714a;
    public final int f35715b;
    public final TLRPC.Reaction f35716c;
    public final org.telegram.ui.ActionBar.u1[] d;
    public final View f35717e;

    public ll0(kl0 kl0Var, int i7, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.u1[] u1VarArr, View view) {
        this.f35714a = kl0Var;
        this.f35715b = i7;
        this.f35716c = reaction;
        this.d = u1VarArr;
        this.f35717e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        if (i7 != 6) {
            return false;
        }
        kl0 kl0Var = this.f35714a;
        String obj = kl0Var.getText().toString();
        if (obj.length() > 12) {
            org.telegram.messenger.g0.F3(kl0Var);
            return true;
        }
        org.telegram.messenger.qp.s1(this.f35715b).l4(ch.o0.d(this.f35716c), obj);
        org.telegram.ui.ActionBar.u1[] u1VarArr = this.d;
        org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
        if (u1Var != null) {
            u1Var.dismiss();
        }
        if (u1VarArr[0] == ql0.H) {
            ql0.H = null;
        }
        View view = this.f35717e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
