package org.telegram.ui;

import android.view.View;
public final class n71 implements View.OnClickListener {
    public final int f39366a;
    public final z71 f39367b;

    public n71(z71 z71Var, int i10) {
        this.f39366a = i10;
        this.f39367b = z71Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39366a) {
            case 0:
                z71 z71Var = this.f39367b;
                pf.d.r(z71Var.getParentActivity(), z71Var.getMessagesController().premiumManageSubscriptionUrl);
                z71Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                return;
            case 1:
                z71 z71Var2 = this.f39367b;
                z71Var2.getClass();
                z71Var2.presentFragment(new h(3));
                return;
            case 2:
                this.f39367b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                z71 z71Var3 = this.f39367b;
                z71Var3.getClass();
                z71Var3.presentFragment(new xf1(8, null));
                return;
            case 4:
                this.f39367b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                z71.V(this.f39367b);
                return;
            default:
                z71.Z(this.f39367b);
                return;
        }
    }
}
