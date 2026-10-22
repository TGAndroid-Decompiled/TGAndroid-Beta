package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class bo0 implements TextView.OnEditorActionListener {
    public final ao0 f25002a;
    public final int f25003b;
    public final TLRPC.Reaction f25004c;
    public final org.telegram.ui.ActionBar.b2[] d;
    public final View e;

    public bo0(ao0 ao0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.f25002a = ao0Var;
        this.f25003b = i10;
        this.f25004c = reaction;
        this.d = b2VarArr;
        this.e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        ao0 ao0Var = this.f25002a;
        String obj = ao0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(ao0Var);
            return true;
        }
        MessagesController.getInstance(this.f25003b).renameSavedReactionTag(ah.i1.d(this.f25004c), obj);
        org.telegram.ui.ActionBar.b2[] b2VarArr = this.d;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
        }
        if (b2VarArr[0] == go0.H) {
            go0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
