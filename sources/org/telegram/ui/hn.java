package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class hn implements Runnable {
    public final int f45946a;
    public final ln f45947b;

    public hn(ln lnVar, int i3) {
        this.f45946a = i3;
        this.f45947b = lnVar;
    }

    @Override
    public final void run() {
        int i3 = this.f45946a;
        ln lnVar = this.f45947b;
        switch (i3) {
            case 0:
                ln.a0(lnVar);
                return;
            case 1:
                ln.f0(lnVar);
                return;
            case 2:
                lnVar.f47366b.dismiss();
                lnVar.finishFragment();
                return;
            case 3:
                lnVar.N.setChecked(lnVar.f47396x0.autotranslation);
                return;
            default:
                lnVar.f47371e.setImageDrawable(lnVar.f47386r);
                lnVar.f47369c0.o(2131232047, org.telegram.messenger.bd.M0(2131752212, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = lnVar.D0;
                if (user != null) {
                    user.photo = null;
                    lnVar.getMessagesController().X3(lnVar.D0, true, false);
                }
                lnVar.P0 = true;
                if (lnVar.S0 == null) {
                    lnVar.S0 = new org.telegram.ui.Components.ch0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                }
                lnVar.f47369c0.f29595e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                lnVar.f47369c0.f29595e.setAnimation(lnVar.S0);
                return;
        }
    }
}
