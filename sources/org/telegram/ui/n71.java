package org.telegram.ui;

import android.view.View;
public final class n71 implements View.OnClickListener {
    public final int f40609a;
    public final z71 f40610b;

    public n71(z71 z71Var, int i9) {
        this.f40609a = i9;
        this.f40610b = z71Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40609a) {
            case 0:
                z71 z71Var = this.f40610b;
                ve.e.s(z71Var.getParentActivity(), z71Var.getMessagesController().premiumManageSubscriptionUrl);
                z71Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                return;
            case 1:
                z71 z71Var2 = this.f40610b;
                z71Var2.getClass();
                z71Var2.presentFragment(new h(3));
                return;
            case 2:
                this.f40610b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                z71 z71Var3 = this.f40610b;
                z71Var3.getClass();
                z71Var3.presentFragment(new ag1(8, null));
                return;
            case 4:
                this.f40610b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                z71.U(this.f40610b);
                return;
            default:
                z71.X(this.f40610b);
                return;
        }
    }
}
