package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class io0 implements TextView.OnEditorActionListener {
    public final ho0 f27444a;
    public final int f27445b;
    public final TLRPC.Reaction f27446c;
    public final org.telegram.ui.ActionBar.b2[] d;
    public final View f27447e;

    public io0(ho0 ho0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.f27444a = ho0Var;
        this.f27445b = i10;
        this.f27446c = reaction;
        this.d = b2VarArr;
        this.f27447e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        ho0 ho0Var = this.f27444a;
        String obj = ho0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(ho0Var);
            return true;
        }
        MessagesController.getInstance(this.f27445b).renameSavedReactionTag(zg.n0.d(this.f27446c), obj);
        org.telegram.ui.ActionBar.b2[] b2VarArr = this.d;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
        }
        if (b2VarArr[0] == no0.H) {
            no0.H = null;
        }
        View view = this.f27447e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
