package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gz implements TextView.OnEditorActionListener {
    public final int f37440a;
    public final AlertDialog$Builder f37441b;

    public gz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f37440a = i10;
        this.f37441b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f37440a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f37441b.f20609a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f37441b.f20609a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f37441b.f20609a.d(-1).callOnClick();
                return false;
        }
    }
}
