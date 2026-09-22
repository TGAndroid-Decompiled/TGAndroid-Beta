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
public final class fw0 implements View.OnClickListener {
    public final fi0 f33710a;
    public final bo f33711b;
    public final org.telegram.ui.Components.ll0 f33712c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.n70 e;
    public final org.telegram.ui.Components.n70 f33713f;
    public final mw0 h;

    public fw0(mw0 mw0Var, fi0 fi0Var, bo boVar, org.telegram.ui.Components.ll0 ll0Var, LinearLayout linearLayout, org.telegram.ui.Components.n70 n70Var, org.telegram.ui.Components.n70 n70Var2) {
        this.h = mw0Var;
        this.f33710a = fi0Var;
        this.f33711b = boVar;
        this.f33712c = ll0Var;
        this.d = linearLayout;
        this.e = n70Var;
        this.f33713f = n70Var2;
    }

    @Override
    public final void onClick(View view) {
        fi0 fi0Var = this.f33710a;
        ArrayList arrayList = fi0Var.f33606b;
        ArrayList arrayList2 = fi0Var.f33607c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            mw0 mw0Var = this.h;
            bo boVar = this.f33711b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f18256id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f18109id);
                }
                boVar.presentFragment(new ProfileActivity(bundle, null));
                mw0Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && boVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.oc t10 = new org.telegram.ui.Components.vc(org.telegram.ui.Components.jb.a(mw0Var.getContext()), mw0Var.f35821b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                boVar.f32394n1 = t10;
                t10.f26751j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.ll0 ll0Var = this.f33712c;
            ll0Var.requestLayout();
            this.d.requestLayout();
            ll0Var.getAdapter().l();
            this.e.K(this.f33713f);
        }
    }
}
