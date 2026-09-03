package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
public final class jb implements mb {
    public long f25932a;

    @Override
    public void J(nb nbVar, wa waVar, fg fgVar, gl glVar) {
        nbVar.setInOutOffset(nbVar.getMeasuredHeight());
        glVar.accept(Float.valueOf(nbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nbVar, nb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.f25932a);
        ofFloat.setInterpolator(ft.d);
        ofFloat.addListener(new dg.y2(waVar, fgVar, 13));
        ofFloat.addUpdateListener(new ag.a(12, glVar, nbVar));
        ofFloat.start();
    }

    public boolean a(xe.n nVar) {
        if (nVar.f3975b == this.f25932a && xe.a.c(nVar)) {
            return true;
        }
        return false;
    }

    @Override
    public void b(nb nbVar, wa waVar, ua uaVar, xa xaVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nbVar, nb.IN_OUT_OFFSET_Y2, nbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(ft.f24966c);
        ofFloat.addListener(new dg.y2(waVar, uaVar, 14));
        ofFloat.addUpdateListener(new ag.a(11, xaVar, nbVar));
        ofFloat.start();
    }
}
