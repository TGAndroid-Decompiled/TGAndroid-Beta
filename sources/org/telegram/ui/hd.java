package org.telegram.ui;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class hd extends org.telegram.ui.Components.ei0 {
    public final int f37892r;
    public final Object f37893s;

    public hd(Object obj, Context context, int i10) {
        super(context);
        this.f37892r = i10;
        this.f37893s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f37892r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((kd) this.f37893s).h.invalidate();
                return;
            case 1:
            case 2:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((c60) this.f37893s).e.invalidate();
                return;
            case 4:
                super.invalidate(i10, i11, i12, i13);
                ((wd0) this.f37893s).h.invalidate();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f37892r) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (((org.telegram.ui.Components.dp) this.f37893s).D1) {
                    accessibilityNodeInfo.setText(org.telegram.messenger.cd.L0(2131754751, null));
                    return;
                } else {
                    accessibilityNodeInfo.setText(org.telegram.messenger.cd.L0(2131754750, null));
                    return;
                }
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f37892r) {
            case 0:
                super.invalidate();
                ((kd) this.f37893s).h.invalidate();
                return;
            case 1:
            default:
                super.invalidate();
                return;
            case 2:
                super.invalidate();
                ((org.telegram.ui.Components.y10) this.f37893s).invalidate();
                return;
            case 3:
                super.invalidate();
                ((c60) this.f37893s).e.invalidate();
                return;
            case 4:
                super.invalidate();
                ((wd0) this.f37893s).h.invalidate();
                return;
        }
    }
}
