package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ho implements Runnable {
    public final int f37843a;
    public final oo f37844b;

    public ho(oo ooVar, int i10) {
        this.f37843a = i10;
        this.f37844b = ooVar;
    }

    @Override
    public final void run() {
        int i10 = this.f37843a;
        oo ooVar = this.f37844b;
        switch (i10) {
            case 0:
                oo.a0(ooVar);
                return;
            case 1:
                oo.f0(ooVar);
                return;
            case 2:
                ooVar.f40205b.dismiss();
                ooVar.finishFragment();
                return;
            case 3:
                ooVar.M.setChecked(ooVar.f40232w0.autotranslation);
                return;
            default:
                ooVar.e.setImageDrawable(ooVar.f40224r);
                ooVar.f40206b0.o(2131232046, org.telegram.messenger.dd.L0(2131752212, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = ooVar.C0;
                if (user != null) {
                    user.photo = null;
                    ooVar.getMessagesController().U3(ooVar.C0, true, false);
                }
                ooVar.O0 = true;
                if (ooVar.R0 == null) {
                    ooVar.R0 = new org.telegram.ui.Components.ci0(2131623965, org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f), false, null);
                }
                ooVar.f40206b0.e.setTranslationX(-org.telegram.messenger.i0.L(8.0f));
                ooVar.f40206b0.e.setAnimation(ooVar.R0);
                return;
        }
    }
}
