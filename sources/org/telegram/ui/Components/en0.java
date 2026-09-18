package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class en0 implements TextView.OnEditorActionListener {
    public final dn0 f23607a;
    public final int f23608b;
    public final TLRPC.Reaction f23609c;
    public final org.telegram.ui.ActionBar.c2[] d;
    public final View e;

    public en0(dn0 dn0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.c2[] c2VarArr, View view) {
        this.f23607a = dn0Var;
        this.f23608b = i10;
        this.f23609c = reaction;
        this.d = c2VarArr;
        this.e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        dn0 dn0Var = this.f23607a;
        String obj = dn0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(dn0Var);
            return true;
        }
        MessagesController.getInstance(this.f23608b).renameSavedReactionTag(zg.p0.d(this.f23609c), obj);
        org.telegram.ui.ActionBar.c2[] c2VarArr = this.d;
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var != null) {
            c2Var.dismiss();
        }
        if (c2VarArr[0] == jn0.H) {
            jn0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
