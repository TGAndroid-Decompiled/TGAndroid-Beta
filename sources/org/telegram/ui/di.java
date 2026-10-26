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
    public final rh0 f38891a;
    public final org.telegram.ui.Components.mm0 f38892b;
    public final LinearLayout f38893c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] e;
    public final un f38894f;

    public di(un unVar, rh0 rh0Var, org.telegram.ui.Components.mm0 mm0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f38894f = unVar;
        this.f38891a = rh0Var;
        this.f38892b = mm0Var;
        this.f38893c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.e = iArr;
    }

    @Override
    public final void onClick(View view) {
        rh0 rh0Var = this.f38891a;
        ArrayList arrayList = rh0Var.f43162b;
        ArrayList arrayList2 = rh0Var.f43163c;
        un unVar = this.f38894f;
        if (unVar.f44216c9 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f22176id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f22027id);
                    }
                    unVar.presentFragment(new ProfileActivity(bundle, null));
                    unVar.H7(true);
                    return;
                }
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && unVar.f44295j1.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(unVar.getParentActivity()), unVar.f44388qa).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                unVar.f44497z1 = t10;
                t10.f31889j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.mm0 mm0Var = this.f38892b;
            mm0Var.requestLayout();
            this.f38893c.requestLayout();
            mm0Var.getAdapter().l();
            this.d.getSwipeBack().e(this.e[0]);
        }
    }
}
