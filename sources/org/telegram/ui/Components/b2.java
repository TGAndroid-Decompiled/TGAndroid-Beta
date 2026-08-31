package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.tl.TL_account;
public final class b2 implements TextView.OnEditorActionListener {
    public final int f25459a;
    public final int f25460b;
    public final org.telegram.ui.ActionBar.d2[] f25461c;
    public final View d;
    public final EditTextBoldCursor f25462e;
    public final Object f25463f;

    public b2(EditTextBoldCursor editTextBoldCursor, int i10, Object obj, org.telegram.ui.ActionBar.d2[] d2VarArr, View view, int i11) {
        this.f25459a = i11;
        this.f25462e = editTextBoldCursor;
        this.f25460b = i10;
        this.f25463f = obj;
        this.f25461c = d2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f25459a) {
            case 0:
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.f25463f;
                if (i10 != 6) {
                    return false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f25462e;
                String obj = editTextBoldCursor.getText().toString();
                if (obj.length() > this.f25460b) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                } else {
                    stringCallback.run(obj);
                    org.telegram.ui.ActionBar.d2 d2Var = this.f25461c[0];
                    if (d2Var != null) {
                        d2Var.dismiss();
                    }
                    View view = this.d;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
            default:
                vf.n nVar = (vf.n) this.f25462e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f25463f;
                if (i10 != 6) {
                    return false;
                }
                String obj2 = nVar.getText().toString();
                if (obj2.length() > 32) {
                    AndroidUtilities.shakeView(nVar);
                } else {
                    vf.t d = vf.t.d(this.f25460b);
                    TL_account.TL_businessChatLink c3 = d.c(tL_businessChatLink.link);
                    if (c3 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c3.message;
                        tL_inputBusinessChatLink.entities = c3.entities;
                        tL_inputBusinessChatLink.title = obj2;
                        d.b(c3, tL_inputBusinessChatLink, null);
                    }
                    org.telegram.ui.ActionBar.d2[] d2VarArr = this.f25461c;
                    org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr[0];
                    if (d2Var2 != null) {
                        d2Var2.dismiss();
                    }
                    if (d2VarArr[0] == vf.q.d) {
                        vf.q.d = null;
                    }
                    View view2 = this.d;
                    if (view2 != null) {
                        view2.requestFocus();
                    }
                }
                return true;
        }
    }
}
