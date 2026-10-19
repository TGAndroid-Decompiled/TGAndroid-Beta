package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gz implements TextView.OnEditorActionListener {
    public final int f37429a;
    public final AlertDialog$Builder f37430b;

    public gz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f37429a = i10;
        this.f37430b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f37429a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f37430b.f20602a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f37430b.f20602a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f37430b.f20602a.d(-1).callOnClick();
                return false;
        }
    }
}
