package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.tg1;
public final class hb implements View.OnLayoutChangeListener {
    public final boolean f26990a;
    public final oc f26991b;

    public hb(oc ocVar, boolean z10) {
        this.f26991b = ocVar;
        this.f26990a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        mb mbVar;
        int i18;
        oc ocVar = this.f26991b;
        sb sbVar = ocVar.e;
        sbVar.removeOnLayoutChangeListener(this);
        if (ocVar.f29205l) {
            sbVar.onShow();
            org.telegram.ui.ActionBar.o2 o2Var = ocVar.f29201g;
            boolean z10 = this.f26990a;
            if (z10 && (o2Var instanceof tg1)) {
                o2Var = ((tg1) o2Var).X();
            }
            FrameLayout frameLayout = ocVar.h;
            if (o2Var == null || (mbVar = o2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof mb) {
                        mbVar = (mb) tag;
                    }
                }
                mbVar = null;
            }
            ocVar.f29209p = mbVar;
            if (mbVar == null && o2Var != null) {
                ocVar.f29209p = new ah.m0(o2Var, 6);
            }
            o1.k kVar = ocVar.d;
            if (kVar == null || !kVar.f17615f) {
                mb mbVar2 = ocVar.f29209p;
                if (mbVar2 != null) {
                    i18 = mbVar2.f(ocVar.f29197a);
                } else {
                    i18 = 0;
                }
                ocVar.f29208o = i18;
            }
            mb mbVar3 = ocVar.f29209p;
            if (mbVar3 != null) {
                mbVar3.b(ocVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !ocVar.f29212s) {
                if (sbVar != null && ocVar.f29210q == null) {
                    ocVar.f29210q = sbVar.createTransition();
                }
                sbVar.transitionRunningEnter = true;
                sbVar.delegate = ocVar.f29209p;
                sbVar.invalidate();
                rb rbVar = ocVar.f29210q;
                Objects.requireNonNull(sbVar);
                rbVar.D0(sbVar, new db(sbVar, 1), new ng(this, 16), new vl(2, this, z10));
                return;
            }
            mb mbVar4 = ocVar.f29209p;
            sbVar.delegate = mbVar4;
            if (mbVar4 != null && !z10) {
                mbVar4.c(sbVar.getHeight());
            }
            ocVar.l();
            sbVar.onEnterTransitionStart();
            sbVar.onEnterTransitionEnd();
            if (ocVar.f29214u) {
                ocVar.i(true);
            }
        }
    }
}
