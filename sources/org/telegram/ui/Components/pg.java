package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pg extends j1.b {
    public final qg f29556o;

    public pg(qg qgVar, qg qgVar2) {
        super(qgVar2);
        this.f29556o = qgVar;
    }

    @Override
    public final int g(float f7, float f10) {
        qg qgVar = this.f29556o;
        ChatActivityEnterView chatActivityEnterView = qgVar.f29915b0;
        if (chatActivityEnterView.f24165s4 && chatActivityEnterView.N1 != null && chatActivityEnterView.S3.contains(f7, f10)) {
            return 2;
        }
        if (chatActivityEnterView.P && chatActivityEnterView.N1 != null && chatActivityEnterView.f24135n4 > 0.1f && qgVar.J.contains(f7, f10)) {
            return 4;
        }
        return -1;
    }

    @Override
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f29556o.f29915b0;
        if (chatActivityEnterView.f24165s4) {
            arrayList.add(2);
        }
        if (chatActivityEnterView.P && chatActivityEnterView.N1 != null && chatActivityEnterView.f24135n4 > 0.1f) {
            arrayList.add(4);
        }
    }

    @Override
    public final boolean k(int i10, int i11) {
        return true;
    }

    @Override
    public final void l(int i10, s0.d dVar) {
        int i11;
        int i12;
        qg qgVar = this.f29556o;
        ChatActivityEnterView chatActivityEnterView = qgVar.f29915b0;
        if (i10 == 2) {
            Rect rect = chatActivityEnterView.U3;
            RectF rectF = chatActivityEnterView.S3;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            dVar.h(chatActivityEnterView.U3);
            if (chatActivityEnterView.f24147p4 > 0.5f) {
                i12 = R.string.AccActionResume;
            } else {
                i12 = R.string.AccActionPause;
            }
            dVar.o(LocaleController.getString(i12));
        } else if (i10 == 4) {
            Rect rect2 = chatActivityEnterView.U3;
            RectF rectF2 = qgVar.J;
            rect2.set((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
            dVar.h(chatActivityEnterView.U3);
            if (chatActivityEnterView.O) {
                i11 = R.string.AccActionOnceDeactivate;
            } else {
                i11 = R.string.AccActionOnceActivate;
            }
            dVar.o(LocaleController.getString(i11));
        }
    }
}
