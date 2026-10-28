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
public final class fd1 implements View.OnClickListener {
    public final th0 f39334a;
    public final wn f39335b;
    public final org.telegram.ui.Components.nm0 f39336c;
    public final LinearLayout d;
    public final org.telegram.ui.Components.l80 e;
    public final org.telegram.ui.Components.l80 f39337f;
    public final kd1 h;

    public fd1(kd1 kd1Var, th0 th0Var, wn wnVar, org.telegram.ui.Components.nm0 nm0Var, LinearLayout linearLayout, org.telegram.ui.Components.l80 l80Var, org.telegram.ui.Components.l80 l80Var2) {
        this.h = kd1Var;
        this.f39334a = th0Var;
        this.f39335b = wnVar;
        this.f39336c = nm0Var;
        this.d = linearLayout;
        this.e = l80Var;
        this.f39337f = l80Var2;
    }

    @Override
    public final void onClick(View view) {
        th0 th0Var = this.f39334a;
        ArrayList arrayList = th0Var.f43647b;
        ArrayList arrayList2 = th0Var.f43648c;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            kd1 kd1Var = this.h;
            wn wnVar = this.f39335b;
            if (size == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject == null) {
                    return;
                }
                Bundle bundle = new Bundle();
                if (tLObject instanceof TLRPC.User) {
                    bundle.putLong("user_id", ((TLRPC.User) tLObject).f22177id);
                } else if (tLObject instanceof TLRPC.Chat) {
                    bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f22028id);
                }
                wnVar.presentFragment(new ProfileActivity(bundle, null));
                kd1Var.c(false);
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && wnVar.f45163j1.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(kd1Var.getContext()), kd1Var.f40738a).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                wnVar.f45365z1 = t10;
                t10.f31861j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.nm0 nm0Var = this.f39336c;
            nm0Var.requestLayout();
            this.d.requestLayout();
            nm0Var.getAdapter().l();
            this.e.K(this.f39337f);
        }
    }
}
