package org.telegram.ui.Components;

import android.content.Context;
import android.widget.PopupWindow;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class wr {
    public final org.telegram.ui.ActionBar.n1 f32322a;
    public boolean f32323b;

    public wr(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, z10 ? 1 : 0, context, f6Var);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new ur(this, 0));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new t(this, 27));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
        b(actionBarPopupWindow$ActionBarPopupWindowLayout);
        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f32322a = n1Var;
        n1Var.f21209b = false;
        n1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        n1Var.setOutsideTouchable(true);
        n1Var.setClippingEnabled(true);
        n1Var.setInputMethodMode(2);
        n1Var.setSoftInputMode(0);
        n1Var.getContentView().setFocusableInTouchMode(true);
        if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
            n1Var.setFocusable(true);
        }
        n1Var.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public final void onDismiss() {
                wr wrVar = wr.this;
                wrVar.c();
                wrVar.f32323b = false;
            }
        });
    }

    public final void a() {
        org.telegram.ui.ActionBar.n1 n1Var = this.f32322a;
        if (n1Var != null) {
            n1Var.dismiss();
        }
    }

    public abstract void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout);

    public abstract void c();
}
