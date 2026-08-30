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
public class fh0 extends AccessibilityNodeProvider {
    public final int f24879a = 1;
    public final Object f24880b;

    public fh0(org.telegram.ui.Cells.f1 f1Var) {
        this.f24880b = f1Var;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        gh0 gh0Var;
        switch (this.f24879a) {
            case 0:
                int[] iArr = {0, 0};
                jh0 jh0Var = (jh0) this.f24880b;
                ArrayList arrayList = jh0Var.f25981a;
                jh0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(jh0Var);
                    jh0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(jh0Var, ((gh0) arrayList.get(i11)).f25122a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((gh0) arrayList.get(i12)).f25122a == i10) {
                            gh0Var = (gh0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        gh0Var = null;
                    }
                }
                if (gh0Var != null) {
                    RectF rectF = gh0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(jh0Var, i10);
                        obtain2.setParent(jh0Var);
                        obtain2.setPackageName(jh0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(gh0Var.f25130l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.e D = ((org.telegram.ui.Cells.f1) this.f24880b).D(i10);
                if (D == null) {
                    return null;
                }
                return D.f43904a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.f24879a) {
            case 1:
                ((org.telegram.ui.Cells.f1) this.f24880b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.f24879a) {
            case 1:
                s0.e F = ((org.telegram.ui.Cells.f1) this.f24880b).F(i10);
                if (F == null) {
                    return null;
                }
                return F.f43904a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        gh0 gh0Var;
        switch (this.f24879a) {
            case 0:
                jh0 jh0Var = (jh0) this.f24880b;
                ArrayList arrayList = jh0Var.f25981a;
                if (i10 == -1) {
                    return jh0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((gh0) arrayList.get(i12)).f25122a == i10) {
                            gh0Var = (gh0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        gh0Var = null;
                    }
                }
                if (gh0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) jh0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(jh0Var.getContext().getPackageName());
                            obtain.setSource(jh0Var, i10);
                            if (jh0Var.getParent() != null) {
                                jh0Var.getParent().requestSendAccessibilityEvent(jh0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        ih0 ih0Var = jh0Var.C;
                        if (ih0Var != null) {
                            ProfileActivity.Y(((org.telegram.ui.px0) ih0Var).f37552b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((org.telegram.ui.Cells.f1) this.f24880b).S(i10, i11, bundle);
        }
    }

    public fh0(jh0 jh0Var) {
        this.f24880b = jh0Var;
    }
}
