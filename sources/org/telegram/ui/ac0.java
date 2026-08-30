package org.telegram.ui;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ac0 extends org.telegram.ui.Components.y50 {
    public final cc0 d;

    public ac0(cc0 cc0Var) {
        this.d = cc0Var;
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
        cc0 cc0Var = this.d;
        float f10 = i10 / 100.0f;
        cc0Var.h.f26332w.Y(f10, true);
        cc0Var.h.setProgress(f10);
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
