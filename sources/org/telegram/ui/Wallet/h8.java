package org.telegram.ui.Wallet;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
public final class h8 implements View.OnLayoutChangeListener {
    public final int f44358a;
    public final Object f44359b;

    public h8(Object obj, int i7) {
        this.f44358a = i7;
        this.f44359b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f44358a) {
            case 0:
                r8 r8Var = (r8) this.f44359b;
                r8Var.getClass();
                if (i11 - i7 != i15 - i13 || i12 - i10 != i16 - i14) {
                    for (q8 q8Var : r8Var.f44941f.values()) {
                        q8Var.K = false;
                    }
                    r8Var.f0();
                    return;
                }
                return;
            default:
                u8 u8Var = (u8) this.f44359b;
                if (i12 - i10 < i16 - i14) {
                    ArrayList arrayList = u8Var.f45190w;
                    int size = arrayList.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj = arrayList.get(i17);
                        i17++;
                        db dbVar = (db) obj;
                        if (dbVar.hasFocus()) {
                            dbVar.requestRectangleOnScreen(new Rect(0, 0, dbVar.getWidth(), dbVar.getHeight()), true);
                            return;
                        }
                    }
                    return;
                }
                u8Var.getClass();
                return;
        }
    }
}
