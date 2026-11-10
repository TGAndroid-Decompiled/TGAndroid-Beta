package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
public final class b1 extends AnimatorListenerAdapter {
    public final int f27325a;
    public final g1 f27326b;

    public b1(g1 g1Var, int i7) {
        this.f27325a = i7;
        this.f27326b = g1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        float f10;
        switch (this.f27325a) {
            case 0:
                g1 g1Var = this.f27326b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = null;
                g1Var.f27490a = null;
                ViewGroup viewGroup = (ViewGroup) g1Var.getContentView();
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.f27294n = false;
                } else {
                    for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
                        if (viewGroup.getChildAt(i7) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                            actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup.getChildAt(i7);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.f27294n = false;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                }
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10);
                    if (!(childAt instanceof d1)) {
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
                g1 g1Var2 = this.f27326b;
                g1Var2.f27490a = null;
                g1Var2.d = false;
                g1Var2.setFocusable(false);
                try {
                    super/*android.widget.PopupWindow*/.dismiss();
                } catch (Exception unused) {
                }
                g1Var2.j();
                if (g1Var2.f27493e) {
                    g1Var2.f27497j.e();
                    return;
                }
                return;
        }
    }
}
