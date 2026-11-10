package org.telegram.ui.Wallet;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
public final class s7 implements View.OnLayoutChangeListener {
    public final int f43160a;
    public final Object f43161b;

    public s7(Object obj, int i7) {
        this.f43160a = i7;
        this.f43161b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f43160a) {
            case 0:
                d8 d8Var = (d8) this.f43161b;
                d8Var.getClass();
                if (i11 - i7 != i15 - i13 || i12 - i10 != i16 - i14) {
                    for (c8 c8Var : d8Var.f42389f.values()) {
                        c8Var.K = false;
                    }
                    d8Var.f0();
                    return;
                }
                return;
            default:
                g8 g8Var = (g8) this.f43161b;
                if (i12 - i10 < i16 - i14) {
                    ArrayList arrayList = g8Var.f42545w;
                    int size = arrayList.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj = arrayList.get(i17);
                        i17++;
                        pa paVar = (pa) obj;
                        if (paVar.hasFocus()) {
                            paVar.requestRectangleOnScreen(new Rect(0, 0, paVar.getWidth(), paVar.getHeight()), true);
                            return;
                        }
                    }
                    return;
                }
                g8Var.getClass();
                return;
        }
    }
}
