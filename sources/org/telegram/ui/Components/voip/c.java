package org.telegram.ui.Components.voip;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.Button;
import org.telegram.ui.jh1;

public abstract class c extends AccessibilityNodeProvider {

    public final e f33509a;
    public final AccessibilityManager d;

    public final Rect f33511c = new Rect();

    public int f33512e = -1;

    public final int f33510b = 2;

    public c(e eVar) {
        this.f33509a = eVar;
        this.d = (AccessibilityManager) f0.e.f(eVar.getContext(), AccessibilityManager.class);
    }

    public final void a(int i10) {
        View view;
        ViewParent parent;
        if (!this.d.isTouchExplorationEnabled() || (parent = (view = this.f33509a).getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(32768);
        accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        accessibilityEventObtain.setSource(view, i10);
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        StaticLayout staticLayout;
        CharSequence text;
        e eVar = this.f33509a;
        if (i10 == -1) {
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(eVar);
            accessibilityNodeInfoObtain.setPackageName(eVar.getContext().getPackageName());
            for (int i11 = 0; i11 < this.f33510b; i11++) {
                accessibilityNodeInfoObtain.addChild(eVar, i11);
            }
            return accessibilityNodeInfoObtain;
        }
        AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain(eVar, i10);
        accessibilityNodeInfoObtain2.setPackageName(eVar.getContext().getPackageName());
        int i12 = Build.VERSION.SDK_INT;
        accessibilityNodeInfoObtain2.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        b bVar = (b) this;
        e eVar2 = bVar.f33491g;
        if (i10 == 0) {
            if (eVar2.N) {
                StaticLayout staticLayout2 = eVar2.h;
                if (staticLayout2 != null) {
                    text = staticLayout2.getText();
                } else {
                    text = null;
                }
            } else {
                StaticLayout staticLayout3 = eVar2.f33535e;
                if (staticLayout3 != null) {
                    text = staticLayout3.getText();
                } else {
                    text = null;
                }
            }
        } else if (i10 != 1 || (staticLayout = eVar2.f33536f) == null) {
            text = null;
        } else {
            text = staticLayout.getText();
        }
        accessibilityNodeInfoObtain2.setText(text);
        accessibilityNodeInfoObtain2.setClassName(Button.class.getName());
        if (i12 >= 24) {
            accessibilityNodeInfoObtain2.setImportantForAccessibility(true);
        }
        accessibilityNodeInfoObtain2.setVisibleToUser(true);
        accessibilityNodeInfoObtain2.setClickable(true);
        accessibilityNodeInfoObtain2.setEnabled(true);
        accessibilityNodeInfoObtain2.setParent(eVar);
        Rect rect = this.f33511c;
        if (i10 == 0) {
            rect.set(eVar2.I);
        } else if (i10 == 1) {
            rect.set(eVar2.J);
        } else {
            rect.setEmpty();
        }
        int[] iArr = bVar.f33490f;
        eVar2.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
        accessibilityNodeInfoObtain2.setBoundsInScreen(rect);
        return accessibilityNodeInfoObtain2;
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        if (i10 == -1) {
            return this.f33509a.performAccessibilityAction(i11, bundle);
        }
        if (i11 == 64) {
            a(i10);
            return false;
        }
        if (i11 != 16) {
            return false;
        }
        d dVar = ((b) this).f33491g.M;
        if (dVar != null) {
            if (i10 == 0) {
                ((jh1) dVar).a();
                return true;
            }
            if (i10 == 1) {
                ((jh1) dVar).b();
            }
        }
        return true;
    }
}
