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
    public final hi0 f34199a;
    public final zn f34200b;
    public final org.telegram.ui.Components.yl0 f34201c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.y70 e;
    public final org.telegram.ui.Components.y70 f34202f;
    public final me1 h;

    public he1(me1 me1Var, hi0 hi0Var, zn znVar, org.telegram.ui.Components.yl0 yl0Var, LinearLayout linearLayout, org.telegram.ui.Components.y70 y70Var, org.telegram.ui.Components.y70 y70Var2) {
        this.h = me1Var;
        this.f34199a = hi0Var;
        this.f34200b = znVar;
        this.f34201c = yl0Var;
        this.d = linearLayout;
        this.e = y70Var;
        this.f34202f = y70Var2;
    }

    @Override
    public final void onClick(View view) {
        hi0 hi0Var = this.f34199a;
        ArrayList arrayList = hi0Var.f34237b;
        ArrayList arrayList2 = hi0Var.f34238c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            me1 me1Var = this.h;
            zn znVar = this.f34200b;
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
                me1Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && znVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.pc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.kb.a(me1Var.getContext()), me1Var.f35719a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                znVar.f40426n1 = t10;
                t10.f27311j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.yl0 yl0Var = this.f34201c;
            yl0Var.requestLayout();
            this.d.requestLayout();
            yl0Var.getAdapter().l();
            this.e.K(this.f34202f);
        }
    }
}
