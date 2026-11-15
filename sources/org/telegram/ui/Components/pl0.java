package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class pl0 implements TextView.OnEditorActionListener {
    public final ol0 f38327a;
    public final int f38328b;
    public final TLRPC.Reaction f38329c;
    public final org.telegram.ui.ActionBar.t1[] d;
    public final View f38330e;

    public pl0(ol0 ol0Var, int i7, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.t1[] t1VarArr, View view) {
        this.f38327a = ol0Var;
        this.f38328b = i7;
        this.f38329c = reaction;
        this.d = t1VarArr;
        this.f38330e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        if (i7 != 6) {
            return false;
        }
        ol0 ol0Var = this.f38327a;
        String obj = ol0Var.getText().toString();
        if (obj.length() > 12) {
            org.telegram.messenger.g0.E3(ol0Var);
            return true;
        }
        org.telegram.messenger.np.s1(this.f38328b).l4(ch.p0.d(this.f38329c), obj);
        org.telegram.ui.ActionBar.t1[] t1VarArr = this.d;
        org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
        if (t1Var != null) {
            t1Var.dismiss();
        }
        if (t1VarArr[0] == ul0.I) {
            ul0.I = null;
        }
        View view = this.f38330e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
