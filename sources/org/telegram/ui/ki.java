package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ki implements View.OnClickListener {
    public final ci0 f35039a;
    public final org.telegram.ui.Components.yl0 f35040b;
    public final LinearLayout f35041c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] e;
    public final xn f35042f;

    public ki(xn xnVar, ci0 ci0Var, org.telegram.ui.Components.yl0 yl0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f35042f = xnVar;
        this.f35039a = ci0Var;
        this.f35040b = yl0Var;
        this.f35041c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.e = iArr;
    }

    @Override
    public final void onClick(View view) {
        ci0 ci0Var = this.f35039a;
        ArrayList arrayList = ci0Var.f32727b;
        ArrayList arrayList2 = ci0Var.f32728c;
        xn xnVar = this.f35042f;
        if (xnVar.Q8 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f18476id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f18329id);
                    }
                    xnVar.presentFragment(new ProfileActivity(bundle, null));
                    xnVar.A7(true);
                    return;
                }
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && xnVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(xnVar.getParentActivity()), xnVar.f39750ea).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                xnVar.f39852n1 = t10;
                t10.f27691j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.yl0 yl0Var = this.f35040b;
            yl0Var.requestLayout();
            this.f35041c.requestLayout();
            yl0Var.getAdapter().l();
            this.d.getSwipeBack().e(this.e[0]);
        }
    }
}
