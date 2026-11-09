package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class nn implements Runnable {
    public final int f48208a;
    public final rn f48209b;

    public nn(rn rnVar, int i7) {
        this.f48208a = i7;
        this.f48209b = rnVar;
    }

    @Override
    public final void run() {
        int i7 = this.f48208a;
        rn rnVar = this.f48209b;
        switch (i7) {
            case 0:
                rn.a0(rnVar);
                return;
            case 1:
                rn.f0(rnVar);
                return;
            case 2:
                rnVar.f49511b.dismiss();
                rnVar.finishFragment();
                return;
            case 3:
                rnVar.M.setChecked(rnVar.f49539w0.autotranslation);
                return;
            default:
                rnVar.f49516e.setImageDrawable(rnVar.f49531r);
                rnVar.f49512b0.o(2131232047, org.telegram.messenger.id.M0(2131752212, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = rnVar.C0;
                if (user != null) {
                    user.photo = null;
                    rnVar.getMessagesController().X3(rnVar.C0, true, false);
                }
                rnVar.O0 = true;
                if (rnVar.R0 == null) {
                    rnVar.R0 = new org.telegram.ui.Components.ah0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                }
                rnVar.f49512b0.f29574e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                rnVar.f49512b0.f29574e.setAnimation(rnVar.R0);
                return;
        }
    }
}
