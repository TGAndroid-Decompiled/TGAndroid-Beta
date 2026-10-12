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
public final class hw0 implements View.OnClickListener {
    public final ii0 f38550a;
    public final eo f38551b;
    public final org.telegram.ui.Components.wm0 f38552c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.s80 f38553e;
    public final org.telegram.ui.Components.s80 f38554f;
    public final ow0 h;

    public hw0(ow0 ow0Var, ii0 ii0Var, eo eoVar, org.telegram.ui.Components.wm0 wm0Var, LinearLayout linearLayout, org.telegram.ui.Components.s80 s80Var, org.telegram.ui.Components.s80 s80Var2) {
        this.h = ow0Var;
        this.f38550a = ii0Var;
        this.f38551b = eoVar;
        this.f38552c = wm0Var;
        this.d = linearLayout;
        this.f38553e = s80Var;
        this.f38554f = s80Var2;
    }

    @Override
    public final void onClick(View view) {
        ii0 ii0Var = this.f38550a;
        ArrayList arrayList = ii0Var.f38914b;
        ArrayList arrayList2 = ii0Var.f38915c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            ow0 ow0Var = this.h;
            eo eoVar = this.f38551b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f19949id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f19802id);
                }
                eoVar.presentFragment(new ProfileActivity(bundle, null));
                ow0Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && eoVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.sc t10 = new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(ow0Var.getContext()), ow0Var.f40788b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                eoVar.f37352n1 = t10;
                t10.f30540j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.wm0 wm0Var = this.f38552c;
            wm0Var.requestLayout();
            this.d.requestLayout();
            wm0Var.getAdapter().l();
            this.f38553e.K(this.f38554f);
        }
    }
}
