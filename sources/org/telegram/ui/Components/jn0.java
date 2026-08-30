package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class jn0 implements TextView.OnEditorActionListener {
    public final in0 f26012a;
    public final int f26013b;
    public final TLRPC.Reaction f26014c;
    public final org.telegram.ui.ActionBar.d2[] d;
    public final View e;

    public jn0(in0 in0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.d2[] d2VarArr, View view) {
        this.f26012a = in0Var;
        this.f26013b = i10;
        this.f26014c = reaction;
        this.d = d2VarArr;
        this.e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        in0 in0Var = this.f26012a;
        String obj = in0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(in0Var);
            return true;
        }
        MessagesController.getInstance(this.f26013b).renameSavedReactionTag(mg.q0.d(this.f26014c), obj);
        org.telegram.ui.ActionBar.d2[] d2VarArr = this.d;
        org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
        if (d2Var != null) {
            d2Var.dismiss();
        }
        if (d2VarArr[0] == on0.E) {
            on0.E = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
