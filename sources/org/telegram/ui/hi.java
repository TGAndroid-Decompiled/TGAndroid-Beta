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
public final class hi implements View.OnClickListener {
    public final xh0 f37393a;
    public final org.telegram.ui.Components.sl0 f37394b;
    public final LinearLayout f37395c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] f37396e;
    public final xn f37397f;

    public hi(xn xnVar, xh0 xh0Var, org.telegram.ui.Components.sl0 sl0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f37397f = xnVar;
        this.f37393a = xh0Var;
        this.f37394b = sl0Var;
        this.f37395c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f37396e = iArr;
    }

    @Override
    public final void onClick(View view) {
        xh0 xh0Var = this.f37393a;
        ArrayList arrayList = xh0Var.f43049b;
        ArrayList arrayList2 = xh0Var.f43050c;
        xn xnVar = this.f37397f;
        if (xnVar.N8 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f20992id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20845id);
                    }
                    xnVar.presentFragment(new ProfileActivity(bundle, null));
                    xnVar.A7(true);
                    return;
                }
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && xnVar.U0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.ic t6 = new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(xnVar.getParentActivity()), xnVar.f43114ba).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                xnVar.f43219k1 = t6;
                t6.f27778j = 4000;
                t6.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.sl0 sl0Var = this.f37394b;
            sl0Var.requestLayout();
            this.f37395c.requestLayout();
            sl0Var.getAdapter().l();
            this.d.getSwipeBack().e(this.f37396e[0]);
        }
    }
}
