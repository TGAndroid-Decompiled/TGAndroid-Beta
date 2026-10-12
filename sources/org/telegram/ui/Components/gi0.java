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
public class gi0 extends AccessibilityNodeProvider {
    public final int f26440a = 1;
    public final Object f26441b;

    public gi0(l2.g gVar) {
        this.f26441b = gVar;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        hi0 hi0Var;
        switch (this.f26440a) {
            case 0:
                int[] iArr = {0, 0};
                ki0 ki0Var = (ki0) this.f26441b;
                ArrayList arrayList = ki0Var.f27867a;
                ki0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(ki0Var);
                    ki0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(ki0Var, ((hi0) arrayList.get(i11)).f26780a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((hi0) arrayList.get(i12)).f26780a == i10) {
                            hi0Var = (hi0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        hi0Var = null;
                    }
                }
                if (hi0Var != null) {
                    RectF rectF = hi0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(ki0Var, i10);
                        obtain2.setParent(ki0Var);
                        obtain2.setPackageName(ki0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(hi0Var.f26789l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.d p02 = ((l2.g) this.f26441b).p0(i10);
                if (p02 == null) {
                    return null;
                }
                return p02.f47818a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.f26440a) {
            case 1:
                ((l2.g) this.f26441b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.f26440a) {
            case 1:
                s0.d q02 = ((l2.g) this.f26441b).q0(i10);
                if (q02 == null) {
                    return null;
                }
                return q02.f47818a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        hi0 hi0Var;
        switch (this.f26440a) {
            case 0:
                ki0 ki0Var = (ki0) this.f26441b;
                ArrayList arrayList = ki0Var.f27867a;
                if (i10 == -1) {
                    return ki0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((hi0) arrayList.get(i12)).f26780a == i10) {
                            hi0Var = (hi0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        hi0Var = null;
                    }
                }
                if (hi0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) ki0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(ki0Var.getContext().getPackageName());
                            obtain.setSource(ki0Var, i10);
                            if (ki0Var.getParent() != null) {
                                ki0Var.getParent().requestSendAccessibilityEvent(ki0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        ji0 ji0Var = ki0Var.F;
                        if (ji0Var != null) {
                            ProfileActivity.Y(((org.telegram.ui.ly0) ji0Var).f39868b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((l2.g) this.f26441b).A0(i10, i11, bundle);
        }
    }

    public gi0(ki0 ki0Var) {
        this.f26441b = ki0Var;
    }
}
