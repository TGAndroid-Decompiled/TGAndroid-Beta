package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class l21 extends lm0 {
    public Context f26921c;
    public ArrayList d;

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        ArrayList arrayList = this.d;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int c10;
        if (b1Var.f44841f == 0) {
            boolean z10 = true;
            org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) ((ArrayList) this.d.get(i10 - 1)).get(0);
            if (i6Var.f20375f == org.telegram.ui.ActionBar.g6.Nd) {
                c10 = 0;
            } else {
                c10 = i6Var.c();
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) b1Var.f44838a;
            z8Var.f22820a.setText(org.telegram.ui.ActionBar.e5.i(i6Var.f20375f));
            z8Var.f22821b = c10;
            if (c10 != 0) {
                z10 = false;
            }
            z8Var.setWillNotDraw(z10);
            z8Var.invalidate();
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View z8Var;
        Context context = this.f26921c;
        if (i10 != 0) {
            z8Var = new View(context);
            z8Var.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(56.0f)));
        } else {
            z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setLayoutParams(new s4.o0(-1, -2));
        }
        return new s4.b1(z8Var);
    }
}
