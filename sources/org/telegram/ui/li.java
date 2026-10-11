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
public final class li implements View.OnClickListener {
    public final gi0 f39679a;
    public final org.telegram.ui.Components.sm0 f39680b;
    public final LinearLayout f39681c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] f39682e;
    public final zn f39683f;

    public li(zn znVar, gi0 gi0Var, org.telegram.ui.Components.sm0 sm0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f39683f = znVar;
        this.f39679a = gi0Var;
        this.f39680b = sm0Var;
        this.f39681c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f39682e = iArr;
    }

    @Override
    public final void onClick(View view) {
        gi0 gi0Var = this.f39679a;
        ArrayList arrayList = gi0Var.f38099b;
        ArrayList arrayList2 = gi0Var.f38100c;
        zn znVar = this.f39683f;
        if (znVar.Q8 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f20179id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20032id);
                    }
                    znVar.presentFragment(new ProfileActivity(bundle, null));
                    znVar.D7(true);
                    return;
                }
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && znVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.sc t10 = new org.telegram.ui.Components.ad(org.telegram.ui.Components.nb.a(znVar.getParentActivity()), znVar.f44762ea).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                znVar.f44863n1 = t10;
                t10.f30711j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.sm0 sm0Var = this.f39680b;
            sm0Var.requestLayout();
            this.f39681c.requestLayout();
            sm0Var.getAdapter().l();
            this.d.getSwipeBack().e(this.f39682e[0]);
        }
    }
}
