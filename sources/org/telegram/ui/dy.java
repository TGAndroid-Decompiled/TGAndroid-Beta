package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dy implements TextView.OnEditorActionListener {
    public final int f45130a;
    public final AlertDialog$Builder f45131b;

    public dy(AlertDialog$Builder alertDialog$Builder, int i7) {
        this.f45130a = i7;
        this.f45131b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f45130a) {
            case 0:
                org.telegram.messenger.g0.v1(textView);
                this.f45131b.f27296a.d(-1).callOnClick();
                return false;
            case 1:
                org.telegram.messenger.g0.v1(textView);
                this.f45131b.f27296a.d(-1).callOnClick();
                return false;
            default:
                org.telegram.messenger.g0.v1(textView);
                this.f45131b.f27296a.d(-1).callOnClick();
                return false;
        }
    }
}
