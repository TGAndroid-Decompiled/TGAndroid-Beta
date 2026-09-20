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
public class jh0 extends AccessibilityNodeProvider {
    public final int f25367a = 1;
    public final Object f25368b;

    public jh0(n2.e eVar) {
        this.f25368b = eVar;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        kh0 kh0Var;
        switch (this.f25367a) {
            case 0:
                int[] iArr = {0, 0};
                nh0 nh0Var = (nh0) this.f25368b;
                ArrayList arrayList = nh0Var.f26640a;
                nh0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(nh0Var);
                    nh0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(nh0Var, ((kh0) arrayList.get(i11)).f25779a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((kh0) arrayList.get(i12)).f25779a == i10) {
                            kh0Var = (kh0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        kh0Var = null;
                    }
                }
                if (kh0Var != null) {
                    RectF rectF = kh0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(nh0Var, i10);
                        obtain2.setParent(nh0Var);
                        obtain2.setPackageName(nh0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(kh0Var.f25787l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.d t10 = ((n2.e) this.f25368b).t(i10);
                if (t10 == null) {
                    return null;
                }
                return t10.f42923a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.f25367a) {
            case 1:
                ((n2.e) this.f25368b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.f25367a) {
            case 1:
                s0.d u10 = ((n2.e) this.f25368b).u(i10);
                if (u10 == null) {
                    return null;
                }
                return u10.f42923a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        kh0 kh0Var;
        switch (this.f25367a) {
            case 0:
                nh0 nh0Var = (nh0) this.f25368b;
                ArrayList arrayList = nh0Var.f26640a;
                if (i10 == -1) {
                    return nh0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((kh0) arrayList.get(i12)).f25779a == i10) {
                            kh0Var = (kh0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        kh0Var = null;
                    }
                }
                if (kh0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) nh0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(nh0Var.getContext().getPackageName());
                            obtain.setSource(nh0Var, i10);
                            if (nh0Var.getParent() != null) {
                                nh0Var.getParent().requestSendAccessibilityEvent(nh0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        mh0 mh0Var = nh0Var.F;
                        if (mh0Var != null) {
                            ProfileActivity.Y(((org.telegram.ui.ky0) mh0Var).f35264b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((n2.e) this.f25368b).H(i10, i11, bundle);
        }
    }

    public jh0(nh0 nh0Var) {
        this.f25368b = nh0Var;
    }
}
