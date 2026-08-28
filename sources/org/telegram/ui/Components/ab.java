package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.tg1;
public final class ab implements View.OnLayoutChangeListener {
    public final boolean f26744a;
    public final gc f26745b;

    public ab(gc gcVar, boolean z10) {
        this.f26745b = gcVar;
        this.f26744a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        fb fbVar;
        int i17;
        gc gcVar = this.f26745b;
        lb lbVar = gcVar.f28733e;
        lbVar.removeOnLayoutChangeListener(this);
        if (gcVar.f28739l) {
            lbVar.onShow();
            org.telegram.ui.ActionBar.o2 o2Var = gcVar.f28735g;
            boolean z10 = this.f26744a;
            if (z10 && (o2Var instanceof tg1)) {
                o2Var = ((tg1) o2Var).W();
            }
            FrameLayout frameLayout = gcVar.h;
            if (o2Var == null || (fbVar = o2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof fb) {
                        fbVar = (fb) tag;
                    }
                }
                fbVar = null;
            }
            gcVar.f28743p = fbVar;
            if (fbVar == null && o2Var != null) {
                gcVar.f28743p = new fh.y0(o2Var, 7);
            }
            o1.j jVar = gcVar.d;
            if (jVar == null || !jVar.f18794f) {
                fb fbVar2 = gcVar.f28743p;
                if (fbVar2 != null) {
                    i17 = fbVar2.f(gcVar.f28730a);
                } else {
                    i17 = 0;
                }
                gcVar.f28742o = i17;
            }
            fb fbVar3 = gcVar.f28743p;
            if (fbVar3 != null) {
                fbVar3.b(gcVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !gcVar.f28746s) {
                if (lbVar != null && gcVar.f28744q == null) {
                    gcVar.f28744q = lbVar.createTransition();
                }
                lbVar.transitionRunningEnter = true;
                lbVar.delegate = gcVar.f28743p;
                lbVar.invalidate();
                kb kbVar = gcVar.f28744q;
                Objects.requireNonNull(lbVar);
                kbVar.g(lbVar, new wa(lbVar, 1), new fg(this, 15), new dl(2, this, z10));
                return;
            }
            fb fbVar4 = gcVar.f28743p;
            lbVar.delegate = fbVar4;
            if (fbVar4 != null && !z10) {
                fbVar4.c(lbVar.getHeight());
            }
            gcVar.l();
            lbVar.onEnterTransitionStart();
            lbVar.onEnterTransitionEnd();
            if (gcVar.f28748u) {
                gcVar.i(true);
            }
        }
    }
}
