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
    public final gi0 f38396a;
    public final org.telegram.ui.Components.ll0 f38397b;
    public final LinearLayout f38398c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] f38399e;
    public final co f38400f;

    public li(co coVar, gi0 gi0Var, org.telegram.ui.Components.ll0 ll0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f38400f = coVar;
        this.f38396a = gi0Var;
        this.f38397b = ll0Var;
        this.f38398c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f38399e = iArr;
    }

    @Override
    public final void onClick(View view) {
        gi0 gi0Var = this.f38396a;
        ArrayList arrayList = gi0Var.f36710b;
        ArrayList arrayList2 = gi0Var.f36711c;
        co coVar = this.f38400f;
        if (coVar.Q8 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f20043id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f19896id);
                    }
                    coVar.presentFragment(new ProfileActivity(bundle, null));
                    coVar.A7(true);
                    return;
                }
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && coVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.yc(org.telegram.ui.Components.lb.a(coVar.getParentActivity()), coVar.f35274ea).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                coVar.f35375n1 = t10;
                t10.f29706j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.ll0 ll0Var = this.f38397b;
            ll0Var.requestLayout();
            this.f38398c.requestLayout();
            ll0Var.getAdapter().l();
            this.d.getSwipeBack().e(this.f38399e[0]);
        }
    }
}
