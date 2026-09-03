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
public class hh0 extends AccessibilityNodeProvider {
    public final int f27507a = 1;
    public final Object f27508b;

    public hh0(org.telegram.ui.Cells.f1 f1Var) {
        this.f27508b = f1Var;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        ih0 ih0Var;
        switch (this.f27507a) {
            case 0:
                int[] iArr = {0, 0};
                lh0 lh0Var = (lh0) this.f27508b;
                ArrayList arrayList = lh0Var.f28758a;
                lh0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(lh0Var);
                    lh0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(lh0Var, ((ih0) arrayList.get(i11)).f27819a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((ih0) arrayList.get(i12)).f27819a == i10) {
                            ih0Var = (ih0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        ih0Var = null;
                    }
                }
                if (ih0Var != null) {
                    RectF rectF = ih0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(lh0Var, i10);
                        obtain2.setParent(lh0Var);
                        obtain2.setPackageName(lh0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(ih0Var.f27828l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.d i13 = ((org.telegram.ui.Cells.f1) this.f27508b).i(i10);
                if (i13 == null) {
                    return null;
                }
                return i13.f46881a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.f27507a) {
            case 1:
                ((org.telegram.ui.Cells.f1) this.f27508b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.f27507a) {
            case 1:
                s0.d o10 = ((org.telegram.ui.Cells.f1) this.f27508b).o(i10);
                if (o10 == null) {
                    return null;
                }
                return o10.f46881a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        ih0 ih0Var;
        switch (this.f27507a) {
            case 0:
                lh0 lh0Var = (lh0) this.f27508b;
                ArrayList arrayList = lh0Var.f28758a;
                if (i10 == -1) {
                    return lh0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((ih0) arrayList.get(i12)).f27819a == i10) {
                            ih0Var = (ih0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        ih0Var = null;
                    }
                }
                if (ih0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) lh0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(lh0Var.getContext().getPackageName());
                            obtain.setSource(lh0Var, i10);
                            if (lh0Var.getParent() != null) {
                                lh0Var.getParent().requestSendAccessibilityEvent(lh0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        kh0 kh0Var = lh0Var.C;
                        if (kh0Var != null) {
                            ProfileActivity.Y(((org.telegram.ui.wx0) kh0Var).f42873b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((org.telegram.ui.Cells.f1) this.f27508b).D(i10, i11, bundle);
        }
    }

    public hh0(lh0 lh0Var) {
        this.f27508b = lh0Var;
    }
}
