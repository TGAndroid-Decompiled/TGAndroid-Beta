package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class jo0 implements TextView.OnEditorActionListener {
    public final io0 f27739a;
    public final int f27740b;
    public final TLRPC.Reaction f27741c;
    public final org.telegram.ui.ActionBar.b2[] d;
    public final View f27742e;

    public jo0(io0 io0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.f27739a = io0Var;
        this.f27740b = i10;
        this.f27741c = reaction;
        this.d = b2VarArr;
        this.f27742e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        io0 io0Var = this.f27739a;
        String obj = io0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(io0Var);
            return true;
        }
        MessagesController.getInstance(this.f27740b).renameSavedReactionTag(zg.n0.d(this.f27741c), obj);
        org.telegram.ui.ActionBar.b2[] b2VarArr = this.d;
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
        }
        if (b2VarArr[0] == oo0.H) {
            oo0.H = null;
        }
        View view = this.f27742e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
