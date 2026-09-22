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
public class mh0 extends AccessibilityNodeProvider {
    public final int f26450a = 1;
    public final Object f26451b;

    public mh0(l.d dVar) {
        this.f26451b = dVar;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        nh0 nh0Var;
        switch (this.f26450a) {
            case 0:
                int[] iArr = {0, 0};
                qh0 qh0Var = (qh0) this.f26451b;
                ArrayList arrayList = qh0Var.f27563a;
                qh0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(qh0Var);
                    qh0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(qh0Var, ((nh0) arrayList.get(i11)).f26764a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((nh0) arrayList.get(i12)).f26764a == i10) {
                            nh0Var = (nh0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        nh0Var = null;
                    }
                }
                if (nh0Var != null) {
                    RectF rectF = nh0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(qh0Var, i10);
                        obtain2.setParent(qh0Var);
                        obtain2.setPackageName(qh0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(nh0Var.f26772l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.d W = ((l.d) this.f26451b).W(i10);
                if (W == null) {
                    return null;
                }
                return W.f42944a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.f26450a) {
            case 1:
                ((l.d) this.f26451b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.f26450a) {
            case 1:
                s0.d Y = ((l.d) this.f26451b).Y(i10);
                if (Y == null) {
                    return null;
                }
                return Y.f42944a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        nh0 nh0Var;
        switch (this.f26450a) {
            case 0:
                qh0 qh0Var = (qh0) this.f26451b;
                ArrayList arrayList = qh0Var.f27563a;
                if (i10 == -1) {
                    return qh0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((nh0) arrayList.get(i12)).f26764a == i10) {
                            nh0Var = (nh0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        nh0Var = null;
                    }
                }
                if (nh0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) qh0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(qh0Var.getContext().getPackageName());
                            obtain.setSource(qh0Var, i10);
                            if (qh0Var.getParent() != null) {
                                qh0Var.getParent().requestSendAccessibilityEvent(qh0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        ph0 ph0Var = qh0Var.F;
                        if (ph0Var != null) {
                            ProfileActivity.Y(((org.telegram.ui.ky0) ph0Var).f35282b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((l.d) this.f26451b).c0(i10, i11, bundle);
        }
    }

    public mh0(qh0 qh0Var) {
        this.f26451b = qh0Var;
    }
}
