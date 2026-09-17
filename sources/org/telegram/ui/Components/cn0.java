package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class cn0 implements TextView.OnEditorActionListener {
    public final bn0 f25035a;
    public final int f25036b;
    public final TLRPC.Reaction f25037c;
    public final org.telegram.ui.ActionBar.b2[] d;
    public final View f25038e;

    public cn0(bn0 bn0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.f25035a = bn0Var;
        this.f25036b = i10;
        this.f25037c = reaction;
        this.d = b2VarArr;
        this.f25038e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        bn0 bn0Var = this.f25035a;
        String obj = bn0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(bn0Var);
            return true;
        }
        MessagesController.getInstance(this.f25036b).renameSavedReactionTag(ah.j1.d(this.f25037c), obj);
        org.telegram.ui.ActionBar.b2[] b2VarArr = this.d;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
        }
        if (b2VarArr[0] == hn0.H) {
            hn0.H = null;
        }
        View view = this.f25038e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
