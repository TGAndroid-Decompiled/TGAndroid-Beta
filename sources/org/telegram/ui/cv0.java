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
public final class cv0 implements View.OnClickListener {
    public final ph0 f37330a;
    public final qn f37331b;
    public final org.telegram.ui.Components.wk0 f37332c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.x60 f37333e;
    public final org.telegram.ui.Components.x60 f37334f;
    public final iv0 h;

    public cv0(iv0 iv0Var, ph0 ph0Var, qn qnVar, org.telegram.ui.Components.wk0 wk0Var, LinearLayout linearLayout, org.telegram.ui.Components.x60 x60Var, org.telegram.ui.Components.x60 x60Var2) {
        this.h = iv0Var;
        this.f37330a = ph0Var;
        this.f37331b = qnVar;
        this.f37332c = wk0Var;
        this.d = linearLayout;
        this.f37333e = x60Var;
        this.f37334f = x60Var2;
    }

    @Override
    public final void onClick(View view) {
        ph0 ph0Var = this.f37330a;
        ArrayList arrayList = ph0Var.f41525b;
        ArrayList arrayList2 = ph0Var.f41526c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            iv0 iv0Var = this.h;
            qn qnVar = this.f37331b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f22527id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f22380id);
                }
                qnVar.presentFragment(new ProfileActivity(bundle, null));
                iv0Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && qnVar.T0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.gc t10 = new org.telegram.ui.Components.oc(org.telegram.ui.Components.cb.a(iv0Var.getContext()), iv0Var.f39297b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                qnVar.f41955j1 = t10;
                t10.f28737j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.wk0 wk0Var = this.f37332c;
            wk0Var.requestLayout();
            this.d.requestLayout();
            wk0Var.getAdapter().l();
            this.f37333e.K(this.f37334f);
        }
    }
}
