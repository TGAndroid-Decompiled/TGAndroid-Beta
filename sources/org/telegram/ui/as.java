package org.telegram.ui;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class as {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f34077a;
    public final LinearLayout f34078b;
    public final vr0 f34079c;

    public as(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.Components.vh0 vh0Var, vr0 vr0Var) {
        this.f34079c = vr0Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, contextThemeWrapper, null);
        this.f34077a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
        c10.setOnClickListener(new zr(vh0Var, 0));
        c10.c(-328966, -328966);
        c10.setSelectorColor(268435455);
        View i5Var = new bi.i5(contextThemeWrapper, 11);
        i5Var.setMinimumWidth(AndroidUtilities.dp(196.0f));
        i5Var.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(i5Var);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) i5Var.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        i5Var.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        this.f34078b = linearLayout;
        linearLayout.setOrientation(1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(linearLayout);
    }
}
