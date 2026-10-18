package org.telegram.ui.Wallet;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
public final class o7 implements View.OnLayoutChangeListener {
    public final int f34679a;
    public final Object f34680b;

    public o7(Object obj, int i10) {
        this.f34679a = i10;
        this.f34680b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f34679a) {
            case 0:
                z7 z7Var = (z7) this.f34680b;
                z7Var.getClass();
                if (i12 - i10 != i16 - i14 || i13 - i11 != i17 - i15) {
                    for (y7 y7Var : z7Var.f35191f.values()) {
                        y7Var.K = false;
                    }
                    z7Var.h0();
                    return;
                }
                return;
            default:
                c8 c8Var = (c8) this.f34680b;
                if (i13 - i11 < i17 - i15) {
                    ArrayList arrayList = c8Var.v;
                    int size = arrayList.size();
                    int i18 = 0;
                    while (i18 < size) {
                        Object obj = arrayList.get(i18);
                        i18++;
                        la laVar = (la) obj;
                        if (laVar.hasFocus()) {
                            laVar.requestRectangleOnScreen(new Rect(0, 0, laVar.getWidth(), laVar.getHeight()), true);
                            return;
                        }
                    }
                    return;
                }
                c8Var.getClass();
                return;
        }
    }
}
