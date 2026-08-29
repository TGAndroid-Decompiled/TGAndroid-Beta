package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.Button;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.ProfileActivity;
public class vg0 extends AccessibilityNodeProvider {
    public final int f33557a = 1;
    public final Object f33558b;

    public vg0(n nVar) {
        this.f33558b = nVar;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        wg0 wg0Var;
        switch (this.f33557a) {
            case 0:
                int[] iArr = {0, 0};
                zg0 zg0Var = (zg0) this.f33558b;
                ArrayList arrayList = zg0Var.f35338a;
                zg0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(zg0Var);
                    zg0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(zg0Var, ((wg0) arrayList.get(i11)).f34399a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((wg0) arrayList.get(i12)).f34399a == i10) {
                            wg0Var = (wg0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        wg0Var = null;
                    }
                }
                if (wg0Var != null) {
                    RectF rectF = wg0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(zg0Var, i10);
                        obtain2.setParent(zg0Var);
                        obtain2.setPackageName(zg0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(wg0Var.f34408l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.c g10 = ((n) this.f33558b).g(i10);
                if (g10 == null) {
                    return null;
                }
                return g10.f47482a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.f33557a) {
            case 1:
                ((n) this.f33558b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.f33557a) {
            case 1:
                s0.c i11 = ((n) this.f33558b).i(i10);
                if (i11 == null) {
                    return null;
                }
                return i11.f47482a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        wg0 wg0Var;
        switch (this.f33557a) {
            case 0:
                zg0 zg0Var = (zg0) this.f33558b;
                ArrayList arrayList = zg0Var.f35338a;
                if (i10 == -1) {
                    return zg0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((wg0) arrayList.get(i12)).f34399a == i10) {
                            wg0Var = (wg0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        wg0Var = null;
                    }
                }
                if (wg0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) zg0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(zg0Var.getContext().getPackageName());
                            obtain.setSource(zg0Var, i10);
                            if (zg0Var.getParent() != null) {
                                zg0Var.getParent().requestSendAccessibilityEvent(zg0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        yg0 yg0Var = zg0Var.B;
                        if (yg0Var != null) {
                            ProfileActivity.Y(((org.telegram.ui.ex0) yg0Var).f37920b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((n) this.f33558b).n(i10, i11, bundle);
        }
    }

    public vg0(zg0 zg0Var) {
        this.f33558b = zg0Var;
    }
}
