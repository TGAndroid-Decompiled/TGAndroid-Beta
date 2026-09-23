package org.telegram.ui;

import android.view.View;
public final class l81 implements View.OnClickListener {
    public final int f34883a;
    public final x81 f34884b;

    public l81(x81 x81Var, int i10) {
        this.f34883a = i10;
        this.f34884b = x81Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f34883a) {
            case 0:
                x81 x81Var = this.f34884b;
                nf.f.s(x81Var.getParentActivity(), x81Var.getMessagesController().premiumManageSubscriptionUrl);
                x81Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                return;
            case 1:
                x81 x81Var2 = this.f34884b;
                x81Var2.getClass();
                x81Var2.presentFragment(new h(3));
                return;
            case 2:
                this.f34884b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                x81 x81Var3 = this.f34884b;
                x81Var3.getClass();
                x81Var3.presentFragment(new zg1(8, null));
                return;
            case 4:
                this.f34884b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                x81.V(this.f34884b);
                return;
            default:
                x81.Z(this.f34884b);
                return;
        }
    }
}
