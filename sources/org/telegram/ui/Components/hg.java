package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class hg extends j1.b {
    public final ig f29071o;

    public hg(ig igVar, ig igVar2) {
        super(igVar2);
        this.f29071o = igVar;
    }

    @Override
    public final int g(float f10, float f11) {
        ig igVar = this.f29071o;
        ChatActivityEnterView chatActivityEnterView = igVar.R;
        if (chatActivityEnterView.f26154n4 && chatActivityEnterView.I1 != null && chatActivityEnterView.N3.contains(f10, f11)) {
            return 2;
        }
        if (chatActivityEnterView.L && chatActivityEnterView.I1 != null && chatActivityEnterView.f26130i4 > 0.1f && igVar.F.contains(f10, f11)) {
            return 4;
        }
        return -1;
    }

    @Override
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f29071o.R;
        if (chatActivityEnterView.f26154n4) {
            arrayList.add(2);
        }
        if (chatActivityEnterView.L && chatActivityEnterView.I1 != null && chatActivityEnterView.f26130i4 > 0.1f) {
            arrayList.add(4);
        }
    }

    @Override
    public final boolean k(int i9, int i10) {
        return true;
    }

    @Override
    public final void l(int i9, s0.d dVar) {
        int i10;
        int i11;
        ig igVar = this.f29071o;
        ChatActivityEnterView chatActivityEnterView = igVar.R;
        if (i9 == 2) {
            Rect rect = chatActivityEnterView.P3;
            RectF rectF = chatActivityEnterView.N3;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            dVar.h(chatActivityEnterView.P3);
            if (chatActivityEnterView.f26140k4 > 0.5f) {
                i11 = R.string.AccActionResume;
            } else {
                i11 = R.string.AccActionPause;
            }
            dVar.o(LocaleController.getString(i11));
        } else if (i9 == 4) {
            Rect rect2 = chatActivityEnterView.P3;
            RectF rectF2 = igVar.F;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            dVar.h(chatActivityEnterView.P3);
            if (chatActivityEnterView.K) {
                i10 = R.string.AccActionOnceDeactivate;
            } else {
                i10 = R.string.AccActionOnceActivate;
            }
            dVar.o(LocaleController.getString(i10));
        }
    }
}
