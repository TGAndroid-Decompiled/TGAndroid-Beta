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
import org.telegram.ui.hc1;
public abstract class c extends AccessibilityNodeProvider {
    public final e f39128a;
    public final AccessibilityManager d;
    public final Rect f39130c = new Rect();
    public int f39131e = -1;
    public final int f39129b = 2;

    public c(e eVar) {
        this.f39128a = eVar;
        this.d = (AccessibilityManager) eVar.getContext().getSystemService(AccessibilityManager.class);
    }

    public final void a(int i7) {
        View view;
        ViewParent parent;
        if (this.d.isTouchExplorationEnabled() && (parent = (view = this.f39128a).getParent()) != null) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
            obtain.setPackageName(view.getContext().getPackageName());
            obtain.setSource(view, i7);
            parent.requestSendAccessibilityEvent(view, obtain);
        }
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i7) {
        StaticLayout staticLayout;
        CharSequence text;
        e eVar = this.f39128a;
        if (i7 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(eVar);
            obtain.setPackageName(eVar.getContext().getPackageName());
            for (int i10 = 0; i10 < this.f39129b; i10++) {
                obtain.addChild(eVar, i10);
            }
            return obtain;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(eVar, i7);
        obtain2.setPackageName(eVar.getContext().getPackageName());
        int i11 = Build.VERSION.SDK_INT;
        obtain2.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        b bVar = (b) this;
        e eVar2 = bVar.f39118g;
        if (i7 == 0) {
            if (eVar2.R) {
                StaticLayout staticLayout2 = eVar2.h;
                if (staticLayout2 != null) {
                    text = staticLayout2.getText();
                }
                text = null;
            } else {
                StaticLayout staticLayout3 = eVar2.f39166e;
                if (staticLayout3 != null) {
                    text = staticLayout3.getText();
                }
                text = null;
            }
        } else {
            if (i7 == 1 && (staticLayout = eVar2.f39167f) != null) {
                text = staticLayout.getText();
            }
            text = null;
        }
        obtain2.setText(text);
        obtain2.setClassName(Button.class.getName());
        if (i11 >= 24) {
            obtain2.setImportantForAccessibility(true);
        }
        obtain2.setVisibleToUser(true);
        obtain2.setClickable(true);
        obtain2.setEnabled(true);
        obtain2.setParent(eVar);
        Rect rect = this.f39130c;
        if (i7 == 0) {
            rect.set(eVar2.M);
        } else if (i7 == 1) {
            rect.set(eVar2.N);
        } else {
            rect.setEmpty();
        }
        int[] iArr = bVar.f39117f;
        eVar2.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
        obtain2.setBoundsInScreen(rect);
        return obtain2;
    }

    @Override
    public final boolean performAction(int i7, int i10, Bundle bundle) {
        if (i7 == -1) {
            return this.f39128a.performAccessibilityAction(i10, bundle);
        }
        if (i10 == 64) {
            a(i7);
            return false;
        } else if (i10 == 16) {
            d dVar = ((b) this).f39118g.Q;
            if (dVar != null) {
                if (i7 == 0) {
                    ((hc1) dVar).a();
                    return true;
                } else if (i7 == 1) {
                    ((hc1) dVar).b();
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
