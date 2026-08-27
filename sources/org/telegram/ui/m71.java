package org.telegram.ui;

import android.view.View;

public final class m71 implements View.OnClickListener {

    public final int f40387a;

    public final x71 f40388b;

    public m71(x71 x71Var, int i10) {
        this.f40387a = i10;
        this.f40388b = x71Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40387a) {
            case 0:
                x71 x71Var = this.f40388b;
                we.e.s(x71Var.getParentActivity(), x71Var.getMessagesController().premiumManageSubscriptionUrl);
                x71Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                break;
            case 1:
                x71 x71Var2 = this.f40388b;
                x71Var2.getClass();
                x71Var2.presentFragment(new h(3));
                break;
            case 2:
                this.f40388b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                break;
            case 3:
                x71 x71Var3 = this.f40388b;
                x71Var3.getClass();
                x71Var3.presentFragment(new zf1(8, null));
                break;
            case 4:
                this.f40388b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                break;
            case 5:
                x71.V(this.f40388b);
                break;
            default:
                x71.Y(this.f40388b);
                break;
        }
    }
}
