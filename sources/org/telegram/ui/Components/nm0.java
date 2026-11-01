package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class nm0 implements TextView.OnEditorActionListener {
    public final mm0 f28921a;
    public final int f28922b;
    public final TLRPC.Reaction f28923c;
    public final org.telegram.ui.ActionBar.x1[] d;
    public final View e;

    public nm0(mm0 mm0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.x1[] x1VarArr, View view) {
        this.f28921a = mm0Var;
        this.f28922b = i10;
        this.f28923c = reaction;
        this.d = x1VarArr;
        this.e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        mm0 mm0Var = this.f28921a;
        String obj = mm0Var.getText().toString();
        if (obj.length() > 12) {
            org.telegram.messenger.i0.E3(mm0Var);
            return true;
        }
        org.telegram.messenger.wp.r1(this.f28922b).i4(obj, sg.o0.d(this.f28923c));
        org.telegram.ui.ActionBar.x1[] x1VarArr = this.d;
        org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
        if (x1Var != null) {
            x1Var.dismiss();
        }
        if (x1VarArr[0] == sm0.H) {
            sm0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
