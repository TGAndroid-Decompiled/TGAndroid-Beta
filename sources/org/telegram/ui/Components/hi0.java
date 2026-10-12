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
public class hi0 extends AccessibilityNodeProvider {
    public final int f26784a = 1;
    public final Object f26785b;

    public hi0(l2.g gVar) {
        this.f26785b = gVar;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        ii0 ii0Var;
        switch (this.f26784a) {
            case 0:
                int[] iArr = {0, 0};
                li0 li0Var = (li0) this.f26785b;
                ArrayList arrayList = li0Var.f28191a;
                li0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(li0Var);
                    li0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(li0Var, ((ii0) arrayList.get(i11)).f27150a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((ii0) arrayList.get(i12)).f27150a == i10) {
                            ii0Var = (ii0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        ii0Var = null;
                    }
                }
                if (ii0Var != null) {
                    RectF rectF = ii0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(li0Var, i10);
                        obtain2.setParent(li0Var);
                        obtain2.setPackageName(li0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(ii0Var.f27159l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.d p02 = ((l2.g) this.f26785b).p0(i10);
                if (p02 == null) {
                    return null;
                }
                return p02.f47826a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.f26784a) {
            case 1:
                ((l2.g) this.f26785b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.f26784a) {
            case 1:
                s0.d q02 = ((l2.g) this.f26785b).q0(i10);
                if (q02 == null) {
                    return null;
                }
                return q02.f47826a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        ii0 ii0Var;
        switch (this.f26784a) {
            case 0:
                li0 li0Var = (li0) this.f26785b;
                ArrayList arrayList = li0Var.f28191a;
                if (i10 == -1) {
                    return li0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((ii0) arrayList.get(i12)).f27150a == i10) {
                            ii0Var = (ii0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        ii0Var = null;
                    }
                }
                if (ii0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) li0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(li0Var.getContext().getPackageName());
                            obtain.setSource(li0Var, i10);
                            if (li0Var.getParent() != null) {
                                li0Var.getParent().requestSendAccessibilityEvent(li0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        ki0 ki0Var = li0Var.F;
                        if (ki0Var != null) {
                            ProfileActivity.Y(((org.telegram.ui.ly0) ki0Var).f39871b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((l2.g) this.f26785b).A0(i10, i11, bundle);
        }
    }

    public hi0(li0 li0Var) {
        this.f26785b = li0Var;
    }
}
