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
public class ei0 extends AccessibilityNodeProvider {
    public final int f26094a = 1;
    public final Object f26095b;

    public ei0(l2.f fVar) {
        this.f26095b = fVar;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        fi0 fi0Var;
        switch (this.f26094a) {
            case 0:
                int[] iArr = {0, 0};
                ii0 ii0Var = (ii0) this.f26095b;
                ArrayList arrayList = ii0Var.f27394a;
                ii0Var.getLocationOnScreen(iArr);
                if (i10 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(ii0Var);
                    ii0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        obtain.addChild(ii0Var, ((fi0) arrayList.get(i11)).f26373a);
                    }
                    return obtain;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((fi0) arrayList.get(i12)).f26373a == i10) {
                            fi0Var = (fi0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        fi0Var = null;
                    }
                }
                if (fi0Var != null) {
                    RectF rectF = fi0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(ii0Var, i10);
                        obtain2.setParent(ii0Var);
                        obtain2.setPackageName(ii0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(fi0Var.f26382l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.d o9 = ((l2.f) this.f26095b).o(i10);
                if (o9 == null) {
                    return null;
                }
                return o9.f47585a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i10) {
        switch (this.f26094a) {
            case 1:
                ((l2.f) this.f26095b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i10);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i10) {
        switch (this.f26094a) {
            case 1:
                s0.d p5 = ((l2.f) this.f26095b).p(i10);
                if (p5 == null) {
                    return null;
                }
                return p5.f47585a;
            default:
                return super.findFocus(i10);
        }
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        fi0 fi0Var;
        switch (this.f26094a) {
            case 0:
                ii0 ii0Var = (ii0) this.f26095b;
                ArrayList arrayList = ii0Var.f27394a;
                if (i10 == -1) {
                    return ii0Var.performAccessibilityAction(i11, bundle);
                }
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList.size()) {
                        if (((fi0) arrayList.get(i12)).f26373a == i10) {
                            fi0Var = (fi0) arrayList.get(i12);
                        } else {
                            i12++;
                        }
                    } else {
                        fi0Var = null;
                    }
                }
                if (fi0Var != null) {
                    if (i11 == 64) {
                        if (((AccessibilityManager) ii0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(ii0Var.getContext().getPackageName());
                            obtain.setSource(ii0Var, i10);
                            if (ii0Var.getParent() != null) {
                                ii0Var.getParent().requestSendAccessibilityEvent(ii0Var, obtain);
                            }
                        }
                    } else if (i11 == 16) {
                        hi0 hi0Var = ii0Var.F;
                        if (hi0Var != null) {
                            ProfileActivity.Y(((org.telegram.ui.jy0) hi0Var).f39042b, i10, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((l2.f) this.f26095b).t(i10, i11, bundle);
        }
    }

    public ei0(ii0 ii0Var) {
        this.f26095b = ii0Var;
    }
}
