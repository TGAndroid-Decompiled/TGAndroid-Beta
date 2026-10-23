package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class eo0 implements TextView.OnEditorActionListener {
    public final do0 f26016a;
    public final int f26017b;
    public final TLRPC.Reaction f26018c;
    public final org.telegram.ui.ActionBar.c2[] d;
    public final View e;

    public eo0(do0 do0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.c2[] c2VarArr, View view) {
        this.f26016a = do0Var;
        this.f26017b = i10;
        this.f26018c = reaction;
        this.d = c2VarArr;
        this.e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        do0 do0Var = this.f26016a;
        String obj = do0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(do0Var);
            return true;
        }
        MessagesController.getInstance(this.f26017b).renameSavedReactionTag(ah.i1.d(this.f26018c), obj);
        org.telegram.ui.ActionBar.c2[] c2VarArr = this.d;
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var != null) {
            c2Var.dismiss();
        }
        if (c2VarArr[0] == jo0.H) {
            jo0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
