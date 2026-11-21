package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fy implements TextView.OnEditorActionListener {
    public final int f47872a;
    public final AlertDialog$Builder f47873b;

    public fy(AlertDialog$Builder alertDialog$Builder, int i7) {
        this.f47872a = i7;
        this.f47873b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f47872a) {
            case 0:
                org.telegram.messenger.g0.v1(textView);
                this.f47873b.f28774a.d(-1).callOnClick();
                return false;
            case 1:
                org.telegram.messenger.g0.v1(textView);
                this.f47873b.f28774a.d(-1).callOnClick();
                return false;
            default:
                org.telegram.messenger.g0.v1(textView);
                this.f47873b.f28774a.d(-1).callOnClick();
                return false;
        }
    }
}
