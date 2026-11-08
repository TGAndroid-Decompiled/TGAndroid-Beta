package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ay implements TextView.OnEditorActionListener {
    public final int f44120a;
    public final AlertDialog$Builder f44121b;

    public ay(AlertDialog$Builder alertDialog$Builder, int i7) {
        this.f44120a = i7;
        this.f44121b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f44120a) {
            case 0:
                org.telegram.messenger.g0.v1(textView);
                this.f44121b.f27296a.d(-1).callOnClick();
                return false;
            case 1:
                org.telegram.messenger.g0.v1(textView);
                this.f44121b.f27296a.d(-1).callOnClick();
                return false;
            default:
                org.telegram.messenger.g0.v1(textView);
                this.f44121b.f27296a.d(-1).callOnClick();
                return false;
        }
    }
}
