package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hg extends j1.b {
    public final ig f25410o;

    public hg(ig igVar, ig igVar2) {
        super(igVar2);
        this.f25410o = igVar;
    }

    @Override
    public final int g(float f10, float f11) {
        ig igVar = this.f25410o;
        ChatActivityEnterView chatActivityEnterView = igVar.S;
        if (chatActivityEnterView.f22814o4 && chatActivityEnterView.J1 != null && chatActivityEnterView.O3.contains(f10, f11)) {
            return 2;
        }
        if (chatActivityEnterView.M && chatActivityEnterView.J1 != null && chatActivityEnterView.f22790j4 > 0.1f && igVar.G.contains(f10, f11)) {
            return 4;
        }
        return -1;
    }

    @Override
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f25410o.S;
        if (chatActivityEnterView.f22814o4) {
            arrayList.add(2);
        }
        if (chatActivityEnterView.M && chatActivityEnterView.J1 != null && chatActivityEnterView.f22790j4 > 0.1f) {
            arrayList.add(4);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        return true;
    }

    @Override
    public final void l(int i10, s0.e eVar) {
        int i11;
        int i12;
        ig igVar = this.f25410o;
        ChatActivityEnterView chatActivityEnterView = igVar.S;
        if (i10 == 2) {
            Rect rect = chatActivityEnterView.Q3;
            RectF rectF = chatActivityEnterView.O3;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            eVar.h(chatActivityEnterView.Q3);
            if (chatActivityEnterView.f22799l4 > 0.5f) {
                i12 = R.string.AccActionResume;
            } else {
                i12 = R.string.AccActionPause;
            }
            eVar.o(LocaleController.getString(i12));
        } else if (i10 == 4) {
            Rect rect2 = chatActivityEnterView.Q3;
            RectF rectF2 = igVar.G;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            eVar.h(chatActivityEnterView.Q3);
            if (chatActivityEnterView.L) {
                i11 = R.string.AccActionOnceDeactivate;
            } else {
                i11 = R.string.AccActionOnceActivate;
            }
            eVar.o(LocaleController.getString(i11));
        }
    }
}
