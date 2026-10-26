package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class jo0 implements TextView.OnEditorActionListener {
    public final io0 f29684a;
    public final int f29685b;
    public final TLRPC.Reaction f29686c;
    public final org.telegram.ui.ActionBar.e2[] d;
    public final View e;

    public jo0(io0 io0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.e2[] e2VarArr, View view) {
        this.f29684a = io0Var;
        this.f29685b = i10;
        this.f29686c = reaction;
        this.d = e2VarArr;
        this.e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        io0 io0Var = this.f29684a;
        String obj = io0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(io0Var);
            return true;
        }
        MessagesController.getInstance(this.f29685b).renameSavedReactionTag(bh.x0.d(this.f29686c), obj);
        org.telegram.ui.ActionBar.e2[] e2VarArr = this.d;
        org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
        if (e2Var != null) {
            e2Var.dismiss();
        }
        if (e2VarArr[0] == oo0.H) {
            oo0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
