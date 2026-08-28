package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class wo0 extends lg {
    public final int f34302h0;
    public final Object f34303i0;

    public wo0(Object obj, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var, int i10) {
        super(i9, context, b6Var, true);
        this.f34302h0 = i10;
        this.f34303i0 = obj;
    }

    @Override
    public boolean d() {
        switch (this.f34302h0) {
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return ((qh.x1) this.f34303i0).k0();
            default:
                return super.d();
        }
    }

    @Override
    public final boolean f() {
        switch (this.f34302h0) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                if (!((qh.x1) this.f34303i0).H0 && this.f30444r <= 0) {
                    return false;
                }
                return true;
            default:
                if (!((qh.s3) this.f34303i0).S && this.f30444r <= 0) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public int getFillColor() {
        int i9 = this.f34302h0;
        Object obj = this.f34303i0;
        switch (i9) {
            case 0:
                return ((rp0) obj).getThemedColor(org.telegram.ui.ActionBar.f6.S5);
            case 1:
            default:
                return super.getFillColor();
            case 2:
                int i10 = org.telegram.ui.ActionBar.f6.f23395zf;
                Drawable[] drawableArr = PhotoViewer.P8;
                return ((PhotoViewer) obj).z1(i10);
        }
    }

    @Override
    public boolean j() {
        switch (this.f34302h0) {
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
        switch (this.f34302h0) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", ((org.telegram.ui.dy) this.f34303i0).E2.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    public wo0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var, int i10) {
        super(i9, context, b6Var, false);
        this.f34302h0 = i10;
        this.f34303i0 = notificationCenterDelegate;
    }
}
