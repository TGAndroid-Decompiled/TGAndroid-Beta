package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class jz implements TextView.OnEditorActionListener {
    public final int f38728a;
    public final AlertDialog$Builder f38729b;

    public jz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f38728a = i10;
        this.f38729b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f38728a) {
            case 0:
                AndroidUtilities.hideKeyboard(textView);
                this.f38729b.f20678a.d(-1).callOnClick();
                return false;
            case 1:
                AndroidUtilities.hideKeyboard(textView);
                this.f38729b.f20678a.d(-1).callOnClick();
                return false;
            default:
                AndroidUtilities.hideKeyboard(textView);
                this.f38729b.f20678a.d(-1).callOnClick();
                return false;
        }
    }
}
