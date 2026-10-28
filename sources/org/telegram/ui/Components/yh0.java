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
public class yh0 extends AccessibilityNodeProvider {
    public final int f35053a = 1;
    public final Object f35054b;

    public yh0(jg.i iVar) {
        this.f35054b = iVar;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        zh0 zh0Var;
        switch (this.f35053a) {
            case 0:
                int[] iArr = {0, 0};
                ci0 ci0Var = (ci0) this.f35054b;
                ArrayList arrayList = ci0Var.f27165a;
                ci0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(ci0Var);
                    ci0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(ci0Var, ((zh0) arrayList.get(i11)).f35342a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((zh0) arrayList.get(i12)).f35342a == i10) {
                            zh0Var = (zh0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        zh0Var = null;
                    }
                }
                if (zh0Var != null) {
                    RectF rectF = zh0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(ci0Var, i10);
                        obtain2.setParent(ci0Var);
                        obtain2.setPackageName(ci0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(zh0Var.f35350l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.d c02 = ((jg.i) this.f35054b).c0(i10);
                if (c02 == null) {
                    return null;
                }
                return c02.f47688a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.f35053a) {
            case 1:
                ((jg.i) this.f35054b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.f35053a) {
            case 1:
                s0.d d02 = ((jg.i) this.f35054b).d0(i10);
                if (d02 == null) {
                    return null;
                }
                return d02.f47688a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        zh0 zh0Var;
        switch (this.f35053a) {
            case 0:
                ci0 ci0Var = (ci0) this.f35054b;
                ArrayList arrayList = ci0Var.f27165a;
                if (i10 == -1) {
                    return ci0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((zh0) arrayList.get(i12)).f35342a == i10) {
                            zh0Var = (zh0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        zh0Var = null;
                    }
                }
                if (zh0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) ci0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(ci0Var.getContext().getPackageName());
                            obtain.setSource(ci0Var, i10);
                            if (ci0Var.getParent() != null) {
                                ci0Var.getParent().requestSendAccessibilityEvent(ci0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        bi0 bi0Var = ci0Var.F;
                        if (bi0Var != null) {
                            ProfileActivity.e0(((org.telegram.ui.yx0) bi0Var).f46099b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((jg.i) this.f35054b).h0(i10, i11, bundle);
        }
    }

    public yh0(ci0 ci0Var) {
        this.f35054b = ci0Var;
    }
}
