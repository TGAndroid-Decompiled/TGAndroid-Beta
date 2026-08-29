package org.telegram.ui;

import android.view.View;
public final class q71 implements View.OnClickListener {
    public final int f41560a;
    public final b81 f41561b;

    public q71(b81 b81Var, int i10) {
        this.f41560a = i10;
        this.f41561b = b81Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f41560a) {
            case 0:
                b81 b81Var = this.f41561b;
                ye.d.s(b81Var.getParentActivity(), b81Var.getMessagesController().premiumManageSubscriptionUrl);
                b81Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                return;
            case 1:
                b81 b81Var2 = this.f41561b;
                b81Var2.getClass();
                b81Var2.presentFragment(new i(3));
                return;
            case 2:
                this.f41561b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                b81 b81Var3 = this.f41561b;
                b81Var3.getClass();
                b81Var3.presentFragment(new cg1(8, null));
                return;
            case 4:
                this.f41561b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                b81.V(this.f41561b);
                return;
            default:
                b81.Y(this.f41561b);
                return;
        }
    }
}
