package org.telegram.ui;

import android.view.View;
public final class p81 implements View.OnClickListener {
    public final int f36350a;
    public final a91 f36351b;

    public p81(a91 a91Var, int i10) {
        this.f36350a = i10;
        this.f36351b = a91Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36350a) {
            case 0:
                a91 a91Var = this.f36351b;
                nf.f.s(a91Var.getParentActivity(), a91Var.getMessagesController().premiumManageSubscriptionUrl);
                a91Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                return;
            case 1:
                a91 a91Var2 = this.f36351b;
                a91Var2.getClass();
                a91Var2.presentFragment(new h(3));
                return;
            case 2:
                this.f36351b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                a91 a91Var3 = this.f36351b;
                a91Var3.getClass();
                a91Var3.presentFragment(new zg1(8, null));
                return;
            case 4:
                this.f36351b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                a91.b0(this.f36351b);
                return;
            default:
                a91.d0(this.f36351b);
                return;
        }
    }
}
