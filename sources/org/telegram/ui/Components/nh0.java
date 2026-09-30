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
public class nh0 extends AccessibilityNodeProvider {
    public final int f26712a = 1;
    public final Object f26713b;

    public nh0(n2.e eVar) {
        this.f26713b = eVar;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        oh0 oh0Var;
        switch (this.f26712a) {
            case 0:
                int[] iArr = {0, 0};
                rh0 rh0Var = (rh0) this.f26713b;
                ArrayList arrayList = rh0Var.f28013a;
                rh0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(rh0Var);
                    rh0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(rh0Var, ((oh0) arrayList.get(i11)).f27082a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((oh0) arrayList.get(i12)).f27082a == i10) {
                            oh0Var = (oh0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        oh0Var = null;
                    }
                }
                if (oh0Var != null) {
                    RectF rectF = oh0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(rh0Var, i10);
                        obtain2.setParent(rh0Var);
                        obtain2.setPackageName(rh0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(oh0Var.f27090l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.d u10 = ((n2.e) this.f26713b).u(i10);
                if (u10 == null) {
                    return null;
                }
                return u10.f43017a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.f26712a) {
            case 1:
                ((n2.e) this.f26713b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.f26712a) {
            case 1:
                s0.d v = ((n2.e) this.f26713b).v(i10);
                if (v == null) {
                    return null;
                }
                return v.f43017a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        oh0 oh0Var;
        switch (this.f26712a) {
            case 0:
                rh0 rh0Var = (rh0) this.f26713b;
                ArrayList arrayList = rh0Var.f28013a;
                if (i10 == -1) {
                    return rh0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((oh0) arrayList.get(i12)).f27082a == i10) {
                            oh0Var = (oh0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        oh0Var = null;
                    }
                }
                if (oh0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) rh0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(rh0Var.getContext().getPackageName());
                            obtain.setSource(rh0Var, i10);
                            if (rh0Var.getParent() != null) {
                                rh0Var.getParent().requestSendAccessibilityEvent(rh0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        qh0 qh0Var = rh0Var.F;
                        if (qh0Var != null) {
                            ProfileActivity.Y(((org.telegram.ui.by0) qh0Var).f32597b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((n2.e) this.f26713b).H(i10, i11, bundle);
        }
    }

    public nh0(rh0 rh0Var) {
        this.f26713b = rh0Var;
    }
}
