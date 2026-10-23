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
public class yh0 extends AccessibilityNodeProvider {
    public final int f32919a = 1;
    public final Object f32920b;

    public yh0(l2.f fVar) {
        this.f32920b = fVar;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        zh0 zh0Var;
        switch (this.f32919a) {
            case 0:
                int[] iArr = {0, 0};
                ci0 ci0Var = (ci0) this.f32920b;
                ArrayList arrayList = ci0Var.f25337a;
                ci0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(ci0Var);
                    ci0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(ci0Var, ((zh0) arrayList.get(i11)).f33225a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((zh0) arrayList.get(i12)).f33225a == i10) {
                            zh0Var = (zh0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        zh0Var = null;
                    }
                }
                if (zh0Var != null) {
                    RectF rectF = zh0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(ci0Var, i10);
                        obtain2.setParent(ci0Var);
                        obtain2.setPackageName(ci0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(zh0Var.f33233l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.d D = ((l2.f) this.f32920b).D(i10);
                if (D == null) {
                    return null;
                }
                return D.f46300a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.f32919a) {
            case 1:
                ((l2.f) this.f32920b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.f32919a) {
            case 1:
                s0.d F = ((l2.f) this.f32920b).F(i10);
                if (F == null) {
                    return null;
                }
                return F.f46300a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        zh0 zh0Var;
        switch (this.f32919a) {
            case 0:
                ci0 ci0Var = (ci0) this.f32920b;
                ArrayList arrayList = ci0Var.f25337a;
                if (i10 == -1) {
                    return ci0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((zh0) arrayList.get(i12)).f33225a == i10) {
                            zh0Var = (zh0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        zh0Var = null;
                    }
                }
                if (zh0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) ci0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(ci0Var.getContext().getPackageName());
                            obtain.setSource(ci0Var, i10);
                            if (ci0Var.getParent() != null) {
                                ci0Var.getParent().requestSendAccessibilityEvent(ci0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        bi0 bi0Var = ci0Var.F;
                        if (bi0Var != null) {
                            ProfileActivity.d0(((org.telegram.ui.qx0) bi0Var).f40933b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((l2.f) this.f32920b).O(i10, i11, bundle);
        }
    }

    public yh0(ci0 ci0Var) {
        this.f32920b = ci0Var;
    }
}
