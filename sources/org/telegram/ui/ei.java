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
public final class ei implements View.OnClickListener {
    public final sh0 f36544a;
    public final org.telegram.ui.Components.im0 f36545b;
    public final LinearLayout f36546c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] e;
    public final sn f36547f;

    public ei(sn snVar, sh0 sh0Var, org.telegram.ui.Components.im0 im0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f36547f = snVar;
        this.f36544a = sh0Var;
        this.f36545b = im0Var;
        this.f36546c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.e = iArr;
    }

    @Override
    public final void onClick(View view) {
        sh0 sh0Var = this.f36544a;
        ArrayList arrayList = sh0Var.f41110b;
        ArrayList arrayList2 = sh0Var.f41111c;
        sn snVar = this.f36547f;
        if (snVar.Q8 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f20419id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f20272id);
                    }
                    snVar.presentFragment(new ProfileActivity(bundle, null));
                    snVar.D7(true);
                    return;
                }
                return;
            }
            if (SharedConfig.messageSeenHintCount > 0 && snVar.X0.getKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                org.telegram.ui.Components.qc t10 = new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(snVar.getParentActivity()), snVar.f41205ea).t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageSeenTooltipMessage)), null);
                snVar.f41307n1 = t10;
                t10.f29639j = 4000;
                t10.j();
                SharedConfig.updateMessageSeenHintCount(SharedConfig.messageSeenHintCount - 1);
            }
            org.telegram.ui.Components.im0 im0Var = this.f36545b;
            im0Var.requestLayout();
            this.f36546c.requestLayout();
            im0Var.getAdapter().l();
            this.d.getSwipeBack().e(this.e[0]);
        }
    }
}
