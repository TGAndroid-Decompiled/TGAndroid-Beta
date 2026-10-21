package org.telegram.ui;

import android.view.View;
public final class l71 implements View.OnClickListener {
    public final int f38835a;
    public final x71 f38836b;

    public l71(x71 x71Var, int i10) {
        this.f38835a = i10;
        this.f38836b = x71Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38835a) {
            case 0:
                x71 x71Var = this.f38836b;
                pf.d.r(x71Var.getParentActivity(), x71Var.getMessagesController().premiumManageSubscriptionUrl);
                x71Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                return;
            case 1:
                x71 x71Var2 = this.f38836b;
                x71Var2.getClass();
                x71Var2.presentFragment(new h(3));
                return;
            case 2:
                this.f38836b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                x71 x71Var3 = this.f38836b;
                x71Var3.getClass();
                x71Var3.presentFragment(new vf1(8, null));
                return;
            case 4:
                this.f38836b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                x71.V(this.f38836b);
                return;
            default:
                x71.Z(this.f38836b);
                return;
        }
    }
}
