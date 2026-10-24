package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class do0 implements TextView.OnEditorActionListener {
    public final co0 f25799a;
    public final int f25800b;
    public final TLRPC.Reaction f25801c;
    public final org.telegram.ui.ActionBar.c2[] d;
    public final View e;

    public do0(co0 co0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.c2[] c2VarArr, View view) {
        this.f25799a = co0Var;
        this.f25800b = i10;
        this.f25801c = reaction;
        this.d = c2VarArr;
        this.e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        co0 co0Var = this.f25799a;
        String obj = co0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(co0Var);
            return true;
        }
        MessagesController.getInstance(this.f25800b).renameSavedReactionTag(ah.i1.d(this.f25801c), obj);
        org.telegram.ui.ActionBar.c2[] c2VarArr = this.d;
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var != null) {
            c2Var.dismiss();
        }
        if (c2VarArr[0] == io0.H) {
            io0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
