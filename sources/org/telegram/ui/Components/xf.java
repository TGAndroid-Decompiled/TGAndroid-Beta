package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
public final class xf extends j1.b {
    public final yf f40339o;

    public xf(yf yfVar, yf yfVar2) {
        super(yfVar2);
        this.f40339o = yfVar;
    }

    @Override
    public final int g(float f10, float f11) {
        yf yfVar = this.f40339o;
        ChatActivityEnterView chatActivityEnterView = yfVar.f40698c0;
        if (chatActivityEnterView.f31202t4 && chatActivityEnterView.O1 != null && chatActivityEnterView.T3.contains(f10, f11)) {
            return 2;
        }
        if (chatActivityEnterView.Q && chatActivityEnterView.O1 != null && chatActivityEnterView.f31171o4 > 0.1f && yfVar.K.contains(f10, f11)) {
            return 4;
        }
        return -1;
    }

    @Override
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f40339o.f40698c0;
        if (chatActivityEnterView.f31202t4) {
            arrayList.add(2);
        }
        if (chatActivityEnterView.Q && chatActivityEnterView.O1 != null && chatActivityEnterView.f31171o4 > 0.1f) {
            arrayList.add(4);
        }
    }

    @Override
    public final boolean k(int i3, int i10) {
        return true;
    }

    @Override
    public final void l(int i3, s0.d dVar) {
        int i10;
        int i11;
        yf yfVar = this.f40339o;
        ChatActivityEnterView chatActivityEnterView = yfVar.f40698c0;
        if (i3 == 2) {
            Rect rect = chatActivityEnterView.V3;
            RectF rectF = chatActivityEnterView.T3;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            dVar.h(chatActivityEnterView.V3);
            if (chatActivityEnterView.f31183q4 > 0.5f) {
                i11 = 2131754927;
            } else {
                i11 = 2131754930;
            }
            dVar.o(org.telegram.messenger.bd.M0(i11, null));
        } else if (i3 == 4) {
            Rect rect2 = chatActivityEnterView.V3;
            RectF rectF2 = yfVar.K;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            dVar.h(chatActivityEnterView.V3);
            if (chatActivityEnterView.P) {
                i10 = 2131754934;
            } else {
                i10 = 2131754935;
            }
            dVar.o(org.telegram.messenger.bd.M0(i10, null));
        }
    }
}
