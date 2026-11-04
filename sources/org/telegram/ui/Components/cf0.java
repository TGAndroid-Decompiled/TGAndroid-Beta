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
public class cf0 extends AccessibilityNodeProvider {
    public final int f32698a = 0;
    public final Object f32699b;

    public cf0(nh nhVar) {
        this.f32699b = nhVar;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i3) {
        df0 df0Var;
        switch (this.f32698a) {
            case 0:
                int[] iArr = {0, 0};
                gf0 gf0Var = (gf0) this.f32699b;
                ArrayList arrayList = gf0Var.f34074a;
                gf0Var.getLocationOnScreen(iArr);
                if (i3 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(gf0Var);
                    gf0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        obtain.addChild(gf0Var, ((df0) arrayList.get(i10)).f33064a);
                    }
                    return obtain;
                }
                int i11 = 0;
                while (true) {
                    if (i11 < arrayList.size()) {
                        if (((df0) arrayList.get(i11)).f33064a == i3) {
                            df0Var = (df0) arrayList.get(i11);
                        } else {
                            i11++;
                        }
                    } else {
                        df0Var = null;
                    }
                }
                if (df0Var != null) {
                    RectF rectF = df0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(gf0Var, i3);
                        obtain2.setParent(gf0Var);
                        obtain2.setPackageName(gf0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(df0Var.f33073l.j());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.d y9 = ((nh) this.f32699b).y(i3);
                if (y9 == null) {
                    return null;
                }
                return y9.f54570a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i3) {
        switch (this.f32698a) {
            case 1:
                ((nh) this.f32699b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i3);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i3) {
        switch (this.f32698a) {
            case 1:
                s0.d A = ((nh) this.f32699b).A(i3);
                if (A == null) {
                    return null;
                }
                return A.f54570a;
            default:
                return super.findFocus(i3);
        }
    }

    @Override
    public final boolean performAction(int i3, int i10, Bundle bundle) {
        df0 df0Var;
        switch (this.f32698a) {
            case 0:
                gf0 gf0Var = (gf0) this.f32699b;
                ArrayList arrayList = gf0Var.f34074a;
                if (i3 == -1) {
                    return gf0Var.performAccessibilityAction(i10, bundle);
                }
                int i11 = 0;
                while (true) {
                    if (i11 < arrayList.size()) {
                        if (((df0) arrayList.get(i11)).f33064a == i3) {
                            df0Var = (df0) arrayList.get(i11);
                        } else {
                            i11++;
                        }
                    } else {
                        df0Var = null;
                    }
                }
                if (df0Var != null) {
                    if (i10 == 64) {
                        if (((AccessibilityManager) gf0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(gf0Var.getContext().getPackageName());
                            obtain.setSource(gf0Var, i3);
                            if (gf0Var.getParent() != null) {
                                gf0Var.getParent().requestSendAccessibilityEvent(gf0Var, obtain);
                            }
                        }
                    } else if (i10 == 16) {
                        ff0 ff0Var = gf0Var.f34086y;
                        if (ff0Var != null) {
                            ProfileActivity.m0(((org.telegram.ui.jt0) ff0Var).f46687b, i3, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((nh) this.f32699b).D(i3, i10, bundle);
        }
    }

    public cf0(gf0 gf0Var) {
        this.f32699b = gf0Var;
    }
}
