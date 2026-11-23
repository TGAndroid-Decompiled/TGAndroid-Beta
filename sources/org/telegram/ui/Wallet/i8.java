package org.telegram.ui.Wallet;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
public final class i8 implements View.OnLayoutChangeListener {
    public final int f44485a;
    public final Object f44486b;

    public i8(Object obj, int i7) {
        this.f44485a = i7;
        this.f44486b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f44485a) {
            case 0:
                s8 s8Var = (s8) this.f44486b;
                s8Var.getClass();
                if (i11 - i7 != i15 - i13 || i12 - i10 != i16 - i14) {
                    for (r8 r8Var : s8Var.f45069f.values()) {
                        r8Var.K = false;
                    }
                    s8Var.f0();
                    return;
                }
                return;
            default:
                v8 v8Var = (v8) this.f44486b;
                if (i12 - i10 < i16 - i14) {
                    ArrayList arrayList = v8Var.f45317w;
                    int size = arrayList.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj = arrayList.get(i17);
                        i17++;
                        eb ebVar = (eb) obj;
                        if (ebVar.hasFocus()) {
                            ebVar.requestRectangleOnScreen(new Rect(0, 0, ebVar.getWidth(), ebVar.getHeight()), true);
                            return;
                        }
                    }
                    return;
                }
                v8Var.getClass();
                return;
        }
    }
}
