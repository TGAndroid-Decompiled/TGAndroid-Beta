package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class oh implements View.OnClickListener {
    public final df0 f48288a;
    public final org.telegram.ui.Components.tj0 f48289b;
    public final LinearLayout f48290c;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout d;
    public final int[] f48291e;
    public final wm f48292f;

    public oh(wm wmVar, df0 df0Var, org.telegram.ui.Components.tj0 tj0Var, LinearLayout linearLayout, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f48292f = wmVar;
        this.f48288a = df0Var;
        this.f48289b = tj0Var;
        this.f48290c = linearLayout;
        this.d = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f48291e = iArr;
    }

    @Override
    public final void onClick(View view) {
        df0 df0Var = this.f48288a;
        ArrayList arrayList = df0Var.f44676b;
        ArrayList arrayList2 = df0Var.f44677c;
        wm wmVar = this.f48292f;
        if (wmVar.f51316f9 != null && !arrayList2.isEmpty()) {
            if (arrayList2.size() == 1 && (arrayList.size() <= 0 || ((Integer) arrayList.get(0)).intValue() <= 0)) {
                TLObject tLObject = (TLObject) arrayList2.get(0);
                if (tLObject != null) {
                    Bundle bundle = new Bundle();
                    if (tLObject instanceof TLRPC.User) {
                        bundle.putLong("user_id", ((TLRPC.User) tLObject).f27150id);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f27001id);
                    }
                    wmVar.presentFragment(new ProfileActivity(bundle, null));
                    wmVar.O7(true);
                    return;
                }
                return;
            }
            if (org.telegram.messenger.az.f21620c1 > 0 && wmVar.m1.getKeyboardHeight() < org.telegram.messenger.g0.L(20.0f)) {
                org.telegram.ui.Components.ac t10 = new org.telegram.ui.Components.fc(org.telegram.ui.Components.wa.a(wmVar.getParentActivity()), wmVar.f51557ya).t(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131748496, null)), null);
                wmVar.C1 = t10;
                t10.f31792j = 4000;
                t10.j();
                org.telegram.messenger.az.S(org.telegram.messenger.az.f21620c1 - 1);
            }
            org.telegram.ui.Components.tj0 tj0Var = this.f48289b;
            tj0Var.requestLayout();
            this.f48290c.requestLayout();
            tj0Var.getAdapter().f();
            this.d.getSwipeBack().e(this.f48291e[0]);
        }
    }
}
