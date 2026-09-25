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
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ii implements View.OnClickListener {
    public final zh0 f34528a;
    public final org.telegram.ui.Components.wl0 f34529b;
    public final LinearLayout f34530c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] e;
    public final wn f34531f;

    public ii(wn wnVar, zh0 zh0Var, org.telegram.ui.Components.wl0 wl0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f34531f = wnVar;
        this.f34528a = zh0Var;
        this.f34529b = wl0Var;
        this.f34530c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.e = iArr;
    }

    @Override
    public final void onClick(View view) {
        zh0 zh0Var = this.f34528a;
        ArrayList arrayList = zh0Var.f40495b;
        ArrayList arrayList2 = zh0Var.f40496c;
        wn wnVar = this.f34531f;
        if (wnVar.Q8 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f18483id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f18336id);
                    }
                    wnVar.presentFragment(new ProfileActivity(bundle, null));
                    wnVar.A7(true);
                    return;
                }
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && wnVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(wnVar.getParentActivity()), wnVar.f39470ea).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                wnVar.f39571n1 = t10;
                t10.f27578j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.wl0 wl0Var = this.f34529b;
            wl0Var.requestLayout();
            this.f34530c.requestLayout();
            wl0Var.getAdapter().l();
            this.d.getSwipeBack().e(this.e[0]);
        }
    }
}
