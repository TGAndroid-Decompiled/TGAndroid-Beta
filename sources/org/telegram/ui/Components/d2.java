package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.tl.TL_account;
public final class d2 implements TextView.OnEditorActionListener {
    public final int f27639a;
    public final int f27640b;
    public final org.telegram.ui.ActionBar.c2[] f27641c;
    public final View d;
    public final EditTextBoldCursor f27642e;
    public final Object f27643f;

    public d2(EditTextBoldCursor editTextBoldCursor, int i10, Object obj, org.telegram.ui.ActionBar.c2[] c2VarArr, View view, int i11) {
        this.f27639a = i11;
        this.f27642e = editTextBoldCursor;
        this.f27640b = i10;
        this.f27643f = obj;
        this.f27641c = c2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f27639a) {
            case 0:
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.f27643f;
                if (i10 != 6) {
                    return false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f27642e;
                String obj = editTextBoldCursor.getText().toString();
                if (obj.length() > this.f27640b) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                } else {
                    stringCallback.run(obj);
                    org.telegram.ui.ActionBar.c2 c2Var = this.f27641c[0];
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
                sf.o oVar = (sf.o) this.f27642e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f27643f;
                if (i10 != 6) {
                    return false;
                }
                String obj2 = oVar.getText().toString();
                if (obj2.length() > 32) {
                    AndroidUtilities.shakeView(oVar);
                } else {
                    sf.u d = sf.u.d(this.f27640b);
                    TL_account.TL_businessChatLink c3 = d.c(tL_businessChatLink.link);
                    if (c3 != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = c3.message;
                        tL_inputBusinessChatLink.entities = c3.entities;
                        tL_inputBusinessChatLink.title = obj2;
                        d.b(c3, tL_inputBusinessChatLink, null);
                    }
                    org.telegram.ui.ActionBar.c2[] c2VarArr = this.f27641c;
                    org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr[0];
                    if (c2Var2 != null) {
                        c2Var2.dismiss();
                    }
                    if (c2VarArr[0] == sf.r.d) {
                        sf.r.d = null;
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
