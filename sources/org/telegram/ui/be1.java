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
public final class be1 implements View.OnClickListener {
    public final di0 f35064a;
    public final yn f35065b;
    public final org.telegram.ui.Components.zl0 f35066c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.b80 f35067e;
    public final org.telegram.ui.Components.b80 f35068f;
    public final ge1 h;

    public be1(ge1 ge1Var, di0 di0Var, yn ynVar, org.telegram.ui.Components.zl0 zl0Var, LinearLayout linearLayout, org.telegram.ui.Components.b80 b80Var, org.telegram.ui.Components.b80 b80Var2) {
        this.h = ge1Var;
        this.f35064a = di0Var;
        this.f35065b = ynVar;
        this.f35066c = zl0Var;
        this.d = linearLayout;
        this.f35067e = b80Var;
        this.f35068f = b80Var2;
    }

    @Override
    public final void onClick(View view) {
        di0 di0Var = this.f35064a;
        ArrayList arrayList = di0Var.f35777b;
        ArrayList arrayList2 = di0Var.f35778c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            ge1 ge1Var = this.h;
            yn ynVar = this.f35065b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f20184id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20037id);
                }
                ynVar.presentFragment(new ProfileActivity(bundle, null));
                ge1Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && ynVar.V0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.rc t10 = new org.telegram.ui.Components.yc(org.telegram.ui.Components.mb.a(ge1Var.getContext()), ge1Var.f36604a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                ynVar.l1 = t10;
                t10.f30338j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.zl0 zl0Var = this.f35066c;
            zl0Var.requestLayout();
            this.d.requestLayout();
            zl0Var.getAdapter().l();
            this.f35067e.K(this.f35068f);
        }
    }
}
