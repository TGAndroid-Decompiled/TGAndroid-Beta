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
public class vh0 extends AccessibilityNodeProvider {
    public final int f31260a = 1;
    public final Object f31261b;

    public vh0(l2.f fVar) {
        this.f31261b = fVar;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        wh0 wh0Var;
        switch (this.f31260a) {
            case 0:
                int[] iArr = {0, 0};
                zh0 zh0Var = (zh0) this.f31261b;
                ArrayList arrayList = zh0Var.f32906a;
                zh0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(zh0Var);
                    zh0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(zh0Var, ((wh0) arrayList.get(i11)).f32110a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((wh0) arrayList.get(i12)).f32110a == i10) {
                            wh0Var = (wh0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        wh0Var = null;
                    }
                }
                if (wh0Var != null) {
                    RectF rectF = wh0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(zh0Var, i10);
                        obtain2.setParent(zh0Var);
                        obtain2.setPackageName(zh0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(wh0Var.f32118l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.c D = ((l2.f) this.f31261b).D(i10);
                if (D == null) {
                    return null;
                }
                return D.f45878a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.f31260a) {
            case 1:
                ((l2.f) this.f31261b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.f31260a) {
            case 1:
                s0.c E = ((l2.f) this.f31261b).E(i10);
                if (E == null) {
                    return null;
                }
                return E.f45878a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        wh0 wh0Var;
        switch (this.f31260a) {
            case 0:
                zh0 zh0Var = (zh0) this.f31261b;
                ArrayList arrayList = zh0Var.f32906a;
                if (i10 == -1) {
                    return zh0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((wh0) arrayList.get(i12)).f32110a == i10) {
                            wh0Var = (wh0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        wh0Var = null;
                    }
                }
                if (wh0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) zh0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(zh0Var.getContext().getPackageName());
                            obtain.setSource(zh0Var, i10);
                            if (zh0Var.getParent() != null) {
                                zh0Var.getParent().requestSendAccessibilityEvent(zh0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        yh0 yh0Var = zh0Var.F;
                        if (yh0Var != null) {
                            ProfileActivity.e0(((org.telegram.ui.mx0) yh0Var).f39368b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((l2.f) this.f31261b).O(i10, i11, bundle);
        }
    }

    public vh0(zh0 zh0Var) {
        this.f31261b = zh0Var;
    }
}
