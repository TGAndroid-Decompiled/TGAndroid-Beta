package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ep extends aj0 {
    public final lp f25743r;

    public ep(lp lpVar, Context context) {
        super(context);
        this.f25743r = lpVar;
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f25743r.N) {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrSwitchToDayTheme));
        } else {
            accessibilityNodeInfo.setText(LocaleController.getString(R.string.AccDescrSwitchToNightTheme));
        }
    }
}
