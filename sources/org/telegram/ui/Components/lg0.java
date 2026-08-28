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
public class lg0 extends AccessibilityNodeProvider {
    public final int f30449a = 1;
    public final Object f30450b;

    public lg0(n5.e0 e0Var) {
        this.f30450b = e0Var;
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i9) {
        mg0 mg0Var;
        switch (this.f30449a) {
            case 0:
                int[] iArr = {0, 0};
                pg0 pg0Var = (pg0) this.f30450b;
                ArrayList arrayList = pg0Var.f31648a;
                pg0Var.getLocationOnScreen(iArr);
                if (i9 == -1) {
                    AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(pg0Var);
                    pg0Var.onInitializeAccessibilityNodeInfo(obtain);
                    obtain.setEnabled(true);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        obtain.addChild(pg0Var, ((mg0) arrayList.get(i10)).f30814a);
                    }
                    return obtain;
                }
                int i11 = 0;
                while (true) {
                    if (i11 < arrayList.size()) {
                        if (((mg0) arrayList.get(i11)).f30814a == i9) {
                            mg0Var = (mg0) arrayList.get(i11);
                        } else {
                            i11++;
                        }
                    } else {
                        mg0Var = null;
                    }
                }
                if (mg0Var != null) {
                    RectF rectF = mg0Var.d;
                    if (!rectF.isEmpty()) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        obtain2.setSource(pg0Var, i9);
                        obtain2.setParent(pg0Var);
                        obtain2.setPackageName(pg0Var.getContext().getPackageName());
                        obtain2.addAction(16);
                        obtain2.addAction(64);
                        obtain2.setClickable(true);
                        obtain2.setFocusable(true);
                        obtain2.setEnabled(true);
                        obtain2.setVisibleToUser(true);
                        obtain2.setClassName(Button.class.getName());
                        obtain2.setText(mg0Var.f30823l.k());
                        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                        obtain2.setBoundsInParent(rect);
                        rect.offset(iArr[0], iArr[1]);
                        obtain2.setBoundsInScreen(rect);
                        return obtain2;
                    }
                }
                return null;
            default:
                s0.d P0 = ((n5.e0) this.f30450b).P0(i9);
                if (P0 == null) {
                    return null;
                }
                return P0.f47292a;
        }
    }

    @Override
    public List findAccessibilityNodeInfosByText(String str, int i9) {
        switch (this.f30449a) {
            case 1:
                ((n5.e0) this.f30450b).getClass();
                return null;
            default:
                return super.findAccessibilityNodeInfosByText(str, i9);
        }
    }

    @Override
    public AccessibilityNodeInfo findFocus(int i9) {
        switch (this.f30449a) {
            case 1:
                s0.d X0 = ((n5.e0) this.f30450b).X0(i9);
                if (X0 == null) {
                    return null;
                }
                return X0.f47292a;
            default:
                return super.findFocus(i9);
        }
    }

    @Override
    public final boolean performAction(int i9, int i10, Bundle bundle) {
        mg0 mg0Var;
        switch (this.f30449a) {
            case 0:
                pg0 pg0Var = (pg0) this.f30450b;
                ArrayList arrayList = pg0Var.f31648a;
                if (i9 == -1) {
                    return pg0Var.performAccessibilityAction(i10, bundle);
                }
                int i11 = 0;
                while (true) {
                    if (i11 < arrayList.size()) {
                        if (((mg0) arrayList.get(i11)).f30814a == i9) {
                            mg0Var = (mg0) arrayList.get(i11);
                        } else {
                            i11++;
                        }
                    } else {
                        mg0Var = null;
                    }
                }
                if (mg0Var != null) {
                    if (i10 == 64) {
                        if (((AccessibilityManager) pg0Var.getContext().getSystemService("accessibility")).isTouchExplorationEnabled()) {
                            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
                            obtain.setPackageName(pg0Var.getContext().getPackageName());
                            obtain.setSource(pg0Var, i9);
                            if (pg0Var.getParent() != null) {
                                pg0Var.getParent().requestSendAccessibilityEvent(pg0Var, obtain);
                            }
                        }
                    } else if (i10 == 16) {
                        og0 og0Var = pg0Var.B;
                        if (og0Var != null) {
                            ProfileActivity.X(((org.telegram.ui.fx0) og0Var).f38363b, i9, 0.0f, 0.0f);
                        }
                    }
                    return true;
                }
                return false;
            default:
                return ((n5.e0) this.f30450b).c1(i9, i10, bundle);
        }
    }

    public lg0(pg0 pg0Var) {
        this.f30450b = pg0Var;
    }
}
