package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ay implements TextView.OnEditorActionListener {
    public final int f44115a;
    public final AlertDialog$Builder f44116b;

    public ay(AlertDialog$Builder alertDialog$Builder, int i7) {
        this.f44115a = i7;
        this.f44116b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f44115a) {
            case 0:
                org.telegram.messenger.g0.v1(textView);
                this.f44116b.f27292a.d(-1).callOnClick();
                return false;
            case 1:
                org.telegram.messenger.g0.v1(textView);
                this.f44116b.f27292a.d(-1).callOnClick();
                return false;
            default:
                org.telegram.messenger.g0.v1(textView);
                this.f44116b.f27292a.d(-1).callOnClick();
                return false;
        }
    }
}
