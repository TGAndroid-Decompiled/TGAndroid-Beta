package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class cn0 implements TextView.OnEditorActionListener {
    public final bn0 f25034a;
    public final int f25035b;
    public final TLRPC.Reaction f25036c;
    public final org.telegram.ui.ActionBar.b2[] d;
    public final View f25037e;

    public cn0(bn0 bn0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.f25034a = bn0Var;
        this.f25035b = i10;
        this.f25036c = reaction;
        this.d = b2VarArr;
        this.f25037e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        bn0 bn0Var = this.f25034a;
        String obj = bn0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(bn0Var);
            return true;
        }
        MessagesController.getInstance(this.f25035b).renameSavedReactionTag(ah.j1.d(this.f25036c), obj);
        org.telegram.ui.ActionBar.b2[] b2VarArr = this.d;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
        }
        if (b2VarArr[0] == hn0.H) {
            hn0.H = null;
        }
        View view = this.f25037e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
