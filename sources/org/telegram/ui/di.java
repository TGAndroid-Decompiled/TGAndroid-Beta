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
public final class di implements View.OnClickListener {
    public final rh0 f38888a;
    public final org.telegram.ui.Components.mm0 f38889b;
    public final LinearLayout f38890c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] e;
    public final un f38891f;

    public di(un unVar, rh0 rh0Var, org.telegram.ui.Components.mm0 mm0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f38891f = unVar;
        this.f38888a = rh0Var;
        this.f38889b = mm0Var;
        this.f38890c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.e = iArr;
    }

    @Override
    public final void onClick(View view) {
        rh0 rh0Var = this.f38888a;
        ArrayList arrayList = rh0Var.f43159b;
        ArrayList arrayList2 = rh0Var.f43160c;
        un unVar = this.f38891f;
        if (unVar.f44213c9 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f22174id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f22027id);
                    }
                    unVar.presentFragment(new ProfileActivity(bundle, null));
                    unVar.H7(true);
                    return;
                }
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && unVar.f44292j1.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(unVar.getParentActivity()), unVar.f44385qa).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                unVar.f44494z1 = t10;
                t10.f31887j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.mm0 mm0Var = this.f38889b;
            mm0Var.requestLayout();
            this.f38890c.requestLayout();
            mm0Var.getAdapter().l();
            this.d.getSwipeBack().e(this.e[0]);
        }
    }
}
