package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class en0 implements TextView.OnEditorActionListener {
    public final dn0 f23604a;
    public final int f23605b;
    public final TLRPC.Reaction f23606c;
    public final org.telegram.ui.ActionBar.c2[] d;
    public final View e;

    public en0(dn0 dn0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.c2[] c2VarArr, View view) {
        this.f23604a = dn0Var;
        this.f23605b = i10;
        this.f23606c = reaction;
        this.d = c2VarArr;
        this.e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        dn0 dn0Var = this.f23604a;
        String obj = dn0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(dn0Var);
            return true;
        }
        MessagesController.getInstance(this.f23605b).renameSavedReactionTag(zg.p0.d(this.f23606c), obj);
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
