package org.telegram.ui.Components;

import android.content.Context;
import android.widget.PopupWindow;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class zr {
    public final org.telegram.ui.ActionBar.o1 f30967a;
    public boolean f30968b;

    public zr(Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, z10 ? 1 : 0, context, e6Var);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new xr(this, 0));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new s(this, 27));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
        b(actionBarPopupWindow$ActionBarPopupWindowLayout);
        org.telegram.ui.ActionBar.o1 o1Var = new org.telegram.ui.ActionBar.o1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f30967a = o1Var;
        o1Var.f19684b = false;
        o1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        o1Var.setOutsideTouchable(true);
        o1Var.setClippingEnabled(true);
        o1Var.setInputMethodMode(2);
        o1Var.setSoftInputMode(0);
        o1Var.getContentView().setFocusableInTouchMode(true);
        if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
            o1Var.setFocusable(true);
        }
        o1Var.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public final void onDismiss() {
                zr zrVar = zr.this;
                zrVar.c();
                zrVar.f30968b = false;
            }
        });
    }

    public final void a() {
        org.telegram.ui.ActionBar.o1 o1Var = this.f30967a;
        if (o1Var != null) {
            o1Var.dismiss();
        }
    }

    public abstract void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout);

    public abstract void c();
}
