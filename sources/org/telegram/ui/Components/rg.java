package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rg extends j1.b {
    public final sg f30022o;

    public rg(sg sgVar, sg sgVar2) {
        super(sgVar2);
        this.f30022o = sgVar;
    }

    @Override
    public final int g(float f7, float f10) {
        sg sgVar = this.f30022o;
        ChatActivityEnterView chatActivityEnterView = sgVar.V;
        if (chatActivityEnterView.f23765r4 && chatActivityEnterView.M1 != null && chatActivityEnterView.R3.contains(f7, f10)) {
            return 2;
        }
        if (chatActivityEnterView.P && chatActivityEnterView.M1 != null && chatActivityEnterView.f23738m4 > 0.1f && sgVar.J.contains(f7, f10)) {
            return 4;
        }
        return -1;
    }

    @Override
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f30022o.V;
        if (chatActivityEnterView.f23765r4) {
            arrayList.add(2);
        }
        if (chatActivityEnterView.P && chatActivityEnterView.M1 != null && chatActivityEnterView.f23738m4 > 0.1f) {
            arrayList.add(4);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        return true;
    }

    @Override
    public final void l(int i10, s0.c cVar) {
        int i11;
        int i12;
        sg sgVar = this.f30022o;
        ChatActivityEnterView chatActivityEnterView = sgVar.V;
        if (i10 == 2) {
            Rect rect = chatActivityEnterView.T3;
            RectF rectF = chatActivityEnterView.R3;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            cVar.h(chatActivityEnterView.T3);
            if (chatActivityEnterView.f23749o4 > 0.5f) {
                i12 = R.string.AccActionResume;
            } else {
                i12 = R.string.AccActionPause;
            }
            cVar.o(LocaleController.getString(i12));
        } else if (i10 == 4) {
            Rect rect2 = chatActivityEnterView.T3;
            RectF rectF2 = sgVar.J;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            cVar.h(chatActivityEnterView.T3);
            if (chatActivityEnterView.O) {
                i11 = R.string.AccActionOnceDeactivate;
            } else {
                i11 = R.string.AccActionOnceActivate;
            }
            cVar.o(LocaleController.getString(i11));
        }
    }
}
