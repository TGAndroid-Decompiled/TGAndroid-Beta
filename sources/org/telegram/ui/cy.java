package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class cy implements TextView.OnEditorActionListener {
    public final int f46240a;
    public final AlertDialog$Builder f46241b;

    public cy(AlertDialog$Builder alertDialog$Builder, int i7) {
        this.f46240a = i7;
        this.f46241b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f46240a) {
            case 0:
                org.telegram.messenger.g0.v1(textView);
                this.f46241b.f28392a.d(-1).callOnClick();
                return false;
            case 1:
                org.telegram.messenger.g0.v1(textView);
                this.f46241b.f28392a.d(-1).callOnClick();
                return false;
            default:
                org.telegram.messenger.g0.v1(textView);
                this.f46241b.f28392a.d(-1).callOnClick();
                return false;
        }
    }
}
