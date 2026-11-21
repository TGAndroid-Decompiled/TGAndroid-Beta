package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class mn implements Runnable {
    public final int f49940a;
    public final rn f49941b;

    public mn(rn rnVar, int i7) {
        this.f49940a = i7;
        this.f49941b = rnVar;
    }

    @Override
    public final void run() {
        int i7 = this.f49940a;
        rn rnVar = this.f49941b;
        switch (i7) {
            case 0:
                rn.a0(rnVar);
                return;
            case 1:
                rn.f0(rnVar);
                return;
            case 2:
                rnVar.f51641b.dismiss();
                rnVar.finishFragment();
                return;
            case 3:
                rnVar.N.setChecked(rnVar.f51671x0.autotranslation);
                return;
            default:
                rnVar.f51646e.setImageDrawable(rnVar.f51661r);
                rnVar.f51644c0.o(2131232049, org.telegram.messenger.gd.N0(2131752200, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = rnVar.D0;
                if (user != null) {
                    user.photo = null;
                    rnVar.getMessagesController().e4(rnVar.D0, true, false);
                }
                rnVar.P0 = true;
                if (rnVar.S0 == null) {
                    rnVar.S0 = new org.telegram.ui.Components.oh0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                }
                rnVar.f51644c0.f31165e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                rnVar.f51644c0.f31165e.setAnimation(rnVar.S0);
                return;
        }
    }
}
