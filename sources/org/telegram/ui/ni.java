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
public final class ni implements View.OnClickListener {
    public final gi0 f35279a;
    public final org.telegram.ui.Components.vl0 f35280b;
    public final LinearLayout f35281c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] e;
    public final eo f35282f;

    public ni(eo eoVar, gi0 gi0Var, org.telegram.ui.Components.vl0 vl0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f35282f = eoVar;
        this.f35279a = gi0Var;
        this.f35280b = vl0Var;
        this.f35281c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.e = iArr;
    }

    @Override
    public final void onClick(View view) {
        gi0 gi0Var = this.f35279a;
        ArrayList arrayList = gi0Var.f33109b;
        ArrayList arrayList2 = gi0Var.f33110c;
        eo eoVar = this.f35282f;
        if (eoVar.Q8 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f17342id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f17195id);
                    }
                    eoVar.presentFragment(new ProfileActivity(bundle, null));
                    eoVar.A7(true);
                    return;
                }
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && eoVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.pc t10 = new org.telegram.ui.Components.wc(org.telegram.ui.Components.kb.a(eoVar.getParentActivity()), eoVar.f32316ea).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                eoVar.f32417n1 = t10;
                t10.f26081j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.vl0 vl0Var = this.f35280b;
            vl0Var.requestLayout();
            this.f35281c.requestLayout();
            vl0Var.getAdapter().l();
            this.d.getSwipeBack().e(this.e[0]);
        }
    }
}
