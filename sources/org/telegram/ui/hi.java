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
    public final wh0 f34880a;
    public final org.telegram.ui.Components.sl0 f34881b;
    public final LinearLayout f34882c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] e;
    public final xn f34883f;

    public hi(xn xnVar, wh0 wh0Var, org.telegram.ui.Components.sl0 sl0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f34883f = xnVar;
        this.f34880a = wh0Var;
        this.f34881b = sl0Var;
        this.f34882c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.e = iArr;
    }

    @Override
    public final void onClick(View view) {
        wh0 wh0Var = this.f34880a;
        ArrayList arrayList = wh0Var.f39742b;
        ArrayList arrayList2 = wh0Var.f39743c;
        xn xnVar = this.f34883f;
        if (xnVar.N8 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f19331id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f19184id);
                    }
                    xnVar.presentFragment(new ProfileActivity(bundle, null));
                    xnVar.A7(true);
                    return;
                }
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && xnVar.U0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.ic t6 = new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(xnVar.getParentActivity()), xnVar.f39968ba).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                xnVar.f40072k1 = t6;
                t6.f25672j = 4000;
                t6.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.sl0 sl0Var = this.f34881b;
            sl0Var.requestLayout();
            this.f34882c.requestLayout();
            sl0Var.getAdapter().l();
            this.d.getSwipeBack().e(this.e[0]);
        }
    }
}
