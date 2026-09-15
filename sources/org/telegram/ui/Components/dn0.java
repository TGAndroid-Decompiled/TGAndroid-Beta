package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class dn0 implements TextView.OnEditorActionListener {
    public final cn0 f23367a;
    public final int f23368b;
    public final TLRPC.Reaction f23369c;
    public final org.telegram.ui.ActionBar.b2[] d;
    public final View e;

    public dn0(cn0 cn0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.f23367a = cn0Var;
        this.f23368b = i10;
        this.f23369c = reaction;
        this.d = b2VarArr;
        this.e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        cn0 cn0Var = this.f23367a;
        String obj = cn0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(cn0Var);
            return true;
        }
        MessagesController.getInstance(this.f23368b).renameSavedReactionTag(zg.p0.d(this.f23369c), obj);
        org.telegram.ui.ActionBar.b2[] b2VarArr = this.d;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
        }
        if (b2VarArr[0] == in0.H) {
            in0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
