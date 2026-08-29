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
public final class ci implements View.OnClickListener {
    public final oh0 f37130a;
    public final org.telegram.ui.Components.jl0 f37131b;
    public final LinearLayout f37132c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] f37133e;
    public final tn f37134f;

    public ci(tn tnVar, oh0 oh0Var, org.telegram.ui.Components.jl0 jl0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f37134f = tnVar;
        this.f37130a = oh0Var;
        this.f37131b = jl0Var;
        this.f37132c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f37133e = iArr;
    }

    @Override
    public final void onClick(View view) {
        oh0 oh0Var = this.f37130a;
        ArrayList arrayList = oh0Var.f41128b;
        ArrayList arrayList2 = oh0Var.f41129c;
        tn tnVar = this.f37134f;
        if (tnVar.M8 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f22539id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f22392id);
                    }
                    tnVar.presentFragment(new ProfileActivity(bundle, null));
                    tnVar.A7(true);
                    return;
                }
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && tnVar.T0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.mc t10 = new org.telegram.ui.Components.tc(org.telegram.ui.Components.hb.a(tnVar.getParentActivity()), tnVar.f42746aa).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                tnVar.f42852j1 = t10;
                t10.f30652j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.jl0 jl0Var = this.f37131b;
            jl0Var.requestLayout();
            this.f37132c.requestLayout();
            jl0Var.getAdapter().l();
            this.d.getSwipeBack().e(this.f37133e[0]);
        }
    }
}
