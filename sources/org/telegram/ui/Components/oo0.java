package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class oo0 implements TextView.OnEditorActionListener {
    public final no0 f29265a;
    public final int f29266b;
    public final TLRPC.Reaction f29267c;
    public final org.telegram.ui.ActionBar.a2[] d;
    public final View f29268e;

    public oo0(no0 no0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.a2[] a2VarArr, View view) {
        this.f29265a = no0Var;
        this.f29266b = i10;
        this.f29267c = reaction;
        this.d = a2VarArr;
        this.f29268e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        no0 no0Var = this.f29265a;
        String obj = no0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(no0Var);
            return true;
        }
        MessagesController.getInstance(this.f29266b).renameSavedReactionTag(zg.n0.d(this.f29267c), obj);
        org.telegram.ui.ActionBar.a2[] a2VarArr = this.d;
        org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
        if (a2Var != null) {
            a2Var.dismiss();
        }
        if (a2VarArr[0] == to0.H) {
            to0.H = null;
        }
        View view = this.f29268e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
