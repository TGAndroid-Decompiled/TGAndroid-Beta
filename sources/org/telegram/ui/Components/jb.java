package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
public final class jb implements mb {
    public long f25949a;

    public boolean a(ye.m mVar) {
        if (mVar.f3995b == this.f25949a && ye.a.c(mVar)) {
            return true;
        }
        return false;
    }

    @Override
    public void c(nb nbVar, wa waVar, ua uaVar, xa xaVar) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nbVar, nb.IN_OUT_OFFSET_Y2, nbVar.getHeight());
        ofFloat.setDuration(175L);
        ofFloat.setInterpolator(gt.f25247c);
        ofFloat.addListener(new dg.y2(waVar, uaVar, 14));
        ofFloat.addUpdateListener(new ag.a(11, xaVar, nbVar));
        ofFloat.start();
    }

    @Override
    public void v(nb nbVar, wa waVar, fg fgVar, gl glVar) {
        nbVar.setInOutOffset(nbVar.getMeasuredHeight());
        glVar.accept(Float.valueOf(nbVar.getTranslationY()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nbVar, nb.IN_OUT_OFFSET_Y2, 0.0f);
        ofFloat.setDuration(this.f25949a);
        ofFloat.setInterpolator(gt.d);
        ofFloat.addListener(new dg.y2(waVar, fgVar, 13));
        ofFloat.addUpdateListener(new ag.a(12, glVar, nbVar));
        ofFloat.start();
    }
}
