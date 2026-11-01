package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class cz implements TextView.OnEditorActionListener {
    public final int f36450a;
    public final AlertDialog$Builder f36451b;

    public cz(AlertDialog$Builder alertDialog$Builder, int i10) {
        this.f36450a = i10;
        this.f36451b = alertDialog$Builder;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f36450a) {
            case 0:
                org.telegram.messenger.i0.v1(textView);
                this.f36451b.f20135a.d(-1).callOnClick();
                return false;
            case 1:
                org.telegram.messenger.i0.v1(textView);
                this.f36451b.f20135a.d(-1).callOnClick();
                return false;
            default:
                org.telegram.messenger.i0.v1(textView);
                this.f36451b.f20135a.d(-1).callOnClick();
                return false;
        }
    }
}
