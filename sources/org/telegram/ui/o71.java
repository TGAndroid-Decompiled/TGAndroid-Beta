package org.telegram.ui;

import android.view.View;
public final class o71 implements View.OnClickListener {
    public final int f40095a;
    public final b81 f40096b;

    public o71(b81 b81Var, int i10) {
        this.f40095a = i10;
        this.f40096b = b81Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40095a) {
            case 0:
                b81 b81Var = this.f40096b;
                pf.d.r(b81Var.getParentActivity(), b81Var.getMessagesController().premiumManageSubscriptionUrl);
                b81Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                return;
            case 1:
                b81 b81Var2 = this.f40096b;
                b81Var2.getClass();
                b81Var2.presentFragment(new g(3));
                return;
            case 2:
                this.f40096b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                b81 b81Var3 = this.f40096b;
                b81Var3.getClass();
                b81Var3.presentFragment(new ag1(8, null));
                return;
            case 4:
                this.f40096b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                b81.V(this.f40096b);
                return;
            default:
                b81.Z(this.f40096b);
                return;
        }
    }
}
