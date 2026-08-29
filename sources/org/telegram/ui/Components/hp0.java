package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class hp0 extends og {
    public final int f29214h0;
    public final Object f29215i0;

    public hp0(Object obj, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(i10, context, c6Var, true);
        this.f29214h0 = i11;
        this.f29215i0 = obj;
    }

    @Override
    public boolean d() {
        switch (this.f29214h0) {
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return ((th.x1) this.f29215i0).l0();
            default:
                return super.d();
        }
    }

    @Override
    public final boolean f() {
        switch (this.f29214h0) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                if (!((th.x1) this.f29215i0).H0 && this.f31358r <= 0) {
                    return false;
                }
                return true;
            default:
                if (!((th.t3) this.f29215i0).S && this.f31358r <= 0) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public int getFillColor() {
        int i10 = this.f29214h0;
        Object obj = this.f29215i0;
        switch (i10) {
            case 0:
                return ((dq0) obj).getThemedColor(org.telegram.ui.ActionBar.g6.S5);
            case 1:
            default:
                return super.getFillColor();
            case 2:
                int i11 = org.telegram.ui.ActionBar.g6.f23459zf;
                Drawable[] drawableArr = PhotoViewer.P8;
                return ((PhotoViewer) obj).z1(i11);
        }
    }

    @Override
    public boolean j() {
        switch (this.f29214h0) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            default:
                return super.j();
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f29214h0) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", ((org.telegram.ui.fy) this.f29215i0).E2.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    public hp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(i10, context, c6Var, false);
        this.f29214h0 = i11;
        this.f29215i0 = notificationCenterDelegate;
    }
}
