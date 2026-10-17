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
public final class nv0 implements View.OnClickListener {
    public final sh0 f39567a;
    public final sn f39568b;
    public final org.telegram.ui.Components.im0 f39569c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.i80 e;
    public final org.telegram.ui.Components.i80 f39570f;
    public final sv0 h;

    public nv0(sv0 sv0Var, sh0 sh0Var, sn snVar, org.telegram.ui.Components.im0 im0Var, LinearLayout linearLayout, org.telegram.ui.Components.i80 i80Var, org.telegram.ui.Components.i80 i80Var2) {
        this.h = sv0Var;
        this.f39567a = sh0Var;
        this.f39568b = snVar;
        this.f39569c = im0Var;
        this.d = linearLayout;
        this.e = i80Var;
        this.f39570f = i80Var2;
    }

    @Override
    public final void onClick(View view) {
        sh0 sh0Var = this.f39567a;
        ArrayList arrayList = sh0Var.f41110b;
        ArrayList arrayList2 = sh0Var.f41111c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            sv0 sv0Var = this.h;
            sn snVar = this.f39568b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f20419id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20272id);
                }
                snVar.presentFragment(new ProfileActivity(bundle, null));
                sv0Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && snVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(sv0Var.getContext()), sv0Var.f41508b).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                snVar.f41307n1 = t10;
                t10.f29639j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.im0 im0Var = this.f39569c;
            im0Var.requestLayout();
            this.d.requestLayout();
            im0Var.getAdapter().l();
            this.e.K(this.f39570f);
        }
    }
}
