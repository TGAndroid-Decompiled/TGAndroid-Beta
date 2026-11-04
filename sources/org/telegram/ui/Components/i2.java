package org.telegram.ui.Components;

import android.view.KeyEvent;
import android.widget.TextView;
public final class i2 implements TextView.OnEditorActionListener {
    public final int f34572a;

    public i2(int i3) {
        this.f34572a = i3;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        switch (this.f34572a) {
            case 0:
                org.telegram.messenger.g0.v1(textView);
                return false;
            case 1:
                if (i3 == 6) {
                    org.telegram.messenger.g0.v1(textView);
                    return true;
                }
                return false;
            case 2:
                if (i3 == 6) {
                    org.telegram.messenger.g0.v1(textView);
                    return true;
                }
                return false;
            case 3:
                if (i3 == 6) {
                    org.telegram.messenger.g0.v1(textView);
                    return true;
                }
                return false;
            case 4:
                if (i3 == 6) {
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    return false;
                }
                return false;
            default:
                if (i3 == 6) {
                    textView.clearFocus();
                    org.telegram.messenger.g0.v1(textView);
                    return false;
                }
                return false;
        }
    }
}
