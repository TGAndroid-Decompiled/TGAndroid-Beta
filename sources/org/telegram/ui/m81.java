package org.telegram.ui;

import android.view.View;
public final class m81 implements View.OnClickListener {
    public final int f38508a;
    public final y81 f38509b;

    public m81(y81 y81Var, int i10) {
        this.f38508a = i10;
        this.f38509b = y81Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38508a) {
            case 0:
                y81 y81Var = this.f38509b;
                nf.f.s(y81Var.getParentActivity(), y81Var.getMessagesController().premiumManageSubscriptionUrl);
                y81Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                return;
            case 1:
                y81 y81Var2 = this.f38509b;
                y81Var2.getClass();
                y81Var2.presentFragment(new h(3));
                return;
            case 2:
                this.f38509b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                y81 y81Var3 = this.f38509b;
                y81Var3.getClass();
                y81Var3.presentFragment(new zg1(8, null));
                return;
            case 4:
                this.f38509b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                y81.X(this.f38509b);
                return;
            default:
                y81.W(this.f38509b);
                return;
        }
    }
}
