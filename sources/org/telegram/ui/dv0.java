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

public final class dv0 implements View.OnClickListener {

    public final rh0 f37558a;

    public final rn f37559b;

    public final org.telegram.ui.Components.zk0 f37560c;
    public final LinearLayout d;

    public final org.telegram.ui.Components.b70 f37561e;

    public final org.telegram.ui.Components.b70 f37562f;
    public final jv0 h;

    public dv0(jv0 jv0Var, rh0 rh0Var, rn rnVar, org.telegram.ui.Components.zk0 zk0Var, LinearLayout linearLayout, org.telegram.ui.Components.b70 b70Var, org.telegram.ui.Components.b70 b70Var2) {
        this.h = jv0Var;
        this.f37558a = rh0Var;
        this.f37559b = rnVar;
        this.f37560c = zk0Var;
        this.d = linearLayout;
        this.f37561e = b70Var;
        this.f37562f = b70Var2;
    }

    @Override
    public final void onClick(View view) {
        rh0 rh0Var = this.f37558a;
        ArrayList arrayList = rh0Var.f41934b;
        ArrayList arrayList2 = rh0Var.f41935c;
        if (arrayList2.isEmpty()) {
            return;
        }
        int size = arrayList2.size();
        jv0 jv0Var = this.h;
        rn rnVar = this.f37559b;
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
            rnVar.presentFragment(new ProfileActivity(bundle, null));
            jv0Var.c(false);
            return;
        }
        if (SharedConfig.messageSeenHintCount > 0 && rnVar.T0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
            org.telegram.ui.Components.ec ecVarT = new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(jv0Var.getContext()), jv0Var.f39515b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
            rnVar.f42091j1 = ecVarT;
            ecVarT.f28020j = 4000;
            ecVarT.j();
            SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
        }
        org.telegram.ui.Components.zk0 zk0Var = this.f37560c;
        zk0Var.requestLayout();
        this.d.requestLayout();
        zk0Var.getAdapter().l();
        this.f37561e.K(this.f37562f);
    }
}
