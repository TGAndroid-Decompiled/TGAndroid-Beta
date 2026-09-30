package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class sn0 implements TextView.OnEditorActionListener {
    public final rn0 f28299a;
    public final int f28300b;
    public final TLRPC.Reaction f28301c;
    public final org.telegram.ui.ActionBar.a2[] d;
    public final View e;

    public sn0(rn0 rn0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.a2[] a2VarArr, View view) {
        this.f28299a = rn0Var;
        this.f28300b = i10;
        this.f28301c = reaction;
        this.d = a2VarArr;
        this.e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        rn0 rn0Var = this.f28299a;
        String obj = rn0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(rn0Var);
            return true;
        }
        MessagesController.getInstance(this.f28300b).renameSavedReactionTag(zg.o0.d(this.f28301c), obj);
        org.telegram.ui.ActionBar.a2[] a2VarArr = this.d;
        org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
        if (a2Var != null) {
            a2Var.dismiss();
        }
        if (a2VarArr[0] == xn0.H) {
            xn0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
