package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class v3 extends s61 {
    public static final int f25581a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        w3 w3Var = (w3) view;
        w3Var.f25628w = z10;
        w3Var.b((MessageObject) t61Var.G, (ArrayList) t61Var.H);
        w3Var.invalidate();
    }

    @Override
    public final boolean contentsEquals(t61 t61Var, t61 t61Var2) {
        if (t61Var.G == t61Var2.G && Objects.equals(t61Var.H, t61Var2.H) && t61Var.f32870j == t61Var2.f32870j) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new w3(context, i10, u6Var);
    }

    @Override
    public final boolean equals(t61 t61Var, t61 t61Var2) {
        if (t61Var.d == t61Var2.d && t61Var.B == t61Var2.B) {
            return true;
        }
        return false;
    }
}
