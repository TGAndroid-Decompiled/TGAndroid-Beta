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
public final class pi implements View.OnClickListener {
    public final ii0 f40967a;
    public final org.telegram.ui.Components.wm0 f40968b;
    public final LinearLayout f40969c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] f40970e;
    public final eo f40971f;

    public pi(eo eoVar, ii0 ii0Var, org.telegram.ui.Components.wm0 wm0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f40971f = eoVar;
        this.f40967a = ii0Var;
        this.f40968b = wm0Var;
        this.f40969c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f40970e = iArr;
    }

    @Override
    public final void onClick(View view) {
        ii0 ii0Var = this.f40967a;
        ArrayList arrayList = ii0Var.f38914b;
        ArrayList arrayList2 = ii0Var.f38915c;
        eo eoVar = this.f40971f;
        if (eoVar.Q8 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f19949id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f19802id);
                    }
                    eoVar.presentFragment(new ProfileActivity(bundle, null));
                    eoVar.D7(true);
                    return;
                }
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && eoVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.sc t10 = new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(eoVar.getParentActivity()), eoVar.f37251ea).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                eoVar.f37352n1 = t10;
                t10.f30540j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.wm0 wm0Var = this.f40968b;
            wm0Var.requestLayout();
            this.f40969c.requestLayout();
            wm0Var.getAdapter().l();
            this.d.getSwipeBack().e(this.f40970e[0]);
        }
    }
}
