package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class iz implements TextView.OnEditorActionListener {
    public final int f38014a;
    public final AlertDialog$Builder f38015b;

    public iz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f38014a = i10;
        this.f38015b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f38014a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f38015b.f20608a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f38015b.f20608a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f38015b.f20608a.d(-1).callOnClick();
                return false;
        }
    }
}
