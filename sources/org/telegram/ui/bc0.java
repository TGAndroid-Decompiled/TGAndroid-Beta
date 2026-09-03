package org.telegram.ui;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class bc0 extends org.telegram.ui.Components.a60 {
    public final dc0 d;

    public bc0(dc0 dc0Var) {
        this.d = dc0Var;
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
        dc0 dc0Var = this.d;
        float f10 = i10 / 100.0f;
        dc0Var.h.f28469w.X(f10, true);
        dc0Var.h.setProgress(f10);
    }

    @Override
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.LiteBatteryTitle));
        sb.append(", ");
        int powerSaverLevel = LiteMode.getPowerSaverLevel();
        if (powerSaverLevel <= 0) {
            sb.append(LocaleController.getString(R.string.LiteBatteryAlwaysDisabled));
        } else if (powerSaverLevel >= 100) {
            sb.append(LocaleController.getString(R.string.LiteBatteryAlwaysEnabled));
        } else {
            sb.append(LocaleController.formatString(R.string.AccDescrLiteBatteryWhenBelow, Integer.valueOf(Math.round(powerSaverLevel))));
        }
        accessibilityEvent.setContentDescription(sb);
        this.d.setContentDescription(sb);
    }
}
