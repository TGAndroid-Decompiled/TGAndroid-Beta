package org.telegram.ui.Components;

import android.content.Context;
import android.widget.PopupWindow;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class as {
    public final org.telegram.ui.ActionBar.n1 f24654a;
    public boolean f24655b;

    public as(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, z10 ? 1 : 0, context, d6Var);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new yr(this, 0));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new s(this, 27));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
        b(actionBarPopupWindow$ActionBarPopupWindowLayout);
        org.telegram.ui.ActionBar.n1 n1Var = new org.telegram.ui.ActionBar.n1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f24654a = n1Var;
        n1Var.f21411b = false;
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
                as asVar = as.this;
                asVar.c();
                asVar.f24655b = false;
            }
        });
    }

    public final void a() {
        org.telegram.ui.ActionBar.n1 n1Var = this.f24654a;
        if (n1Var != null) {
            n1Var.d(true);
        }
    }

    public abstract void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout);

    public abstract void c();
}
