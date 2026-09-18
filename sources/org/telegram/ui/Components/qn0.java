package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class qn0 implements TextView.OnEditorActionListener {
    public final pn0 f27694a;
    public final int f27695b;
    public final TLRPC.Reaction f27696c;
    public final org.telegram.ui.ActionBar.b2[] d;
    public final View e;

    public qn0(pn0 pn0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.f27694a = pn0Var;
        this.f27695b = i10;
        this.f27696c = reaction;
        this.d = b2VarArr;
        this.e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        pn0 pn0Var = this.f27694a;
        String obj = pn0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(pn0Var);
            return true;
        }
        MessagesController.getInstance(this.f27695b).renameSavedReactionTag(zg.o0.d(this.f27696c), obj);
        org.telegram.ui.ActionBar.b2[] b2VarArr = this.d;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
        }
        if (b2VarArr[0] == vn0.H) {
            vn0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
