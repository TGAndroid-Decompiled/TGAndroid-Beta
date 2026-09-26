package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class pn0 implements TextView.OnEditorActionListener {
    public final on0 f27410a;
    public final int f27411b;
    public final TLRPC.Reaction f27412c;
    public final org.telegram.ui.ActionBar.a2[] d;
    public final View e;

    public pn0(on0 on0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.a2[] a2VarArr, View view) {
        this.f27410a = on0Var;
        this.f27411b = i10;
        this.f27412c = reaction;
        this.d = a2VarArr;
        this.e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        on0 on0Var = this.f27410a;
        String obj = on0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(on0Var);
            return true;
        }
        MessagesController.getInstance(this.f27411b).renameSavedReactionTag(zg.o0.d(this.f27412c), obj);
        org.telegram.ui.ActionBar.a2[] a2VarArr = this.d;
        org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
        if (a2Var != null) {
            a2Var.dismiss();
        }
        if (a2VarArr[0] == un0.H) {
            un0.H = null;
        }
        View view = this.e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
