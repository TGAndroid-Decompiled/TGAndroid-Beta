package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class mn implements Runnable {
    public final int f49944a;
    public final rn f49945b;

    public mn(rn rnVar, int i7) {
        this.f49944a = i7;
        this.f49945b = rnVar;
    }

    @Override
    public final void run() {
        int i7 = this.f49944a;
        rn rnVar = this.f49945b;
        switch (i7) {
            case 0:
                rn.a0(rnVar);
                return;
            case 1:
                rn.f0(rnVar);
                return;
            case 2:
                rnVar.f51645b.dismiss();
                rnVar.finishFragment();
                return;
            case 3:
                rnVar.N.setChecked(rnVar.f51675x0.autotranslation);
                return;
            default:
                rnVar.f51650e.setImageDrawable(rnVar.f51665r);
                rnVar.f51648c0.o(2131232049, org.telegram.messenger.hd.N0(2131752200, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = rnVar.D0;
                if (user != null) {
                    user.photo = null;
                    rnVar.getMessagesController().e4(rnVar.D0, true, false);
                }
                rnVar.P0 = true;
                if (rnVar.S0 == null) {
                    rnVar.S0 = new org.telegram.ui.Components.oh0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                }
                rnVar.f51648c0.f31168e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                rnVar.f51648c0.f31168e.setAnimation(rnVar.S0);
                return;
        }
    }
}
