package org.telegram.ui.Components;

import android.content.Context;
import android.widget.PopupWindow;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class ds {
    public final org.telegram.ui.ActionBar.p1 f22472a;
    public boolean f22473b;

    public ds(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, z10 ? 1 : 0, context, f6Var);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new bs(this, 0));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new t(this, 27));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
        b(actionBarPopupWindow$ActionBarPopupWindowLayout);
        org.telegram.ui.ActionBar.p1 p1Var = new org.telegram.ui.ActionBar.p1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f22472a = p1Var;
        p1Var.f18534b = false;
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
                ds dsVar = ds.this;
                dsVar.c();
                dsVar.f22473b = false;
            }
        });
    }

    public final void a() {
        org.telegram.ui.ActionBar.p1 p1Var = this.f22472a;
        if (p1Var != null) {
            p1Var.dismiss();
        }
    }

    public abstract void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout);

    public abstract void c();
}
