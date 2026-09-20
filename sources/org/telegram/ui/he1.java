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
public final class he1 implements View.OnClickListener {
    public final hi0 f34183a;
    public final zn f34184b;
    public final org.telegram.ui.Components.vl0 f34185c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.v70 e;
    public final org.telegram.ui.Components.v70 f34186f;
    public final me1 h;

    public he1(me1 me1Var, hi0 hi0Var, zn znVar, org.telegram.ui.Components.vl0 vl0Var, LinearLayout linearLayout, org.telegram.ui.Components.v70 v70Var, org.telegram.ui.Components.v70 v70Var2) {
        this.h = me1Var;
        this.f34183a = hi0Var;
        this.f34184b = znVar;
        this.f34185c = vl0Var;
        this.d = linearLayout;
        this.e = v70Var;
        this.f34186f = v70Var2;
    }

    @Override
    public final void onClick(View view) {
        hi0 hi0Var = this.f34183a;
        ArrayList arrayList = hi0Var.f34215b;
        ArrayList arrayList2 = hi0Var.f34216c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            me1 me1Var = this.h;
            zn znVar = this.f34184b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f18475id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f18328id);
                }
                znVar.presentFragment(new ProfileActivity(bundle, null));
                me1Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && znVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.pc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.kb.a(me1Var.getContext()), me1Var.f35696a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                znVar.f40405n1 = t10;
                t10.f27252j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.vl0 vl0Var = this.f34185c;
            vl0Var.requestLayout();
            this.d.requestLayout();
            vl0Var.getAdapter().l();
            this.e.K(this.f34186f);
        }
    }
}
