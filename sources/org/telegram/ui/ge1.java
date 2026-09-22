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
public final class ge1 implements View.OnClickListener {
    public final fi0 f33837a;
    public final bo f33838b;
    public final org.telegram.ui.Components.ll0 f33839c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.n70 e;
    public final org.telegram.ui.Components.n70 f33840f;
    public final le1 h;

    public ge1(le1 le1Var, fi0 fi0Var, bo boVar, org.telegram.ui.Components.ll0 ll0Var, LinearLayout linearLayout, org.telegram.ui.Components.n70 n70Var, org.telegram.ui.Components.n70 n70Var2) {
        this.h = le1Var;
        this.f33837a = fi0Var;
        this.f33838b = boVar;
        this.f33839c = ll0Var;
        this.d = linearLayout;
        this.e = n70Var;
        this.f33840f = n70Var2;
    }

    @Override
    public final void onClick(View view) {
        fi0 fi0Var = this.f33837a;
        ArrayList arrayList = fi0Var.f33606b;
        ArrayList arrayList2 = fi0Var.f33607c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            le1 le1Var = this.h;
            bo boVar = this.f33838b;
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
                le1Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && boVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.oc t10 = new org.telegram.ui.Components.vc(org.telegram.ui.Components.jb.a(le1Var.getContext()), le1Var.f35448a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                boVar.f32394n1 = t10;
                t10.f26751j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.ll0 ll0Var = this.f33839c;
            ll0Var.requestLayout();
            this.d.requestLayout();
            ll0Var.getAdapter().l();
            this.e.K(this.f33840f);
        }
    }
}
