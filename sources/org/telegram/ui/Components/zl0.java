package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class zl0 implements TextView.OnEditorActionListener {
    public final yl0 f42938a;
    public final int f42939b;
    public final TLRPC.Reaction f42940c;
    public final org.telegram.ui.ActionBar.t1[] d;
    public final View f42941e;

    public zl0(yl0 yl0Var, int i7, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.t1[] t1VarArr, View view) {
        this.f42938a = yl0Var;
        this.f42939b = i7;
        this.f42940c = reaction;
        this.d = t1VarArr;
        this.f42941e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        if (i7 != 6) {
            return false;
        }
        yl0 yl0Var = this.f42938a;
        String obj = yl0Var.getText().toString();
        if (obj.length() > 12) {
            org.telegram.messenger.g0.D3(yl0Var);
            return true;
        }
        org.telegram.messenger.np.u1(this.f42939b).t4(ch.p0.d(this.f42940c), obj);
        org.telegram.ui.ActionBar.t1[] t1VarArr = this.d;
        org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
        if (t1Var != null) {
            t1Var.dismiss();
        }
        if (t1VarArr[0] == em0.I) {
            em0.I = null;
        }
        View view = this.f42941e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
