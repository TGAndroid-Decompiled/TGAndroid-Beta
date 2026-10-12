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
    public final li0 f39232a;
    public final org.telegram.ui.Components.mm0 f39233b;
    public final LinearLayout f39234c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] e;
    public final fo f39235f;

    public pi(fo foVar, li0 li0Var, org.telegram.ui.Components.mm0 mm0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f39235f = foVar;
        this.f39232a = li0Var;
        this.f39233b = mm0Var;
        this.f39234c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.e = iArr;
    }

    @Override
    public final void onClick(View view) {
        li0 li0Var = this.f39232a;
        ArrayList arrayList = li0Var.f38020b;
        ArrayList arrayList2 = li0Var.f38021c;
        fo foVar = this.f39235f;
        if (foVar.Q8 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f19363id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f19216id);
                    }
                    foVar.presentFragment(new ProfileActivity(bundle, null));
                    foVar.D7(true);
                    return;
                }
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && foVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.sc t10 = new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(foVar.getParentActivity()), foVar.f35932ea).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                foVar.f36034n1 = t10;
                t10.f29102j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.mm0 mm0Var = this.f39233b;
            mm0Var.requestLayout();
            this.f39234c.requestLayout();
            mm0Var.getAdapter().l();
            this.d.getSwipeBack().e(this.e[0]);
        }
    }
}
