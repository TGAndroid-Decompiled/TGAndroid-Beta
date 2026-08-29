package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
public final class i1 extends AnimatorListenerAdapter {
    public final int f23519a;
    public final o1 f23520b;

    public i1(o1 o1Var, int i10) {
        this.f23519a = i10;
        this.f23520b = o1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        float f9;
        switch (this.f23519a) {
            case 0:
                o1 o1Var = this.f23520b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = null;
                o1Var.f23709a = null;
                ViewGroup viewGroup = (ViewGroup) o1Var.getContentView();
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.f22708n = false;
                } else {
                    for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                        if (viewGroup.getChildAt(i10) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                            actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup.getChildAt(i10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.f22708n = false;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                }
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i11 = 0; i11 < itemsCount; i11++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.H.getChildAt(i11);
                    if (!(childAt instanceof l1)) {
                        if (childAt.isEnabled()) {
                            f9 = 1.0f;
                        } else {
                            f9 = 0.5f;
                        }
                        childAt.setAlpha(f9);
                    }
                }
                return;
            default:
                o1 o1Var2 = this.f23520b;
                o1Var2.f23709a = null;
                o1Var2.d = false;
                o1Var2.setFocusable(false);
                try {
                    super/*android.widget.PopupWindow*/.dismiss();
                } catch (Exception unused) {
                }
                o1Var2.j();
                if (o1Var2.f23712e) {
                    o1Var2.f23716j.unlock();
                    return;
                }
                return;
        }
    }
}
