package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gz implements TextView.OnEditorActionListener {
    public final int f37435a;
    public final AlertDialog$Builder f37436b;

    public gz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f37435a = i10;
        this.f37436b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f37435a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f37436b.f20605a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f37436b.f20605a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f37436b.f20605a.d(-1).callOnClick();
                return false;
        }
    }
}
