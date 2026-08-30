package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class qp0 extends lg {
    public final int f28212i0;
    public final Object f28213j0;

    public qp0(Object obj, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(i10, context, f6Var, true);
        this.f28212i0 = i11;
        this.f28213j0 = obj;
    }

    @Override
    public boolean d() {
        switch (this.f28212i0) {
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return ((vh.y1) this.f28213j0).l0();
            default:
                return super.d();
        }
    }

    @Override
    public final boolean f() {
        switch (this.f28212i0) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                if (!((vh.y1) this.f28213j0).I0 && this.f26651r <= 0) {
                    return false;
                }
                return true;
            default:
                if (!((vh.v3) this.f28213j0).T && this.f26651r <= 0) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public int getFillColor() {
        int i10 = this.f28212i0;
        Object obj = this.f28213j0;
        switch (i10) {
            case 0:
                return ((lq0) obj).getThemedColor(org.telegram.ui.ActionBar.j6.S5);
            case 1:
            default:
                return super.getFillColor();
            case 2:
                int i11 = org.telegram.ui.ActionBar.j6.f20304zf;
                Drawable[] drawableArr = PhotoViewer.Q8;
                return ((PhotoViewer) obj).z1(i11);
        }
    }

    @Override
    public boolean j() {
        switch (this.f28212i0) {
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
        switch (this.f28212i0) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", ((org.telegram.ui.oy) this.f28213j0).F2.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    public qp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(i10, context, f6Var, false);
        this.f28212i0 = i11;
        this.f28213j0 = notificationCenterDelegate;
    }
}
