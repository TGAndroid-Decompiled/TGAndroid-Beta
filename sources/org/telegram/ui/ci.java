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
    public final qh0 f35990a;
    public final org.telegram.ui.Components.jm0 f35991b;
    public final LinearLayout f35992c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] e;
    public final qn f35993f;

    public ci(qn qnVar, qh0 qh0Var, org.telegram.ui.Components.jm0 jm0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f35993f = qnVar;
        this.f35990a = qh0Var;
        this.f35991b = jm0Var;
        this.f35992c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.e = iArr;
    }

    @Override
    public final void onClick(View view) {
        qh0 qh0Var = this.f35990a;
        ArrayList arrayList = qh0Var.f40582b;
        ArrayList arrayList2 = qh0Var.f40583c;
        qn qnVar = this.f35993f;
        if (qnVar.Q8 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f20427id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20280id);
                    }
                    qnVar.presentFragment(new ProfileActivity(bundle, null));
                    qnVar.D7(true);
                    return;
                }
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && qnVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(qnVar.getParentActivity()), qnVar.f40677ea).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                qnVar.f40779n1 = t10;
                t10.f29535j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.jm0 jm0Var = this.f35991b;
            jm0Var.requestLayout();
            this.f35992c.requestLayout();
            jm0Var.getAdapter().l();
            this.d.getSwipeBack().e(this.e[0]);
        }
    }
}
