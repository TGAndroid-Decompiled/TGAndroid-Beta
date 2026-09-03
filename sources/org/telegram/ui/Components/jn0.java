package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class jn0 implements TextView.OnEditorActionListener {
    public final in0 f28148a;
    public final int f28149b;
    public final TLRPC.Reaction f28150c;
    public final org.telegram.ui.ActionBar.d2[] d;
    public final View f28151e;

    public jn0(in0 in0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.d2[] d2VarArr, View view) {
        this.f28148a = in0Var;
        this.f28149b = i10;
        this.f28150c = reaction;
        this.d = d2VarArr;
        this.f28151e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        in0 in0Var = this.f28148a;
        String obj = in0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(in0Var);
            return true;
        }
        MessagesController.getInstance(this.f28149b).renameSavedReactionTag(ng.q0.d(this.f28150c), obj);
        org.telegram.ui.ActionBar.d2[] d2VarArr = this.d;
        org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
        if (d2Var != null) {
            d2Var.dismiss();
        }
        if (d2VarArr[0] == on0.E) {
            on0.E = null;
        }
        View view = this.f28151e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
