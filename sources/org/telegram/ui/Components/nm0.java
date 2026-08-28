package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class nm0 implements TextView.OnEditorActionListener {
    public final mm0 f31129a;
    public final int f31130b;
    public final TLRPC.Reaction f31131c;
    public final org.telegram.ui.ActionBar.c2[] d;
    public final View f31132e;

    public nm0(mm0 mm0Var, int i9, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.c2[] c2VarArr, View view) {
        this.f31129a = mm0Var;
        this.f31130b = i9;
        this.f31131c = reaction;
        this.d = c2VarArr;
        this.f31132e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        if (i9 != 6) {
            return false;
        }
        mm0 mm0Var = this.f31129a;
        String obj = mm0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(mm0Var);
            return true;
        }
        MessagesController.getInstance(this.f31130b).renameSavedReactionTag(hg.r0.d(this.f31131c), obj);
        org.telegram.ui.ActionBar.c2[] c2VarArr = this.d;
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var != null) {
            c2Var.dismiss();
        }
        if (c2VarArr[0] == sm0.D) {
            sm0.D = null;
        }
        View view = this.f31132e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
