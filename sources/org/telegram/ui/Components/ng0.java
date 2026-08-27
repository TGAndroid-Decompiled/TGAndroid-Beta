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

public class ng0 extends AccessibilityNodeProvider {

    public final int f30967a = 1;

    public final Object f30968b;

    public ng0(m5.o oVar) {
        this.f30968b = oVar;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        og0 og0Var;
        switch (this.f30967a) {
            case 0:
                int[] iArr = {0, 0};
                rg0 rg0Var = (rg0) this.f30968b;
                ArrayList arrayList = rg0Var.f32157a;
                rg0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(rg0Var);
                    rg0Var.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
                    accessibilityNodeInfoObtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        accessibilityNodeInfoObtain.addChild(rg0Var, ((og0) arrayList.get(i11)).f31280a);
                    }
                    return accessibilityNodeInfoObtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        og0Var = null;
                    } else if (((og0) arrayList.get(i12)).f31280a == i10) {
                        og0Var = (og0) arrayList.get(i12);
                    } else {
                        i12++;
                    }
                }
                if (og0Var != null) {
                    RectF rectF = og0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain();
                        accessibilityNodeInfoObtain2.setSource(rg0Var, i10);
                        accessibilityNodeInfoObtain2.setParent(rg0Var);
                        accessibilityNodeInfoObtain2.setPackageName(rg0Var.getContext().getPackageName());
                        accessibilityNodeInfoObtain2.addAction(16);
                        accessibilityNodeInfoObtain2.addAction(64);
                        accessibilityNodeInfoObtain2.setClickable(true);
                        accessibilityNodeInfoObtain2.setFocusable(true);
                        accessibilityNodeInfoObtain2.setEnabled(true);
                        accessibilityNodeInfoObtain2.setVisibleToUser(true);
                        accessibilityNodeInfoObtain2.setClassName(Button.class.getName());
                        accessibilityNodeInfoObtain2.setText(og0Var.f31289l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        accessibilityNodeInfoObtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        accessibilityNodeInfoObtain2.setBoundsInScreen(rect);
                        return accessibilityNodeInfoObtain2;
                    }
                }
                return null;
            default:
                s0.c cVarU = ((m5.o) this.f30968b).u(i10);
                if (cVarU == null) {
                    return null;
                }
                return cVarU.f47656a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.f30967a) {
            case 1:
                ((m5.o) this.f30968b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.f30967a) {
            case 1:
                s0.c cVarW = ((m5.o) this.f30968b).w(i10);
                if (cVarW == null) {
                    return null;
                }
                return cVarW.f47656a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        og0 og0Var;
        switch (this.f30967a) {
            case 0:
                rg0 rg0Var = (rg0) this.f30968b;
                ArrayList arrayList = rg0Var.f32157a;
                if (i10 == -1) {
                    return rg0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList.size()) {
                        og0Var = null;
                    } else if (((og0) arrayList.get(i12)).f31280a == i10) {
                        og0Var = (og0) arrayList.get(i12);
                    } else {
                        i12++;
                    }
                }
                if (og0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) rg0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(32768);
                            accessibilityEventObtain.setPackageName(rg0Var.getContext().getPackageName());
                            accessibilityEventObtain.setSource(rg0Var, i10);
                            if (rg0Var.getParent() != null) {
                                rg0Var.getParent().requestSendAccessibilityEvent(rg0Var, accessibilityEventObtain);
                            }
                        }
                    } else if (i11 == 16) {
                        qg0 qg0Var = rg0Var.B;
                        if (qg0Var != null) {
                            ProfileActivity.Y(((org.telegram.ui.gx0) qg0Var).f38493b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((m5.o) this.f30968b).y(i10, i11, bundle);
        }
    }

    public ng0(rg0 rg0Var) {
        this.f30968b = rg0Var;
    }
}
