package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class qn0 implements TextView.OnEditorActionListener {
    public final pn0 f27742a;
    public final int f27743b;
    public final TLRPC.Reaction f27744c;
    public final org.telegram.ui.ActionBar.a2[] d;
    public final View e;

    public qn0(pn0 pn0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.a2[] a2VarArr, View view) {
        this.f27742a = pn0Var;
        this.f27743b = i10;
        this.f27744c = reaction;
        this.d = a2VarArr;
        this.e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        pn0 pn0Var = this.f27742a;
        String obj = pn0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(pn0Var);
            return true;
        }
        MessagesController.getInstance(this.f27743b).renameSavedReactionTag(zg.o0.d(this.f27744c), obj);
        org.telegram.ui.ActionBar.a2[] a2VarArr = this.d;
        org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
        if (a2Var != null) {
            a2Var.dismiss();
        }
        if (a2VarArr[0] == vn0.H) {
            vn0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
