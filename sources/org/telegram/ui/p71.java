package org.telegram.ui;

import android.view.View;
public final class p71 implements View.OnClickListener {
    public final int f40390a;
    public final c81 f40391b;

    public p71(c81 c81Var, int i10) {
        this.f40390a = i10;
        this.f40391b = c81Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40390a) {
            case 0:
                c81 c81Var = this.f40391b;
                pf.d.r(c81Var.getParentActivity(), c81Var.getMessagesController().premiumManageSubscriptionUrl);
                c81Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                return;
            case 1:
                c81 c81Var2 = this.f40391b;
                c81Var2.getClass();
                c81Var2.presentFragment(new g(3));
                return;
            case 2:
                this.f40391b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                c81 c81Var3 = this.f40391b;
                c81Var3.getClass();
                c81Var3.presentFragment(new bg1(8, null));
                return;
            case 4:
                this.f40391b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                c81.V(this.f40391b);
                return;
            default:
                c81.Z(this.f40391b);
                return;
        }
    }
}
