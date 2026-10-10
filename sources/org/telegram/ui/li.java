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
public final class li implements View.OnClickListener {
    public final hi0 f39629a;
    public final org.telegram.ui.Components.rm0 f39630b;
    public final LinearLayout f39631c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] f39632e;
    public final zn f39633f;

    public li(zn znVar, hi0 hi0Var, org.telegram.ui.Components.rm0 rm0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f39633f = znVar;
        this.f39629a = hi0Var;
        this.f39630b = rm0Var;
        this.f39631c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f39632e = iArr;
    }

    @Override
    public final void onClick(View view) {
        hi0 hi0Var = this.f39629a;
        ArrayList arrayList = hi0Var.f38396b;
        ArrayList arrayList2 = hi0Var.f38397c;
        zn znVar = this.f39633f;
        if (znVar.Q8 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f20189id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20042id);
                    }
                    znVar.presentFragment(new ProfileActivity(bundle, null));
                    znVar.D7(true);
                    return;
                }
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && znVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.tc t10 = new org.telegram.ui.Components.ad(org.telegram.ui.Components.ob.a(znVar.getParentActivity()), znVar.f44807ea).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                znVar.f44908n1 = t10;
                t10.f31096j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.rm0 rm0Var = this.f39630b;
            rm0Var.requestLayout();
            this.f39631c.requestLayout();
            rm0Var.getAdapter().l();
            this.d.getSwipeBack().e(this.f39632e[0]);
        }
    }
}
