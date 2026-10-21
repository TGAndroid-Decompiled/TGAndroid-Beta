package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gz implements TextView.OnEditorActionListener {
    public final int f37436a;
    public final AlertDialog$Builder f37437b;

    public gz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f37436a = i10;
        this.f37437b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f37436a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f37437b.f20605a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f37437b.f20605a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f37437b.f20605a.d(-1).callOnClick();
                return false;
        }
    }
}
