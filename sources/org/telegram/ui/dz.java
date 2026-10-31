package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dz implements TextView.OnEditorActionListener {
    public final int f36873a;
    public final AlertDialog$Builder f36874b;

    public dz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f36873a = i10;
        this.f36874b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f36873a) {
            case 0:
                org.telegram.messenger.i0.v1(textView);
                this.f36874b.f20134a.d(-1).callOnClick();
                return false;
            case 1:
                org.telegram.messenger.i0.v1(textView);
                this.f36874b.f20134a.d(-1).callOnClick();
                return false;
            default:
                org.telegram.messenger.i0.v1(textView);
                this.f36874b.f20134a.d(-1).callOnClick();
                return false;
        }
    }
}
