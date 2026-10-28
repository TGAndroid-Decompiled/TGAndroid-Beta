package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class iz implements TextView.OnEditorActionListener {
    public final int f40293a;
    public final AlertDialog$Builder f40294b;

    public iz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f40293a = i10;
        this.f40294b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f40293a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f40294b.f22369a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f40294b.f22369a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f40294b.f22369a.d(-1).callOnClick();
                return false;
        }
    }
}
