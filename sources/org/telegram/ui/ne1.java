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
public final class ne1 implements View.OnClickListener {
    public final li0 f38691a;
    public final fo f38692b;
    public final org.telegram.ui.Components.mm0 f38693c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.m80 e;
    public final org.telegram.ui.Components.m80 f38694f;
    public final se1 h;

    public ne1(se1 se1Var, li0 li0Var, fo foVar, org.telegram.ui.Components.mm0 mm0Var, LinearLayout linearLayout, org.telegram.ui.Components.m80 m80Var, org.telegram.ui.Components.m80 m80Var2) {
        this.h = se1Var;
        this.f38691a = li0Var;
        this.f38692b = foVar;
        this.f38693c = mm0Var;
        this.d = linearLayout;
        this.e = m80Var;
        this.f38694f = m80Var2;
    }

    @Override
    public final void onClick(View view) {
        li0 li0Var = this.f38691a;
        ArrayList arrayList = li0Var.f38020b;
        ArrayList arrayList2 = li0Var.f38021c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            se1 se1Var = this.h;
            fo foVar = this.f38692b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f19363id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f19216id);
                }
                foVar.presentFragment(new ProfileActivity(bundle, null));
                se1Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && foVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.sc t10 = new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(se1Var.getContext()), se1Var.f40108a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                foVar.f36034n1 = t10;
                t10.f29102j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.mm0 mm0Var = this.f38693c;
            mm0Var.requestLayout();
            this.d.requestLayout();
            mm0Var.getAdapter().l();
            this.e.K(this.f38694f);
        }
    }
}
