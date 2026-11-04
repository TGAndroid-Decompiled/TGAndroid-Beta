package org.telegram.ui.Wallet;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
public final class q7 implements View.OnLayoutChangeListener {
    public final int f43090a;
    public final Object f43091b;

    public q7(Object obj, int i3) {
        this.f43090a = i3;
        this.f43091b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f43090a) {
            case 0:
                b8 b8Var = (b8) this.f43091b;
                b8Var.getClass();
                if (i11 - i3 != i15 - i13 || i12 - i10 != i16 - i14) {
                    for (a8 a8Var : b8Var.f42302f.values()) {
                        a8Var.K = false;
                    }
                    b8Var.f0();
                    return;
                }
                return;
            default:
                e8 e8Var = (e8) this.f43091b;
                if (i12 - i10 < i16 - i14) {
                    ArrayList arrayList = e8Var.f42487w;
                    int size = arrayList.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj = arrayList.get(i17);
                        i17++;
                        na naVar = (na) obj;
                        if (naVar.hasFocus()) {
                            naVar.requestRectangleOnScreen(new Rect(0, 0, naVar.getWidth(), naVar.getHeight()), true);
                            return;
                        }
                    }
                    return;
                }
                e8Var.getClass();
                return;
        }
    }
}
