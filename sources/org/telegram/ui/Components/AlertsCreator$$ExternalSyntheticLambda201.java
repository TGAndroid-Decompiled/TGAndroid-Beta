package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Business.BusinessLinksActivity;
import org.telegram.ui.Business.BusinessLinksController;

public final class AlertsCreator$$ExternalSyntheticLambda201 implements TextView.OnEditorActionListener {
    public final int $r8$classId;
    public final EditTextBoldCursor f$0;
    public final int f$1;
    public final Object f$2;
    public final AlertDialog[] f$3;
    public final View f$4;

    public AlertsCreator$$ExternalSyntheticLambda201(EditTextBoldCursor editTextBoldCursor, int i, Object obj, AlertDialog[] alertDialogArr, View view, int i2) {
        this.$r8$classId = i2;
        this.f$0 = editTextBoldCursor;
        this.f$1 = i;
        this.f$2 = obj;
        this.f$3 = alertDialogArr;
        this.f$4 = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.$r8$classId) {
            case 0:
                if (i != 6) {
                    return false;
                }
                EditTextBoldCursor editTextBoldCursor = this.f$0;
                String string = editTextBoldCursor.getText().toString();
                if (string.length() > this.f$1) {
                    AndroidUtilities.shakeView(editTextBoldCursor);
                } else {
                    ((MessagesStorage.StringCallback) this.f$2).run(string);
                    AlertDialog alertDialog = this.f$3[0];
                    if (alertDialog != null) {
                        alertDialog.dismiss();
                    }
                    View view = this.f$4;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
            default:
                if (i != 6) {
                    return false;
                }
                BusinessLinksActivity.AnonymousClass1 anonymousClass1 = (BusinessLinksActivity.AnonymousClass1) this.f$0;
                String string2 = anonymousClass1.getText().toString();
                if (string2.length() > 32) {
                    AndroidUtilities.shakeView(anonymousClass1);
                } else {
                    BusinessLinksController businessLinksController = BusinessLinksController.getInstance(this.f$1);
                    TL_account.TL_businessChatLink tL_businessChatLinkFindLink = businessLinksController.findLink(((TL_account.TL_businessChatLink) this.f$2).link);
                    if (tL_businessChatLinkFindLink != null) {
                        TL_account.TL_inputBusinessChatLink tL_inputBusinessChatLink = new TL_account.TL_inputBusinessChatLink();
                        tL_inputBusinessChatLink.message = tL_businessChatLinkFindLink.message;
                        tL_inputBusinessChatLink.entities = tL_businessChatLinkFindLink.entities;
                        tL_inputBusinessChatLink.title = string2;
                        businessLinksController.editLink(tL_businessChatLinkFindLink, tL_inputBusinessChatLink, null);
                    }
                    AlertDialog[] alertDialogArr = this.f$3;
                    AlertDialog alertDialog2 = alertDialogArr[0];
                    if (alertDialog2 != null) {
                        alertDialog2.dismiss();
                    }
                    if (alertDialogArr[0] == BusinessLinksActivity.currentDialog) {
                        BusinessLinksActivity.currentDialog = null;
                    }
                    View view2 = this.f$4;
                    if (view2 != null) {
                        view2.requestFocus();
                    }
                }
                return true;
        }
    }
}
