package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class ml0 implements TextView.OnEditorActionListener {
    public final ll0 f36107a;
    public final int f36108b;
    public final TLRPC.Reaction f36109c;
    public final org.telegram.ui.ActionBar.u1[] d;
    public final View f36110e;

    public ml0(ll0 ll0Var, int i7, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.u1[] u1VarArr, View view) {
        this.f36107a = ll0Var;
        this.f36108b = i7;
        this.f36109c = reaction;
        this.d = u1VarArr;
        this.f36110e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        if (i7 != 6) {
            return false;
        }
        ll0 ll0Var = this.f36107a;
        String obj = ll0Var.getText().toString();
        if (obj.length() > 12) {
            org.telegram.messenger.g0.F3(ll0Var);
            return true;
        }
        org.telegram.messenger.qp.s1(this.f36108b).l4(ch.o0.d(this.f36109c), obj);
        org.telegram.ui.ActionBar.u1[] u1VarArr = this.d;
        org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
        if (u1Var != null) {
            u1Var.dismiss();
        }
        if (u1VarArr[0] == rl0.H) {
            rl0.H = null;
        }
        View view = this.f36110e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
