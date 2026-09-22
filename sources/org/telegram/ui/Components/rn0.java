package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class rn0 implements TextView.OnEditorActionListener {
    public final qn0 f28016a;
    public final int f28017b;
    public final TLRPC.Reaction f28018c;
    public final org.telegram.ui.ActionBar.b2[] d;
    public final View e;

    public rn0(qn0 qn0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.f28016a = qn0Var;
        this.f28017b = i10;
        this.f28018c = reaction;
        this.d = b2VarArr;
        this.e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        qn0 qn0Var = this.f28016a;
        String obj = qn0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(qn0Var);
            return true;
        }
        MessagesController.getInstance(this.f28017b).renameSavedReactionTag(zg.p0.d(this.f28018c), obj);
        org.telegram.ui.ActionBar.b2[] b2VarArr = this.d;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
        }
        if (b2VarArr[0] == wn0.H) {
            wn0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
