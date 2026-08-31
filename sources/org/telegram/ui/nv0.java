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
public final class nv0 implements View.OnClickListener {
    public final xh0 f39530a;
    public final xn f39531b;
    public final org.telegram.ui.Components.tl0 f39532c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.q70 f39533e;
    public final org.telegram.ui.Components.q70 f39534f;
    public final tv0 h;

    public nv0(tv0 tv0Var, xh0 xh0Var, xn xnVar, org.telegram.ui.Components.tl0 tl0Var, LinearLayout linearLayout, org.telegram.ui.Components.q70 q70Var, org.telegram.ui.Components.q70 q70Var2) {
        this.h = tv0Var;
        this.f39530a = xh0Var;
        this.f39531b = xnVar;
        this.f39532c = tl0Var;
        this.d = linearLayout;
        this.f39533e = q70Var;
        this.f39534f = q70Var2;
    }

    @Override
    public final void onClick(View view) {
        xh0 xh0Var = this.f39530a;
        ArrayList arrayList = xh0Var.f43068b;
        ArrayList arrayList2 = xh0Var.f43069c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            tv0 tv0Var = this.h;
            xn xnVar = this.f39531b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f20990id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20843id);
                }
                xnVar.presentFragment(new ProfileActivity(bundle, null));
                tv0Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && xnVar.U0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.ic t6 = new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(tv0Var.getContext()), tv0Var.f41715b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                xnVar.f43241k1 = t6;
                t6.f27745j = 4000;
                t6.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.tl0 tl0Var = this.f39532c;
            tl0Var.requestLayout();
            this.d.requestLayout();
            tl0Var.getAdapter().l();
            this.f39533e.K(this.f39534f);
        }
    }
}
