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

public final class bi implements View.OnClickListener {

    public final rh0 f36834a;

    public final org.telegram.ui.Components.zk0 f36835b;

    public final LinearLayout f36836c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;

    public final int[] f36837e;

    public final rn f36838f;

    public bi(rn rnVar, rh0 rh0Var, org.telegram.ui.Components.zk0 zk0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f36838f = rnVar;
        this.f36834a = rh0Var;
        this.f36835b = zk0Var;
        this.f36836c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f36837e = iArr;
    }

    @Override
    public final void onClick(View view) {
        rh0 rh0Var = this.f36834a;
        ArrayList arrayList = rh0Var.f41934b;
        ArrayList arrayList2 = rh0Var.f41935c;
        rn rnVar = this.f36838f;
        if (rnVar.M8 == null || arrayList2.isEmpty()) {
            return;
        }
        if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
            TLObject tLObject = (TLObject) arrayList2.get(0);
            if (tLObject == null) {
                return;
            }
            Bundle bundle = new Bundle();
            if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).f22527id);
            } else if (tLObject instanceof TLRPC.Chat) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f22380id);
            }
            rnVar.presentFragment(new ProfileActivity(bundle, null));
            rnVar.A7(true);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && rnVar.T0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.ec ecVarT = new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(rnVar.getParentActivity()), rnVar.f41983aa).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            rnVar.f42091j1 = ecVarT;
            ecVarT.f28020j = 4000;
            ecVarT.j();
            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
        }
        org.telegram.ui.Components.zk0 zk0Var = this.f36835b;
        zk0Var.requestLayout();
        this.f36836c.requestLayout();
        zk0Var.getAdapter().l();
        this.d.getSwipeBack().e(this.f36837e[0]);
    }
}
