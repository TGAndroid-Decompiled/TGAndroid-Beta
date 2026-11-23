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
public class of0 extends AccessibilityNodeProvider {
    public final int f38147a = 1;
    public final Object f38148b;

    public of0(org.telegram.ui.ActionBar.i5 i5Var) {
        this.f38148b = i5Var;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
        pf0 pf0Var;
        switch (this.f38147a) {
            case 0:
                int[] iArr = {0, 0};
                sf0 sf0Var = (sf0) this.f38148b;
                ArrayList arrayList = sf0Var.f39591a;
                sf0Var.getLocationOnScreen(iArr);
                if (i7 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(sf0Var);
                    sf0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        obtain.addChild(sf0Var, ((pf0) arrayList.get(i10)).f38461a);
                    }
                    return obtain;
                }
                int i11 = 0;
                while (true) {
                    if (i11 < arrayList.size()) {
                        if (((pf0) arrayList.get(i11)).f38461a == i7) {
                            pf0Var = (pf0) arrayList.get(i11);
                        } else {
                            i11++;
                        }
                    } else {
                        pf0Var = null;
                    }
                }
                if (pf0Var != null) {
                    RectF rectF = pf0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(sf0Var, i7);
                        obtain2.setParent(sf0Var);
                        obtain2.setPackageName(sf0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(pf0Var.f38470l.j());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.c C = ((org.telegram.ui.ActionBar.i5) this.f38148b).C(i7);
                if (C == null) {
                    return null;
                }
                return C.f56863a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i7) {
        switch (this.f38147a) {
            case 1:
                ((org.telegram.ui.ActionBar.i5) this.f38148b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i7);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i7) {
        switch (this.f38147a) {
            case 1:
                s0.c L = ((org.telegram.ui.ActionBar.i5) this.f38148b).L(i7);
                if (L == null) {
                    return null;
                }
                return L.f56863a;
            default:
                return super.findFocus(i7);
        }
    }

    @Override
    public final boolean performAction(int i7, int i10, Bundle bundle) {
        pf0 pf0Var;
        switch (this.f38147a) {
            case 0:
                sf0 sf0Var = (sf0) this.f38148b;
                ArrayList arrayList = sf0Var.f39591a;
                if (i7 == -1) {
                    return sf0Var.performAccessibilityAction(i10, bundle);
                }
                int i11 = 0;
                while (true) {
                    if (i11 < arrayList.size()) {
                        if (((pf0) arrayList.get(i11)).f38461a == i7) {
                            pf0Var = (pf0) arrayList.get(i11);
                        } else {
                            i11++;
                        }
                    } else {
                        pf0Var = null;
                    }
                }
                if (pf0Var != null) {
                    if (i10 == 64) {
                        if (((AccessibilityManager) sf0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(sf0Var.getContext().getPackageName());
                            obtain.setSource(sf0Var, i7);
                            if (sf0Var.getParent() != null) {
                                sf0Var.getParent().requestSendAccessibilityEvent(sf0Var, obtain);
                            }
                        }
                    } else if (i10 == 16) {
                        rf0 rf0Var = sf0Var.f39603y;
                        if (rf0Var != null) {
                            ProfileActivity.l0(((org.telegram.ui.st0) rf0Var).f52152b, i7, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((org.telegram.ui.ActionBar.i5) this.f38148b).N(i7, i10, bundle);
        }
    }

    public of0(sf0 sf0Var) {
        this.f38148b = sf0Var;
    }
}
