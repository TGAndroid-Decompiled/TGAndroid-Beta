package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class vn0 implements TextView.OnEditorActionListener {
    public final un0 f31811a;
    public final int f31812b;
    public final TLRPC.Reaction f31813c;
    public final org.telegram.ui.ActionBar.b2[] d;
    public final View f31814e;

    public vn0(un0 un0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.f31811a = un0Var;
        this.f31812b = i10;
        this.f31813c = reaction;
        this.d = b2VarArr;
        this.f31814e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        un0 un0Var = this.f31811a;
        String obj = un0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(un0Var);
            return true;
        }
        MessagesController.getInstance(this.f31812b).renameSavedReactionTag(zg.m0.d(this.f31813c), obj);
        org.telegram.ui.ActionBar.b2[] b2VarArr = this.d;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
        }
        if (b2VarArr[0] == ao0.H) {
            ao0.H = null;
        }
        View view = this.f31814e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
