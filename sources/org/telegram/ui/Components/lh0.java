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
public class lh0 extends AccessibilityNodeProvider {
    public final int f26082a = 1;
    public final Object f26083b;

    public lh0(n2.e eVar) {
        this.f26083b = eVar;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        mh0 mh0Var;
        switch (this.f26082a) {
            case 0:
                int[] iArr = {0, 0};
                ph0 ph0Var = (ph0) this.f26083b;
                ArrayList arrayList = ph0Var.f27379a;
                ph0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(ph0Var);
                    ph0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(ph0Var, ((mh0) arrayList.get(i11)).f26404a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((mh0) arrayList.get(i12)).f26404a == i10) {
                            mh0Var = (mh0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        mh0Var = null;
                    }
                }
                if (mh0Var != null) {
                    RectF rectF = mh0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(ph0Var, i10);
                        obtain2.setParent(ph0Var);
                        obtain2.setPackageName(ph0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(mh0Var.f26412l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.d u10 = ((n2.e) this.f26083b).u(i10);
                if (u10 == null) {
                    return null;
                }
                return u10.f42908a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.f26082a) {
            case 1:
                ((n2.e) this.f26083b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.f26082a) {
            case 1:
                s0.d v = ((n2.e) this.f26083b).v(i10);
                if (v == null) {
                    return null;
                }
                return v.f42908a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        mh0 mh0Var;
        switch (this.f26082a) {
            case 0:
                ph0 ph0Var = (ph0) this.f26083b;
                ArrayList arrayList = ph0Var.f27379a;
                if (i10 == -1) {
                    return ph0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((mh0) arrayList.get(i12)).f26404a == i10) {
                            mh0Var = (mh0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        mh0Var = null;
                    }
                }
                if (mh0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) ph0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(ph0Var.getContext().getPackageName());
                            obtain.setSource(ph0Var, i10);
                            if (ph0Var.getParent() != null) {
                                ph0Var.getParent().requestSendAccessibilityEvent(ph0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        oh0 oh0Var = ph0Var.F;
                        if (oh0Var != null) {
                            ProfileActivity.Y(((org.telegram.ui.by0) oh0Var).f32510b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((n2.e) this.f26083b).H(i10, i11, bundle);
        }
    }

    public lh0(ph0 ph0Var) {
        this.f26083b = ph0Var;
    }
}
