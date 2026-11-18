package org.telegram.ui.Components;

import android.graphics.RectF;
import android.view.View;
public final class gz implements pj0, qj0 {
    public final pz f35667a;

    public gz(pz pzVar) {
        this.f35667a = pzVar;
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public boolean c(int r28, android.view.View r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gz.c(int, android.view.View):boolean");
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        pz pzVar = this.f35667a;
        lz lzVar = pzVar.K;
        if (!((org.telegram.ui.tw) lzVar).f52363b.f46693l2) {
            nz nzVar = (nz) view;
            if (pzVar.f38631n) {
                if (i7 != 0) {
                    int L = org.telegram.messenger.g0.L(6.0f);
                    RectF rectF = nzVar.f37895f;
                    float f12 = L;
                    if (rectF.left - f12 < f10 && rectF.right + f12 > f10) {
                        org.telegram.ui.tw twVar = (org.telegram.ui.tw) pzVar.K;
                        twVar.d((org.telegram.messenger.ro) twVar.f52363b.getMessagesController().V0().get(nzVar.f37888b.f37668a));
                    }
                }
            } else if (i7 == pzVar.L && lzVar != null) {
                ((org.telegram.ui.tw) lzVar).f52363b.R4(true, false);
            } else {
                pzVar.g(nzVar.f37888b, i7);
            }
        }
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
