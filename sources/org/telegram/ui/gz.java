package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gz implements TextView.OnEditorActionListener {
    public final int f37455a;
    public final AlertDialog$Builder f37456b;

    public gz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f37455a = i10;
        this.f37456b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f37455a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f37456b.f20604a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f37456b.f20604a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f37456b.f20604a.d(-1).callOnClick();
                return false;
        }
    }
}
