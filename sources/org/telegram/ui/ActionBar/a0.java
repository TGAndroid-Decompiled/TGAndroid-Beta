package org.telegram.ui.ActionBar;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class a0 implements TextView.OnEditorActionListener {
    public final int f22373a;
    public final FrameLayout f22374b;

    public a0(int i10, FrameLayout frameLayout) {
        this.f22373a = i10;
        this.f22374b = frameLayout;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f22373a) {
            case 0:
                w0 w0Var = (w0) this.f22374b;
                if (keyEvent != null) {
                    if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                        AndroidUtilities.hideKeyboard(w0Var.e);
                        s0 s0Var = w0Var.H;
                        if (s0Var != null) {
                            s0Var.k(w0Var.e);
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            default:
                r5.a((r5) this.f22374b, i10, keyEvent);
                return false;
        }
    }
}
