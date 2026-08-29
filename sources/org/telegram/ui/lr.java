package org.telegram.ui;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class lr {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f40261a;
    public final LinearLayout f40262b;
    public final oq0 f40263c;

    public lr(ContextThemeWrapper contextThemeWrapper, org.telegram.ui.Components.qg0 qg0Var, oq0 oq0Var) {
        this.f40263c = oq0Var;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(0, 0, contextThemeWrapper, null);
        this.f40261a = actionBarPopupWindow$ActionBarPopupWindowLayout;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setFitItems(true);
        org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), false, null);
        c3.setOnClickListener(new kr(qg0Var, 0));
        c3.c(-328966, -328966);
        c3.setSelectorColor(268435455);
        View dVar = new bh.d(contextThemeWrapper, 12);
        dVar.setMinimumWidth(AndroidUtilities.dp(196.0f));
        dVar.setBackgroundColor(-15198184);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(dVar);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) dVar.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(8.0f);
        dVar.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(contextThemeWrapper);
        this.f40262b = linearLayout;
        linearLayout.setOrientation(1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.addView(linearLayout);
    }
}
