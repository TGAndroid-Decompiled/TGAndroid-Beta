package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class c00 implements TextView.OnEditorActionListener {
    public final int f34652a;
    public final AlertDialog$Builder f34653b;

    public c00(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f34652a = i10;
        this.f34653b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f34652a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f34653b.f19548a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f34653b.f19548a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f34653b.f19548a.d(-1).callOnClick();
                return false;
        }
    }
}
