package org.telegram.ui;

import android.view.View;
public final class k81 implements View.OnClickListener {
    public final int f38207a;
    public final v81 f38208b;

    public k81(v81 v81Var, int i10) {
        this.f38207a = i10;
        this.f38208b = v81Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38207a) {
            case 0:
                v81 v81Var = this.f38208b;
                af.g.s(v81Var.getParentActivity(), v81Var.getMessagesController().premiumManageSubscriptionUrl);
                v81Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                return;
            case 1:
                v81 v81Var2 = this.f38208b;
                v81Var2.getClass();
                v81Var2.presentFragment(new i(3));
                return;
            case 2:
                this.f38208b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                v81 v81Var3 = this.f38208b;
                v81Var3.getClass();
                v81Var3.presentFragment(new vg1(8, null));
                return;
            case 4:
                this.f38208b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                v81.V(this.f38208b);
                return;
            default:
                v81.Y(this.f38208b);
                return;
        }
    }
}
