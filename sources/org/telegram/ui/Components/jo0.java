package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class jo0 implements TextView.OnEditorActionListener {
    public final io0 f27798a;
    public final int f27799b;
    public final TLRPC.Reaction f27800c;
    public final org.telegram.ui.ActionBar.a2[] d;
    public final View f27801e;

    public jo0(io0 io0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.a2[] a2VarArr, View view) {
        this.f27798a = io0Var;
        this.f27799b = i10;
        this.f27800c = reaction;
        this.d = a2VarArr;
        this.f27801e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        io0 io0Var = this.f27798a;
        String obj = io0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(io0Var);
            return true;
        }
        MessagesController.getInstance(this.f27799b).renameSavedReactionTag(zg.n0.d(this.f27800c), obj);
        org.telegram.ui.ActionBar.a2[] a2VarArr = this.d;
        org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
        if (a2Var != null) {
            a2Var.dismiss();
        }
        if (a2VarArr[0] == oo0.H) {
            oo0.H = null;
        }
        View view = this.f27801e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
