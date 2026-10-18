package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ao0 implements TextView.OnEditorActionListener {
    public final zn0 f24688a;
    public final int f24689b;
    public final TLRPC.Reaction f24690c;
    public final org.telegram.ui.ActionBar.b2[] d;
    public final View e;

    public ao0(zn0 zn0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.f24688a = zn0Var;
        this.f24689b = i10;
        this.f24690c = reaction;
        this.d = b2VarArr;
        this.e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        zn0 zn0Var = this.f24688a;
        String obj = zn0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(zn0Var);
            return true;
        }
        MessagesController.getInstance(this.f24689b).renameSavedReactionTag(ah.i1.d(this.f24690c), obj);
        org.telegram.ui.ActionBar.b2[] b2VarArr = this.d;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
        }
        if (b2VarArr[0] == fo0.H) {
            fo0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
