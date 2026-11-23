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
public class pf0 extends AccessibilityNodeProvider {
    public final int f38545a = 1;
    public final Object f38546b;

    public pf0(org.telegram.ui.Cells.c5 c5Var) {
        this.f38546b = c5Var;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
        qf0 qf0Var;
        switch (this.f38545a) {
            case 0:
                int[] iArr = {0, 0};
                tf0 tf0Var = (tf0) this.f38546b;
                ArrayList arrayList = tf0Var.f39837a;
                tf0Var.getLocationOnScreen(iArr);
                if (i7 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(tf0Var);
                    tf0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        obtain.addChild(tf0Var, ((qf0) arrayList.get(i10)).f38849a);
                    }
                    return obtain;
                }
                int i11 = 0;
                while (true) {
                    if (i11 < arrayList.size()) {
                        if (((qf0) arrayList.get(i11)).f38849a == i7) {
                            qf0Var = (qf0) arrayList.get(i11);
                        } else {
                            i11++;
                        }
                    } else {
                        qf0Var = null;
                    }
                }
                if (qf0Var != null) {
                    RectF rectF = qf0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(tf0Var, i7);
                        obtain2.setParent(tf0Var);
                        obtain2.setPackageName(tf0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(qf0Var.f38858l.j());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.c t6 = ((org.telegram.ui.Cells.c5) this.f38546b).t(i7);
                if (t6 == null) {
                    return null;
                }
                return t6.f56750a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i7) {
        switch (this.f38545a) {
            case 1:
                ((org.telegram.ui.Cells.c5) this.f38546b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i7);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i7) {
        switch (this.f38545a) {
            case 1:
                s0.c w10 = ((org.telegram.ui.Cells.c5) this.f38546b).w(i7);
                if (w10 == null) {
                    return null;
                }
                return w10.f56750a;
            default:
                return super.findFocus(i7);
        }
    }

    @Override
    public final boolean performAction(int i7, int i10, Bundle bundle) {
        qf0 qf0Var;
        switch (this.f38545a) {
            case 0:
                tf0 tf0Var = (tf0) this.f38546b;
                ArrayList arrayList = tf0Var.f39837a;
                if (i7 == -1) {
                    return tf0Var.performAccessibilityAction(i10, bundle);
                }
                int i11 = 0;
                while (true) {
                    if (i11 < arrayList.size()) {
                        if (((qf0) arrayList.get(i11)).f38849a == i7) {
                            qf0Var = (qf0) arrayList.get(i11);
                        } else {
                            i11++;
                        }
                    } else {
                        qf0Var = null;
                    }
                }
                if (qf0Var != null) {
                    if (i10 == 64) {
                        if (((AccessibilityManager) tf0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(tf0Var.getContext().getPackageName());
                            obtain.setSource(tf0Var, i7);
                            if (tf0Var.getParent() != null) {
                                tf0Var.getParent().requestSendAccessibilityEvent(tf0Var, obtain);
                            }
                        }
                    } else if (i10 == 16) {
                        sf0 sf0Var = tf0Var.f39849y;
                        if (sf0Var != null) {
                            ProfileActivity.l0(((org.telegram.ui.ut0) sf0Var).f52631b, i7, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((org.telegram.ui.Cells.c5) this.f38546b).z(i7, i10, bundle);
        }
    }

    public pf0(tf0 tf0Var) {
        this.f38546b = tf0Var;
    }
}
