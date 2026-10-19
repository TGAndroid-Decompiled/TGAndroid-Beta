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
    public final int f30965a = 1;
    public final Object f30966b;

    public uh0(l2.f fVar) {
        this.f30966b = fVar;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        vh0 vh0Var;
        switch (this.f30965a) {
            case 0:
                int[] iArr = {0, 0};
                yh0 yh0Var = (yh0) this.f30966b;
                ArrayList arrayList = yh0Var.f32625a;
                yh0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(yh0Var);
                    yh0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(yh0Var, ((vh0) arrayList.get(i11)).f31290a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((vh0) arrayList.get(i12)).f31290a == i10) {
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
                        obtain2.setText(vh0Var.f31298l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.c D = ((l2.f) this.f30966b).D(i10);
                if (D == null) {
                    return null;
                }
                return D.f45867a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.f30965a) {
            case 1:
                ((l2.f) this.f30966b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.f30965a) {
            case 1:
                s0.c E = ((l2.f) this.f30966b).E(i10);
                if (E == null) {
                    return null;
                }
                return E.f45867a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        vh0 vh0Var;
        switch (this.f30965a) {
            case 0:
                yh0 yh0Var = (yh0) this.f30966b;
                ArrayList arrayList = yh0Var.f32625a;
                if (i10 == -1) {
                    return yh0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((vh0) arrayList.get(i12)).f31290a == i10) {
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
                            ProfileActivity.e0(((org.telegram.ui.mx0) xh0Var).f39362b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((l2.f) this.f30966b).O(i10, i11, bundle);
        }
    }

    public uh0(yh0 yh0Var) {
        this.f30966b = yh0Var;
    }
}
