package org.telegram.ui.Components;

import android.content.Context;
import android.widget.PopupWindow;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class ps {
    public final org.telegram.ui.ActionBar.m1 f29559a;
    public boolean f29560b;

    public ps(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, z10 ? 1 : 0, context, c6Var);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new yk(this, 1));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new s(this, 27));
        actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
        b(actionBarPopupWindow$ActionBarPopupWindowLayout);
        org.telegram.ui.ActionBar.m1 m1Var = new org.telegram.ui.ActionBar.m1(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.f29559a = m1Var;
        m1Var.f21145b = false;
        m1Var.setAnimationStyle(R.style.PopupContextAnimation2);
        m1Var.setOutsideTouchable(true);
        m1Var.setClippingEnabled(true);
        m1Var.setInputMethodMode(2);
        m1Var.setSoftInputMode(0);
        m1Var.getContentView().setFocusableInTouchMode(true);
        if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
            m1Var.setFocusable(true);
        }
        m1Var.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public final void onDismiss() {
                ps psVar = ps.this;
                psVar.c();
                psVar.f29560b = false;
            }
        });
    }

    public final void a() {
        org.telegram.ui.ActionBar.m1 m1Var = this.f29559a;
        if (m1Var != null) {
            m1Var.d(true);
        }
    }

    public abstract void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout);

    public abstract void c();
}
