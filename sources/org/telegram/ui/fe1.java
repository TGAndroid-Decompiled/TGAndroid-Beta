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
public final class fe1 implements View.OnClickListener {
    public final fi0 f33554a;
    public final bo f33555b;
    public final org.telegram.ui.Components.ll0 f33556c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.n70 e;
    public final org.telegram.ui.Components.n70 f33557f;
    public final ke1 h;

    public fe1(ke1 ke1Var, fi0 fi0Var, bo boVar, org.telegram.ui.Components.ll0 ll0Var, LinearLayout linearLayout, org.telegram.ui.Components.n70 n70Var, org.telegram.ui.Components.n70 n70Var2) {
        this.h = ke1Var;
        this.f33554a = fi0Var;
        this.f33555b = boVar;
        this.f33556c = ll0Var;
        this.d = linearLayout;
        this.e = n70Var;
        this.f33557f = n70Var2;
    }

    @Override
    public final void onClick(View view) {
        fi0 fi0Var = this.f33554a;
        ArrayList arrayList = fi0Var.f33583b;
        ArrayList arrayList2 = fi0Var.f33584c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            ke1 ke1Var = this.h;
            bo boVar = this.f33555b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f18259id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f18112id);
                }
                boVar.presentFragment(new ProfileActivity(bundle, null));
                ke1Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && boVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.oc t10 = new org.telegram.ui.Components.vc(org.telegram.ui.Components.jb.a(ke1Var.getContext()), ke1Var.f35125a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                boVar.f32399n1 = t10;
                t10.f26754j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.ll0 ll0Var = this.f33556c;
            ll0Var.requestLayout();
            this.d.requestLayout();
            ll0Var.getAdapter().l();
            this.e.K(this.f33557f);
        }
    }
}
