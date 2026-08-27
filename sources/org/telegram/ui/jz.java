package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class jz implements TextView.OnEditorActionListener {

    public final int f39542a;

    public final AlertDialog$Builder f39543b;

    public jz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f39542a = i10;
        this.f39543b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f39542a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f39543b.f22702a.d(-1).callOnClick();
                break;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f39543b.f22702a.d(-1).callOnClick();
                break;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f39543b.f22702a.d(-1).callOnClick();
                break;
        }
        return false;
    }
}
