package org.telegram.ui;

import android.view.View;
public final class q71 implements View.OnClickListener {
    public final int f42754a;
    public final d81 f42755b;

    public q71(d81 d81Var, int i10) {
        this.f42754a = i10;
        this.f42755b = d81Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f42754a) {
            case 0:
                d81 d81Var = this.f42755b;
                qf.d.r(d81Var.getParentActivity(), d81Var.getMessagesController().premiumManageSubscriptionUrl);
                d81Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                return;
            case 1:
                d81 d81Var2 = this.f42755b;
                d81Var2.getClass();
                d81Var2.presentFragment(new g(3));
                return;
            case 2:
                this.f42755b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                d81 d81Var3 = this.f42755b;
                d81Var3.getClass();
                d81Var3.presentFragment(new dg1(8, null));
                return;
            case 4:
                this.f42755b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                d81.W(this.f42755b);
                return;
            default:
                d81.Z(this.f42755b);
                return;
        }
    }
}
