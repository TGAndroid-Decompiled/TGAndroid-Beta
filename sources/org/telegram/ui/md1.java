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
public final class md1 implements View.OnClickListener {
    public final wh0 f36272a;
    public final xn f36273b;
    public final org.telegram.ui.Components.sl0 f36274c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.o70 e;
    public final org.telegram.ui.Components.o70 f36275f;
    public final rd1 h;

    public md1(rd1 rd1Var, wh0 wh0Var, xn xnVar, org.telegram.ui.Components.sl0 sl0Var, LinearLayout linearLayout, org.telegram.ui.Components.o70 o70Var, org.telegram.ui.Components.o70 o70Var2) {
        this.h = rd1Var;
        this.f36272a = wh0Var;
        this.f36273b = xnVar;
        this.f36274c = sl0Var;
        this.d = linearLayout;
        this.e = o70Var;
        this.f36275f = o70Var2;
    }

    @Override
    public final void onClick(View view) {
        wh0 wh0Var = this.f36272a;
        ArrayList arrayList = wh0Var.f39742b;
        ArrayList arrayList2 = wh0Var.f39743c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            rd1 rd1Var = this.h;
            xn xnVar = this.f36273b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f19331id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f19184id);
                }
                xnVar.presentFragment(new ProfileActivity(bundle, null));
                rd1Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && xnVar.U0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.ic t6 = new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(rd1Var.getContext()), rd1Var.f37987a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                xnVar.f40072k1 = t6;
                t6.f25672j = 4000;
                t6.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.sl0 sl0Var = this.f36274c;
            sl0Var.requestLayout();
            this.d.requestLayout();
            sl0Var.getAdapter().l();
            this.e.K(this.f36275f);
        }
    }
}
