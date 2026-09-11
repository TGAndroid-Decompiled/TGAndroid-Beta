package org.telegram.ui.Components;

import android.widget.Button;
import android.widget.TextView;
public final class p4 extends TextView {
    @Override
    public final CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }
}
