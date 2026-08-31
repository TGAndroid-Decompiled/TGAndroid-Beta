package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
public final class jb implements mb {
    public long f28091a;

    @Override
    public void A(nb nbVar, wa waVar, fg fgVar, il ilVar) {
        nbVar.setInOutOffset(nbVar.getMeasuredHeight());
        ilVar.accept(Float.valueOf(nbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nbVar, nb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.f28091a);
        ofFloat.setInterpolator(jt.d);
        ofFloat.addListener(new eg.w2(waVar, fgVar, 13));
        ofFloat.addUpdateListener(new bg.a(12, ilVar, nbVar));
        ofFloat.start();
    }

    public boolean a(ye.m mVar) {
        if (mVar.f4045b == this.f28091a && ye.a.c(mVar)) {
            return true;
        }
        return false;
    }

    @Override
    public void c(nb nbVar, wa waVar, ua uaVar, xa xaVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nbVar, nb.IN_OUT_OFFSET_Y2, nbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(jt.f28198c);
        ofFloat.addListener(new eg.w2(waVar, uaVar, 14));
        ofFloat.addUpdateListener(new bg.a(11, xaVar, nbVar));
        ofFloat.start();
    }
}
