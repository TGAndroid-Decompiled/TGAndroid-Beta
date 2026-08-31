package org.telegram.ui;

import android.view.View;
public final class e81 implements View.OnClickListener {
    public final int f36419a;
    public final p81 f36420b;

    public e81(p81 p81Var, int i10) {
        this.f36419a = i10;
        this.f36420b = p81Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36419a) {
            case 0:
                p81 p81Var = this.f36420b;
                af.g.s(p81Var.getParentActivity(), p81Var.getMessagesController().premiumManageSubscriptionUrl);
                p81Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                return;
            case 1:
                p81 p81Var2 = this.f36420b;
                p81Var2.getClass();
                p81Var2.presentFragment(new i(3));
                return;
            case 2:
                this.f36420b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                p81 p81Var3 = this.f36420b;
                p81Var3.getClass();
                p81Var3.presentFragment(new qg1(8, null));
                return;
            case 4:
                this.f36420b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                p81.V(this.f36420b);
                return;
            default:
                p81.Y(this.f36420b);
                return;
        }
    }
}
