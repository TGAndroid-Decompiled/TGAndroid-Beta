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
public class fi0 extends AccessibilityNodeProvider {
    public final int f26473a = 1;
    public final Object f26474b;

    public fi0(l2.f fVar) {
        this.f26474b = fVar;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        gi0 gi0Var;
        switch (this.f26473a) {
            case 0:
                int[] iArr = {0, 0};
                ji0 ji0Var = (ji0) this.f26474b;
                ArrayList arrayList = ji0Var.f27749a;
                ji0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(ji0Var);
                    ji0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(ji0Var, ((gi0) arrayList.get(i11)).f26750a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((gi0) arrayList.get(i12)).f26750a == i10) {
                            gi0Var = (gi0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        gi0Var = null;
                    }
                }
                if (gi0Var != null) {
                    RectF rectF = gi0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(ji0Var, i10);
                        obtain2.setParent(ji0Var);
                        obtain2.setPackageName(ji0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(gi0Var.f26759l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.d o9 = ((l2.f) this.f26474b).o(i10);
                if (o9 == null) {
                    return null;
                }
                return o9.f47711a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.f26473a) {
            case 1:
                ((l2.f) this.f26474b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.f26473a) {
            case 1:
                s0.d p5 = ((l2.f) this.f26474b).p(i10);
                if (p5 == null) {
                    return null;
                }
                return p5.f47711a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        gi0 gi0Var;
        switch (this.f26473a) {
            case 0:
                ji0 ji0Var = (ji0) this.f26474b;
                ArrayList arrayList = ji0Var.f27749a;
                if (i10 == -1) {
                    return ji0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((gi0) arrayList.get(i12)).f26750a == i10) {
                            gi0Var = (gi0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        gi0Var = null;
                    }
                }
                if (gi0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) ji0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(ji0Var.getContext().getPackageName());
                            obtain.setSource(ji0Var, i10);
                            if (ji0Var.getParent() != null) {
                                ji0Var.getParent().requestSendAccessibilityEvent(ji0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        ii0 ii0Var = ji0Var.F;
                        if (ii0Var != null) {
                            ProfileActivity.Y(((org.telegram.ui.iy0) ii0Var).f38835b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((l2.f) this.f26474b).u(i10, i11, bundle);
        }
    }

    public fi0(ji0 ji0Var) {
        this.f26474b = ji0Var;
    }
}
