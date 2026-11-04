package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class ol0 implements TextView.OnEditorActionListener {
    public final nl0 f36852a;
    public final int f36853b;
    public final TLRPC.Reaction f36854c;
    public final org.telegram.ui.ActionBar.s1[] d;
    public final View f36855e;

    public ol0(nl0 nl0Var, int i3, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.s1[] s1VarArr, View view) {
        this.f36852a = nl0Var;
        this.f36853b = i3;
        this.f36854c = reaction;
        this.d = s1VarArr;
        this.f36855e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        if (i3 != 6) {
            return false;
        }
        nl0 nl0Var = this.f36852a;
        String obj = nl0Var.getText().toString();
        if (obj.length() > 12) {
            org.telegram.messenger.g0.F3(nl0Var);
            return true;
        }
        org.telegram.messenger.hp.s1(this.f36853b).l4(dh.n0.d(this.f36854c), obj);
        org.telegram.ui.ActionBar.s1[] s1VarArr = this.d;
        org.telegram.ui.ActionBar.s1 s1Var = s1VarArr[0];
        if (s1Var != null) {
            s1Var.dismiss();
        }
        if (s1VarArr[0] == tl0.I) {
            tl0.I = null;
        }
        View view = this.f36855e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
