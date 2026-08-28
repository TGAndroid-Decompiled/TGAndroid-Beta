package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class gz implements TextView.OnEditorActionListener {
    public final int f38620a;
    public final AlertDialog$Builder f38621b;

    public gz(AlertDialog$Builder alertDialog$Builder, int i9) {
        this.f38620a = i9;
        this.f38621b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        switch (this.f38620a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f38621b.f22702a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f38621b.f22702a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f38621b.f22702a.d(-1).callOnClick();
                return false;
        }
    }
}
