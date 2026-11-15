package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ln implements Runnable {
    public final int f49009a;
    public final qn f49010b;

    public ln(qn qnVar, int i7) {
        this.f49009a = i7;
        this.f49010b = qnVar;
    }

    @Override
    public final void run() {
        int i7 = this.f49009a;
        qn qnVar = this.f49010b;
        switch (i7) {
            case 0:
                qn.a0(qnVar);
                return;
            case 1:
                qn.f0(qnVar);
                return;
            case 2:
                qnVar.f50663b.dismiss();
                qnVar.finishFragment();
                return;
            case 3:
                qnVar.N.setChecked(qnVar.f50693x0.autotranslation);
                return;
            default:
                qnVar.f50668e.setImageDrawable(qnVar.f50683r);
                qnVar.f50666c0.o(2131232048, org.telegram.messenger.hd.M0(2131752212, "ChatSetPhotoOrVideo"), true);
                TLRPC.User user = qnVar.D0;
                if (user != null) {
                    user.photo = null;
                    qnVar.getMessagesController().X3(qnVar.D0, true, false);
                }
                qnVar.P0 = true;
                if (qnVar.S0 == null) {
                    qnVar.S0 = new org.telegram.ui.Components.ch0(2131623965, org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f), false, null);
                }
                qnVar.f50666c0.f30656e.setTranslationX(-org.telegram.messenger.g0.L(8.0f));
                qnVar.f50666c0.f30656e.setAnimation(qnVar.S0);
                return;
        }
    }
}
