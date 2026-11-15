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
import org.telegram.ui.cc1;
public abstract class c extends AccessibilityNodeProvider {
    public final e f40528a;
    public final AccessibilityManager d;
    public final Rect f40530c = new Rect();
    public int f40531e = -1;
    public final int f40529b = 2;

    public c(e eVar) {
        this.f40528a = eVar;
        this.d = (AccessibilityManager) eVar.getContext().getSystemService(AccessibilityManager.class);
    }

    public final void a(int i7) {
        View view;
        ViewParent parent;
        if (this.d.isTouchExplorationEnabled() && (parent = (view = this.f40528a).getParent()) != null) {
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
        e eVar = this.f40528a;
        if (i7 == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(eVar);
            obtain.setPackageName(eVar.getContext().getPackageName());
            for (int i10 = 0; i10 < this.f40529b; i10++) {
                obtain.addChild(eVar, i10);
            }
            return obtain;
        }
        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain(eVar, i7);
        obtain2.setPackageName(eVar.getContext().getPackageName());
        int i11 = Build.VERSION.SDK_INT;
        obtain2.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        b bVar = (b) this;
        e eVar2 = bVar.f40501g;
        if (i7 == 0) {
            if (eVar2.S) {
                StaticLayout staticLayout2 = eVar2.h;
                if (staticLayout2 != null) {
                    text = staticLayout2.getText();
                }
                text = null;
            } else {
                StaticLayout staticLayout3 = eVar2.f40560e;
                if (staticLayout3 != null) {
                    text = staticLayout3.getText();
                }
                text = null;
            }
        } else {
            if (i7 == 1 && (staticLayout = eVar2.f40561f) != null) {
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
        Rect rect = this.f40530c;
        if (i7 == 0) {
            rect.set(eVar2.N);
        } else if (i7 == 1) {
            rect.set(eVar2.O);
        } else {
            rect.setEmpty();
        }
        int[] iArr = bVar.f40500f;
        eVar2.getLocationOnScreen(iArr);
        rect.offset(iArr[0], iArr[1]);
        obtain2.setBoundsInScreen(rect);
        return obtain2;
    }

    @Override
    public final boolean performAction(int i7, int i10, Bundle bundle) {
        if (i7 == -1) {
            return this.f40528a.performAccessibilityAction(i10, bundle);
        }
        if (i10 == 64) {
            a(i7);
            return false;
        } else if (i10 == 16) {
            d dVar = ((b) this).f40501g.R;
            if (dVar != null) {
                if (i7 == 0) {
                    ((cc1) dVar).a();
                    return true;
                } else if (i7 == 1) {
                    ((cc1) dVar).b();
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
