package org.telegram.ui.Wallet;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
public final class l7 implements View.OnLayoutChangeListener {
    public final int f34514a;
    public final Object f34515b;

    public l7(Object obj, int i10) {
        this.f34514a = i10;
        this.f34515b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f34514a) {
            case 0:
                w7 w7Var = (w7) this.f34515b;
                w7Var.getClass();
                if (i12 - i10 != i16 - i14 || i13 - i11 != i17 - i15) {
                    for (v7 v7Var : w7Var.f35055f.values()) {
                        v7Var.K = false;
                    }
                    w7Var.h0();
                    return;
                }
                return;
            default:
                z7 z7Var = (z7) this.f34515b;
                if (i13 - i11 < i17 - i15) {
                    ArrayList arrayList = z7Var.v;
                    int size = arrayList.size();
                    int i18 = 0;
                    while (i18 < size) {
                        Object obj = arrayList.get(i18);
                        i18++;
                        ia iaVar = (ia) obj;
                        if (iaVar.hasFocus()) {
                            iaVar.requestRectangleOnScreen(new Rect(0, 0, iaVar.getWidth(), iaVar.getHeight()), true);
                            return;
                        }
                    }
                    return;
                }
                z7Var.getClass();
                return;
        }
    }
}
