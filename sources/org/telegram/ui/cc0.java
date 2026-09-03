package org.telegram.ui;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class cc0 extends org.telegram.ui.Components.z50 {
    public final ec0 d;

    public cc0(ec0 ec0Var) {
        this.d = ec0Var;
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
        ec0 ec0Var = this.d;
        float f10 = i10 / 100.0f;
        ec0Var.h.f26002w.Y(f10, true);
        ec0Var.h.setProgress(f10);
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
