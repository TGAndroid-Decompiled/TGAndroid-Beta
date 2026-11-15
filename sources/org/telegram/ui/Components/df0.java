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
public class df0 extends AccessibilityNodeProvider {
    public final int f33928a = 1;
    public final Object f33929b;

    public df0(cf cfVar) {
        this.f33929b = cfVar;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
        ef0 ef0Var;
        switch (this.f33928a) {
            case 0:
                int[] iArr = {0, 0};
                hf0 hf0Var = (hf0) this.f33929b;
                ArrayList arrayList = hf0Var.f35225a;
                hf0Var.getLocationOnScreen(iArr);
                if (i7 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(hf0Var);
                    hf0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        obtain.addChild(hf0Var, ((ef0) arrayList.get(i10)).f34285a);
                    }
                    return obtain;
                }
                int i11 = 0;
                while (true) {
                    if (i11 < arrayList.size()) {
                        if (((ef0) arrayList.get(i11)).f34285a == i7) {
                            ef0Var = (ef0) arrayList.get(i11);
                        } else {
                            i11++;
                        }
                    } else {
                        ef0Var = null;
                    }
                }
                if (ef0Var != null) {
                    RectF rectF = ef0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(hf0Var, i7);
                        obtain2.setParent(hf0Var);
                        obtain2.setPackageName(hf0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(ef0Var.f34294l.j());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.c m10 = ((cf) this.f33929b).m(i7);
                if (m10 == null) {
                    return null;
                }
                return m10.f56166a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i7) {
        switch (this.f33928a) {
            case 1:
                ((cf) this.f33929b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i7);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i7) {
        switch (this.f33928a) {
            case 1:
                s0.c p10 = ((cf) this.f33929b).p(i7);
                if (p10 == null) {
                    return null;
                }
                return p10.f56166a;
            default:
                return super.findFocus(i7);
        }
    }

    @Override
    public final boolean performAction(int i7, int i10, Bundle bundle) {
        ef0 ef0Var;
        switch (this.f33928a) {
            case 0:
                hf0 hf0Var = (hf0) this.f33929b;
                ArrayList arrayList = hf0Var.f35225a;
                if (i7 == -1) {
                    return hf0Var.performAccessibilityAction(i10, bundle);
                }
                int i11 = 0;
                while (true) {
                    if (i11 < arrayList.size()) {
                        if (((ef0) arrayList.get(i11)).f34285a == i7) {
                            ef0Var = (ef0) arrayList.get(i11);
                        } else {
                            i11++;
                        }
                    } else {
                        ef0Var = null;
                    }
                }
                if (ef0Var != null) {
                    if (i10 == 64) {
                        if (((AccessibilityManager) hf0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(hf0Var.getContext().getPackageName());
                            obtain.setSource(hf0Var, i7);
                            if (hf0Var.getParent() != null) {
                                hf0Var.getParent().requestSendAccessibilityEvent(hf0Var, obtain);
                            }
                        }
                    } else if (i10 == 16) {
                        gf0 gf0Var = hf0Var.f35237y;
                        if (gf0Var != null) {
                            ProfileActivity.l0(((org.telegram.ui.qt0) gf0Var).f50791b, i7, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((cf) this.f33929b).r(i7, i10, bundle);
        }
    }

    public df0(hf0 hf0Var) {
        this.f33929b = hf0Var;
    }
}
