package org.telegram.ui;

import android.view.View;
public final class d81 implements View.OnClickListener {
    public final int f33532a;
    public final o81 f33533b;

    public d81(o81 o81Var, int i10) {
        this.f33532a = i10;
        this.f33533b = o81Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33532a) {
            case 0:
                o81 o81Var = this.f33533b;
                af.g.s(o81Var.getParentActivity(), o81Var.getMessagesController().premiumManageSubscriptionUrl);
                o81Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                return;
            case 1:
                o81 o81Var2 = this.f33533b;
                o81Var2.getClass();
                o81Var2.presentFragment(new i(3));
                return;
            case 2:
                this.f33533b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                o81 o81Var3 = this.f33533b;
                o81Var3.getClass();
                o81Var3.presentFragment(new og1(8, null));
                return;
            case 4:
                this.f33533b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                o81.V(this.f33533b);
                return;
            default:
                o81.Y(this.f33533b);
                return;
        }
    }
}
