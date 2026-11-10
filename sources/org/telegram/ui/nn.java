package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class nn implements Runnable {
    public final int f48231a;
    public final rn f48232b;

    public nn(rn rnVar, int i7) {
        this.f48231a = i7;
        this.f48232b = rnVar;
    }

    @Override
    public final void run() {
        int i7 = this.f48231a;
        rn rnVar = this.f48232b;
        switch (i7) {
            case 0:
                rn.a0(rnVar);
                return;
            case 1:
                rn.f0(rnVar);
                return;
            case 2:
                rnVar.f49449b.dismiss();
                rnVar.finishFragment();
                return;
            case 3:
                rnVar.M.setChecked(rnVar.f49477w0.autotranslation);
                return;
            default:
                rnVar.f49454e.setImageDrawable(rnVar.f49469r);
                rnVar.f49450b0.o(2131232047, org.telegram.messenger.id.M0(2131752212, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = rnVar.C0;
                if (user != null) {
                    user.photo = null;
                    rnVar.getMessagesController().X3(rnVar.C0, true, false);
                }
                rnVar.O0 = true;
                if (rnVar.R0 == null) {
                    rnVar.R0 = new org.telegram.ui.Components.zg0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                }
                rnVar.f49450b0.f29585e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                rnVar.f49450b0.f29585e.setAnimation(rnVar.R0);
                return;
        }
    }
}
