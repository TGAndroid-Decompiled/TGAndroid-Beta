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
public final class je1 implements View.OnClickListener {
    public final ii0 f39192a;
    public final eo f39193b;
    public final org.telegram.ui.Components.wm0 f39194c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.s80 f39195e;
    public final org.telegram.ui.Components.s80 f39196f;
    public final oe1 h;

    public je1(oe1 oe1Var, ii0 ii0Var, eo eoVar, org.telegram.ui.Components.wm0 wm0Var, LinearLayout linearLayout, org.telegram.ui.Components.s80 s80Var, org.telegram.ui.Components.s80 s80Var2) {
        this.h = oe1Var;
        this.f39192a = ii0Var;
        this.f39193b = eoVar;
        this.f39194c = wm0Var;
        this.d = linearLayout;
        this.f39195e = s80Var;
        this.f39196f = s80Var2;
    }

    @Override
    public final void onClick(View view) {
        ii0 ii0Var = this.f39192a;
        ArrayList arrayList = ii0Var.f38914b;
        ArrayList arrayList2 = ii0Var.f38915c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            oe1 oe1Var = this.h;
            eo eoVar = this.f39193b;
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
                oe1Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && eoVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.sc t10 = new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(oe1Var.getContext()), oe1Var.f40684a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                eoVar.f37352n1 = t10;
                t10.f30540j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.wm0 wm0Var = this.f39194c;
            wm0Var.requestLayout();
            this.d.requestLayout();
            wm0Var.getAdapter().l();
            this.f39195e.K(this.f39196f);
        }
    }
}
