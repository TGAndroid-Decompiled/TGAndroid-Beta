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
public class kh0 extends AccessibilityNodeProvider {
    public final int f25771a = 1;
    public final Object f25772b;

    public kh0(n2.e eVar) {
        this.f25772b = eVar;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        lh0 lh0Var;
        switch (this.f25771a) {
            case 0:
                int[] iArr = {0, 0};
                oh0 oh0Var = (oh0) this.f25772b;
                ArrayList arrayList = oh0Var.f27068a;
                oh0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(oh0Var);
                    oh0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(oh0Var, ((lh0) arrayList.get(i11)).f26088a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((lh0) arrayList.get(i12)).f26088a == i10) {
                            lh0Var = (lh0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        lh0Var = null;
                    }
                }
                if (lh0Var != null) {
                    RectF rectF = lh0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(oh0Var, i10);
                        obtain2.setParent(oh0Var);
                        obtain2.setPackageName(oh0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(lh0Var.f26096l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.d u10 = ((n2.e) this.f25772b).u(i10);
                if (u10 == null) {
                    return null;
                }
                return u10.f42895a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.f25771a) {
            case 1:
                ((n2.e) this.f25772b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.f25771a) {
            case 1:
                s0.d v = ((n2.e) this.f25772b).v(i10);
                if (v == null) {
                    return null;
                }
                return v.f42895a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        lh0 lh0Var;
        switch (this.f25771a) {
            case 0:
                oh0 oh0Var = (oh0) this.f25772b;
                ArrayList arrayList = oh0Var.f27068a;
                if (i10 == -1) {
                    return oh0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((lh0) arrayList.get(i12)).f26088a == i10) {
                            lh0Var = (lh0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        lh0Var = null;
                    }
                }
                if (lh0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) oh0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(oh0Var.getContext().getPackageName());
                            obtain.setSource(oh0Var, i10);
                            if (oh0Var.getParent() != null) {
                                oh0Var.getParent().requestSendAccessibilityEvent(oh0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        nh0 nh0Var = oh0Var.F;
                        if (nh0Var != null) {
                            ProfileActivity.Y(((org.telegram.ui.by0) nh0Var).f32497b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((n2.e) this.f25772b).H(i10, i11, bundle);
        }
    }

    public kh0(oh0 oh0Var) {
        this.f25772b = oh0Var;
    }
}
