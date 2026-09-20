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
    public final hi0 f33743a;
    public final zn f33744b;
    public final org.telegram.ui.Components.vl0 f33745c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.v70 e;
    public final org.telegram.ui.Components.v70 f33746f;
    public final mw0 h;

    public fw0(mw0 mw0Var, hi0 hi0Var, zn znVar, org.telegram.ui.Components.vl0 vl0Var, LinearLayout linearLayout, org.telegram.ui.Components.v70 v70Var, org.telegram.ui.Components.v70 v70Var2) {
        this.h = mw0Var;
        this.f33743a = hi0Var;
        this.f33744b = znVar;
        this.f33745c = vl0Var;
        this.d = linearLayout;
        this.e = v70Var;
        this.f33746f = v70Var2;
    }

    @Override
    public final void onClick(View view) {
        hi0 hi0Var = this.f33743a;
        ArrayList arrayList = hi0Var.f34215b;
        ArrayList arrayList2 = hi0Var.f34216c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            mw0 mw0Var = this.h;
            zn znVar = this.f33744b;
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
                mw0Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && znVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.pc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.kb.a(mw0Var.getContext()), mw0Var.f35829b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                znVar.f40405n1 = t10;
                t10.f27252j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.vl0 vl0Var = this.f33745c;
            vl0Var.requestLayout();
            this.d.requestLayout();
            vl0Var.getAdapter().l();
            this.e.K(this.f33746f);
        }
    }
}
