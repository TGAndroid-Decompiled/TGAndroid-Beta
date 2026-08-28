package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.tl.TL_account;
public final class z1 implements TextView.OnEditorActionListener {
    public final int f35148a;
    public final int f35149b;
    public final org.telegram.ui.ActionBar.c2[] f35150c;
    public final View d;
    public final EditTextBoldCursor f35151e;
    public final Object f35152f;

    public z1(EditTextBoldCursor editTextBoldCursor, int i9, Object obj, org.telegram.ui.ActionBar.c2[] c2VarArr, View view, int i10) {
        this.f35148a = i10;
        this.f35151e = editTextBoldCursor;
        this.f35149b = i9;
        this.f35152f = obj;
        this.f35150c = c2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        switch (this.f35148a) {
            case 0:
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.f35152f;
                if (i9 != 6) {
                    return false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f35151e;
                String obj = editTextBoldCursor.getText().toString();
                if (obj.length() > this.f35149b) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                } else {
                    stringCallback.run(obj);
                    org.telegram.ui.ActionBar.c2 c2Var = this.f35150c[0];
                    if (c2Var != null) {
                        c2Var.dismiss();
                    }
                    View view = this.d;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
            default:
                pf.o oVar = (pf.o) this.f35151e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f35152f;
                if (i9 != 6) {
                    return false;
                }
                String obj2 = oVar.getText().toString();
                if (obj2.length() > 32) {
                    AndroidUtilities.shakeView(oVar);
                } else {
                    pf.u d = pf.u.d(this.f35149b);
                    TL_account.TL_businessChatLink c10 = d.c(tL_businessChatLink.link);
                    if (c10 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c10.message;
                        tL_inputBusinessChatLink.entities = c10.entities;
                        tL_inputBusinessChatLink.title = obj2;
                        d.b(c10, tL_inputBusinessChatLink, null);
                    }
                    org.telegram.ui.ActionBar.c2[] c2VarArr = this.f35150c;
                    org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr[0];
                    if (c2Var2 != null) {
                        c2Var2.dismiss();
                    }
                    if (c2VarArr[0] == pf.r.d) {
                        pf.r.d = null;
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
