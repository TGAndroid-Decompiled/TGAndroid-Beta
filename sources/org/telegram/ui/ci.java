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
public final class ci implements View.OnClickListener {
    public final th0 f36351a;
    public final org.telegram.ui.Components.lm0 f36352b;
    public final LinearLayout f36353c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] e;
    public final sn f36354f;

    public ci(sn snVar, th0 th0Var, org.telegram.ui.Components.lm0 lm0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f36354f = snVar;
        this.f36351a = th0Var;
        this.f36352b = lm0Var;
        this.f36353c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.e = iArr;
    }

    @Override
    public final void onClick(View view) {
        th0 th0Var = this.f36351a;
        ArrayList arrayList = th0Var.f42062b;
        ArrayList arrayList2 = th0Var.f42063c;
        sn snVar = this.f36354f;
        if (snVar.f41481c9 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f20491id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20344id);
                    }
                    snVar.presentFragment(new ProfileActivity(bundle, null));
                    snVar.D7(true);
                    return;
                }
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && snVar.f41558j1.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.oc t10 = new org.telegram.ui.Components.vc(org.telegram.ui.Components.jb.a(snVar.getParentActivity()), snVar.f41651qa).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                snVar.f41760z1 = t10;
                t10.f29203j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.lm0 lm0Var = this.f36352b;
            lm0Var.requestLayout();
            this.f36353c.requestLayout();
            lm0Var.getAdapter().l();
            this.d.getSwipeBack().e(this.e[0]);
        }
    }
}
