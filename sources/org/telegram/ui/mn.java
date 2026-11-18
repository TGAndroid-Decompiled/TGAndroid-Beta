package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class mn implements Runnable {
    public final int f49925a;
    public final rn f49926b;

    public mn(rn rnVar, int i7) {
        this.f49925a = i7;
        this.f49926b = rnVar;
    }

    @Override
    public final void run() {
        int i7 = this.f49925a;
        rn rnVar = this.f49926b;
        switch (i7) {
            case 0:
                rn.a0(rnVar);
                return;
            case 1:
                rn.f0(rnVar);
                return;
            case 2:
                rnVar.f51677b.dismiss();
                rnVar.finishFragment();
                return;
            case 3:
                rnVar.N.setChecked(rnVar.f51707x0.autotranslation);
                return;
            default:
                rnVar.f51682e.setImageDrawable(rnVar.f51697r);
                rnVar.f51680c0.o(2131232049, org.telegram.messenger.gd.M0(2131752201, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = rnVar.D0;
                if (user != null) {
                    user.photo = null;
                    rnVar.getMessagesController().e4(rnVar.D0, true, false);
                }
                rnVar.P0 = true;
                if (rnVar.S0 == null) {
                    rnVar.S0 = new org.telegram.ui.Components.mh0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                }
                rnVar.f51680c0.f31082e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                rnVar.f51680c0.f31082e.setAnimation(rnVar.S0);
                return;
        }
    }
}
