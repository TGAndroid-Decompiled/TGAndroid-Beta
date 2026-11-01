package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ni implements View.OnClickListener {
    public final pg0 f39912a;
    public final org.telegram.ui.Components.uk0 f39913b;
    public final LinearLayout f39914c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] e;
    public final un f39915f;

    public ni(un unVar, pg0 pg0Var, org.telegram.ui.Components.uk0 uk0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f39915f = unVar;
        this.f39912a = pg0Var;
        this.f39913b = uk0Var;
        this.f39914c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.e = iArr;
    }

    @Override
    public final void onClick(View view) {
        pg0 pg0Var = this.f39912a;
        ArrayList arrayList = pg0Var.f40476b;
        ArrayList arrayList2 = pg0Var.f40477c;
        un unVar = this.f39915f;
        if (unVar.f42051e9 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f19943id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f19794id);
                    }
                    unVar.presentFragment(new ProfileActivity(bundle, null));
                    unVar.M7(true);
                    return;
                }
                return;
            }
            if (org.telegram.messenger.uz.f18508c1 > 0 && unVar.l1.getKeyboardHeight() < org.telegram.messenger.i0.L(20.0f)) {
                org.telegram.ui.Components.wb t10 = new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(unVar.getParentActivity()), unVar.f42288xa).t(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(2131748503, null)), null);
                unVar.B1 = t10;
                t10.f32201j = 4000;
                t10.j();
                org.telegram.messenger.uz.S(org.telegram.messenger.uz.f18508c1 - 1);
            }
            org.telegram.ui.Components.uk0 uk0Var = this.f39913b;
            uk0Var.requestLayout();
            this.f39914c.requestLayout();
            uk0Var.getAdapter().f();
            this.d.getSwipeBack().e(this.e[0]);
        }
    }
}
