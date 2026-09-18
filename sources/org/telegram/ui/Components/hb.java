package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ai1;
public final class hb implements View.OnLayoutChangeListener {
    public final boolean f24623a;
    public final oc f24624b;

    public hb(oc ocVar, boolean z10) {
        this.f24624b = ocVar;
        this.f24623a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        mb mbVar;
        int i18;
        oc ocVar = this.f24624b;
        sb sbVar = ocVar.e;
        sbVar.removeOnLayoutChangeListener(this);
        if (ocVar.f26707l) {
            sbVar.onShow();
            org.telegram.ui.ActionBar.o2 o2Var = ocVar.f26703g;
            boolean z10 = this.f24623a;
            if (z10 && (o2Var instanceof ai1)) {
                o2Var = ((ai1) o2Var).X();
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
            ocVar.f26711p = mbVar;
            if (mbVar == null && o2Var != null) {
                ocVar.f26711p = new ai.w4(o2Var, 5);
            }
            o1.k kVar = ocVar.d;
            if (kVar == null || !kVar.f15354f) {
                mb mbVar2 = ocVar.f26711p;
                if (mbVar2 != null) {
                    i18 = mbVar2.f(ocVar.f26699a);
                } else {
                    i18 = 0;
                }
                ocVar.f26710o = i18;
            }
            mb mbVar3 = ocVar.f26711p;
            if (mbVar3 != null) {
                mbVar3.b(ocVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !ocVar.f26714s) {
                if (sbVar != null && ocVar.f26712q == null) {
                    ocVar.f26712q = sbVar.createTransition();
                }
                sbVar.transitionRunningEnter = true;
                sbVar.delegate = ocVar.f26711p;
                sbVar.invalidate();
                rb rbVar = ocVar.f26712q;
                Objects.requireNonNull(sbVar);
                rbVar.U(sbVar, new db(sbVar, 1), new ng(this, 15), new ml(2, this, z10));
                return;
            }
            mb mbVar4 = ocVar.f26711p;
            sbVar.delegate = mbVar4;
            if (mbVar4 != null && !z10) {
                mbVar4.c(sbVar.getHeight());
            }
            ocVar.l();
            sbVar.onEnterTransitionStart();
            sbVar.onEnterTransitionEnd();
            if (ocVar.f26716u) {
                ocVar.i(true);
            }
        }
    }
}
