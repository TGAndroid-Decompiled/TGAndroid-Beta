package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class kn0 implements TextView.OnEditorActionListener {
    public final jn0 f28419a;
    public final int f28420b;
    public final TLRPC.Reaction f28421c;
    public final org.telegram.ui.ActionBar.d2[] d;
    public final View f28422e;

    public kn0(jn0 jn0Var, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.d2[] d2VarArr, View view) {
        this.f28419a = jn0Var;
        this.f28420b = i10;
        this.f28421c = reaction;
        this.d = d2VarArr;
        this.f28422e = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        jn0 jn0Var = this.f28419a;
        String obj = jn0Var.getText().toString();
        if (obj.length() > 12) {
            AndroidUtilities.shakeView(jn0Var);
            return true;
        }
        MessagesController.getInstance(this.f28420b).renameSavedReactionTag(ng.q0.d(this.f28421c), obj);
        org.telegram.ui.ActionBar.d2[] d2VarArr = this.d;
        org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
        if (d2Var != null) {
            d2Var.dismiss();
        }
        if (d2VarArr[0] == pn0.E) {
            pn0.E = null;
        }
        View view = this.f28422e;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
