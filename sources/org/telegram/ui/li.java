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
    public final gi0 f38369a;
    public final org.telegram.ui.Components.ll0 f38370b;
    public final LinearLayout f38371c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] f38372e;
    public final co f38373f;

    public li(co coVar, gi0 gi0Var, org.telegram.ui.Components.ll0 ll0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f38373f = coVar;
        this.f38369a = gi0Var;
        this.f38370b = ll0Var;
        this.f38371c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f38372e = iArr;
    }

    @Override
    public final void onClick(View view) {
        gi0 gi0Var = this.f38369a;
        ArrayList arrayList = gi0Var.f36683b;
        ArrayList arrayList2 = gi0Var.f36684c;
        co coVar = this.f38373f;
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
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.yc(org.telegram.ui.Components.lb.a(coVar.getParentActivity()), coVar.f35247ea).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                coVar.f35348n1 = t10;
                t10.f29679j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.ll0 ll0Var = this.f38370b;
            ll0Var.requestLayout();
            this.f38371c.requestLayout();
            ll0Var.getAdapter().l();
            this.d.getSwipeBack().e(this.f38372e[0]);
        }
    }
}
