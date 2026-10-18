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
public class uh0 extends AccessibilityNodeProvider {
    public final int f30997a = 1;
    public final Object f30998b;

    public uh0(ki.t1 t1Var) {
        this.f30998b = t1Var;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        vh0 vh0Var;
        switch (this.f30997a) {
            case 0:
                int[] iArr = {0, 0};
                yh0 yh0Var = (yh0) this.f30998b;
                ArrayList arrayList = yh0Var.f32638a;
                yh0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(yh0Var);
                    yh0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(yh0Var, ((vh0) arrayList.get(i11)).f31286a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((vh0) arrayList.get(i12)).f31286a == i10) {
                            vh0Var = (vh0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        vh0Var = null;
                    }
                }
                if (vh0Var != null) {
                    RectF rectF = vh0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(yh0Var, i10);
                        obtain2.setParent(yh0Var);
                        obtain2.setPackageName(yh0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(vh0Var.f31294l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.c i13 = ((ki.t1) this.f30998b).i(i10);
                if (i13 == null) {
                    return null;
                }
                return i13.f45915a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.f30997a) {
            case 1:
                ((ki.t1) this.f30998b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.f30997a) {
            case 1:
                s0.c q6 = ((ki.t1) this.f30998b).q(i10);
                if (q6 == null) {
                    return null;
                }
                return q6.f45915a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        vh0 vh0Var;
        switch (this.f30997a) {
            case 0:
                yh0 yh0Var = (yh0) this.f30998b;
                ArrayList arrayList = yh0Var.f32638a;
                if (i10 == -1) {
                    return yh0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((vh0) arrayList.get(i12)).f31286a == i10) {
                            vh0Var = (vh0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        vh0Var = null;
                    }
                }
                if (vh0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) yh0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(yh0Var.getContext().getPackageName());
                            obtain.setSource(yh0Var, i10);
                            if (yh0Var.getParent() != null) {
                                yh0Var.getParent().requestSendAccessibilityEvent(yh0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        xh0 xh0Var = yh0Var.F;
                        if (xh0Var != null) {
                            ProfileActivity.e0(((org.telegram.ui.ox0) xh0Var).f39918b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((ki.t1) this.f30998b).Q(i10, i11, bundle);
        }
    }

    public uh0(yh0 yh0Var) {
        this.f30998b = yh0Var;
    }
}
