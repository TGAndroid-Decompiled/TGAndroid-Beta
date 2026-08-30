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
import org.telegram.ui.yh1;
public abstract class c extends AccessibilityNodeProvider {
    public final e f29577a;
    public final AccessibilityManager d;
    public final Rect f29579c = new Rect();
    public int e = -1;
    public final int f29578b = 2;

    public c(e eVar) {
        this.f29577a = eVar;
        this.d = (AccessibilityManager) f0.f.f(eVar.getContext(), AccessibilityManager.class);
    }

    public final void a(int i10) {
        View view;
        ViewParent parent;
        if (this.d.isTouchExplorationEnabled() && (parent = (view = this.f29577a).getParent()) != null) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(32768);
            obtain.setPackageName(view.getContext().getPackageName());
            obtain.setSource(view, i10);
            parent.requestSendAccessibilityEvent(view, obtain);
        }
    }

    @Override
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        StaticLayout staticLayout;
        CharSequence text;
        e eVar = this.f29577a;
        if (i10 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(eVar);
            obtain.setPackageName(eVar.getContext().getPackageName());
            for (int i11 = 0; i11 < this.f29578b; i11++) {
                obtain.addChild(eVar, i11);
            }
            return obtain;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(eVar, i10);
        obtain2.setPackageName(eVar.getContext().getPackageName());
        int i12 = Build.VERSION.SDK_INT;
        obtain2.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        b bVar = (b) this;
        e eVar2 = bVar.f29569g;
        if (i10 == 0) {
            if (eVar2.O) {
                StaticLayout staticLayout2 = eVar2.h;
                if (staticLayout2 != null) {
                    text = staticLayout2.getText();
                }
                text = null;
            } else {
                StaticLayout staticLayout3 = eVar2.e;
                if (staticLayout3 != null) {
                    text = staticLayout3.getText();
                }
                text = null;
            }
        } else {
            if (i10 == 1 && (staticLayout = eVar2.f29603f) != null) {
                text = staticLayout.getText();
            }
            text = null;
        }
        obtain2.setText(text);
        obtain2.setClassName(Button.class.getName());
        if (i12 >= 24) {
            obtain2.setImportantForAccessibility(true);
        }
        obtain2.setVisibleToUser(true);
        obtain2.setClickable(true);
        obtain2.setEnabled(true);
        obtain2.setParent(eVar);
        Rect rect = this.f29579c;
        if (i10 == 0) {
            rect.set(eVar2.J);
        } else if (i10 == 1) {
            rect.set(eVar2.K);
        } else {
            rect.setEmpty();
        }
        int[] iArr = bVar.f29568f;
        eVar2.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
        obtain2.setBoundsInScreen(rect);
        return obtain2;
    }

    @Override
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        if (i10 == -1) {
            return this.f29577a.performAccessibilityAction(i11, bundle);
        }
        if (i11 == 64) {
            a(i10);
            return false;
        } else if (i11 == 16) {
            d dVar = ((b) this).f29569g.N;
            if (dVar != null) {
                if (i10 == 0) {
                    ((yh1) dVar).a();
                    return true;
                } else if (i10 == 1) {
                    ((yh1) dVar).b();
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
