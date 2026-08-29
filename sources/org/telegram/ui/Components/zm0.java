package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class zm0 implements TextView.OnEditorActionListener {
    public final ym0 f35372a;
    public final int f35373b;
    public final TLRPC.Reaction f35374c;
    public final org.telegram.ui.ActionBar.c2[] d;
    public final View f35375e;

    public zm0(ym0 ym0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.c2[] c2VarArr, View view) {
        this.f35372a = ym0Var;
        this.f35373b = i10;
        this.f35374c = reaction;
        this.d = c2VarArr;
        this.f35375e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        ym0 ym0Var = this.f35372a;
        String obj = ym0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(ym0Var);
            return true;
        }
        MessagesController.getInstance(this.f35373b).renameSavedReactionTag(kg.q0.d(this.f35374c), obj);
        org.telegram.ui.ActionBar.c2[] c2VarArr = this.d;
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        if (c2Var != null) {
            c2Var.dismiss();
        }
        if (c2VarArr[0] == en0.D) {
            en0.D = null;
        }
        View view = this.f35375e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
