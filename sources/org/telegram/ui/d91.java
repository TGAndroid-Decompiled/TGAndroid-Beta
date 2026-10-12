package org.telegram.ui;

import android.view.View;
public final class d91 implements View.OnClickListener {
    public final int f35194a;
    public final o91 f35195b;

    public d91(o91 o91Var, int i10) {
        this.f35194a = i10;
        this.f35195b = o91Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f35194a) {
            case 0:
                o91 o91Var = this.f35195b;
                pf.d.s(o91Var.getParentActivity(), o91Var.getMessagesController().premiumManageSubscriptionUrl);
                o91Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                return;
            case 1:
                o91 o91Var2 = this.f35195b;
                o91Var2.getClass();
                o91Var2.presentFragment(new h(3));
                return;
            case 2:
                this.f35195b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                o91 o91Var3 = this.f35195b;
                o91Var3.getClass();
                o91Var3.presentFragment(new oh1(8, null));
                return;
            case 4:
                this.f35195b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                o91.V(this.f35195b);
                return;
            default:
                o91.Z(this.f35195b);
                return;
        }
    }
}
