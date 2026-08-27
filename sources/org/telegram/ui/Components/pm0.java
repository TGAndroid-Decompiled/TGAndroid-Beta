package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;

public final class pm0 implements TextView.OnEditorActionListener {

    public final om0 f31631a;

    public final int f31632b;

    public final TLRPC.Reaction f31633c;
    public final org.telegram.ui.ActionBar.b2[] d;

    public final View f31634e;

    public pm0(om0 om0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.f31631a = om0Var;
        this.f31632b = i10;
        this.f31633c = reaction;
        this.d = b2VarArr;
        this.f31634e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        om0 om0Var = this.f31631a;
        String string = om0Var.getText().toString();
        if (string.length() > 12) {
            AndroidUtilities.shakeView(om0Var);
            return true;
        }
        MessagesController.getInstance(this.f31632b).renameSavedReactionTag(ig.q0.d(this.f31633c), string);
        org.telegram.ui.ActionBar.b2[] b2VarArr = this.d;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
        }
        if (b2VarArr[0] == um0.D) {
            um0.D = null;
        }
        View view = this.f31634e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
