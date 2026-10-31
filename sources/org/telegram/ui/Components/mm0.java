package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class mm0 implements TextView.OnEditorActionListener {
    public final lm0 f28557a;
    public final int f28558b;
    public final TLRPC.Reaction f28559c;
    public final org.telegram.ui.ActionBar.x1[] d;
    public final View e;

    public mm0(lm0 lm0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.x1[] x1VarArr, View view) {
        this.f28557a = lm0Var;
        this.f28558b = i10;
        this.f28559c = reaction;
        this.d = x1VarArr;
        this.e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        lm0 lm0Var = this.f28557a;
        String obj = lm0Var.getText().toString();
        if (obj.length() > 12) {
            org.telegram.messenger.i0.E3(lm0Var);
            return true;
        }
        org.telegram.messenger.vp.r1(this.f28558b).i4(obj, sg.o0.d(this.f28559c));
        org.telegram.ui.ActionBar.x1[] x1VarArr = this.d;
        org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
        if (x1Var != null) {
            x1Var.dismiss();
        }
        if (x1VarArr[0] == rm0.H) {
            rm0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
