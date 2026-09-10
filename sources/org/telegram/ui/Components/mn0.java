package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class mn0 implements TextView.OnEditorActionListener {
    public final ln0 f25258a;
    public final int f25259b;
    public final TLRPC.Reaction f25260c;
    public final org.telegram.ui.ActionBar.d2[] d;
    public final View e;

    public mn0(ln0 ln0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.d2[] d2VarArr, View view) {
        this.f25258a = ln0Var;
        this.f25259b = i10;
        this.f25260c = reaction;
        this.d = d2VarArr;
        this.e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        ln0 ln0Var = this.f25258a;
        String obj = ln0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(ln0Var);
            return true;
        }
        MessagesController.getInstance(this.f25259b).renameSavedReactionTag(yg.p0.d(this.f25260c), obj);
        org.telegram.ui.ActionBar.d2[] d2VarArr = this.d;
        org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
        if (d2Var != null) {
            d2Var.dismiss();
        }
        if (d2VarArr[0] == rn0.H) {
            rn0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
