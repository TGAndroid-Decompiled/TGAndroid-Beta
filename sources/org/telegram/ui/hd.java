package org.telegram.ui;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
public final class hd extends org.telegram.ui.Components.fi0 {
    public final int f37782r;
    public final Object f37783s;

    public hd(Object obj, Context context, int i10) {
        super(context);
        this.f37782r = i10;
        this.f37783s = obj;
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.f37782r) {
            case 0:
                super.invalidate(i10, i11, i12, i13);
                ((kd) this.f37783s).h.invalidate();
                return;
            case 1:
            case 2:
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
            case 3:
                super.invalidate(i10, i11, i12, i13);
                ((b60) this.f37783s).e.invalidate();
                return;
            case 4:
                super.invalidate(i10, i11, i12, i13);
                ((vd0) this.f37783s).h.invalidate();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f37782r) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (((org.telegram.ui.Components.dp) this.f37783s).D1) {
                    accessibilityNodeInfo.setText(org.telegram.messenger.dd.L0(2131754751, null));
                    return;
                } else {
                    accessibilityNodeInfo.setText(org.telegram.messenger.dd.L0(2131754750, null));
                    return;
                }
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public void invalidate() {
        switch (this.f37782r) {
            case 0:
                super.invalidate();
                ((kd) this.f37783s).h.invalidate();
                return;
            case 1:
            default:
                super.invalidate();
                return;
            case 2:
                super.invalidate();
                ((org.telegram.ui.Components.y10) this.f37783s).invalidate();
                return;
            case 3:
                super.invalidate();
                ((b60) this.f37783s).e.invalidate();
                return;
            case 4:
                super.invalidate();
                ((vd0) this.f37783s).h.invalidate();
                return;
        }
    }
}
