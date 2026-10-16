package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class fo0 implements TextView.OnEditorActionListener {
    public final eo0 f24785a;
    public final int f24786b;
    public final TLRPC.Reaction f24787c;
    public final org.telegram.ui.ActionBar.a2[] d;
    public final View e;

    public fo0(eo0 eo0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.a2[] a2VarArr, View view) {
        this.f24785a = eo0Var;
        this.f24786b = i10;
        this.f24787c = reaction;
        this.d = a2VarArr;
        this.e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        eo0 eo0Var = this.f24785a;
        String obj = eo0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(eo0Var);
            return true;
        }
        MessagesController.getInstance(this.f24786b).renameSavedReactionTag(ah.i1.d(this.f24787c), obj);
        org.telegram.ui.ActionBar.a2[] a2VarArr = this.d;
        org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
        if (a2Var != null) {
            a2Var.dismiss();
        }
        if (a2VarArr[0] == ko0.H) {
            ko0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
