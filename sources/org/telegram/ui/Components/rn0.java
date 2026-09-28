package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class rn0 implements TextView.OnEditorActionListener {
    public final qn0 f28004a;
    public final int f28005b;
    public final TLRPC.Reaction f28006c;
    public final org.telegram.ui.ActionBar.a2[] d;
    public final View e;

    public rn0(qn0 qn0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.a2[] a2VarArr, View view) {
        this.f28004a = qn0Var;
        this.f28005b = i10;
        this.f28006c = reaction;
        this.d = a2VarArr;
        this.e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        qn0 qn0Var = this.f28004a;
        String obj = qn0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(qn0Var);
            return true;
        }
        MessagesController.getInstance(this.f28005b).renameSavedReactionTag(zg.o0.d(this.f28006c), obj);
        org.telegram.ui.ActionBar.a2[] a2VarArr = this.d;
        org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
        if (a2Var != null) {
            a2Var.dismiss();
        }
        if (a2VarArr[0] == wn0.H) {
            wn0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
