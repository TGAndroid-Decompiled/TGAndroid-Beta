package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
public final class l2 implements TextView.OnEditorActionListener {
    public final int f35495a;

    public l2(int i7) {
        this.f35495a = i7;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.f35495a) {
            case 0:
                org.telegram.messenger.g0.v1(textView);
                return false;
            case 1:
                if (i7 == 6) {
                    org.telegram.messenger.g0.v1(textView);
                    return true;
                }
                return false;
            case 2:
                if (i7 == 6) {
                    org.telegram.messenger.g0.v1(textView);
                    return true;
                }
                return false;
            case 3:
                if (i7 == 6) {
                    org.telegram.messenger.g0.v1(textView);
                    return true;
                }
                return false;
            case 4:
                if (i7 == 6) {
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    return false;
                }
                return false;
            default:
                if (i7 == 6) {
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    return false;
                }
                return false;
        }
    }
}
