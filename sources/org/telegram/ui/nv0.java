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
    public final th0 f40000a;
    public final sn f40001b;
    public final org.telegram.ui.Components.lm0 f40002c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.h80 e;
    public final org.telegram.ui.Components.h80 f40003f;
    public final tv0 h;

    public nv0(tv0 tv0Var, th0 th0Var, sn snVar, org.telegram.ui.Components.lm0 lm0Var, LinearLayout linearLayout, org.telegram.ui.Components.h80 h80Var, org.telegram.ui.Components.h80 h80Var2) {
        this.h = tv0Var;
        this.f40000a = th0Var;
        this.f40001b = snVar;
        this.f40002c = lm0Var;
        this.d = linearLayout;
        this.e = h80Var;
        this.f40003f = h80Var2;
    }

    @Override
    public final void onClick(View view) {
        th0 th0Var = this.f40000a;
        ArrayList arrayList = th0Var.f42062b;
        ArrayList arrayList2 = th0Var.f42063c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            tv0 tv0Var = this.h;
            sn snVar = this.f40001b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f20491id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20344id);
                }
                snVar.presentFragment(new ProfileActivity(bundle, null));
                tv0Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && snVar.f41558j1.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.oc t10 = new org.telegram.ui.Components.vc(org.telegram.ui.Components.jb.a(tv0Var.getContext()), tv0Var.f42125b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                snVar.f41760z1 = t10;
                t10.f29203j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.lm0 lm0Var = this.f40002c;
            lm0Var.requestLayout();
            this.d.requestLayout();
            lm0Var.getAdapter().l();
            this.e.K(this.f40003f);
        }
    }
}
