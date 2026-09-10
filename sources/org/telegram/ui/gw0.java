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
public final class gw0 implements View.OnClickListener {
    public final gi0 f33204a;
    public final eo f33205b;
    public final org.telegram.ui.Components.vl0 f33206c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.w70 e;
    public final org.telegram.ui.Components.w70 f33207f;
    public final ow0 h;

    public gw0(ow0 ow0Var, gi0 gi0Var, eo eoVar, org.telegram.ui.Components.vl0 vl0Var, LinearLayout linearLayout, org.telegram.ui.Components.w70 w70Var, org.telegram.ui.Components.w70 w70Var2) {
        this.h = ow0Var;
        this.f33204a = gi0Var;
        this.f33205b = eoVar;
        this.f33206c = vl0Var;
        this.d = linearLayout;
        this.e = w70Var;
        this.f33207f = w70Var2;
    }

    @Override
    public final void onClick(View view) {
        gi0 gi0Var = this.f33204a;
        ArrayList arrayList = gi0Var.f33109b;
        ArrayList arrayList2 = gi0Var.f33110c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            ow0 ow0Var = this.h;
            eo eoVar = this.f33205b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f17342id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f17195id);
                }
                eoVar.presentFragment(new ProfileActivity(bundle, null));
                ow0Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && eoVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.pc t10 = new org.telegram.ui.Components.wc(org.telegram.ui.Components.kb.a(ow0Var.getContext()), ow0Var.f35625b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                eoVar.f32417n1 = t10;
                t10.f26081j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.vl0 vl0Var = this.f33206c;
            vl0Var.requestLayout();
            this.d.requestLayout();
            vl0Var.getAdapter().l();
            this.e.K(this.f33207f);
        }
    }
}
