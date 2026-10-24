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
public class xh0 extends AccessibilityNodeProvider {
    public final int f32583a = 1;
    public final Object f32584b;

    public xh0(l2.f fVar) {
        this.f32584b = fVar;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        yh0 yh0Var;
        switch (this.f32583a) {
            case 0:
                int[] iArr = {0, 0};
                bi0 bi0Var = (bi0) this.f32584b;
                ArrayList arrayList = bi0Var.f25007a;
                bi0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(bi0Var);
                    bi0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(bi0Var, ((yh0) arrayList.get(i11)).f32916a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((yh0) arrayList.get(i12)).f32916a == i10) {
                            yh0Var = (yh0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        yh0Var = null;
                    }
                }
                if (yh0Var != null) {
                    RectF rectF = yh0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(bi0Var, i10);
                        obtain2.setParent(bi0Var);
                        obtain2.setPackageName(bi0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(yh0Var.f32924l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.d D = ((l2.f) this.f32584b).D(i10);
                if (D == null) {
                    return null;
                }
                return D.f46299a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.f32583a) {
            case 1:
                ((l2.f) this.f32584b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.f32583a) {
            case 1:
                s0.d F = ((l2.f) this.f32584b).F(i10);
                if (F == null) {
                    return null;
                }
                return F.f46299a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        yh0 yh0Var;
        switch (this.f32583a) {
            case 0:
                bi0 bi0Var = (bi0) this.f32584b;
                ArrayList arrayList = bi0Var.f25007a;
                if (i10 == -1) {
                    return bi0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((yh0) arrayList.get(i12)).f32916a == i10) {
                            yh0Var = (yh0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        yh0Var = null;
                    }
                }
                if (yh0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) bi0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(bi0Var.getContext().getPackageName());
                            obtain.setSource(bi0Var, i10);
                            if (bi0Var.getParent() != null) {
                                bi0Var.getParent().requestSendAccessibilityEvent(bi0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        ai0 ai0Var = bi0Var.F;
                        if (ai0Var != null) {
                            ProfileActivity.d0(((org.telegram.ui.px0) ai0Var).f40646b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((l2.f) this.f32584b).O(i10, i11, bundle);
        }
    }

    public xh0(bi0 bi0Var) {
        this.f32584b = bi0Var;
    }
}
