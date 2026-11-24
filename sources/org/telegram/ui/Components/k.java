package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
public final class k extends b84 {
    public final l o;

    public k(l lVar, l lVar2) {
        super(lVar2);
        this.o = lVar;
    }

    @Override
    public final int g(float f, float f2) {
        l lVar = this.o;
        ChatActivityEnterView chatActivityEnterView = lVar.Q0;
        if (chatActivityEnterView.h5 && chatActivityEnterView.D2 != null && chatActivityEnterView.H4.contains(f, f2)) {
            return 2;
        }
        if (chatActivityEnterView.Q && chatActivityEnterView.D2 != null && chatActivityEnterView.c5 > 0.1f && lVar.K.contains(f, f2)) {
            return 4;
        }
        return -1;
    }

    @Override
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.o.Q0;
        if (chatActivityEnterView.h5) {
            arrayList.add(2);
        }
        if (chatActivityEnterView.Q && chatActivityEnterView.D2 != null && chatActivityEnterView.c5 > 0.1f) {
            arrayList.add(4);
        }
    }

    @Override
    public final boolean k(int i, int i2) {
        return true;
    }

    @Override
    public final void l(int i, u4 u4Var) {
        int i2;
        int i3;
        l lVar = this.o;
        ChatActivityEnterView chatActivityEnterView = lVar.Q0;
        if (i == 2) {
            Rect rect = chatActivityEnterView.J4;
            RectF rectF = chatActivityEnterView.H4;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            u4Var.h(chatActivityEnterView.J4);
            if (chatActivityEnterView.e5 > 0.5f) {
                i3 = 2131754927;
            } else {
                i3 = 2131754930;
            }
            u4Var.o(jb6.M0(i3, null));
        } else if (i == 4) {
            Rect rect2 = chatActivityEnterView.J4;
            RectF rectF2 = lVar.K;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            u4Var.h(chatActivityEnterView.J4);
            if (chatActivityEnterView.P) {
                i2 = 2131754934;
            } else {
                i2 = 2131754935;
            }
            u4Var.o(jb6.M0(i2, null));
        }
    }
}
