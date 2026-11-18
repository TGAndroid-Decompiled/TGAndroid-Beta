package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class xl0 implements TextView.OnEditorActionListener {
    public final wl0 f42141a;
    public final int f42142b;
    public final TLRPC.Reaction f42143c;
    public final org.telegram.ui.ActionBar.u1[] d;
    public final View f42144e;

    public xl0(wl0 wl0Var, int i7, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.u1[] u1VarArr, View view) {
        this.f42141a = wl0Var;
        this.f42142b = i7;
        this.f42143c = reaction;
        this.d = u1VarArr;
        this.f42144e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        if (i7 != 6) {
            return false;
        }
        wl0 wl0Var = this.f42141a;
        String obj = wl0Var.getText().toString();
        if (obj.length() > 12) {
            org.telegram.messenger.g0.D3(wl0Var);
            return true;
        }
        org.telegram.messenger.mp.u1(this.f42142b).t4(ch.p0.d(this.f42143c), obj);
        org.telegram.ui.ActionBar.u1[] u1VarArr = this.d;
        org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
        if (u1Var != null) {
            u1Var.dismiss();
        }
        if (u1VarArr[0] == cm0.I) {
            cm0.I = null;
        }
        View view = this.f42144e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
