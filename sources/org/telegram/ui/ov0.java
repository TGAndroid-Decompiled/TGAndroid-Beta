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
public final class ov0 implements View.OnClickListener {
    public final uh0 f40282a;
    public final sn f40283b;
    public final org.telegram.ui.Components.mm0 f40284c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.j80 e;
    public final org.telegram.ui.Components.j80 f40285f;
    public final uv0 h;

    public ov0(uv0 uv0Var, uh0 uh0Var, sn snVar, org.telegram.ui.Components.mm0 mm0Var, LinearLayout linearLayout, org.telegram.ui.Components.j80 j80Var, org.telegram.ui.Components.j80 j80Var2) {
        this.h = uv0Var;
        this.f40282a = uh0Var;
        this.f40283b = snVar;
        this.f40284c = mm0Var;
        this.d = linearLayout;
        this.e = j80Var;
        this.f40285f = j80Var2;
    }

    @Override
    public final void onClick(View view) {
        uh0 uh0Var = this.f40282a;
        ArrayList arrayList = uh0Var.f42443b;
        ArrayList arrayList2 = uh0Var.f42444c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            uv0 uv0Var = this.h;
            sn snVar = this.f40283b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f20490id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20343id);
                }
                snVar.presentFragment(new ProfileActivity(bundle, null));
                uv0Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && snVar.f41561j1.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(uv0Var.getContext()), uv0Var.f42516b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                snVar.f41763z1 = t10;
                t10.f29832j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.mm0 mm0Var = this.f40284c;
            mm0Var.requestLayout();
            this.d.requestLayout();
            mm0Var.getAdapter().l();
            this.e.K(this.f40285f);
        }
    }
}
