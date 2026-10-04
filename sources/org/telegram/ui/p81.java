package org.telegram.ui;

import android.view.View;
public final class p81 implements View.OnClickListener {
    public final int f39369a;
    public final a91 f39370b;

    public p81(a91 a91Var, int i10) {
        this.f39369a = i10;
        this.f39370b = a91Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39369a) {
            case 0:
                a91 a91Var = this.f39370b;
                nf.f.s(a91Var.getParentActivity(), a91Var.getMessagesController().premiumManageSubscriptionUrl);
                a91Var.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                return;
            case 1:
                a91 a91Var2 = this.f39370b;
                a91Var2.getClass();
                a91Var2.presentFragment(new h(3));
                return;
            case 2:
                this.f39370b.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                return;
            case 3:
                a91 a91Var3 = this.f39370b;
                a91Var3.getClass();
                a91Var3.presentFragment(new bh1(8, null));
                return;
            case 4:
                this.f39370b.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                return;
            case 5:
                a91.Y(this.f39370b);
                return;
            default:
                a91.b0(this.f39370b);
                return;
        }
    }
}
