package org.telegram.ui;

import android.view.View;
public final class l81 implements View.OnClickListener {
    public final int f35692a;
    public final w81 f35693b;

    public l81(w81 w81Var, int i10) {
        this.f35692a = i10;
        this.f35693b = w81Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35692a) {
            case 0:
                w81 w81Var = this.f35693b;
                ze.d.s(w81Var.getParentActivity(), w81Var.getMessagesController().premiumManageSubscriptionUrl);
                w81Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                return;
            case 1:
                w81 w81Var2 = this.f35693b;
                w81Var2.getClass();
                w81Var2.presentFragment(new i(3));
                return;
            case 2:
                this.f35693b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                w81 w81Var3 = this.f35693b;
                w81Var3.getClass();
                w81Var3.presentFragment(new wg1(8, null));
                return;
            case 4:
                this.f35693b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                w81.V(this.f35693b);
                return;
            default:
                w81.Y(this.f35693b);
                return;
        }
    }
}
