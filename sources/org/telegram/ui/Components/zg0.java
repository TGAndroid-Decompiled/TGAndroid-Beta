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
public class zg0 extends AccessibilityNodeProvider {
    public final int f33154a = 1;
    public final Object f33155b;

    public zg0(ji.u4 u4Var) {
        this.f33155b = u4Var;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        ah0 ah0Var;
        switch (this.f33154a) {
            case 0:
                int[] iArr = {0, 0};
                dh0 dh0Var = (dh0) this.f33155b;
                ArrayList arrayList = dh0Var.f25385a;
                dh0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(dh0Var);
                    dh0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(dh0Var, ((ah0) arrayList.get(i11)).f24374a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((ah0) arrayList.get(i12)).f24374a == i10) {
                            ah0Var = (ah0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        ah0Var = null;
                    }
                }
                if (ah0Var != null) {
                    RectF rectF = ah0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(dh0Var, i10);
                        obtain2.setParent(dh0Var);
                        obtain2.setPackageName(dh0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(ah0Var.f24383l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.c o9 = ((ji.u4) this.f33155b).o(i10);
                if (o9 == null) {
                    return null;
                }
                return o9.f45685a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.f33154a) {
            case 1:
                ((ji.u4) this.f33155b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.f33154a) {
            case 1:
                s0.c z10 = ((ji.u4) this.f33155b).z(i10);
                if (z10 == null) {
                    return null;
                }
                return z10.f45685a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        ah0 ah0Var;
        switch (this.f33154a) {
            case 0:
                dh0 dh0Var = (dh0) this.f33155b;
                ArrayList arrayList = dh0Var.f25385a;
                if (i10 == -1) {
                    return dh0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((ah0) arrayList.get(i12)).f24374a == i10) {
                            ah0Var = (ah0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        ah0Var = null;
                    }
                }
                if (ah0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) dh0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(dh0Var.getContext().getPackageName());
                            obtain.setSource(dh0Var, i10);
                            if (dh0Var.getParent() != null) {
                                dh0Var.getParent().requestSendAccessibilityEvent(dh0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        ch0 ch0Var = dh0Var.F;
                        if (ch0Var != null) {
                            ProfileActivity.Y(((org.telegram.ui.ky0) ch0Var).f38152b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((ji.u4) this.f33155b).N(i10, i11, bundle);
        }
    }

    public zg0(dh0 dh0Var) {
        this.f33155b = dh0Var;
    }
}
