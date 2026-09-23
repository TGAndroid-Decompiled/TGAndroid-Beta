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
public final class ii implements View.OnClickListener {
    public final ai0 f34146a;
    public final org.telegram.ui.Components.ml0 f34147b;
    public final LinearLayout f34148c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] e;
    public final xn f34149f;

    public ii(xn xnVar, ai0 ai0Var, org.telegram.ui.Components.ml0 ml0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f34149f = xnVar;
        this.f34146a = ai0Var;
        this.f34147b = ml0Var;
        this.f34148c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.e = iArr;
    }

    @Override
    public final void onClick(View view) {
        ai0 ai0Var = this.f34146a;
        ArrayList arrayList = ai0Var.f31800b;
        ArrayList arrayList2 = ai0Var.f31801c;
        xn xnVar = this.f34149f;
        if (xnVar.Q8 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f18230id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f18083id);
                    }
                    xnVar.presentFragment(new ProfileActivity(bundle, null));
                    xnVar.A7(true);
                    return;
                }
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && xnVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(xnVar.getParentActivity()), xnVar.f39370ea).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                xnVar.f39471n1 = t10;
                t10.f27306j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.ml0 ml0Var = this.f34147b;
            ml0Var.requestLayout();
            this.f34148c.requestLayout();
            ml0Var.getAdapter().l();
            this.d.getSwipeBack().e(this.e[0]);
        }
    }
}
