package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ey implements TextView.OnEditorActionListener {
    public final int f45458a;
    public final AlertDialog$Builder f45459b;

    public ey(AlertDialog$Builder alertDialog$Builder, int i7) {
        this.f45458a = i7;
        this.f45459b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f45458a) {
            case 0:
                org.telegram.messenger.g0.v1(textView);
                this.f45459b.f27300a.d(-1).callOnClick();
                return false;
            case 1:
                org.telegram.messenger.g0.v1(textView);
                this.f45459b.f27300a.d(-1).callOnClick();
                return false;
            default:
                org.telegram.messenger.g0.v1(textView);
                this.f45459b.f27300a.d(-1).callOnClick();
                return false;
        }
    }
}
