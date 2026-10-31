package org.telegram.ui.Wallet;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
public final class w7 implements View.OnLayoutChangeListener {
    public final int f35364a;
    public final Object f35365b;

    public w7(Object obj, int i10) {
        this.f35364a = i10;
        this.f35365b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f35364a) {
            case 0:
                h8 h8Var = (h8) this.f35365b;
                h8Var.getClass();
                if (i12 - i10 != i16 - i14 || i13 - i11 != i17 - i15) {
                    for (g8 g8Var : h8Var.f34639f.values()) {
                        g8Var.K = false;
                    }
                    h8Var.f0();
                    return;
                }
                return;
            default:
                k8 k8Var = (k8) this.f35365b;
                if (i13 - i11 < i17 - i15) {
                    ArrayList arrayList = k8Var.f34823w;
                    int size = arrayList.size();
                    int i18 = 0;
                    while (i18 < size) {
                        Object obj = arrayList.get(i18);
                        i18++;
                        ra raVar = (ra) obj;
                        if (raVar.hasFocus()) {
                            raVar.requestRectangleOnScreen(new Rect(0, 0, raVar.getWidth(), raVar.getHeight()), true);
                            return;
                        }
                    }
                    return;
                }
                k8Var.getClass();
                return;
        }
    }
}
