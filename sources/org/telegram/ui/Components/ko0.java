package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ko0 implements TextView.OnEditorActionListener {
    public final jo0 f28048a;
    public final int f28049b;
    public final TLRPC.Reaction f28050c;
    public final org.telegram.ui.ActionBar.a2[] d;
    public final View f28051e;

    public ko0(jo0 jo0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.a2[] a2VarArr, View view) {
        this.f28048a = jo0Var;
        this.f28049b = i10;
        this.f28050c = reaction;
        this.d = a2VarArr;
        this.f28051e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        jo0 jo0Var = this.f28048a;
        String obj = jo0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(jo0Var);
            return true;
        }
        MessagesController.getInstance(this.f28049b).renameSavedReactionTag(zg.n0.d(this.f28050c), obj);
        org.telegram.ui.ActionBar.a2[] a2VarArr = this.d;
        org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
        if (a2Var != null) {
            a2Var.dismiss();
        }
        if (a2VarArr[0] == po0.H) {
            po0.H = null;
        }
        View view = this.f28051e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
