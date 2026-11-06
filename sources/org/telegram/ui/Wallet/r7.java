package org.telegram.ui.Wallet;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
public final class r7 implements View.OnLayoutChangeListener {
    public final int f43077a;
    public final Object f43078b;

    public r7(Object obj, int i7) {
        this.f43077a = i7;
        this.f43078b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f43077a) {
            case 0:
                c8 c8Var = (c8) this.f43078b;
                c8Var.getClass();
                if (i11 - i7 != i15 - i13 || i12 - i10 != i16 - i14) {
                    for (b8 b8Var : c8Var.f42240f.values()) {
                        b8Var.K = false;
                    }
                    c8Var.f0();
                    return;
                }
                return;
            default:
                f8 f8Var = (f8) this.f43078b;
                if (i12 - i10 < i16 - i14) {
                    ArrayList arrayList = f8Var.f42472w;
                    int size = arrayList.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj = arrayList.get(i17);
                        i17++;
                        oa oaVar = (oa) obj;
                        if (oaVar.hasFocus()) {
                            oaVar.requestRectangleOnScreen(new Rect(0, 0, oaVar.getWidth(), oaVar.getHeight()), true);
                            return;
                        }
                    }
                    return;
                }
                f8Var.getClass();
                return;
        }
    }
}
