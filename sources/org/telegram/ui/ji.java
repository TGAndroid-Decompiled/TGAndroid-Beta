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
public final class ji implements View.OnClickListener {
    public final di0 f37705a;
    public final org.telegram.ui.Components.zl0 f37706b;
    public final LinearLayout f37707c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] f37708e;
    public final yn f37709f;

    public ji(yn ynVar, di0 di0Var, org.telegram.ui.Components.zl0 zl0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f37709f = ynVar;
        this.f37705a = di0Var;
        this.f37706b = zl0Var;
        this.f37707c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f37708e = iArr;
    }

    @Override
    public final void onClick(View view) {
        di0 di0Var = this.f37705a;
        ArrayList arrayList = di0Var.f35783b;
        ArrayList arrayList2 = di0Var.f35784c;
        yn ynVar = this.f37709f;
        if (ynVar.O8 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f20189id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20042id);
                    }
                    ynVar.presentFragment(new ProfileActivity(bundle, null));
                    ynVar.A7(true);
                    return;
                }
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && ynVar.V0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.rc t10 = new org.telegram.ui.Components.yc(org.telegram.ui.Components.mb.a(ynVar.getParentActivity()), ynVar.f43307ca).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                ynVar.l1 = t10;
                t10.f30345j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.zl0 zl0Var = this.f37706b;
            zl0Var.requestLayout();
            this.f37707c.requestLayout();
            zl0Var.getAdapter().l();
            this.d.getSwipeBack().e(this.f37708e[0]);
        }
    }
}
