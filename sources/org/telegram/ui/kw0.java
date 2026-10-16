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
public final class kw0 implements View.OnClickListener {
    public final ki0 f37537a;
    public final fo f37538b;
    public final org.telegram.ui.Components.mm0 f37539c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.l80 e;
    public final org.telegram.ui.Components.l80 f37540f;
    public final rw0 h;

    public kw0(rw0 rw0Var, ki0 ki0Var, fo foVar, org.telegram.ui.Components.mm0 mm0Var, LinearLayout linearLayout, org.telegram.ui.Components.l80 l80Var, org.telegram.ui.Components.l80 l80Var2) {
        this.h = rw0Var;
        this.f37537a = ki0Var;
        this.f37538b = foVar;
        this.f37539c = mm0Var;
        this.d = linearLayout;
        this.e = l80Var;
        this.f37540f = l80Var2;
    }

    @Override
    public final void onClick(View view) {
        ki0 ki0Var = this.f37537a;
        ArrayList arrayList = ki0Var.f37434b;
        ArrayList arrayList2 = ki0Var.f37435c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            rw0 rw0Var = this.h;
            fo foVar = this.f37538b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f19063id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f18916id);
                }
                foVar.presentFragment(new ProfileActivity(bundle, null));
                rw0Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && foVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.sc t10 = new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(rw0Var.getContext()), rw0Var.f39600b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                foVar.f35735n1 = t10;
                t10.f28805j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.mm0 mm0Var = this.f37539c;
            mm0Var.requestLayout();
            this.d.requestLayout();
            mm0Var.getAdapter().l();
            this.e.K(this.f37540f);
        }
    }
}
