package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
public final class c1 extends AnimatorListenerAdapter {
    public final int f28817a;
    public final h1 f28818b;

    public c1(h1 h1Var, int i7) {
        this.f28817a = i7;
        this.f28818b = h1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        float f10;
        switch (this.f28817a) {
            case 0:
                h1 h1Var = this.f28818b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = null;
                h1Var.f28988a = null;
                ViewGroup viewGroup = (ViewGroup) h1Var.getContentView();
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.f28738n = false;
                } else {
                    for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                        if (viewGroup.getChildAt(i7) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                            actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup.getChildAt(i7);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.f28738n = false;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                }
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10);
                    if (!(childAt instanceof e1)) {
                        if (childAt.isEnabled()) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.5f;
                        }
                        childAt.setAlpha(f10);
                    }
                }
                return;
            default:
                h1 h1Var2 = this.f28818b;
                h1Var2.f28988a = null;
                h1Var2.d = false;
                h1Var2.setFocusable(false);
                try {
                    super/*android.widget.PopupWindow*/.dismiss();
                } catch (Exception unused) {
                }
                h1Var2.j();
                if (h1Var2.f28991e) {
                    h1Var2.f28995j.e();
                    return;
                }
                return;
        }
    }
}
