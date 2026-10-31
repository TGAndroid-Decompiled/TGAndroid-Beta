package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class ni implements View.OnClickListener {
    public final rg0 f39947a;
    public final org.telegram.ui.Components.tk0 f39948b;
    public final LinearLayout f39949c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] e;
    public final un f39950f;

    public ni(un unVar, rg0 rg0Var, org.telegram.ui.Components.tk0 tk0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f39950f = unVar;
        this.f39947a = rg0Var;
        this.f39948b = tk0Var;
        this.f39949c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.e = iArr;
    }

    @Override
    public final void onClick(View view) {
        rg0 rg0Var = this.f39947a;
        ArrayList arrayList = rg0Var.f41222b;
        ArrayList arrayList2 = rg0Var.f41223c;
        un unVar = this.f39950f;
        if (unVar.f42240e9 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f19942id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f19793id);
                    }
                    unVar.presentFragment(new ProfileActivity(bundle, null));
                    unVar.I7(true);
                    return;
                }
                return;
            }
            if (org.telegram.messenger.tz.f18139c1 > 0 && unVar.l1.getKeyboardHeight() < org.telegram.messenger.i0.L(20.0f)) {
                org.telegram.ui.Components.wb t10 = new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(unVar.getParentActivity()), unVar.f42477xa).t(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131748503, null)), null);
                unVar.B1 = t10;
                t10.f32135j = 4000;
                t10.j();
                org.telegram.messenger.tz.S(org.telegram.messenger.tz.f18139c1 - 1);
            }
            org.telegram.ui.Components.tk0 tk0Var = this.f39948b;
            tk0Var.requestLayout();
            this.f39949c.requestLayout();
            tk0Var.getAdapter().f();
            this.d.getSwipeBack().e(this.e[0]);
        }
    }
}
