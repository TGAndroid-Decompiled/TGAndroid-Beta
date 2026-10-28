package org.telegram.ui.Wallet;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
public final class i7 implements View.OnLayoutChangeListener {
    public final int f36706a;
    public final Object f36707b;

    public i7(Object obj, int i10) {
        this.f36706a = i10;
        this.f36707b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f36706a) {
            case 0:
                t7 t7Var = (t7) this.f36707b;
                t7Var.getClass();
                if (i12 - i10 != i16 - i14 || i13 - i11 != i17 - i15) {
                    for (s7 s7Var : t7Var.f37312f.values()) {
                        s7Var.K = false;
                    }
                    t7Var.f0();
                    return;
                }
                return;
            default:
                w7 w7Var = (w7) this.f36707b;
                if (i13 - i11 < i17 - i15) {
                    ArrayList arrayList = w7Var.v;
                    int size = arrayList.size();
                    int i18 = 0;
                    while (i18 < size) {
                        Object obj = arrayList.get(i18);
                        i18++;
                        ha haVar = (ha) obj;
                        if (haVar.hasFocus()) {
                            haVar.requestRectangleOnScreen(new Rect(0, 0, haVar.getWidth(), haVar.getHeight()), true);
                            return;
                        }
                    }
                    return;
                }
                w7Var.getClass();
                return;
        }
    }
}
