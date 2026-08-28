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
import org.telegram.ui.kh1;
public abstract class c extends AccessibilityNodeProvider {
    public final e f33459a;
    public final AccessibilityManager d;
    public final Rect f33461c = new Rect();
    public int f33462e = -1;
    public final int f33460b = 2;

    public c(e eVar) {
        this.f33459a = eVar;
        this.d = (AccessibilityManager) f0.e.f(eVar.getContext(), AccessibilityManager.class);
    }

    public final void a(int i9) {
        View view;
        ViewParent parent;
        if (this.d.isTouchExplorationEnabled() && (parent = (view = this.f33459a).getParent()) != null) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
            obtain.setPackageName(view.getContext().getPackageName());
            obtain.setSource(view, i9);
            parent.requestSendAccessibilityEvent(view, obtain);
        }
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i9) {
        StaticLayout staticLayout;
        CharSequence text;
        e eVar = this.f33459a;
        if (i9 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(eVar);
            obtain.setPackageName(eVar.getContext().getPackageName());
            for (int i10 = 0; i10 < this.f33460b; i10++) {
                obtain.addChild(eVar, i10);
            }
            return obtain;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(eVar, i9);
        obtain2.setPackageName(eVar.getContext().getPackageName());
        int i11 = Build.VERSION.SDK_INT;
        obtain2.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        b bVar = (b) this;
        e eVar2 = bVar.f33441g;
        if (i9 == 0) {
            if (eVar2.N) {
                StaticLayout staticLayout2 = eVar2.h;
                if (staticLayout2 != null) {
                    text = staticLayout2.getText();
                }
                text = null;
            } else {
                StaticLayout staticLayout3 = eVar2.f33485e;
                if (staticLayout3 != null) {
                    text = staticLayout3.getText();
                }
                text = null;
            }
        } else {
            if (i9 == 1 && (staticLayout = eVar2.f33486f) != null) {
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
        Rect rect = this.f33461c;
        if (i9 == 0) {
            rect.set(eVar2.I);
        } else if (i9 == 1) {
            rect.set(eVar2.J);
        } else {
            rect.setEmpty();
        }
        int[] iArr = bVar.f33440f;
        eVar2.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
        obtain2.setBoundsInScreen(rect);
        return obtain2;
    }

    @Override
    public final boolean performAction(int i9, int i10, Bundle bundle) {
        if (i9 == -1) {
            return this.f33459a.performAccessibilityAction(i10, bundle);
        }
        if (i10 == 64) {
            a(i9);
            return false;
        } else if (i10 == 16) {
            d dVar = ((b) this).f33441g.M;
            if (dVar != null) {
                if (i9 == 0) {
                    ((kh1) dVar).a();
                    return true;
                } else if (i9 == 1) {
                    ((kh1) dVar).b();
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
