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
public class dg0 extends AccessibilityNodeProvider {
    public final int f25484a = 0;
    public final Object f25485b;

    public dg0(r2.y yVar) {
        this.f25485b = yVar;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        eg0 eg0Var;
        switch (this.f25484a) {
            case 0:
                int[] iArr = {0, 0};
                hg0 hg0Var = (hg0) this.f25485b;
                ArrayList arrayList = hg0Var.f26788a;
                hg0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(hg0Var);
                    hg0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(hg0Var, ((eg0) arrayList.get(i11)).f25812a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((eg0) arrayList.get(i12)).f25812a == i10) {
                            eg0Var = (eg0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        eg0Var = null;
                    }
                }
                if (eg0Var != null) {
                    RectF rectF = eg0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(hg0Var, i10);
                        obtain2.setParent(hg0Var);
                        obtain2.setPackageName(hg0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(eg0Var.f25820l.j());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.c I = ((r2.y) this.f25485b).I(i10);
                if (I == null) {
                    return null;
                }
                return I.f47861a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.f25484a) {
            case 1:
                ((r2.y) this.f25485b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.f25484a) {
            case 1:
                s0.c Q = ((r2.y) this.f25485b).Q(i10);
                if (Q == null) {
                    return null;
                }
                return Q.f47861a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        eg0 eg0Var;
        switch (this.f25484a) {
            case 0:
                hg0 hg0Var = (hg0) this.f25485b;
                ArrayList arrayList = hg0Var.f26788a;
                if (i10 == -1) {
                    return hg0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((eg0) arrayList.get(i12)).f25812a == i10) {
                            eg0Var = (eg0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        eg0Var = null;
                    }
                }
                if (eg0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) hg0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(hg0Var.getContext().getPackageName());
                            obtain.setSource(hg0Var, i10);
                            if (hg0Var.getParent() != null) {
                                hg0Var.getParent().requestSendAccessibilityEvent(hg0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        gg0 gg0Var = hg0Var.f26798y;
                        if (gg0Var != null) {
                            ProfileActivity.m0(((org.telegram.ui.av0) gg0Var).f35843b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((r2.y) this.f25485b).a0(i10, i11, bundle);
        }
    }

    public dg0(hg0 hg0Var) {
        this.f25485b = hg0Var;
    }
}
