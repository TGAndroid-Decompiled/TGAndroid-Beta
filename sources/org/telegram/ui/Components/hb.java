package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.bi1;
public final class hb implements View.OnLayoutChangeListener {
    public final boolean f24659a;
    public final oc f24660b;

    public hb(oc ocVar, boolean z10) {
        this.f24660b = ocVar;
        this.f24659a = z10;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        mb mbVar;
        int i18;
        oc ocVar = this.f24660b;
        sb sbVar = ocVar.e;
        sbVar.removeOnLayoutChangeListener(this);
        if (ocVar.f26753l) {
            sbVar.onShow();
            org.telegram.ui.ActionBar.n2 n2Var = ocVar.f26749g;
            boolean z10 = this.f24659a;
            if (z10 && (n2Var instanceof bi1)) {
                n2Var = ((bi1) n2Var).X();
            }
            FrameLayout frameLayout = ocVar.h;
            if (n2Var == null || (mbVar = n2Var.getBulletinDelegate()) == null) {
                if (frameLayout != null) {
                    Object tag = frameLayout.getTag(R.id.bulletin_delegate_tag);
                    if (tag instanceof mb) {
                        mbVar = (mb) tag;
                    }
                }
                mbVar = null;
            }
            ocVar.f26757p = mbVar;
            if (mbVar == null && n2Var != null) {
                ocVar.f26757p = new ai.w4(n2Var, 5);
            }
            o1.k kVar = ocVar.d;
            if (kVar == null || !kVar.f15342f) {
                mb mbVar2 = ocVar.f26757p;
                if (mbVar2 != null) {
                    i18 = mbVar2.f(ocVar.f26745a);
                } else {
                    i18 = 0;
                }
                ocVar.f26756o = i18;
            }
            mb mbVar3 = ocVar.f26757p;
            if (mbVar3 != null) {
                mbVar3.b(ocVar);
            }
            if (MessagesController.getGlobalMainSettings().getBoolean("view_animations", true) && !ocVar.f26760s) {
                if (sbVar != null && ocVar.f26758q == null) {
                    ocVar.f26758q = sbVar.createTransition();
                }
                sbVar.transitionRunningEnter = true;
                sbVar.delegate = ocVar.f26757p;
                sbVar.invalidate();
                rb rbVar = ocVar.f26758q;
                Objects.requireNonNull(sbVar);
                rbVar.U(sbVar, new db(sbVar, 1), new ng(this, 15), new ml(2, this, z10));
                return;
            }
            mb mbVar4 = ocVar.f26757p;
            sbVar.delegate = mbVar4;
            if (mbVar4 != null && !z10) {
                mbVar4.c(sbVar.getHeight());
            }
            ocVar.l();
            sbVar.onEnterTransitionStart();
            sbVar.onEnterTransitionEnd();
            if (ocVar.f26762u) {
                ocVar.i(true);
            }
        }
    }
}
