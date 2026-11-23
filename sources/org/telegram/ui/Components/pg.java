package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
public final class pg extends k1.b {
    public final qg f38483o;

    public pg(qg qgVar, qg qgVar2) {
        super(qgVar2);
        this.f38483o = qgVar;
    }

    @Override
    public final int g(float f10, float f11) {
        qg qgVar = this.f38483o;
        ChatActivityEnterView chatActivityEnterView = qgVar.Q0;
        if (chatActivityEnterView.f32706i5 && chatActivityEnterView.D2 != null && chatActivityEnterView.I4.contains(f10, f11)) {
            return 2;
        }
        if (chatActivityEnterView.Q && chatActivityEnterView.D2 != null && chatActivityEnterView.f32665d5 > 0.1f && qgVar.K.contains(f10, f11)) {
            return 4;
        }
        return -1;
    }

    @Override
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f38483o.Q0;
        if (chatActivityEnterView.f32706i5) {
            arrayList.add(2);
        }
        if (chatActivityEnterView.Q && chatActivityEnterView.D2 != null && chatActivityEnterView.f32665d5 > 0.1f) {
            arrayList.add(4);
        }
    }

    @Override
    public final boolean k(int i7, int i10) {
        return true;
    }

    @Override
    public final void l(int i7, s0.c cVar) {
        int i10;
        int i11;
        qg qgVar = this.f38483o;
        ChatActivityEnterView chatActivityEnterView = qgVar.Q0;
        if (i7 == 2) {
            Rect rect = chatActivityEnterView.K4;
            RectF rectF = chatActivityEnterView.I4;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            cVar.h(chatActivityEnterView.K4);
            if (chatActivityEnterView.f32683f5 > 0.5f) {
                i11 = 2131754927;
            } else {
                i11 = 2131754930;
            }
            cVar.o(org.telegram.messenger.gd.N0(i11, null));
        } else if (i7 == 4) {
            Rect rect2 = chatActivityEnterView.K4;
            RectF rectF2 = qgVar.K;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            cVar.h(chatActivityEnterView.K4);
            if (chatActivityEnterView.P) {
                i10 = 2131754934;
            } else {
                i10 = 2131754935;
            }
            cVar.o(org.telegram.messenger.gd.N0(i10, null));
        }
    }
}
