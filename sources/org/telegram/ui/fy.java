package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fy implements TextView.OnEditorActionListener {
    public final int f47841a;
    public final AlertDialog$Builder f47842b;

    public fy(AlertDialog$Builder alertDialog$Builder, int i7) {
        this.f47841a = i7;
        this.f47842b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f47841a) {
            case 0:
                org.telegram.messenger.g0.v1(textView);
                this.f47842b.f28746a.d(-1).callOnClick();
                return false;
            case 1:
                org.telegram.messenger.g0.v1(textView);
                this.f47842b.f28746a.d(-1).callOnClick();
                return false;
            default:
                org.telegram.messenger.g0.v1(textView);
                this.f47842b.f28746a.d(-1).callOnClick();
                return false;
        }
    }
}
