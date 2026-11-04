package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
public final class a1 extends AnimatorListenerAdapter {
    public final int f27349a;
    public final f1 f27350b;

    public a1(f1 f1Var, int i3) {
        this.f27349a = i3;
        this.f27350b = f1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        float f10;
        switch (this.f27349a) {
            case 0:
                f1 f1Var = this.f27350b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = null;
                f1Var.f27492a = null;
                ViewGroup viewGroup = (ViewGroup) f1Var.getContentView();
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.f27337n = false;
                } else {
                    for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                        if (viewGroup.getChildAt(i3) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                            actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup.getChildAt(i3);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.f27337n = false;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                }
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i10);
                    if (!(childAt instanceof c1)) {
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
                f1 f1Var2 = this.f27350b;
                f1Var2.f27492a = null;
                f1Var2.d = false;
                f1Var2.setFocusable(false);
                try {
                    super/*android.widget.PopupWindow*/.dismiss();
                } catch (Exception unused) {
                }
                f1Var2.j();
                if (f1Var2.f27495e) {
                    f1Var2.f27499j.e();
                    return;
                }
                return;
        }
    }
}
