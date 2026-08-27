package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.tl.TL_account;

public final class z1 implements TextView.OnEditorActionListener {

    public final int f35125a;

    public final int f35126b;

    public final org.telegram.ui.ActionBar.b2[] f35127c;
    public final View d;

    public final EditTextBoldCursor f35128e;

    public final Object f35129f;

    public z1(EditTextBoldCursor editTextBoldCursor, int i10, Object obj, org.telegram.ui.ActionBar.b2[] b2VarArr, View view, int i11) {
        this.f35125a = i11;
        this.f35128e = editTextBoldCursor;
        this.f35126b = i10;
        this.f35129f = obj;
        this.f35127c = b2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f35125a) {
            case 0:
                MessagesStorage.StringCallback stringCallback = (MessagesStorage.StringCallback) this.f35129f;
                if (i10 != 6) {
                    return false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f35128e;
                String string = editTextBoldCursor.getText().toString();
                if (string.length() > this.f35126b) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                } else {
                    stringCallback.run(string);
                    org.telegram.ui.ActionBar.b2 b2Var = this.f35127c[0];
                    if (b2Var != null) {
                        b2Var.dismiss();
                    }
                    View view = this.d;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
            default:
                qf.p pVar = (qf.p) this.f35128e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.f35129f;
                if (i10 != 6) {
                    return false;
                }
                String string2 = pVar.getText().toString();
                if (string2.length() > 32) {
                    AndroidUtilities.shakeView(pVar);
                } else {
                    qf.v vVarD = qf.v.d(this.f35126b);
                    TL_account.TL_businessChatLink tL_businessChatLinkC = vVarD.c(tL_businessChatLink.link);
                    if (tL_businessChatLinkC != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = tL_businessChatLinkC.message;
                        tL_inputBusinessChatLink.entities = tL_businessChatLinkC.entities;
                        tL_inputBusinessChatLink.title = string2;
                        vVarD.b(tL_businessChatLinkC, tL_inputBusinessChatLink, null);
                    }
                    org.telegram.ui.ActionBar.b2[] b2VarArr = this.f35127c;
                    org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr[0];
                    if (b2Var2 != null) {
                        b2Var2.dismiss();
                    }
                    if (b2VarArr[0] == qf.s.d) {
                        qf.s.d = null;
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
