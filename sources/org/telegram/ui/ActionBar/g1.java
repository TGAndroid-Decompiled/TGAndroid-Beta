package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
public final class g1 extends AnimatorListenerAdapter {
    public final int f19816a;
    public final m1 f19817b;

    public g1(m1 m1Var, int i10) {
        this.f19816a = i10;
        this.f19817b = m1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout;
        float f7;
        switch (this.f19816a) {
            case 0:
                m1 m1Var = this.f19817b;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = null;
                m1Var.f20519a = null;
                ViewGroup viewGroup = (ViewGroup) m1Var.getContentView();
                if (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup;
                    actionBarPopupWindow$ActionBarPopupWindowLayout.f19542n = false;
                } else {
                    for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                        if (viewGroup.getChildAt(i10) instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout) {
                            actionBarPopupWindow$ActionBarPopupWindowLayout2 = (ActionBarPopupWindow$ActionBarPopupWindowLayout) viewGroup.getChildAt(i10);
                            actionBarPopupWindow$ActionBarPopupWindowLayout2.f19542n = false;
                        }
                    }
                    actionBarPopupWindow$ActionBarPopupWindowLayout = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                }
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i11 = 0; i11 < itemsCount; i11++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i11);
                    if (!(childAt instanceof j1)) {
                        if (childAt.isEnabled()) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.5f;
                        }
                        childAt.setAlpha(f7);
                    }
                }
                return;
            default:
                m1 m1Var2 = this.f19817b;
                m1Var2.f20519a = null;
                m1Var2.d = false;
                m1Var2.setFocusable(false);
                try {
                    super/*android.widget.PopupWindow*/.dismiss();
                } catch (Exception unused) {
                }
                m1Var2.j();
                if (m1Var2.e) {
                    m1Var2.f20525j.unlock();
                    return;
                }
                return;
        }
    }
}
