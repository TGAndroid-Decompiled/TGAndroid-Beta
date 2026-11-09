package org.telegram.ui.Wallet;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
public final class p7 implements View.OnLayoutChangeListener {
    public final int f42988a;
    public final Object f42989b;

    public p7(Object obj, int i7) {
        this.f42988a = i7;
        this.f42989b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f42988a) {
            case 0:
                a8 a8Var = (a8) this.f42989b;
                a8Var.getClass();
                if (i11 - i7 != i15 - i13 || i12 - i10 != i16 - i14) {
                    for (z7 z7Var : a8Var.f42150f.values()) {
                        z7Var.K = false;
                    }
                    a8Var.f0();
                    return;
                }
                return;
            default:
                d8 d8Var = (d8) this.f42989b;
                if (i12 - i10 < i16 - i14) {
                    ArrayList arrayList = d8Var.f42382w;
                    int size = arrayList.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj = arrayList.get(i17);
                        i17++;
                        ma maVar = (ma) obj;
                        if (maVar.hasFocus()) {
                            maVar.requestRectangleOnScreen(new Rect(0, 0, maVar.getWidth(), maVar.getHeight()), true);
                            return;
                        }
                    }
                    return;
                }
                d8Var.getClass();
                return;
        }
    }
}
