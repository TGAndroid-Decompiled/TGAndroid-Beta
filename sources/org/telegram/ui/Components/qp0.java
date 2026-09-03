package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.PhotoViewer;
public final class qp0 extends lg {
    public final int f30487i0;
    public final Object f30488j0;

    public qp0(Object obj, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        super(i10, context, g6Var, true);
        this.f30487i0 = i11;
        this.f30488j0 = obj;
    }

    @Override
    public boolean d() {
        switch (this.f30487i0) {
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return ((wh.z1) this.f30488j0).l0();
            default:
                return super.d();
        }
    }

    @Override
    public final boolean f() {
        switch (this.f30487i0) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                if (!((wh.z1) this.f30488j0).I0 && this.f28748r <= 0) {
                    return false;
                }
                return true;
            default:
                if (!((wh.v3) this.f30488j0).T && this.f28748r <= 0) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public int getFillColor() {
        int i10 = this.f30487i0;
        Object obj = this.f30488j0;
        switch (i10) {
            case 0:
                return ((lq0) obj).getThemedColor(org.telegram.ui.ActionBar.k6.S5);
            case 1:
            default:
                return super.getFillColor();
            case 2:
                int i11 = org.telegram.ui.ActionBar.k6.f22061zf;
                Drawable[] drawableArr = PhotoViewer.Q8;
                return ((PhotoViewer) obj).z1(i11);
        }
    }

    @Override
    public boolean j() {
        switch (this.f30487i0) {
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
        switch (this.f30487i0) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", ((org.telegram.ui.py) this.f30488j0).F2.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    public qp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        super(i10, context, g6Var, false);
        this.f30487i0 = i11;
        this.f30488j0 = notificationCenterDelegate;
    }
}
