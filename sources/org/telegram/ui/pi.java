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
public final class pi implements View.OnClickListener {
    public final ki0 f38928a;
    public final org.telegram.ui.Components.mm0 f38929b;
    public final LinearLayout f38930c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] e;
    public final fo f38931f;

    public pi(fo foVar, ki0 ki0Var, org.telegram.ui.Components.mm0 mm0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f38931f = foVar;
        this.f38928a = ki0Var;
        this.f38929b = mm0Var;
        this.f38930c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.e = iArr;
    }

    @Override
    public final void onClick(View view) {
        ki0 ki0Var = this.f38928a;
        ArrayList arrayList = ki0Var.f37434b;
        ArrayList arrayList2 = ki0Var.f37435c;
        fo foVar = this.f38931f;
        if (foVar.Q8 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f19063id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f18916id);
                    }
                    foVar.presentFragment(new ProfileActivity(bundle, null));
                    foVar.D7(true);
                    return;
                }
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && foVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.sc t10 = new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(foVar.getParentActivity()), foVar.f35633ea).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                foVar.f35735n1 = t10;
                t10.f28805j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.mm0 mm0Var = this.f38929b;
            mm0Var.requestLayout();
            this.f38930c.requestLayout();
            mm0Var.getAdapter().l();
            this.d.getSwipeBack().e(this.e[0]);
        }
    }
}
