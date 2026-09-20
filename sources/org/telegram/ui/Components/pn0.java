package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class pn0 implements TextView.OnEditorActionListener {
    public final on0 f27397a;
    public final int f27398b;
    public final TLRPC.Reaction f27399c;
    public final org.telegram.ui.ActionBar.b2[] d;
    public final View e;

    public pn0(on0 on0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.f27397a = on0Var;
        this.f27398b = i10;
        this.f27399c = reaction;
        this.d = b2VarArr;
        this.e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        on0 on0Var = this.f27397a;
        String obj = on0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(on0Var);
            return true;
        }
        MessagesController.getInstance(this.f27398b).renameSavedReactionTag(zg.o0.d(this.f27399c), obj);
        org.telegram.ui.ActionBar.b2[] b2VarArr = this.d;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
        }
        if (b2VarArr[0] == un0.H) {
            un0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
