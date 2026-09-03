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
public final class ji implements View.OnClickListener {
    public final yh0 f35281a;
    public final org.telegram.ui.Components.rl0 f35282b;
    public final LinearLayout f35283c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] e;
    public final zn f35284f;

    public ji(zn znVar, yh0 yh0Var, org.telegram.ui.Components.rl0 rl0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f35284f = znVar;
        this.f35281a = yh0Var;
        this.f35282b = rl0Var;
        this.f35283c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.e = iArr;
    }

    @Override
    public final void onClick(View view) {
        yh0 yh0Var = this.f35281a;
        ArrayList arrayList = yh0Var.f40277b;
        ArrayList arrayList2 = yh0Var.f40278c;
        zn znVar = this.f35284f;
        if (znVar.N8 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f19306id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f19159id);
                    }
                    znVar.presentFragment(new ProfileActivity(bundle, null));
                    znVar.A7(true);
                    return;
                }
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && znVar.U0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.ic t6 = new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(znVar.getParentActivity()), znVar.f40534ba).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                znVar.f40638k1 = t6;
                t6.f25671j = 4000;
                t6.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.rl0 rl0Var = this.f35282b;
            rl0Var.requestLayout();
            this.f35283c.requestLayout();
            rl0Var.getAdapter().l();
            this.d.getSwipeBack().e(this.e[0]);
        }
    }
}
