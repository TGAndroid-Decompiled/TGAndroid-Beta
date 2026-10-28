package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ko0 implements TextView.OnEditorActionListener {
    public final jo0 f29995a;
    public final int f29996b;
    public final TLRPC.Reaction f29997c;
    public final org.telegram.ui.ActionBar.e2[] d;
    public final View e;

    public ko0(jo0 jo0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.e2[] e2VarArr, View view) {
        this.f29995a = jo0Var;
        this.f29996b = i10;
        this.f29997c = reaction;
        this.d = e2VarArr;
        this.e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        jo0 jo0Var = this.f29995a;
        String obj = jo0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(jo0Var);
            return true;
        }
        MessagesController.getInstance(this.f29996b).renameSavedReactionTag(bh.x0.d(this.f29997c), obj);
        org.telegram.ui.ActionBar.e2[] e2VarArr = this.d;
        org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
        if (e2Var != null) {
            e2Var.dismiss();
        }
        if (e2VarArr[0] == po0.H) {
            po0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
