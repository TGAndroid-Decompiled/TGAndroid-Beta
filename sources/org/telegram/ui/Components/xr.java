package org.telegram.ui.Components;

import android.content.Context;
import android.widget.PopupWindow;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class xr {
    public final org.telegram.ui.ActionBar.p1 f33163a;
    public boolean f33164b;

    public xr(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, z4 ? 1 : 0, context, g6Var);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new vr(this, 0));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new t(this, 27));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
        b(actionBarPopupWindow$ActionBarPopupWindowLayout);
        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f33163a = p1Var;
        p1Var.f22218b = false;
        p1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        p1Var.setOutsideTouchable(true);
        p1Var.setClippingEnabled(true);
        p1Var.setInputMethodMode(2);
        p1Var.setSoftInputMode(0);
        p1Var.getContentView().setFocusableInTouchMode(true);
        if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
            p1Var.setFocusable(true);
        }
        p1Var.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public final void onDismiss() {
                xr xrVar = xr.this;
                xrVar.c();
                xrVar.f33164b = false;
            }
        });
    }

    public final void a() {
        org.telegram.ui.ActionBar.p1 p1Var = this.f33163a;
        if (p1Var != null) {
            p1Var.dismiss();
        }
    }

    public abstract void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout);

    public abstract void c();
}
