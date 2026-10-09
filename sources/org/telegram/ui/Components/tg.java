package org.telegram.ui.Components;

import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tg extends j1.b {
    public final ug f31176o;

    public tg(ug ugVar, ug ugVar2) {
        super(ugVar2);
        this.f31176o = ugVar;
    }

    @Override
    public final int g(float f7, float f10) {
        ug ugVar = this.f31176o;
        ChatActivityEnterView chatActivityEnterView = ugVar.V;
        if (chatActivityEnterView.f23961s4 && chatActivityEnterView.N1 != null && chatActivityEnterView.S3.contains(f7, f10)) {
            return 2;
        }
        if (chatActivityEnterView.P && chatActivityEnterView.N1 != null && chatActivityEnterView.f23934n4 > 0.1f && ugVar.J.contains(f7, f10)) {
            return 4;
        }
        return -1;
    }

    @Override
    public final void h(ArrayList arrayList) {
        ChatActivityEnterView chatActivityEnterView = this.f31176o.V;
        if (chatActivityEnterView.f23961s4) {
            arrayList.add(2);
        }
        if (chatActivityEnterView.P && chatActivityEnterView.N1 != null && chatActivityEnterView.f23934n4 > 0.1f) {
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
        ug ugVar = this.f31176o;
        ChatActivityEnterView chatActivityEnterView = ugVar.V;
        if (i10 == 2) {
            Rect rect = chatActivityEnterView.U3;
            RectF rectF = chatActivityEnterView.S3;
            rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            dVar.h(chatActivityEnterView.U3);
            if (chatActivityEnterView.f23944p4 > 0.5f) {
                i12 = R.string.AccActionResume;
            } else {
                i12 = R.string.AccActionPause;
            }
            dVar.o(LocaleController.getString(i12));
        } else if (i10 == 4) {
            Rect rect2 = chatActivityEnterView.U3;
            RectF rectF2 = ugVar.J;
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
