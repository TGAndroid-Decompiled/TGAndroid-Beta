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
    public final hi0 f33771a;
    public final zn f33772b;
    public final org.telegram.ui.Components.yl0 f33773c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.y70 e;
    public final org.telegram.ui.Components.y70 f33774f;
    public final mw0 h;

    public fw0(mw0 mw0Var, hi0 hi0Var, zn znVar, org.telegram.ui.Components.yl0 yl0Var, LinearLayout linearLayout, org.telegram.ui.Components.y70 y70Var, org.telegram.ui.Components.y70 y70Var2) {
        this.h = mw0Var;
        this.f33771a = hi0Var;
        this.f33772b = znVar;
        this.f33773c = yl0Var;
        this.d = linearLayout;
        this.e = y70Var;
        this.f33774f = y70Var2;
    }

    @Override
    public final void onClick(View view) {
        hi0 hi0Var = this.f33771a;
        ArrayList arrayList = hi0Var.f34237b;
        ArrayList arrayList2 = hi0Var.f34238c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            mw0 mw0Var = this.h;
            zn znVar = this.f33772b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f18490id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f18343id);
                }
                znVar.presentFragment(new ProfileActivity(bundle, null));
                mw0Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && znVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.pc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.kb.a(mw0Var.getContext()), mw0Var.f35850b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                znVar.f40426n1 = t10;
                t10.f27311j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.yl0 yl0Var = this.f33773c;
            yl0Var.requestLayout();
            this.d.requestLayout();
            yl0Var.getAdapter().l();
            this.e.K(this.f33774f);
        }
    }
}
