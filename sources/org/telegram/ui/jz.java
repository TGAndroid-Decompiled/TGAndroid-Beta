package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class jz implements TextView.OnEditorActionListener {
    public final int f38704a;
    public final AlertDialog$Builder f38705b;

    public jz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f38704a = i10;
        this.f38705b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f38704a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f38705b.f20679a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f38705b.f20679a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f38705b.f20679a.d(-1).callOnClick();
                return false;
        }
    }
}
