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
public final class gi implements View.OnClickListener {
    public final th0 f39621a;
    public final org.telegram.ui.Components.nm0 f39622b;
    public final LinearLayout f39623c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] e;
    public final wn f39624f;

    public gi(wn wnVar, th0 th0Var, org.telegram.ui.Components.nm0 nm0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f39624f = wnVar;
        this.f39621a = th0Var;
        this.f39622b = nm0Var;
        this.f39623c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.e = iArr;
    }

    @Override
    public final void onClick(View view) {
        th0 th0Var = this.f39621a;
        ArrayList arrayList = th0Var.f43647b;
        ArrayList arrayList2 = th0Var.f43648c;
        wn wnVar = this.f39624f;
        if (wnVar.f45134g9 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f22177id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f22028id);
                    }
                    wnVar.presentFragment(new ProfileActivity(bundle, null));
                    wnVar.J7(true);
                    return;
                }
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && wnVar.f45163j1.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(wnVar.getParentActivity()), wnVar.f45309ua).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                wnVar.f45365z1 = t10;
                t10.f31861j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.nm0 nm0Var = this.f39622b;
            nm0Var.requestLayout();
            this.f39623c.requestLayout();
            nm0Var.getAdapter().l();
            this.d.getSwipeBack().e(this.e[0]);
        }
    }
}
