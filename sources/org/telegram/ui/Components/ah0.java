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
public class ah0 extends AccessibilityNodeProvider {
    public final int f22411a = 1;
    public final Object f22412b;

    public ah0(k2.u uVar) {
        this.f22412b = uVar;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        bh0 bh0Var;
        switch (this.f22411a) {
            case 0:
                int[] iArr = {0, 0};
                eh0 eh0Var = (eh0) this.f22412b;
                ArrayList arrayList = eh0Var.f23555a;
                eh0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(eh0Var);
                    eh0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(eh0Var, ((bh0) arrayList.get(i11)).f22728a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((bh0) arrayList.get(i12)).f22728a == i10) {
                            bh0Var = (bh0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        bh0Var = null;
                    }
                }
                if (bh0Var != null) {
                    RectF rectF = bh0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(eh0Var, i10);
                        obtain2.setParent(eh0Var);
                        obtain2.setPackageName(eh0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(bh0Var.f22736l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.c Z = ((k2.u) this.f22412b).Z(i10);
                if (Z == null) {
                    return null;
                }
                return Z.f42646a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.f22411a) {
            case 1:
                ((k2.u) this.f22412b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.f22411a) {
            case 1:
                s0.c a02 = ((k2.u) this.f22412b).a0(i10);
                if (a02 == null) {
                    return null;
                }
                return a02.f42646a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        bh0 bh0Var;
        switch (this.f22411a) {
            case 0:
                eh0 eh0Var = (eh0) this.f22412b;
                ArrayList arrayList = eh0Var.f23555a;
                if (i10 == -1) {
                    return eh0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((bh0) arrayList.get(i12)).f22728a == i10) {
                            bh0Var = (bh0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        bh0Var = null;
                    }
                }
                if (bh0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) eh0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(eh0Var.getContext().getPackageName());
                            obtain.setSource(eh0Var, i10);
                            if (eh0Var.getParent() != null) {
                                eh0Var.getParent().requestSendAccessibilityEvent(eh0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        dh0 dh0Var = eh0Var.F;
                        if (dh0Var != null) {
                            ProfileActivity.Y(((org.telegram.ui.my0) dh0Var).f35907b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((k2.u) this.f22412b).c0(i10, i11, bundle);
        }
    }

    public ah0(eh0 eh0Var) {
        this.f22412b = eh0Var;
    }
}
