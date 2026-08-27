package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;

public final class wo0 extends hg {

    public final int f34305h0;

    public final Object f34306i0;

    public wo0(Object obj, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(i10, context, c6Var, true);
        this.f34305h0 = i11;
        this.f34306i0 = obj;
    }

    @Override
    public boolean d() {
        switch (this.f34305h0) {
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return ((rh.x1) this.f34306i0).l0();
            default:
                return super.d();
        }
    }

    @Override
    public final boolean f() {
        switch (this.f34305h0) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return ((rh.x1) this.f34306i0).H0 || this.f29001r > 0;
            default:
                return ((rh.t3) this.f34306i0).S || this.f29001r > 0;
        }
    }

    @Override
    public int getFillColor() {
        int i10 = this.f34305h0;
        Object obj = this.f34306i0;
        switch (i10) {
            case 0:
                return ((sp0) obj).getThemedColor(org.telegram.ui.ActionBar.g6.S5);
            case 1:
            default:
                return super.getFillColor();
            case 2:
                int i11 = org.telegram.ui.ActionBar.g6.f23449zf;
                Drawable[] drawableArr = PhotoViewer.P8;
                return ((PhotoViewer) obj).z1(i11);
        }
    }

    @Override
    public boolean j() {
        switch (this.f34305h0) {
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
        switch (this.f34305h0) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", ((org.telegram.ui.gy) this.f34306i0).E2.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    public wo0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(i10, context, c6Var, false);
        this.f34305h0 = i11;
        this.f34306i0 = notificationCenterDelegate;
    }
}
