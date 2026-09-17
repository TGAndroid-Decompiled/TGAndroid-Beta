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
    public final gi0 f38370a;
    public final org.telegram.ui.Components.ll0 f38371b;
    public final LinearLayout f38372c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] f38373e;
    public final co f38374f;

    public li(co coVar, gi0 gi0Var, org.telegram.ui.Components.ll0 ll0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f38374f = coVar;
        this.f38370a = gi0Var;
        this.f38371b = ll0Var;
        this.f38372c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f38373e = iArr;
    }

    @Override
    public final void onClick(View view) {
        gi0 gi0Var = this.f38370a;
        ArrayList arrayList = gi0Var.f36684b;
        ArrayList arrayList2 = gi0Var.f36685c;
        co coVar = this.f38374f;
        if (coVar.Q8 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f20016id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f19869id);
                    }
                    coVar.presentFragment(new ProfileActivity(bundle, null));
                    coVar.A7(true);
                    return;
                }
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && coVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.yc(org.telegram.ui.Components.lb.a(coVar.getParentActivity()), coVar.f35248ea).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                coVar.f35349n1 = t10;
                t10.f29680j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.ll0 ll0Var = this.f38371b;
            ll0Var.requestLayout();
            this.f38372c.requestLayout();
            ll0Var.getAdapter().l();
            this.d.getSwipeBack().e(this.f38373e[0]);
        }
    }
}
