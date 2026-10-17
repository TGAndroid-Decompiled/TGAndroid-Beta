package org.telegram.ui.Wallet;

import android.view.View;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.a71;
import org.telegram.ui.sa1;
public final class y3 implements Utilities.Callback {
    public final int f35169a;
    public final l5 f35170b;

    public y3(l5 l5Var, int i10) {
        this.f35169a = i10;
        this.f35170b = l5Var;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35169a) {
            case 0:
                Boolean bool = (Boolean) obj;
                l5 l5Var = this.f35170b;
                l5Var.C0.setClickable(!bool.booleanValue());
                l5Var.D0.setClickable(!bool.booleanValue());
                if (bool.booleanValue()) {
                    l5Var.f34486f0 = 1;
                    l5Var.f34497q0.setPosition(1);
                    l5Var.f34497q0.post(new m3(l5Var, 6));
                    return;
                }
                return;
            case 1:
                String lowerCase = ((String) obj).trim().toLowerCase(Locale.ROOT);
                l5 l5Var2 = this.f35170b;
                l5Var2.f34492l0 = lowerCase;
                a71[] a71VarArr = l5Var2.f34501s0;
                a71 a71Var = a71VarArr[1];
                if (a71Var != null) {
                    l5.R0(a71Var, true);
                    a71VarArr[1].u0(0);
                    a71VarArr[1].post(new m3(l5Var2, 6));
                    return;
                }
                return;
            default:
                float floatValue = ((Float) obj).floatValue();
                l5 l5Var3 = this.f35170b;
                if (l5Var3.B0 != floatValue) {
                    l5Var3.B0 = floatValue;
                    float v = org.telegram.ui.Cells.t0.v(floatValue, 0.6f, 1.0f, 0.0f);
                    int i10 = 0;
                    for (int i11 = 0; i11 < l5Var3.A0.getChildCount(); i11++) {
                        View childAt = l5Var3.A0.getChildAt(i11);
                        childAt.setAlpha(v);
                        childAt.setPivotY(0.0f);
                        childAt.setScaleY(1.0f - floatValue);
                    }
                    sa1 sa1Var = l5Var3.A0;
                    if (floatValue != 0.0f) {
                        i10 = 4;
                    }
                    sa1Var.setImportantForAccessibility(i10);
                    l5Var3.A0.requestLayout();
                    return;
                }
                return;
        }
    }
}
