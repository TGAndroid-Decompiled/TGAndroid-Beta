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
    public final hi0 f37752a;
    public final zn f37753b;
    public final org.telegram.ui.Components.rm0 f37754c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.q80 f37755e;
    public final org.telegram.ui.Components.q80 f37756f;
    public final mw0 h;

    public fw0(mw0 mw0Var, hi0 hi0Var, zn znVar, org.telegram.ui.Components.rm0 rm0Var, LinearLayout linearLayout, org.telegram.ui.Components.q80 q80Var, org.telegram.ui.Components.q80 q80Var2) {
        this.h = mw0Var;
        this.f37752a = hi0Var;
        this.f37753b = znVar;
        this.f37754c = rm0Var;
        this.d = linearLayout;
        this.f37755e = q80Var;
        this.f37756f = q80Var2;
    }

    @Override
    public final void onClick(View view) {
        hi0 hi0Var = this.f37752a;
        ArrayList arrayList = hi0Var.f38396b;
        ArrayList arrayList2 = hi0Var.f38397c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            mw0 mw0Var = this.h;
            zn znVar = this.f37753b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f20189id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20042id);
                }
                znVar.presentFragment(new ProfileActivity(bundle, null));
                mw0Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && znVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.tc t10 = new org.telegram.ui.Components.ad(org.telegram.ui.Components.ob.a(mw0Var.getContext()), mw0Var.f40049b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                znVar.f44908n1 = t10;
                t10.f31096j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.rm0 rm0Var = this.f37754c;
            rm0Var.requestLayout();
            this.d.requestLayout();
            rm0Var.getAdapter().l();
            this.f37755e.K(this.f37756f);
        }
    }
}
