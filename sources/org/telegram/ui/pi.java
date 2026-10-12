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
    public final ii0 f40969a;
    public final org.telegram.ui.Components.wm0 f40970b;
    public final LinearLayout f40971c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] f40972e;
    public final eo f40973f;

    public pi(eo eoVar, ii0 ii0Var, org.telegram.ui.Components.wm0 wm0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f40973f = eoVar;
        this.f40969a = ii0Var;
        this.f40970b = wm0Var;
        this.f40971c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f40972e = iArr;
    }

    @Override
    public final void onClick(View view) {
        ii0 ii0Var = this.f40969a;
        ArrayList arrayList = ii0Var.f38916b;
        ArrayList arrayList2 = ii0Var.f38917c;
        eo eoVar = this.f40973f;
        if (eoVar.Q8 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f19950id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f19803id);
                    }
                    eoVar.presentFragment(new ProfileActivity(bundle, null));
                    eoVar.D7(true);
                    return;
                }
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && eoVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.sc t10 = new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(eoVar.getParentActivity()), eoVar.f37256ea).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                eoVar.f37357n1 = t10;
                t10.f30536j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.wm0 wm0Var = this.f40970b;
            wm0Var.requestLayout();
            this.f40971c.requestLayout();
            wm0Var.getAdapter().l();
            this.d.getSwipeBack().e(this.f40972e[0]);
        }
    }
}
