package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class in0 implements TextView.OnEditorActionListener {
    public final hn0 f25746a;
    public final int f25747b;
    public final TLRPC.Reaction f25748c;
    public final org.telegram.ui.ActionBar.d2[] d;
    public final View e;

    public in0(hn0 hn0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.d2[] d2VarArr, View view) {
        this.f25746a = hn0Var;
        this.f25747b = i10;
        this.f25748c = reaction;
        this.d = d2VarArr;
        this.e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        hn0 hn0Var = this.f25746a;
        String obj = hn0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(hn0Var);
            return true;
        }
        MessagesController.getInstance(this.f25747b).renameSavedReactionTag(mg.q0.d(this.f25748c), obj);
        org.telegram.ui.ActionBar.d2[] d2VarArr = this.d;
        org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
        if (d2Var != null) {
            d2Var.dismiss();
        }
        if (d2VarArr[0] == nn0.E) {
            nn0.E = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
