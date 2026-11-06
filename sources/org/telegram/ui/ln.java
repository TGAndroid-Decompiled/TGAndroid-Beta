package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ln implements Runnable {
    public final int f47561a;
    public final pn f47562b;

    public ln(pn pnVar, int i7) {
        this.f47561a = i7;
        this.f47562b = pnVar;
    }

    @Override
    public final void run() {
        int i7 = this.f47561a;
        pn pnVar = this.f47562b;
        switch (i7) {
            case 0:
                pn.a0(pnVar);
                return;
            case 1:
                pn.f0(pnVar);
                return;
            case 2:
                pnVar.f48858b.dismiss();
                pnVar.finishFragment();
                return;
            case 3:
                pnVar.M.setChecked(pnVar.f48886w0.autotranslation);
                return;
            default:
                pnVar.f48863e.setImageDrawable(pnVar.f48878r);
                pnVar.f48859b0.o(2131232047, org.telegram.messenger.hd.M0(2131752212, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = pnVar.C0;
                if (user != null) {
                    user.photo = null;
                    pnVar.getMessagesController().X3(pnVar.C0, true, false);
                }
                pnVar.O0 = true;
                if (pnVar.R0 == null) {
                    pnVar.R0 = new org.telegram.ui.Components.zg0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                }
                pnVar.f48859b0.f29567e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                pnVar.f48859b0.f29567e.setAnimation(pnVar.R0);
                return;
        }
    }
}
