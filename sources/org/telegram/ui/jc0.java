package org.telegram.ui;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class jc0 extends org.telegram.ui.Components.g60 {
    public final lc0 d;

    public jc0(lc0 lc0Var) {
        this.d = lc0Var;
    }

    @Override
    public final void e(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.e(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
    }

    @Override
    public final int h() {
        return 5;
    }

    @Override
    public final int i() {
        return 100;
    }

    @Override
    public final int j() {
        return LiteMode.getPowerSaverLevel();
    }

    @Override
    public final void k(int i10) {
        lc0 lc0Var = this.d;
        float f7 = i10 / 100.0f;
        lc0Var.h.f25876w.W(f7, true);
        lc0Var.h.setProgress(f7);
    }

    @Override
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.LiteBatteryTitle));
        sb2.append(", ");
        int powerSaverLevel = LiteMode.getPowerSaverLevel();
        if (powerSaverLevel <= 0) {
            sb2.append(LocaleController.getString(R.string.LiteBatteryAlwaysDisabled));
        } else if (powerSaverLevel >= 100) {
            sb2.append(LocaleController.getString(R.string.LiteBatteryAlwaysEnabled));
        } else {
            sb2.append(LocaleController.formatString(R.string.AccDescrLiteBatteryWhenBelow, Integer.valueOf(Math.round(powerSaverLevel))));
        }
        accessibilityEvent.setContentDescription(sb2);
        this.d.setContentDescription(sb2);
    }
}
