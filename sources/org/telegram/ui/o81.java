package org.telegram.ui;

import android.view.View;
public final class o81 implements View.OnClickListener {
    public final int f36057a;
    public final z81 f36058b;

    public o81(z81 z81Var, int i10) {
        this.f36057a = i10;
        this.f36058b = z81Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36057a) {
            case 0:
                z81 z81Var = this.f36058b;
                nf.f.s(z81Var.getParentActivity(), z81Var.getMessagesController().premiumManageSubscriptionUrl);
                z81Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                return;
            case 1:
                z81 z81Var2 = this.f36058b;
                z81Var2.getClass();
                z81Var2.presentFragment(new h(3));
                return;
            case 2:
                this.f36058b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                z81 z81Var3 = this.f36058b;
                z81Var3.getClass();
                z81Var3.presentFragment(new zg1(8, null));
                return;
            case 4:
                this.f36058b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                z81.V(this.f36058b);
                return;
            default:
                z81.Z(this.f36058b);
                return;
        }
    }
}
